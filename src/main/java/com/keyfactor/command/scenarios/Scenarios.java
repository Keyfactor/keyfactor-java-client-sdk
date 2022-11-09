package com.keyfactor.command.scenarios;

import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.api.CertificateApi;
import com.keyfactor.command.client.api.CertificateAuthorityApi;
import com.keyfactor.command.client.api.EnrollmentApi;
import com.keyfactor.command.client.model.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.time.OffsetDateTime;
import java.util.*;

public class Scenarios {
    private final ApiClient defaultClient;
    String xKeyfactorRequestedWith = "APIClient";
    String xKeyfactorApiVersion = "1";
    public Scenarios(String hostname, String username, String password) {
        defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(hostname);
        defaultClient.setUsername(username);
        defaultClient.setPassword(password);
    }

    public List<ModelsCertificateAuthoritiesCertificateAuthorityResponse> getCAList() {
        String pqQueryString = null; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
        Integer pqPageReturned = null; // Integer | The current page within the result set to be returned
        Integer pqReturnLimit = null; // Integer | Maximum number of records to be returned in a single call
        String pqSortField = null; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
        Integer pqSortAscending = null; // Integer | Field sort direction [0=ascending, 1=descending]

        List<ModelsCertificateAuthoritiesCertificateAuthorityResponse> cas = null;
        try {
            cas = (new CertificateAuthorityApi(defaultClient)).certificateAuthorityGetCas(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
        } catch (ApiException e) {
            System.out.printf("Failed to get list of available CAs: %s", e.getMessage());
            return null;
        }

        return cas;
    }

    public X509Certificate recoverCertificate(Integer certId, String password) {
        Integer collectionId = null; // Integer | Optional certificate collection identifier used to ensure user access to the certificate

        ModelsCertificateRecoveryRequest rq = new ModelsCertificateRecoveryRequest(); // ModelsCertificateRecoveryRequest | Query to filter the certificate to be recovered
        rq.setIncludeChain(true);
        rq.setCertID(certId);
        rq.setPassword(password);

        ModelsRecoveryResponse result = null;
        try {
            result = (new CertificateApi(defaultClient)).certificateRecoverCertificateAsync("PEM", xKeyfactorRequestedWith, rq, collectionId, xKeyfactorApiVersion);
        } catch (ApiException e) {
            System.out.printf("Failed to recover certificate: %s", e.getMessage());
            return null;
        }

        X509Certificate cert = null;
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            InputStream certStream = new ByteArrayInputStream(Objects.requireNonNull(result.getPFX()));

            cert = (X509Certificate)cf.generateCertificate(certStream);
        } catch (CertificateException e) {
            System.out.printf("Failed to import certificate into X509Certificate: %s", e.getMessage());
            return null;
        }

        return cert;
    }

    public X509Certificate enrollPfxCertificate(String subject, String template, Map<String, String> metadata, String caName) {

        String xCertificateformat = "STORE";

        ModelsEnrollmentPFXEnrollmentRequest req = new ModelsEnrollmentPFXEnrollmentRequest();
        req.setCertificateAuthority(caName);
        req.setIncludeChain(true);
        req.setSubject(subject);
        req.setTemplate(template);
        req.setTimestamp(OffsetDateTime.now());

        String password = generateRandomString(20);
        req.setPassword(password);

        req.setMetadata(metadata);
        ModelsEnrollmentPFXEnrollmentResponse result = null;

        try {
            result = (new EnrollmentApi(defaultClient)).enrollmentPostPFXEnroll(xKeyfactorRequestedWith, xCertificateformat, req, xKeyfactorApiVersion);
        } catch (ApiException e) {
            System.out.printf("Failed to enroll certificate: %s", e.getMessage());
            return null;
        }

        return recoverCertificate(result.getCertificateInformation().getKeyfactorId(), password);
    }

    public List<ModelsCertificateRetrievalResponse> queryCertificates(Map<String,String> query, String queryString) {
        Integer collectionId = null; // Integer | Optional certificate collection identifier used to ensure user access to the certificate
        Boolean includeLocations = true; // Boolean | Include locations data for the certificates to be returned
        Boolean includeMetadata = true; // Boolean | Include metadata for the certificates to be returned
        Boolean includeHasPrivateKey = true; // Boolean | Include whether the certificates to be returned have private keys stored in the Keyfactor database
        Integer verbose = 1; // Integer |
        Integer pqPageReturned = null; // Integer | The current page within the result set to be returned
        Integer pqReturnLimit = null; // Integer | Maximum number of records to be returned in a single call
        String pqSortField = null; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
        Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
        Boolean pqIncludeRevoked = null; // Boolean | Select 'true' to include revoked certificates in the results
        Boolean pqIncludeExpired = null; // Boolean | Select 'true' to include expired certificates in the results

        String pqQueryString = ""; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
        if (queryString == null) {
            StringBuilder queryStringBuilder = new StringBuilder(pqQueryString);
            for (Map.Entry<String, String> entry: query.entrySet()) {
                queryStringBuilder.append(entry.getKey()).append(" -eq ").append(entry.getValue()).append(" AND ");
            }
            pqQueryString = queryStringBuilder.toString();
            pqQueryString = pqQueryString.substring(0, pqQueryString.length() - 5); // Trim the last ' AND '
        } else {
            pqQueryString = queryString;
        }

        List<ModelsCertificateRetrievalResponse> result;
        try {
            result = (new CertificateApi(defaultClient)).certificateQueryCertificates(xKeyfactorRequestedWith, collectionId, includeLocations, includeMetadata, includeHasPrivateKey, verbose, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending, pqIncludeRevoked, pqIncludeExpired);
        } catch (ApiException e) {
            System.err.printf("Failed to query certificates: %s", e.getMessage());
            return null;
        }

        return result;
    }

    public List<Integer> revokeCertificate(String matchingCn, String matchingSN, String matchingThumbprint, List<Integer> idList) {
        List<Integer> list = null;

        if (idList == null || idList.isEmpty()) {
            // If client provided CN to match, build a list of cert IDs with CN equal to matchingCn
            list = new ArrayList<>();
            Map<String, String> query = new HashMap<>();

            if (matchingCn != null) {
                query.put("CN", "\"" + matchingCn + "\"");
            } else if (matchingSN != null) {
                query.put("SerialNumber", "\"" + matchingSN + "\"");
            } else if (matchingThumbprint != null) {
                query.put("Thumbprint", "\"" + matchingThumbprint + "\"");
            }

            List<ModelsCertificateRetrievalResponse> res = queryCertificates(query, null);

            if (res.isEmpty()) {
                System.err.println("No certificates found with provided criteria");
                return null;
            }

            for (ModelsCertificateRetrievalResponse match : res) {
                list.add(match.getId());
            }
        } else {
            list = idList;
        }

        ModelsRevokeCertificateRequest request = new ModelsRevokeCertificateRequest(); // ModelsRevokeCertificateRequest | Contains the Keyfactor certificate identifiers and revocation data
        request.setCertificateIds(list);
        request.setComment("Revocation by Java SDK");
        request.setReason(ModelsRevokeCertificateRequest.ReasonEnum.NUMBER_3);

        try {
            (new CertificateApi(defaultClient)).certificateRevoke(xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
        } catch (ApiException e) {
            System.err.printf("Failed to revoke certificate: %s", e.getMessage());
        }

        return list;
    }

    public Map<String, String> getCertificateMetadata(X509Certificate cert) {
        Map<String, String> query = new HashMap<>();
        String sn = String.format("%X", cert.getSerialNumber());
        query.put("SerialNumber", "\"" + sn + "\"");
        List<ModelsCertificateRetrievalResponse> res = queryCertificates(query, null);

        if (res.isEmpty()) {
            System.err.printf("Failed to query for certificate with SN %s", sn);
            return null;
        }

        return res.get(0).getMetadata();
    }

    private static String generateRandomString(int targetStringLength) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        Scenarios scenarios = new Scenarios(System.getenv("HOSTNAME"), System.getenv("USERNAME"), System.getenv("PASSWORD"));

        Map<String, String> metadata = new HashMap<>();
        metadata.put("Email-Contact", "johnny@appleseed.com");
        String cn = "JavaTest1";
        List<X509Certificate> certList = new ArrayList<>();
        // Enroll 10 certificates
        for (int i = 0; i < 10; i++) {
            X509Certificate cert = scenarios.enrollPfxCertificate("CN=" + cn, "DDWebServer1Yr", metadata, "Keyfactor Demo Drive CA 1");
            System.out.printf("Enrolled certificate with SN %X\n", cert.getSerialNumber());
            certList.add(cert);
        }

        // Query for the enrolled certificates
        Map<String, String> query = new HashMap<>();
        query.put("CN", "\"" + cn + "\"");

        List<ModelsCertificateRetrievalResponse> res = scenarios.queryCertificates(query, null);
        System.out.printf("Found %d certs with CN %s.\n", res.size(), cn);

        // Get Keyfactor certificate metadata using Java certificate object
        Map<String,String> meta = scenarios.getCertificateMetadata(certList.get(0));
        System.out.printf("Found %d metadata items associated with certificate with SN %X:\n", meta.size(), certList.get(0).getSerialNumber());
        for (Map.Entry<String, String> item : meta.entrySet()) {
            System.out.printf("    %s : %s\n", item.getKey(), item.getValue());
        }

        // Revoke first certificate using serial number
        String sn = String.format("%X", certList.get(0).getSerialNumber());
        scenarios.revokeCertificate(null, sn,null, null);
        System.out.printf("Revoked certificate with serial number %s\n", sn);


        // Revoke the rest of the certificates using the CN
        List<Integer> revList = scenarios.revokeCertificate(cn, null,null, null);
        StringBuilder revListStr = new StringBuilder();
        for (Integer id : revList) {
            revListStr.append(id).append(", ");
        }
        System.out.printf("Revoked certificates with Keyfactor IDs %s\n", revListStr);
    }
}

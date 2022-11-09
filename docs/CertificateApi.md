# CertificateApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**certificateAnalyzeCert**](CertificateApi.md#certificateAnalyzeCert) | **POST** /Certificates/Analyze | Returns the public information of the certificate |
| [**certificateCertificateHistory**](CertificateApi.md#certificateCertificateHistory) | **GET** /Certificates/{id}/History | Gets the history of operations on a certificate |
| [**certificateCompareMetadata**](CertificateApi.md#certificateCompareMetadata) | **GET** /Certificates/Metadata/Compare | Compares the metadata value provided with the metadata value associated with the specified certificate |
| [**certificateDeleteByQuery**](CertificateApi.md#certificateDeleteByQuery) | **DELETE** /Certificates/Query | Deletes multiple persisted certificate entities selected by a given query |
| [**certificateDeleteCertificate**](CertificateApi.md#certificateDeleteCertificate) | **DELETE** /Certificates/{id} | Deletes a persisted certificate by its unique id as well as the stored private key (if present) associated with it |
| [**certificateDeleteCertificates**](CertificateApi.md#certificateDeleteCertificates) | **DELETE** /Certificates | Deletes multiple persisted certificates by their unique ids |
| [**certificateDeletePrivateKeys0**](CertificateApi.md#certificateDeletePrivateKeys0) | **DELETE** /Certificates/PrivateKey | Deletes the persisted private keys of multiple certificates by the unique ids of the Certificates |
| [**certificateDeletePrivateKeys1**](CertificateApi.md#certificateDeletePrivateKeys1) | **DELETE** /Certificates/PrivateKey/{id} | Deletes the persisted private key of the certificate associated with the provided identifier |
| [**certificateDownloadCertificateAsync**](CertificateApi.md#certificateDownloadCertificateAsync) | **POST** /Certificates/Download | Downloads the persisted certificate associated with the provided query |
| [**certificateGetCertificate**](CertificateApi.md#certificateGetCertificate) | **GET** /Certificates/{id} | Returns a single certificate that matches the id |
| [**certificateGetCertificateLocations**](CertificateApi.md#certificateGetCertificateLocations) | **GET** /Certificates/Locations/{id} | Returns a list of locations the certificate is in |
| [**certificateGetCertificateSecurity**](CertificateApi.md#certificateGetCertificateSecurity) | **GET** /Certificates/{id}/Security | Gets the list of Security Identities and which permissions they have on the given certificate. |
| [**certificateIdentityAudit**](CertificateApi.md#certificateIdentityAudit) | **GET** /Certificates/IdentityAudit/{id} | Audit identity permissions for certificate |
| [**certificatePostImportCertificate**](CertificateApi.md#certificatePostImportCertificate) | **POST** /Certificates/Import | Imports the provided certificate into the Keyfactor instance, including any provided associated data |
| [**certificateQueryCertificates**](CertificateApi.md#certificateQueryCertificates) | **GET** /Certificates | Returns all certificates according to the provided filter and output parameters |
| [**certificateRecoverCertificateAsync**](CertificateApi.md#certificateRecoverCertificateAsync) | **POST** /Certificates/Recover | Recovers the persisted certificate associated with the provided query |
| [**certificateRevoke**](CertificateApi.md#certificateRevoke) | **POST** /Certificates/Revoke | Revokes the certificates associated with the provided identifiers and associates the provided data with the revocation |
| [**certificateRevokeAll**](CertificateApi.md#certificateRevokeAll) | **POST** /Certificates/RevokeAll | Revokes the certificates associated with the provided query and Collection Id and associates the provided data with the revocation |
| [**certificateUpdateAllMetadata**](CertificateApi.md#certificateUpdateAllMetadata) | **PUT** /Certificates/Metadata/All | Updates the metadata for certificates associated with the certificate identifiers or query provided |
| [**certificateUpdateMetadata**](CertificateApi.md#certificateUpdateMetadata) | **PUT** /Certificates/Metadata | Updates the metadata for the certificate associated with the identifier provided |
| [**certificateValidateCertificate**](CertificateApi.md#certificateValidateCertificate) | **GET** /Certificates/{id}/Validate | Validates the certificate chain can be built. |


<a name="certificateAnalyzeCert"></a>
# **certificateAnalyzeCert**
> List&lt;ModelsCertificateDetails&gt; certificateAnalyzeCert(xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Returns the public information of the certificate

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsCertificatesAnalyzeCertificateRequest request = new KeyfactorApiModelsCertificatesAnalyzeCertificateRequest(); // KeyfactorApiModelsCertificatesAnalyzeCertificateRequest | The certificate to analyze
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<ModelsCertificateDetails> result = apiInstance.certificateAnalyzeCert(xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateAnalyzeCert");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **request** | [**KeyfactorApiModelsCertificatesAnalyzeCertificateRequest**](KeyfactorApiModelsCertificatesAnalyzeCertificateRequest.md)| The certificate to analyze | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;ModelsCertificateDetails&gt;**](ModelsCertificateDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateCertificateHistory"></a>
# **certificateCertificateHistory**
> List&lt;ModelsPKICertificateOperation&gt; certificateCertificateHistory(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion, queryPageReturned, queryReturnLimit, querySortField, querySortAscending)

Gets the history of operations on a certificate

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    Integer id = 56; // Integer | The Id of the certificate
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Integer collectionId = 56; // Integer | The collection the certificate could be in.  Defaults to no collection.
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    Integer queryPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer queryReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String querySortField = "querySortField_example"; // String | Field by which the results should be sorted (OperationStart, OperationEnd, UserName)
    Integer querySortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsPKICertificateOperation> result = apiInstance.certificateCertificateHistory(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion, queryPageReturned, queryReturnLimit, querySortField, querySortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateCertificateHistory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The Id of the certificate | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **collectionId** | **Integer**| The collection the certificate could be in.  Defaults to no collection. | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |
| **queryPageReturned** | **Integer**| The current page within the result set to be returned | [optional] |
| **queryReturnLimit** | **Integer**| Maximum number of records to be returned in a single call | [optional] |
| **querySortField** | **String**| Field by which the results should be sorted (OperationStart, OperationEnd, UserName) | [optional] |
| **querySortAscending** | **Integer**| Field sort direction [0&#x3D;ascending, 1&#x3D;descending] | [optional] [enum: 0, 1] |

### Return type

[**List&lt;ModelsPKICertificateOperation&gt;**](ModelsPKICertificateOperation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateCompareMetadata"></a>
# **certificateCompareMetadata**
> Boolean certificateCompareMetadata(certificateId, metadataFieldName, value, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion)

Compares the metadata value provided with the metadata value associated with the specified certificate

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    Integer certificateId = 56; // Integer | Certificate identifier
    String metadataFieldName = "metadataFieldName_example"; // String | Metadata field being compared
    String value = "value_example"; // String | Value to compare against
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Integer collectionId = 56; // Integer | Optional certificate collection identifier used to ensure user access to the certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      Boolean result = apiInstance.certificateCompareMetadata(certificateId, metadataFieldName, value, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateCompareMetadata");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **certificateId** | **Integer**| Certificate identifier | |
| **metadataFieldName** | **String**| Metadata field being compared | |
| **value** | **String**| Value to compare against | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **collectionId** | **Integer**| Optional certificate collection identifier used to ensure user access to the certificate | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

**Boolean**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateDeleteByQuery"></a>
# **certificateDeleteByQuery**
> certificateDeleteByQuery(xKeyfactorRequestedWith, sq, collectionId, xKeyfactorApiVersion)

Deletes multiple persisted certificate entities selected by a given query

This will ignore individual delete failures, and continue processing the array.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String sq = "sq_example"; // String | Query by which certificates should be filtered for deletion
    Integer collectionId = 56; // Integer | Optional certificate collection identifier used to ensure user access to the certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateDeleteByQuery(xKeyfactorRequestedWith, sq, collectionId, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateDeleteByQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **sq** | **String**| Query by which certificates should be filtered for deletion | |
| **collectionId** | **Integer**| Optional certificate collection identifier used to ensure user access to the certificate | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="certificateDeleteCertificate"></a>
# **certificateDeleteCertificate**
> certificateDeleteCertificate(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion)

Deletes a persisted certificate by its unique id as well as the stored private key (if present) associated with it

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identifier of the certificate record
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Integer collectionId = 56; // Integer | Optional certificate collection identifier used to ensure user access to the certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateDeleteCertificate(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateDeleteCertificate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| Keyfactor identifier of the certificate record | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **collectionId** | **Integer**| Optional certificate collection identifier used to ensure user access to the certificate | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="certificateDeleteCertificates"></a>
# **certificateDeleteCertificates**
> certificateDeleteCertificates(xKeyfactorRequestedWith, ids, collectionId, xKeyfactorApiVersion)

Deletes multiple persisted certificates by their unique ids

This will ignore individual delete failures, and continue processing the array

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<Integer> ids = Arrays.asList(); // List<Integer> | The array of ids for certificate that are to be deleted
    Integer collectionId = 56; // Integer | Optional certificate collection identifier used to ensure user access to the certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateDeleteCertificates(xKeyfactorRequestedWith, ids, collectionId, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateDeleteCertificates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **ids** | [**List&lt;Integer&gt;**](Integer.md)| The array of ids for certificate that are to be deleted | |
| **collectionId** | **Integer**| Optional certificate collection identifier used to ensure user access to the certificate | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="certificateDeletePrivateKeys0"></a>
# **certificateDeletePrivateKeys0**
> certificateDeletePrivateKeys0(xKeyfactorRequestedWith, ids, collectionId, xKeyfactorApiVersion)

Deletes the persisted private keys of multiple certificates by the unique ids of the Certificates

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<Integer> ids = Arrays.asList(); // List<Integer> | Keyfactor identifiers of the cetficiates for which the associated private keys should be deleted
    Integer collectionId = 56; // Integer | Optional certificate collection identifier used to ensure user access to the certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateDeletePrivateKeys0(xKeyfactorRequestedWith, ids, collectionId, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateDeletePrivateKeys0");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **ids** | [**List&lt;Integer&gt;**](Integer.md)| Keyfactor identifiers of the cetficiates for which the associated private keys should be deleted | |
| **collectionId** | **Integer**| Optional certificate collection identifier used to ensure user access to the certificate | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="certificateDeletePrivateKeys1"></a>
# **certificateDeletePrivateKeys1**
> certificateDeletePrivateKeys1(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion)

Deletes the persisted private key of the certificate associated with the provided identifier

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identifier of the certificate for which the associated private key should be deleted
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Integer collectionId = 56; // Integer | Optional certificate collection identifier used to ensure user access to the certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateDeletePrivateKeys1(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateDeletePrivateKeys1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| Keyfactor identifier of the certificate for which the associated private key should be deleted | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **collectionId** | **Integer**| Optional certificate collection identifier used to ensure user access to the certificate | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="certificateDownloadCertificateAsync"></a>
# **certificateDownloadCertificateAsync**
> ModelsCertificateDownloadResponse certificateDownloadCertificateAsync(xKeyfactorRequestedWith, rq, collectionId, xKeyfactorApiVersion)

Downloads the persisted certificate associated with the provided query

*NOTE: At least one of the following criteria must be provided:  1. Certificate ID  2. Thumbprint  3. Serial number AND Issuer DN (because Serial Number is CA-specific and so is not unique enough on its own)

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsCertificateDownloadRequest rq = new ModelsCertificateDownloadRequest(); // ModelsCertificateDownloadRequest | Query to filter the certificate to be recovered
    Integer collectionId = 56; // Integer | Optional certificate collection identifier used to ensure user access to the certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCertificateDownloadResponse result = apiInstance.certificateDownloadCertificateAsync(xKeyfactorRequestedWith, rq, collectionId, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateDownloadCertificateAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **rq** | [**ModelsCertificateDownloadRequest**](ModelsCertificateDownloadRequest.md)| Query to filter the certificate to be recovered | |
| **collectionId** | **Integer**| Optional certificate collection identifier used to ensure user access to the certificate | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCertificateDownloadResponse**](ModelsCertificateDownloadResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateGetCertificate"></a>
# **certificateGetCertificate**
> ModelsCertificateRetrievalResponse certificateGetCertificate(id, xKeyfactorRequestedWith, includeLocations, includeMetadata, collectionId, verbose, xKeyfactorApiVersion)

Returns a single certificate that matches the id

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor certificate identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Boolean includeLocations = true; // Boolean | Include locations data for the certificate to be returned
    Boolean includeMetadata = true; // Boolean | Include metadata for the certificate to be returned
    Integer collectionId = 56; // Integer | Optional certificate collection identifier used to ensure user access to the certificate
    Integer verbose = 56; // Integer | 
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCertificateRetrievalResponse result = apiInstance.certificateGetCertificate(id, xKeyfactorRequestedWith, includeLocations, includeMetadata, collectionId, verbose, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateGetCertificate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| Keyfactor certificate identifier | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **includeLocations** | **Boolean**| Include locations data for the certificate to be returned | [optional] |
| **includeMetadata** | **Boolean**| Include metadata for the certificate to be returned | [optional] |
| **collectionId** | **Integer**| Optional certificate collection identifier used to ensure user access to the certificate | [optional] |
| **verbose** | **Integer**|  | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCertificateRetrievalResponse**](ModelsCertificateRetrievalResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateGetCertificateLocations"></a>
# **certificateGetCertificateLocations**
> KeyfactorApiModelsCertificatesCertificateLocationsResponse certificateGetCertificateLocations(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion)

Returns a list of locations the certificate is in

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor certificate identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Integer collectionId = 56; // Integer | Optional certificate collection identifier used to ensure user access to the certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsCertificatesCertificateLocationsResponse result = apiInstance.certificateGetCertificateLocations(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateGetCertificateLocations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| Keyfactor certificate identifier | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **collectionId** | **Integer**| Optional certificate collection identifier used to ensure user access to the certificate | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsCertificatesCertificateLocationsResponse**](KeyfactorApiModelsCertificatesCertificateLocationsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateGetCertificateSecurity"></a>
# **certificateGetCertificateSecurity**
> ModelsSecurityCertificatePermissions certificateGetCertificateSecurity(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion)

Gets the list of Security Identities and which permissions they have on the given certificate.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    Integer id = 56; // Integer | The Id of the certificate permissions are being checked on
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Integer collectionId = 56; // Integer | The Id of the collection the certificate belongs in. Defaults to no collection
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSecurityCertificatePermissions result = apiInstance.certificateGetCertificateSecurity(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateGetCertificateSecurity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The Id of the certificate permissions are being checked on | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **collectionId** | **Integer**| The Id of the collection the certificate belongs in. Defaults to no collection | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSecurityCertificatePermissions**](ModelsSecurityCertificatePermissions.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateIdentityAudit"></a>
# **certificateIdentityAudit**
> List&lt;KeyfactorApiModelsCertificatesCertificateIdentityAuditResponse&gt; certificateIdentityAudit(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion)

Audit identity permissions for certificate

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    Integer id = 56; // Integer | The Id of the certificate being checked
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Integer collectionId = 56; // Integer | An optional parameter for the collectin Id the certificate is in.  Defaults to no collection
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsCertificatesCertificateIdentityAuditResponse> result = apiInstance.certificateIdentityAudit(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateIdentityAudit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The Id of the certificate being checked | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **collectionId** | **Integer**| An optional parameter for the collectin Id the certificate is in.  Defaults to no collection | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;KeyfactorApiModelsCertificatesCertificateIdentityAuditResponse&gt;**](KeyfactorApiModelsCertificatesCertificateIdentityAuditResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificatePostImportCertificate"></a>
# **certificatePostImportCertificate**
> ModelsCertificateImportResponseModel certificatePostImportCertificate(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Imports the provided certificate into the Keyfactor instance, including any provided associated data

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsCertificateImportRequestModel req = new ModelsCertificateImportRequestModel(); // ModelsCertificateImportRequestModel | Request containing the base 64 encoded string and related certificate information, such as certificate stores, metadata, and password
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCertificateImportResponseModel result = apiInstance.certificatePostImportCertificate(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificatePostImportCertificate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **req** | [**ModelsCertificateImportRequestModel**](ModelsCertificateImportRequestModel.md)| Request containing the base 64 encoded string and related certificate information, such as certificate stores, metadata, and password | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCertificateImportResponseModel**](ModelsCertificateImportResponseModel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateQueryCertificates"></a>
# **certificateQueryCertificates**
> List&lt;ModelsCertificateRetrievalResponse&gt; certificateQueryCertificates(xKeyfactorRequestedWith, collectionId, includeLocations, includeMetadata, includeHasPrivateKey, verbose, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending, pqIncludeRevoked, pqIncludeExpired)

Returns all certificates according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Integer collectionId = 56; // Integer | Optional certificate collection identifier used to ensure user access to the certificate
    Boolean includeLocations = true; // Boolean | Include locations data for the certificates to be returned
    Boolean includeMetadata = true; // Boolean | Include metadata for the certificates to be returned
    Boolean includeHasPrivateKey = true; // Boolean | Include whether the certificates to be returned have private keys stored in the Keyfactor database
    Integer verbose = 56; // Integer | 
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    Boolean pqIncludeRevoked = true; // Boolean | Select 'true' to include revoked certificates in the results
    Boolean pqIncludeExpired = true; // Boolean | Select 'true' to include expired certificates in the results
    try {
      List<ModelsCertificateRetrievalResponse> result = apiInstance.certificateQueryCertificates(xKeyfactorRequestedWith, collectionId, includeLocations, includeMetadata, includeHasPrivateKey, verbose, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending, pqIncludeRevoked, pqIncludeExpired);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateQueryCertificates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **collectionId** | **Integer**| Optional certificate collection identifier used to ensure user access to the certificate | [optional] |
| **includeLocations** | **Boolean**| Include locations data for the certificates to be returned | [optional] |
| **includeMetadata** | **Boolean**| Include metadata for the certificates to be returned | [optional] |
| **includeHasPrivateKey** | **Boolean**| Include whether the certificates to be returned have private keys stored in the Keyfactor database | [optional] |
| **verbose** | **Integer**|  | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |
| **pqQueryString** | **String**| Contents of the query (ex: field1 -eq value1 AND field2 -gt value2) | [optional] |
| **pqPageReturned** | **Integer**| The current page within the result set to be returned | [optional] |
| **pqReturnLimit** | **Integer**| Maximum number of records to be returned in a single call | [optional] |
| **pqSortField** | **String**| Field by which the results should be sorted (view results via Management Portal for sortable columns) | [optional] |
| **pqSortAscending** | **Integer**| Field sort direction [0&#x3D;ascending, 1&#x3D;descending] | [optional] [enum: 0, 1] |
| **pqIncludeRevoked** | **Boolean**| Select &#39;true&#39; to include revoked certificates in the results | [optional] |
| **pqIncludeExpired** | **Boolean**| Select &#39;true&#39; to include expired certificates in the results | [optional] |

### Return type

[**List&lt;ModelsCertificateRetrievalResponse&gt;**](ModelsCertificateRetrievalResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateRecoverCertificateAsync"></a>
# **certificateRecoverCertificateAsync**
> ModelsRecoveryResponse certificateRecoverCertificateAsync(xCertificateformat, xKeyfactorRequestedWith, rq, collectionId, xKeyfactorApiVersion)

Recovers the persisted certificate associated with the provided query

*NOTE: At least one of the following criteria must be provided:  1. Certificate ID  2. Thumbprint  3. Serial number AND Issuer DN (because Serial Number is CA-specific and so is not unique enough on its own)

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    String xCertificateformat = "PEM"; // String | Desired format [PFX, PEM]
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsCertificateRecoveryRequest rq = new ModelsCertificateRecoveryRequest(); // ModelsCertificateRecoveryRequest | Query to filter the certificate to be recovered
    Integer collectionId = 56; // Integer | Optional certificate collection identifier used to ensure user access to the certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsRecoveryResponse result = apiInstance.certificateRecoverCertificateAsync(xCertificateformat, xKeyfactorRequestedWith, rq, collectionId, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateRecoverCertificateAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xCertificateformat** | **String**| Desired format [PFX, PEM] | [default to PEM] |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **rq** | [**ModelsCertificateRecoveryRequest**](ModelsCertificateRecoveryRequest.md)| Query to filter the certificate to be recovered | |
| **collectionId** | **Integer**| Optional certificate collection identifier used to ensure user access to the certificate | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsRecoveryResponse**](ModelsRecoveryResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateRevoke"></a>
# **certificateRevoke**
> ModelsRevocationRevocationResponse certificateRevoke(xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Revokes the certificates associated with the provided identifiers and associates the provided data with the revocation

### Revocation Reason Codes for Microsoft CA ###  | Value             | Description               |  |-------------------|---------------------------|  | -1                | Remove from hold          |  | 0                 | Unspecified               |  | 1                 | Key compromised           |  | 2                 | CA compromised            |  | 3                 | Affiliation changed       |  | 4                 | Superceded                |  | 5                 | Cessation of operation    |  | 6                 | Certificate hold          |  | 7                 | Remove from CRL           |  | 999               | Unknown                   |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsRevokeCertificateRequest request = new ModelsRevokeCertificateRequest(); // ModelsRevokeCertificateRequest | Contains the Keyfactor certificate identifiers and revocation data
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsRevocationRevocationResponse result = apiInstance.certificateRevoke(xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateRevoke");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **request** | [**ModelsRevokeCertificateRequest**](ModelsRevokeCertificateRequest.md)| Contains the Keyfactor certificate identifiers and revocation data | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsRevocationRevocationResponse**](ModelsRevocationRevocationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateRevokeAll"></a>
# **certificateRevokeAll**
> ModelsRevocationRevocationResponse certificateRevokeAll(xKeyfactorRequestedWith, request, collectionId, xKeyfactorApiVersion)

Revokes the certificates associated with the provided query and Collection Id and associates the provided data with the revocation

### Revocation Reason Codes for Microsoft CA ###  | Value             | Description              |  |-------------------|--------------------------|  | -1                | Remove from hold         |  | 0                 | Unspecified              |  | 1                 | Key compromised          |  | 2                 | CA compromised           |  | 3                 | Affiliation changed      |  | 4                 | Superceded               |  | 5                 | Cessation of operation   |  | 6                 | Certificate hold         |  | 7                 | Remove from CRL          |  | 999               | Unknown                  |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsRevokeAllCertificatesRequest request = new ModelsRevokeAllCertificatesRequest(); // ModelsRevokeAllCertificatesRequest | Contains the Keyfactor Query and revocation data
    Integer collectionId = 56; // Integer | A collection Id to be used for permissions and part of the query to revoke certificates
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsRevocationRevocationResponse result = apiInstance.certificateRevokeAll(xKeyfactorRequestedWith, request, collectionId, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateRevokeAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **request** | [**ModelsRevokeAllCertificatesRequest**](ModelsRevokeAllCertificatesRequest.md)| Contains the Keyfactor Query and revocation data | |
| **collectionId** | **Integer**| A collection Id to be used for permissions and part of the query to revoke certificates | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsRevocationRevocationResponse**](ModelsRevocationRevocationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateUpdateAllMetadata"></a>
# **certificateUpdateAllMetadata**
> certificateUpdateAllMetadata(xKeyfactorRequestedWith, metadataUpdate, collectionId, xKeyfactorApiVersion)

Updates the metadata for certificates associated with the certificate identifiers or query provided

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsMetadataAllUpdateRequest metadataUpdate = new ModelsMetadataAllUpdateRequest(); // ModelsMetadataAllUpdateRequest | Contains the Keyfactor certificate identifier and the metadata to be updated
    Integer collectionId = 56; // Integer | Optional certificate collection identifier used to ensure user access to the certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateUpdateAllMetadata(xKeyfactorRequestedWith, metadataUpdate, collectionId, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateUpdateAllMetadata");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **metadataUpdate** | [**ModelsMetadataAllUpdateRequest**](ModelsMetadataAllUpdateRequest.md)| Contains the Keyfactor certificate identifier and the metadata to be updated | |
| **collectionId** | **Integer**| Optional certificate collection identifier used to ensure user access to the certificate | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="certificateUpdateMetadata"></a>
# **certificateUpdateMetadata**
> certificateUpdateMetadata(xKeyfactorRequestedWith, metadataUpdate, collectionId, xKeyfactorApiVersion)

Updates the metadata for the certificate associated with the identifier provided

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsMetadataUpdateRequest metadataUpdate = new ModelsMetadataUpdateRequest(); // ModelsMetadataUpdateRequest | Contains the Keyfactor certificate identifier and the metadata to be updated
    Integer collectionId = 56; // Integer | Optional certificate collection identifier used to ensure user access to the certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateUpdateMetadata(xKeyfactorRequestedWith, metadataUpdate, collectionId, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateUpdateMetadata");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **metadataUpdate** | [**ModelsMetadataUpdateRequest**](ModelsMetadataUpdateRequest.md)| Contains the Keyfactor certificate identifier and the metadata to be updated | |
| **collectionId** | **Integer**| Optional certificate collection identifier used to ensure user access to the certificate | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="certificateValidateCertificate"></a>
# **certificateValidateCertificate**
> ModelsCertificateValidationResponse certificateValidateCertificate(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion)

Validates the certificate chain can be built.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateApi apiInstance = new CertificateApi(defaultClient);
    Integer id = 56; // Integer | The Id of the certificate being checked
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Integer collectionId = 56; // Integer | An optional parameter for the collectin Id the certificate is in.  Defaults to no collection
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCertificateValidationResponse result = apiInstance.certificateValidateCertificate(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateApi#certificateValidateCertificate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The Id of the certificate being checked | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **collectionId** | **Integer**| An optional parameter for the collectin Id the certificate is in.  Defaults to no collection | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCertificateValidationResponse**](ModelsCertificateValidationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


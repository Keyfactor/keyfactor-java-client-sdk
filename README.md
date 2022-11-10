# Community supported
We welcome contributions.

The Keyfactor Java Client SDK is open source and community supported, meaning that there is **no SLA** applicable for these tools.

To report a problem or suggest a new feature, use the **[Issues](../../issues)** tab. If you want to contribute actual bug fixes or proposed enhancements, use the **[Pull requests](../../pulls)** tab.

# keyfactor-java-client-sdk

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.keyfactor.command</groupId>
  <artifactId>keyfactor-java-client-sdk</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'keyfactor-java-client-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'keyfactor-java-client-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.keyfactor.command:keyfactor-java-client-sdk:v1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/keyfactor-java-client-sdk-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AgentApi apiInstance = new AgentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<String> agentIds = Arrays.asList(); // List<String> | List of Agent Ids to Approve
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.agentApprove(xKeyfactorRequestedWith, agentIds, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#agentApprove");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AgentApi* | [**agentApprove**](docs/AgentApi.md#agentApprove) | **POST** /Agents/Approve | Approve a list of agents
*AgentApi* | [**agentDisapprove**](docs/AgentApi.md#agentDisapprove) | **POST** /Agents/Disapprove | Disapprove a list of agents
*AgentApi* | [**agentFetchLogs**](docs/AgentApi.md#agentFetchLogs) | **POST** /Agents/{id}/FetchLogs | Schedules a job on the agent to retrieve log files
*AgentApi* | [**agentGetAgentDetail**](docs/AgentApi.md#agentGetAgentDetail) | **GET** /Agents/{id} | Returns details for a single agent, specified by ID
*AgentApi* | [**agentGetAgents**](docs/AgentApi.md#agentGetAgents) | **GET** /Agents | Returns all agents according to the provided filter and output parameters
*AgentApi* | [**agentReset0**](docs/AgentApi.md#agentReset0) | **POST** /Agents/Reset | Reset a list of agents
*AgentApi* | [**agentReset1**](docs/AgentApi.md#agentReset1) | **POST** /Agents/{id}/Reset | Reset an agent to a new state
*AgentApi* | [**agentSetAuthCertificateReenrollment**](docs/AgentApi.md#agentSetAuthCertificateReenrollment) | **POST** /Agents/SetAuthCertificateReenrollment | Update the AuthCertificateReenrollment value for an agent to request or require (or unset the request) the agent   to enroll for a new client authentication certificate on its next registration.
*AgentBlueprintApi* | [**agentBlueprintApplyBlueprint**](docs/AgentBlueprintApi.md#agentBlueprintApplyBlueprint) | **POST** /AgentBluePrint/ApplyBlueprint | Applies the selected agent blueprint to the provided agents
*AgentBlueprintApi* | [**agentBlueprintDeleteBlueprint**](docs/AgentBlueprintApi.md#agentBlueprintDeleteBlueprint) | **DELETE** /AgentBluePrint/{id} | Deletes an agent blueprint by its Keyfactor identifier
*AgentBlueprintApi* | [**agentBlueprintGenerateBlueprint**](docs/AgentBlueprintApi.md#agentBlueprintGenerateBlueprint) | **POST** /AgentBluePrint/GenerateBluePrint | Generates an agent blueprint from the provided agents
*AgentBlueprintApi* | [**agentBlueprintGetAgentBlueprint**](docs/AgentBlueprintApi.md#agentBlueprintGetAgentBlueprint) | **GET** /AgentBluePrint/{id} | Returns an agent blueprint according to the provided filter and output parameters
*AgentBlueprintApi* | [**agentBlueprintGetAgentBlueprints**](docs/AgentBlueprintApi.md#agentBlueprintGetAgentBlueprints) | **GET** /AgentBluePrint | Returns all agent blueprints according to the provided filter and output parameters
*AgentBlueprintApi* | [**agentBlueprintGetBlueprintJobs**](docs/AgentBlueprintApi.md#agentBlueprintGetBlueprintJobs) | **GET** /AgentBluePrint/{id}/Jobs | Gets the agent blueprint scheduled jobs
*AgentBlueprintApi* | [**agentBlueprintGetBlueprintStores**](docs/AgentBlueprintApi.md#agentBlueprintGetBlueprintStores) | **GET** /AgentBluePrint/{id}/Stores | Gets the agent blueprint certificate stores
*AgentPoolApi* | [**agentPoolCreateAgentPool**](docs/AgentPoolApi.md#agentPoolCreateAgentPool) | **POST** /AgentPools | Creates an agent pool with the provided properties
*AgentPoolApi* | [**agentPoolDeleteAgentPool**](docs/AgentPoolApi.md#agentPoolDeleteAgentPool) | **DELETE** /AgentPools/{id} | Deletes the agent pool associated with the provided id
*AgentPoolApi* | [**agentPoolGetAgentPoolById**](docs/AgentPoolApi.md#agentPoolGetAgentPoolById) | **GET** /AgentPools/{id} | Returns a single agent pool associated with the provided id
*AgentPoolApi* | [**agentPoolGetAgentPools**](docs/AgentPoolApi.md#agentPoolGetAgentPools) | **GET** /AgentPools | Returns all agent pools according to the provided filter and output parameters
*AgentPoolApi* | [**agentPoolGetDefaultAgentPoolAgents**](docs/AgentPoolApi.md#agentPoolGetDefaultAgentPoolAgents) | **GET** /AgentPools/Agents | Returns all agents for the default agent pool
*AgentPoolApi* | [**agentPoolUpdateAgentPool**](docs/AgentPoolApi.md#agentPoolUpdateAgentPool) | **PUT** /AgentPools | Updates an existing agent pool with the provided properties
*AuditLogApi* | [**auditLogDownloadCSV**](docs/AuditLogApi.md#auditLogDownloadCSV) | **GET** /Audit/Download | Returns a Comma Separated file containing the audit log entries according to the provided filter
*AuditLogApi* | [**auditLogGetAuditLog**](docs/AuditLogApi.md#auditLogGetAuditLog) | **GET** /Audit/{id} | Returns the audit log entry associated with the provided identifier
*AuditLogApi* | [**auditLogGetAuditLogs**](docs/AuditLogApi.md#auditLogGetAuditLogs) | **GET** /Audit | Returns all audit log entries according to the provided filter and output parameters
*AuditLogApi* | [**auditLogGetRelatedEntities**](docs/AuditLogApi.md#auditLogGetRelatedEntities) | **GET** /Audit/RelatedEntities | Returns the audit log entry associated with the provided keyfactor id
*AuditLogApi* | [**auditLogValidateAuditLog**](docs/AuditLogApi.md#auditLogValidateAuditLog) | **GET** /Audit/{id}/Validate | Validates the audit log entry associated with the provided keyfactor id
*CertificateApi* | [**certificateAnalyzeCert**](docs/CertificateApi.md#certificateAnalyzeCert) | **POST** /Certificates/Analyze | Returns the public information of the certificate
*CertificateApi* | [**certificateCertificateHistory**](docs/CertificateApi.md#certificateCertificateHistory) | **GET** /Certificates/{id}/History | Gets the history of operations on a certificate
*CertificateApi* | [**certificateCompareMetadata**](docs/CertificateApi.md#certificateCompareMetadata) | **GET** /Certificates/Metadata/Compare | Compares the metadata value provided with the metadata value associated with the specified certificate
*CertificateApi* | [**certificateDeleteByQuery**](docs/CertificateApi.md#certificateDeleteByQuery) | **DELETE** /Certificates/Query | Deletes multiple persisted certificate entities selected by a given query
*CertificateApi* | [**certificateDeleteCertificate**](docs/CertificateApi.md#certificateDeleteCertificate) | **DELETE** /Certificates/{id} | Deletes a persisted certificate by its unique id as well as the stored private key (if present) associated with it
*CertificateApi* | [**certificateDeleteCertificates**](docs/CertificateApi.md#certificateDeleteCertificates) | **DELETE** /Certificates | Deletes multiple persisted certificates by their unique ids
*CertificateApi* | [**certificateDeletePrivateKeys0**](docs/CertificateApi.md#certificateDeletePrivateKeys0) | **DELETE** /Certificates/PrivateKey | Deletes the persisted private keys of multiple certificates by the unique ids of the Certificates
*CertificateApi* | [**certificateDeletePrivateKeys1**](docs/CertificateApi.md#certificateDeletePrivateKeys1) | **DELETE** /Certificates/PrivateKey/{id} | Deletes the persisted private key of the certificate associated with the provided identifier
*CertificateApi* | [**certificateDownloadCertificateAsync**](docs/CertificateApi.md#certificateDownloadCertificateAsync) | **POST** /Certificates/Download | Downloads the persisted certificate associated with the provided query
*CertificateApi* | [**certificateGetCertificate**](docs/CertificateApi.md#certificateGetCertificate) | **GET** /Certificates/{id} | Returns a single certificate that matches the id
*CertificateApi* | [**certificateGetCertificateLocations**](docs/CertificateApi.md#certificateGetCertificateLocations) | **GET** /Certificates/Locations/{id} | Returns a list of locations the certificate is in
*CertificateApi* | [**certificateGetCertificateSecurity**](docs/CertificateApi.md#certificateGetCertificateSecurity) | **GET** /Certificates/{id}/Security | Gets the list of Security Identities and which permissions they have on the given certificate.
*CertificateApi* | [**certificateIdentityAudit**](docs/CertificateApi.md#certificateIdentityAudit) | **GET** /Certificates/IdentityAudit/{id} | Audit identity permissions for certificate
*CertificateApi* | [**certificatePostImportCertificate**](docs/CertificateApi.md#certificatePostImportCertificate) | **POST** /Certificates/Import | Imports the provided certificate into the Keyfactor instance, including any provided associated data
*CertificateApi* | [**certificateQueryCertificates**](docs/CertificateApi.md#certificateQueryCertificates) | **GET** /Certificates | Returns all certificates according to the provided filter and output parameters
*CertificateApi* | [**certificateRecoverCertificateAsync**](docs/CertificateApi.md#certificateRecoverCertificateAsync) | **POST** /Certificates/Recover | Recovers the persisted certificate associated with the provided query
*CertificateApi* | [**certificateRevoke**](docs/CertificateApi.md#certificateRevoke) | **POST** /Certificates/Revoke | Revokes the certificates associated with the provided identifiers and associates the provided data with the revocation
*CertificateApi* | [**certificateRevokeAll**](docs/CertificateApi.md#certificateRevokeAll) | **POST** /Certificates/RevokeAll | Revokes the certificates associated with the provided query and Collection Id and associates the provided data with the revocation
*CertificateApi* | [**certificateUpdateAllMetadata**](docs/CertificateApi.md#certificateUpdateAllMetadata) | **PUT** /Certificates/Metadata/All | Updates the metadata for certificates associated with the certificate identifiers or query provided
*CertificateApi* | [**certificateUpdateMetadata**](docs/CertificateApi.md#certificateUpdateMetadata) | **PUT** /Certificates/Metadata | Updates the metadata for the certificate associated with the identifier provided
*CertificateApi* | [**certificateValidateCertificate**](docs/CertificateApi.md#certificateValidateCertificate) | **GET** /Certificates/{id}/Validate | Validates the certificate chain can be built.
*CertificateAuthorityApi* | [**certificateAuthorityCreateCA**](docs/CertificateAuthorityApi.md#certificateAuthorityCreateCA) | **POST** /CertificateAuthority | Creates a new CertificateAuthority object
*CertificateAuthorityApi* | [**certificateAuthorityDeleteCA**](docs/CertificateAuthorityApi.md#certificateAuthorityDeleteCA) | **DELETE** /CertificateAuthority/{id} | Deletes a CertificateAuthority from the system, specified by ID
*CertificateAuthorityApi* | [**certificateAuthorityGetCa**](docs/CertificateAuthorityApi.md#certificateAuthorityGetCa) | **GET** /CertificateAuthority/{id} | Returns details for a single CA, specified by ID
*CertificateAuthorityApi* | [**certificateAuthorityGetCas**](docs/CertificateAuthorityApi.md#certificateAuthorityGetCas) | **GET** /CertificateAuthority | Returns all certificate authorities
*CertificateAuthorityApi* | [**certificateAuthorityPublishCRL**](docs/CertificateAuthorityApi.md#certificateAuthorityPublishCRL) | **POST** /CertificateAuthority/PublishCRL | Publishes a CRL according to the provided request
*CertificateAuthorityApi* | [**certificateAuthorityTestCertificateAuthority**](docs/CertificateAuthorityApi.md#certificateAuthorityTestCertificateAuthority) | **POST** /CertificateAuthority/Test | Validates the connection info for the CA provided by the model.
*CertificateAuthorityApi* | [**certificateAuthorityUpdateCA**](docs/CertificateAuthorityApi.md#certificateAuthorityUpdateCA) | **PUT** /CertificateAuthority | Updates a CertificateAuthority object
*CertificateCollectionApi* | [**certificateCollectionCopyFromExistingCollection**](docs/CertificateCollectionApi.md#certificateCollectionCopyFromExistingCollection) | **POST** /CertificateCollections/Copy | Creates a new certificate collection from an existing collection. The permissions, query and description of the   existing collection are copied when creating the new record, with the option to overwrite the query or description.
*CertificateCollectionApi* | [**certificateCollectionCreateCollection**](docs/CertificateCollectionApi.md#certificateCollectionCreateCollection) | **POST** /CertificateCollections | Creates a new certificate collection with the provided properties
*CertificateCollectionApi* | [**certificateCollectionGetCollection0**](docs/CertificateCollectionApi.md#certificateCollectionGetCollection0) | **GET** /CertificateCollections/{id} | Returns the certificate collection definition associated with the provided Keyfactor identifier
*CertificateCollectionApi* | [**certificateCollectionGetCollection1**](docs/CertificateCollectionApi.md#certificateCollectionGetCollection1) | **GET** /CertificateCollections/{name} | Returns the certificate collection associated with the provided collection name
*CertificateCollectionApi* | [**certificateCollectionGetCollections**](docs/CertificateCollectionApi.md#certificateCollectionGetCollections) | **GET** /CertificateCollections | Returns all certificate collections
*CertificateCollectionApi* | [**certificateCollectionSetCollectionPermissions**](docs/CertificateCollectionApi.md#certificateCollectionSetCollectionPermissions) | **POST** /CertificateCollections/{id}/Permissions | Set the permissions for a collection
*CertificateCollectionApi* | [**certificateCollectionUpdateCollection**](docs/CertificateCollectionApi.md#certificateCollectionUpdateCollection) | **PUT** /CertificateCollections | Updates an existing certificate collection with the provided properties
*CertificateStoreApi* | [**certificateStoreAddCertificate**](docs/CertificateStoreApi.md#certificateStoreAddCertificate) | **POST** /CertificateStores/Certificates/Add | Configures a management job to add a certificate to one or more stores with the provided schedule
*CertificateStoreApi* | [**certificateStoreApprovePending**](docs/CertificateStoreApi.md#certificateStoreApprovePending) | **POST** /CertificateStores/Approve | Approves the provided certificate stores to make them available for management
*CertificateStoreApi* | [**certificateStoreConfigureDiscoveryJob**](docs/CertificateStoreApi.md#certificateStoreConfigureDiscoveryJob) | **PUT** /CertificateStores/DiscoveryJob | Configures a discovery job to locate currently unmanaged certificate stores
*CertificateStoreApi* | [**certificateStoreCreateCertificateStoreServer**](docs/CertificateStoreApi.md#certificateStoreCreateCertificateStoreServer) | **POST** /CertificateStores/Server | Creates a new certificate store server with the provided properties
*CertificateStoreApi* | [**certificateStoreDeleteCertificateStore**](docs/CertificateStoreApi.md#certificateStoreDeleteCertificateStore) | **DELETE** /CertificateStores/{id} | Deletes a persisted certificate store by its Keyfactor identifier
*CertificateStoreApi* | [**certificateStoreDeleteCertificateStores**](docs/CertificateStoreApi.md#certificateStoreDeleteCertificateStores) | **DELETE** /CertificateStores | Deletes multiple persisted certificate store entities by their identifiers
*CertificateStoreApi* | [**certificateStoreGetCertificateStoreInventory**](docs/CertificateStoreApi.md#certificateStoreGetCertificateStoreInventory) | **GET** /CertificateStores/{id}/Inventory | Returns a single certificate store&#39;s inventory associated with the provided id
*CertificateStoreApi* | [**certificateStoreRemoveCertificate**](docs/CertificateStoreApi.md#certificateStoreRemoveCertificate) | **POST** /CertificateStores/Certificates/Remove | Configures a management job to remove a certificate from one or more stores with the provided schedule
*CertificateStoreApi* | [**certificateStoreSchedule**](docs/CertificateStoreApi.md#certificateStoreSchedule) | **POST** /CertificateStores/Schedule | Creates an inventory schedule for the provided certificate stores
*CertificateStoreApi* | [**certificateStoreScheduleForReenrollment**](docs/CertificateStoreApi.md#certificateStoreScheduleForReenrollment) | **POST** /CertificateStores/Reenrollment | Schedules a certificate store for reenrollment
*CertificateStoreApi* | [**certificateStoreSetPassword**](docs/CertificateStoreApi.md#certificateStoreSetPassword) | **PUT** /CertificateStores/Password | Sets a password for the requested certificate store
*CertificateStoreApi* | [**certificateStoreUpdateCertificateStoreServer**](docs/CertificateStoreApi.md#certificateStoreUpdateCertificateStoreServer) | **PUT** /CertificateStores/Server | Updates a given certificate store server with the properties of the provided instance
*CertificateStoreContainerApi* | [**certificateStoreContainerDeleteCertificateStoreContainers**](docs/CertificateStoreContainerApi.md#certificateStoreContainerDeleteCertificateStoreContainers) | **DELETE** /CertificateStoreContainers/{id} | Delete a certificate store container
*CertificateStoreContainerApi* | [**certificateStoreContainerGetAllCertificateStoreContainers**](docs/CertificateStoreContainerApi.md#certificateStoreContainerGetAllCertificateStoreContainers) | **GET** /CertificateStoreContainers | Returns all certificate store container according to the provided filter and output parameters
*CertificateStoreTypeApi* | [**certificateStoreTypeCreateCertificateStoreType**](docs/CertificateStoreTypeApi.md#certificateStoreTypeCreateCertificateStoreType) | **POST** /CertificateStoreTypes | Creates a new certificate store type with the provided properties
*CertificateStoreTypeApi* | [**certificateStoreTypeDeleteCertificateStoreType**](docs/CertificateStoreTypeApi.md#certificateStoreTypeDeleteCertificateStoreType) | **DELETE** /CertificateStoreTypes/{id} | Deletes a certificate store type according to the provided identifier
*CertificateStoreTypeApi* | [**certificateStoreTypeDeleteCertificateStoreTypes**](docs/CertificateStoreTypeApi.md#certificateStoreTypeDeleteCertificateStoreTypes) | **DELETE** /CertificateStoreTypes | Deletes certificate store types according to the provided identifiers
*CertificateStoreTypeApi* | [**certificateStoreTypeGetCertificateStoreType0**](docs/CertificateStoreTypeApi.md#certificateStoreTypeGetCertificateStoreType0) | **GET** /CertificateStoreTypes/{id} | Returns a single certificate store type that matches id
*CertificateStoreTypeApi* | [**certificateStoreTypeGetCertificateStoreType1**](docs/CertificateStoreTypeApi.md#certificateStoreTypeGetCertificateStoreType1) | **GET** /CertificateStoreTypes/Name/{name} | Returns a single certificate store type that matches the provided short name
*CertificateStoreTypeApi* | [**certificateStoreTypeGetTypes**](docs/CertificateStoreTypeApi.md#certificateStoreTypeGetTypes) | **GET** /CertificateStoreTypes | Returns all certificate store types according to the provided filter and output parameters
*CertificateStoreTypeApi* | [**certificateStoreTypeUpdateCertificateStoreType**](docs/CertificateStoreTypeApi.md#certificateStoreTypeUpdateCertificateStoreType) | **PUT** /CertificateStoreTypes | Updates an existing certificate store type with the provided properties
*CsrGenerationApi* | [**cSRGenerationDeleteCSR**](docs/CsrGenerationApi.md#cSRGenerationDeleteCSR) | **DELETE** /CSRGeneration/Pending/{id} | Deletes a CSR associated with the provided identifier
*CsrGenerationApi* | [**cSRGenerationDeleteCSRs**](docs/CsrGenerationApi.md#cSRGenerationDeleteCSRs) | **DELETE** /CSRGeneration/Pending | Deletes the CSRs associated with the provided identifiers
*CsrGenerationApi* | [**cSRGenerationDownload**](docs/CsrGenerationApi.md#cSRGenerationDownload) | **GET** /CSRGeneration/Pending/{id} | Returns a previously generated CSR associated with the provided identifier
*CsrGenerationApi* | [**cSRGenerationGetPendingCSRs**](docs/CsrGenerationApi.md#cSRGenerationGetPendingCSRs) | **GET** /CSRGeneration/Pending | Returns a list of the currently pending CSRs according to the provided query
*CsrGenerationApi* | [**cSRGenerationPostGenerate**](docs/CsrGenerationApi.md#cSRGenerationPostGenerate) | **POST** /CSRGeneration/Generate | Generates a CSR according the properties provided
*CustomJobTypeApi* | [**customJobTypeCreateJobType**](docs/CustomJobTypeApi.md#customJobTypeCreateJobType) | **POST** /JobTypes/Custom | Creates a custom job type with the provided properties
*CustomJobTypeApi* | [**customJobTypeDeleteJobType**](docs/CustomJobTypeApi.md#customJobTypeDeleteJobType) | **DELETE** /JobTypes/Custom/{id} | Deletes the custom job type associated with the provided id
*CustomJobTypeApi* | [**customJobTypeGetJobTypeById**](docs/CustomJobTypeApi.md#customJobTypeGetJobTypeById) | **GET** /JobTypes/Custom/{id} | Returns a single custom job type associated with the provided id
*CustomJobTypeApi* | [**customJobTypeGetJobTypes**](docs/CustomJobTypeApi.md#customJobTypeGetJobTypes) | **GET** /JobTypes/Custom | Returns all custom job types according to the provided filter and output parameters
*CustomJobTypeApi* | [**customJobTypeUpdateJobType**](docs/CustomJobTypeApi.md#customJobTypeUpdateJobType) | **PUT** /JobTypes/Custom | Updates an existing custom job type with the provided properties
*DeniedAlertApi* | [**deniedAlertAddDeniedAlert**](docs/DeniedAlertApi.md#deniedAlertAddDeniedAlert) | **POST** /Alerts/Denied | Add a denied alert
*DeniedAlertApi* | [**deniedAlertDeleteDeniedAlert**](docs/DeniedAlertApi.md#deniedAlertDeleteDeniedAlert) | **DELETE** /Alerts/Denied/{id} | Delete a denied alert
*DeniedAlertApi* | [**deniedAlertEditDeniedAlert**](docs/DeniedAlertApi.md#deniedAlertEditDeniedAlert) | **PUT** /Alerts/Denied | Edit a denied alert
*DeniedAlertApi* | [**deniedAlertGetDeniedAlert**](docs/DeniedAlertApi.md#deniedAlertGetDeniedAlert) | **GET** /Alerts/Denied/{id} | Get a denied alert
*DeniedAlertApi* | [**deniedAlertGetDeniedAlerts**](docs/DeniedAlertApi.md#deniedAlertGetDeniedAlerts) | **GET** /Alerts/Denied | Gets all denied alerts according to the provided filter and output parameters
*EnrollmentApi* | [**enrollmentAddToExistingCertStores**](docs/EnrollmentApi.md#enrollmentAddToExistingCertStores) | **POST** /Enrollment/PFX/Replace | Creates management jobs to install a newly enrolled pfx into the same certificate stores as the previous certificate
*EnrollmentApi* | [**enrollmentAvailableRenewalId**](docs/EnrollmentApi.md#enrollmentAvailableRenewalId) | **GET** /Enrollment/AvailableRenewal/Id/{id} | Returns the type of renewal available for a given certificate.
*EnrollmentApi* | [**enrollmentAvailableRenewalThumbprint**](docs/EnrollmentApi.md#enrollmentAvailableRenewalThumbprint) | **GET** /Enrollment/AvailableRenewal/Thumbprint/{thumbprint} | Returns the type of renewal available for a given certificate.
*EnrollmentApi* | [**enrollmentGetMyCSRContext**](docs/EnrollmentApi.md#enrollmentGetMyCSRContext) | **GET** /Enrollment/CSR/Context/My | Returns the list of available CSR enrollment templates and their associated CA mappings that the calling user has permissions on
*EnrollmentApi* | [**enrollmentGetMyPFXContext**](docs/EnrollmentApi.md#enrollmentGetMyPFXContext) | **GET** /Enrollment/PFX/Context/My | Returns the list of available PFX enrollment templates and their associated CA mappings that the calling user has permissions on
*EnrollmentApi* | [**enrollmentGetTemplateEnrollmentSettings**](docs/EnrollmentApi.md#enrollmentGetTemplateEnrollmentSettings) | **GET** /Enrollment/Settings/{id} | Gets the template settings to use during enrollment. The response will be the resolved values for the settings.  If there is a template specific setting, the template specific setting will be used in the response.  If there is not a template specific setting, the global setting will be used in the response.
*EnrollmentApi* | [**enrollmentInstallPFXToCertStore**](docs/EnrollmentApi.md#enrollmentInstallPFXToCertStore) | **POST** /Enrollment/PFX/Deploy | Creates management jobs to install a newly enrolled pfx in to one or more certificate stores
*EnrollmentApi* | [**enrollmentPostCSREnroll**](docs/EnrollmentApi.md#enrollmentPostCSREnroll) | **POST** /Enrollment/CSR | Performs a CSR Enrollment based upon the provided request
*EnrollmentApi* | [**enrollmentPostPFXEnroll**](docs/EnrollmentApi.md#enrollmentPostPFXEnroll) | **POST** /Enrollment/PFX | Performs a PFX Enrollment based upon the provided request
*EnrollmentApi* | [**enrollmentPostParsedCSR**](docs/EnrollmentApi.md#enrollmentPostParsedCSR) | **POST** /Enrollment/CSR/Parse | Parses the provided CSR and returns the properties
*EnrollmentApi* | [**enrollmentRenew**](docs/EnrollmentApi.md#enrollmentRenew) | **POST** /Enrollment/Renew | Performs a renewal based upon the passed in request
*ExpirationAlertApi* | [**expirationAlertAddExpirationAlert**](docs/ExpirationAlertApi.md#expirationAlertAddExpirationAlert) | **POST** /Alerts/Expiration | Add an expiration alert
*ExpirationAlertApi* | [**expirationAlertDeleteExpirationAlert**](docs/ExpirationAlertApi.md#expirationAlertDeleteExpirationAlert) | **DELETE** /Alerts/Expiration/{id} | Delete an expiration alert
*ExpirationAlertApi* | [**expirationAlertEditExpirationAlert**](docs/ExpirationAlertApi.md#expirationAlertEditExpirationAlert) | **PUT** /Alerts/Expiration | Edit an expiration alert
*ExpirationAlertApi* | [**expirationAlertEditSchedule**](docs/ExpirationAlertApi.md#expirationAlertEditSchedule) | **PUT** /Alerts/Expiration/Schedule | Edit schedule
*ExpirationAlertApi* | [**expirationAlertGetExpirationAlert**](docs/ExpirationAlertApi.md#expirationAlertGetExpirationAlert) | **GET** /Alerts/Expiration/{id} | Get an expiration alert
*ExpirationAlertApi* | [**expirationAlertGetExpirationAlerts**](docs/ExpirationAlertApi.md#expirationAlertGetExpirationAlerts) | **GET** /Alerts/Expiration | Gets all expiration alerts according to the provided filter and output parameters
*ExpirationAlertApi* | [**expirationAlertGetSchedule**](docs/ExpirationAlertApi.md#expirationAlertGetSchedule) | **GET** /Alerts/Expiration/Schedule | Get the schedule for expiration alerts
*ExpirationAlertApi* | [**expirationAlertTestAllExpirationAlert**](docs/ExpirationAlertApi.md#expirationAlertTestAllExpirationAlert) | **POST** /Alerts/Expiration/TestAll | Test All Expiration Alerts
*ExpirationAlertApi* | [**expirationAlertTestExpirationAlert**](docs/ExpirationAlertApi.md#expirationAlertTestExpirationAlert) | **POST** /Alerts/Expiration/Test | Test an Expiration Alert
*IssuedAlertApi* | [**issuedAlertAddIssuedAlert**](docs/IssuedAlertApi.md#issuedAlertAddIssuedAlert) | **POST** /Alerts/Issued | Add a issued alert
*IssuedAlertApi* | [**issuedAlertDeleteIssuedAlert**](docs/IssuedAlertApi.md#issuedAlertDeleteIssuedAlert) | **DELETE** /Alerts/Issued/{id} | Delete a issued alert
*IssuedAlertApi* | [**issuedAlertEditIssuedAlert**](docs/IssuedAlertApi.md#issuedAlertEditIssuedAlert) | **PUT** /Alerts/Issued | Edit a issued alert
*IssuedAlertApi* | [**issuedAlertEditSchedule**](docs/IssuedAlertApi.md#issuedAlertEditSchedule) | **PUT** /Alerts/Issued/Schedule | Edit schedule
*IssuedAlertApi* | [**issuedAlertGetIssuedAlert**](docs/IssuedAlertApi.md#issuedAlertGetIssuedAlert) | **GET** /Alerts/Issued/{id} | Get a issued alert
*IssuedAlertApi* | [**issuedAlertGetIssuedAlerts**](docs/IssuedAlertApi.md#issuedAlertGetIssuedAlerts) | **GET** /Alerts/Issued | Gets all issued alerts according to the provided filter and output parameters
*IssuedAlertApi* | [**issuedAlertGetSchedule**](docs/IssuedAlertApi.md#issuedAlertGetSchedule) | **GET** /Alerts/Issued/Schedule | Get the schedule for issued alerts
*KeyApi* | [**keyDeleteUnmanagedKey**](docs/KeyApi.md#keyDeleteUnmanagedKey) | **DELETE** /SSH/Keys/Unmanaged/{id} | Deletes Unmanaged Key associated with the provided identifier
*KeyApi* | [**keyDeleteUnmanagedKeys**](docs/KeyApi.md#keyDeleteUnmanagedKeys) | **DELETE** /SSH/Keys/Unmanaged | Deletes Unmanaged Keys associated with the provided identifiers
*KeyApi* | [**keyGenerateKey**](docs/KeyApi.md#keyGenerateKey) | **POST** /SSH/Keys/MyKey | Generates an SSH Key Pair for the requesting user.
*KeyApi* | [**keyGetMyKey**](docs/KeyApi.md#keyGetMyKey) | **GET** /SSH/Keys/MyKey | Returns the current key of the requesting user
*KeyApi* | [**keyGetUnmanagedKey**](docs/KeyApi.md#keyGetUnmanagedKey) | **GET** /SSH/Keys/Unmanaged/{id} | Returns an unmanaged SSH key with provided id.
*KeyApi* | [**keyGetUnmanagedKeys**](docs/KeyApi.md#keyGetUnmanagedKeys) | **GET** /SSH/Keys/Unmanaged | Returns Unmanaged SSH keys
*KeyApi* | [**keyUpdate**](docs/KeyApi.md#keyUpdate) | **PUT** /SSH/Keys/MyKey | Updates the requesting user&#39;s SSH key
*KeyRotationAlertApi* | [**keyRotationAlertAddKeyRotationAlert**](docs/KeyRotationAlertApi.md#keyRotationAlertAddKeyRotationAlert) | **POST** /Alerts/KeyRotation | Add a key rotation alert
*KeyRotationAlertApi* | [**keyRotationAlertDeleteKeyRotationAlert**](docs/KeyRotationAlertApi.md#keyRotationAlertDeleteKeyRotationAlert) | **DELETE** /Alerts/KeyRotation/{id} | Delete a key rotation alert
*KeyRotationAlertApi* | [**keyRotationAlertEditKeyRotationAlert**](docs/KeyRotationAlertApi.md#keyRotationAlertEditKeyRotationAlert) | **PUT** /Alerts/KeyRotation | Edit a key rotation alert
*KeyRotationAlertApi* | [**keyRotationAlertEditSchedule**](docs/KeyRotationAlertApi.md#keyRotationAlertEditSchedule) | **PUT** /Alerts/KeyRotation/Schedule | Edit schedule
*KeyRotationAlertApi* | [**keyRotationAlertGetKeyRotationAlert**](docs/KeyRotationAlertApi.md#keyRotationAlertGetKeyRotationAlert) | **GET** /Alerts/KeyRotation/{id} | Get a key rotation alert
*KeyRotationAlertApi* | [**keyRotationAlertGetKeyRotationAlerts**](docs/KeyRotationAlertApi.md#keyRotationAlertGetKeyRotationAlerts) | **GET** /Alerts/KeyRotation | Gets all key rotation alerts according to the provided filter and output parameters
*KeyRotationAlertApi* | [**keyRotationAlertGetSchedule**](docs/KeyRotationAlertApi.md#keyRotationAlertGetSchedule) | **GET** /Alerts/KeyRotation/Schedule | Get the schedule for key rotation alerts
*KeyRotationAlertApi* | [**keyRotationAlertTestAllKeyRotationAlert**](docs/KeyRotationAlertApi.md#keyRotationAlertTestAllKeyRotationAlert) | **POST** /Alerts/KeyRotation/TestAll | Test All Alerts
*KeyRotationAlertApi* | [**keyRotationAlertTestKeyRotationAlert**](docs/KeyRotationAlertApi.md#keyRotationAlertTestKeyRotationAlert) | **POST** /Alerts/KeyRotation/Test | Test An Alert
*LicenseApi* | [**licenseGetCurrentLicense**](docs/LicenseApi.md#licenseGetCurrentLicense) | **GET** /License | Gets the current license
*LogonApi* | [**logonCreateLogon**](docs/LogonApi.md#logonCreateLogon) | **POST** /SSH/Logons | Creates a logon with the provided properties
*LogonApi* | [**logonDelete**](docs/LogonApi.md#logonDelete) | **DELETE** /SSH/Logons/{id} | Deletes a Logon associated with the provided identifier
*LogonApi* | [**logonGetLogon**](docs/LogonApi.md#logonGetLogon) | **GET** /SSH/Logons/{id} | Fetches a Logon associated with the provided identifier
*LogonApi* | [**logonLogonAccess**](docs/LogonApi.md#logonLogonAccess) | **POST** /SSH/Logons/Access | Updates the users with access to an existing logon
*LogonApi* | [**logonQueryLogons**](docs/LogonApi.md#logonQueryLogons) | **GET** /SSH/Logons | Returns all Logons according to the provided filter parameters
*MacEnrollmentApi* | [**macEnrollmentEditMacEnrollment**](docs/MacEnrollmentApi.md#macEnrollmentEditMacEnrollment) | **PUT** /MacEnrollment | Updates mac enrollment settings data
*MacEnrollmentApi* | [**macEnrollmentMacEnrollment**](docs/MacEnrollmentApi.md#macEnrollmentMacEnrollment) | **GET** /MacEnrollment | Gets mac enrollment settings data
*MetadataFieldApi* | [**metadataFieldCreateMetadataField**](docs/MetadataFieldApi.md#metadataFieldCreateMetadataField) | **POST** /MetadataFields | Creates a new metadata field type with the given metadata field type properties
*MetadataFieldApi* | [**metadataFieldDeleteMetadataField**](docs/MetadataFieldApi.md#metadataFieldDeleteMetadataField) | **DELETE** /MetadataFields/{id} | Deletes a persisted metadata field type by its unique id
*MetadataFieldApi* | [**metadataFieldDeleteMetadataFields**](docs/MetadataFieldApi.md#metadataFieldDeleteMetadataFields) | **DELETE** /MetadataFields | Deletes multiple persisted metadata field types by their unique ids
*MetadataFieldApi* | [**metadataFieldGetAllMetadataFields**](docs/MetadataFieldApi.md#metadataFieldGetAllMetadataFields) | **GET** /MetadataFields | Returns all metadata field types according to the provided filter and output parameters
*MetadataFieldApi* | [**metadataFieldGetMetadataField0**](docs/MetadataFieldApi.md#metadataFieldGetMetadataField0) | **GET** /MetadataFields/{id} | Gets a persisted metadata field type by its unique id
*MetadataFieldApi* | [**metadataFieldGetMetadataField1**](docs/MetadataFieldApi.md#metadataFieldGetMetadataField1) | **GET** /MetadataFields/{name} | Gets a persisted metadata field type by its unique name
*MetadataFieldApi* | [**metadataFieldGetMetadataFieldInUse**](docs/MetadataFieldApi.md#metadataFieldGetMetadataFieldInUse) | **GET** /MetadataFields/{id}/InUse | Determines if a metadata field type associated with the provided identifier is currently in use
*MetadataFieldApi* | [**metadataFieldUpdateMetadataField**](docs/MetadataFieldApi.md#metadataFieldUpdateMetadataField) | **PUT** /MetadataFields | Updates a persisted metadata field with the given metadata field type
*MonitoringApi* | [**monitoringAddRevocationMonitoring**](docs/MonitoringApi.md#monitoringAddRevocationMonitoring) | **POST** /Monitoring/Revocation | Add a revocation monitoring endpoint
*MonitoringApi* | [**monitoringDeleteRevocationMonitoring**](docs/MonitoringApi.md#monitoringDeleteRevocationMonitoring) | **DELETE** /Monitoring/Revocation/{id} | Delete a revocation monitoring endpoint
*MonitoringApi* | [**monitoringEditRevocationMonitoring**](docs/MonitoringApi.md#monitoringEditRevocationMonitoring) | **PUT** /Monitoring/Revocation | Edit a revocation monitoring endpoint
*MonitoringApi* | [**monitoringGetRevocationMonitoring**](docs/MonitoringApi.md#monitoringGetRevocationMonitoring) | **GET** /Monitoring/Revocation/{id} | Get a revocation monitoring endpoint
*MonitoringApi* | [**monitoringGetRevocationMonitoringEndpoints**](docs/MonitoringApi.md#monitoringGetRevocationMonitoringEndpoints) | **GET** /Monitoring/Revocation | Gets all revocation monitoring endpoints according to the provided filter and output parameters
*MonitoringApi* | [**monitoringResolveOCSP**](docs/MonitoringApi.md#monitoringResolveOCSP) | **POST** /Monitoring/ResolveOCSP | Resolve the Certificate authority given
*MonitoringApi* | [**monitoringTestAllRevocationMonitoringAlert**](docs/MonitoringApi.md#monitoringTestAllRevocationMonitoringAlert) | **POST** /Monitoring/Revocation/TestAll | Test All Alerts
*MonitoringApi* | [**monitoringTestRevocationMonitoringAlert**](docs/MonitoringApi.md#monitoringTestRevocationMonitoringAlert) | **POST** /Monitoring/Revocation/Test | Test Alert
*OrchestratorJobApi* | [**orchestratorJobAcknowledgeJobs**](docs/OrchestratorJobApi.md#orchestratorJobAcknowledgeJobs) | **POST** /OrchestratorJobs/Acknowledge | Acknowledges orchestrator jobs based on the provided information
*OrchestratorJobApi* | [**orchestratorJobGetCustomJobResultData**](docs/OrchestratorJobApi.md#orchestratorJobGetCustomJobResultData) | **GET** /OrchestratorJobs/JobStatus/Data | Retrieves the results of a custom job using the provided information
*OrchestratorJobApi* | [**orchestratorJobGetJobHistory**](docs/OrchestratorJobApi.md#orchestratorJobGetJobHistory) | **GET** /OrchestratorJobs/JobHistory | Returns all histories of an orchestrator job according to the provided filter and output parameters
*OrchestratorJobApi* | [**orchestratorJobGetScheduledJobs**](docs/OrchestratorJobApi.md#orchestratorJobGetScheduledJobs) | **GET** /OrchestratorJobs/ScheduledJobs | Returns all scheduled orchestrator jobs according to the provided filter and output parameters
*OrchestratorJobApi* | [**orchestratorJobRescheduleJobs**](docs/OrchestratorJobApi.md#orchestratorJobRescheduleJobs) | **POST** /OrchestratorJobs/Reschedule | Reschedules orchestrator jobs based on the provided information
*OrchestratorJobApi* | [**orchestratorJobScheduleBulkJob**](docs/OrchestratorJobApi.md#orchestratorJobScheduleBulkJob) | **POST** /OrchestratorJobs/Custom/Bulk | Schedules the same job for a custom JobType on the specified agents using the provided information
*OrchestratorJobApi* | [**orchestratorJobScheduleJob**](docs/OrchestratorJobApi.md#orchestratorJobScheduleJob) | **POST** /OrchestratorJobs/Custom | Schedules a job for a custom JobType on the agent using the provided information
*OrchestratorJobApi* | [**orchestratorJobUnscheduleJobs**](docs/OrchestratorJobApi.md#orchestratorJobUnscheduleJobs) | **POST** /OrchestratorJobs/Unschedule | Unschedules orchestrator jobs based on the provided information
*PamProviderApi* | [**pAMProviderCreatePamProviderType**](docs/PamProviderApi.md#pAMProviderCreatePamProviderType) | **POST** /PamProviders/Types | Creates a new PAM provider type with the associated properties
*PamProviderApi* | [**pAMProviderDeletePamProvider**](docs/PamProviderApi.md#pAMProviderDeletePamProvider) | **DELETE** /PamProviders/{id} | Deletes a PAM Provider
*PendingAlertApi* | [**pendingAlertAddPendingAlert**](docs/PendingAlertApi.md#pendingAlertAddPendingAlert) | **POST** /Alerts/Pending | Add a pending alert
*PendingAlertApi* | [**pendingAlertDeletePendingAlert**](docs/PendingAlertApi.md#pendingAlertDeletePendingAlert) | **DELETE** /Alerts/Pending/{id} | Delete a pending alert
*PendingAlertApi* | [**pendingAlertEditPendingAlert**](docs/PendingAlertApi.md#pendingAlertEditPendingAlert) | **PUT** /Alerts/Pending | Edit a pending alert
*PendingAlertApi* | [**pendingAlertEditSchedule**](docs/PendingAlertApi.md#pendingAlertEditSchedule) | **PUT** /Alerts/Pending/Schedule | Edit schedule
*PendingAlertApi* | [**pendingAlertGetPendingAlert**](docs/PendingAlertApi.md#pendingAlertGetPendingAlert) | **GET** /Alerts/Pending/{id} | Get a pending alert
*PendingAlertApi* | [**pendingAlertGetPendingAlerts**](docs/PendingAlertApi.md#pendingAlertGetPendingAlerts) | **GET** /Alerts/Pending | Gets all pending alerts according to the provided filter and output parameters
*PendingAlertApi* | [**pendingAlertGetSchedule**](docs/PendingAlertApi.md#pendingAlertGetSchedule) | **GET** /Alerts/Pending/Schedule | Get the schedule for pending alerts
*PendingAlertApi* | [**pendingAlertTestAllPendingAlert**](docs/PendingAlertApi.md#pendingAlertTestAllPendingAlert) | **POST** /Alerts/Pending/TestAll | Test all pending alerts. Will send alert emails if SendAlerts is true
*PendingAlertApi* | [**pendingAlertTestPendingAlert**](docs/PendingAlertApi.md#pendingAlertTestPendingAlert) | **POST** /Alerts/Pending/Test | Test pending alert. Will send alert emails if SendAlerts is true
*ReportsApi* | [**reportsCreateCustomReport**](docs/ReportsApi.md#reportsCreateCustomReport) | **POST** /Reports/Custom | Creates a custom report
*ReportsApi* | [**reportsCreateReportSchedule**](docs/ReportsApi.md#reportsCreateReportSchedule) | **POST** /Reports/{id}/Schedules | Create a built-in report&#39;s schedule that matches the id of the report.
*ReportsApi* | [**reportsDeleteReport**](docs/ReportsApi.md#reportsDeleteReport) | **DELETE** /Reports/Custom/{id} | Delete custom report that matches the id
*ReportsApi* | [**reportsDeleteReportSchedule**](docs/ReportsApi.md#reportsDeleteReportSchedule) | **DELETE** /Reports/Schedules/{id} | Delete a built-in report&#39;s schedule that matches the id of the schedule.
*ReportsApi* | [**reportsGetCustomReport**](docs/ReportsApi.md#reportsGetCustomReport) | **GET** /Reports/Custom/{id} | Returns a single custom report that matches the id
*ReportsApi* | [**reportsGetReport**](docs/ReportsApi.md#reportsGetReport) | **GET** /Reports/{id} | Returns a single built-in report that matches the id
*ReportsApi* | [**reportsGetReportParameters**](docs/ReportsApi.md#reportsGetReportParameters) | **GET** /Reports/{id}/Parameters | Get a built-in report&#39;s parameters that matches the id of the report.
*ReportsApi* | [**reportsGetReportSchedule**](docs/ReportsApi.md#reportsGetReportSchedule) | **GET** /Reports/Schedules/{id} | Get a built-in report&#39;s schedule that matches the id of the schedule.
*ReportsApi* | [**reportsGetReportSchedules**](docs/ReportsApi.md#reportsGetReportSchedules) | **GET** /Reports/{id}/Schedules | Get a built-in report&#39;s schedules that matches the id of the report.
*ReportsApi* | [**reportsQueryCustomReports**](docs/ReportsApi.md#reportsQueryCustomReports) | **GET** /Reports/Custom | Returns all custom reports according to the provided filter and output parameters
*ReportsApi* | [**reportsQueryReports**](docs/ReportsApi.md#reportsQueryReports) | **GET** /Reports | Returns all built-in reports according to the provided filter and output parameters
*ReportsApi* | [**reportsUpdateCustomReport**](docs/ReportsApi.md#reportsUpdateCustomReport) | **PUT** /Reports/Custom | Updates a custom report that matches the id
*ReportsApi* | [**reportsUpdateReport**](docs/ReportsApi.md#reportsUpdateReport) | **PUT** /Reports | Updates a single built-in report that matches the id. Only some fields can be updated.
*ReportsApi* | [**reportsUpdateReportParameters**](docs/ReportsApi.md#reportsUpdateReportParameters) | **PUT** /Reports/{id}/Parameters | Update a built-in report&#39;s parameters that matches the id of the report.
*ReportsApi* | [**reportsUpdateReportSchedule**](docs/ReportsApi.md#reportsUpdateReportSchedule) | **PUT** /Reports/{id}/Schedules | Update a built-in report&#39;s schedule that matches the id of the report.
*SecurityApi* | [**securityDeleteSecurityIdentity**](docs/SecurityApi.md#securityDeleteSecurityIdentity) | **DELETE** /Security/Identities/{id} | Deletes the security identity whose ID is provided.
*SecurityApi* | [**securityIdentityPermissions**](docs/SecurityApi.md#securityIdentityPermissions) | **GET** /Security/Identities/{id} | Gets an object representing the permissions of the identity associated with the provided identifier.
*SecurityApi* | [**securityLookupIdentity**](docs/SecurityApi.md#securityLookupIdentity) | **GET** /Security/Identities/Lookup | Validates that the identity with the name given exists.
*SecurityRolePermissionsApi* | [**securityRolePermissionsAddCollectionPermissions**](docs/SecurityRolePermissionsApi.md#securityRolePermissionsAddCollectionPermissions) | **POST** /Security/Roles/{id}/Permissions/Collections | Adds collection permissions to the security role that matches the id.
*SecurityRolePermissionsApi* | [**securityRolePermissionsAddContainerPermissions**](docs/SecurityRolePermissionsApi.md#securityRolePermissionsAddContainerPermissions) | **POST** /Security/Roles/{id}/Permissions/Containers | Adds container permissions to the security role that matches the id.
*SecurityRolePermissionsApi* | [**securityRolePermissionsAddGlobalPermissions**](docs/SecurityRolePermissionsApi.md#securityRolePermissionsAddGlobalPermissions) | **POST** /Security/Roles/{id}/Permissions/Global | Adds global permissions to the security role that matches the id.
*SecurityRolePermissionsApi* | [**securityRolePermissionsGetCollectionPermissionsForRole**](docs/SecurityRolePermissionsApi.md#securityRolePermissionsGetCollectionPermissionsForRole) | **GET** /Security/Roles/{id}/Permissions/Collections | Returns all collection permissions associated with the security role that matches the id.
*SecurityRolePermissionsApi* | [**securityRolePermissionsGetContainerPermissionsForRole**](docs/SecurityRolePermissionsApi.md#securityRolePermissionsGetContainerPermissionsForRole) | **GET** /Security/Roles/{id}/Permissions/Containers | Returns all container permissions associated with the security role that matches the id.
*SecurityRolePermissionsApi* | [**securityRolePermissionsGetGlobalPermissionsForRole**](docs/SecurityRolePermissionsApi.md#securityRolePermissionsGetGlobalPermissionsForRole) | **GET** /Security/Roles/{id}/Permissions/Global | Returns all global permissions associated with the security role that matches the id.
*SecurityRolePermissionsApi* | [**securityRolePermissionsGetPermissionsForRole**](docs/SecurityRolePermissionsApi.md#securityRolePermissionsGetPermissionsForRole) | **GET** /Security/Roles/{id}/Permissions | Returns all permissions associated with the security role that matches the id.
*SecurityRolePermissionsApi* | [**securityRolePermissionsSetCollectionPermissions**](docs/SecurityRolePermissionsApi.md#securityRolePermissionsSetCollectionPermissions) | **PUT** /Security/Roles/{id}/Permissions/Collections | Sets collection permissions to the security role that matches the id.
*SecurityRolePermissionsApi* | [**securityRolePermissionsSetContainerPermissions**](docs/SecurityRolePermissionsApi.md#securityRolePermissionsSetContainerPermissions) | **PUT** /Security/Roles/{id}/Permissions/Containers | Sets container permissions to the security role that matches the id.
*SecurityRolePermissionsApi* | [**securityRolePermissionsSetGlobalPermissions**](docs/SecurityRolePermissionsApi.md#securityRolePermissionsSetGlobalPermissions) | **PUT** /Security/Roles/{id}/Permissions/Global | Adds global permissions to the security role that matches the id.
*SecurityRolesApi* | [**securityRolesDeleteSecurityRole**](docs/SecurityRolesApi.md#securityRolesDeleteSecurityRole) | **DELETE** /Security/Roles/{id} | Deletes the security role whose ID is provided.
*SecurityRolesApi* | [**securityRolesGetIdentitiesWithRole**](docs/SecurityRolesApi.md#securityRolesGetIdentitiesWithRole) | **GET** /Security/Roles/{id}/Identities | Returns all identities which have the security role that matches the id.
*SecurityRolesApi* | [**securityRolesUpdateIdentitiesWithRole**](docs/SecurityRolesApi.md#securityRolesUpdateIdentitiesWithRole) | **PUT** /Security/Roles/{id}/Identities | Updates the identities which have the security role that matches the id.
*ServerApi* | [**serverAddAccess**](docs/ServerApi.md#serverAddAccess) | **POST** /SSH/Servers/Access | Updates logons and users with access to those logons for an existing server
*ServerApi* | [**serverCreateServer**](docs/ServerApi.md#serverCreateServer) | **POST** /SSH/Servers | Creates a server with the provided properties
*ServerApi* | [**serverDelete**](docs/ServerApi.md#serverDelete) | **DELETE** /SSH/Servers/{id} | Deletes a Server associated with the provided identifier
*ServerApi* | [**serverGet**](docs/ServerApi.md#serverGet) | **GET** /SSH/Servers/{id} | Returns a Server associated with the provided identifier
*ServerApi* | [**serverGetAccess**](docs/ServerApi.md#serverGetAccess) | **GET** /SSH/Servers/Access/{id} | Retrieves logons and users with access to those logons for an existing server
*ServerApi* | [**serverQueryServers**](docs/ServerApi.md#serverQueryServers) | **GET** /SSH/Servers | Returns all servers according to the provided filter parameters
*ServerApi* | [**serverRemoveAccess**](docs/ServerApi.md#serverRemoveAccess) | **DELETE** /SSH/Servers/Access | Updates logons and users with access to those logons for an existing server
*ServerApi* | [**serverUpdateServer**](docs/ServerApi.md#serverUpdateServer) | **PUT** /SSH/Servers | Updates an existing server with the provided properties
*ServerGroupApi* | [**serverGroupAddAccess**](docs/ServerGroupApi.md#serverGroupAddAccess) | **POST** /SSH/ServerGroups/Access | Add access rules to the server group
*ServerGroupApi* | [**serverGroupCreateServerGroup**](docs/ServerGroupApi.md#serverGroupCreateServerGroup) | **POST** /SSH/ServerGroups | Creates a server group with the provided properties
*ServerGroupApi* | [**serverGroupDelete**](docs/ServerGroupApi.md#serverGroupDelete) | **DELETE** /SSH/ServerGroups/{id} | Deletes a ServerGroup associated with the provided identifier
*ServerGroupApi* | [**serverGroupGetAccess**](docs/ServerGroupApi.md#serverGroupGetAccess) | **GET** /SSH/ServerGroups/Access/{id} | Retrieves logons and users with access to those logons for an existing server group
*ServerGroupApi* | [**serverGroupGetGroup**](docs/ServerGroupApi.md#serverGroupGetGroup) | **GET** /SSH/ServerGroups/{id} | Returns a ServerGroup associated with the provided identifier
*ServerGroupApi* | [**serverGroupGetGroupByName**](docs/ServerGroupApi.md#serverGroupGetGroupByName) | **GET** /SSH/ServerGroups/{name} | Returns a ServerGroup associated with the provided identifier
*ServerGroupApi* | [**serverGroupQueryServerGroups**](docs/ServerGroupApi.md#serverGroupQueryServerGroups) | **GET** /SSH/ServerGroups | Returns all server groups according to the provided filter parameters
*ServerGroupApi* | [**serverGroupRemoveAccess**](docs/ServerGroupApi.md#serverGroupRemoveAccess) | **DELETE** /SSH/ServerGroups/Access | Removes access mappings for the specified server group
*ServerGroupApi* | [**serverGroupUpdateServerGroup**](docs/ServerGroupApi.md#serverGroupUpdateServerGroup) | **PUT** /SSH/ServerGroups | Updates an existing server group with the provided properties
*ServiceAccountApi* | [**serviceAccountCreateServiceAccount**](docs/ServiceAccountApi.md#serviceAccountCreateServiceAccount) | **POST** /SSH/ServiceAccounts | Creates a ServiceAccount with the provided properties
*ServiceAccountApi* | [**serviceAccountDeleteServiceAccount**](docs/ServiceAccountApi.md#serviceAccountDeleteServiceAccount) | **DELETE** /SSH/ServiceAccounts/{id} | Deletes a ServiceAccount associated with the provided identifier
*ServiceAccountApi* | [**serviceAccountDeleteServiceAccounts**](docs/ServiceAccountApi.md#serviceAccountDeleteServiceAccounts) | **DELETE** /SSH/ServiceAccounts | Deletes Service Accounts associated with the provided identifiers
*ServiceAccountApi* | [**serviceAccountGet**](docs/ServiceAccountApi.md#serviceAccountGet) | **GET** /SSH/ServiceAccounts/{id} | Returns a ServiceAccount associated with the provided identifier
*ServiceAccountApi* | [**serviceAccountGetServiceAccountKey**](docs/ServiceAccountApi.md#serviceAccountGetServiceAccountKey) | **GET** /SSH/ServiceAccounts/Key/{id} | Returns an SSH key with or without private key based on the provided parameters.
*ServiceAccountApi* | [**serviceAccountQueryServiceAccounts**](docs/ServiceAccountApi.md#serviceAccountQueryServiceAccounts) | **GET** /SSH/ServiceAccounts | Returns all ServiceAccounts according to the provided filter parameters
*ServiceAccountApi* | [**serviceAccountRotateServiceAccountKey**](docs/ServiceAccountApi.md#serviceAccountRotateServiceAccountKey) | **POST** /SSH/ServiceAccounts/Rotate/{id} | Rotate an SSH key for a specified service account.
*ServiceAccountApi* | [**serviceAccountUpdateServiceAccount**](docs/ServiceAccountApi.md#serviceAccountUpdateServiceAccount) | **PUT** /SSH/ServiceAccounts | Updates an SSH key for a specified service account.
*SmtpApi* | [**sMTPSMTP**](docs/SmtpApi.md#sMTPSMTP) | **GET** /SMTP | Gets SMTP profile data
*SmtpApi* | [**sMTPTestSMTP**](docs/SmtpApi.md#sMTPTestSMTP) | **POST** /SMTP/Test | Tests SMTP profile data
*SmtpApi* | [**sMTPUpdateSMTP**](docs/SmtpApi.md#sMTPUpdateSMTP) | **PUT** /SMTP | Updates SMTP profile data
*SslApi* | [**sslAddNetworkRanges**](docs/SslApi.md#sslAddNetworkRanges) | **POST** /SSL/NetworkRanges | Adds the provided network range definitions to the associated network definition
*SslApi* | [**sslCreateNetwork**](docs/SslApi.md#sslCreateNetwork) | **POST** /SSL/Networks | Creates a network definition according to the provided properties
*SslApi* | [**sslEndpoint**](docs/SslApi.md#sslEndpoint) | **GET** /SSL/Endpoints/{id} | Returns the details of the associated scanning endpoint
*SslApi* | [**sslEndpointHistory**](docs/SslApi.md#sslEndpointHistory) | **GET** /SSL/Endpoints/{id}/History | Returns a list of the scan results for the provided endpoint according to the provided filter and output parameters
*SslApi* | [**sslGetNetwork**](docs/SslApi.md#sslGetNetwork) | **GET** /SSL/Networks/{identifier} | Returns a defined SSL network according to the provided name
*SslApi* | [**sslGetNetworkRangesForNetwork**](docs/SslApi.md#sslGetNetworkRangesForNetwork) | **GET** /SSL/NetworkRanges/{id} | Returns the network range definitions for the provided network definition
*SslApi* | [**sslGetNetworks**](docs/SslApi.md#sslGetNetworks) | **GET** /SSL/Networks | Returns all defined SSL networks according to the provided filter and output parameters
*SslApi* | [**sslImmediateSslScan**](docs/SslApi.md#sslImmediateSslScan) | **POST** /SSL/Networks/{id}/Scan | Starts an SSL Scan for the network according to the associated network definition
*SslApi* | [**sslMonitorAll**](docs/SslApi.md#sslMonitorAll) | **PUT** /SSL/Endpoints/MonitorAll | Sets all endpoints matching the provided query as &#39;monitored&#39;
*SslApi* | [**sslMonitoringStatus**](docs/SslApi.md#sslMonitoringStatus) | **PUT** /SSL/Endpoints/MonitorStatus | Sets the monitored status according to the provided endpoint and boolean status
*SslApi* | [**sslNetworkScanParts**](docs/SslApi.md#sslNetworkScanParts) | **GET** /SSL/Networks/{id}/Parts | Returns the scan job components comprising the entire scan job to be executed
*SslApi* | [**sslRemoveAllNetworkRanges**](docs/SslApi.md#sslRemoveAllNetworkRanges) | **DELETE** /SSL/NetworkRanges/{id} | Removes all network range definitions from the associated network definition
*SslApi* | [**sslRemoveNetwork**](docs/SslApi.md#sslRemoveNetwork) | **DELETE** /SSL/Networks/{id} | Removes a network definition according to the provided identifier
*SslApi* | [**sslResults**](docs/SslApi.md#sslResults) | **GET** /SSL | Returns a list of the endpoint scan results according to the provided filter and output parameters
*SslApi* | [**sslReviewAll**](docs/SslApi.md#sslReviewAll) | **PUT** /SSL/Endpoints/ReviewAll | Sets all endpoints matching the provided query as &#39;reviewed&#39;
*SslApi* | [**sslReviewedStatus**](docs/SslApi.md#sslReviewedStatus) | **PUT** /SSL/Endpoints/ReviewStatus | Sets the reviewed status according to the provided endpoint and boolean status
*SslApi* | [**sslScanPart**](docs/SslApi.md#sslScanPart) | **GET** /SSL/Parts/{id} | Returns the execution details of the associated network scan job part
*SslApi* | [**sslSetNetworkRanges**](docs/SslApi.md#sslSetNetworkRanges) | **PUT** /SSL/NetworkRanges | Configures network range definitions for the provided network
*SslApi* | [**sslUpdateNetwork**](docs/SslApi.md#sslUpdateNetwork) | **PUT** /SSL/Networks | Updates an existing network definition according to the provided properties
*SslApi* | [**sslValidateNetworkRanges**](docs/SslApi.md#sslValidateNetworkRanges) | **POST** /SSL/NetworkRanges/Validate | Validates the format (using regular expressions) of the provided network range definitions
*StatusApi* | [**statusGetEndpoints**](docs/StatusApi.md#statusGetEndpoints) | **GET** /Status/Endpoints | Returns all endpoints to which the requesting identity has access
*TemplateApi* | [**templateGetGlobalSettings**](docs/TemplateApi.md#templateGetGlobalSettings) | **GET** /Templates/Settings | Gets the global template settings.
*TemplateApi* | [**templateGetTemplate**](docs/TemplateApi.md#templateGetTemplate) | **GET** /Templates/{id} | Returns the certificate template associated with the provided id
*TemplateApi* | [**templateGetTemplates**](docs/TemplateApi.md#templateGetTemplates) | **GET** /Templates | Returns all certificate templates according to the provided filter and output parameters
*TemplateApi* | [**templateGetValidSubjectParts**](docs/TemplateApi.md#templateGetValidSubjectParts) | **GET** /Templates/SubjectParts | 
*TemplateApi* | [**templateImport**](docs/TemplateApi.md#templateImport) | **POST** /Templates/Import | Imports templates from the provided configuration tenant
*TemplateApi* | [**templateUpdateGlobalSettings**](docs/TemplateApi.md#templateUpdateGlobalSettings) | **PUT** /Templates/Settings | Replaces the existing global template settings.
*TemplateApi* | [**templateUpdateTemplate**](docs/TemplateApi.md#templateUpdateTemplate) | **PUT** /Templates | Updates a certificate template according to the provided properties
*UserApi* | [**userCreateUser**](docs/UserApi.md#userCreateUser) | **POST** /SSH/Users | Creates a new SSH User.
*UserApi* | [**userDeleteUser**](docs/UserApi.md#userDeleteUser) | **DELETE** /SSH/Users/{id} | Deletes an SSH user.
*UserApi* | [**userGetUser**](docs/UserApi.md#userGetUser) | **GET** /SSH/Users/{id} | Looks up information about an existing SSH user.
*UserApi* | [**userQueryUsers**](docs/UserApi.md#userQueryUsers) | **GET** /SSH/Users | Returns users matching the criteria from the provided query parameters
*UserApi* | [**userUpdateUser**](docs/UserApi.md#userUpdateUser) | **PUT** /SSH/Users | Updates information about a given user.
*UserApi* | [**userUserAccess**](docs/UserApi.md#userUserAccess) | **POST** /SSH/Users/Access | Updates logon access for a user
*WorkflowApi* | [**workflowApprovePendingRequests**](docs/WorkflowApi.md#workflowApprovePendingRequests) | **POST** /Workflow/Certificates/Approve | Approves pending certificate requests associated with the provided ids
*WorkflowApi* | [**workflowDenyPendingRequests**](docs/WorkflowApi.md#workflowDenyPendingRequests) | **POST** /Workflow/Certificates/Deny | Denies pending certificate requests associated with the provided ids
*WorkflowApi* | [**workflowGet**](docs/WorkflowApi.md#workflowGet) | **GET** /Workflow/Certificates/Pending | Gets a collection of certificate requests based on the provided query.
*WorkflowApi* | [**workflowGetCertificateRequestDetails**](docs/WorkflowApi.md#workflowGetCertificateRequestDetails) | **GET** /Workflow/Certificates/{id} | Returns certificate request details based on the provided ID.
*WorkflowApi* | [**workflowGetDenied**](docs/WorkflowApi.md#workflowGetDenied) | **GET** /Workflow/Certificates/Denied | Gets a collection of denied certificate requests based on the provided query.
*WorkflowDefinitionApi* | [**workflowDefinitionConfigureDefinitionSteps**](docs/WorkflowDefinitionApi.md#workflowDefinitionConfigureDefinitionSteps) | **PUT** /Workflow/Definitions/{definitionId}/Steps | Sets the provided steps on the latest version of the definition.
*WorkflowDefinitionApi* | [**workflowDefinitionCreateNewDefinition**](docs/WorkflowDefinitionApi.md#workflowDefinitionCreateNewDefinition) | **POST** /Workflow/Definitions | Creates a new base definition without any steps.
*WorkflowDefinitionApi* | [**workflowDefinitionDelete**](docs/WorkflowDefinitionApi.md#workflowDefinitionDelete) | **DELETE** /Workflow/Definitions/{definitionId} | Deletes the definition matching the given Id.
*WorkflowDefinitionApi* | [**workflowDefinitionGet**](docs/WorkflowDefinitionApi.md#workflowDefinitionGet) | **GET** /Workflow/Definitions/{definitionId} | Gets a workflow definition.
*WorkflowDefinitionApi* | [**workflowDefinitionGetStepSchema**](docs/WorkflowDefinitionApi.md#workflowDefinitionGetStepSchema) | **GET** /Workflow/Definitions/Steps/{extensionName} | Gets the schema of a given step with the specified extension name.
*WorkflowDefinitionApi* | [**workflowDefinitionPublishDefinition**](docs/WorkflowDefinitionApi.md#workflowDefinitionPublishDefinition) | **POST** /Workflow/Definitions/{definitionId}/Publish | Makes the most recent version of a Workflow Definition the published version.
*WorkflowDefinitionApi* | [**workflowDefinitionQuery**](docs/WorkflowDefinitionApi.md#workflowDefinitionQuery) | **GET** /Workflow/Definitions | Gets the Definitions matching the query specifications.
*WorkflowDefinitionApi* | [**workflowDefinitionQueryAvailableSteps**](docs/WorkflowDefinitionApi.md#workflowDefinitionQueryAvailableSteps) | **GET** /Workflow/Definitions/Steps | Gets the result set of available steps for a given query.
*WorkflowDefinitionApi* | [**workflowDefinitionQueryWorkflowTypes**](docs/WorkflowDefinitionApi.md#workflowDefinitionQueryWorkflowTypes) | **GET** /Workflow/Definitions/Types | Performs a query against the workflow types in the system.
*WorkflowDefinitionApi* | [**workflowDefinitionUpdateExistingDefinition**](docs/WorkflowDefinitionApi.md#workflowDefinitionUpdateExistingDefinition) | **PUT** /Workflow/Definitions/{definitionId} | Updates the existing definition&#39;s DisplayName and Description.
*WorkflowInstanceApi* | [**workflowInstanceDeleteInstance**](docs/WorkflowInstanceApi.md#workflowInstanceDeleteInstance) | **DELETE** /Workflow/Instances/{instanceId} | Deletes the specified instance.
*WorkflowInstanceApi* | [**workflowInstanceGet**](docs/WorkflowInstanceApi.md#workflowInstanceGet) | **GET** /Workflow/Instances/{instanceId} | Get information relevant for knowing where an instance is in its workflow.
*WorkflowInstanceApi* | [**workflowInstanceQuery**](docs/WorkflowInstanceApi.md#workflowInstanceQuery) | **GET** /Workflow/Instances | Gets the workflow instances matching the query specifications.
*WorkflowInstanceApi* | [**workflowInstanceQueryInstancesAssignedToMe**](docs/WorkflowInstanceApi.md#workflowInstanceQueryInstancesAssignedToMe) | **GET** /Workflow/Instances/AssignedToMe | Gets the workflow instances waiting on the user.
*WorkflowInstanceApi* | [**workflowInstanceQueryInstancesStartedByMe**](docs/WorkflowInstanceApi.md#workflowInstanceQueryInstancesStartedByMe) | **GET** /Workflow/Instances/My | Gets the workflow instances started by the user.
*WorkflowInstanceApi* | [**workflowInstanceRestart**](docs/WorkflowInstanceApi.md#workflowInstanceRestart) | **POST** /Workflow/Instances/{instanceId}/Restart | Restarts a failed instance against the specified definition version or the published version if no version is specified.
*WorkflowInstanceApi* | [**workflowInstanceSignal**](docs/WorkflowInstanceApi.md#workflowInstanceSignal) | **POST** /Workflow/Instances/{instanceId}/Signals | Receives the given signal for the given instance.
*WorkflowInstanceApi* | [**workflowInstanceStop**](docs/WorkflowInstanceApi.md#workflowInstanceStop) | **POST** /Workflow/Instances/{instanceId}/Stop | Rejects an instance, preventing it from continuing.


## Documentation for Models

 - [CoreModelsEnrollmentEnrollmentCA](docs/CoreModelsEnrollmentEnrollmentCA.md)
 - [CoreModelsEnrollmentEnrollmentTemplate](docs/CoreModelsEnrollmentEnrollmentTemplate.md)
 - [CoreModelsEnrollmentEnrollmentTemplateCAResponse](docs/CoreModelsEnrollmentEnrollmentTemplateCAResponse.md)
 - [KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse](docs/KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse.md)
 - [KeyfactorAPIModelsSMTPSMTPRequest](docs/KeyfactorAPIModelsSMTPSMTPRequest.md)
 - [KeyfactorAPIModelsSMTPSMTPResponse](docs/KeyfactorAPIModelsSMTPSMTPResponse.md)
 - [KeyfactorAPIModelsSMTPSMTPTestRequest](docs/KeyfactorAPIModelsSMTPSMTPTestRequest.md)
 - [KeyfactorAPIModelsSMTPSMTPTestResponse](docs/KeyfactorAPIModelsSMTPSMTPTestResponse.md)
 - [KeyfactorApiModelsAlertsAlertCertificateQueryAlertCertificateQueryResponse](docs/KeyfactorApiModelsAlertsAlertCertificateQueryAlertCertificateQueryResponse.md)
 - [KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest](docs/KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest.md)
 - [KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse](docs/KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse.md)
 - [KeyfactorApiModelsAlertsAlertTemplateAlertTemplateResponse](docs/KeyfactorApiModelsAlertsAlertTemplateAlertTemplateResponse.md)
 - [KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest](docs/KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.md)
 - [KeyfactorApiModelsAlertsDeniedDeniedAlertDefinitionResponse](docs/KeyfactorApiModelsAlertsDeniedDeniedAlertDefinitionResponse.md)
 - [KeyfactorApiModelsAlertsDeniedDeniedAlertUpdateRequest](docs/KeyfactorApiModelsAlertsDeniedDeniedAlertUpdateRequest.md)
 - [KeyfactorApiModelsAlertsExpirationExpirationAlertCreationRequest](docs/KeyfactorApiModelsAlertsExpirationExpirationAlertCreationRequest.md)
 - [KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse](docs/KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.md)
 - [KeyfactorApiModelsAlertsExpirationExpirationAlertResponse](docs/KeyfactorApiModelsAlertsExpirationExpirationAlertResponse.md)
 - [KeyfactorApiModelsAlertsExpirationExpirationAlertTestAllRequest](docs/KeyfactorApiModelsAlertsExpirationExpirationAlertTestAllRequest.md)
 - [KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest](docs/KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest.md)
 - [KeyfactorApiModelsAlertsExpirationExpirationAlertTestResponse](docs/KeyfactorApiModelsAlertsExpirationExpirationAlertTestResponse.md)
 - [KeyfactorApiModelsAlertsExpirationExpirationAlertUpdateRequest](docs/KeyfactorApiModelsAlertsExpirationExpirationAlertUpdateRequest.md)
 - [KeyfactorApiModelsAlertsIssuedIssuedAlertCreationRequest](docs/KeyfactorApiModelsAlertsIssuedIssuedAlertCreationRequest.md)
 - [KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse](docs/KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse.md)
 - [KeyfactorApiModelsAlertsIssuedIssuedAlertUpdateRequest](docs/KeyfactorApiModelsAlertsIssuedIssuedAlertUpdateRequest.md)
 - [KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertCreationRequest](docs/KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertCreationRequest.md)
 - [KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse](docs/KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse.md)
 - [KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse](docs/KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse.md)
 - [KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest](docs/KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest.md)
 - [KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestRequest](docs/KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestRequest.md)
 - [KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse](docs/KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse.md)
 - [KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertUpdateRequest](docs/KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertUpdateRequest.md)
 - [KeyfactorApiModelsAlertsPendingPendingAlertCreationRequest](docs/KeyfactorApiModelsAlertsPendingPendingAlertCreationRequest.md)
 - [KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse](docs/KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse.md)
 - [KeyfactorApiModelsAlertsPendingPendingAlertResponse](docs/KeyfactorApiModelsAlertsPendingPendingAlertResponse.md)
 - [KeyfactorApiModelsAlertsPendingPendingAlertTestAllRequest](docs/KeyfactorApiModelsAlertsPendingPendingAlertTestAllRequest.md)
 - [KeyfactorApiModelsAlertsPendingPendingAlertTestRequest](docs/KeyfactorApiModelsAlertsPendingPendingAlertTestRequest.md)
 - [KeyfactorApiModelsAlertsPendingPendingAlertTestResponse](docs/KeyfactorApiModelsAlertsPendingPendingAlertTestResponse.md)
 - [KeyfactorApiModelsAlertsPendingPendingAlertUpdateRequest](docs/KeyfactorApiModelsAlertsPendingPendingAlertUpdateRequest.md)
 - [KeyfactorApiModelsCertificateAuthoritiesCertificateAuthorityTestResponse](docs/KeyfactorApiModelsCertificateAuthoritiesCertificateAuthorityTestResponse.md)
 - [KeyfactorApiModelsCertificateCollectionsCertificateCollectionCopyRequest](docs/KeyfactorApiModelsCertificateCollectionsCertificateCollectionCopyRequest.md)
 - [KeyfactorApiModelsCertificateCollectionsCertificateCollectionCreateRequest](docs/KeyfactorApiModelsCertificateCollectionsCertificateCollectionCreateRequest.md)
 - [KeyfactorApiModelsCertificateCollectionsCertificateCollectionResponse](docs/KeyfactorApiModelsCertificateCollectionsCertificateCollectionResponse.md)
 - [KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest](docs/KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.md)
 - [KeyfactorApiModelsCertificateStoresAddCertificateRequest](docs/KeyfactorApiModelsCertificateStoresAddCertificateRequest.md)
 - [KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest](docs/KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest.md)
 - [KeyfactorApiModelsCertificateStoresJobHistoryResponse](docs/KeyfactorApiModelsCertificateStoresJobHistoryResponse.md)
 - [KeyfactorApiModelsCertificateStoresReenrollmentRequest](docs/KeyfactorApiModelsCertificateStoresReenrollmentRequest.md)
 - [KeyfactorApiModelsCertificateStoresRemoveCertificateRequest](docs/KeyfactorApiModelsCertificateStoresRemoveCertificateRequest.md)
 - [KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeCreationRequest](docs/KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeCreationRequest.md)
 - [KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse](docs/KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse.md)
 - [KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeUpdateRequest](docs/KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeUpdateRequest.md)
 - [KeyfactorApiModelsCertificatesAnalyzeCertificateRequest](docs/KeyfactorApiModelsCertificatesAnalyzeCertificateRequest.md)
 - [KeyfactorApiModelsCertificatesCertificateIdentityAuditResponse](docs/KeyfactorApiModelsCertificatesCertificateIdentityAuditResponse.md)
 - [KeyfactorApiModelsCertificatesCertificateIdentityAuditResponseCertificatePermission](docs/KeyfactorApiModelsCertificatesCertificateIdentityAuditResponseCertificatePermission.md)
 - [KeyfactorApiModelsCertificatesCertificateLocationsResponse](docs/KeyfactorApiModelsCertificatesCertificateLocationsResponse.md)
 - [KeyfactorApiModelsCertificatesCertificateQueryRequest](docs/KeyfactorApiModelsCertificatesCertificateQueryRequest.md)
 - [KeyfactorApiModelsConfigurationTenantConfigurationTenantRequest](docs/KeyfactorApiModelsConfigurationTenantConfigurationTenantRequest.md)
 - [KeyfactorApiModelsEnrollmentEnrollmentManagementRequest](docs/KeyfactorApiModelsEnrollmentEnrollmentManagementRequest.md)
 - [KeyfactorApiModelsEnrollmentManagementStoreRequest](docs/KeyfactorApiModelsEnrollmentManagementStoreRequest.md)
 - [KeyfactorApiModelsEnrollmentManagementStoreTypeRequest](docs/KeyfactorApiModelsEnrollmentManagementStoreTypeRequest.md)
 - [KeyfactorApiModelsEventHandlerEventHandlerParameterRequest](docs/KeyfactorApiModelsEventHandlerEventHandlerParameterRequest.md)
 - [KeyfactorApiModelsEventHandlerEventHandlerParameterResponse](docs/KeyfactorApiModelsEventHandlerEventHandlerParameterResponse.md)
 - [KeyfactorApiModelsEventHandlerRegisteredEventHandlerRequest](docs/KeyfactorApiModelsEventHandlerRegisteredEventHandlerRequest.md)
 - [KeyfactorApiModelsEventHandlerRegisteredEventHandlerResponse](docs/KeyfactorApiModelsEventHandlerRegisteredEventHandlerResponse.md)
 - [KeyfactorApiModelsLicenseLicenseResponse](docs/KeyfactorApiModelsLicenseLicenseResponse.md)
 - [KeyfactorApiModelsLicenseLicenseResponseLicense](docs/KeyfactorApiModelsLicenseLicenseResponseLicense.md)
 - [KeyfactorApiModelsLicenseLicenseResponseLicensedCustomer](docs/KeyfactorApiModelsLicenseLicenseResponseLicensedCustomer.md)
 - [KeyfactorApiModelsLicenseLicenseResponseLicensedFeature](docs/KeyfactorApiModelsLicenseLicenseResponseLicensedFeature.md)
 - [KeyfactorApiModelsLicenseLicenseResponseLicensedProduct](docs/KeyfactorApiModelsLicenseLicenseResponseLicensedProduct.md)
 - [KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel](docs/KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.md)
 - [KeyfactorApiModelsMetadataFieldMetadataFieldCreateRequest](docs/KeyfactorApiModelsMetadataFieldMetadataFieldCreateRequest.md)
 - [KeyfactorApiModelsMetadataFieldMetadataFieldResponse](docs/KeyfactorApiModelsMetadataFieldMetadataFieldResponse.md)
 - [KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest](docs/KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.md)
 - [KeyfactorApiModelsMonitoringDashboardRequest](docs/KeyfactorApiModelsMonitoringDashboardRequest.md)
 - [KeyfactorApiModelsMonitoringDashboardResponse](docs/KeyfactorApiModelsMonitoringDashboardResponse.md)
 - [KeyfactorApiModelsMonitoringEmailRequest](docs/KeyfactorApiModelsMonitoringEmailRequest.md)
 - [KeyfactorApiModelsMonitoringEmailResponse](docs/KeyfactorApiModelsMonitoringEmailResponse.md)
 - [KeyfactorApiModelsMonitoringOCSPParametersRequest](docs/KeyfactorApiModelsMonitoringOCSPParametersRequest.md)
 - [KeyfactorApiModelsMonitoringOCSPParametersResponse](docs/KeyfactorApiModelsMonitoringOCSPParametersResponse.md)
 - [KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestAllRequest](docs/KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestAllRequest.md)
 - [KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestRequest](docs/KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestRequest.md)
 - [KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestResponse](docs/KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestResponse.md)
 - [KeyfactorApiModelsMonitoringRevocationMonitoringCreationRequest](docs/KeyfactorApiModelsMonitoringRevocationMonitoringCreationRequest.md)
 - [KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse](docs/KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse.md)
 - [KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest](docs/KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.md)
 - [KeyfactorApiModelsOrchestratorJobsAcknowledgeJobRequest](docs/KeyfactorApiModelsOrchestratorJobsAcknowledgeJobRequest.md)
 - [KeyfactorApiModelsOrchestratorJobsBulkJobResponse](docs/KeyfactorApiModelsOrchestratorJobsBulkJobResponse.md)
 - [KeyfactorApiModelsOrchestratorJobsCustomJobResultDataResponse](docs/KeyfactorApiModelsOrchestratorJobsCustomJobResultDataResponse.md)
 - [KeyfactorApiModelsOrchestratorJobsJobFieldResponse](docs/KeyfactorApiModelsOrchestratorJobsJobFieldResponse.md)
 - [KeyfactorApiModelsOrchestratorJobsJobResponse](docs/KeyfactorApiModelsOrchestratorJobsJobResponse.md)
 - [KeyfactorApiModelsOrchestratorJobsJobTypeFieldResponse](docs/KeyfactorApiModelsOrchestratorJobsJobTypeFieldResponse.md)
 - [KeyfactorApiModelsOrchestratorJobsJobTypeResponse](docs/KeyfactorApiModelsOrchestratorJobsJobTypeResponse.md)
 - [KeyfactorApiModelsOrchestratorJobsRescheduleJobRequest](docs/KeyfactorApiModelsOrchestratorJobsRescheduleJobRequest.md)
 - [KeyfactorApiModelsOrchestratorJobsUnscheduleJobRequest](docs/KeyfactorApiModelsOrchestratorJobsUnscheduleJobRequest.md)
 - [KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse](docs/KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.md)
 - [KeyfactorApiModelsOrchestratorsAgentBlueprintResponse](docs/KeyfactorApiModelsOrchestratorsAgentBlueprintResponse.md)
 - [KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse](docs/KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.md)
 - [KeyfactorApiModelsOrchestratorsAgentResponse](docs/KeyfactorApiModelsOrchestratorsAgentResponse.md)
 - [KeyfactorApiModelsOrchestratorsUpdateOrchestratorAuthCertificateReenrollmentRequest](docs/KeyfactorApiModelsOrchestratorsUpdateOrchestratorAuthCertificateReenrollmentRequest.md)
 - [KeyfactorApiModelsOrchestratorsUpdateOrchestratorAuthCertificateReenrollmentResponse](docs/KeyfactorApiModelsOrchestratorsUpdateOrchestratorAuthCertificateReenrollmentResponse.md)
 - [KeyfactorApiModelsSecurityRolesAreaPermissionResponse](docs/KeyfactorApiModelsSecurityRolesAreaPermissionResponse.md)
 - [KeyfactorApiModelsSecurityRolesContainerPermissionRequest](docs/KeyfactorApiModelsSecurityRolesContainerPermissionRequest.md)
 - [KeyfactorApiModelsSecurityRolesContainerPermissionResponse](docs/KeyfactorApiModelsSecurityRolesContainerPermissionResponse.md)
 - [KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionRequest](docs/KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionRequest.md)
 - [KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionResponse](docs/KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionResponse.md)
 - [KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionRequest](docs/KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionRequest.md)
 - [KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionResponse](docs/KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionResponse.md)
 - [KeyfactorApiModelsSecurityRolesRoleIdentitiesRequest](docs/KeyfactorApiModelsSecurityRolesRoleIdentitiesRequest.md)
 - [KeyfactorApiModelsSecurityRolesRoleIdentitiesResponse](docs/KeyfactorApiModelsSecurityRolesRoleIdentitiesResponse.md)
 - [KeyfactorApiModelsSecurityRolesSecurityRoleCopyRequest](docs/KeyfactorApiModelsSecurityRolesSecurityRoleCopyRequest.md)
 - [KeyfactorApiModelsSslCreateNetworkRequest](docs/KeyfactorApiModelsSslCreateNetworkRequest.md)
 - [KeyfactorApiModelsSslNetworkQueryResponse](docs/KeyfactorApiModelsSslNetworkQueryResponse.md)
 - [KeyfactorApiModelsSslNetworkResponse](docs/KeyfactorApiModelsSslNetworkResponse.md)
 - [KeyfactorApiModelsSslQuietHourRequest](docs/KeyfactorApiModelsSslQuietHourRequest.md)
 - [KeyfactorApiModelsSslQuietHourResponse](docs/KeyfactorApiModelsSslQuietHourResponse.md)
 - [KeyfactorApiModelsSslUpdateNetworkRequest](docs/KeyfactorApiModelsSslUpdateNetworkRequest.md)
 - [KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest](docs/KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest.md)
 - [KeyfactorApiModelsTemplatesGlobalTemplateDefaultResponse](docs/KeyfactorApiModelsTemplatesGlobalTemplateDefaultResponse.md)
 - [KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest](docs/KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest.md)
 - [KeyfactorApiModelsTemplatesGlobalTemplatePolicyResponse](docs/KeyfactorApiModelsTemplatesGlobalTemplatePolicyResponse.md)
 - [KeyfactorApiModelsTemplatesGlobalTemplateRegexRequest](docs/KeyfactorApiModelsTemplatesGlobalTemplateRegexRequest.md)
 - [KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse](docs/KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse.md)
 - [KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest](docs/KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest.md)
 - [KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse](docs/KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse.md)
 - [KeyfactorApiModelsTemplatesTemplateEnrollmentDefaultResponse](docs/KeyfactorApiModelsTemplatesTemplateEnrollmentDefaultResponse.md)
 - [KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse](docs/KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse.md)
 - [KeyfactorApiModelsTemplatesTemplateEnrollmentRegexResponse](docs/KeyfactorApiModelsTemplatesTemplateEnrollmentRegexResponse.md)
 - [KeyfactorApiModelsTemplatesTemplateEnrollmentSettingsResponse](docs/KeyfactorApiModelsTemplatesTemplateEnrollmentSettingsResponse.md)
 - [KeyfactorApiModelsTemplatesValidSubjectPartResponse](docs/KeyfactorApiModelsTemplatesValidSubjectPartResponse.md)
 - [KeyfactorApiModelsWorkflowsAvailableSignalResponse](docs/KeyfactorApiModelsWorkflowsAvailableSignalResponse.md)
 - [KeyfactorApiModelsWorkflowsAvailableStepQueryResponse](docs/KeyfactorApiModelsWorkflowsAvailableStepQueryResponse.md)
 - [KeyfactorApiModelsWorkflowsAvailableStepResponse](docs/KeyfactorApiModelsWorkflowsAvailableStepResponse.md)
 - [KeyfactorApiModelsWorkflowsConditionConfigurationRequest](docs/KeyfactorApiModelsWorkflowsConditionConfigurationRequest.md)
 - [KeyfactorApiModelsWorkflowsConditionConfigurationResponse](docs/KeyfactorApiModelsWorkflowsConditionConfigurationResponse.md)
 - [KeyfactorApiModelsWorkflowsDefinitionCreateRequest](docs/KeyfactorApiModelsWorkflowsDefinitionCreateRequest.md)
 - [KeyfactorApiModelsWorkflowsDefinitionQueryResponse](docs/KeyfactorApiModelsWorkflowsDefinitionQueryResponse.md)
 - [KeyfactorApiModelsWorkflowsDefinitionResponse](docs/KeyfactorApiModelsWorkflowsDefinitionResponse.md)
 - [KeyfactorApiModelsWorkflowsDefinitionStepRequest](docs/KeyfactorApiModelsWorkflowsDefinitionStepRequest.md)
 - [KeyfactorApiModelsWorkflowsDefinitionStepResponse](docs/KeyfactorApiModelsWorkflowsDefinitionStepResponse.md)
 - [KeyfactorApiModelsWorkflowsDefinitionStepSignalResponse](docs/KeyfactorApiModelsWorkflowsDefinitionStepSignalResponse.md)
 - [KeyfactorApiModelsWorkflowsDefinitionUpdateRequest](docs/KeyfactorApiModelsWorkflowsDefinitionUpdateRequest.md)
 - [KeyfactorApiModelsWorkflowsInstanceDefinitionResponse](docs/KeyfactorApiModelsWorkflowsInstanceDefinitionResponse.md)
 - [KeyfactorApiModelsWorkflowsInstanceQueryResponse](docs/KeyfactorApiModelsWorkflowsInstanceQueryResponse.md)
 - [KeyfactorApiModelsWorkflowsInstanceResponse](docs/KeyfactorApiModelsWorkflowsInstanceResponse.md)
 - [KeyfactorApiModelsWorkflowsParameterDefinitionResponse](docs/KeyfactorApiModelsWorkflowsParameterDefinitionResponse.md)
 - [KeyfactorApiModelsWorkflowsSignalConfigurationRequest](docs/KeyfactorApiModelsWorkflowsSignalConfigurationRequest.md)
 - [KeyfactorApiModelsWorkflowsSignalDefinitionResponse](docs/KeyfactorApiModelsWorkflowsSignalDefinitionResponse.md)
 - [KeyfactorApiModelsWorkflowsSignalRequest](docs/KeyfactorApiModelsWorkflowsSignalRequest.md)
 - [KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse](docs/KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse.md)
 - [KeyfactorApiPAMProviderTypeCreateRequest](docs/KeyfactorApiPAMProviderTypeCreateRequest.md)
 - [KeyfactorApiPAMProviderTypeParameterCreateRequest](docs/KeyfactorApiPAMProviderTypeParameterCreateRequest.md)
 - [KeyfactorApiPAMProviderTypeParameterResponse](docs/KeyfactorApiPAMProviderTypeParameterResponse.md)
 - [KeyfactorApiPAMProviderTypeResponse](docs/KeyfactorApiPAMProviderTypeResponse.md)
 - [KeyfactorAuditingQueryingAuditLogEntry](docs/KeyfactorAuditingQueryingAuditLogEntry.md)
 - [KeyfactorCommonSchedulingKeyfactorSchedule](docs/KeyfactorCommonSchedulingKeyfactorSchedule.md)
 - [KeyfactorCommonSchedulingModelsIntervalModel](docs/KeyfactorCommonSchedulingModelsIntervalModel.md)
 - [KeyfactorCommonSchedulingModelsMonthlyModel](docs/KeyfactorCommonSchedulingModelsMonthlyModel.md)
 - [KeyfactorCommonSchedulingModelsTimeModel](docs/KeyfactorCommonSchedulingModelsTimeModel.md)
 - [KeyfactorCommonSchedulingModelsWeeklyModel](docs/KeyfactorCommonSchedulingModelsWeeklyModel.md)
 - [ModelsAgentsAgentPool](docs/ModelsAgentsAgentPool.md)
 - [ModelsAgentsAgentPoolAgent](docs/ModelsAgentsAgentPoolAgent.md)
 - [ModelsCRLRequestModel](docs/ModelsCRLRequestModel.md)
 - [ModelsCSRContents](docs/ModelsCSRContents.md)
 - [ModelsCSRGenerationResponseModel](docs/ModelsCSRGenerationResponseModel.md)
 - [ModelsCertStoreLocationsCertificateLocationsGroup](docs/ModelsCertStoreLocationsCertificateLocationsGroup.md)
 - [ModelsCertStoreLocationsCertificateStoreLocationsDetail](docs/ModelsCertStoreLocationsCertificateStoreLocationsDetail.md)
 - [ModelsCertStoreNewPasswordRequest](docs/ModelsCertStoreNewPasswordRequest.md)
 - [ModelsCertStoreTypePasswordOptions](docs/ModelsCertStoreTypePasswordOptions.md)
 - [ModelsCertStoreTypeSupportedOperations](docs/ModelsCertStoreTypeSupportedOperations.md)
 - [ModelsCertStoresSchedule](docs/ModelsCertStoresSchedule.md)
 - [ModelsCertificateAuthoritiesCertificateAuthorityAuthCertificate](docs/ModelsCertificateAuthoritiesCertificateAuthorityAuthCertificate.md)
 - [ModelsCertificateAuthoritiesCertificateAuthorityRequest](docs/ModelsCertificateAuthoritiesCertificateAuthorityRequest.md)
 - [ModelsCertificateAuthoritiesCertificateAuthorityResponse](docs/ModelsCertificateAuthoritiesCertificateAuthorityResponse.md)
 - [ModelsCertificateDetails](docs/ModelsCertificateDetails.md)
 - [ModelsCertificateDownloadRequest](docs/ModelsCertificateDownloadRequest.md)
 - [ModelsCertificateDownloadResponse](docs/ModelsCertificateDownloadResponse.md)
 - [ModelsCertificateImportRequestModel](docs/ModelsCertificateImportRequestModel.md)
 - [ModelsCertificateImportResponseModel](docs/ModelsCertificateImportResponseModel.md)
 - [ModelsCertificateLocationSpecifier](docs/ModelsCertificateLocationSpecifier.md)
 - [ModelsCertificateQuery](docs/ModelsCertificateQuery.md)
 - [ModelsCertificateRecoveryRequest](docs/ModelsCertificateRecoveryRequest.md)
 - [ModelsCertificateRetrievalResponse](docs/ModelsCertificateRetrievalResponse.md)
 - [ModelsCertificateRetrievalResponseCRLDistributionPointModel](docs/ModelsCertificateRetrievalResponseCRLDistributionPointModel.md)
 - [ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel](docs/ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel.md)
 - [ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel](docs/ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel.md)
 - [ModelsCertificateRetrievalResponseDetailedKeyUsageModel](docs/ModelsCertificateRetrievalResponseDetailedKeyUsageModel.md)
 - [ModelsCertificateRetrievalResponseExtendedKeyUsageModel](docs/ModelsCertificateRetrievalResponseExtendedKeyUsageModel.md)
 - [ModelsCertificateRetrievalResponseLocationCountModel](docs/ModelsCertificateRetrievalResponseLocationCountModel.md)
 - [ModelsCertificateRetrievalResponseSubjectAlternativeNameModel](docs/ModelsCertificateRetrievalResponseSubjectAlternativeNameModel.md)
 - [ModelsCertificateStore](docs/ModelsCertificateStore.md)
 - [ModelsCertificateStoreContainerListResponse](docs/ModelsCertificateStoreContainerListResponse.md)
 - [ModelsCertificateStoreCreateServerRequest](docs/ModelsCertificateStoreCreateServerRequest.md)
 - [ModelsCertificateStoreEntry](docs/ModelsCertificateStoreEntry.md)
 - [ModelsCertificateStoreInventory](docs/ModelsCertificateStoreInventory.md)
 - [ModelsCertificateStoreInventoryCertificates](docs/ModelsCertificateStoreInventoryCertificates.md)
 - [ModelsCertificateStoreServerResponse](docs/ModelsCertificateStoreServerResponse.md)
 - [ModelsCertificateStoreTypeProperty](docs/ModelsCertificateStoreTypeProperty.md)
 - [ModelsCertificateStoreTypesCertificateStoreTypeEntryParameter](docs/ModelsCertificateStoreTypesCertificateStoreTypeEntryParameter.md)
 - [ModelsCertificateStoreUpdateServerRequest](docs/ModelsCertificateStoreUpdateServerRequest.md)
 - [ModelsCertificateStoresCertificateStoreCreateRequest](docs/ModelsCertificateStoresCertificateStoreCreateRequest.md)
 - [ModelsCertificateStoresCertificateStoreUpdateRequest](docs/ModelsCertificateStoresCertificateStoreUpdateRequest.md)
 - [ModelsCertificateValidationResponse](docs/ModelsCertificateValidationResponse.md)
 - [ModelsCollectionRolePermissions](docs/ModelsCollectionRolePermissions.md)
 - [ModelsContainerAssignment](docs/ModelsContainerAssignment.md)
 - [ModelsCustomReport](docs/ModelsCustomReport.md)
 - [ModelsCustomReportCreationRequest](docs/ModelsCustomReportCreationRequest.md)
 - [ModelsCustomReportUpdateRequest](docs/ModelsCustomReportUpdateRequest.md)
 - [ModelsDiscoveryJobRequest](docs/ModelsDiscoveryJobRequest.md)
 - [ModelsEnrollmentAvailableRenewal](docs/ModelsEnrollmentAvailableRenewal.md)
 - [ModelsEnrollmentCSREnrollmentRequest](docs/ModelsEnrollmentCSREnrollmentRequest.md)
 - [ModelsEnrollmentCSREnrollmentResponse](docs/ModelsEnrollmentCSREnrollmentResponse.md)
 - [ModelsEnrollmentCSRGenerationRequest](docs/ModelsEnrollmentCSRGenerationRequest.md)
 - [ModelsEnrollmentExistingEnrollmentManagementRequest](docs/ModelsEnrollmentExistingEnrollmentManagementRequest.md)
 - [ModelsEnrollmentManagementStoreType](docs/ModelsEnrollmentManagementStoreType.md)
 - [ModelsEnrollmentPFXEnrollmentRequest](docs/ModelsEnrollmentPFXEnrollmentRequest.md)
 - [ModelsEnrollmentPFXEnrollmentResponse](docs/ModelsEnrollmentPFXEnrollmentResponse.md)
 - [ModelsEnrollmentRenewalRequest](docs/ModelsEnrollmentRenewalRequest.md)
 - [ModelsEnrollmentRenewalResponse](docs/ModelsEnrollmentRenewalResponse.md)
 - [ModelsExtendedKeyUsage](docs/ModelsExtendedKeyUsage.md)
 - [ModelsInvalidKeystore](docs/ModelsInvalidKeystore.md)
 - [ModelsKeyfactorAPISecret](docs/ModelsKeyfactorAPISecret.md)
 - [ModelsMetadataAllUpdateRequest](docs/ModelsMetadataAllUpdateRequest.md)
 - [ModelsMetadataFieldTypeModel](docs/ModelsMetadataFieldTypeModel.md)
 - [ModelsMetadataSingleUpdateRequest](docs/ModelsMetadataSingleUpdateRequest.md)
 - [ModelsMetadataUpdateRequest](docs/ModelsMetadataUpdateRequest.md)
 - [ModelsMonitoringRevocationMonitoringAlertResponse](docs/ModelsMonitoringRevocationMonitoringAlertResponse.md)
 - [ModelsOrchestratorJobsBulkOrchestratorJobPair](docs/ModelsOrchestratorJobsBulkOrchestratorJobPair.md)
 - [ModelsOrchestratorJobsJob](docs/ModelsOrchestratorJobsJob.md)
 - [ModelsOrchestratorJobsJobTypeCreateRequest](docs/ModelsOrchestratorJobsJobTypeCreateRequest.md)
 - [ModelsOrchestratorJobsJobTypeFieldRequest](docs/ModelsOrchestratorJobsJobTypeFieldRequest.md)
 - [ModelsOrchestratorJobsJobTypeUpdateRequest](docs/ModelsOrchestratorJobsJobTypeUpdateRequest.md)
 - [ModelsOrchestratorJobsScheduleBulkJobRequest](docs/ModelsOrchestratorJobsScheduleBulkJobRequest.md)
 - [ModelsOrchestratorJobsScheduleJobRequest](docs/ModelsOrchestratorJobsScheduleJobRequest.md)
 - [ModelsPKICertificateOperation](docs/ModelsPKICertificateOperation.md)
 - [ModelsPagedQuery](docs/ModelsPagedQuery.md)
 - [ModelsPendingCSRResponse](docs/ModelsPendingCSRResponse.md)
 - [ModelsPkcs10CertificateResponse](docs/ModelsPkcs10CertificateResponse.md)
 - [ModelsPkcs12CertificateResponse](docs/ModelsPkcs12CertificateResponse.md)
 - [ModelsQueryModelsPagedAgentBlueprintJobsQuery](docs/ModelsQueryModelsPagedAgentBlueprintJobsQuery.md)
 - [ModelsQueryModelsPagedAgentBlueprintQuery](docs/ModelsQueryModelsPagedAgentBlueprintQuery.md)
 - [ModelsQueryModelsPagedAgentBlueprintStoresQuery](docs/ModelsQueryModelsPagedAgentBlueprintStoresQuery.md)
 - [ModelsQueryModelsPagedAgentJobHistoryQuery](docs/ModelsQueryModelsPagedAgentJobHistoryQuery.md)
 - [ModelsQueryModelsPagedAgentJobQuery](docs/ModelsQueryModelsPagedAgentJobQuery.md)
 - [ModelsQueryModelsPagedAgentPoolAgentsQuery](docs/ModelsQueryModelsPagedAgentPoolAgentsQuery.md)
 - [ModelsQueryModelsPagedAgentPoolQuery](docs/ModelsQueryModelsPagedAgentPoolQuery.md)
 - [ModelsQueryModelsPagedAgentQuery](docs/ModelsQueryModelsPagedAgentQuery.md)
 - [ModelsQueryModelsPagedAuditLogQuery](docs/ModelsQueryModelsPagedAuditLogQuery.md)
 - [ModelsQueryModelsPagedCertificateAuthorityQuery](docs/ModelsQueryModelsPagedCertificateAuthorityQuery.md)
 - [ModelsQueryModelsPagedCertificateHistoryQuery](docs/ModelsQueryModelsPagedCertificateHistoryQuery.md)
 - [ModelsQueryModelsPagedCertificateRequestQuery](docs/ModelsQueryModelsPagedCertificateRequestQuery.md)
 - [ModelsQueryModelsPagedCertificateStoreContainerQuery](docs/ModelsQueryModelsPagedCertificateStoreContainerQuery.md)
 - [ModelsQueryModelsPagedCertificateStoreInventoryQuery](docs/ModelsQueryModelsPagedCertificateStoreInventoryQuery.md)
 - [ModelsQueryModelsPagedCertificateStoreQuery](docs/ModelsQueryModelsPagedCertificateStoreQuery.md)
 - [ModelsQueryModelsPagedCertificateStoreServerQuery](docs/ModelsQueryModelsPagedCertificateStoreServerQuery.md)
 - [ModelsQueryModelsPagedCustomReportQuery](docs/ModelsQueryModelsPagedCustomReportQuery.md)
 - [ModelsQueryModelsPagedDeniedAlertQuery](docs/ModelsQueryModelsPagedDeniedAlertQuery.md)
 - [ModelsQueryModelsPagedExpirationAlertQuery](docs/ModelsQueryModelsPagedExpirationAlertQuery.md)
 - [ModelsQueryModelsPagedIssuedAlertQuery](docs/ModelsQueryModelsPagedIssuedAlertQuery.md)
 - [ModelsQueryModelsPagedKeyRotationAlertQuery](docs/ModelsQueryModelsPagedKeyRotationAlertQuery.md)
 - [ModelsQueryModelsPagedLegacyDeniedRequestQuery](docs/ModelsQueryModelsPagedLegacyDeniedRequestQuery.md)
 - [ModelsQueryModelsPagedMetadataFieldQuery](docs/ModelsQueryModelsPagedMetadataFieldQuery.md)
 - [ModelsQueryModelsPagedPendingAlertQuery](docs/ModelsQueryModelsPagedPendingAlertQuery.md)
 - [ModelsQueryModelsPagedPendingCSRQuery](docs/ModelsQueryModelsPagedPendingCSRQuery.md)
 - [ModelsQueryModelsPagedReportQuery](docs/ModelsQueryModelsPagedReportQuery.md)
 - [ModelsQueryModelsPagedReportScheduleQuery](docs/ModelsQueryModelsPagedReportScheduleQuery.md)
 - [ModelsQueryModelsPagedRevocationMonitoringQuery](docs/ModelsQueryModelsPagedRevocationMonitoringQuery.md)
 - [ModelsQueryModelsPagedSSHLogonQuery](docs/ModelsQueryModelsPagedSSHLogonQuery.md)
 - [ModelsQueryModelsPagedSSHServerGroupQuery](docs/ModelsQueryModelsPagedSSHServerGroupQuery.md)
 - [ModelsQueryModelsPagedSSHServerQuery](docs/ModelsQueryModelsPagedSSHServerQuery.md)
 - [ModelsQueryModelsPagedSSHServiceAccountQuery](docs/ModelsQueryModelsPagedSSHServiceAccountQuery.md)
 - [ModelsQueryModelsPagedSSHUnmanagedKeyQuery](docs/ModelsQueryModelsPagedSSHUnmanagedKeyQuery.md)
 - [ModelsQueryModelsPagedSSHUserQuery](docs/ModelsQueryModelsPagedSSHUserQuery.md)
 - [ModelsQueryModelsPagedScanJobPartsQuery](docs/ModelsQueryModelsPagedScanJobPartsQuery.md)
 - [ModelsQueryModelsPagedSecurityIdentityQuery](docs/ModelsQueryModelsPagedSecurityIdentityQuery.md)
 - [ModelsQueryModelsPagedSecurityRoleQuery](docs/ModelsQueryModelsPagedSecurityRoleQuery.md)
 - [ModelsQueryModelsPagedSslResultQuery](docs/ModelsQueryModelsPagedSslResultQuery.md)
 - [ModelsQueryModelsPagedTemplateQuery](docs/ModelsQueryModelsPagedTemplateQuery.md)
 - [ModelsQueryModelsWorkflowWorkflowDefinitionQuery](docs/ModelsQueryModelsWorkflowWorkflowDefinitionQuery.md)
 - [ModelsQueryModelsWorkflowWorkflowInstanceQuery](docs/ModelsQueryModelsWorkflowWorkflowInstanceQuery.md)
 - [ModelsQueryModelsWorkflowWorkflowStepSchemaQuery](docs/ModelsQueryModelsWorkflowWorkflowStepSchemaQuery.md)
 - [ModelsQueryModelsWorkflowWorkflowTypeQuery](docs/ModelsQueryModelsWorkflowWorkflowTypeQuery.md)
 - [ModelsRecoveryResponse](docs/ModelsRecoveryResponse.md)
 - [ModelsReenrollmentStatus](docs/ModelsReenrollmentStatus.md)
 - [ModelsReport](docs/ModelsReport.md)
 - [ModelsReportParameters](docs/ModelsReportParameters.md)
 - [ModelsReportParametersRequest](docs/ModelsReportParametersRequest.md)
 - [ModelsReportRequestModel](docs/ModelsReportRequestModel.md)
 - [ModelsReportSchedule](docs/ModelsReportSchedule.md)
 - [ModelsRevocationRevocationResponse](docs/ModelsRevocationRevocationResponse.md)
 - [ModelsRevocationSuspendedRevocationResponse](docs/ModelsRevocationSuspendedRevocationResponse.md)
 - [ModelsRevokeAllCertificatesRequest](docs/ModelsRevokeAllCertificatesRequest.md)
 - [ModelsRevokeCertificateRequest](docs/ModelsRevokeCertificateRequest.md)
 - [ModelsSSHAccessLogonUserAccessRequest](docs/ModelsSSHAccessLogonUserAccessRequest.md)
 - [ModelsSSHAccessLogonUserAccessResponse](docs/ModelsSSHAccessLogonUserAccessResponse.md)
 - [ModelsSSHAccessServerAccessRequest](docs/ModelsSSHAccessServerAccessRequest.md)
 - [ModelsSSHAccessServerAccessResponse](docs/ModelsSSHAccessServerAccessResponse.md)
 - [ModelsSSHAccessServerGroupAccessRequest](docs/ModelsSSHAccessServerGroupAccessRequest.md)
 - [ModelsSSHAccessServerGroupAccessResponse](docs/ModelsSSHAccessServerGroupAccessResponse.md)
 - [ModelsSSHKeysKeyGenerationRequest](docs/ModelsSSHKeysKeyGenerationRequest.md)
 - [ModelsSSHKeysKeyResponse](docs/ModelsSSHKeysKeyResponse.md)
 - [ModelsSSHKeysKeyUpdateRequest](docs/ModelsSSHKeysKeyUpdateRequest.md)
 - [ModelsSSHKeysUnmanagedKeyResponse](docs/ModelsSSHKeysUnmanagedKeyResponse.md)
 - [ModelsSSHLogonsLogonAccessRequest](docs/ModelsSSHLogonsLogonAccessRequest.md)
 - [ModelsSSHLogonsLogonCreationRequest](docs/ModelsSSHLogonsLogonCreationRequest.md)
 - [ModelsSSHLogonsLogonQueryResponse](docs/ModelsSSHLogonsLogonQueryResponse.md)
 - [ModelsSSHLogonsLogonResponse](docs/ModelsSSHLogonsLogonResponse.md)
 - [ModelsSSHServerGroupsServerGroupCreationRequest](docs/ModelsSSHServerGroupsServerGroupCreationRequest.md)
 - [ModelsSSHServerGroupsServerGroupResponse](docs/ModelsSSHServerGroupsServerGroupResponse.md)
 - [ModelsSSHServerGroupsServerGroupUpdateRequest](docs/ModelsSSHServerGroupsServerGroupUpdateRequest.md)
 - [ModelsSSHServersServerCreationRequest](docs/ModelsSSHServersServerCreationRequest.md)
 - [ModelsSSHServersServerResponse](docs/ModelsSSHServersServerResponse.md)
 - [ModelsSSHServersServerUpdateRequest](docs/ModelsSSHServersServerUpdateRequest.md)
 - [ModelsSSHServiceAccountsServiceAccountCreationRequest](docs/ModelsSSHServiceAccountsServiceAccountCreationRequest.md)
 - [ModelsSSHServiceAccountsServiceAccountResponse](docs/ModelsSSHServiceAccountsServiceAccountResponse.md)
 - [ModelsSSHServiceAccountsServiceAccountUpdateRequest](docs/ModelsSSHServiceAccountsServiceAccountUpdateRequest.md)
 - [ModelsSSHServiceAccountsServiceAccountUserCreationRequest](docs/ModelsSSHServiceAccountsServiceAccountUserCreationRequest.md)
 - [ModelsSSHUsersSshUserAccessResponse](docs/ModelsSSHUsersSshUserAccessResponse.md)
 - [ModelsSSHUsersSshUserCreationRequest](docs/ModelsSSHUsersSshUserCreationRequest.md)
 - [ModelsSSHUsersSshUserResponse](docs/ModelsSSHUsersSshUserResponse.md)
 - [ModelsSSHUsersSshUserUpdateRequest](docs/ModelsSSHUsersSshUserUpdateRequest.md)
 - [ModelsSSLDisplayScanJobPart](docs/ModelsSSLDisplayScanJobPart.md)
 - [ModelsSSLEndpoint](docs/ModelsSSLEndpoint.md)
 - [ModelsSSLEndpointHistoryResponse](docs/ModelsSSLEndpointHistoryResponse.md)
 - [ModelsSSLEndpointHistoryResponseCertificateModel](docs/ModelsSSLEndpointHistoryResponseCertificateModel.md)
 - [ModelsSSLEndpointStatusRequest](docs/ModelsSSLEndpointStatusRequest.md)
 - [ModelsSSLImmediateSslScanRequest](docs/ModelsSSLImmediateSslScanRequest.md)
 - [ModelsSSLNetworkDefinition](docs/ModelsSSLNetworkDefinition.md)
 - [ModelsSSLNetworkRangesRequest](docs/ModelsSSLNetworkRangesRequest.md)
 - [ModelsSSLScanJobPart](docs/ModelsSSLScanJobPart.md)
 - [ModelsSSLScanJobPartDefinition](docs/ModelsSSLScanJobPartDefinition.md)
 - [ModelsSSLSslScanResult](docs/ModelsSSLSslScanResult.md)
 - [ModelsSecurityCertificatePermissions](docs/ModelsSecurityCertificatePermissions.md)
 - [ModelsSecurityIdentitiesPermissionRolesPairResponse](docs/ModelsSecurityIdentitiesPermissionRolesPairResponse.md)
 - [ModelsSecurityIdentitiesSecurityIdentityIdentifier](docs/ModelsSecurityIdentitiesSecurityIdentityIdentifier.md)
 - [ModelsSecurityIdentitiesSecurityIdentityLookupResponse](docs/ModelsSecurityIdentitiesSecurityIdentityLookupResponse.md)
 - [ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse](docs/ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse.md)
 - [ModelsSecurityIdentitiesSecurityIdentityRequest](docs/ModelsSecurityIdentitiesSecurityIdentityRequest.md)
 - [ModelsSecuritySecurityRolesSecurityRoleCreationRequest](docs/ModelsSecuritySecurityRolesSecurityRoleCreationRequest.md)
 - [ModelsSecuritySecurityRolesSecurityRoleResponseBase](docs/ModelsSecuritySecurityRolesSecurityRoleResponseBase.md)
 - [ModelsSecuritySecurityRolesSecurityRoleUpdateRequest](docs/ModelsSecuritySecurityRolesSecurityRoleUpdateRequest.md)
 - [ModelsSubjectAlternativeName](docs/ModelsSubjectAlternativeName.md)
 - [ModelsTemplateCollectionRetrievalResponse](docs/ModelsTemplateCollectionRetrievalResponse.md)
 - [ModelsTemplateCollectionRetrievalResponseExtendedKeyUsageModel](docs/ModelsTemplateCollectionRetrievalResponseExtendedKeyUsageModel.md)
 - [ModelsTemplateCollectionRetrievalResponseTemplateEnrollmentFieldModel](docs/ModelsTemplateCollectionRetrievalResponseTemplateEnrollmentFieldModel.md)
 - [ModelsTemplateCollectionRetrievalResponseTemplateRegexModel](docs/ModelsTemplateCollectionRetrievalResponseTemplateRegexModel.md)
 - [ModelsTemplateEnrollmentField](docs/ModelsTemplateEnrollmentField.md)
 - [ModelsTemplateMetadataField](docs/ModelsTemplateMetadataField.md)
 - [ModelsTemplateRegex](docs/ModelsTemplateRegex.md)
 - [ModelsTemplateRetrievalResponse](docs/ModelsTemplateRetrievalResponse.md)
 - [ModelsTemplateRetrievalResponseExtendedKeyUsageModel](docs/ModelsTemplateRetrievalResponseExtendedKeyUsageModel.md)
 - [ModelsTemplateRetrievalResponseTemplateDefaultModel](docs/ModelsTemplateRetrievalResponseTemplateDefaultModel.md)
 - [ModelsTemplateRetrievalResponseTemplateEnrollmentFieldModel](docs/ModelsTemplateRetrievalResponseTemplateEnrollmentFieldModel.md)
 - [ModelsTemplateRetrievalResponseTemplateMetadataFieldModel](docs/ModelsTemplateRetrievalResponseTemplateMetadataFieldModel.md)
 - [ModelsTemplateRetrievalResponseTemplatePolicyModel](docs/ModelsTemplateRetrievalResponseTemplatePolicyModel.md)
 - [ModelsTemplateRetrievalResponseTemplateRegexModel](docs/ModelsTemplateRetrievalResponseTemplateRegexModel.md)
 - [ModelsTemplateUpdateRequest](docs/ModelsTemplateUpdateRequest.md)
 - [ModelsTemplateUpdateRequestTemplateDefaultModel](docs/ModelsTemplateUpdateRequestTemplateDefaultModel.md)
 - [ModelsTemplateUpdateRequestTemplateEnrollmentFieldModel](docs/ModelsTemplateUpdateRequestTemplateEnrollmentFieldModel.md)
 - [ModelsTemplateUpdateRequestTemplateMetadataFieldModel](docs/ModelsTemplateUpdateRequestTemplateMetadataFieldModel.md)
 - [ModelsTemplateUpdateRequestTemplatePolicyModel](docs/ModelsTemplateUpdateRequestTemplatePolicyModel.md)
 - [ModelsTemplateUpdateRequestTemplateRegexModel](docs/ModelsTemplateUpdateRequestTemplateRegexModel.md)
 - [ModelsWorkflowApproveDenyResult](docs/ModelsWorkflowApproveDenyResult.md)
 - [ModelsWorkflowCertificateRequestCertStoreModel](docs/ModelsWorkflowCertificateRequestCertStoreModel.md)
 - [ModelsWorkflowCertificateRequestDetailsModel](docs/ModelsWorkflowCertificateRequestDetailsModel.md)
 - [ModelsWorkflowCertificateRequestModel](docs/ModelsWorkflowCertificateRequestModel.md)
 - [ModelsWorkflowDenialRequest](docs/ModelsWorkflowDenialRequest.md)
 - [ModelsWorkflowProcessedCertificateRequest](docs/ModelsWorkflowProcessedCertificateRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


Keyfactor-v1
- API version: v1

This reference serves to document REST-based methods to manage and integrate with Keyfactor. In addition, an embedded interface allows for the execution of calls against the current Keyfactor API instance.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

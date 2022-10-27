

# ModelsCertificateImportRequestModel

Class representing a request to import a certificate into Keyfactor Command

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**certificate** | **String** | Base64-encoded certificate contents |  |
|**password** | **String** | Optional password associated if required for a PFX |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Colleciton of metadata to be associated with the imported certificate |  [optional] |
|**storeIds** | **List&lt;UUID&gt;** | List of the Keyfactor certificate store identifiers (GUID) with which the imported certificate should be associated |  [optional] |
|**storeTypes** | [**List&lt;ModelsEnrollmentManagementStoreType&gt;**](ModelsEnrollmentManagementStoreType.md) | List of the certificate store types with with the imported certificate should be associated |  [optional] |
|**schedule** | **OffsetDateTime** | Schedule on which the certificate should be imported |  [optional] |
|**importMetadata** | **Boolean** | Whether or not we should validate and import the certificate&#39;s metadata. |  [optional] |




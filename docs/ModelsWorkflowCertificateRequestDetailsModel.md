

# ModelsWorkflowCertificateRequestDetailsModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**denialComment** | **String** |  |  [optional] |
|**keyLength** | **String** |  |  [optional] |
|**saNs** | **List&lt;String&gt;** |  |  [optional] |
|**certStores** | [**List&lt;ModelsWorkflowCertificateRequestCertStoreModel&gt;**](ModelsWorkflowCertificateRequestCertStoreModel.md) |  |  [optional] |
|**curve** | **String** |  |  [optional] |
|**id** | **Integer** |  |  [optional] |
|**caRequestId** | **String** |  |  [optional] |
|**commonName** | **String** |  |  [optional] |
|**distinguishedName** | **String** |  |  [optional] |
|**submissionDate** | **OffsetDateTime** |  |  [optional] |
|**certificateAuthority** | **String** |  |  [optional] |
|**template** | **String** |  |  [optional] |
|**requester** | **String** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**stateString** | **String** |  |  [optional] [readonly] |
|**metadata** | **Map&lt;String, String&gt;** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |




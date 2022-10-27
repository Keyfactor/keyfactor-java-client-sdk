

# ModelsCertificateRetrievalResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**thumbprint** | **byte[]** |  |  [optional] |
|**serialNumber** | **byte[]** |  |  [optional] |
|**issuedDN** | **String** |  |  [optional] |
|**issuedCN** | **String** |  |  [optional] |
|**importDate** | **OffsetDateTime** |  |  [optional] |
|**notBefore** | **OffsetDateTime** |  |  [optional] |
|**notAfter** | **OffsetDateTime** |  |  [optional] |
|**issuerDN** | **String** |  |  [optional] |
|**principalId** | **Integer** |  |  [optional] |
|**templateId** | **Integer** |  |  [optional] |
|**certState** | [**CertStateEnum**](#CertStateEnum) |  |  [optional] |
|**keySizeInBits** | **Integer** |  |  [optional] |
|**keyType** | [**KeyTypeEnum**](#KeyTypeEnum) |  |  [optional] |
|**requesterId** | **Integer** |  |  [optional] |
|**issuedOU** | **String** |  |  [optional] |
|**issuedEmail** | **String** |  |  [optional] |
|**keyUsage** | **Integer** |  |  [optional] |
|**signingAlgorithm** | **String** |  |  [optional] |
|**certStateString** | **String** |  |  [optional] |
|**keyTypeString** | **String** |  |  [optional] |
|**revocationEffDate** | **OffsetDateTime** |  |  [optional] |
|**revocationReason** | [**RevocationReasonEnum**](#RevocationReasonEnum) |  |  [optional] |
|**revocationComment** | **String** |  |  [optional] |
|**certificateAuthorityId** | **Integer** |  |  [optional] |
|**certificateAuthorityName** | **String** |  |  [optional] |
|**templateName** | **String** | Full template display name. |  [optional] |
|**archivedKey** | **Boolean** |  |  [optional] |
|**hasPrivateKey** | **Boolean** |  |  [optional] |
|**principalName** | **String** |  |  [optional] |
|**certRequestId** | **Integer** |  |  [optional] |
|**requesterName** | **String** |  |  [optional] |
|**contentBytes** | **byte[]** |  |  [optional] |
|**extendedKeyUsages** | [**List&lt;ModelsCertificateRetrievalResponseExtendedKeyUsageModel&gt;**](ModelsCertificateRetrievalResponseExtendedKeyUsageModel.md) |  |  [optional] |
|**subjectAltNameElements** | [**List&lt;ModelsCertificateRetrievalResponseSubjectAlternativeNameModel&gt;**](ModelsCertificateRetrievalResponseSubjectAlternativeNameModel.md) |  |  [optional] |
|**crLDistributionPoints** | [**List&lt;ModelsCertificateRetrievalResponseCRLDistributionPointModel&gt;**](ModelsCertificateRetrievalResponseCRLDistributionPointModel.md) |  |  [optional] |
|**locationsCount** | [**List&lt;ModelsCertificateRetrievalResponseLocationCountModel&gt;**](ModelsCertificateRetrievalResponseLocationCountModel.md) |  |  [optional] |
|**ssLLocations** | [**List&lt;ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel&gt;**](ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel.md) |  |  [optional] |
|**locations** | [**List&lt;ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel&gt;**](ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel.md) |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** |  |  [optional] |
|**certificateKeyId** | **Integer** |  |  [optional] |
|**caRowIndex** | **Long** |  |  [optional] [readonly] |
|**caRecordId** | **String** |  |  [optional] |
|**detailedKeyUsage** | [**ModelsCertificateRetrievalResponseDetailedKeyUsageModel**](ModelsCertificateRetrievalResponseDetailedKeyUsageModel.md) |  |  [optional] |
|**keyRecoverable** | **Boolean** |  |  [optional] |
|**curve** | **String** |  |  [optional] |



## Enum: CertStateEnum

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



## Enum: KeyTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



## Enum: RevocationReasonEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_8 | 8 |
| NUMBER_999 | 999 |
| NUMBER_MINUS_1 | -1 |




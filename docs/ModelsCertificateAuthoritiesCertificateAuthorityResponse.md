

# ModelsCertificateAuthoritiesCertificateAuthorityResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**logicalName** | **String** |  |  [optional] |
|**hostName** | **String** |  |  [optional] |
|**delegate** | **Boolean** |  |  [optional] |
|**delegateEnrollment** | **Boolean** |  |  [optional] |
|**forestRoot** | **String** |  |  [optional] [readonly] |
|**configurationTenant** | **String** |  |  [optional] |
|**remote** | **Boolean** |  |  [optional] |
|**agent** | **UUID** |  |  [optional] |
|**standalone** | **Boolean** |  |  [optional] |
|**monitorThresholds** | **Boolean** |  |  [optional] |
|**issuanceMax** | **Integer** |  |  [optional] |
|**issuanceMin** | **Integer** |  |  [optional] |
|**denialMax** | **Integer** |  |  [optional] |
|**failureMax** | **Integer** |  |  [optional] |
|**rfCEnforcement** | **Boolean** |  |  [optional] |
|**properties** | **String** |  |  [optional] |
|**allowedEnrollmentTypes** | [**AllowedEnrollmentTypesEnum**](#AllowedEnrollmentTypesEnum) |  |  [optional] |
|**keyRetention** | [**KeyRetentionEnum**](#KeyRetentionEnum) |  |  [optional] |
|**keyRetentionDays** | **Integer** |  |  [optional] |
|**explicitCredentials** | **Boolean** |  |  [optional] |
|**subscriberTerms** | **Boolean** |  |  [optional] |
|**explicitUser** | **String** |  |  [optional] |
|**explicitPassword** | [**ModelsKeyfactorAPISecret**](ModelsKeyfactorAPISecret.md) |  |  [optional] |
|**useAllowedRequesters** | **Boolean** |  |  [optional] |
|**allowedRequesters** | **List&lt;String&gt;** |  |  [optional] |
|**fullScan** | [**KeyfactorCommonSchedulingKeyfactorSchedule**](KeyfactorCommonSchedulingKeyfactorSchedule.md) |  |  [optional] |
|**incrementalScan** | [**KeyfactorCommonSchedulingKeyfactorSchedule**](KeyfactorCommonSchedulingKeyfactorSchedule.md) |  |  [optional] |
|**thresholdCheck** | [**KeyfactorCommonSchedulingKeyfactorSchedule**](KeyfactorCommonSchedulingKeyfactorSchedule.md) |  |  [optional] |
|**caType** | [**CaTypeEnum**](#CaTypeEnum) |  |  [optional] |
|**authCertificate** | [**ModelsCertificateAuthoritiesCertificateAuthorityAuthCertificate**](ModelsCertificateAuthoritiesCertificateAuthorityAuthCertificate.md) |  |  [optional] |
|**enforceUniqueDN** | **Boolean** |  |  [optional] |
|**lastScan** | **String** |  |  [optional] [readonly] |



## Enum: AllowedEnrollmentTypesEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_4 | 4 |



## Enum: KeyRetentionEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



## Enum: CaTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |




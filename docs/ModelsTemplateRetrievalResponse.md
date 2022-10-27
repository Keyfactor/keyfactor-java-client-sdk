

# ModelsTemplateRetrievalResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**commonName** | **String** |  |  [optional] |
|**templateName** | **String** |  |  [optional] |
|**oid** | **String** |  |  [optional] |
|**keySize** | **String** |  |  [optional] |
|**keyType** | **String** |  |  [optional] |
|**forestRoot** | **String** |  |  [optional] [readonly] |
|**configurationTenant** | **String** |  |  [optional] |
|**friendlyName** | **String** |  |  [optional] |
|**keyRetention** | [**KeyRetentionEnum**](#KeyRetentionEnum) |  |  [optional] |
|**keyRetentionDays** | **Integer** |  |  [optional] |
|**keyArchival** | **Boolean** |  |  [optional] |
|**enrollmentFields** | [**List&lt;ModelsTemplateRetrievalResponseTemplateEnrollmentFieldModel&gt;**](ModelsTemplateRetrievalResponseTemplateEnrollmentFieldModel.md) |  |  [optional] |
|**metadataFields** | [**List&lt;ModelsTemplateRetrievalResponseTemplateMetadataFieldModel&gt;**](ModelsTemplateRetrievalResponseTemplateMetadataFieldModel.md) |  |  [optional] |
|**allowedEnrollmentTypes** | [**AllowedEnrollmentTypesEnum**](#AllowedEnrollmentTypesEnum) |  |  [optional] |
|**templateRegexes** | [**List&lt;ModelsTemplateRetrievalResponseTemplateRegexModel&gt;**](ModelsTemplateRetrievalResponseTemplateRegexModel.md) |  |  [optional] |
|**templateDefaults** | [**List&lt;ModelsTemplateRetrievalResponseTemplateDefaultModel&gt;**](ModelsTemplateRetrievalResponseTemplateDefaultModel.md) |  |  [optional] |
|**templatePolicy** | [**ModelsTemplateRetrievalResponseTemplatePolicyModel**](ModelsTemplateRetrievalResponseTemplatePolicyModel.md) |  |  [optional] |
|**useAllowedRequesters** | **Boolean** |  |  [optional] |
|**allowedRequesters** | **List&lt;String&gt;** |  |  [optional] |
|**displayName** | **String** |  |  [optional] |
|**rfCEnforcement** | **Boolean** |  |  [optional] |
|**requiresApproval** | **Boolean** |  |  [optional] |
|**keyUsage** | **Integer** |  |  [optional] |
|**extendedKeyUsages** | [**List&lt;ModelsTemplateRetrievalResponseExtendedKeyUsageModel&gt;**](ModelsTemplateRetrievalResponseExtendedKeyUsageModel.md) |  |  [optional] |
|**curve** | **String** |  |  [optional] |



## Enum: KeyRetentionEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



## Enum: AllowedEnrollmentTypesEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_4 | 4 |




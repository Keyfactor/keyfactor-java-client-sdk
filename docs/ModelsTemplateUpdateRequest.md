

# ModelsTemplateUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**keySize** | **String** |  |  [optional] |
|**keyType** | **String** |  |  [optional] |
|**friendlyName** | **String** |  |  [optional] |
|**keyRetention** | [**KeyRetentionEnum**](#KeyRetentionEnum) |  |  [optional] |
|**keyRetentionDays** | **Integer** |  |  [optional] |
|**keyArchival** | **Boolean** |  |  [optional] |
|**enrollmentFields** | [**List&lt;ModelsTemplateUpdateRequestTemplateEnrollmentFieldModel&gt;**](ModelsTemplateUpdateRequestTemplateEnrollmentFieldModel.md) |  |  [optional] |
|**metadataFields** | [**List&lt;ModelsTemplateUpdateRequestTemplateMetadataFieldModel&gt;**](ModelsTemplateUpdateRequestTemplateMetadataFieldModel.md) |  |  [optional] |
|**allowedEnrollmentTypes** | [**AllowedEnrollmentTypesEnum**](#AllowedEnrollmentTypesEnum) |  |  [optional] |
|**templateRegexes** | [**List&lt;ModelsTemplateUpdateRequestTemplateRegexModel&gt;**](ModelsTemplateUpdateRequestTemplateRegexModel.md) |  |  [optional] |
|**templateDefaults** | [**List&lt;ModelsTemplateUpdateRequestTemplateDefaultModel&gt;**](ModelsTemplateUpdateRequestTemplateDefaultModel.md) |  |  [optional] |
|**templatePolicy** | [**ModelsTemplateUpdateRequestTemplatePolicyModel**](ModelsTemplateUpdateRequestTemplatePolicyModel.md) |  |  [optional] |
|**useAllowedRequesters** | **Boolean** |  |  [optional] |
|**allowedRequesters** | **List&lt;String&gt;** |  |  [optional] |
|**requiresApproval** | **Boolean** |  |  [optional] |
|**keyUsage** | **Integer** |  |  [optional] |



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




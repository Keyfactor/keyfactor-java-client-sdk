

# KeyfactorApiModelsWorkflowsInstanceResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**currentStepId** | **UUID** |  |  [optional] |
|**statusMessage** | **String** |  |  [optional] |
|**signals** | [**List&lt;KeyfactorApiModelsWorkflowsAvailableSignalResponse&gt;**](KeyfactorApiModelsWorkflowsAvailableSignalResponse.md) |  |  [optional] |
|**definition** | [**KeyfactorApiModelsWorkflowsInstanceDefinitionResponse**](KeyfactorApiModelsWorkflowsInstanceDefinitionResponse.md) |  |  [optional] |
|**currentStepDisplayName** | **String** |  |  [optional] |
|**currentStepUniqueName** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**lastModified** | **OffsetDateTime** |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**initialData** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**currentStateData** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**referenceId** | **Long** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |




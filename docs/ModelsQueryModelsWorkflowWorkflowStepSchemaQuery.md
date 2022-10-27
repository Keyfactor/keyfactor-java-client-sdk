

# ModelsQueryModelsWorkflowWorkflowStepSchemaQuery


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**queryString** | **String** | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2) |  [optional] |
|**pageReturned** | **Integer** | The current page within the result set to be returned |  [optional] |
|**returnLimit** | **Integer** | Maximum number of records to be returned in a single call |  [optional] |
|**sortField** | **String** | Field by which the results should be sorted (view results via Management Portal for sortable columns) |  [optional] |
|**sortAscending** | [**SortAscendingEnum**](#SortAscendingEnum) | Field sort direction [0&#x3D;ascending, 1&#x3D;descending] |  [optional] |



## Enum: SortAscendingEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |




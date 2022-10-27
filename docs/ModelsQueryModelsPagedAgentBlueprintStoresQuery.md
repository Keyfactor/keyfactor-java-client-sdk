

# ModelsQueryModelsPagedAgentBlueprintStoresQuery


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pageReturned** | **Integer** | The current page within the result set to be returned |  [optional] |
|**skipCount** | **Integer** | Number of records to be skipped before inclusion in the result set |  [optional] [readonly] |
|**returnLimit** | **Integer** | Maximum number of records to be returned in a single call |  [optional] |
|**sortField** | **String** | Field by which the results should be sorted (OperationStart, OperationEnd, UserName) |  [optional] |
|**sortAscending** | [**SortAscendingEnum**](#SortAscendingEnum) | Field sort direction [0&#x3D;ascending, 1&#x3D;descending] |  [optional] |



## Enum: SortAscendingEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |




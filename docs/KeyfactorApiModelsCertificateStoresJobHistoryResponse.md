

# KeyfactorApiModelsCertificateStoresJobHistoryResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobHistoryId** | **Long** |  |  [optional] |
|**agentMachine** | **String** |  |  [optional] |
|**jobId** | **UUID** |  |  [optional] |
|**schedule** | [**KeyfactorCommonSchedulingKeyfactorSchedule**](KeyfactorCommonSchedulingKeyfactorSchedule.md) |  |  [optional] |
|**jobType** | **String** |  |  [optional] |
|**operationStart** | **OffsetDateTime** |  |  [optional] |
|**operationEnd** | **OffsetDateTime** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**result** | [**ResultEnum**](#ResultEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**storePath** | **String** |  |  [optional] |
|**clientMachine** | **String** |  |  [optional] |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |




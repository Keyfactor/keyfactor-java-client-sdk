

# KeyfactorApiModelsSslNetworkQueryResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**networkId** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**agentPoolName** | **String** |  |  [optional] |
|**agentPoolId** | **UUID** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**discoverSchedule** | [**KeyfactorCommonSchedulingKeyfactorSchedule**](KeyfactorCommonSchedulingKeyfactorSchedule.md) |  |  [optional] |
|**monitorSchedule** | [**KeyfactorCommonSchedulingKeyfactorSchedule**](KeyfactorCommonSchedulingKeyfactorSchedule.md) |  |  [optional] |
|**discoverPercentComplete** | **Double** |  |  [optional] |
|**monitorPercentComplete** | **Double** |  |  [optional] |
|**discoverStatus** | [**DiscoverStatusEnum**](#DiscoverStatusEnum) |  |  [optional] |
|**monitorStatus** | [**MonitorStatusEnum**](#MonitorStatusEnum) |  |  [optional] |
|**discoverLastScanned** | **OffsetDateTime** |  |  [optional] |
|**monitorLastScanned** | **OffsetDateTime** |  |  [optional] |
|**sslAlertRecipients** | **List&lt;String&gt;** |  |  [optional] |
|**autoMonitor** | **Boolean** |  |  [optional] |
|**getRobots** | **Boolean** |  |  [optional] |
|**discoverTimeoutMs** | **Double** |  |  [optional] |
|**monitorTimeoutMs** | **Double** |  |  [optional] |
|**expirationAlertDays** | **Double** |  |  [optional] |
|**discoverJobParts** | **Integer** |  |  [optional] |
|**monitorJobParts** | **Integer** |  |  [optional] |
|**quietHours** | [**List&lt;KeyfactorApiModelsSslQuietHourResponse&gt;**](KeyfactorApiModelsSslQuietHourResponse.md) |  |  [optional] |



## Enum: DiscoverStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |



## Enum: MonitorStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |




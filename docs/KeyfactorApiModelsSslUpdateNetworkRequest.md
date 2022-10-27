

# KeyfactorApiModelsSslUpdateNetworkRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**networkId** | **UUID** |  |  |
|**name** | **String** |  |  |
|**agentPoolName** | **String** |  |  |
|**description** | **String** |  |  |
|**enabled** | **Boolean** |  |  [optional] |
|**discoverSchedule** | [**KeyfactorCommonSchedulingKeyfactorSchedule**](KeyfactorCommonSchedulingKeyfactorSchedule.md) |  |  [optional] |
|**monitorSchedule** | [**KeyfactorCommonSchedulingKeyfactorSchedule**](KeyfactorCommonSchedulingKeyfactorSchedule.md) |  |  [optional] |
|**sslAlertRecipients** | **List&lt;String&gt;** |  |  [optional] |
|**autoMonitor** | **Boolean** |  |  [optional] |
|**getRobots** | **Boolean** |  |  [optional] |
|**discoverTimeoutMs** | **Double** |  |  [optional] |
|**monitorTimeoutMs** | **Double** |  |  [optional] |
|**expirationAlertDays** | **Double** |  |  [optional] |
|**quietHours** | [**List&lt;KeyfactorApiModelsSslQuietHourRequest&gt;**](KeyfactorApiModelsSslQuietHourRequest.md) |  |  [optional] |




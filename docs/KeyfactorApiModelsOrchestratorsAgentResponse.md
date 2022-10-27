

# KeyfactorApiModelsOrchestratorsAgentResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentId** | **UUID** |  |  [optional] |
|**clientMachine** | **String** |  |  [optional] |
|**username** | **String** |  |  [optional] |
|**agentPlatform** | [**AgentPlatformEnum**](#AgentPlatformEnum) |  |  [optional] |
|**version** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**lastSeen** | **OffsetDateTime** |  |  [optional] |
|**capabilities** | **List&lt;String&gt;** |  |  [optional] |
|**blueprint** | **String** |  |  [optional] |
|**thumbprint** | **String** |  |  [optional] |
|**legacyThumbprint** | **String** |  |  [optional] |
|**authCertificateReenrollment** | **String** |  |  [optional] |
|**lastThumbprintUsed** | **String** |  |  [optional] |
|**lastErrorCode** | **Long** |  |  [optional] |
|**lastErrorMessage** | **String** |  |  [optional] |



## Enum: AgentPlatformEnum

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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |




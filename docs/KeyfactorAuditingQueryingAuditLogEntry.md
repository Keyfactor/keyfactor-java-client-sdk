

# KeyfactorAuditingQueryingAuditLogEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**signature** | **String** |  |  [optional] |
|**category** | **Integer** |  |  [optional] |
|**operation** | **Integer** |  |  [optional] |
|**level** | [**LevelEnum**](#LevelEnum) |  |  [optional] |
|**user** | **String** |  |  [optional] |
|**entityType** | **String** |  |  [optional] |
|**auditIdentifier** | **String** |  |  [optional] |
|**immutableIdentifier** | **String** |  |  [optional] |



## Enum: LevelEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |




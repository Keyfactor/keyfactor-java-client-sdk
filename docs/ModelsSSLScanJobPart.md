

# ModelsSSLScanJobPart


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scanJobPartId** | **UUID** |  |  [optional] |
|**logicalScanJobId** | **UUID** |  |  [optional] |
|**agentJobId** | **UUID** |  |  [optional] |
|**estimatedEndpointCount** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**statTotalEndpointCount** | **Integer** |  |  [optional] |
|**statTimedOutConnectingCount** | **Integer** |  |  [optional] |
|**statConnectionRefusedCount** | **Integer** |  |  [optional] |
|**statTimedOutDownloadingCount** | **Integer** |  |  [optional] |
|**statExceptionDownloadingCount** | **Integer** |  |  [optional] |
|**statNotSslCount** | **Integer** |  |  [optional] |
|**statBadSslHandshakeCount** | **Integer** |  |  [optional] |
|**statCertificateFoundCount** | **Integer** |  |  [optional] |
|**statNoCertificateCount** | **Integer** |  |  [optional] |
|**scanJobPartDefinitions** | [**List&lt;ModelsSSLScanJobPartDefinition&gt;**](ModelsSSLScanJobPartDefinition.md) |  |  [optional] |
|**startTime** | **OffsetDateTime** |  |  [optional] |
|**endTime** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |




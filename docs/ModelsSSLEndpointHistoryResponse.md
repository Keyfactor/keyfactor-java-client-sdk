

# ModelsSSLEndpointHistoryResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**historyId** | **UUID** |  |  [optional] |
|**endpointId** | **UUID** |  |  [optional] |
|**auditId** | **Long** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**jobType** | [**JobTypeEnum**](#JobTypeEnum) |  |  [optional] |
|**probeType** | [**ProbeTypeEnum**](#ProbeTypeEnum) |  |  [optional] |
|**reverseDNS** | **String** |  |  [optional] |
|**historyCertificates** | [**List&lt;ModelsSSLEndpointHistoryResponseCertificateModel&gt;**](ModelsSSLEndpointHistoryResponseCertificateModel.md) |  |  [optional] |



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
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_11 | 11 |
| NUMBER_12 | 12 |
| NUMBER_13 | 13 |
| NUMBER_14 | 14 |



## Enum: JobTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



## Enum: ProbeTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |




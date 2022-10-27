

# ModelsCertificateImportResponseModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**importStatus** | [**ImportStatusEnum**](#ImportStatusEnum) |  |  [optional] |
|**jobStatus** | [**JobStatusEnum**](#JobStatusEnum) |  |  [optional] |
|**invalidKeystores** | [**List&lt;ModelsInvalidKeystore&gt;**](ModelsInvalidKeystore.md) |  |  [optional] |
|**thumbprint** | **byte[]** |  |  [optional] |



## Enum: ImportStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_4 | 4 |
| NUMBER_8 | 8 |
| NUMBER_16 | 16 |
| NUMBER_32 | 32 |
| NUMBER_64 | 64 |
| NUMBER_128 | 128 |
| NUMBER_256 | 256 |



## Enum: JobStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |




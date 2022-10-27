

# KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**storeType** | **Integer** |  |  |
|**name** | **String** |  |  |
|**shortName** | **String** |  |  |
|**capability** | **String** |  |  [optional] |
|**localStore** | **Boolean** |  |  [optional] |
|**supportedOperations** | [**ModelsCertStoreTypeSupportedOperations**](ModelsCertStoreTypeSupportedOperations.md) |  |  [optional] |
|**properties** | [**List&lt;ModelsCertificateStoreTypeProperty&gt;**](ModelsCertificateStoreTypeProperty.md) |  |  [optional] |
|**passwordOptions** | [**ModelsCertStoreTypePasswordOptions**](ModelsCertStoreTypePasswordOptions.md) |  |  [optional] |
|**storePathType** | **String** |  |  [optional] |
|**storePathValue** | **String** |  |  [optional] |
|**privateKeyAllowed** | [**PrivateKeyAllowedEnum**](#PrivateKeyAllowedEnum) |  |  [optional] |
|**serverRequired** | **Boolean** |  |  [optional] |
|**powerShell** | **Boolean** |  |  [optional] |
|**blueprintAllowed** | **Boolean** |  |  [optional] |
|**customAliasAllowed** | [**CustomAliasAllowedEnum**](#CustomAliasAllowedEnum) |  |  [optional] |
|**entryParameters** | [**List&lt;ModelsCertificateStoreTypesCertificateStoreTypeEntryParameter&gt;**](ModelsCertificateStoreTypesCertificateStoreTypeEntryParameter.md) |  |  [optional] |



## Enum: PrivateKeyAllowedEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



## Enum: CustomAliasAllowedEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |






# KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**shortName** | **String** |  |  [optional] |
|**capability** | **String** |  |  [optional] |
|**storeType** | **Integer** |  |  [optional] |
|**importType** | **Integer** |  |  [optional] |
|**localStore** | **Boolean** |  |  [optional] |
|**supportedOperations** | [**ModelsCertStoreTypeSupportedOperations**](ModelsCertStoreTypeSupportedOperations.md) |  |  [optional] |
|**properties** | [**List&lt;ModelsCertificateStoreTypeProperty&gt;**](ModelsCertificateStoreTypeProperty.md) |  |  [optional] |
|**entryParameters** | [**List&lt;ModelsCertificateStoreTypesCertificateStoreTypeEntryParameter&gt;**](ModelsCertificateStoreTypesCertificateStoreTypeEntryParameter.md) |  |  [optional] |
|**passwordOptions** | [**ModelsCertStoreTypePasswordOptions**](ModelsCertStoreTypePasswordOptions.md) |  |  [optional] |
|**storePathType** | **String** |  |  [optional] |
|**storePathValue** | **String** |  |  [optional] |
|**privateKeyAllowed** | [**PrivateKeyAllowedEnum**](#PrivateKeyAllowedEnum) |  |  [optional] |
|**jobProperties** | **List&lt;String&gt;** |  |  [optional] [readonly] |
|**serverRequired** | **Boolean** |  |  [optional] |
|**powerShell** | **Boolean** |  |  [optional] |
|**blueprintAllowed** | **Boolean** |  |  [optional] |
|**customAliasAllowed** | [**CustomAliasAllowedEnum**](#CustomAliasAllowedEnum) |  |  [optional] |
|**serverRegistration** | **Integer** |  |  [optional] |
|**inventoryEndpoint** | **String** |  |  [optional] |
|**inventoryJobType** | **UUID** |  |  [optional] |
|**managementJobType** | **UUID** |  |  [optional] |
|**discoveryJobType** | **UUID** |  |  [optional] |
|**enrollmentJobType** | **UUID** |  |  [optional] |



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




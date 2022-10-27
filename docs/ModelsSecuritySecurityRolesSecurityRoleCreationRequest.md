

# ModelsSecuritySecurityRolesSecurityRoleCreationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the security role to create |  |
|**description** | **String** | The description to be used on the created security role |  |
|**enabled** | **Boolean** | Whether or not the security role should be enabled |  [optional] |
|**_private** | **Boolean** | Whether or not the security role should be private |  [optional] |
|**permissions** | **List&lt;String&gt;** | The permissions to include in the role. These must be supplied in the format \&quot;Area:Permission\&quot; |  [optional] |
|**identities** | [**List&lt;ModelsSecurityIdentitiesSecurityIdentityIdentifier&gt;**](ModelsSecurityIdentitiesSecurityIdentityIdentifier.md) | The Keyfactor identities to assign to the created role |  [optional] |




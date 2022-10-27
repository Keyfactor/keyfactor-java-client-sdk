

# KeyfactorApiModelsCertificatesCertificateIdentityAuditResponse

Represents an account with a list of permission granted to it on a given certificate by either a role or collection

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Id of the account represented by the audit response |  [optional] |
|**accountName** | **String** | Name of the account represented by the audit response |  [optional] |
|**identityType** | **String** | The type of account represented by the audit response (User or Group) |  [optional] |
|**SID** | **String** | The SID of the account represented by the audit reponse |  [optional] |
|**permissions** | [**List&lt;KeyfactorApiModelsCertificatesCertificateIdentityAuditResponseCertificatePermission&gt;**](KeyfactorApiModelsCertificatesCertificateIdentityAuditResponseCertificatePermission.md) | Permissions granted to the account represented by the audit reponse on the specified certifcate |  [optional] [readonly] |




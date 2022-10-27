

# ModelsRevokeAllCertificatesRequest

Information for revoking all certifictes in a query

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**query** | **String** | The query string of the certificates to revoke |  [optional] |
|**reason** | [**ReasonEnum**](#ReasonEnum) | The Reason for revocation |  |
|**comment** | **String** | A comment for auditing purposes |  |
|**effectiveDate** | **OffsetDateTime** | The date when the certificates are to appear on the revocation list |  [optional] |
|**includeRevoked** | **Boolean** | A flag telling the query to include revoked certificates |  [optional] |
|**includeExpired** | **Boolean** | A flag telling the query to include expired certificates |  [optional] |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_8 | 8 |
| NUMBER_999 | 999 |
| NUMBER_MINUS_1 | -1 |




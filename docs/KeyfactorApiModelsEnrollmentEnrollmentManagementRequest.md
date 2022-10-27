

# KeyfactorApiModelsEnrollmentEnrollmentManagementRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stores** | [**List&lt;KeyfactorApiModelsEnrollmentManagementStoreRequest&gt;**](KeyfactorApiModelsEnrollmentManagementStoreRequest.md) | The stores to add the certificate to. Values in this collection will take precedence over values in {Models.Enrollment.SpecificEnrollmentManagementRequest.StoreTypes}. |  [optional] |
|**storeIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**storeTypes** | [**List&lt;KeyfactorApiModelsEnrollmentManagementStoreTypeRequest&gt;**](KeyfactorApiModelsEnrollmentManagementStoreTypeRequest.md) |  |  [optional] |
|**certificateId** | **Integer** |  |  [optional] |
|**requestId** | **Integer** |  |  [optional] |
|**password** | **String** |  |  |
|**jobTime** | **OffsetDateTime** |  |  [optional] |




# CustomJobTypeApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customJobTypeCreateJobType**](CustomJobTypeApi.md#customJobTypeCreateJobType) | **POST** /JobTypes/Custom | Creates a custom job type with the provided properties |
| [**customJobTypeDeleteJobType**](CustomJobTypeApi.md#customJobTypeDeleteJobType) | **DELETE** /JobTypes/Custom/{id} | Deletes the custom job type associated with the provided id |
| [**customJobTypeGetJobTypeById**](CustomJobTypeApi.md#customJobTypeGetJobTypeById) | **GET** /JobTypes/Custom/{id} | Returns a single custom job type associated with the provided id |
| [**customJobTypeGetJobTypes**](CustomJobTypeApi.md#customJobTypeGetJobTypes) | **GET** /JobTypes/Custom | Returns all custom job types according to the provided filter and output parameters |
| [**customJobTypeUpdateJobType**](CustomJobTypeApi.md#customJobTypeUpdateJobType) | **PUT** /JobTypes/Custom | Updates an existing custom job type with the provided properties |


<a name="customJobTypeCreateJobType"></a>
# **customJobTypeCreateJobType**
> KeyfactorApiModelsOrchestratorJobsJobTypeResponse customJobTypeCreateJobType(xKeyfactorRequestedWith, jobType, xKeyfactorApiVersion)

Creates a custom job type with the provided properties

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CustomJobTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CustomJobTypeApi apiInstance = new CustomJobTypeApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsOrchestratorJobsJobTypeCreateRequest jobType = new ModelsOrchestratorJobsJobTypeCreateRequest(); // ModelsOrchestratorJobsJobTypeCreateRequest | job type properties to be applied to the new job type
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsOrchestratorJobsJobTypeResponse result = apiInstance.customJobTypeCreateJobType(xKeyfactorRequestedWith, jobType, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomJobTypeApi#customJobTypeCreateJobType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **jobType** | [**ModelsOrchestratorJobsJobTypeCreateRequest**](ModelsOrchestratorJobsJobTypeCreateRequest.md)| job type properties to be applied to the new job type | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsOrchestratorJobsJobTypeResponse**](KeyfactorApiModelsOrchestratorJobsJobTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="customJobTypeDeleteJobType"></a>
# **customJobTypeDeleteJobType**
> customJobTypeDeleteJobType(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Deletes the custom job type associated with the provided id

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CustomJobTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CustomJobTypeApi apiInstance = new CustomJobTypeApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Keyfactor identifier (GUID) of the job type
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.customJobTypeDeleteJobType(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomJobTypeApi#customJobTypeDeleteJobType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Keyfactor identifier (GUID) of the job type | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="customJobTypeGetJobTypeById"></a>
# **customJobTypeGetJobTypeById**
> KeyfactorApiModelsOrchestratorJobsJobTypeResponse customJobTypeGetJobTypeById(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns a single custom job type associated with the provided id

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CustomJobTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CustomJobTypeApi apiInstance = new CustomJobTypeApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Keyfactor (GUID) identifier of the job type
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsOrchestratorJobsJobTypeResponse result = apiInstance.customJobTypeGetJobTypeById(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomJobTypeApi#customJobTypeGetJobTypeById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Keyfactor (GUID) identifier of the job type | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsOrchestratorJobsJobTypeResponse**](KeyfactorApiModelsOrchestratorJobsJobTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="customJobTypeGetJobTypes"></a>
# **customJobTypeGetJobTypes**
> List&lt;KeyfactorApiModelsOrchestratorJobsJobTypeResponse&gt; customJobTypeGetJobTypes(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Returns all custom job types according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CustomJobTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CustomJobTypeApi apiInstance = new CustomJobTypeApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsOrchestratorJobsJobTypeResponse> result = apiInstance.customJobTypeGetJobTypes(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomJobTypeApi#customJobTypeGetJobTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |
| **pqQueryString** | **String**| Contents of the query (ex: field1 -eq value1 AND field2 -gt value2) | [optional] |
| **pqPageReturned** | **Integer**| The current page within the result set to be returned | [optional] |
| **pqReturnLimit** | **Integer**| Maximum number of records to be returned in a single call | [optional] |
| **pqSortField** | **String**| Field by which the results should be sorted (view results via Management Portal for sortable columns) | [optional] |
| **pqSortAscending** | **Integer**| Field sort direction [0&#x3D;ascending, 1&#x3D;descending] | [optional] [enum: 0, 1] |

### Return type

[**List&lt;KeyfactorApiModelsOrchestratorJobsJobTypeResponse&gt;**](KeyfactorApiModelsOrchestratorJobsJobTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="customJobTypeUpdateJobType"></a>
# **customJobTypeUpdateJobType**
> KeyfactorApiModelsOrchestratorJobsJobTypeResponse customJobTypeUpdateJobType(xKeyfactorRequestedWith, jobType, xKeyfactorApiVersion)

Updates an existing custom job type with the provided properties

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CustomJobTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CustomJobTypeApi apiInstance = new CustomJobTypeApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsOrchestratorJobsJobTypeUpdateRequest jobType = new ModelsOrchestratorJobsJobTypeUpdateRequest(); // ModelsOrchestratorJobsJobTypeUpdateRequest | job type properties to be applied to the existing job type
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsOrchestratorJobsJobTypeResponse result = apiInstance.customJobTypeUpdateJobType(xKeyfactorRequestedWith, jobType, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomJobTypeApi#customJobTypeUpdateJobType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **jobType** | [**ModelsOrchestratorJobsJobTypeUpdateRequest**](ModelsOrchestratorJobsJobTypeUpdateRequest.md)| job type properties to be applied to the existing job type | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsOrchestratorJobsJobTypeResponse**](KeyfactorApiModelsOrchestratorJobsJobTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


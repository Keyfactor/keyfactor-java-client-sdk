# PendingAlertApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pendingAlertAddPendingAlert**](PendingAlertApi.md#pendingAlertAddPendingAlert) | **POST** /Alerts/Pending | Add a pending alert |
| [**pendingAlertDeletePendingAlert**](PendingAlertApi.md#pendingAlertDeletePendingAlert) | **DELETE** /Alerts/Pending/{id} | Delete a pending alert |
| [**pendingAlertEditPendingAlert**](PendingAlertApi.md#pendingAlertEditPendingAlert) | **PUT** /Alerts/Pending | Edit a pending alert |
| [**pendingAlertEditSchedule**](PendingAlertApi.md#pendingAlertEditSchedule) | **PUT** /Alerts/Pending/Schedule | Edit schedule |
| [**pendingAlertGetPendingAlert**](PendingAlertApi.md#pendingAlertGetPendingAlert) | **GET** /Alerts/Pending/{id} | Get a pending alert |
| [**pendingAlertGetPendingAlerts**](PendingAlertApi.md#pendingAlertGetPendingAlerts) | **GET** /Alerts/Pending | Gets all pending alerts according to the provided filter and output parameters |
| [**pendingAlertGetSchedule**](PendingAlertApi.md#pendingAlertGetSchedule) | **GET** /Alerts/Pending/Schedule | Get the schedule for pending alerts |
| [**pendingAlertTestAllPendingAlert**](PendingAlertApi.md#pendingAlertTestAllPendingAlert) | **POST** /Alerts/Pending/TestAll | Test all pending alerts. Will send alert emails if SendAlerts is true |
| [**pendingAlertTestPendingAlert**](PendingAlertApi.md#pendingAlertTestPendingAlert) | **POST** /Alerts/Pending/Test | Test pending alert. Will send alert emails if SendAlerts is true |


<a name="pendingAlertAddPendingAlert"></a>
# **pendingAlertAddPendingAlert**
> KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse pendingAlertAddPendingAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Add a pending alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.PendingAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PendingAlertApi apiInstance = new PendingAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsPendingPendingAlertCreationRequest req = new KeyfactorApiModelsAlertsPendingPendingAlertCreationRequest(); // KeyfactorApiModelsAlertsPendingPendingAlertCreationRequest | Information for the new alert
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse result = apiInstance.pendingAlertAddPendingAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PendingAlertApi#pendingAlertAddPendingAlert");
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
| **req** | [**KeyfactorApiModelsAlertsPendingPendingAlertCreationRequest**](KeyfactorApiModelsAlertsPendingPendingAlertCreationRequest.md)| Information for the new alert | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse**](KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="pendingAlertDeletePendingAlert"></a>
# **pendingAlertDeletePendingAlert**
> pendingAlertDeletePendingAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Delete a pending alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.PendingAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PendingAlertApi apiInstance = new PendingAlertApi(defaultClient);
    Integer id = 56; // Integer | Id for the pending alert
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.pendingAlertDeletePendingAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling PendingAlertApi#pendingAlertDeletePendingAlert");
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
| **id** | **Integer**| Id for the pending alert | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="pendingAlertEditPendingAlert"></a>
# **pendingAlertEditPendingAlert**
> KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse pendingAlertEditPendingAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Edit a pending alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.PendingAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PendingAlertApi apiInstance = new PendingAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsPendingPendingAlertUpdateRequest req = new KeyfactorApiModelsAlertsPendingPendingAlertUpdateRequest(); // KeyfactorApiModelsAlertsPendingPendingAlertUpdateRequest | Information for the pending alert
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse result = apiInstance.pendingAlertEditPendingAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PendingAlertApi#pendingAlertEditPendingAlert");
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
| **req** | [**KeyfactorApiModelsAlertsPendingPendingAlertUpdateRequest**](KeyfactorApiModelsAlertsPendingPendingAlertUpdateRequest.md)| Information for the pending alert | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse**](KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="pendingAlertEditSchedule"></a>
# **pendingAlertEditSchedule**
> KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse pendingAlertEditSchedule(xKeyfactorRequestedWith, newSchedule, xKeyfactorApiVersion)

Edit schedule

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.PendingAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PendingAlertApi apiInstance = new PendingAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest newSchedule = new KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest(); // KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest | 
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse result = apiInstance.pendingAlertEditSchedule(xKeyfactorRequestedWith, newSchedule, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PendingAlertApi#pendingAlertEditSchedule");
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
| **newSchedule** | [**KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest**](KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest.md)|  | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse**](KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="pendingAlertGetPendingAlert"></a>
# **pendingAlertGetPendingAlert**
> KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse pendingAlertGetPendingAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Get a pending alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.PendingAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PendingAlertApi apiInstance = new PendingAlertApi(defaultClient);
    Integer id = 56; // Integer | Id for the pending alert to get
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse result = apiInstance.pendingAlertGetPendingAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PendingAlertApi#pendingAlertGetPendingAlert");
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
| **id** | **Integer**| Id for the pending alert to get | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse**](KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="pendingAlertGetPendingAlerts"></a>
# **pendingAlertGetPendingAlerts**
> List&lt;KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse&gt; pendingAlertGetPendingAlerts(xKeyfactorRequestedWith, xKeyfactorApiVersion, pagedQueryQueryString, pagedQueryPageReturned, pagedQueryReturnLimit, pagedQuerySortField, pagedQuerySortAscending)

Gets all pending alerts according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.PendingAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PendingAlertApi apiInstance = new PendingAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pagedQueryQueryString = "pagedQueryQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pagedQueryPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pagedQueryReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pagedQuerySortField = "pagedQuerySortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pagedQuerySortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse> result = apiInstance.pendingAlertGetPendingAlerts(xKeyfactorRequestedWith, xKeyfactorApiVersion, pagedQueryQueryString, pagedQueryPageReturned, pagedQueryReturnLimit, pagedQuerySortField, pagedQuerySortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PendingAlertApi#pendingAlertGetPendingAlerts");
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
| **pagedQueryQueryString** | **String**| Contents of the query (ex: field1 -eq value1 AND field2 -gt value2) | [optional] |
| **pagedQueryPageReturned** | **Integer**| The current page within the result set to be returned | [optional] |
| **pagedQueryReturnLimit** | **Integer**| Maximum number of records to be returned in a single call | [optional] |
| **pagedQuerySortField** | **String**| Field by which the results should be sorted (view results via Management Portal for sortable columns) | [optional] |
| **pagedQuerySortAscending** | **Integer**| Field sort direction [0&#x3D;ascending, 1&#x3D;descending] | [optional] [enum: 0, 1] |

### Return type

[**List&lt;KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse&gt;**](KeyfactorApiModelsAlertsPendingPendingAlertDefinitionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="pendingAlertGetSchedule"></a>
# **pendingAlertGetSchedule**
> KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse pendingAlertGetSchedule(xKeyfactorRequestedWith, xKeyfactorApiVersion)

Get the schedule for pending alerts

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.PendingAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PendingAlertApi apiInstance = new PendingAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse result = apiInstance.pendingAlertGetSchedule(xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PendingAlertApi#pendingAlertGetSchedule");
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

### Return type

[**KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse**](KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="pendingAlertTestAllPendingAlert"></a>
# **pendingAlertTestAllPendingAlert**
> KeyfactorApiModelsAlertsPendingPendingAlertTestResponse pendingAlertTestAllPendingAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Test all pending alerts. Will send alert emails if SendAlerts is true

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.PendingAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PendingAlertApi apiInstance = new PendingAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsPendingPendingAlertTestAllRequest req = new KeyfactorApiModelsAlertsPendingPendingAlertTestAllRequest(); // KeyfactorApiModelsAlertsPendingPendingAlertTestAllRequest | Information for the pending alert
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsPendingPendingAlertTestResponse result = apiInstance.pendingAlertTestAllPendingAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PendingAlertApi#pendingAlertTestAllPendingAlert");
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
| **req** | [**KeyfactorApiModelsAlertsPendingPendingAlertTestAllRequest**](KeyfactorApiModelsAlertsPendingPendingAlertTestAllRequest.md)| Information for the pending alert | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsPendingPendingAlertTestResponse**](KeyfactorApiModelsAlertsPendingPendingAlertTestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="pendingAlertTestPendingAlert"></a>
# **pendingAlertTestPendingAlert**
> KeyfactorApiModelsAlertsPendingPendingAlertTestResponse pendingAlertTestPendingAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Test pending alert. Will send alert emails if SendAlerts is true

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.PendingAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PendingAlertApi apiInstance = new PendingAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsPendingPendingAlertTestRequest req = new KeyfactorApiModelsAlertsPendingPendingAlertTestRequest(); // KeyfactorApiModelsAlertsPendingPendingAlertTestRequest | Information for the pending alert
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsPendingPendingAlertTestResponse result = apiInstance.pendingAlertTestPendingAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PendingAlertApi#pendingAlertTestPendingAlert");
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
| **req** | [**KeyfactorApiModelsAlertsPendingPendingAlertTestRequest**](KeyfactorApiModelsAlertsPendingPendingAlertTestRequest.md)| Information for the pending alert | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsPendingPendingAlertTestResponse**](KeyfactorApiModelsAlertsPendingPendingAlertTestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


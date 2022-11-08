# KeyRotationAlertApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**keyRotationAlertAddKeyRotationAlert**](KeyRotationAlertApi.md#keyRotationAlertAddKeyRotationAlert) | **POST** /Alerts/KeyRotation | Add a key rotation alert |
| [**keyRotationAlertDeleteKeyRotationAlert**](KeyRotationAlertApi.md#keyRotationAlertDeleteKeyRotationAlert) | **DELETE** /Alerts/KeyRotation/{id} | Delete a key rotation alert |
| [**keyRotationAlertEditKeyRotationAlert**](KeyRotationAlertApi.md#keyRotationAlertEditKeyRotationAlert) | **PUT** /Alerts/KeyRotation | Edit a key rotation alert |
| [**keyRotationAlertEditSchedule**](KeyRotationAlertApi.md#keyRotationAlertEditSchedule) | **PUT** /Alerts/KeyRotation/Schedule | Edit schedule |
| [**keyRotationAlertGetKeyRotationAlert**](KeyRotationAlertApi.md#keyRotationAlertGetKeyRotationAlert) | **GET** /Alerts/KeyRotation/{id} | Get a key rotation alert |
| [**keyRotationAlertGetKeyRotationAlerts**](KeyRotationAlertApi.md#keyRotationAlertGetKeyRotationAlerts) | **GET** /Alerts/KeyRotation | Gets all key rotation alerts according to the provided filter and output parameters |
| [**keyRotationAlertGetSchedule**](KeyRotationAlertApi.md#keyRotationAlertGetSchedule) | **GET** /Alerts/KeyRotation/Schedule | Get the schedule for key rotation alerts |
| [**keyRotationAlertTestAllKeyRotationAlert**](KeyRotationAlertApi.md#keyRotationAlertTestAllKeyRotationAlert) | **POST** /Alerts/KeyRotation/TestAll | Test All Alerts |
| [**keyRotationAlertTestKeyRotationAlert**](KeyRotationAlertApi.md#keyRotationAlertTestKeyRotationAlert) | **POST** /Alerts/KeyRotation/Test | Test An Alert |


<a name="keyRotationAlertAddKeyRotationAlert"></a>
# **keyRotationAlertAddKeyRotationAlert**
> KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse keyRotationAlertAddKeyRotationAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Add a key rotation alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyRotationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    KeyRotationAlertApi apiInstance = new KeyRotationAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertCreationRequest req = new KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertCreationRequest(); // KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertCreationRequest | Information for the new alert
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse result = apiInstance.keyRotationAlertAddKeyRotationAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyRotationAlertApi#keyRotationAlertAddKeyRotationAlert");
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
| **req** | [**KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertCreationRequest**](KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertCreationRequest.md)| Information for the new alert | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse**](KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="keyRotationAlertDeleteKeyRotationAlert"></a>
# **keyRotationAlertDeleteKeyRotationAlert**
> keyRotationAlertDeleteKeyRotationAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Delete a key rotation alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyRotationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    KeyRotationAlertApi apiInstance = new KeyRotationAlertApi(defaultClient);
    Integer id = 56; // Integer | Id for the key rotation alert
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.keyRotationAlertDeleteKeyRotationAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyRotationAlertApi#keyRotationAlertDeleteKeyRotationAlert");
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
| **id** | **Integer**| Id for the key rotation alert | |
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

<a name="keyRotationAlertEditKeyRotationAlert"></a>
# **keyRotationAlertEditKeyRotationAlert**
> KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse keyRotationAlertEditKeyRotationAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Edit a key rotation alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyRotationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    KeyRotationAlertApi apiInstance = new KeyRotationAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertUpdateRequest req = new KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertUpdateRequest(); // KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertUpdateRequest | Information for the key rotation alert
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse result = apiInstance.keyRotationAlertEditKeyRotationAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyRotationAlertApi#keyRotationAlertEditKeyRotationAlert");
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
| **req** | [**KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertUpdateRequest**](KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertUpdateRequest.md)| Information for the key rotation alert | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse**](KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="keyRotationAlertEditSchedule"></a>
# **keyRotationAlertEditSchedule**
> KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse keyRotationAlertEditSchedule(xKeyfactorRequestedWith, newSchedule, xKeyfactorApiVersion)

Edit schedule

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyRotationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    KeyRotationAlertApi apiInstance = new KeyRotationAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest newSchedule = new KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest(); // KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest | 
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse result = apiInstance.keyRotationAlertEditSchedule(xKeyfactorRequestedWith, newSchedule, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyRotationAlertApi#keyRotationAlertEditSchedule");
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

<a name="keyRotationAlertGetKeyRotationAlert"></a>
# **keyRotationAlertGetKeyRotationAlert**
> KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse keyRotationAlertGetKeyRotationAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Get a key rotation alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyRotationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    KeyRotationAlertApi apiInstance = new KeyRotationAlertApi(defaultClient);
    Integer id = 56; // Integer | Id for the key rotation alert to get
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse result = apiInstance.keyRotationAlertGetKeyRotationAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyRotationAlertApi#keyRotationAlertGetKeyRotationAlert");
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
| **id** | **Integer**| Id for the key rotation alert to get | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse**](KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="keyRotationAlertGetKeyRotationAlerts"></a>
# **keyRotationAlertGetKeyRotationAlerts**
> List&lt;KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse&gt; keyRotationAlertGetKeyRotationAlerts(xKeyfactorRequestedWith, xKeyfactorApiVersion, pagedQueryQueryString, pagedQueryPageReturned, pagedQueryReturnLimit, pagedQuerySortField, pagedQuerySortAscending)

Gets all key rotation alerts according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyRotationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    KeyRotationAlertApi apiInstance = new KeyRotationAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pagedQueryQueryString = "pagedQueryQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pagedQueryPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pagedQueryReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pagedQuerySortField = "pagedQuerySortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pagedQuerySortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse> result = apiInstance.keyRotationAlertGetKeyRotationAlerts(xKeyfactorRequestedWith, xKeyfactorApiVersion, pagedQueryQueryString, pagedQueryPageReturned, pagedQueryReturnLimit, pagedQuerySortField, pagedQuerySortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyRotationAlertApi#keyRotationAlertGetKeyRotationAlerts");
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

[**List&lt;KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse&gt;**](KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertDefinitionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="keyRotationAlertGetSchedule"></a>
# **keyRotationAlertGetSchedule**
> KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse keyRotationAlertGetSchedule(xKeyfactorRequestedWith, xKeyfactorApiVersion)

Get the schedule for key rotation alerts

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyRotationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    KeyRotationAlertApi apiInstance = new KeyRotationAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse result = apiInstance.keyRotationAlertGetSchedule(xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyRotationAlertApi#keyRotationAlertGetSchedule");
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

<a name="keyRotationAlertTestAllKeyRotationAlert"></a>
# **keyRotationAlertTestAllKeyRotationAlert**
> KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse keyRotationAlertTestAllKeyRotationAlert(xKeyfactorRequestedWith, keyRotationAlertTestRequest, xKeyfactorApiVersion)

Test All Alerts

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyRotationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    KeyRotationAlertApi apiInstance = new KeyRotationAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest keyRotationAlertTestRequest = new KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest(); // KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest | Information about the key rotation alert test
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse result = apiInstance.keyRotationAlertTestAllKeyRotationAlert(xKeyfactorRequestedWith, keyRotationAlertTestRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyRotationAlertApi#keyRotationAlertTestAllKeyRotationAlert");
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
| **keyRotationAlertTestRequest** | [**KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest**](KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest.md)| Information about the key rotation alert test | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse**](KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="keyRotationAlertTestKeyRotationAlert"></a>
# **keyRotationAlertTestKeyRotationAlert**
> KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse keyRotationAlertTestKeyRotationAlert(xKeyfactorRequestedWith, keyRotationAlertTestRequest, xKeyfactorApiVersion)

Test An Alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyRotationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    KeyRotationAlertApi apiInstance = new KeyRotationAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestRequest keyRotationAlertTestRequest = new KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestRequest(); // KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestRequest | Parameters used to test the alert
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse result = apiInstance.keyRotationAlertTestKeyRotationAlert(xKeyfactorRequestedWith, keyRotationAlertTestRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyRotationAlertApi#keyRotationAlertTestKeyRotationAlert");
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
| **keyRotationAlertTestRequest** | [**KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestRequest**](KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestRequest.md)| Parameters used to test the alert | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse**](KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


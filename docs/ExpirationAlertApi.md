# ExpirationAlertApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**expirationAlertAddExpirationAlert**](ExpirationAlertApi.md#expirationAlertAddExpirationAlert) | **POST** /Alerts/Expiration | Add an expiration alert |
| [**expirationAlertDeleteExpirationAlert**](ExpirationAlertApi.md#expirationAlertDeleteExpirationAlert) | **DELETE** /Alerts/Expiration/{id} | Delete an expiration alert |
| [**expirationAlertEditExpirationAlert**](ExpirationAlertApi.md#expirationAlertEditExpirationAlert) | **PUT** /Alerts/Expiration | Edit an expiration alert |
| [**expirationAlertEditSchedule**](ExpirationAlertApi.md#expirationAlertEditSchedule) | **PUT** /Alerts/Expiration/Schedule | Edit schedule |
| [**expirationAlertGetExpirationAlert**](ExpirationAlertApi.md#expirationAlertGetExpirationAlert) | **GET** /Alerts/Expiration/{id} | Get an expiration alert |
| [**expirationAlertGetExpirationAlerts**](ExpirationAlertApi.md#expirationAlertGetExpirationAlerts) | **GET** /Alerts/Expiration | Gets all expiration alerts according to the provided filter and output parameters |
| [**expirationAlertGetSchedule**](ExpirationAlertApi.md#expirationAlertGetSchedule) | **GET** /Alerts/Expiration/Schedule | Get the schedule for expiration alerts |
| [**expirationAlertTestAllExpirationAlert**](ExpirationAlertApi.md#expirationAlertTestAllExpirationAlert) | **POST** /Alerts/Expiration/TestAll | Test All Expiration Alerts |
| [**expirationAlertTestExpirationAlert**](ExpirationAlertApi.md#expirationAlertTestExpirationAlert) | **POST** /Alerts/Expiration/Test | Test an Expiration Alert |


<a name="expirationAlertAddExpirationAlert"></a>
# **expirationAlertAddExpirationAlert**
> KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse expirationAlertAddExpirationAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Add an expiration alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ExpirationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ExpirationAlertApi apiInstance = new ExpirationAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsExpirationExpirationAlertCreationRequest req = new KeyfactorApiModelsAlertsExpirationExpirationAlertCreationRequest(); // KeyfactorApiModelsAlertsExpirationExpirationAlertCreationRequest | Information for the new alert
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse result = apiInstance.expirationAlertAddExpirationAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpirationAlertApi#expirationAlertAddExpirationAlert");
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
| **req** | [**KeyfactorApiModelsAlertsExpirationExpirationAlertCreationRequest**](KeyfactorApiModelsAlertsExpirationExpirationAlertCreationRequest.md)| Information for the new alert | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse**](KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="expirationAlertDeleteExpirationAlert"></a>
# **expirationAlertDeleteExpirationAlert**
> expirationAlertDeleteExpirationAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Delete an expiration alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ExpirationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ExpirationAlertApi apiInstance = new ExpirationAlertApi(defaultClient);
    Integer id = 56; // Integer | Id for the expiration alert
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.expirationAlertDeleteExpirationAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpirationAlertApi#expirationAlertDeleteExpirationAlert");
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
| **id** | **Integer**| Id for the expiration alert | |
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

<a name="expirationAlertEditExpirationAlert"></a>
# **expirationAlertEditExpirationAlert**
> KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse expirationAlertEditExpirationAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Edit an expiration alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ExpirationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ExpirationAlertApi apiInstance = new ExpirationAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsExpirationExpirationAlertUpdateRequest req = new KeyfactorApiModelsAlertsExpirationExpirationAlertUpdateRequest(); // KeyfactorApiModelsAlertsExpirationExpirationAlertUpdateRequest | Information for the expiration alert
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse result = apiInstance.expirationAlertEditExpirationAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpirationAlertApi#expirationAlertEditExpirationAlert");
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
| **req** | [**KeyfactorApiModelsAlertsExpirationExpirationAlertUpdateRequest**](KeyfactorApiModelsAlertsExpirationExpirationAlertUpdateRequest.md)| Information for the expiration alert | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse**](KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="expirationAlertEditSchedule"></a>
# **expirationAlertEditSchedule**
> KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse expirationAlertEditSchedule(xKeyfactorRequestedWith, newSchedule, xKeyfactorApiVersion)

Edit schedule

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ExpirationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ExpirationAlertApi apiInstance = new ExpirationAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest newSchedule = new KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest(); // KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest | 
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse result = apiInstance.expirationAlertEditSchedule(xKeyfactorRequestedWith, newSchedule, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpirationAlertApi#expirationAlertEditSchedule");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="expirationAlertGetExpirationAlert"></a>
# **expirationAlertGetExpirationAlert**
> KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse expirationAlertGetExpirationAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Get an expiration alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ExpirationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ExpirationAlertApi apiInstance = new ExpirationAlertApi(defaultClient);
    Integer id = 56; // Integer | Id for the expiration alert to get
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse result = apiInstance.expirationAlertGetExpirationAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpirationAlertApi#expirationAlertGetExpirationAlert");
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
| **id** | **Integer**| Id for the expiration alert to get | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse**](KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="expirationAlertGetExpirationAlerts"></a>
# **expirationAlertGetExpirationAlerts**
> List&lt;KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse&gt; expirationAlertGetExpirationAlerts(xKeyfactorRequestedWith, xKeyfactorApiVersion, pagedQueryQueryString, pagedQueryPageReturned, pagedQueryReturnLimit, pagedQuerySortField, pagedQuerySortAscending)

Gets all expiration alerts according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ExpirationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ExpirationAlertApi apiInstance = new ExpirationAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pagedQueryQueryString = "pagedQueryQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pagedQueryPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pagedQueryReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pagedQuerySortField = "pagedQuerySortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pagedQuerySortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse> result = apiInstance.expirationAlertGetExpirationAlerts(xKeyfactorRequestedWith, xKeyfactorApiVersion, pagedQueryQueryString, pagedQueryPageReturned, pagedQueryReturnLimit, pagedQuerySortField, pagedQuerySortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpirationAlertApi#expirationAlertGetExpirationAlerts");
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

[**List&lt;KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse&gt;**](KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="expirationAlertGetSchedule"></a>
# **expirationAlertGetSchedule**
> KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse expirationAlertGetSchedule(xKeyfactorRequestedWith, xKeyfactorApiVersion)

Get the schedule for expiration alerts

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ExpirationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ExpirationAlertApi apiInstance = new ExpirationAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse result = apiInstance.expirationAlertGetSchedule(xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpirationAlertApi#expirationAlertGetSchedule");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="expirationAlertTestAllExpirationAlert"></a>
# **expirationAlertTestAllExpirationAlert**
> KeyfactorApiModelsAlertsExpirationExpirationAlertTestResponse expirationAlertTestAllExpirationAlert(xKeyfactorRequestedWith, expirationAlertTestRequest, xKeyfactorApiVersion)

Test All Expiration Alerts

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ExpirationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ExpirationAlertApi apiInstance = new ExpirationAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsExpirationExpirationAlertTestAllRequest expirationAlertTestRequest = new KeyfactorApiModelsAlertsExpirationExpirationAlertTestAllRequest(); // KeyfactorApiModelsAlertsExpirationExpirationAlertTestAllRequest | Information about the expiration alert test
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsExpirationExpirationAlertTestResponse result = apiInstance.expirationAlertTestAllExpirationAlert(xKeyfactorRequestedWith, expirationAlertTestRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpirationAlertApi#expirationAlertTestAllExpirationAlert");
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
| **expirationAlertTestRequest** | [**KeyfactorApiModelsAlertsExpirationExpirationAlertTestAllRequest**](KeyfactorApiModelsAlertsExpirationExpirationAlertTestAllRequest.md)| Information about the expiration alert test | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsExpirationExpirationAlertTestResponse**](KeyfactorApiModelsAlertsExpirationExpirationAlertTestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="expirationAlertTestExpirationAlert"></a>
# **expirationAlertTestExpirationAlert**
> KeyfactorApiModelsAlertsExpirationExpirationAlertTestResponse expirationAlertTestExpirationAlert(xKeyfactorRequestedWith, expirationAlertTestRequest, xKeyfactorApiVersion)

Test an Expiration Alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ExpirationAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ExpirationAlertApi apiInstance = new ExpirationAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest expirationAlertTestRequest = new KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest(); // KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest | Information about the expiration alert test
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsExpirationExpirationAlertTestResponse result = apiInstance.expirationAlertTestExpirationAlert(xKeyfactorRequestedWith, expirationAlertTestRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpirationAlertApi#expirationAlertTestExpirationAlert");
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
| **expirationAlertTestRequest** | [**KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest**](KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest.md)| Information about the expiration alert test | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsExpirationExpirationAlertTestResponse**](KeyfactorApiModelsAlertsExpirationExpirationAlertTestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


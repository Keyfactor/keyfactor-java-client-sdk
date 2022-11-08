# IssuedAlertApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**issuedAlertAddIssuedAlert**](IssuedAlertApi.md#issuedAlertAddIssuedAlert) | **POST** /Alerts/Issued | Add a issued alert |
| [**issuedAlertDeleteIssuedAlert**](IssuedAlertApi.md#issuedAlertDeleteIssuedAlert) | **DELETE** /Alerts/Issued/{id} | Delete a issued alert |
| [**issuedAlertEditIssuedAlert**](IssuedAlertApi.md#issuedAlertEditIssuedAlert) | **PUT** /Alerts/Issued | Edit a issued alert |
| [**issuedAlertEditSchedule**](IssuedAlertApi.md#issuedAlertEditSchedule) | **PUT** /Alerts/Issued/Schedule | Edit schedule |
| [**issuedAlertGetIssuedAlert**](IssuedAlertApi.md#issuedAlertGetIssuedAlert) | **GET** /Alerts/Issued/{id} | Get a issued alert |
| [**issuedAlertGetIssuedAlerts**](IssuedAlertApi.md#issuedAlertGetIssuedAlerts) | **GET** /Alerts/Issued | Gets all issued alerts according to the provided filter and output parameters |
| [**issuedAlertGetSchedule**](IssuedAlertApi.md#issuedAlertGetSchedule) | **GET** /Alerts/Issued/Schedule | Get the schedule for issued alerts |


<a name="issuedAlertAddIssuedAlert"></a>
# **issuedAlertAddIssuedAlert**
> KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse issuedAlertAddIssuedAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Add a issued alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.IssuedAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuedAlertApi apiInstance = new IssuedAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsIssuedIssuedAlertCreationRequest req = new KeyfactorApiModelsAlertsIssuedIssuedAlertCreationRequest(); // KeyfactorApiModelsAlertsIssuedIssuedAlertCreationRequest | Information for the new alert
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse result = apiInstance.issuedAlertAddIssuedAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuedAlertApi#issuedAlertAddIssuedAlert");
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
| **req** | [**KeyfactorApiModelsAlertsIssuedIssuedAlertCreationRequest**](KeyfactorApiModelsAlertsIssuedIssuedAlertCreationRequest.md)| Information for the new alert | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse**](KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="issuedAlertDeleteIssuedAlert"></a>
# **issuedAlertDeleteIssuedAlert**
> issuedAlertDeleteIssuedAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Delete a issued alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.IssuedAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuedAlertApi apiInstance = new IssuedAlertApi(defaultClient);
    Integer id = 56; // Integer | Id for the issued alert
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.issuedAlertDeleteIssuedAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuedAlertApi#issuedAlertDeleteIssuedAlert");
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
| **id** | **Integer**| Id for the issued alert | |
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

<a name="issuedAlertEditIssuedAlert"></a>
# **issuedAlertEditIssuedAlert**
> KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse issuedAlertEditIssuedAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Edit a issued alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.IssuedAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuedAlertApi apiInstance = new IssuedAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsIssuedIssuedAlertUpdateRequest req = new KeyfactorApiModelsAlertsIssuedIssuedAlertUpdateRequest(); // KeyfactorApiModelsAlertsIssuedIssuedAlertUpdateRequest | Information for the issued alert
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse result = apiInstance.issuedAlertEditIssuedAlert(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuedAlertApi#issuedAlertEditIssuedAlert");
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
| **req** | [**KeyfactorApiModelsAlertsIssuedIssuedAlertUpdateRequest**](KeyfactorApiModelsAlertsIssuedIssuedAlertUpdateRequest.md)| Information for the issued alert | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse**](KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="issuedAlertEditSchedule"></a>
# **issuedAlertEditSchedule**
> KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse issuedAlertEditSchedule(xKeyfactorRequestedWith, newSchedule, xKeyfactorApiVersion)

Edit schedule

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.IssuedAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuedAlertApi apiInstance = new IssuedAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest newSchedule = new KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest(); // KeyfactorApiModelsAlertsAlertScheduleAlertScheduleRequest | 
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse result = apiInstance.issuedAlertEditSchedule(xKeyfactorRequestedWith, newSchedule, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuedAlertApi#issuedAlertEditSchedule");
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

<a name="issuedAlertGetIssuedAlert"></a>
# **issuedAlertGetIssuedAlert**
> KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse issuedAlertGetIssuedAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Get a issued alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.IssuedAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuedAlertApi apiInstance = new IssuedAlertApi(defaultClient);
    Integer id = 56; // Integer | Id for the issued alert to get
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse result = apiInstance.issuedAlertGetIssuedAlert(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuedAlertApi#issuedAlertGetIssuedAlert");
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
| **id** | **Integer**| Id for the issued alert to get | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse**](KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="issuedAlertGetIssuedAlerts"></a>
# **issuedAlertGetIssuedAlerts**
> List&lt;KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse&gt; issuedAlertGetIssuedAlerts(xKeyfactorRequestedWith, xKeyfactorApiVersion, pagedQueryQueryString, pagedQueryPageReturned, pagedQueryReturnLimit, pagedQuerySortField, pagedQuerySortAscending)

Gets all issued alerts according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.IssuedAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuedAlertApi apiInstance = new IssuedAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pagedQueryQueryString = "pagedQueryQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pagedQueryPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pagedQueryReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pagedQuerySortField = "pagedQuerySortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pagedQuerySortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse> result = apiInstance.issuedAlertGetIssuedAlerts(xKeyfactorRequestedWith, xKeyfactorApiVersion, pagedQueryQueryString, pagedQueryPageReturned, pagedQueryReturnLimit, pagedQuerySortField, pagedQuerySortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuedAlertApi#issuedAlertGetIssuedAlerts");
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

[**List&lt;KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse&gt;**](KeyfactorApiModelsAlertsIssuedIssuedAlertDefinitionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="issuedAlertGetSchedule"></a>
# **issuedAlertGetSchedule**
> KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse issuedAlertGetSchedule(xKeyfactorRequestedWith, xKeyfactorApiVersion)

Get the schedule for issued alerts

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.IssuedAlertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuedAlertApi apiInstance = new IssuedAlertApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsAlertsAlertScheduleAlertScheduleResponse result = apiInstance.issuedAlertGetSchedule(xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuedAlertApi#issuedAlertGetSchedule");
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


# MonitoringApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**monitoringAddRevocationMonitoring**](MonitoringApi.md#monitoringAddRevocationMonitoring) | **POST** /Monitoring/Revocation | Add a revocation monitoring endpoint |
| [**monitoringDeleteRevocationMonitoring**](MonitoringApi.md#monitoringDeleteRevocationMonitoring) | **DELETE** /Monitoring/Revocation/{id} | Delete a revocation monitoring endpoint |
| [**monitoringEditRevocationMonitoring**](MonitoringApi.md#monitoringEditRevocationMonitoring) | **PUT** /Monitoring/Revocation | Edit a revocation monitoring endpoint |
| [**monitoringGetRevocationMonitoring**](MonitoringApi.md#monitoringGetRevocationMonitoring) | **GET** /Monitoring/Revocation/{id} | Get a revocation monitoring endpoint |
| [**monitoringGetRevocationMonitoringEndpoints**](MonitoringApi.md#monitoringGetRevocationMonitoringEndpoints) | **GET** /Monitoring/Revocation | Gets all revocation monitoring endpoints according to the provided filter and output parameters |
| [**monitoringResolveOCSP**](MonitoringApi.md#monitoringResolveOCSP) | **POST** /Monitoring/ResolveOCSP | Resolve the Certificate authority given |
| [**monitoringTestAllRevocationMonitoringAlert**](MonitoringApi.md#monitoringTestAllRevocationMonitoringAlert) | **POST** /Monitoring/Revocation/TestAll | Test All Alerts |
| [**monitoringTestRevocationMonitoringAlert**](MonitoringApi.md#monitoringTestRevocationMonitoringAlert) | **POST** /Monitoring/Revocation/Test | Test Alert |


<a name="monitoringAddRevocationMonitoring"></a>
# **monitoringAddRevocationMonitoring**
> KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse monitoringAddRevocationMonitoring(xKeyfactorRequestedWith, endpoint, xKeyfactorApiVersion)

Add a revocation monitoring endpoint

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    MonitoringApi apiInstance = new MonitoringApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsMonitoringRevocationMonitoringCreationRequest endpoint = new KeyfactorApiModelsMonitoringRevocationMonitoringCreationRequest(); // KeyfactorApiModelsMonitoringRevocationMonitoringCreationRequest | Information for the new endpoint
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse result = apiInstance.monitoringAddRevocationMonitoring(xKeyfactorRequestedWith, endpoint, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringApi#monitoringAddRevocationMonitoring");
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
| **endpoint** | [**KeyfactorApiModelsMonitoringRevocationMonitoringCreationRequest**](KeyfactorApiModelsMonitoringRevocationMonitoringCreationRequest.md)| Information for the new endpoint | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse**](KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="monitoringDeleteRevocationMonitoring"></a>
# **monitoringDeleteRevocationMonitoring**
> monitoringDeleteRevocationMonitoring(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Delete a revocation monitoring endpoint

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    MonitoringApi apiInstance = new MonitoringApi(defaultClient);
    Integer id = 56; // Integer | Id for the revocation monitoring endpoint
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.monitoringDeleteRevocationMonitoring(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringApi#monitoringDeleteRevocationMonitoring");
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
| **id** | **Integer**| Id for the revocation monitoring endpoint | |
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

<a name="monitoringEditRevocationMonitoring"></a>
# **monitoringEditRevocationMonitoring**
> KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse monitoringEditRevocationMonitoring(xKeyfactorRequestedWith, endpoint, xKeyfactorApiVersion)

Edit a revocation monitoring endpoint

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    MonitoringApi apiInstance = new MonitoringApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest endpoint = new KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest(); // KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest | Information for the endpoint
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse result = apiInstance.monitoringEditRevocationMonitoring(xKeyfactorRequestedWith, endpoint, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringApi#monitoringEditRevocationMonitoring");
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
| **endpoint** | [**KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest**](KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.md)| Information for the endpoint | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse**](KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="monitoringGetRevocationMonitoring"></a>
# **monitoringGetRevocationMonitoring**
> KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse monitoringGetRevocationMonitoring(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Get a revocation monitoring endpoint

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    MonitoringApi apiInstance = new MonitoringApi(defaultClient);
    Integer id = 56; // Integer | Id for the endpoint to get
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse result = apiInstance.monitoringGetRevocationMonitoring(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringApi#monitoringGetRevocationMonitoring");
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
| **id** | **Integer**| Id for the endpoint to get | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse**](KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="monitoringGetRevocationMonitoringEndpoints"></a>
# **monitoringGetRevocationMonitoringEndpoints**
> List&lt;KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse&gt; monitoringGetRevocationMonitoringEndpoints(xKeyfactorRequestedWith, xKeyfactorApiVersion, pagedQueryQueryString, pagedQueryPageReturned, pagedQueryReturnLimit, pagedQuerySortField, pagedQuerySortAscending)

Gets all revocation monitoring endpoints according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    MonitoringApi apiInstance = new MonitoringApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pagedQueryQueryString = "pagedQueryQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pagedQueryPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pagedQueryReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pagedQuerySortField = "pagedQuerySortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pagedQuerySortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse> result = apiInstance.monitoringGetRevocationMonitoringEndpoints(xKeyfactorRequestedWith, xKeyfactorApiVersion, pagedQueryQueryString, pagedQueryPageReturned, pagedQueryReturnLimit, pagedQuerySortField, pagedQuerySortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringApi#monitoringGetRevocationMonitoringEndpoints");
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

[**List&lt;KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse&gt;**](KeyfactorApiModelsMonitoringRevocationMonitoringDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="monitoringResolveOCSP"></a>
# **monitoringResolveOCSP**
> KeyfactorApiModelsMonitoringOCSPParametersResponse monitoringResolveOCSP(xKeyfactorRequestedWith, endpoint, xKeyfactorApiVersion)

Resolve the Certificate authority given

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    MonitoringApi apiInstance = new MonitoringApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsMonitoringOCSPParametersRequest endpoint = new KeyfactorApiModelsMonitoringOCSPParametersRequest(); // KeyfactorApiModelsMonitoringOCSPParametersRequest | Information for the new endpoint
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsMonitoringOCSPParametersResponse result = apiInstance.monitoringResolveOCSP(xKeyfactorRequestedWith, endpoint, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringApi#monitoringResolveOCSP");
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
| **endpoint** | [**KeyfactorApiModelsMonitoringOCSPParametersRequest**](KeyfactorApiModelsMonitoringOCSPParametersRequest.md)| Information for the new endpoint | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsMonitoringOCSPParametersResponse**](KeyfactorApiModelsMonitoringOCSPParametersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="monitoringTestAllRevocationMonitoringAlert"></a>
# **monitoringTestAllRevocationMonitoringAlert**
> KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestResponse monitoringTestAllRevocationMonitoringAlert(xKeyfactorRequestedWith, revocationMonitoringAlertTestRequest, xKeyfactorApiVersion)

Test All Alerts

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    MonitoringApi apiInstance = new MonitoringApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestAllRequest revocationMonitoringAlertTestRequest = new KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestAllRequest(); // KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestAllRequest | Information about the revocation monitoring alert test
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestResponse result = apiInstance.monitoringTestAllRevocationMonitoringAlert(xKeyfactorRequestedWith, revocationMonitoringAlertTestRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringApi#monitoringTestAllRevocationMonitoringAlert");
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
| **revocationMonitoringAlertTestRequest** | [**KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestAllRequest**](KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestAllRequest.md)| Information about the revocation monitoring alert test | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestResponse**](KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="monitoringTestRevocationMonitoringAlert"></a>
# **monitoringTestRevocationMonitoringAlert**
> KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestResponse monitoringTestRevocationMonitoringAlert(xKeyfactorRequestedWith, revocationMonitoringAlertTestRequest, xKeyfactorApiVersion)

Test Alert

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    MonitoringApi apiInstance = new MonitoringApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestRequest revocationMonitoringAlertTestRequest = new KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestRequest(); // KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestRequest | Information about the revocation monitoring alert test
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestResponse result = apiInstance.monitoringTestRevocationMonitoringAlert(xKeyfactorRequestedWith, revocationMonitoringAlertTestRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringApi#monitoringTestRevocationMonitoringAlert");
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
| **revocationMonitoringAlertTestRequest** | [**KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestRequest**](KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestRequest.md)| Information about the revocation monitoring alert test | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestResponse**](KeyfactorApiModelsMonitoringRevocationMonitoringAlertTestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


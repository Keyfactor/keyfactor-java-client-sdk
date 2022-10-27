# ReportsApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reportsCreateCustomReport**](ReportsApi.md#reportsCreateCustomReport) | **POST** /Reports/Custom | Creates a custom report |
| [**reportsCreateReportSchedule**](ReportsApi.md#reportsCreateReportSchedule) | **POST** /Reports/{id}/Schedules | Create a built-in report&#39;s schedule that matches the id of the report. |
| [**reportsDeleteReport**](ReportsApi.md#reportsDeleteReport) | **DELETE** /Reports/Custom/{id} | Delete custom report that matches the id |
| [**reportsDeleteReportSchedule**](ReportsApi.md#reportsDeleteReportSchedule) | **DELETE** /Reports/Schedules/{id} | Delete a built-in report&#39;s schedule that matches the id of the schedule. |
| [**reportsGetCustomReport**](ReportsApi.md#reportsGetCustomReport) | **GET** /Reports/Custom/{id} | Returns a single custom report that matches the id |
| [**reportsGetReport**](ReportsApi.md#reportsGetReport) | **GET** /Reports/{id} | Returns a single built-in report that matches the id |
| [**reportsGetReportParameters**](ReportsApi.md#reportsGetReportParameters) | **GET** /Reports/{id}/Parameters | Get a built-in report&#39;s parameters that matches the id of the report. |
| [**reportsGetReportSchedule**](ReportsApi.md#reportsGetReportSchedule) | **GET** /Reports/Schedules/{id} | Get a built-in report&#39;s schedule that matches the id of the schedule. |
| [**reportsGetReportSchedules**](ReportsApi.md#reportsGetReportSchedules) | **GET** /Reports/{id}/Schedules | Get a built-in report&#39;s schedules that matches the id of the report. |
| [**reportsQueryCustomReports**](ReportsApi.md#reportsQueryCustomReports) | **GET** /Reports/Custom | Returns all custom reports according to the provided filter and output parameters |
| [**reportsQueryReports**](ReportsApi.md#reportsQueryReports) | **GET** /Reports | Returns all built-in reports according to the provided filter and output parameters |
| [**reportsUpdateCustomReport**](ReportsApi.md#reportsUpdateCustomReport) | **PUT** /Reports/Custom | Updates a custom report that matches the id |
| [**reportsUpdateReport**](ReportsApi.md#reportsUpdateReport) | **PUT** /Reports | Updates a single built-in report that matches the id. Only some fields can be updated. |
| [**reportsUpdateReportParameters**](ReportsApi.md#reportsUpdateReportParameters) | **PUT** /Reports/{id}/Parameters | Update a built-in report&#39;s parameters that matches the id of the report. |
| [**reportsUpdateReportSchedule**](ReportsApi.md#reportsUpdateReportSchedule) | **PUT** /Reports/{id}/Schedules | Update a built-in report&#39;s schedule that matches the id of the report. |


<a name="reportsCreateCustomReport"></a>
# **reportsCreateCustomReport**
> ModelsCustomReport reportsCreateCustomReport(xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Creates a custom report

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsCustomReportCreationRequest request = new ModelsCustomReportCreationRequest(); // ModelsCustomReportCreationRequest | Report Information
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCustomReport result = apiInstance.reportsCreateCustomReport(xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsCreateCustomReport");
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
| **request** | [**ModelsCustomReportCreationRequest**](ModelsCustomReportCreationRequest.md)| Report Information | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCustomReport**](ModelsCustomReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="reportsCreateReportSchedule"></a>
# **reportsCreateReportSchedule**
> ModelsReportSchedule reportsCreateReportSchedule(id, xKeyfactorRequestedWith, schedule, xKeyfactorApiVersion)

Create a built-in report&#39;s schedule that matches the id of the report.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    Integer id = 56; // Integer | Report identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsReportSchedule schedule = new ModelsReportSchedule(); // ModelsReportSchedule | Report Schedule
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsReportSchedule result = apiInstance.reportsCreateReportSchedule(id, xKeyfactorRequestedWith, schedule, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsCreateReportSchedule");
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
| **id** | **Integer**| Report identifier | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **schedule** | [**ModelsReportSchedule**](ModelsReportSchedule.md)| Report Schedule | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsReportSchedule**](ModelsReportSchedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="reportsDeleteReport"></a>
# **reportsDeleteReport**
> reportsDeleteReport(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Delete custom report that matches the id

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    Integer id = 56; // Integer | Report identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.reportsDeleteReport(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsDeleteReport");
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
| **id** | **Integer**| Report identifier | |
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

<a name="reportsDeleteReportSchedule"></a>
# **reportsDeleteReportSchedule**
> reportsDeleteReportSchedule(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Delete a built-in report&#39;s schedule that matches the id of the schedule.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    Integer id = 56; // Integer | Report Schedule identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.reportsDeleteReportSchedule(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsDeleteReportSchedule");
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
| **id** | **Integer**| Report Schedule identifier | |
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

<a name="reportsGetCustomReport"></a>
# **reportsGetCustomReport**
> ModelsCustomReport reportsGetCustomReport(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns a single custom report that matches the id

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    Integer id = 56; // Integer | Report identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCustomReport result = apiInstance.reportsGetCustomReport(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetCustomReport");
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
| **id** | **Integer**| Report identifier | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCustomReport**](ModelsCustomReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="reportsGetReport"></a>
# **reportsGetReport**
> ModelsReport reportsGetReport(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns a single built-in report that matches the id

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    Integer id = 56; // Integer | Report identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsReport result = apiInstance.reportsGetReport(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetReport");
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
| **id** | **Integer**| Report identifier | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsReport**](ModelsReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="reportsGetReportParameters"></a>
# **reportsGetReportParameters**
> List&lt;ModelsReportParameters&gt; reportsGetReportParameters(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Get a built-in report&#39;s parameters that matches the id of the report.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    Integer id = 56; // Integer | Report identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<ModelsReportParameters> result = apiInstance.reportsGetReportParameters(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetReportParameters");
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
| **id** | **Integer**| Report identifier | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;ModelsReportParameters&gt;**](ModelsReportParameters.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="reportsGetReportSchedule"></a>
# **reportsGetReportSchedule**
> ModelsReportSchedule reportsGetReportSchedule(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Get a built-in report&#39;s schedule that matches the id of the schedule.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    Integer id = 56; // Integer | Report Schedule identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsReportSchedule result = apiInstance.reportsGetReportSchedule(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetReportSchedule");
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
| **id** | **Integer**| Report Schedule identifier | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsReportSchedule**](ModelsReportSchedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="reportsGetReportSchedules"></a>
# **reportsGetReportSchedules**
> List&lt;ModelsReportSchedule&gt; reportsGetReportSchedules(id, xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Get a built-in report&#39;s schedules that matches the id of the report.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    Integer id = 56; // Integer | Report identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsReportSchedule> result = apiInstance.reportsGetReportSchedules(id, xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsGetReportSchedules");
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
| **id** | **Integer**| Report identifier | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |
| **pqQueryString** | **String**| Contents of the query (ex: field1 -eq value1 AND field2 -gt value2) | [optional] |
| **pqPageReturned** | **Integer**| The current page within the result set to be returned | [optional] |
| **pqReturnLimit** | **Integer**| Maximum number of records to be returned in a single call | [optional] |
| **pqSortField** | **String**| Field by which the results should be sorted (view results via Management Portal for sortable columns) | [optional] |
| **pqSortAscending** | **Integer**| Field sort direction [0&#x3D;ascending, 1&#x3D;descending] | [optional] [enum: 0, 1] |

### Return type

[**List&lt;ModelsReportSchedule&gt;**](ModelsReportSchedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="reportsQueryCustomReports"></a>
# **reportsQueryCustomReports**
> List&lt;ModelsCustomReport&gt; reportsQueryCustomReports(xKeyfactorRequestedWith, xKeyfactorApiVersion, queryQueryString, queryPageReturned, queryReturnLimit, querySortField, querySortAscending)

Returns all custom reports according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String queryQueryString = "queryQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer queryPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer queryReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String querySortField = "querySortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer querySortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsCustomReport> result = apiInstance.reportsQueryCustomReports(xKeyfactorRequestedWith, xKeyfactorApiVersion, queryQueryString, queryPageReturned, queryReturnLimit, querySortField, querySortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsQueryCustomReports");
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
| **queryQueryString** | **String**| Contents of the query (ex: field1 -eq value1 AND field2 -gt value2) | [optional] |
| **queryPageReturned** | **Integer**| The current page within the result set to be returned | [optional] |
| **queryReturnLimit** | **Integer**| Maximum number of records to be returned in a single call | [optional] |
| **querySortField** | **String**| Field by which the results should be sorted (view results via Management Portal for sortable columns) | [optional] |
| **querySortAscending** | **Integer**| Field sort direction [0&#x3D;ascending, 1&#x3D;descending] | [optional] [enum: 0, 1] |

### Return type

[**List&lt;ModelsCustomReport&gt;**](ModelsCustomReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="reportsQueryReports"></a>
# **reportsQueryReports**
> List&lt;ModelsReport&gt; reportsQueryReports(xKeyfactorRequestedWith, xKeyfactorApiVersion, queryQueryString, queryPageReturned, queryReturnLimit, querySortField, querySortAscending)

Returns all built-in reports according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String queryQueryString = "queryQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer queryPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer queryReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String querySortField = "querySortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer querySortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsReport> result = apiInstance.reportsQueryReports(xKeyfactorRequestedWith, xKeyfactorApiVersion, queryQueryString, queryPageReturned, queryReturnLimit, querySortField, querySortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsQueryReports");
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
| **queryQueryString** | **String**| Contents of the query (ex: field1 -eq value1 AND field2 -gt value2) | [optional] |
| **queryPageReturned** | **Integer**| The current page within the result set to be returned | [optional] |
| **queryReturnLimit** | **Integer**| Maximum number of records to be returned in a single call | [optional] |
| **querySortField** | **String**| Field by which the results should be sorted (view results via Management Portal for sortable columns) | [optional] |
| **querySortAscending** | **Integer**| Field sort direction [0&#x3D;ascending, 1&#x3D;descending] | [optional] [enum: 0, 1] |

### Return type

[**List&lt;ModelsReport&gt;**](ModelsReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="reportsUpdateCustomReport"></a>
# **reportsUpdateCustomReport**
> ModelsCustomReport reportsUpdateCustomReport(xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Updates a custom report that matches the id

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsCustomReportUpdateRequest request = new ModelsCustomReportUpdateRequest(); // ModelsCustomReportUpdateRequest | Report Information
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCustomReport result = apiInstance.reportsUpdateCustomReport(xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsUpdateCustomReport");
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
| **request** | [**ModelsCustomReportUpdateRequest**](ModelsCustomReportUpdateRequest.md)| Report Information | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCustomReport**](ModelsCustomReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="reportsUpdateReport"></a>
# **reportsUpdateReport**
> ModelsReport reportsUpdateReport(xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Updates a single built-in report that matches the id. Only some fields can be updated.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsReportRequestModel request = new ModelsReportRequestModel(); // ModelsReportRequestModel | This object is used to update the Favorite, In Navigator and the Remove Duplicates if the 'Uses Collections' is true.
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsReport result = apiInstance.reportsUpdateReport(xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsUpdateReport");
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
| **request** | [**ModelsReportRequestModel**](ModelsReportRequestModel.md)| This object is used to update the Favorite, In Navigator and the Remove Duplicates if the &#39;Uses Collections&#39; is true. | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsReport**](ModelsReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="reportsUpdateReportParameters"></a>
# **reportsUpdateReportParameters**
> List&lt;ModelsReportParameters&gt; reportsUpdateReportParameters(id, xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Update a built-in report&#39;s parameters that matches the id of the report.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    Integer id = 56; // Integer | Report identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<ModelsReportParametersRequest> request = Arrays.asList(); // List<ModelsReportParametersRequest> | A List of the parameters to be updated
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<ModelsReportParameters> result = apiInstance.reportsUpdateReportParameters(id, xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsUpdateReportParameters");
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
| **id** | **Integer**| Report identifier | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **request** | [**List&lt;ModelsReportParametersRequest&gt;**](ModelsReportParametersRequest.md)| A List of the parameters to be updated | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;ModelsReportParameters&gt;**](ModelsReportParameters.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="reportsUpdateReportSchedule"></a>
# **reportsUpdateReportSchedule**
> ModelsReportSchedule reportsUpdateReportSchedule(id, xKeyfactorRequestedWith, schedule, xKeyfactorApiVersion)

Update a built-in report&#39;s schedule that matches the id of the report.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    Integer id = 56; // Integer | Report identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsReportSchedule schedule = new ModelsReportSchedule(); // ModelsReportSchedule | Report Schedule
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsReportSchedule result = apiInstance.reportsUpdateReportSchedule(id, xKeyfactorRequestedWith, schedule, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#reportsUpdateReportSchedule");
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
| **id** | **Integer**| Report identifier | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **schedule** | [**ModelsReportSchedule**](ModelsReportSchedule.md)| Report Schedule | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsReportSchedule**](ModelsReportSchedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


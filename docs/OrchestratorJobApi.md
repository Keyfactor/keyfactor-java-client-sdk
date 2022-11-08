# OrchestratorJobApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**orchestratorJobAcknowledgeJobs**](OrchestratorJobApi.md#orchestratorJobAcknowledgeJobs) | **POST** /OrchestratorJobs/Acknowledge | Acknowledges orchestrator jobs based on the provided information |
| [**orchestratorJobGetCustomJobResultData**](OrchestratorJobApi.md#orchestratorJobGetCustomJobResultData) | **GET** /OrchestratorJobs/JobStatus/Data | Retrieves the results of a custom job using the provided information |
| [**orchestratorJobGetJobHistory**](OrchestratorJobApi.md#orchestratorJobGetJobHistory) | **GET** /OrchestratorJobs/JobHistory | Returns all histories of an orchestrator job according to the provided filter and output parameters |
| [**orchestratorJobGetScheduledJobs**](OrchestratorJobApi.md#orchestratorJobGetScheduledJobs) | **GET** /OrchestratorJobs/ScheduledJobs | Returns all scheduled orchestrator jobs according to the provided filter and output parameters |
| [**orchestratorJobRescheduleJobs**](OrchestratorJobApi.md#orchestratorJobRescheduleJobs) | **POST** /OrchestratorJobs/Reschedule | Reschedules orchestrator jobs based on the provided information |
| [**orchestratorJobScheduleBulkJob**](OrchestratorJobApi.md#orchestratorJobScheduleBulkJob) | **POST** /OrchestratorJobs/Custom/Bulk | Schedules the same job for a custom JobType on the specified agents using the provided information |
| [**orchestratorJobScheduleJob**](OrchestratorJobApi.md#orchestratorJobScheduleJob) | **POST** /OrchestratorJobs/Custom | Schedules a job for a custom JobType on the agent using the provided information |
| [**orchestratorJobUnscheduleJobs**](OrchestratorJobApi.md#orchestratorJobUnscheduleJobs) | **POST** /OrchestratorJobs/Unschedule | Unschedules orchestrator jobs based on the provided information |


<a name="orchestratorJobAcknowledgeJobs"></a>
# **orchestratorJobAcknowledgeJobs**
> orchestratorJobAcknowledgeJobs(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Acknowledges orchestrator jobs based on the provided information

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.OrchestratorJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OrchestratorJobApi apiInstance = new OrchestratorJobApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsOrchestratorJobsAcknowledgeJobRequest req = new KeyfactorApiModelsOrchestratorJobsAcknowledgeJobRequest(); // KeyfactorApiModelsOrchestratorJobsAcknowledgeJobRequest | Information to identify the jobs to acknowledge, either a query or a list of job identifiers
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.orchestratorJobAcknowledgeJobs(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrchestratorJobApi#orchestratorJobAcknowledgeJobs");
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
| **req** | [**KeyfactorApiModelsOrchestratorJobsAcknowledgeJobRequest**](KeyfactorApiModelsOrchestratorJobsAcknowledgeJobRequest.md)| Information to identify the jobs to acknowledge, either a query or a list of job identifiers | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="orchestratorJobGetCustomJobResultData"></a>
# **orchestratorJobGetCustomJobResultData**
> KeyfactorApiModelsOrchestratorJobsCustomJobResultDataResponse orchestratorJobGetCustomJobResultData(jobHistoryId, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Retrieves the results of a custom job using the provided information

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.OrchestratorJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OrchestratorJobApi apiInstance = new OrchestratorJobApi(defaultClient);
    Long jobHistoryId = 56L; // Long | Identifier of the job history record to retrieve
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsOrchestratorJobsCustomJobResultDataResponse result = apiInstance.orchestratorJobGetCustomJobResultData(jobHistoryId, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrchestratorJobApi#orchestratorJobGetCustomJobResultData");
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
| **jobHistoryId** | **Long**| Identifier of the job history record to retrieve | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsOrchestratorJobsCustomJobResultDataResponse**](KeyfactorApiModelsOrchestratorJobsCustomJobResultDataResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="orchestratorJobGetJobHistory"></a>
# **orchestratorJobGetJobHistory**
> List&lt;KeyfactorApiModelsCertificateStoresJobHistoryResponse&gt; orchestratorJobGetJobHistory(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Returns all histories of an orchestrator job according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.OrchestratorJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OrchestratorJobApi apiInstance = new OrchestratorJobApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsCertificateStoresJobHistoryResponse> result = apiInstance.orchestratorJobGetJobHistory(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrchestratorJobApi#orchestratorJobGetJobHistory");
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

[**List&lt;KeyfactorApiModelsCertificateStoresJobHistoryResponse&gt;**](KeyfactorApiModelsCertificateStoresJobHistoryResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="orchestratorJobGetScheduledJobs"></a>
# **orchestratorJobGetScheduledJobs**
> List&lt;ModelsOrchestratorJobsJob&gt; orchestratorJobGetScheduledJobs(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Returns all scheduled orchestrator jobs according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.OrchestratorJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OrchestratorJobApi apiInstance = new OrchestratorJobApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsOrchestratorJobsJob> result = apiInstance.orchestratorJobGetScheduledJobs(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrchestratorJobApi#orchestratorJobGetScheduledJobs");
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

[**List&lt;ModelsOrchestratorJobsJob&gt;**](ModelsOrchestratorJobsJob.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="orchestratorJobRescheduleJobs"></a>
# **orchestratorJobRescheduleJobs**
> orchestratorJobRescheduleJobs(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Reschedules orchestrator jobs based on the provided information

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.OrchestratorJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OrchestratorJobApi apiInstance = new OrchestratorJobApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsOrchestratorJobsRescheduleJobRequest req = new KeyfactorApiModelsOrchestratorJobsRescheduleJobRequest(); // KeyfactorApiModelsOrchestratorJobsRescheduleJobRequest | Information to identify the jobs to reschedule, either a query or a list of job identifiers
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.orchestratorJobRescheduleJobs(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrchestratorJobApi#orchestratorJobRescheduleJobs");
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
| **req** | [**KeyfactorApiModelsOrchestratorJobsRescheduleJobRequest**](KeyfactorApiModelsOrchestratorJobsRescheduleJobRequest.md)| Information to identify the jobs to reschedule, either a query or a list of job identifiers | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="orchestratorJobScheduleBulkJob"></a>
# **orchestratorJobScheduleBulkJob**
> KeyfactorApiModelsOrchestratorJobsBulkJobResponse orchestratorJobScheduleBulkJob(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Schedules the same job for a custom JobType on the specified agents using the provided information

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.OrchestratorJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OrchestratorJobApi apiInstance = new OrchestratorJobApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsOrchestratorJobsScheduleBulkJobRequest req = new ModelsOrchestratorJobsScheduleBulkJobRequest(); // ModelsOrchestratorJobsScheduleBulkJobRequest | Information to use to schedule the jobs, including the type of custom job, agents to use, and job-specific parameters.
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsOrchestratorJobsBulkJobResponse result = apiInstance.orchestratorJobScheduleBulkJob(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrchestratorJobApi#orchestratorJobScheduleBulkJob");
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
| **req** | [**ModelsOrchestratorJobsScheduleBulkJobRequest**](ModelsOrchestratorJobsScheduleBulkJobRequest.md)| Information to use to schedule the jobs, including the type of custom job, agents to use, and job-specific parameters. | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsOrchestratorJobsBulkJobResponse**](KeyfactorApiModelsOrchestratorJobsBulkJobResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="orchestratorJobScheduleJob"></a>
# **orchestratorJobScheduleJob**
> KeyfactorApiModelsOrchestratorJobsJobResponse orchestratorJobScheduleJob(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Schedules a job for a custom JobType on the agent using the provided information

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.OrchestratorJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OrchestratorJobApi apiInstance = new OrchestratorJobApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsOrchestratorJobsScheduleJobRequest req = new ModelsOrchestratorJobsScheduleJobRequest(); // ModelsOrchestratorJobsScheduleJobRequest | Information to use to schedule the job, including the type of custom job, agent to use, and job-specific parameters.
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsOrchestratorJobsJobResponse result = apiInstance.orchestratorJobScheduleJob(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrchestratorJobApi#orchestratorJobScheduleJob");
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
| **req** | [**ModelsOrchestratorJobsScheduleJobRequest**](ModelsOrchestratorJobsScheduleJobRequest.md)| Information to use to schedule the job, including the type of custom job, agent to use, and job-specific parameters. | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsOrchestratorJobsJobResponse**](KeyfactorApiModelsOrchestratorJobsJobResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="orchestratorJobUnscheduleJobs"></a>
# **orchestratorJobUnscheduleJobs**
> orchestratorJobUnscheduleJobs(xKeyfactorRequestedWith, req, xKeyfactorApiVersion)

Unschedules orchestrator jobs based on the provided information

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.OrchestratorJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OrchestratorJobApi apiInstance = new OrchestratorJobApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsOrchestratorJobsUnscheduleJobRequest req = new KeyfactorApiModelsOrchestratorJobsUnscheduleJobRequest(); // KeyfactorApiModelsOrchestratorJobsUnscheduleJobRequest | Information to identify the orchestrator jobs to unschedule, either a query or a list of job identifiers
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.orchestratorJobUnscheduleJobs(xKeyfactorRequestedWith, req, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrchestratorJobApi#orchestratorJobUnscheduleJobs");
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
| **req** | [**KeyfactorApiModelsOrchestratorJobsUnscheduleJobRequest**](KeyfactorApiModelsOrchestratorJobsUnscheduleJobRequest.md)| Information to identify the orchestrator jobs to unschedule, either a query or a list of job identifiers | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |


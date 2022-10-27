# WorkflowInstanceApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workflowInstanceDeleteInstance**](WorkflowInstanceApi.md#workflowInstanceDeleteInstance) | **DELETE** /Workflow/Instances/{instanceId} | Deletes the specified instance. |
| [**workflowInstanceGet**](WorkflowInstanceApi.md#workflowInstanceGet) | **GET** /Workflow/Instances/{instanceId} | Get information relevant for knowing where an instance is in its workflow. |
| [**workflowInstanceQuery**](WorkflowInstanceApi.md#workflowInstanceQuery) | **GET** /Workflow/Instances | Gets the workflow instances matching the query specifications. |
| [**workflowInstanceQueryInstancesAssignedToMe**](WorkflowInstanceApi.md#workflowInstanceQueryInstancesAssignedToMe) | **GET** /Workflow/Instances/AssignedToMe | Gets the workflow instances waiting on the user. |
| [**workflowInstanceQueryInstancesStartedByMe**](WorkflowInstanceApi.md#workflowInstanceQueryInstancesStartedByMe) | **GET** /Workflow/Instances/My | Gets the workflow instances started by the user. |
| [**workflowInstanceRestart**](WorkflowInstanceApi.md#workflowInstanceRestart) | **POST** /Workflow/Instances/{instanceId}/Restart | Restarts a failed instance against the specified definition version or the published version if no version is specified. |
| [**workflowInstanceSignal**](WorkflowInstanceApi.md#workflowInstanceSignal) | **POST** /Workflow/Instances/{instanceId}/Signals | Receives the given signal for the given instance. |
| [**workflowInstanceStop**](WorkflowInstanceApi.md#workflowInstanceStop) | **POST** /Workflow/Instances/{instanceId}/Stop | Rejects an instance, preventing it from continuing. |


<a name="workflowInstanceDeleteInstance"></a>
# **workflowInstanceDeleteInstance**
> workflowInstanceDeleteInstance(instanceId, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Deletes the specified instance.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowInstanceApi apiInstance = new WorkflowInstanceApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | The Id of the instance to be deleted.
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.workflowInstanceDeleteInstance(instanceId, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowInstanceApi#workflowInstanceDeleteInstance");
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
| **instanceId** | **UUID**| The Id of the instance to be deleted. | |
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

<a name="workflowInstanceGet"></a>
# **workflowInstanceGet**
> KeyfactorApiModelsWorkflowsInstanceResponse workflowInstanceGet(instanceId, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Get information relevant for knowing where an instance is in its workflow.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowInstanceApi apiInstance = new WorkflowInstanceApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | The {System.Guid} identifying the instance.
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsWorkflowsInstanceResponse result = apiInstance.workflowInstanceGet(instanceId, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowInstanceApi#workflowInstanceGet");
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
| **instanceId** | **UUID**| The {System.Guid} identifying the instance. | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsWorkflowsInstanceResponse**](KeyfactorApiModelsWorkflowsInstanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="workflowInstanceQuery"></a>
# **workflowInstanceQuery**
> List&lt;KeyfactorApiModelsWorkflowsInstanceQueryResponse&gt; workflowInstanceQuery(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Gets the workflow instances matching the query specifications.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowInstanceApi apiInstance = new WorkflowInstanceApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsWorkflowsInstanceQueryResponse> result = apiInstance.workflowInstanceQuery(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowInstanceApi#workflowInstanceQuery");
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

[**List&lt;KeyfactorApiModelsWorkflowsInstanceQueryResponse&gt;**](KeyfactorApiModelsWorkflowsInstanceQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="workflowInstanceQueryInstancesAssignedToMe"></a>
# **workflowInstanceQueryInstancesAssignedToMe**
> List&lt;KeyfactorApiModelsWorkflowsInstanceQueryResponse&gt; workflowInstanceQueryInstancesAssignedToMe(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Gets the workflow instances waiting on the user.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowInstanceApi apiInstance = new WorkflowInstanceApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsWorkflowsInstanceQueryResponse> result = apiInstance.workflowInstanceQueryInstancesAssignedToMe(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowInstanceApi#workflowInstanceQueryInstancesAssignedToMe");
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

[**List&lt;KeyfactorApiModelsWorkflowsInstanceQueryResponse&gt;**](KeyfactorApiModelsWorkflowsInstanceQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="workflowInstanceQueryInstancesStartedByMe"></a>
# **workflowInstanceQueryInstancesStartedByMe**
> List&lt;KeyfactorApiModelsWorkflowsInstanceQueryResponse&gt; workflowInstanceQueryInstancesStartedByMe(xKeyfactorRequestedWith, xKeyfactorApiVersion, instanceQueryQueryString, instanceQueryPageReturned, instanceQueryReturnLimit, instanceQuerySortField, instanceQuerySortAscending)

Gets the workflow instances started by the user.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowInstanceApi apiInstance = new WorkflowInstanceApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String instanceQueryQueryString = "instanceQueryQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer instanceQueryPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer instanceQueryReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String instanceQuerySortField = "instanceQuerySortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer instanceQuerySortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsWorkflowsInstanceQueryResponse> result = apiInstance.workflowInstanceQueryInstancesStartedByMe(xKeyfactorRequestedWith, xKeyfactorApiVersion, instanceQueryQueryString, instanceQueryPageReturned, instanceQueryReturnLimit, instanceQuerySortField, instanceQuerySortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowInstanceApi#workflowInstanceQueryInstancesStartedByMe");
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
| **instanceQueryQueryString** | **String**| Contents of the query (ex: field1 -eq value1 AND field2 -gt value2) | [optional] |
| **instanceQueryPageReturned** | **Integer**| The current page within the result set to be returned | [optional] |
| **instanceQueryReturnLimit** | **Integer**| Maximum number of records to be returned in a single call | [optional] |
| **instanceQuerySortField** | **String**| Field by which the results should be sorted (view results via Management Portal for sortable columns) | [optional] |
| **instanceQuerySortAscending** | **Integer**| Field sort direction [0&#x3D;ascending, 1&#x3D;descending] | [optional] [enum: 0, 1] |

### Return type

[**List&lt;KeyfactorApiModelsWorkflowsInstanceQueryResponse&gt;**](KeyfactorApiModelsWorkflowsInstanceQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="workflowInstanceRestart"></a>
# **workflowInstanceRestart**
> workflowInstanceRestart(instanceId, xKeyfactorRequestedWith, version, xKeyfactorApiVersion)

Restarts a failed instance against the specified definition version or the published version if no version is specified.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowInstanceApi apiInstance = new WorkflowInstanceApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | The instance Id to restart.
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Integer version = 56; // Integer | The version of the definition to restart the instance against. Defaults to the published version.
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.workflowInstanceRestart(instanceId, xKeyfactorRequestedWith, version, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowInstanceApi#workflowInstanceRestart");
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
| **instanceId** | **UUID**| The instance Id to restart. | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **version** | **Integer**| The version of the definition to restart the instance against. Defaults to the published version. | [optional] |
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

<a name="workflowInstanceSignal"></a>
# **workflowInstanceSignal**
> workflowInstanceSignal(instanceId, xKeyfactorRequestedWith, signal, xKeyfactorApiVersion)

Receives the given signal for the given instance.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowInstanceApi apiInstance = new WorkflowInstanceApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | The instance that is receiving the signal.
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsWorkflowsSignalRequest signal = new KeyfactorApiModelsWorkflowsSignalRequest(); // KeyfactorApiModelsWorkflowsSignalRequest | The signal to receive.
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.workflowInstanceSignal(instanceId, xKeyfactorRequestedWith, signal, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowInstanceApi#workflowInstanceSignal");
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
| **instanceId** | **UUID**| The instance that is receiving the signal. | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **signal** | [**KeyfactorApiModelsWorkflowsSignalRequest**](KeyfactorApiModelsWorkflowsSignalRequest.md)| The signal to receive. | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="workflowInstanceStop"></a>
# **workflowInstanceStop**
> workflowInstanceStop(instanceId, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Rejects an instance, preventing it from continuing.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowInstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowInstanceApi apiInstance = new WorkflowInstanceApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | The Id of the instance to reject.
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.workflowInstanceStop(instanceId, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowInstanceApi#workflowInstanceStop");
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
| **instanceId** | **UUID**| The Id of the instance to reject. | |
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


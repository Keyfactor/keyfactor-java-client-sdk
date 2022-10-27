# AgentApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**agentApprove**](AgentApi.md#agentApprove) | **POST** /Agents/Approve | Approve a list of agents |
| [**agentDisapprove**](AgentApi.md#agentDisapprove) | **POST** /Agents/Disapprove | Disapprove a list of agents |
| [**agentFetchLogs**](AgentApi.md#agentFetchLogs) | **POST** /Agents/{id}/FetchLogs | Schedules a job on the agent to retrieve log files |
| [**agentGetAgentDetail**](AgentApi.md#agentGetAgentDetail) | **GET** /Agents/{id} | Returns details for a single agent, specified by ID |
| [**agentGetAgents**](AgentApi.md#agentGetAgents) | **GET** /Agents | Returns all agents according to the provided filter and output parameters |
| [**agentReset0**](AgentApi.md#agentReset0) | **POST** /Agents/Reset | Reset a list of agents |
| [**agentReset1**](AgentApi.md#agentReset1) | **POST** /Agents/{id}/Reset | Reset an agent to a new state |
| [**agentSetAuthCertificateReenrollment**](AgentApi.md#agentSetAuthCertificateReenrollment) | **POST** /Agents/SetAuthCertificateReenrollment | Update the AuthCertificateReenrollment value for an agent to request or require (or unset the request) the agent   to enroll for a new client authentication certificate on its next registration. |


<a name="agentApprove"></a>
# **agentApprove**
> agentApprove(xKeyfactorRequestedWith, agentIds, xKeyfactorApiVersion)

Approve a list of agents

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentApi apiInstance = new AgentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<String> agentIds = Arrays.asList(); // List<String> | List of Agent Ids to Approve
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.agentApprove(xKeyfactorRequestedWith, agentIds, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#agentApprove");
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
| **agentIds** | [**List&lt;String&gt;**](String.md)| List of Agent Ids to Approve | |
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

<a name="agentDisapprove"></a>
# **agentDisapprove**
> agentDisapprove(xKeyfactorRequestedWith, agentIds, xKeyfactorApiVersion)

Disapprove a list of agents

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentApi apiInstance = new AgentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<String> agentIds = Arrays.asList(); // List<String> | List of Agent Ids to Disapprove
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.agentDisapprove(xKeyfactorRequestedWith, agentIds, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#agentDisapprove");
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
| **agentIds** | [**List&lt;String&gt;**](String.md)| List of Agent Ids to Disapprove | |
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

<a name="agentFetchLogs"></a>
# **agentFetchLogs**
> agentFetchLogs(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Schedules a job on the agent to retrieve log files

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentApi apiInstance = new AgentApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Guid Id of the agent to schedule the job for.
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.agentFetchLogs(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#agentFetchLogs");
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
| **id** | **UUID**| Guid Id of the agent to schedule the job for. | |
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

<a name="agentGetAgentDetail"></a>
# **agentGetAgentDetail**
> KeyfactorApiModelsOrchestratorsAgentResponse agentGetAgentDetail(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns details for a single agent, specified by ID

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentApi apiInstance = new AgentApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Agent Id to Search
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsOrchestratorsAgentResponse result = apiInstance.agentGetAgentDetail(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#agentGetAgentDetail");
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
| **id** | **UUID**| Agent Id to Search | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsOrchestratorsAgentResponse**](KeyfactorApiModelsOrchestratorsAgentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="agentGetAgents"></a>
# **agentGetAgents**
> List&lt;KeyfactorApiModelsOrchestratorsAgentResponse&gt; agentGetAgents(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Returns all agents according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentApi apiInstance = new AgentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsOrchestratorsAgentResponse> result = apiInstance.agentGetAgents(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#agentGetAgents");
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

[**List&lt;KeyfactorApiModelsOrchestratorsAgentResponse&gt;**](KeyfactorApiModelsOrchestratorsAgentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="agentReset0"></a>
# **agentReset0**
> agentReset0(xKeyfactorRequestedWith, agentIds, xKeyfactorApiVersion)

Reset a list of agents

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentApi apiInstance = new AgentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<String> agentIds = Arrays.asList(); // List<String> | List of Agent Ids to Reset
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.agentReset0(xKeyfactorRequestedWith, agentIds, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#agentReset0");
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
| **agentIds** | [**List&lt;String&gt;**](String.md)| List of Agent Ids to Reset | |
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

<a name="agentReset1"></a>
# **agentReset1**
> agentReset1(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Reset an agent to a new state

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentApi apiInstance = new AgentApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Guid Id of Agent to reset
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.agentReset1(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#agentReset1");
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
| **id** | **UUID**| Guid Id of Agent to reset | |
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

<a name="agentSetAuthCertificateReenrollment"></a>
# **agentSetAuthCertificateReenrollment**
> KeyfactorApiModelsOrchestratorsUpdateOrchestratorAuthCertificateReenrollmentResponse agentSetAuthCertificateReenrollment(xKeyfactorRequestedWith, authCertReenrollmentRequest, xKeyfactorApiVersion)

Update the AuthCertificateReenrollment value for an agent to request or require (or unset the request) the agent   to enroll for a new client authentication certificate on its next registration.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentApi apiInstance = new AgentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsOrchestratorsUpdateOrchestratorAuthCertificateReenrollmentRequest authCertReenrollmentRequest = new KeyfactorApiModelsOrchestratorsUpdateOrchestratorAuthCertificateReenrollmentRequest(); // KeyfactorApiModelsOrchestratorsUpdateOrchestratorAuthCertificateReenrollmentRequest | Object containing orchestrator ids and the new status those orchestrators should have
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsOrchestratorsUpdateOrchestratorAuthCertificateReenrollmentResponse result = apiInstance.agentSetAuthCertificateReenrollment(xKeyfactorRequestedWith, authCertReenrollmentRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#agentSetAuthCertificateReenrollment");
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
| **authCertReenrollmentRequest** | [**KeyfactorApiModelsOrchestratorsUpdateOrchestratorAuthCertificateReenrollmentRequest**](KeyfactorApiModelsOrchestratorsUpdateOrchestratorAuthCertificateReenrollmentRequest.md)| Object containing orchestrator ids and the new status those orchestrators should have | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsOrchestratorsUpdateOrchestratorAuthCertificateReenrollmentResponse**](KeyfactorApiModelsOrchestratorsUpdateOrchestratorAuthCertificateReenrollmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


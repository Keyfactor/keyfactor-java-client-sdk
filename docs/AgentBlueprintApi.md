# AgentBlueprintApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**agentBlueprintApplyBlueprint**](AgentBlueprintApi.md#agentBlueprintApplyBlueprint) | **POST** /AgentBluePrint/ApplyBlueprint | Applies the selected agent blueprint to the provided agents |
| [**agentBlueprintDeleteBlueprint**](AgentBlueprintApi.md#agentBlueprintDeleteBlueprint) | **DELETE** /AgentBluePrint/{id} | Deletes an agent blueprint by its Keyfactor identifier |
| [**agentBlueprintGenerateBlueprint**](AgentBlueprintApi.md#agentBlueprintGenerateBlueprint) | **POST** /AgentBluePrint/GenerateBluePrint | Generates an agent blueprint from the provided agents |
| [**agentBlueprintGetAgentBlueprint**](AgentBlueprintApi.md#agentBlueprintGetAgentBlueprint) | **GET** /AgentBluePrint/{id} | Returns an agent blueprint according to the provided filter and output parameters |
| [**agentBlueprintGetAgentBlueprints**](AgentBlueprintApi.md#agentBlueprintGetAgentBlueprints) | **GET** /AgentBluePrint | Returns all agent blueprints according to the provided filter and output parameters |
| [**agentBlueprintGetBlueprintJobs**](AgentBlueprintApi.md#agentBlueprintGetBlueprintJobs) | **GET** /AgentBluePrint/{id}/Jobs | Gets the agent blueprint scheduled jobs |
| [**agentBlueprintGetBlueprintStores**](AgentBlueprintApi.md#agentBlueprintGetBlueprintStores) | **GET** /AgentBluePrint/{id}/Stores | Gets the agent blueprint certificate stores |


<a name="agentBlueprintApplyBlueprint"></a>
# **agentBlueprintApplyBlueprint**
> agentBlueprintApplyBlueprint(templateId, xKeyfactorRequestedWith, agentIds, xKeyfactorApiVersion)

Applies the selected agent blueprint to the provided agents

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentBlueprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentBlueprintApi apiInstance = new AgentBlueprintApi(defaultClient);
    UUID templateId = UUID.randomUUID(); // UUID | Agent blueprint to apply to the agents
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<UUID> agentIds = Arrays.asList(); // List<UUID> | Agents to apply the blueprints to
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.agentBlueprintApplyBlueprint(templateId, xKeyfactorRequestedWith, agentIds, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentBlueprintApi#agentBlueprintApplyBlueprint");
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
| **templateId** | **UUID**| Agent blueprint to apply to the agents | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **agentIds** | [**List&lt;UUID&gt;**](UUID.md)| Agents to apply the blueprints to | |
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

<a name="agentBlueprintDeleteBlueprint"></a>
# **agentBlueprintDeleteBlueprint**
> agentBlueprintDeleteBlueprint(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Deletes an agent blueprint by its Keyfactor identifier

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentBlueprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentBlueprintApi apiInstance = new AgentBlueprintApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Keyfactor agent blueprint identifier (GUID)
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.agentBlueprintDeleteBlueprint(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentBlueprintApi#agentBlueprintDeleteBlueprint");
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
| **id** | **UUID**| Keyfactor agent blueprint identifier (GUID) | |
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

<a name="agentBlueprintGenerateBlueprint"></a>
# **agentBlueprintGenerateBlueprint**
> KeyfactorApiModelsOrchestratorsAgentBlueprintResponse agentBlueprintGenerateBlueprint(agentId, name, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Generates an agent blueprint from the provided agents

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentBlueprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentBlueprintApi apiInstance = new AgentBlueprintApi(defaultClient);
    UUID agentId = UUID.randomUUID(); // UUID | Agent to generate a blueprint from
    String name = "name_example"; // String | Name of the new agent blueprint
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsOrchestratorsAgentBlueprintResponse result = apiInstance.agentBlueprintGenerateBlueprint(agentId, name, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentBlueprintApi#agentBlueprintGenerateBlueprint");
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
| **agentId** | **UUID**| Agent to generate a blueprint from | |
| **name** | **String**| Name of the new agent blueprint | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsOrchestratorsAgentBlueprintResponse**](KeyfactorApiModelsOrchestratorsAgentBlueprintResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="agentBlueprintGetAgentBlueprint"></a>
# **agentBlueprintGetAgentBlueprint**
> KeyfactorApiModelsOrchestratorsAgentBlueprintResponse agentBlueprintGetAgentBlueprint(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns an agent blueprint according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentBlueprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentBlueprintApi apiInstance = new AgentBlueprintApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Returns a single agent blueprint associated with the provided id
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsOrchestratorsAgentBlueprintResponse result = apiInstance.agentBlueprintGetAgentBlueprint(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentBlueprintApi#agentBlueprintGetAgentBlueprint");
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
| **id** | **UUID**| Returns a single agent blueprint associated with the provided id | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsOrchestratorsAgentBlueprintResponse**](KeyfactorApiModelsOrchestratorsAgentBlueprintResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="agentBlueprintGetAgentBlueprints"></a>
# **agentBlueprintGetAgentBlueprints**
> List&lt;KeyfactorApiModelsOrchestratorsAgentBlueprintResponse&gt; agentBlueprintGetAgentBlueprints(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Returns all agent blueprints according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentBlueprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentBlueprintApi apiInstance = new AgentBlueprintApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (OperationStart, OperationEnd, UserName)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsOrchestratorsAgentBlueprintResponse> result = apiInstance.agentBlueprintGetAgentBlueprints(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentBlueprintApi#agentBlueprintGetAgentBlueprints");
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
| **pqPageReturned** | **Integer**| The current page within the result set to be returned | [optional] |
| **pqReturnLimit** | **Integer**| Maximum number of records to be returned in a single call | [optional] |
| **pqSortField** | **String**| Field by which the results should be sorted (OperationStart, OperationEnd, UserName) | [optional] |
| **pqSortAscending** | **Integer**| Field sort direction [0&#x3D;ascending, 1&#x3D;descending] | [optional] [enum: 0, 1] |

### Return type

[**List&lt;KeyfactorApiModelsOrchestratorsAgentBlueprintResponse&gt;**](KeyfactorApiModelsOrchestratorsAgentBlueprintResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="agentBlueprintGetBlueprintJobs"></a>
# **agentBlueprintGetBlueprintJobs**
> List&lt;KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse&gt; agentBlueprintGetBlueprintJobs(id, xKeyfactorRequestedWith, xKeyfactorApiVersion, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Gets the agent blueprint scheduled jobs

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentBlueprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentBlueprintApi apiInstance = new AgentBlueprintApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (OperationStart, OperationEnd, UserName)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse> result = apiInstance.agentBlueprintGetBlueprintJobs(id, xKeyfactorRequestedWith, xKeyfactorApiVersion, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentBlueprintApi#agentBlueprintGetBlueprintJobs");
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
| **id** | **UUID**|  | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |
| **pqPageReturned** | **Integer**| The current page within the result set to be returned | [optional] |
| **pqReturnLimit** | **Integer**| Maximum number of records to be returned in a single call | [optional] |
| **pqSortField** | **String**| Field by which the results should be sorted (OperationStart, OperationEnd, UserName) | [optional] |
| **pqSortAscending** | **Integer**| Field sort direction [0&#x3D;ascending, 1&#x3D;descending] | [optional] [enum: 0, 1] |

### Return type

[**List&lt;KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse&gt;**](KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="agentBlueprintGetBlueprintStores"></a>
# **agentBlueprintGetBlueprintStores**
> List&lt;KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse&gt; agentBlueprintGetBlueprintStores(id, xKeyfactorRequestedWith, xKeyfactorApiVersion, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Gets the agent blueprint certificate stores

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.AgentBlueprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    AgentBlueprintApi apiInstance = new AgentBlueprintApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (OperationStart, OperationEnd, UserName)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse> result = apiInstance.agentBlueprintGetBlueprintStores(id, xKeyfactorRequestedWith, xKeyfactorApiVersion, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentBlueprintApi#agentBlueprintGetBlueprintStores");
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
| **id** | **UUID**|  | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |
| **pqPageReturned** | **Integer**| The current page within the result set to be returned | [optional] |
| **pqReturnLimit** | **Integer**| Maximum number of records to be returned in a single call | [optional] |
| **pqSortField** | **String**| Field by which the results should be sorted (OperationStart, OperationEnd, UserName) | [optional] |
| **pqSortAscending** | **Integer**| Field sort direction [0&#x3D;ascending, 1&#x3D;descending] | [optional] [enum: 0, 1] |

### Return type

[**List&lt;KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse&gt;**](KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


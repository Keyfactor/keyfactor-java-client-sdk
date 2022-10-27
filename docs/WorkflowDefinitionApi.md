# WorkflowDefinitionApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workflowDefinitionConfigureDefinitionSteps**](WorkflowDefinitionApi.md#workflowDefinitionConfigureDefinitionSteps) | **PUT** /Workflow/Definitions/{definitionId}/Steps | Sets the provided steps on the latest version of the definition. |
| [**workflowDefinitionCreateNewDefinition**](WorkflowDefinitionApi.md#workflowDefinitionCreateNewDefinition) | **POST** /Workflow/Definitions | Creates a new base definition without any steps. |
| [**workflowDefinitionDelete**](WorkflowDefinitionApi.md#workflowDefinitionDelete) | **DELETE** /Workflow/Definitions/{definitionId} | Deletes the definition matching the given Id. |
| [**workflowDefinitionGet**](WorkflowDefinitionApi.md#workflowDefinitionGet) | **GET** /Workflow/Definitions/{definitionId} | Gets a workflow definition. |
| [**workflowDefinitionGetStepSchema**](WorkflowDefinitionApi.md#workflowDefinitionGetStepSchema) | **GET** /Workflow/Definitions/Steps/{extensionName} | Gets the schema of a given step with the specified extension name. |
| [**workflowDefinitionPublishDefinition**](WorkflowDefinitionApi.md#workflowDefinitionPublishDefinition) | **POST** /Workflow/Definitions/{definitionId}/Publish | Makes the most recent version of a Workflow Definition the published version. |
| [**workflowDefinitionQuery**](WorkflowDefinitionApi.md#workflowDefinitionQuery) | **GET** /Workflow/Definitions | Gets the Definitions matching the query specifications. |
| [**workflowDefinitionQueryAvailableSteps**](WorkflowDefinitionApi.md#workflowDefinitionQueryAvailableSteps) | **GET** /Workflow/Definitions/Steps | Gets the result set of available steps for a given query. |
| [**workflowDefinitionQueryWorkflowTypes**](WorkflowDefinitionApi.md#workflowDefinitionQueryWorkflowTypes) | **GET** /Workflow/Definitions/Types | Performs a query against the workflow types in the system. |
| [**workflowDefinitionUpdateExistingDefinition**](WorkflowDefinitionApi.md#workflowDefinitionUpdateExistingDefinition) | **PUT** /Workflow/Definitions/{definitionId} | Updates the existing definition&#39;s DisplayName and Description. |


<a name="workflowDefinitionConfigureDefinitionSteps"></a>
# **workflowDefinitionConfigureDefinitionSteps**
> KeyfactorApiModelsWorkflowsDefinitionResponse workflowDefinitionConfigureDefinitionSteps(definitionId, xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Sets the provided steps on the latest version of the definition.

If the latest version is also the published version, a new version will be created and the steps will be set on that new version.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowDefinitionApi apiInstance = new WorkflowDefinitionApi(defaultClient);
    UUID definitionId = UUID.randomUUID(); // UUID | The Id of the definition.
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<KeyfactorApiModelsWorkflowsDefinitionStepRequest> request = Arrays.asList(); // List<KeyfactorApiModelsWorkflowsDefinitionStepRequest> | A collection of {KeyfactorApi.Models.Workflows.DefinitionStepRequest} defining the steps to set on the definition.
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsWorkflowsDefinitionResponse result = apiInstance.workflowDefinitionConfigureDefinitionSteps(definitionId, xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowDefinitionApi#workflowDefinitionConfigureDefinitionSteps");
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
| **definitionId** | **UUID**| The Id of the definition. | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **request** | [**List&lt;KeyfactorApiModelsWorkflowsDefinitionStepRequest&gt;**](KeyfactorApiModelsWorkflowsDefinitionStepRequest.md)| A collection of {KeyfactorApi.Models.Workflows.DefinitionStepRequest} defining the steps to set on the definition. | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsWorkflowsDefinitionResponse**](KeyfactorApiModelsWorkflowsDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="workflowDefinitionCreateNewDefinition"></a>
# **workflowDefinitionCreateNewDefinition**
> KeyfactorApiModelsWorkflowsDefinitionResponse workflowDefinitionCreateNewDefinition(xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Creates a new base definition without any steps.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowDefinitionApi apiInstance = new WorkflowDefinitionApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsWorkflowsDefinitionCreateRequest request = new KeyfactorApiModelsWorkflowsDefinitionCreateRequest(); // KeyfactorApiModelsWorkflowsDefinitionCreateRequest | A {KeyfactorApi.Models.Workflows.DefinitionCreateRequest} with the display name, description, key and type of the definition.
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsWorkflowsDefinitionResponse result = apiInstance.workflowDefinitionCreateNewDefinition(xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowDefinitionApi#workflowDefinitionCreateNewDefinition");
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
| **request** | [**KeyfactorApiModelsWorkflowsDefinitionCreateRequest**](KeyfactorApiModelsWorkflowsDefinitionCreateRequest.md)| A {KeyfactorApi.Models.Workflows.DefinitionCreateRequest} with the display name, description, key and type of the definition. | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsWorkflowsDefinitionResponse**](KeyfactorApiModelsWorkflowsDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="workflowDefinitionDelete"></a>
# **workflowDefinitionDelete**
> workflowDefinitionDelete(definitionId, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Deletes the definition matching the given Id.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowDefinitionApi apiInstance = new WorkflowDefinitionApi(defaultClient);
    UUID definitionId = UUID.randomUUID(); // UUID | The Workflow Definition Id.
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.workflowDefinitionDelete(definitionId, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowDefinitionApi#workflowDefinitionDelete");
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
| **definitionId** | **UUID**| The Workflow Definition Id. | |
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

<a name="workflowDefinitionGet"></a>
# **workflowDefinitionGet**
> KeyfactorApiModelsWorkflowsDefinitionResponse workflowDefinitionGet(definitionId, xKeyfactorRequestedWith, definitionVersion, exportable, xKeyfactorApiVersion)

Gets a workflow definition.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowDefinitionApi apiInstance = new WorkflowDefinitionApi(defaultClient);
    UUID definitionId = UUID.randomUUID(); // UUID | The Id of the definition to retrieve.
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Integer definitionVersion = 56; // Integer | The version to retrieve. If this value is not specified, the latest version will be returned.
    Boolean exportable = true; // Boolean | Indicates if the response should be cleansed of role ids for export.
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsWorkflowsDefinitionResponse result = apiInstance.workflowDefinitionGet(definitionId, xKeyfactorRequestedWith, definitionVersion, exportable, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowDefinitionApi#workflowDefinitionGet");
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
| **definitionId** | **UUID**| The Id of the definition to retrieve. | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **definitionVersion** | **Integer**| The version to retrieve. If this value is not specified, the latest version will be returned. | [optional] |
| **exportable** | **Boolean**| Indicates if the response should be cleansed of role ids for export. | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsWorkflowsDefinitionResponse**](KeyfactorApiModelsWorkflowsDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="workflowDefinitionGetStepSchema"></a>
# **workflowDefinitionGetStepSchema**
> KeyfactorApiModelsWorkflowsAvailableStepResponse workflowDefinitionGetStepSchema(extensionName, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Gets the schema of a given step with the specified extension name.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowDefinitionApi apiInstance = new WorkflowDefinitionApi(defaultClient);
    String extensionName = "extensionName_example"; // String | The extension name of a specific step in the step schema.
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsWorkflowsAvailableStepResponse result = apiInstance.workflowDefinitionGetStepSchema(extensionName, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowDefinitionApi#workflowDefinitionGetStepSchema");
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
| **extensionName** | **String**| The extension name of a specific step in the step schema. | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsWorkflowsAvailableStepResponse**](KeyfactorApiModelsWorkflowsAvailableStepResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="workflowDefinitionPublishDefinition"></a>
# **workflowDefinitionPublishDefinition**
> KeyfactorApiModelsWorkflowsDefinitionResponse workflowDefinitionPublishDefinition(definitionId, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Makes the most recent version of a Workflow Definition the published version.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowDefinitionApi apiInstance = new WorkflowDefinitionApi(defaultClient);
    UUID definitionId = UUID.randomUUID(); // UUID | The Workflow Definition Id.
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsWorkflowsDefinitionResponse result = apiInstance.workflowDefinitionPublishDefinition(definitionId, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowDefinitionApi#workflowDefinitionPublishDefinition");
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
| **definitionId** | **UUID**| The Workflow Definition Id. | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsWorkflowsDefinitionResponse**](KeyfactorApiModelsWorkflowsDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="workflowDefinitionQuery"></a>
# **workflowDefinitionQuery**
> List&lt;KeyfactorApiModelsWorkflowsDefinitionQueryResponse&gt; workflowDefinitionQuery(xKeyfactorRequestedWith, xKeyfactorApiVersion, queryQueryString, queryPageReturned, queryReturnLimit, querySortField, querySortAscending)

Gets the Definitions matching the query specifications.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowDefinitionApi apiInstance = new WorkflowDefinitionApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String queryQueryString = "queryQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer queryPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer queryReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String querySortField = "querySortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer querySortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsWorkflowsDefinitionQueryResponse> result = apiInstance.workflowDefinitionQuery(xKeyfactorRequestedWith, xKeyfactorApiVersion, queryQueryString, queryPageReturned, queryReturnLimit, querySortField, querySortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowDefinitionApi#workflowDefinitionQuery");
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

[**List&lt;KeyfactorApiModelsWorkflowsDefinitionQueryResponse&gt;**](KeyfactorApiModelsWorkflowsDefinitionQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="workflowDefinitionQueryAvailableSteps"></a>
# **workflowDefinitionQueryAvailableSteps**
> List&lt;KeyfactorApiModelsWorkflowsAvailableStepQueryResponse&gt; workflowDefinitionQueryAvailableSteps(xKeyfactorRequestedWith, xKeyfactorApiVersion, queryQueryString, queryPageReturned, queryReturnLimit, querySortField, querySortAscending)

Gets the result set of available steps for a given query.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowDefinitionApi apiInstance = new WorkflowDefinitionApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String queryQueryString = "queryQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer queryPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer queryReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String querySortField = "querySortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer querySortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsWorkflowsAvailableStepQueryResponse> result = apiInstance.workflowDefinitionQueryAvailableSteps(xKeyfactorRequestedWith, xKeyfactorApiVersion, queryQueryString, queryPageReturned, queryReturnLimit, querySortField, querySortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowDefinitionApi#workflowDefinitionQueryAvailableSteps");
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

[**List&lt;KeyfactorApiModelsWorkflowsAvailableStepQueryResponse&gt;**](KeyfactorApiModelsWorkflowsAvailableStepQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="workflowDefinitionQueryWorkflowTypes"></a>
# **workflowDefinitionQueryWorkflowTypes**
> List&lt;KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse&gt; workflowDefinitionQueryWorkflowTypes(xKeyfactorRequestedWith, xKeyfactorApiVersion, queryQueryString, queryPageReturned, queryReturnLimit, querySortField, querySortAscending)

Performs a query against the workflow types in the system.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowDefinitionApi apiInstance = new WorkflowDefinitionApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String queryQueryString = "queryQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer queryPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer queryReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String querySortField = "querySortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer querySortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse> result = apiInstance.workflowDefinitionQueryWorkflowTypes(xKeyfactorRequestedWith, xKeyfactorApiVersion, queryQueryString, queryPageReturned, queryReturnLimit, querySortField, querySortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowDefinitionApi#workflowDefinitionQueryWorkflowTypes");
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

[**List&lt;KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse&gt;**](KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="workflowDefinitionUpdateExistingDefinition"></a>
# **workflowDefinitionUpdateExistingDefinition**
> KeyfactorApiModelsWorkflowsDefinitionResponse workflowDefinitionUpdateExistingDefinition(definitionId, xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Updates the existing definition&#39;s DisplayName and Description.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.WorkflowDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    WorkflowDefinitionApi apiInstance = new WorkflowDefinitionApi(defaultClient);
    UUID definitionId = UUID.randomUUID(); // UUID | The Id of the definition to update.
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsWorkflowsDefinitionUpdateRequest request = new KeyfactorApiModelsWorkflowsDefinitionUpdateRequest(); // KeyfactorApiModelsWorkflowsDefinitionUpdateRequest | The {KeyfactorApi.Models.Workflows.DefinitionUpdateRequest} holding the updated DispalyName and Description.
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsWorkflowsDefinitionResponse result = apiInstance.workflowDefinitionUpdateExistingDefinition(definitionId, xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowDefinitionApi#workflowDefinitionUpdateExistingDefinition");
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
| **definitionId** | **UUID**| The Id of the definition to update. | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **request** | [**KeyfactorApiModelsWorkflowsDefinitionUpdateRequest**](KeyfactorApiModelsWorkflowsDefinitionUpdateRequest.md)| The {KeyfactorApi.Models.Workflows.DefinitionUpdateRequest} holding the updated DispalyName and Description. | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsWorkflowsDefinitionResponse**](KeyfactorApiModelsWorkflowsDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


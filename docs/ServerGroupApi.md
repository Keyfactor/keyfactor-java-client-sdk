# ServerGroupApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**serverGroupAddAccess**](ServerGroupApi.md#serverGroupAddAccess) | **POST** /SSH/ServerGroups/Access | Add access rules to the server group |
| [**serverGroupCreateServerGroup**](ServerGroupApi.md#serverGroupCreateServerGroup) | **POST** /SSH/ServerGroups | Creates a server group with the provided properties |
| [**serverGroupDelete**](ServerGroupApi.md#serverGroupDelete) | **DELETE** /SSH/ServerGroups/{id} | Deletes a ServerGroup associated with the provided identifier |
| [**serverGroupGetAccess**](ServerGroupApi.md#serverGroupGetAccess) | **GET** /SSH/ServerGroups/Access/{id} | Retrieves logons and users with access to those logons for an existing server group |
| [**serverGroupGetGroup**](ServerGroupApi.md#serverGroupGetGroup) | **GET** /SSH/ServerGroups/{id} | Returns a ServerGroup associated with the provided identifier |
| [**serverGroupGetGroupByName**](ServerGroupApi.md#serverGroupGetGroupByName) | **GET** /SSH/ServerGroups/{name} | Returns a ServerGroup associated with the provided identifier |
| [**serverGroupQueryServerGroups**](ServerGroupApi.md#serverGroupQueryServerGroups) | **GET** /SSH/ServerGroups | Returns all server groups according to the provided filter parameters |
| [**serverGroupRemoveAccess**](ServerGroupApi.md#serverGroupRemoveAccess) | **DELETE** /SSH/ServerGroups/Access | Removes access mappings for the specified server group |
| [**serverGroupUpdateServerGroup**](ServerGroupApi.md#serverGroupUpdateServerGroup) | **PUT** /SSH/ServerGroups | Updates an existing server group with the provided properties |


<a name="serverGroupAddAccess"></a>
# **serverGroupAddAccess**
> ModelsSSHAccessServerGroupAccessResponse serverGroupAddAccess(xKeyfactorRequestedWith, accessRequest, xKeyfactorApiVersion)

Add access rules to the server group

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerGroupApi apiInstance = new ServerGroupApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsSSHAccessServerGroupAccessRequest accessRequest = new ModelsSSHAccessServerGroupAccessRequest(); // ModelsSSHAccessServerGroupAccessRequest | 
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHAccessServerGroupAccessResponse result = apiInstance.serverGroupAddAccess(xKeyfactorRequestedWith, accessRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerGroupApi#serverGroupAddAccess");
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
| **accessRequest** | [**ModelsSSHAccessServerGroupAccessRequest**](ModelsSSHAccessServerGroupAccessRequest.md)|  | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHAccessServerGroupAccessResponse**](ModelsSSHAccessServerGroupAccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serverGroupCreateServerGroup"></a>
# **serverGroupCreateServerGroup**
> ModelsSSHServerGroupsServerGroupResponse serverGroupCreateServerGroup(xKeyfactorRequestedWith, serverGroupCreationRequest, xKeyfactorApiVersion)

Creates a server group with the provided properties

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerGroupApi apiInstance = new ServerGroupApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsSSHServerGroupsServerGroupCreationRequest serverGroupCreationRequest = new ModelsSSHServerGroupsServerGroupCreationRequest(); // ModelsSSHServerGroupsServerGroupCreationRequest | Server group properties to be applied to the new group
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHServerGroupsServerGroupResponse result = apiInstance.serverGroupCreateServerGroup(xKeyfactorRequestedWith, serverGroupCreationRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerGroupApi#serverGroupCreateServerGroup");
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
| **serverGroupCreationRequest** | [**ModelsSSHServerGroupsServerGroupCreationRequest**](ModelsSSHServerGroupsServerGroupCreationRequest.md)| Server group properties to be applied to the new group | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHServerGroupsServerGroupResponse**](ModelsSSHServerGroupsServerGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serverGroupDelete"></a>
# **serverGroupDelete**
> serverGroupDelete(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Deletes a ServerGroup associated with the provided identifier

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerGroupApi apiInstance = new ServerGroupApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Keyfactor identifer of the ServerGroup to be deleted
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.serverGroupDelete(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerGroupApi#serverGroupDelete");
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
| **id** | **UUID**| Keyfactor identifer of the ServerGroup to be deleted | |
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

<a name="serverGroupGetAccess"></a>
# **serverGroupGetAccess**
> ModelsSSHAccessServerGroupAccessResponse serverGroupGetAccess(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Retrieves logons and users with access to those logons for an existing server group

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerGroupApi apiInstance = new ServerGroupApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Id of the existing server group
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHAccessServerGroupAccessResponse result = apiInstance.serverGroupGetAccess(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerGroupApi#serverGroupGetAccess");
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
| **id** | **UUID**| Id of the existing server group | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHAccessServerGroupAccessResponse**](ModelsSSHAccessServerGroupAccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serverGroupGetGroup"></a>
# **serverGroupGetGroup**
> ModelsSSHServerGroupsServerGroupResponse serverGroupGetGroup(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns a ServerGroup associated with the provided identifier

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerGroupApi apiInstance = new ServerGroupApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Keyfactor identifier of the ServerGroup
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHServerGroupsServerGroupResponse result = apiInstance.serverGroupGetGroup(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerGroupApi#serverGroupGetGroup");
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
| **id** | **UUID**| Keyfactor identifier of the ServerGroup | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHServerGroupsServerGroupResponse**](ModelsSSHServerGroupsServerGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serverGroupGetGroupByName"></a>
# **serverGroupGetGroupByName**
> ModelsSSHServerGroupsServerGroupResponse serverGroupGetGroupByName(name, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns a ServerGroup associated with the provided identifier

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerGroupApi apiInstance = new ServerGroupApi(defaultClient);
    String name = "name_example"; // String | name of the ServerGroup
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHServerGroupsServerGroupResponse result = apiInstance.serverGroupGetGroupByName(name, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerGroupApi#serverGroupGetGroupByName");
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
| **name** | **String**| name of the ServerGroup | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHServerGroupsServerGroupResponse**](ModelsSSHServerGroupsServerGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serverGroupQueryServerGroups"></a>
# **serverGroupQueryServerGroups**
> List&lt;ModelsSSHServerGroupsServerGroupResponse&gt; serverGroupQueryServerGroups(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Returns all server groups according to the provided filter parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerGroupApi apiInstance = new ServerGroupApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsSSHServerGroupsServerGroupResponse> result = apiInstance.serverGroupQueryServerGroups(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerGroupApi#serverGroupQueryServerGroups");
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

[**List&lt;ModelsSSHServerGroupsServerGroupResponse&gt;**](ModelsSSHServerGroupsServerGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serverGroupRemoveAccess"></a>
# **serverGroupRemoveAccess**
> ModelsSSHAccessServerGroupAccessResponse serverGroupRemoveAccess(xKeyfactorRequestedWith, accessRequest, xKeyfactorApiVersion)

Removes access mappings for the specified server group

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerGroupApi apiInstance = new ServerGroupApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsSSHAccessServerGroupAccessRequest accessRequest = new ModelsSSHAccessServerGroupAccessRequest(); // ModelsSSHAccessServerGroupAccessRequest | 
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHAccessServerGroupAccessResponse result = apiInstance.serverGroupRemoveAccess(xKeyfactorRequestedWith, accessRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerGroupApi#serverGroupRemoveAccess");
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
| **accessRequest** | [**ModelsSSHAccessServerGroupAccessRequest**](ModelsSSHAccessServerGroupAccessRequest.md)|  | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHAccessServerGroupAccessResponse**](ModelsSSHAccessServerGroupAccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serverGroupUpdateServerGroup"></a>
# **serverGroupUpdateServerGroup**
> ModelsSSHServerGroupsServerGroupResponse serverGroupUpdateServerGroup(xKeyfactorRequestedWith, updateRequest, xKeyfactorApiVersion)

Updates an existing server group with the provided properties

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerGroupApi apiInstance = new ServerGroupApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsSSHServerGroupsServerGroupUpdateRequest updateRequest = new ModelsSSHServerGroupsServerGroupUpdateRequest(); // ModelsSSHServerGroupsServerGroupUpdateRequest | Server group properties to be applied to the existing group
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHServerGroupsServerGroupResponse result = apiInstance.serverGroupUpdateServerGroup(xKeyfactorRequestedWith, updateRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerGroupApi#serverGroupUpdateServerGroup");
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
| **updateRequest** | [**ModelsSSHServerGroupsServerGroupUpdateRequest**](ModelsSSHServerGroupsServerGroupUpdateRequest.md)| Server group properties to be applied to the existing group | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHServerGroupsServerGroupResponse**](ModelsSSHServerGroupsServerGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


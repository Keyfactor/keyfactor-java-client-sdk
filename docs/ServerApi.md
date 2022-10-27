# ServerApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**serverAddAccess**](ServerApi.md#serverAddAccess) | **POST** /SSH/Servers/Access | Updates logons and users with access to those logons for an existing server |
| [**serverCreateServer**](ServerApi.md#serverCreateServer) | **POST** /SSH/Servers | Creates a server with the provided properties |
| [**serverDelete**](ServerApi.md#serverDelete) | **DELETE** /SSH/Servers/{id} | Deletes a Server associated with the provided identifier |
| [**serverGet**](ServerApi.md#serverGet) | **GET** /SSH/Servers/{id} | Returns a Server associated with the provided identifier |
| [**serverGetAccess**](ServerApi.md#serverGetAccess) | **GET** /SSH/Servers/Access/{id} | Retrieves logons and users with access to those logons for an existing server |
| [**serverQueryServers**](ServerApi.md#serverQueryServers) | **GET** /SSH/Servers | Returns all servers according to the provided filter parameters |
| [**serverRemoveAccess**](ServerApi.md#serverRemoveAccess) | **DELETE** /SSH/Servers/Access | Updates logons and users with access to those logons for an existing server |
| [**serverUpdateServer**](ServerApi.md#serverUpdateServer) | **PUT** /SSH/Servers | Updates an existing server with the provided properties |


<a name="serverAddAccess"></a>
# **serverAddAccess**
> ModelsSSHAccessServerAccessResponse serverAddAccess(xKeyfactorRequestedWith, serverAccess, xKeyfactorApiVersion)

Updates logons and users with access to those logons for an existing server

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerApi apiInstance = new ServerApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsSSHAccessServerAccessRequest serverAccess = new ModelsSSHAccessServerAccessRequest(); // ModelsSSHAccessServerAccessRequest | Logons and users to be applied to the existing server
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHAccessServerAccessResponse result = apiInstance.serverAddAccess(xKeyfactorRequestedWith, serverAccess, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerApi#serverAddAccess");
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
| **serverAccess** | [**ModelsSSHAccessServerAccessRequest**](ModelsSSHAccessServerAccessRequest.md)| Logons and users to be applied to the existing server | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHAccessServerAccessResponse**](ModelsSSHAccessServerAccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serverCreateServer"></a>
# **serverCreateServer**
> ModelsSSHServersServerResponse serverCreateServer(xKeyfactorRequestedWith, creationRequest, xKeyfactorApiVersion)

Creates a server with the provided properties

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerApi apiInstance = new ServerApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsSSHServersServerCreationRequest creationRequest = new ModelsSSHServersServerCreationRequest(); // ModelsSSHServersServerCreationRequest | Server properties to be applied to the newserver
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHServersServerResponse result = apiInstance.serverCreateServer(xKeyfactorRequestedWith, creationRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerApi#serverCreateServer");
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
| **creationRequest** | [**ModelsSSHServersServerCreationRequest**](ModelsSSHServersServerCreationRequest.md)| Server properties to be applied to the newserver | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHServersServerResponse**](ModelsSSHServersServerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serverDelete"></a>
# **serverDelete**
> serverDelete(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Deletes a Server associated with the provided identifier

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerApi apiInstance = new ServerApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identifer of the Server to be deleted
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.serverDelete(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerApi#serverDelete");
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
| **id** | **Integer**| Keyfactor identifer of the Server to be deleted | |
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

<a name="serverGet"></a>
# **serverGet**
> ModelsSSHServersServerResponse serverGet(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns a Server associated with the provided identifier

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerApi apiInstance = new ServerApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identifier of the Server
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHServersServerResponse result = apiInstance.serverGet(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerApi#serverGet");
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
| **id** | **Integer**| Keyfactor identifier of the Server | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHServersServerResponse**](ModelsSSHServersServerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serverGetAccess"></a>
# **serverGetAccess**
> ModelsSSHAccessServerAccessResponse serverGetAccess(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Retrieves logons and users with access to those logons for an existing server

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerApi apiInstance = new ServerApi(defaultClient);
    Integer id = 56; // Integer | Id of the existing server
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHAccessServerAccessResponse result = apiInstance.serverGetAccess(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerApi#serverGetAccess");
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
| **id** | **Integer**| Id of the existing server | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHAccessServerAccessResponse**](ModelsSSHAccessServerAccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serverQueryServers"></a>
# **serverQueryServers**
> List&lt;ModelsSSHServersServerResponse&gt; serverQueryServers(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Returns all servers according to the provided filter parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerApi apiInstance = new ServerApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsSSHServersServerResponse> result = apiInstance.serverQueryServers(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerApi#serverQueryServers");
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

[**List&lt;ModelsSSHServersServerResponse&gt;**](ModelsSSHServersServerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serverRemoveAccess"></a>
# **serverRemoveAccess**
> ModelsSSHAccessServerAccessResponse serverRemoveAccess(xKeyfactorRequestedWith, serverAccess, xKeyfactorApiVersion)

Updates logons and users with access to those logons for an existing server

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerApi apiInstance = new ServerApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsSSHAccessServerAccessRequest serverAccess = new ModelsSSHAccessServerAccessRequest(); // ModelsSSHAccessServerAccessRequest | Logons and users to be removed from the existing server
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHAccessServerAccessResponse result = apiInstance.serverRemoveAccess(xKeyfactorRequestedWith, serverAccess, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerApi#serverRemoveAccess");
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
| **serverAccess** | [**ModelsSSHAccessServerAccessRequest**](ModelsSSHAccessServerAccessRequest.md)| Logons and users to be removed from the existing server | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHAccessServerAccessResponse**](ModelsSSHAccessServerAccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serverUpdateServer"></a>
# **serverUpdateServer**
> ModelsSSHServersServerResponse serverUpdateServer(xKeyfactorRequestedWith, updateRequest, xKeyfactorApiVersion)

Updates an existing server with the provided properties

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    ServerApi apiInstance = new ServerApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsSSHServersServerUpdateRequest updateRequest = new ModelsSSHServersServerUpdateRequest(); // ModelsSSHServersServerUpdateRequest | Server properties to be applied to the existing server
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHServersServerResponse result = apiInstance.serverUpdateServer(xKeyfactorRequestedWith, updateRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerApi#serverUpdateServer");
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
| **updateRequest** | [**ModelsSSHServersServerUpdateRequest**](ModelsSSHServersServerUpdateRequest.md)| Server properties to be applied to the existing server | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHServersServerResponse**](ModelsSSHServersServerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


# ServiceAccountApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**serviceAccountCreateServiceAccount**](ServiceAccountApi.md#serviceAccountCreateServiceAccount) | **POST** /SSH/ServiceAccounts | Creates a ServiceAccount with the provided properties |
| [**serviceAccountDeleteServiceAccount**](ServiceAccountApi.md#serviceAccountDeleteServiceAccount) | **DELETE** /SSH/ServiceAccounts/{id} | Deletes a ServiceAccount associated with the provided identifier |
| [**serviceAccountDeleteServiceAccounts**](ServiceAccountApi.md#serviceAccountDeleteServiceAccounts) | **DELETE** /SSH/ServiceAccounts | Deletes Service Accounts associated with the provided identifiers |
| [**serviceAccountGet**](ServiceAccountApi.md#serviceAccountGet) | **GET** /SSH/ServiceAccounts/{id} | Returns a ServiceAccount associated with the provided identifier |
| [**serviceAccountGetServiceAccountKey**](ServiceAccountApi.md#serviceAccountGetServiceAccountKey) | **GET** /SSH/ServiceAccounts/Key/{id} | Returns an SSH key with or without private key based on the provided parameters. |
| [**serviceAccountQueryServiceAccounts**](ServiceAccountApi.md#serviceAccountQueryServiceAccounts) | **GET** /SSH/ServiceAccounts | Returns all ServiceAccounts according to the provided filter parameters |
| [**serviceAccountRotateServiceAccountKey**](ServiceAccountApi.md#serviceAccountRotateServiceAccountKey) | **POST** /SSH/ServiceAccounts/Rotate/{id} | Rotate an SSH key for a specified service account. |
| [**serviceAccountUpdateServiceAccount**](ServiceAccountApi.md#serviceAccountUpdateServiceAccount) | **PUT** /SSH/ServiceAccounts | Updates an SSH key for a specified service account. |


<a name="serviceAccountCreateServiceAccount"></a>
# **serviceAccountCreateServiceAccount**
> ModelsSSHServiceAccountsServiceAccountResponse serviceAccountCreateServiceAccount(xKeyfactorRequestedWith, serviceAccount, xKeyfactorApiVersion)

Creates a ServiceAccount with the provided properties

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServiceAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ServiceAccountApi apiInstance = new ServiceAccountApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsSSHServiceAccountsServiceAccountCreationRequest serviceAccount = new ModelsSSHServiceAccountsServiceAccountCreationRequest(); // ModelsSSHServiceAccountsServiceAccountCreationRequest | ServiceAccount properties to be applied to the new ServiceAccount
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHServiceAccountsServiceAccountResponse result = apiInstance.serviceAccountCreateServiceAccount(xKeyfactorRequestedWith, serviceAccount, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountApi#serviceAccountCreateServiceAccount");
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
| **serviceAccount** | [**ModelsSSHServiceAccountsServiceAccountCreationRequest**](ModelsSSHServiceAccountsServiceAccountCreationRequest.md)| ServiceAccount properties to be applied to the new ServiceAccount | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHServiceAccountsServiceAccountResponse**](ModelsSSHServiceAccountsServiceAccountResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serviceAccountDeleteServiceAccount"></a>
# **serviceAccountDeleteServiceAccount**
> serviceAccountDeleteServiceAccount(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Deletes a ServiceAccount associated with the provided identifier

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServiceAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ServiceAccountApi apiInstance = new ServiceAccountApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identifer of the ServiceAccount to be deleted
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.serviceAccountDeleteServiceAccount(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountApi#serviceAccountDeleteServiceAccount");
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
| **id** | **Integer**| Keyfactor identifer of the ServiceAccount to be deleted | |
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

<a name="serviceAccountDeleteServiceAccounts"></a>
# **serviceAccountDeleteServiceAccounts**
> serviceAccountDeleteServiceAccounts(xKeyfactorRequestedWith, ids, xKeyfactorApiVersion)

Deletes Service Accounts associated with the provided identifiers

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServiceAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ServiceAccountApi apiInstance = new ServiceAccountApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<Integer> ids = Arrays.asList(); // List<Integer> | Keyfactor identifers of the ServiceAccounts to be deleted
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.serviceAccountDeleteServiceAccounts(xKeyfactorRequestedWith, ids, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountApi#serviceAccountDeleteServiceAccounts");
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
| **ids** | [**List&lt;Integer&gt;**](Integer.md)| Keyfactor identifers of the ServiceAccounts to be deleted | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="serviceAccountGet"></a>
# **serviceAccountGet**
> ModelsSSHServiceAccountsServiceAccountResponse serviceAccountGet(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns a ServiceAccount associated with the provided identifier

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServiceAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ServiceAccountApi apiInstance = new ServiceAccountApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identifier of the ServiceAccount
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHServiceAccountsServiceAccountResponse result = apiInstance.serviceAccountGet(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountApi#serviceAccountGet");
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
| **id** | **Integer**| Keyfactor identifier of the ServiceAccount | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHServiceAccountsServiceAccountResponse**](ModelsSSHServiceAccountsServiceAccountResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serviceAccountGetServiceAccountKey"></a>
# **serviceAccountGetServiceAccountKey**
> ModelsSSHKeysKeyResponse serviceAccountGetServiceAccountKey(id, xKeyfactorRequestedWith, includePrivateKey, xKeyfactorApiVersion)

Returns an SSH key with or without private key based on the provided parameters.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServiceAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ServiceAccountApi apiInstance = new ServiceAccountApi(defaultClient);
    Integer id = 56; // Integer | The id of the service account to obtain information on
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Boolean includePrivateKey = true; // Boolean | Whether or not to include the private key in the response
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHKeysKeyResponse result = apiInstance.serviceAccountGetServiceAccountKey(id, xKeyfactorRequestedWith, includePrivateKey, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountApi#serviceAccountGetServiceAccountKey");
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
| **id** | **Integer**| The id of the service account to obtain information on | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **includePrivateKey** | **Boolean**| Whether or not to include the private key in the response | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHKeysKeyResponse**](ModelsSSHKeysKeyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serviceAccountQueryServiceAccounts"></a>
# **serviceAccountQueryServiceAccounts**
> List&lt;ModelsSSHServiceAccountsServiceAccountResponse&gt; serviceAccountQueryServiceAccounts(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Returns all ServiceAccounts according to the provided filter parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServiceAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ServiceAccountApi apiInstance = new ServiceAccountApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsSSHServiceAccountsServiceAccountResponse> result = apiInstance.serviceAccountQueryServiceAccounts(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountApi#serviceAccountQueryServiceAccounts");
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

[**List&lt;ModelsSSHServiceAccountsServiceAccountResponse&gt;**](ModelsSSHServiceAccountsServiceAccountResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serviceAccountRotateServiceAccountKey"></a>
# **serviceAccountRotateServiceAccountKey**
> ModelsSSHKeysKeyResponse serviceAccountRotateServiceAccountKey(id, xKeyfactorRequestedWith, rotationRequest, xKeyfactorApiVersion)

Rotate an SSH key for a specified service account.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServiceAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ServiceAccountApi apiInstance = new ServiceAccountApi(defaultClient);
    Integer id = 56; // Integer | The id of the service account and the updated state of the SSH key.
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsSSHKeysKeyGenerationRequest rotationRequest = new ModelsSSHKeysKeyGenerationRequest(); // ModelsSSHKeysKeyGenerationRequest | 
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHKeysKeyResponse result = apiInstance.serviceAccountRotateServiceAccountKey(id, xKeyfactorRequestedWith, rotationRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountApi#serviceAccountRotateServiceAccountKey");
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
| **id** | **Integer**| The id of the service account and the updated state of the SSH key. | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **rotationRequest** | [**ModelsSSHKeysKeyGenerationRequest**](ModelsSSHKeysKeyGenerationRequest.md)|  | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHKeysKeyResponse**](ModelsSSHKeysKeyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="serviceAccountUpdateServiceAccount"></a>
# **serviceAccountUpdateServiceAccount**
> ModelsSSHServiceAccountsServiceAccountResponse serviceAccountUpdateServiceAccount(xKeyfactorRequestedWith, updateRequest, xKeyfactorApiVersion)

Updates an SSH key for a specified service account.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.ServiceAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ServiceAccountApi apiInstance = new ServiceAccountApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsSSHServiceAccountsServiceAccountUpdateRequest updateRequest = new ModelsSSHServiceAccountsServiceAccountUpdateRequest(); // ModelsSSHServiceAccountsServiceAccountUpdateRequest | The id of the service account and the updated state of the SSH key.
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHServiceAccountsServiceAccountResponse result = apiInstance.serviceAccountUpdateServiceAccount(xKeyfactorRequestedWith, updateRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountApi#serviceAccountUpdateServiceAccount");
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
| **updateRequest** | [**ModelsSSHServiceAccountsServiceAccountUpdateRequest**](ModelsSSHServiceAccountsServiceAccountUpdateRequest.md)| The id of the service account and the updated state of the SSH key. | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHServiceAccountsServiceAccountResponse**](ModelsSSHServiceAccountsServiceAccountResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


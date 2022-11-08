# SecurityRolesApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**securityRolesDeleteSecurityRole**](SecurityRolesApi.md#securityRolesDeleteSecurityRole) | **DELETE** /Security/Roles/{id} | Deletes the security role whose ID is provided. |
| [**securityRolesGetIdentitiesWithRole**](SecurityRolesApi.md#securityRolesGetIdentitiesWithRole) | **GET** /Security/Roles/{id}/Identities | Returns all identities which have the security role that matches the id. |
| [**securityRolesUpdateIdentitiesWithRole**](SecurityRolesApi.md#securityRolesUpdateIdentitiesWithRole) | **PUT** /Security/Roles/{id}/Identities | Updates the identities which have the security role that matches the id. |


<a name="securityRolesDeleteSecurityRole"></a>
# **securityRolesDeleteSecurityRole**
> securityRolesDeleteSecurityRole(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Deletes the security role whose ID is provided.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SecurityRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SecurityRolesApi apiInstance = new SecurityRolesApi(defaultClient);
    Integer id = 56; // Integer | Security role identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.securityRolesDeleteSecurityRole(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityRolesApi#securityRolesDeleteSecurityRole");
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
| **id** | **Integer**| Security role identifier | |
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

<a name="securityRolesGetIdentitiesWithRole"></a>
# **securityRolesGetIdentitiesWithRole**
> List&lt;KeyfactorApiModelsSecurityRolesRoleIdentitiesResponse&gt; securityRolesGetIdentitiesWithRole(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns all identities which have the security role that matches the id.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SecurityRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SecurityRolesApi apiInstance = new SecurityRolesApi(defaultClient);
    Integer id = 56; // Integer | Security role identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsSecurityRolesRoleIdentitiesResponse> result = apiInstance.securityRolesGetIdentitiesWithRole(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityRolesApi#securityRolesGetIdentitiesWithRole");
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
| **id** | **Integer**| Security role identifier | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;KeyfactorApiModelsSecurityRolesRoleIdentitiesResponse&gt;**](KeyfactorApiModelsSecurityRolesRoleIdentitiesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="securityRolesUpdateIdentitiesWithRole"></a>
# **securityRolesUpdateIdentitiesWithRole**
> List&lt;KeyfactorApiModelsSecurityRolesRoleIdentitiesResponse&gt; securityRolesUpdateIdentitiesWithRole(id, xKeyfactorRequestedWith, identities, xKeyfactorApiVersion)

Updates the identities which have the security role that matches the id.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SecurityRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SecurityRolesApi apiInstance = new SecurityRolesApi(defaultClient);
    Integer id = 56; // Integer | Security role identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsSecurityRolesRoleIdentitiesRequest identities = new KeyfactorApiModelsSecurityRolesRoleIdentitiesRequest(); // KeyfactorApiModelsSecurityRolesRoleIdentitiesRequest | Lists of Identity IDs to remove or add to the role
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsSecurityRolesRoleIdentitiesResponse> result = apiInstance.securityRolesUpdateIdentitiesWithRole(id, xKeyfactorRequestedWith, identities, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityRolesApi#securityRolesUpdateIdentitiesWithRole");
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
| **id** | **Integer**| Security role identifier | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **identities** | [**KeyfactorApiModelsSecurityRolesRoleIdentitiesRequest**](KeyfactorApiModelsSecurityRolesRoleIdentitiesRequest.md)| Lists of Identity IDs to remove or add to the role | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;KeyfactorApiModelsSecurityRolesRoleIdentitiesResponse&gt;**](KeyfactorApiModelsSecurityRolesRoleIdentitiesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


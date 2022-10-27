# SecurityRolePermissionsApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**securityRolePermissionsAddCollectionPermissions**](SecurityRolePermissionsApi.md#securityRolePermissionsAddCollectionPermissions) | **POST** /Security/Roles/{id}/Permissions/Collections | Adds collection permissions to the security role that matches the id. |
| [**securityRolePermissionsAddContainerPermissions**](SecurityRolePermissionsApi.md#securityRolePermissionsAddContainerPermissions) | **POST** /Security/Roles/{id}/Permissions/Containers | Adds container permissions to the security role that matches the id. |
| [**securityRolePermissionsAddGlobalPermissions**](SecurityRolePermissionsApi.md#securityRolePermissionsAddGlobalPermissions) | **POST** /Security/Roles/{id}/Permissions/Global | Adds global permissions to the security role that matches the id. |
| [**securityRolePermissionsGetCollectionPermissionsForRole**](SecurityRolePermissionsApi.md#securityRolePermissionsGetCollectionPermissionsForRole) | **GET** /Security/Roles/{id}/Permissions/Collections | Returns all collection permissions associated with the security role that matches the id. |
| [**securityRolePermissionsGetContainerPermissionsForRole**](SecurityRolePermissionsApi.md#securityRolePermissionsGetContainerPermissionsForRole) | **GET** /Security/Roles/{id}/Permissions/Containers | Returns all container permissions associated with the security role that matches the id. |
| [**securityRolePermissionsGetGlobalPermissionsForRole**](SecurityRolePermissionsApi.md#securityRolePermissionsGetGlobalPermissionsForRole) | **GET** /Security/Roles/{id}/Permissions/Global | Returns all global permissions associated with the security role that matches the id. |
| [**securityRolePermissionsGetPermissionsForRole**](SecurityRolePermissionsApi.md#securityRolePermissionsGetPermissionsForRole) | **GET** /Security/Roles/{id}/Permissions | Returns all permissions associated with the security role that matches the id. |
| [**securityRolePermissionsSetCollectionPermissions**](SecurityRolePermissionsApi.md#securityRolePermissionsSetCollectionPermissions) | **PUT** /Security/Roles/{id}/Permissions/Collections | Sets collection permissions to the security role that matches the id. |
| [**securityRolePermissionsSetContainerPermissions**](SecurityRolePermissionsApi.md#securityRolePermissionsSetContainerPermissions) | **PUT** /Security/Roles/{id}/Permissions/Containers | Sets container permissions to the security role that matches the id. |
| [**securityRolePermissionsSetGlobalPermissions**](SecurityRolePermissionsApi.md#securityRolePermissionsSetGlobalPermissions) | **PUT** /Security/Roles/{id}/Permissions/Global | Adds global permissions to the security role that matches the id. |


<a name="securityRolePermissionsAddCollectionPermissions"></a>
# **securityRolePermissionsAddCollectionPermissions**
> List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionResponse&gt; securityRolePermissionsAddCollectionPermissions(id, xKeyfactorRequestedWith, collectionPermissions, xKeyfactorApiVersion)

Adds collection permissions to the security role that matches the id.

### Valid Permissions ###  | Permission    | Permission Display Name   |  |---------------|---------------------------|  | Read          | Read                      |  | EditMetadata  | Edit Metadata             |  | Recover       | Download with Private Key |  | Revoke        | Revoke                    |  | Delete        | Delete                    |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SecurityRolePermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    SecurityRolePermissionsApi apiInstance = new SecurityRolePermissionsApi(defaultClient);
    Integer id = 56; // Integer | Security role identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionRequest> collectionPermissions = Arrays.asList(); // List<KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionRequest> | Collections permissions
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionResponse> result = apiInstance.securityRolePermissionsAddCollectionPermissions(id, xKeyfactorRequestedWith, collectionPermissions, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityRolePermissionsApi#securityRolePermissionsAddCollectionPermissions");
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
| **collectionPermissions** | [**List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionRequest&gt;**](KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionRequest.md)| Collections permissions | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionResponse&gt;**](KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="securityRolePermissionsAddContainerPermissions"></a>
# **securityRolePermissionsAddContainerPermissions**
> List&lt;KeyfactorApiModelsSecurityRolesContainerPermissionResponse&gt; securityRolePermissionsAddContainerPermissions(id, xKeyfactorRequestedWith, containerPermissions, xKeyfactorApiVersion)

Adds container permissions to the security role that matches the id.

### Valid Permissions ###  | Permission    | Requisite Permissions |  |---------------|-----------------------|  | Read          |                       |  | Schedule      | Read                  |  | Modify        | Read, Schedule        |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SecurityRolePermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    SecurityRolePermissionsApi apiInstance = new SecurityRolePermissionsApi(defaultClient);
    Integer id = 56; // Integer | Security role identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<KeyfactorApiModelsSecurityRolesContainerPermissionRequest> containerPermissions = Arrays.asList(); // List<KeyfactorApiModelsSecurityRolesContainerPermissionRequest> | Container permissions
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsSecurityRolesContainerPermissionResponse> result = apiInstance.securityRolePermissionsAddContainerPermissions(id, xKeyfactorRequestedWith, containerPermissions, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityRolePermissionsApi#securityRolePermissionsAddContainerPermissions");
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
| **containerPermissions** | [**List&lt;KeyfactorApiModelsSecurityRolesContainerPermissionRequest&gt;**](KeyfactorApiModelsSecurityRolesContainerPermissionRequest.md)| Container permissions | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;KeyfactorApiModelsSecurityRolesContainerPermissionResponse&gt;**](KeyfactorApiModelsSecurityRolesContainerPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="securityRolePermissionsAddGlobalPermissions"></a>
# **securityRolePermissionsAddGlobalPermissions**
> List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionResponse&gt; securityRolePermissionsAddGlobalPermissions(id, xKeyfactorRequestedWith, globalPermissions, xKeyfactorApiVersion)

Adds global permissions to the security role that matches the id.

### Valid Global Permissions ###  | Area                          | Permission        |  |-------------------------------|-------------------|  | AdminPortal                   | Read              |  | AgentAutoRegistration         | Read              |  | AgentAutoRegistration         | Modify            |  | AgentManagement               | Read              |  | AgentManagement               | Modify            |  | API                           | Read              |  | ApplicationSettings           | Read              |  | ApplicationSettings           | Modify            |  | Auditing                      | Read              |  | CertificateCollections        | Modify            |  | CertificateEnrollment         | EnrollPFX         |  | CertificateEnrollment         | EnrollCSR         |  | CertificateEnrollment         | CsrGeneration     |  | CertificateEnrollment         | PendingCsr        |  | CertificateMetadataTypes      | Read              |  | CertificateMetadataTypes      | Modify            |  | Certificates                  | Read              |  | Certificates                  | EditMetadata      |  | Certificates                  | Import            |  | Certificates                  | Recover           |  | Certificates                  | Revoke            |  | Certificates                  | Delete            |  | Certificates                  | ImportPrivateKey  |  | CertificateStoreManagement    | Read              |  | CertificateStoreManagement    | Schedule          |  | CertificateStoreManagement    | Modify            |  | Dashboard                     | Read              |  | Dashboard                     | RiskHeader        |  | EventHandlerRegistration      | Read              |  | EventHandlerRegistration      | Modify            |  | MacAutoEnrollManagement       | Read              |  | MacAutoEnrollManagement       | Modify            |  | Monitoring                    | Read              |  | Monitoring                    | Modify            |  | Monitoring                    | Test              |  | PkiManagement                 | Read              |  | PkiManagement                 | Modify            |  | PrivilegedAccessManagement    | Read              |  | PrivilegedAccessManagement    | Modify            |  | Reports                       | Read              |  | Reports                       | Modify            |  | SecuritySettings              | Read              |  | SecuritySettings              | Modify            |  | SSH                           | User              |  | SSH                           | ServerAdmin       |  | SSH                           | EnterpriseAdmin   |  | SslManagement                 | Read              |  | SslManagement                 | Modify            |  | SystemSettings                | Read              |  | SystemSettings                | Modify            |  | WorkflowDefinitions           | Read              |  | WorkflowDefinitions           | Modify            |  | WorkflowInstances             | ReadAll           |  | WorkflowInstances             | ReadAssignedToMe  |  | WorkflowInstances             | ReadMy            |  | WorkflowInstances             | Manage            |  | WorkflowManagement            | Read              |  | WorkflowManagement            | Modify            |  | WorkflowManagement            | Test              |  | WorkflowManagement            | Participate       |  | WorkflowManagement            | Manage            |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SecurityRolePermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    SecurityRolePermissionsApi apiInstance = new SecurityRolePermissionsApi(defaultClient);
    Integer id = 56; // Integer | Security role identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionRequest> globalPermissions = Arrays.asList(); // List<KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionRequest> | Global permissions
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionResponse> result = apiInstance.securityRolePermissionsAddGlobalPermissions(id, xKeyfactorRequestedWith, globalPermissions, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityRolePermissionsApi#securityRolePermissionsAddGlobalPermissions");
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
| **globalPermissions** | [**List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionRequest&gt;**](KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionRequest.md)| Global permissions | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionResponse&gt;**](KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="securityRolePermissionsGetCollectionPermissionsForRole"></a>
# **securityRolePermissionsGetCollectionPermissionsForRole**
> List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionResponse&gt; securityRolePermissionsGetCollectionPermissionsForRole(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns all collection permissions associated with the security role that matches the id.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SecurityRolePermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    SecurityRolePermissionsApi apiInstance = new SecurityRolePermissionsApi(defaultClient);
    Integer id = 56; // Integer | Security role identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionResponse> result = apiInstance.securityRolePermissionsGetCollectionPermissionsForRole(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityRolePermissionsApi#securityRolePermissionsGetCollectionPermissionsForRole");
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

[**List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionResponse&gt;**](KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="securityRolePermissionsGetContainerPermissionsForRole"></a>
# **securityRolePermissionsGetContainerPermissionsForRole**
> List&lt;KeyfactorApiModelsSecurityRolesContainerPermissionResponse&gt; securityRolePermissionsGetContainerPermissionsForRole(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns all container permissions associated with the security role that matches the id.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SecurityRolePermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    SecurityRolePermissionsApi apiInstance = new SecurityRolePermissionsApi(defaultClient);
    Integer id = 56; // Integer | Security role identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsSecurityRolesContainerPermissionResponse> result = apiInstance.securityRolePermissionsGetContainerPermissionsForRole(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityRolePermissionsApi#securityRolePermissionsGetContainerPermissionsForRole");
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

[**List&lt;KeyfactorApiModelsSecurityRolesContainerPermissionResponse&gt;**](KeyfactorApiModelsSecurityRolesContainerPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="securityRolePermissionsGetGlobalPermissionsForRole"></a>
# **securityRolePermissionsGetGlobalPermissionsForRole**
> List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionResponse&gt; securityRolePermissionsGetGlobalPermissionsForRole(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns all global permissions associated with the security role that matches the id.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SecurityRolePermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    SecurityRolePermissionsApi apiInstance = new SecurityRolePermissionsApi(defaultClient);
    Integer id = 56; // Integer | Security role identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionResponse> result = apiInstance.securityRolePermissionsGetGlobalPermissionsForRole(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityRolePermissionsApi#securityRolePermissionsGetGlobalPermissionsForRole");
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

[**List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionResponse&gt;**](KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="securityRolePermissionsGetPermissionsForRole"></a>
# **securityRolePermissionsGetPermissionsForRole**
> List&lt;KeyfactorApiModelsSecurityRolesAreaPermissionResponse&gt; securityRolePermissionsGetPermissionsForRole(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns all permissions associated with the security role that matches the id.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SecurityRolePermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    SecurityRolePermissionsApi apiInstance = new SecurityRolePermissionsApi(defaultClient);
    Integer id = 56; // Integer | Security role identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsSecurityRolesAreaPermissionResponse> result = apiInstance.securityRolePermissionsGetPermissionsForRole(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityRolePermissionsApi#securityRolePermissionsGetPermissionsForRole");
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

[**List&lt;KeyfactorApiModelsSecurityRolesAreaPermissionResponse&gt;**](KeyfactorApiModelsSecurityRolesAreaPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="securityRolePermissionsSetCollectionPermissions"></a>
# **securityRolePermissionsSetCollectionPermissions**
> List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionResponse&gt; securityRolePermissionsSetCollectionPermissions(id, xKeyfactorRequestedWith, collectionPermissions, xKeyfactorApiVersion)

Sets collection permissions to the security role that matches the id.

### Valid Permissions ###  | Permission    | Permission Display Name   |  |---------------|---------------------------|  | Read          | Read                      |  | EditMetadata  | Edit Metadata             |  | Recover       | Download with Private Key |  | Revoke        | Revoke                    |  | Delete        | Delete                    |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SecurityRolePermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    SecurityRolePermissionsApi apiInstance = new SecurityRolePermissionsApi(defaultClient);
    Integer id = 56; // Integer | Security role identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionRequest> collectionPermissions = Arrays.asList(); // List<KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionRequest> | Collections permissions
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionResponse> result = apiInstance.securityRolePermissionsSetCollectionPermissions(id, xKeyfactorRequestedWith, collectionPermissions, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityRolePermissionsApi#securityRolePermissionsSetCollectionPermissions");
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
| **collectionPermissions** | [**List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionRequest&gt;**](KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionRequest.md)| Collections permissions | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionResponse&gt;**](KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesCollectionPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="securityRolePermissionsSetContainerPermissions"></a>
# **securityRolePermissionsSetContainerPermissions**
> List&lt;KeyfactorApiModelsSecurityRolesContainerPermissionResponse&gt; securityRolePermissionsSetContainerPermissions(id, xKeyfactorRequestedWith, containerPermissions, xKeyfactorApiVersion)

Sets container permissions to the security role that matches the id.

### Valid Permissions ###  | Permission    | Requisite Permissions |  |---------------|-----------------------|  | Read          |                       |  | Schedule      | Read                  |  | Modify        | Read, Schedule        |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SecurityRolePermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    SecurityRolePermissionsApi apiInstance = new SecurityRolePermissionsApi(defaultClient);
    Integer id = 56; // Integer | Security role identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<KeyfactorApiModelsSecurityRolesContainerPermissionRequest> containerPermissions = Arrays.asList(); // List<KeyfactorApiModelsSecurityRolesContainerPermissionRequest> | Container permissions
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsSecurityRolesContainerPermissionResponse> result = apiInstance.securityRolePermissionsSetContainerPermissions(id, xKeyfactorRequestedWith, containerPermissions, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityRolePermissionsApi#securityRolePermissionsSetContainerPermissions");
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
| **containerPermissions** | [**List&lt;KeyfactorApiModelsSecurityRolesContainerPermissionRequest&gt;**](KeyfactorApiModelsSecurityRolesContainerPermissionRequest.md)| Container permissions | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;KeyfactorApiModelsSecurityRolesContainerPermissionResponse&gt;**](KeyfactorApiModelsSecurityRolesContainerPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="securityRolePermissionsSetGlobalPermissions"></a>
# **securityRolePermissionsSetGlobalPermissions**
> List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionResponse&gt; securityRolePermissionsSetGlobalPermissions(id, xKeyfactorRequestedWith, globalPermissions, xKeyfactorApiVersion)

Adds global permissions to the security role that matches the id.

### Valid Global Permissions ###  | Area                          | Permission        |  |-------------------------------|-------------------|  | AdminPortal                   | Read              |  | AgentAutoRegistration         | Read              |  | AgentAutoRegistration         | Modify            |  | AgentManagement               | Read              |  | AgentManagement               | Modify            |  | API                           | Read              |  | ApplicationSettings           | Read              |  | ApplicationSettings           | Modify            |  | Auditing                      | Read              |  | CertificateCollections        | Modify            |  | CertificateEnrollment         | EnrollPFX         |  | CertificateEnrollment         | EnrollCSR         |  | CertificateEnrollment         | CsrGeneration     |  | CertificateEnrollment         | PendingCsr        |  | CertificateMetadataTypes      | Read              |  | CertificateMetadataTypes      | Modify            |  | Certificates                  | Read              |  | Certificates                  | EditMetadata      |  | Certificates                  | Import            |  | Certificates                  | Recover           |  | Certificates                  | Revoke            |  | Certificates                  | Delete            |  | Certificates                  | ImportPrivateKey  |  | CertificateStoreManagement    | Read              |  | CertificateStoreManagement    | Schedule          |  | CertificateStoreManagement    | Modify            |  | Dashboard                     | Read              |  | Dashboard                     | RiskHeader        |  | EventHandlerRegistration      | Read              |  | EventHandlerRegistration      | Modify            |  | MacAutoEnrollManagement       | Read              |  | MacAutoEnrollManagement       | Modify            |  | Monitoring                    | Read              |  | Monitoring                    | Modify            |  | Monitoring                    | Test              |  | PkiManagement                 | Read              |  | PkiManagement                 | Modify            |  | PrivilegedAccessManagement    | Read              |  | PrivilegedAccessManagement    | Modify            |  | Reports                       | Read              |  | Reports                       | Modify            |  | SecuritySettings              | Read              |  | SecuritySettings              | Modify            |  | SSH                           | User              |  | SSH                           | ServerAdmin       |  | SSH                           | EnterpriseAdmin   |  | SslManagement                 | Read              |  | SslManagement                 | Modify            |  | SystemSettings                | Read              |  | SystemSettings                | Modify            |  | WorkflowDefinitions           | Read              |  | WorkflowDefinitions           | Modify            |  | WorkflowInstances             | ReadAll           |  | WorkflowInstances             | ReadAssignedToMe  |  | WorkflowInstances             | ReadMy            |  | WorkflowInstances             | Manage            |  | WorkflowManagement            | Read              |  | WorkflowManagement            | Modify            |  | WorkflowManagement            | Test              |  | WorkflowManagement            | Participate       |  | WorkflowManagement            | Manage            |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SecurityRolePermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    SecurityRolePermissionsApi apiInstance = new SecurityRolePermissionsApi(defaultClient);
    Integer id = 56; // Integer | Security role identifier
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionRequest> globalPermissions = Arrays.asList(); // List<KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionRequest> | Global permissions
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionResponse> result = apiInstance.securityRolePermissionsSetGlobalPermissions(id, xKeyfactorRequestedWith, globalPermissions, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityRolePermissionsApi#securityRolePermissionsSetGlobalPermissions");
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
| **globalPermissions** | [**List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionRequest&gt;**](KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionRequest.md)| Global permissions | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionResponse&gt;**](KeyfactorApiModelsSecurityRolesIdentitiesSecurityRolesGlobalPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


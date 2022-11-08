# CertificateCollectionApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**certificateCollectionCopyFromExistingCollection**](CertificateCollectionApi.md#certificateCollectionCopyFromExistingCollection) | **POST** /CertificateCollections/Copy | Creates a new certificate collection from an existing collection. The permissions, query and description of the   existing collection are copied when creating the new record, with the option to overwrite the query or description. |
| [**certificateCollectionCreateCollection**](CertificateCollectionApi.md#certificateCollectionCreateCollection) | **POST** /CertificateCollections | Creates a new certificate collection with the provided properties |
| [**certificateCollectionGetCollection0**](CertificateCollectionApi.md#certificateCollectionGetCollection0) | **GET** /CertificateCollections/{id} | Returns the certificate collection definition associated with the provided Keyfactor identifier |
| [**certificateCollectionGetCollection1**](CertificateCollectionApi.md#certificateCollectionGetCollection1) | **GET** /CertificateCollections/{name} | Returns the certificate collection associated with the provided collection name |
| [**certificateCollectionGetCollections**](CertificateCollectionApi.md#certificateCollectionGetCollections) | **GET** /CertificateCollections | Returns all certificate collections |
| [**certificateCollectionSetCollectionPermissions**](CertificateCollectionApi.md#certificateCollectionSetCollectionPermissions) | **POST** /CertificateCollections/{id}/Permissions | Set the permissions for a collection |
| [**certificateCollectionUpdateCollection**](CertificateCollectionApi.md#certificateCollectionUpdateCollection) | **PUT** /CertificateCollections | Updates an existing certificate collection with the provided properties |


<a name="certificateCollectionCopyFromExistingCollection"></a>
# **certificateCollectionCopyFromExistingCollection**
> KeyfactorApiModelsCertificateCollectionsCertificateCollectionResponse certificateCollectionCopyFromExistingCollection(xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Creates a new certificate collection from an existing collection. The permissions, query and description of the   existing collection are copied when creating the new record, with the option to overwrite the query or description.

### Duplication Field Values ###  The field used to determine if a certificate is a duplicate of another.  | Value              | Description               |  |--------------------|---------------------------|  | 1                  | Common name               |  | 2                  | Distinguished name        |  | 3                  | Principal name            |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateCollectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateCollectionApi apiInstance = new CertificateCollectionApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsCertificateCollectionsCertificateCollectionCopyRequest request = new KeyfactorApiModelsCertificateCollectionsCertificateCollectionCopyRequest(); // KeyfactorApiModelsCertificateCollectionsCertificateCollectionCopyRequest | Information related to the certificate collection query
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsCertificateCollectionsCertificateCollectionResponse result = apiInstance.certificateCollectionCopyFromExistingCollection(xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateCollectionApi#certificateCollectionCopyFromExistingCollection");
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
| **request** | [**KeyfactorApiModelsCertificateCollectionsCertificateCollectionCopyRequest**](KeyfactorApiModelsCertificateCollectionsCertificateCollectionCopyRequest.md)| Information related to the certificate collection query | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsCertificateCollectionsCertificateCollectionResponse**](KeyfactorApiModelsCertificateCollectionsCertificateCollectionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateCollectionCreateCollection"></a>
# **certificateCollectionCreateCollection**
> KeyfactorApiModelsCertificateCollectionsCertificateCollectionResponse certificateCollectionCreateCollection(xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Creates a new certificate collection with the provided properties

### Duplication Field Values ###  The field used to determine if a certificate is a duplicate of another.  | Value              | Description               |  |--------------------|---------------------------|  | 1                  | Common name               |  | 2                  | Distinguished name        |  | 3                  | Principal name            |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateCollectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateCollectionApi apiInstance = new CertificateCollectionApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsCertificateCollectionsCertificateCollectionCreateRequest request = new KeyfactorApiModelsCertificateCollectionsCertificateCollectionCreateRequest(); // KeyfactorApiModelsCertificateCollectionsCertificateCollectionCreateRequest | Information related to the certificate collection query
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsCertificateCollectionsCertificateCollectionResponse result = apiInstance.certificateCollectionCreateCollection(xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateCollectionApi#certificateCollectionCreateCollection");
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
| **request** | [**KeyfactorApiModelsCertificateCollectionsCertificateCollectionCreateRequest**](KeyfactorApiModelsCertificateCollectionsCertificateCollectionCreateRequest.md)| Information related to the certificate collection query | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsCertificateCollectionsCertificateCollectionResponse**](KeyfactorApiModelsCertificateCollectionsCertificateCollectionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateCollectionGetCollection0"></a>
# **certificateCollectionGetCollection0**
> ModelsCertificateQuery certificateCollectionGetCollection0(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns the certificate collection definition associated with the provided Keyfactor identifier

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateCollectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateCollectionApi apiInstance = new CertificateCollectionApi(defaultClient);
    Integer id = 56; // Integer | Identifier of the certificate collection
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCertificateQuery result = apiInstance.certificateCollectionGetCollection0(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateCollectionApi#certificateCollectionGetCollection0");
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
| **id** | **Integer**| Identifier of the certificate collection | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCertificateQuery**](ModelsCertificateQuery.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateCollectionGetCollection1"></a>
# **certificateCollectionGetCollection1**
> ModelsCertificateQuery certificateCollectionGetCollection1(name, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns the certificate collection associated with the provided collection name

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateCollectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateCollectionApi apiInstance = new CertificateCollectionApi(defaultClient);
    String name = "name_example"; // String | Name of the Collection
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCertificateQuery result = apiInstance.certificateCollectionGetCollection1(name, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateCollectionApi#certificateCollectionGetCollection1");
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
| **name** | **String**| Name of the Collection | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCertificateQuery**](ModelsCertificateQuery.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateCollectionGetCollections"></a>
# **certificateCollectionGetCollections**
> List&lt;ModelsCertificateQuery&gt; certificateCollectionGetCollections(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Returns all certificate collections

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateCollectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateCollectionApi apiInstance = new CertificateCollectionApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsCertificateQuery> result = apiInstance.certificateCollectionGetCollections(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateCollectionApi#certificateCollectionGetCollections");
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

[**List&lt;ModelsCertificateQuery&gt;**](ModelsCertificateQuery.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateCollectionSetCollectionPermissions"></a>
# **certificateCollectionSetCollectionPermissions**
> certificateCollectionSetCollectionPermissions(id, xKeyfactorRequestedWith, collectionPermissions, xKeyfactorApiVersion)

Set the permissions for a collection

This endpoint should not be used as its use will potentially cause users to lose access to collections they previously had access to. This endpoint will be removed in version 11.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateCollectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateCollectionApi apiInstance = new CertificateCollectionApi(defaultClient);
    Integer id = 56; // Integer | The collection to set permissions on
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<ModelsCollectionRolePermissions> collectionPermissions = Arrays.asList(); // List<ModelsCollectionRolePermissions> | The collection Permissions object ['Read', 'EditMetadata', 'Recover', 'Revoke', 'Delete']
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateCollectionSetCollectionPermissions(id, xKeyfactorRequestedWith, collectionPermissions, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateCollectionApi#certificateCollectionSetCollectionPermissions");
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
| **id** | **Integer**| The collection to set permissions on | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **collectionPermissions** | [**List&lt;ModelsCollectionRolePermissions&gt;**](ModelsCollectionRolePermissions.md)| The collection Permissions object [&#39;Read&#39;, &#39;EditMetadata&#39;, &#39;Recover&#39;, &#39;Revoke&#39;, &#39;Delete&#39;] | |
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

<a name="certificateCollectionUpdateCollection"></a>
# **certificateCollectionUpdateCollection**
> KeyfactorApiModelsCertificateCollectionsCertificateCollectionResponse certificateCollectionUpdateCollection(xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Updates an existing certificate collection with the provided properties

### Duplication Field Values ###  The field used to determine if a certificate is a duplicate of another.  | Value              | Description               |  |--------------------|---------------------------|  | 1                  | Common name               |  | 2                  | Distinguished name        |  | 3                  | Principal name            |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateCollectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CertificateCollectionApi apiInstance = new CertificateCollectionApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest request = new KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest(); // KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest | Information related to the certificate collection query
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsCertificateCollectionsCertificateCollectionResponse result = apiInstance.certificateCollectionUpdateCollection(xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateCollectionApi#certificateCollectionUpdateCollection");
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
| **request** | [**KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest**](KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.md)| Information related to the certificate collection query | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsCertificateCollectionsCertificateCollectionResponse**](KeyfactorApiModelsCertificateCollectionsCertificateCollectionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


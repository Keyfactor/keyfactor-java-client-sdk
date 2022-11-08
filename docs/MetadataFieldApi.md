# MetadataFieldApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**metadataFieldCreateMetadataField**](MetadataFieldApi.md#metadataFieldCreateMetadataField) | **POST** /MetadataFields | Creates a new metadata field type with the given metadata field type properties |
| [**metadataFieldDeleteMetadataField**](MetadataFieldApi.md#metadataFieldDeleteMetadataField) | **DELETE** /MetadataFields/{id} | Deletes a persisted metadata field type by its unique id |
| [**metadataFieldDeleteMetadataFields**](MetadataFieldApi.md#metadataFieldDeleteMetadataFields) | **DELETE** /MetadataFields | Deletes multiple persisted metadata field types by their unique ids |
| [**metadataFieldGetAllMetadataFields**](MetadataFieldApi.md#metadataFieldGetAllMetadataFields) | **GET** /MetadataFields | Returns all metadata field types according to the provided filter and output parameters |
| [**metadataFieldGetMetadataField0**](MetadataFieldApi.md#metadataFieldGetMetadataField0) | **GET** /MetadataFields/{id} | Gets a persisted metadata field type by its unique id |
| [**metadataFieldGetMetadataField1**](MetadataFieldApi.md#metadataFieldGetMetadataField1) | **GET** /MetadataFields/{name} | Gets a persisted metadata field type by its unique name |
| [**metadataFieldGetMetadataFieldInUse**](MetadataFieldApi.md#metadataFieldGetMetadataFieldInUse) | **GET** /MetadataFields/{id}/InUse | Determines if a metadata field type associated with the provided identifier is currently in use |
| [**metadataFieldUpdateMetadataField**](MetadataFieldApi.md#metadataFieldUpdateMetadataField) | **PUT** /MetadataFields | Updates a persisted metadata field with the given metadata field type |


<a name="metadataFieldCreateMetadataField"></a>
# **metadataFieldCreateMetadataField**
> KeyfactorApiModelsMetadataFieldMetadataFieldResponse metadataFieldCreateMetadataField(xKeyfactorRequestedWith, metadataFieldType, xKeyfactorApiVersion)

Creates a new metadata field type with the given metadata field type properties

*NOTE: Metadata Field in this context refers to MetadataFieldType, as opposed to the value of a metadata field associated with a certificate.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MetadataFieldApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MetadataFieldApi apiInstance = new MetadataFieldApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsMetadataFieldMetadataFieldCreateRequest metadataFieldType = new KeyfactorApiModelsMetadataFieldMetadataFieldCreateRequest(); // KeyfactorApiModelsMetadataFieldMetadataFieldCreateRequest | Properties of the metadata field type to be created
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsMetadataFieldMetadataFieldResponse result = apiInstance.metadataFieldCreateMetadataField(xKeyfactorRequestedWith, metadataFieldType, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataFieldApi#metadataFieldCreateMetadataField");
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
| **metadataFieldType** | [**KeyfactorApiModelsMetadataFieldMetadataFieldCreateRequest**](KeyfactorApiModelsMetadataFieldMetadataFieldCreateRequest.md)| Properties of the metadata field type to be created | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsMetadataFieldMetadataFieldResponse**](KeyfactorApiModelsMetadataFieldMetadataFieldResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="metadataFieldDeleteMetadataField"></a>
# **metadataFieldDeleteMetadataField**
> metadataFieldDeleteMetadataField(id, xKeyfactorRequestedWith, force, xKeyfactorApiVersion)

Deletes a persisted metadata field type by its unique id

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MetadataFieldApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MetadataFieldApi apiInstance = new MetadataFieldApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identifier of the metadata field type
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Boolean force = true; // Boolean | Forces deletion of the metadata field type even if in-use
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.metadataFieldDeleteMetadataField(id, xKeyfactorRequestedWith, force, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataFieldApi#metadataFieldDeleteMetadataField");
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
| **id** | **Integer**| Keyfactor identifier of the metadata field type | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **force** | **Boolean**| Forces deletion of the metadata field type even if in-use | [optional] |
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

<a name="metadataFieldDeleteMetadataFields"></a>
# **metadataFieldDeleteMetadataFields**
> metadataFieldDeleteMetadataFields(xKeyfactorRequestedWith, ids, force, xKeyfactorApiVersion)

Deletes multiple persisted metadata field types by their unique ids

This will ignore individual delete failures, and continue processing the array.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MetadataFieldApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MetadataFieldApi apiInstance = new MetadataFieldApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<Integer> ids = Arrays.asList(); // List<Integer> | Array of Keyfactor identifiers for metadata field types to be deleted
    Boolean force = true; // Boolean | Forces deletion of the metadata field type even if in-use
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.metadataFieldDeleteMetadataFields(xKeyfactorRequestedWith, ids, force, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataFieldApi#metadataFieldDeleteMetadataFields");
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
| **ids** | [**List&lt;Integer&gt;**](Integer.md)| Array of Keyfactor identifiers for metadata field types to be deleted | |
| **force** | **Boolean**| Forces deletion of the metadata field type even if in-use | [optional] |
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

<a name="metadataFieldGetAllMetadataFields"></a>
# **metadataFieldGetAllMetadataFields**
> List&lt;ModelsMetadataFieldTypeModel&gt; metadataFieldGetAllMetadataFields(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Returns all metadata field types according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MetadataFieldApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MetadataFieldApi apiInstance = new MetadataFieldApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsMetadataFieldTypeModel> result = apiInstance.metadataFieldGetAllMetadataFields(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataFieldApi#metadataFieldGetAllMetadataFields");
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

[**List&lt;ModelsMetadataFieldTypeModel&gt;**](ModelsMetadataFieldTypeModel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="metadataFieldGetMetadataField0"></a>
# **metadataFieldGetMetadataField0**
> ModelsMetadataFieldTypeModel metadataFieldGetMetadataField0(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Gets a persisted metadata field type by its unique id

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MetadataFieldApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MetadataFieldApi apiInstance = new MetadataFieldApi(defaultClient);
    Integer id = 56; // Integer | The unique id of the metadata field type
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsMetadataFieldTypeModel result = apiInstance.metadataFieldGetMetadataField0(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataFieldApi#metadataFieldGetMetadataField0");
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
| **id** | **Integer**| The unique id of the metadata field type | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsMetadataFieldTypeModel**](ModelsMetadataFieldTypeModel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="metadataFieldGetMetadataField1"></a>
# **metadataFieldGetMetadataField1**
> ModelsMetadataFieldTypeModel metadataFieldGetMetadataField1(name, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Gets a persisted metadata field type by its unique name

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MetadataFieldApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MetadataFieldApi apiInstance = new MetadataFieldApi(defaultClient);
    String name = "name_example"; // String | The unique name of the metadata field.
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsMetadataFieldTypeModel result = apiInstance.metadataFieldGetMetadataField1(name, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataFieldApi#metadataFieldGetMetadataField1");
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
| **name** | **String**| The unique name of the metadata field. | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsMetadataFieldTypeModel**](ModelsMetadataFieldTypeModel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="metadataFieldGetMetadataFieldInUse"></a>
# **metadataFieldGetMetadataFieldInUse**
> Boolean metadataFieldGetMetadataFieldInUse(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Determines if a metadata field type associated with the provided identifier is currently in use

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MetadataFieldApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MetadataFieldApi apiInstance = new MetadataFieldApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identitifer of the metadata field
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      Boolean result = apiInstance.metadataFieldGetMetadataFieldInUse(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataFieldApi#metadataFieldGetMetadataFieldInUse");
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
| **id** | **Integer**| Keyfactor identitifer of the metadata field | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

**Boolean**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="metadataFieldUpdateMetadataField"></a>
# **metadataFieldUpdateMetadataField**
> KeyfactorApiModelsMetadataFieldMetadataFieldResponse metadataFieldUpdateMetadataField(xKeyfactorRequestedWith, metadataFieldType, xKeyfactorApiVersion)

Updates a persisted metadata field with the given metadata field type

*NOTE: Metadata Field in this context refers to MetadataFieldType, as opposed to the value of a metadata field associated with a certificate.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MetadataFieldApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MetadataFieldApi apiInstance = new MetadataFieldApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest metadataFieldType = new KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest(); // KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest | Properties of the metadata field type to be updated
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsMetadataFieldMetadataFieldResponse result = apiInstance.metadataFieldUpdateMetadataField(xKeyfactorRequestedWith, metadataFieldType, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataFieldApi#metadataFieldUpdateMetadataField");
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
| **metadataFieldType** | [**KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest**](KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.md)| Properties of the metadata field type to be updated | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsMetadataFieldMetadataFieldResponse**](KeyfactorApiModelsMetadataFieldMetadataFieldResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


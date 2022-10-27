# TemplateApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**templateGetGlobalSettings**](TemplateApi.md#templateGetGlobalSettings) | **GET** /Templates/Settings | Gets the global template settings. |
| [**templateGetTemplate**](TemplateApi.md#templateGetTemplate) | **GET** /Templates/{id} | Returns the certificate template associated with the provided id |
| [**templateGetTemplates**](TemplateApi.md#templateGetTemplates) | **GET** /Templates | Returns all certificate templates according to the provided filter and output parameters |
| [**templateGetValidSubjectParts**](TemplateApi.md#templateGetValidSubjectParts) | **GET** /Templates/SubjectParts |  |
| [**templateImport**](TemplateApi.md#templateImport) | **POST** /Templates/Import | Imports templates from the provided configuration tenant |
| [**templateUpdateGlobalSettings**](TemplateApi.md#templateUpdateGlobalSettings) | **PUT** /Templates/Settings | Replaces the existing global template settings. |
| [**templateUpdateTemplate**](TemplateApi.md#templateUpdateTemplate) | **PUT** /Templates | Updates a certificate template according to the provided properties |


<a name="templateGetGlobalSettings"></a>
# **templateGetGlobalSettings**
> KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse templateGetGlobalSettings(xKeyfactorRequestedWith, xKeyfactorApiVersion)

Gets the global template settings.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.TemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    TemplateApi apiInstance = new TemplateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse result = apiInstance.templateGetGlobalSettings(xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#templateGetGlobalSettings");
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

### Return type

[**KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse**](KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="templateGetTemplate"></a>
# **templateGetTemplate**
> ModelsTemplateRetrievalResponse templateGetTemplate(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns the certificate template associated with the provided id

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.TemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    TemplateApi apiInstance = new TemplateApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identifier of the certificate template
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsTemplateRetrievalResponse result = apiInstance.templateGetTemplate(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#templateGetTemplate");
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
| **id** | **Integer**| Keyfactor identifier of the certificate template | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsTemplateRetrievalResponse**](ModelsTemplateRetrievalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="templateGetTemplates"></a>
# **templateGetTemplates**
> List&lt;ModelsTemplateCollectionRetrievalResponse&gt; templateGetTemplates(xKeyfactorRequestedWith, xKeyfactorApiVersion, sqQueryString, sqPageReturned, sqReturnLimit, sqSortField, sqSortAscending)

Returns all certificate templates according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.TemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    TemplateApi apiInstance = new TemplateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String sqQueryString = "sqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer sqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer sqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String sqSortField = "sqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer sqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsTemplateCollectionRetrievalResponse> result = apiInstance.templateGetTemplates(xKeyfactorRequestedWith, xKeyfactorApiVersion, sqQueryString, sqPageReturned, sqReturnLimit, sqSortField, sqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#templateGetTemplates");
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
| **sqQueryString** | **String**| Contents of the query (ex: field1 -eq value1 AND field2 -gt value2) | [optional] |
| **sqPageReturned** | **Integer**| The current page within the result set to be returned | [optional] |
| **sqReturnLimit** | **Integer**| Maximum number of records to be returned in a single call | [optional] |
| **sqSortField** | **String**| Field by which the results should be sorted (view results via Management Portal for sortable columns) | [optional] |
| **sqSortAscending** | **Integer**| Field sort direction [0&#x3D;ascending, 1&#x3D;descending] | [optional] [enum: 0, 1] |

### Return type

[**List&lt;ModelsTemplateCollectionRetrievalResponse&gt;**](ModelsTemplateCollectionRetrievalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="templateGetValidSubjectParts"></a>
# **templateGetValidSubjectParts**
> List&lt;KeyfactorApiModelsTemplatesValidSubjectPartResponse&gt; templateGetValidSubjectParts(xKeyfactorRequestedWith, xKeyfactorApiVersion)



### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.TemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    TemplateApi apiInstance = new TemplateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsTemplatesValidSubjectPartResponse> result = apiInstance.templateGetValidSubjectParts(xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#templateGetValidSubjectParts");
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

### Return type

[**List&lt;KeyfactorApiModelsTemplatesValidSubjectPartResponse&gt;**](KeyfactorApiModelsTemplatesValidSubjectPartResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="templateImport"></a>
# **templateImport**
> templateImport(xKeyfactorRequestedWith, configurationTenantRequest, xKeyfactorApiVersion)

Imports templates from the provided configuration tenant

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.TemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    TemplateApi apiInstance = new TemplateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsConfigurationTenantConfigurationTenantRequest configurationTenantRequest = new KeyfactorApiModelsConfigurationTenantConfigurationTenantRequest(); // KeyfactorApiModelsConfigurationTenantConfigurationTenantRequest | Configuration tenant to import from
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.templateImport(xKeyfactorRequestedWith, configurationTenantRequest, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#templateImport");
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
| **configurationTenantRequest** | [**KeyfactorApiModelsConfigurationTenantConfigurationTenantRequest**](KeyfactorApiModelsConfigurationTenantConfigurationTenantRequest.md)| Configuration tenant to import from | |
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

<a name="templateUpdateGlobalSettings"></a>
# **templateUpdateGlobalSettings**
> KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse templateUpdateGlobalSettings(xKeyfactorRequestedWith, settings, xKeyfactorApiVersion)

Replaces the existing global template settings.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.TemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    TemplateApi apiInstance = new TemplateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest settings = new KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest(); // KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest | The new global template settings.
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse result = apiInstance.templateUpdateGlobalSettings(xKeyfactorRequestedWith, settings, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#templateUpdateGlobalSettings");
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
| **settings** | [**KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest**](KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest.md)| The new global template settings. | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse**](KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="templateUpdateTemplate"></a>
# **templateUpdateTemplate**
> ModelsTemplateRetrievalResponse templateUpdateTemplate(xKeyfactorRequestedWith, template, xKeyfactorApiVersion)

Updates a certificate template according to the provided properties

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.TemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    TemplateApi apiInstance = new TemplateApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsTemplateUpdateRequest template = new ModelsTemplateUpdateRequest(); // ModelsTemplateUpdateRequest | Properties of the certificate template to be updated
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsTemplateRetrievalResponse result = apiInstance.templateUpdateTemplate(xKeyfactorRequestedWith, template, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#templateUpdateTemplate");
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
| **template** | [**ModelsTemplateUpdateRequest**](ModelsTemplateUpdateRequest.md)| Properties of the certificate template to be updated | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsTemplateRetrievalResponse**](ModelsTemplateRetrievalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


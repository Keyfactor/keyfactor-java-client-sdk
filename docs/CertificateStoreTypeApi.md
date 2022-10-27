# CertificateStoreTypeApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**certificateStoreTypeCreateCertificateStoreType**](CertificateStoreTypeApi.md#certificateStoreTypeCreateCertificateStoreType) | **POST** /CertificateStoreTypes | Creates a new certificate store type with the provided properties |
| [**certificateStoreTypeDeleteCertificateStoreType**](CertificateStoreTypeApi.md#certificateStoreTypeDeleteCertificateStoreType) | **DELETE** /CertificateStoreTypes/{id} | Deletes a certificate store type according to the provided identifier |
| [**certificateStoreTypeDeleteCertificateStoreTypes**](CertificateStoreTypeApi.md#certificateStoreTypeDeleteCertificateStoreTypes) | **DELETE** /CertificateStoreTypes | Deletes certificate store types according to the provided identifiers |
| [**certificateStoreTypeGetCertificateStoreType0**](CertificateStoreTypeApi.md#certificateStoreTypeGetCertificateStoreType0) | **GET** /CertificateStoreTypes/{id} | Returns a single certificate store type that matches id |
| [**certificateStoreTypeGetCertificateStoreType1**](CertificateStoreTypeApi.md#certificateStoreTypeGetCertificateStoreType1) | **GET** /CertificateStoreTypes/Name/{name} | Returns a single certificate store type that matches the provided short name |
| [**certificateStoreTypeGetTypes**](CertificateStoreTypeApi.md#certificateStoreTypeGetTypes) | **GET** /CertificateStoreTypes | Returns all certificate store types according to the provided filter and output parameters |
| [**certificateStoreTypeUpdateCertificateStoreType**](CertificateStoreTypeApi.md#certificateStoreTypeUpdateCertificateStoreType) | **PUT** /CertificateStoreTypes | Updates an existing certificate store type with the provided properties |


<a name="certificateStoreTypeCreateCertificateStoreType"></a>
# **certificateStoreTypeCreateCertificateStoreType**
> KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse certificateStoreTypeCreateCertificateStoreType(xKeyfactorRequestedWith, certStoreType, xKeyfactorApiVersion)

Creates a new certificate store type with the provided properties

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreTypeApi apiInstance = new CertificateStoreTypeApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeCreationRequest certStoreType = new KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeCreationRequest(); // KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeCreationRequest | Certificate store type properties for the new type
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse result = apiInstance.certificateStoreTypeCreateCertificateStoreType(xKeyfactorRequestedWith, certStoreType, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreTypeApi#certificateStoreTypeCreateCertificateStoreType");
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
| **certStoreType** | [**KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeCreationRequest**](KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeCreationRequest.md)| Certificate store type properties for the new type | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse**](KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateStoreTypeDeleteCertificateStoreType"></a>
# **certificateStoreTypeDeleteCertificateStoreType**
> certificateStoreTypeDeleteCertificateStoreType(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Deletes a certificate store type according to the provided identifier

This will ignore individual delete failures, and continue processing certificate stores.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreTypeApi apiInstance = new CertificateStoreTypeApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identifier of the certificate store type to be deleted
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateStoreTypeDeleteCertificateStoreType(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreTypeApi#certificateStoreTypeDeleteCertificateStoreType");
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
| **id** | **Integer**| Keyfactor identifier of the certificate store type to be deleted | |
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

<a name="certificateStoreTypeDeleteCertificateStoreTypes"></a>
# **certificateStoreTypeDeleteCertificateStoreTypes**
> certificateStoreTypeDeleteCertificateStoreTypes(xKeyfactorRequestedWith, ids, xKeyfactorApiVersion)

Deletes certificate store types according to the provided identifiers

This will ignore individual delete failures, and continue processing the array.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreTypeApi apiInstance = new CertificateStoreTypeApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<Integer> ids = Arrays.asList(); // List<Integer> | Array of Keyfactor identifiers of the certificate store types to be deleted
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateStoreTypeDeleteCertificateStoreTypes(xKeyfactorRequestedWith, ids, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreTypeApi#certificateStoreTypeDeleteCertificateStoreTypes");
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
| **ids** | [**List&lt;Integer&gt;**](Integer.md)| Array of Keyfactor identifiers of the certificate store types to be deleted | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="certificateStoreTypeGetCertificateStoreType0"></a>
# **certificateStoreTypeGetCertificateStoreType0**
> KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse certificateStoreTypeGetCertificateStoreType0(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns a single certificate store type that matches id

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreTypeApi apiInstance = new CertificateStoreTypeApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identifier of the certificate store type
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse result = apiInstance.certificateStoreTypeGetCertificateStoreType0(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreTypeApi#certificateStoreTypeGetCertificateStoreType0");
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
| **id** | **Integer**| Keyfactor identifier of the certificate store type | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse**](KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateStoreTypeGetCertificateStoreType1"></a>
# **certificateStoreTypeGetCertificateStoreType1**
> List&lt;KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse&gt; certificateStoreTypeGetCertificateStoreType1(name, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns a single certificate store type that matches the provided short name

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreTypeApi apiInstance = new CertificateStoreTypeApi(defaultClient);
    String name = "name_example"; // String | Short name of the certificate store type to return
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse> result = apiInstance.certificateStoreTypeGetCertificateStoreType1(name, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreTypeApi#certificateStoreTypeGetCertificateStoreType1");
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
| **name** | **String**| Short name of the certificate store type to return | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse&gt;**](KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateStoreTypeGetTypes"></a>
# **certificateStoreTypeGetTypes**
> List&lt;KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse&gt; certificateStoreTypeGetTypes(xKeyfactorRequestedWith, xKeyfactorApiVersion, cstqueryQueryString, cstqueryPageReturned, cstqueryReturnLimit, cstquerySortField, cstquerySortAscending)

Returns all certificate store types according to the provided filter and output parameters

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreTypeApi apiInstance = new CertificateStoreTypeApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String cstqueryQueryString = "cstqueryQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer cstqueryPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer cstqueryReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String cstquerySortField = "cstquerySortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer cstquerySortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse> result = apiInstance.certificateStoreTypeGetTypes(xKeyfactorRequestedWith, xKeyfactorApiVersion, cstqueryQueryString, cstqueryPageReturned, cstqueryReturnLimit, cstquerySortField, cstquerySortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreTypeApi#certificateStoreTypeGetTypes");
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
| **cstqueryQueryString** | **String**| Contents of the query (ex: field1 -eq value1 AND field2 -gt value2) | [optional] |
| **cstqueryPageReturned** | **Integer**| The current page within the result set to be returned | [optional] |
| **cstqueryReturnLimit** | **Integer**| Maximum number of records to be returned in a single call | [optional] |
| **cstquerySortField** | **String**| Field by which the results should be sorted (view results via Management Portal for sortable columns) | [optional] |
| **cstquerySortAscending** | **Integer**| Field sort direction [0&#x3D;ascending, 1&#x3D;descending] | [optional] [enum: 0, 1] |

### Return type

[**List&lt;KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse&gt;**](KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateStoreTypeUpdateCertificateStoreType"></a>
# **certificateStoreTypeUpdateCertificateStoreType**
> KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse certificateStoreTypeUpdateCertificateStoreType(xKeyfactorRequestedWith, certStoreType, xKeyfactorApiVersion)

Updates an existing certificate store type with the provided properties

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreTypeApi apiInstance = new CertificateStoreTypeApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeUpdateRequest certStoreType = new KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeUpdateRequest(); // KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeUpdateRequest | Certificate store type properties to be updated
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse result = apiInstance.certificateStoreTypeUpdateCertificateStoreType(xKeyfactorRequestedWith, certStoreType, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreTypeApi#certificateStoreTypeUpdateCertificateStoreType");
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
| **certStoreType** | [**KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeUpdateRequest**](KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeUpdateRequest.md)| Certificate store type properties to be updated | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse**](KeyfactorApiModelsCertificateStoresTypesCertificateStoreTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


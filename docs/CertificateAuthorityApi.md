# CertificateAuthorityApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**certificateAuthorityCreateCA**](CertificateAuthorityApi.md#certificateAuthorityCreateCA) | **POST** /CertificateAuthority | Creates a new CertificateAuthority object |
| [**certificateAuthorityDeleteCA**](CertificateAuthorityApi.md#certificateAuthorityDeleteCA) | **DELETE** /CertificateAuthority/{id} | Deletes a CertificateAuthority from the system, specified by ID |
| [**certificateAuthorityGetCa**](CertificateAuthorityApi.md#certificateAuthorityGetCa) | **GET** /CertificateAuthority/{id} | Returns details for a single CA, specified by ID |
| [**certificateAuthorityGetCas**](CertificateAuthorityApi.md#certificateAuthorityGetCas) | **GET** /CertificateAuthority | Returns all certificate authorities |
| [**certificateAuthorityPublishCRL**](CertificateAuthorityApi.md#certificateAuthorityPublishCRL) | **POST** /CertificateAuthority/PublishCRL | Publishes a CRL according to the provided request |
| [**certificateAuthorityTestCertificateAuthority**](CertificateAuthorityApi.md#certificateAuthorityTestCertificateAuthority) | **POST** /CertificateAuthority/Test | Validates the connection info for the CA provided by the model. |
| [**certificateAuthorityUpdateCA**](CertificateAuthorityApi.md#certificateAuthorityUpdateCA) | **PUT** /CertificateAuthority | Updates a CertificateAuthority object |


<a name="certificateAuthorityCreateCA"></a>
# **certificateAuthorityCreateCA**
> ModelsCertificateAuthoritiesCertificateAuthorityResponse certificateAuthorityCreateCA(xKeyfactorRequestedWith, ca, xKeyfactorApiVersion)

Creates a new CertificateAuthority object

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateAuthorityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateAuthorityApi apiInstance = new CertificateAuthorityApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsCertificateAuthoritiesCertificateAuthorityRequest ca = new ModelsCertificateAuthoritiesCertificateAuthorityRequest(); // ModelsCertificateAuthoritiesCertificateAuthorityRequest | 
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCertificateAuthoritiesCertificateAuthorityResponse result = apiInstance.certificateAuthorityCreateCA(xKeyfactorRequestedWith, ca, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateAuthorityApi#certificateAuthorityCreateCA");
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
| **ca** | [**ModelsCertificateAuthoritiesCertificateAuthorityRequest**](ModelsCertificateAuthoritiesCertificateAuthorityRequest.md)|  | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCertificateAuthoritiesCertificateAuthorityResponse**](ModelsCertificateAuthoritiesCertificateAuthorityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateAuthorityDeleteCA"></a>
# **certificateAuthorityDeleteCA**
> certificateAuthorityDeleteCA(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Deletes a CertificateAuthority from the system, specified by ID

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateAuthorityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateAuthorityApi apiInstance = new CertificateAuthorityApi(defaultClient);
    Integer id = 56; // Integer | 
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateAuthorityDeleteCA(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateAuthorityApi#certificateAuthorityDeleteCA");
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
| **id** | **Integer**|  | |
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

<a name="certificateAuthorityGetCa"></a>
# **certificateAuthorityGetCa**
> ModelsCertificateAuthoritiesCertificateAuthorityResponse certificateAuthorityGetCa(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns details for a single CA, specified by ID

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateAuthorityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateAuthorityApi apiInstance = new CertificateAuthorityApi(defaultClient);
    Integer id = 56; // Integer | 
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCertificateAuthoritiesCertificateAuthorityResponse result = apiInstance.certificateAuthorityGetCa(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateAuthorityApi#certificateAuthorityGetCa");
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
| **id** | **Integer**|  | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCertificateAuthoritiesCertificateAuthorityResponse**](ModelsCertificateAuthoritiesCertificateAuthorityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateAuthorityGetCas"></a>
# **certificateAuthorityGetCas**
> List&lt;ModelsCertificateAuthoritiesCertificateAuthorityResponse&gt; certificateAuthorityGetCas(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Returns all certificate authorities

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateAuthorityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateAuthorityApi apiInstance = new CertificateAuthorityApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsCertificateAuthoritiesCertificateAuthorityResponse> result = apiInstance.certificateAuthorityGetCas(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateAuthorityApi#certificateAuthorityGetCas");
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

[**List&lt;ModelsCertificateAuthoritiesCertificateAuthorityResponse&gt;**](ModelsCertificateAuthoritiesCertificateAuthorityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateAuthorityPublishCRL"></a>
# **certificateAuthorityPublishCRL**
> certificateAuthorityPublishCRL(xKeyfactorRequestedWith, crlrequest, xKeyfactorApiVersion)

Publishes a CRL according to the provided request

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateAuthorityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateAuthorityApi apiInstance = new CertificateAuthorityApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsCRLRequestModel crlrequest = new ModelsCRLRequestModel(); // ModelsCRLRequestModel | Host and logical name of the CA for which the CRL should be published
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateAuthorityPublishCRL(xKeyfactorRequestedWith, crlrequest, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateAuthorityApi#certificateAuthorityPublishCRL");
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
| **crlrequest** | [**ModelsCRLRequestModel**](ModelsCRLRequestModel.md)| Host and logical name of the CA for which the CRL should be published | |
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

<a name="certificateAuthorityTestCertificateAuthority"></a>
# **certificateAuthorityTestCertificateAuthority**
> KeyfactorApiModelsCertificateAuthoritiesCertificateAuthorityTestResponse certificateAuthorityTestCertificateAuthority(xKeyfactorRequestedWith, ca, xKeyfactorApiVersion)

Validates the connection info for the CA provided by the model.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateAuthorityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateAuthorityApi apiInstance = new CertificateAuthorityApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsCertificateAuthoritiesCertificateAuthorityRequest ca = new ModelsCertificateAuthoritiesCertificateAuthorityRequest(); // ModelsCertificateAuthoritiesCertificateAuthorityRequest | The CA being tested.
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsCertificateAuthoritiesCertificateAuthorityTestResponse result = apiInstance.certificateAuthorityTestCertificateAuthority(xKeyfactorRequestedWith, ca, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateAuthorityApi#certificateAuthorityTestCertificateAuthority");
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
| **ca** | [**ModelsCertificateAuthoritiesCertificateAuthorityRequest**](ModelsCertificateAuthoritiesCertificateAuthorityRequest.md)| The CA being tested. | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsCertificateAuthoritiesCertificateAuthorityTestResponse**](KeyfactorApiModelsCertificateAuthoritiesCertificateAuthorityTestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateAuthorityUpdateCA"></a>
# **certificateAuthorityUpdateCA**
> ModelsCertificateAuthoritiesCertificateAuthorityResponse certificateAuthorityUpdateCA(xKeyfactorRequestedWith, ca, xKeyfactorApiVersion)

Updates a CertificateAuthority object

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateAuthorityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateAuthorityApi apiInstance = new CertificateAuthorityApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsCertificateAuthoritiesCertificateAuthorityRequest ca = new ModelsCertificateAuthoritiesCertificateAuthorityRequest(); // ModelsCertificateAuthoritiesCertificateAuthorityRequest | 
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCertificateAuthoritiesCertificateAuthorityResponse result = apiInstance.certificateAuthorityUpdateCA(xKeyfactorRequestedWith, ca, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateAuthorityApi#certificateAuthorityUpdateCA");
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
| **ca** | [**ModelsCertificateAuthoritiesCertificateAuthorityRequest**](ModelsCertificateAuthoritiesCertificateAuthorityRequest.md)|  | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCertificateAuthoritiesCertificateAuthorityResponse**](ModelsCertificateAuthoritiesCertificateAuthorityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


# CsrGenerationApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cSRGenerationDeleteCSR**](CsrGenerationApi.md#cSRGenerationDeleteCSR) | **DELETE** /CSRGeneration/Pending/{id} | Deletes a CSR associated with the provided identifier |
| [**cSRGenerationDeleteCSRs**](CsrGenerationApi.md#cSRGenerationDeleteCSRs) | **DELETE** /CSRGeneration/Pending | Deletes the CSRs associated with the provided identifiers |
| [**cSRGenerationDownload**](CsrGenerationApi.md#cSRGenerationDownload) | **GET** /CSRGeneration/Pending/{id} | Returns a previously generated CSR associated with the provided identifier |
| [**cSRGenerationGetPendingCSRs**](CsrGenerationApi.md#cSRGenerationGetPendingCSRs) | **GET** /CSRGeneration/Pending | Returns a list of the currently pending CSRs according to the provided query |
| [**cSRGenerationPostGenerate**](CsrGenerationApi.md#cSRGenerationPostGenerate) | **POST** /CSRGeneration/Generate | Generates a CSR according the properties provided |


<a name="cSRGenerationDeleteCSR"></a>
# **cSRGenerationDeleteCSR**
> cSRGenerationDeleteCSR(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Deletes a CSR associated with the provided identifier

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CsrGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CsrGenerationApi apiInstance = new CsrGenerationApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identifer of the CSR to be deleted
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.cSRGenerationDeleteCSR(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsrGenerationApi#cSRGenerationDeleteCSR");
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
| **id** | **Integer**| Keyfactor identifer of the CSR to be deleted | |
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

<a name="cSRGenerationDeleteCSRs"></a>
# **cSRGenerationDeleteCSRs**
> cSRGenerationDeleteCSRs(xKeyfactorRequestedWith, ids, xKeyfactorApiVersion)

Deletes the CSRs associated with the provided identifiers

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CsrGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CsrGenerationApi apiInstance = new CsrGenerationApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<Integer> ids = Arrays.asList(); // List<Integer> | Array of Keyfactor identifiers for the CSRs to be deleted
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.cSRGenerationDeleteCSRs(xKeyfactorRequestedWith, ids, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsrGenerationApi#cSRGenerationDeleteCSRs");
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
| **ids** | [**List&lt;Integer&gt;**](Integer.md)| Array of Keyfactor identifiers for the CSRs to be deleted | |
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

<a name="cSRGenerationDownload"></a>
# **cSRGenerationDownload**
> ModelsCSRGenerationResponseModel cSRGenerationDownload(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns a previously generated CSR associated with the provided identifier

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CsrGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CsrGenerationApi apiInstance = new CsrGenerationApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identifier of the CSR
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCSRGenerationResponseModel result = apiInstance.cSRGenerationDownload(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsrGenerationApi#cSRGenerationDownload");
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
| **id** | **Integer**| Keyfactor identifier of the CSR | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCSRGenerationResponseModel**](ModelsCSRGenerationResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="cSRGenerationGetPendingCSRs"></a>
# **cSRGenerationGetPendingCSRs**
> List&lt;ModelsPendingCSRResponse&gt; cSRGenerationGetPendingCSRs(xKeyfactorRequestedWith, xKeyfactorApiVersion, sqQueryString, sqPageReturned, sqReturnLimit, sqSortField, sqSortAscending)

Returns a list of the currently pending CSRs according to the provided query

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CsrGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CsrGenerationApi apiInstance = new CsrGenerationApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String sqQueryString = "sqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer sqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer sqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String sqSortField = "sqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer sqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsPendingCSRResponse> result = apiInstance.cSRGenerationGetPendingCSRs(xKeyfactorRequestedWith, xKeyfactorApiVersion, sqQueryString, sqPageReturned, sqReturnLimit, sqSortField, sqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsrGenerationApi#cSRGenerationGetPendingCSRs");
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

[**List&lt;ModelsPendingCSRResponse&gt;**](ModelsPendingCSRResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="cSRGenerationPostGenerate"></a>
# **cSRGenerationPostGenerate**
> ModelsCSRContents cSRGenerationPostGenerate(xKeyfactorRequestedWith, context, xKeyfactorApiVersion)

Generates a CSR according the properties provided

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CsrGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CsrGenerationApi apiInstance = new CsrGenerationApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsEnrollmentCSRGenerationRequest context = new ModelsEnrollmentCSRGenerationRequest(); // ModelsEnrollmentCSRGenerationRequest | CSR properties used to define the request - Key type [RSA, ECC], Key sizes (ex: RSA 1024, 2048, 4096/ECC 256, 384, 521), template short name or OID
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCSRContents result = apiInstance.cSRGenerationPostGenerate(xKeyfactorRequestedWith, context, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsrGenerationApi#cSRGenerationPostGenerate");
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
| **context** | [**ModelsEnrollmentCSRGenerationRequest**](ModelsEnrollmentCSRGenerationRequest.md)| CSR properties used to define the request - Key type [RSA, ECC], Key sizes (ex: RSA 1024, 2048, 4096/ECC 256, 384, 521), template short name or OID | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCSRContents**](ModelsCSRContents.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


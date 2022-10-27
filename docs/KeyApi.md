# KeyApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**keyDeleteUnmanagedKey**](KeyApi.md#keyDeleteUnmanagedKey) | **DELETE** /SSH/Keys/Unmanaged/{id} | Deletes Unmanaged Key associated with the provided identifier |
| [**keyDeleteUnmanagedKeys**](KeyApi.md#keyDeleteUnmanagedKeys) | **DELETE** /SSH/Keys/Unmanaged | Deletes Unmanaged Keys associated with the provided identifiers |
| [**keyGenerateKey**](KeyApi.md#keyGenerateKey) | **POST** /SSH/Keys/MyKey | Generates an SSH Key Pair for the requesting user. |
| [**keyGetMyKey**](KeyApi.md#keyGetMyKey) | **GET** /SSH/Keys/MyKey | Returns the current key of the requesting user |
| [**keyGetUnmanagedKey**](KeyApi.md#keyGetUnmanagedKey) | **GET** /SSH/Keys/Unmanaged/{id} | Returns an unmanaged SSH key with provided id. |
| [**keyGetUnmanagedKeys**](KeyApi.md#keyGetUnmanagedKeys) | **GET** /SSH/Keys/Unmanaged | Returns Unmanaged SSH keys |
| [**keyUpdate**](KeyApi.md#keyUpdate) | **PUT** /SSH/Keys/MyKey | Updates the requesting user&#39;s SSH key |


<a name="keyDeleteUnmanagedKey"></a>
# **keyDeleteUnmanagedKey**
> keyDeleteUnmanagedKey(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Deletes Unmanaged Key associated with the provided identifier

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    KeyApi apiInstance = new KeyApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identifer of the Key to be deleted
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.keyDeleteUnmanagedKey(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyApi#keyDeleteUnmanagedKey");
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
| **id** | **Integer**| Keyfactor identifer of the Key to be deleted | |
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

<a name="keyDeleteUnmanagedKeys"></a>
# **keyDeleteUnmanagedKeys**
> keyDeleteUnmanagedKeys(xKeyfactorRequestedWith, ids, xKeyfactorApiVersion)

Deletes Unmanaged Keys associated with the provided identifiers

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    KeyApi apiInstance = new KeyApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<Integer> ids = Arrays.asList(); // List<Integer> | Keyfactor identifers of the Keys to be deleted
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.keyDeleteUnmanagedKeys(xKeyfactorRequestedWith, ids, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyApi#keyDeleteUnmanagedKeys");
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
| **ids** | [**List&lt;Integer&gt;**](Integer.md)| Keyfactor identifers of the Keys to be deleted | |
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

<a name="keyGenerateKey"></a>
# **keyGenerateKey**
> ModelsSSHKeysKeyResponse keyGenerateKey(xKeyfactorRequestedWith, generationRequest, xKeyfactorApiVersion)

Generates an SSH Key Pair for the requesting user.

### SSH Key Algorithms ###  | Value              | Description               |  |--------------------|---------------------------|  | 0              | Unknown                 |  | 1             | ECDSA                |  | 2                | Ed25519                   |  | 3                | RSA                   |    ### Private Key Formats ###  | Value              | Description               |  |--------------------|---------------------------|  | 0              | Unknown                 |  | 1             | OpenSSH                |  | 2                | PKCS8                   |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    KeyApi apiInstance = new KeyApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsSSHKeysKeyGenerationRequest generationRequest = new ModelsSSHKeysKeyGenerationRequest(); // ModelsSSHKeysKeyGenerationRequest | Object containing information about the key to be generated
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHKeysKeyResponse result = apiInstance.keyGenerateKey(xKeyfactorRequestedWith, generationRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyApi#keyGenerateKey");
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
| **generationRequest** | [**ModelsSSHKeysKeyGenerationRequest**](ModelsSSHKeysKeyGenerationRequest.md)| Object containing information about the key to be generated | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHKeysKeyResponse**](ModelsSSHKeysKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="keyGetMyKey"></a>
# **keyGetMyKey**
> ModelsSSHKeysKeyResponse keyGetMyKey(xKeyfactorRequestedWith, xKeyfactorKeyPassphrase, includePrivateKey, xKeyfactorApiVersion)

Returns the current key of the requesting user

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    KeyApi apiInstance = new KeyApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorKeyPassphrase = "xKeyfactorKeyPassphrase_example"; // String | Key password
    Boolean includePrivateKey = true; // Boolean | Whether or not to include the private key. If true, you must supply the X-Keyfactor-Key-Passphrase header
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHKeysKeyResponse result = apiInstance.keyGetMyKey(xKeyfactorRequestedWith, xKeyfactorKeyPassphrase, includePrivateKey, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyApi#keyGetMyKey");
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
| **xKeyfactorKeyPassphrase** | **String**| Key password | |
| **includePrivateKey** | **Boolean**| Whether or not to include the private key. If true, you must supply the X-Keyfactor-Key-Passphrase header | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHKeysKeyResponse**](ModelsSSHKeysKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="keyGetUnmanagedKey"></a>
# **keyGetUnmanagedKey**
> ModelsSSHKeysUnmanagedKeyResponse keyGetUnmanagedKey(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns an unmanaged SSH key with provided id.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    KeyApi apiInstance = new KeyApi(defaultClient);
    Integer id = 56; // Integer | The id of the key to get
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHKeysUnmanagedKeyResponse result = apiInstance.keyGetUnmanagedKey(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyApi#keyGetUnmanagedKey");
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
| **id** | **Integer**| The id of the key to get | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHKeysUnmanagedKeyResponse**](ModelsSSHKeysUnmanagedKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="keyGetUnmanagedKeys"></a>
# **keyGetUnmanagedKeys**
> List&lt;ModelsSSHKeysUnmanagedKeyResponse&gt; keyGetUnmanagedKeys(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending)

Returns Unmanaged SSH keys

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    KeyApi apiInstance = new KeyApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    String pqQueryString = "pqQueryString_example"; // String | Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
    Integer pqPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer pqReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String pqSortField = "pqSortField_example"; // String | Field by which the results should be sorted (view results via Management Portal for sortable columns)
    Integer pqSortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsSSHKeysUnmanagedKeyResponse> result = apiInstance.keyGetUnmanagedKeys(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyApi#keyGetUnmanagedKeys");
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

[**List&lt;ModelsSSHKeysUnmanagedKeyResponse&gt;**](ModelsSSHKeysUnmanagedKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="keyUpdate"></a>
# **keyUpdate**
> ModelsSSHKeysKeyResponse keyUpdate(xKeyfactorRequestedWith, keyUpdateRequest, xKeyfactorApiVersion)

Updates the requesting user&#39;s SSH key

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.KeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    KeyApi apiInstance = new KeyApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsSSHKeysKeyUpdateRequest keyUpdateRequest = new ModelsSSHKeysKeyUpdateRequest(); // ModelsSSHKeysKeyUpdateRequest | Updated state of the SSH key
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsSSHKeysKeyResponse result = apiInstance.keyUpdate(xKeyfactorRequestedWith, keyUpdateRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyApi#keyUpdate");
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
| **keyUpdateRequest** | [**ModelsSSHKeysKeyUpdateRequest**](ModelsSSHKeysKeyUpdateRequest.md)| Updated state of the SSH key | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsSSHKeysKeyResponse**](ModelsSSHKeysKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


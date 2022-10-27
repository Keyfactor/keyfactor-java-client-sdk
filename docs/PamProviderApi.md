# PamProviderApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pAMProviderCreatePamProviderType**](PamProviderApi.md#pAMProviderCreatePamProviderType) | **POST** /PamProviders/Types | Creates a new PAM provider type with the associated properties |
| [**pAMProviderDeletePamProvider**](PamProviderApi.md#pAMProviderDeletePamProvider) | **DELETE** /PamProviders/{id} | Deletes a PAM Provider |


<a name="pAMProviderCreatePamProviderType"></a>
# **pAMProviderCreatePamProviderType**
> KeyfactorApiPAMProviderTypeResponse pAMProviderCreatePamProviderType(xKeyfactorRequestedWith, type, xKeyfactorApiVersion)

Creates a new PAM provider type with the associated properties

### PAM Provider Data Types ###  | Value              | Description               |  |--------------------|---------------------------|  | 1                  | string                    |  | 2                  | secret                    |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.PamProviderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    PamProviderApi apiInstance = new PamProviderApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiPAMProviderTypeCreateRequest type = new KeyfactorApiPAMProviderTypeCreateRequest(); // KeyfactorApiPAMProviderTypeCreateRequest | PAM provider type properties to be used
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiPAMProviderTypeResponse result = apiInstance.pAMProviderCreatePamProviderType(xKeyfactorRequestedWith, type, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PamProviderApi#pAMProviderCreatePamProviderType");
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
| **type** | [**KeyfactorApiPAMProviderTypeCreateRequest**](KeyfactorApiPAMProviderTypeCreateRequest.md)| PAM provider type properties to be used | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiPAMProviderTypeResponse**](KeyfactorApiPAMProviderTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="pAMProviderDeletePamProvider"></a>
# **pAMProviderDeletePamProvider**
> pAMProviderDeletePamProvider(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Deletes a PAM Provider

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.PamProviderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    PamProviderApi apiInstance = new PamProviderApi(defaultClient);
    Integer id = 56; // Integer | Keyfactor identifier of the PAM provider to be deleted
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.pAMProviderDeletePamProvider(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling PamProviderApi#pAMProviderDeletePamProvider");
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
| **id** | **Integer**| Keyfactor identifier of the PAM provider to be deleted | |
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


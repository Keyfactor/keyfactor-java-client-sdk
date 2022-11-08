# MacEnrollmentApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**macEnrollmentEditMacEnrollment**](MacEnrollmentApi.md#macEnrollmentEditMacEnrollment) | **PUT** /MacEnrollment | Updates mac enrollment settings data |
| [**macEnrollmentMacEnrollment**](MacEnrollmentApi.md#macEnrollmentMacEnrollment) | **GET** /MacEnrollment | Gets mac enrollment settings data |


<a name="macEnrollmentEditMacEnrollment"></a>
# **macEnrollmentEditMacEnrollment**
> KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel macEnrollmentEditMacEnrollment(xKeyfactorRequestedWith, macEnrollmentSettings, xKeyfactorApiVersion)

Updates mac enrollment settings data

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MacEnrollmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MacEnrollmentApi apiInstance = new MacEnrollmentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel macEnrollmentSettings = new KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel(); // KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel | 
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel result = apiInstance.macEnrollmentEditMacEnrollment(xKeyfactorRequestedWith, macEnrollmentSettings, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MacEnrollmentApi#macEnrollmentEditMacEnrollment");
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
| **macEnrollmentSettings** | [**KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel**](KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.md)|  | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel**](KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="macEnrollmentMacEnrollment"></a>
# **macEnrollmentMacEnrollment**
> KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel macEnrollmentMacEnrollment(xKeyfactorRequestedWith, xKeyfactorApiVersion)

Gets mac enrollment settings data

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.auth.*;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.MacEnrollmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MacEnrollmentApi apiInstance = new MacEnrollmentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel result = apiInstance.macEnrollmentMacEnrollment(xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MacEnrollmentApi#macEnrollmentMacEnrollment");
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

[**KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel**](KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


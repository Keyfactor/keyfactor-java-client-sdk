# SmtpApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sMTPSMTP**](SmtpApi.md#sMTPSMTP) | **GET** /SMTP | Gets SMTP profile data |
| [**sMTPTestSMTP**](SmtpApi.md#sMTPTestSMTP) | **POST** /SMTP/Test | Tests SMTP profile data |
| [**sMTPUpdateSMTP**](SmtpApi.md#sMTPUpdateSMTP) | **PUT** /SMTP | Updates SMTP profile data |


<a name="sMTPSMTP"></a>
# **sMTPSMTP**
> KeyfactorAPIModelsSMTPSMTPResponse sMTPSMTP(xKeyfactorRequestedWith, xKeyfactorApiVersion)

Gets SMTP profile data

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SmtpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    SmtpApi apiInstance = new SmtpApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorAPIModelsSMTPSMTPResponse result = apiInstance.sMTPSMTP(xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmtpApi#sMTPSMTP");
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

[**KeyfactorAPIModelsSMTPSMTPResponse**](KeyfactorAPIModelsSMTPSMTPResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="sMTPTestSMTP"></a>
# **sMTPTestSMTP**
> KeyfactorAPIModelsSMTPSMTPTestResponse sMTPTestSMTP(xKeyfactorRequestedWith, smtpProfile, xKeyfactorApiVersion)

Tests SMTP profile data

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SmtpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    SmtpApi apiInstance = new SmtpApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorAPIModelsSMTPSMTPTestRequest smtpProfile = new KeyfactorAPIModelsSMTPSMTPTestRequest(); // KeyfactorAPIModelsSMTPSMTPTestRequest | 
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorAPIModelsSMTPSMTPTestResponse result = apiInstance.sMTPTestSMTP(xKeyfactorRequestedWith, smtpProfile, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmtpApi#sMTPTestSMTP");
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
| **smtpProfile** | [**KeyfactorAPIModelsSMTPSMTPTestRequest**](KeyfactorAPIModelsSMTPSMTPTestRequest.md)|  | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorAPIModelsSMTPSMTPTestResponse**](KeyfactorAPIModelsSMTPSMTPTestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="sMTPUpdateSMTP"></a>
# **sMTPUpdateSMTP**
> KeyfactorAPIModelsSMTPSMTPResponse sMTPUpdateSMTP(xKeyfactorRequestedWith, smtpProfile, xKeyfactorApiVersion)

Updates SMTP profile data

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.SmtpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    SmtpApi apiInstance = new SmtpApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorAPIModelsSMTPSMTPRequest smtpProfile = new KeyfactorAPIModelsSMTPSMTPRequest(); // KeyfactorAPIModelsSMTPSMTPRequest | 
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorAPIModelsSMTPSMTPResponse result = apiInstance.sMTPUpdateSMTP(xKeyfactorRequestedWith, smtpProfile, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmtpApi#sMTPUpdateSMTP");
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
| **smtpProfile** | [**KeyfactorAPIModelsSMTPSMTPRequest**](KeyfactorAPIModelsSMTPSMTPRequest.md)|  | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorAPIModelsSMTPSMTPResponse**](KeyfactorAPIModelsSMTPSMTPResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


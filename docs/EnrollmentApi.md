# EnrollmentApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**enrollmentAddToExistingCertStores**](EnrollmentApi.md#enrollmentAddToExistingCertStores) | **POST** /Enrollment/PFX/Replace | Creates management jobs to install a newly enrolled pfx into the same certificate stores as the previous certificate |
| [**enrollmentAvailableRenewalId**](EnrollmentApi.md#enrollmentAvailableRenewalId) | **GET** /Enrollment/AvailableRenewal/Id/{id} | Returns the type of renewal available for a given certificate. |
| [**enrollmentAvailableRenewalThumbprint**](EnrollmentApi.md#enrollmentAvailableRenewalThumbprint) | **GET** /Enrollment/AvailableRenewal/Thumbprint/{thumbprint} | Returns the type of renewal available for a given certificate. |
| [**enrollmentGetMyCSRContext**](EnrollmentApi.md#enrollmentGetMyCSRContext) | **GET** /Enrollment/CSR/Context/My | Returns the list of available CSR enrollment templates and their associated CA mappings that the calling user has permissions on |
| [**enrollmentGetMyPFXContext**](EnrollmentApi.md#enrollmentGetMyPFXContext) | **GET** /Enrollment/PFX/Context/My | Returns the list of available PFX enrollment templates and their associated CA mappings that the calling user has permissions on |
| [**enrollmentGetTemplateEnrollmentSettings**](EnrollmentApi.md#enrollmentGetTemplateEnrollmentSettings) | **GET** /Enrollment/Settings/{id} | Gets the template settings to use during enrollment. The response will be the resolved values for the settings.  If there is a template specific setting, the template specific setting will be used in the response.  If there is not a template specific setting, the global setting will be used in the response. |
| [**enrollmentInstallPFXToCertStore**](EnrollmentApi.md#enrollmentInstallPFXToCertStore) | **POST** /Enrollment/PFX/Deploy | Creates management jobs to install a newly enrolled pfx in to one or more certificate stores |
| [**enrollmentPostCSREnroll**](EnrollmentApi.md#enrollmentPostCSREnroll) | **POST** /Enrollment/CSR | Performs a CSR Enrollment based upon the provided request |
| [**enrollmentPostPFXEnroll**](EnrollmentApi.md#enrollmentPostPFXEnroll) | **POST** /Enrollment/PFX | Performs a PFX Enrollment based upon the provided request |
| [**enrollmentPostParsedCSR**](EnrollmentApi.md#enrollmentPostParsedCSR) | **POST** /Enrollment/CSR/Parse | Parses the provided CSR and returns the properties |
| [**enrollmentRenew**](EnrollmentApi.md#enrollmentRenew) | **POST** /Enrollment/Renew | Performs a renewal based upon the passed in request |


<a name="enrollmentAddToExistingCertStores"></a>
# **enrollmentAddToExistingCertStores**
> KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse enrollmentAddToExistingCertStores(xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Creates management jobs to install a newly enrolled pfx into the same certificate stores as the previous certificate

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.EnrollmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    EnrollmentApi apiInstance = new EnrollmentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsEnrollmentExistingEnrollmentManagementRequest request = new ModelsEnrollmentExistingEnrollmentManagementRequest(); // ModelsEnrollmentExistingEnrollmentManagementRequest | The request to create the management jobs, which includes the request Id of the new pfx and the Id of the existing certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse result = apiInstance.enrollmentAddToExistingCertStores(xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentApi#enrollmentAddToExistingCertStores");
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
| **request** | [**ModelsEnrollmentExistingEnrollmentManagementRequest**](ModelsEnrollmentExistingEnrollmentManagementRequest.md)| The request to create the management jobs, which includes the request Id of the new pfx and the Id of the existing certificate | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse**](KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="enrollmentAvailableRenewalId"></a>
# **enrollmentAvailableRenewalId**
> ModelsEnrollmentAvailableRenewal enrollmentAvailableRenewalId(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion)

Returns the type of renewal available for a given certificate.

### Available Renewal Types ###  | Value              | Description               |  |--------------------|---------------------------|  | 0              | None                 |  | 1             | Seeded PFX                |  | 2                | One-click                   |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.EnrollmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    EnrollmentApi apiInstance = new EnrollmentApi(defaultClient);
    Integer id = 56; // Integer | The Keyfactor certificate Id
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Integer collectionId = 56; // Integer | The collection id for the given certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsEnrollmentAvailableRenewal result = apiInstance.enrollmentAvailableRenewalId(id, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentApi#enrollmentAvailableRenewalId");
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
| **id** | **Integer**| The Keyfactor certificate Id | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **collectionId** | **Integer**| The collection id for the given certificate | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsEnrollmentAvailableRenewal**](ModelsEnrollmentAvailableRenewal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="enrollmentAvailableRenewalThumbprint"></a>
# **enrollmentAvailableRenewalThumbprint**
> ModelsEnrollmentAvailableRenewal enrollmentAvailableRenewalThumbprint(thumbprint, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion)

Returns the type of renewal available for a given certificate.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.EnrollmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    EnrollmentApi apiInstance = new EnrollmentApi(defaultClient);
    String thumbprint = "thumbprint_example"; // String | The certificate thumbprint
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    Integer collectionId = 56; // Integer | The collection id for the given certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsEnrollmentAvailableRenewal result = apiInstance.enrollmentAvailableRenewalThumbprint(thumbprint, xKeyfactorRequestedWith, collectionId, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentApi#enrollmentAvailableRenewalThumbprint");
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
| **thumbprint** | **String**| The certificate thumbprint | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **collectionId** | **Integer**| The collection id for the given certificate | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsEnrollmentAvailableRenewal**](ModelsEnrollmentAvailableRenewal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="enrollmentGetMyCSRContext"></a>
# **enrollmentGetMyCSRContext**
> CoreModelsEnrollmentEnrollmentTemplateCAResponse enrollmentGetMyCSRContext(xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns the list of available CSR enrollment templates and their associated CA mappings that the calling user has permissions on

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.EnrollmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    EnrollmentApi apiInstance = new EnrollmentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      CoreModelsEnrollmentEnrollmentTemplateCAResponse result = apiInstance.enrollmentGetMyCSRContext(xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentApi#enrollmentGetMyCSRContext");
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

[**CoreModelsEnrollmentEnrollmentTemplateCAResponse**](CoreModelsEnrollmentEnrollmentTemplateCAResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="enrollmentGetMyPFXContext"></a>
# **enrollmentGetMyPFXContext**
> CoreModelsEnrollmentEnrollmentTemplateCAResponse enrollmentGetMyPFXContext(xKeyfactorRequestedWith, xKeyfactorApiVersion)

Returns the list of available PFX enrollment templates and their associated CA mappings that the calling user has permissions on

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.EnrollmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    EnrollmentApi apiInstance = new EnrollmentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      CoreModelsEnrollmentEnrollmentTemplateCAResponse result = apiInstance.enrollmentGetMyPFXContext(xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentApi#enrollmentGetMyPFXContext");
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

[**CoreModelsEnrollmentEnrollmentTemplateCAResponse**](CoreModelsEnrollmentEnrollmentTemplateCAResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="enrollmentGetTemplateEnrollmentSettings"></a>
# **enrollmentGetTemplateEnrollmentSettings**
> KeyfactorApiModelsTemplatesTemplateEnrollmentSettingsResponse enrollmentGetTemplateEnrollmentSettings(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Gets the template settings to use during enrollment. The response will be the resolved values for the settings.  If there is a template specific setting, the template specific setting will be used in the response.  If there is not a template specific setting, the global setting will be used in the response.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.EnrollmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    EnrollmentApi apiInstance = new EnrollmentApi(defaultClient);
    Integer id = 56; // Integer | 
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorApiModelsTemplatesTemplateEnrollmentSettingsResponse result = apiInstance.enrollmentGetTemplateEnrollmentSettings(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentApi#enrollmentGetTemplateEnrollmentSettings");
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

[**KeyfactorApiModelsTemplatesTemplateEnrollmentSettingsResponse**](KeyfactorApiModelsTemplatesTemplateEnrollmentSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="enrollmentInstallPFXToCertStore"></a>
# **enrollmentInstallPFXToCertStore**
> KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse enrollmentInstallPFXToCertStore(xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Creates management jobs to install a newly enrolled pfx in to one or more certificate stores

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.EnrollmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    EnrollmentApi apiInstance = new EnrollmentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsEnrollmentEnrollmentManagementRequest request = new KeyfactorApiModelsEnrollmentEnrollmentManagementRequest(); // KeyfactorApiModelsEnrollmentEnrollmentManagementRequest | The request to create the management jobs, which includes the request Id of the new pfx and the Ids and management job properties of the cert stores to add the pfx to
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse result = apiInstance.enrollmentInstallPFXToCertStore(xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentApi#enrollmentInstallPFXToCertStore");
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
| **request** | [**KeyfactorApiModelsEnrollmentEnrollmentManagementRequest**](KeyfactorApiModelsEnrollmentEnrollmentManagementRequest.md)| The request to create the management jobs, which includes the request Id of the new pfx and the Ids and management job properties of the cert stores to add the pfx to | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse**](KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="enrollmentPostCSREnroll"></a>
# **enrollmentPostCSREnroll**
> ModelsEnrollmentCSREnrollmentResponse enrollmentPostCSREnroll(xKeyfactorRequestedWith, xCertificateformat, request, xKeyfactorApiVersion)

Performs a CSR Enrollment based upon the provided request

### Subject Alternative Name Flags ###  | Value              | Description               |  |--------------------|---------------------------|  | other              | OtherName                 |  | rfc822             | RFC822Name                |  | dns                | DNSName                   |  | x400               | X400Address               |  | directory          | DirectoryName             |  | ediparty           | EdipartyName              |  | uri                | UniformResourceIdentifier |  | ip                 | IPAddress                 |  | ip4                | IPv4Address               |  | ip6                | IPv6Address               |  | registeredid       | RegisteredId              |  | ms_ntprincipalname | MS_NTPrincipalName        |  | ms_ntdsreplication | MS_NTDSReplication        |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.EnrollmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    EnrollmentApi apiInstance = new EnrollmentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xCertificateformat = "PEM"; // String | Desired format [PEM, DER]
    ModelsEnrollmentCSREnrollmentRequest request = new ModelsEnrollmentCSREnrollmentRequest(); // ModelsEnrollmentCSREnrollmentRequest | Information needed to perform the CSR Enrollment
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsEnrollmentCSREnrollmentResponse result = apiInstance.enrollmentPostCSREnroll(xKeyfactorRequestedWith, xCertificateformat, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentApi#enrollmentPostCSREnroll");
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
| **xCertificateformat** | **String**| Desired format [PEM, DER] | [default to PEM] |
| **request** | [**ModelsEnrollmentCSREnrollmentRequest**](ModelsEnrollmentCSREnrollmentRequest.md)| Information needed to perform the CSR Enrollment | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsEnrollmentCSREnrollmentResponse**](ModelsEnrollmentCSREnrollmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="enrollmentPostPFXEnroll"></a>
# **enrollmentPostPFXEnroll**
> ModelsEnrollmentPFXEnrollmentResponse enrollmentPostPFXEnroll(xKeyfactorRequestedWith, xCertificateformat, request, xKeyfactorApiVersion)

Performs a PFX Enrollment based upon the provided request

### IMPORTANT:   - The &lt;b&gt;&#39;RenewalCertificateId&#39;&lt;/b&gt; field in the request should be set to &lt;b&gt;null&lt;/b&gt; if the certificate is not being renewed as part of the enrollment. A value of &lt;b&gt;0&lt;/b&gt; will produce an error.    ### Subject Alternative Name Flags ###  | Value              | Description               |  |--------------------|---------------------------|  | other              | OtherName                 |  | rfc822             | RFC822Name                |  | dns                | DNSName                   |  | x400               | X400Address               |  | directory          | DirectoryName             |  | ediparty           | EdipartyName              |  | uri                | UniformResourceIdentifier |  | ip                 | IPAddress                 |  | ip4                | IPv4Address               |  | ip6                | IPv6Address               |  | registeredid       | RegisteredId              |  | ms_ntprincipalname | MS_NTPrincipalName        |  | ms_ntdsreplication | MS_NTDSReplication        |

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.EnrollmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    EnrollmentApi apiInstance = new EnrollmentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xCertificateformat = "PFX"; // String | Desired format [PFX, Zip, STORE]
    ModelsEnrollmentPFXEnrollmentRequest request = new ModelsEnrollmentPFXEnrollmentRequest(); // ModelsEnrollmentPFXEnrollmentRequest | The information needed to perform the PFX Enrollment
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsEnrollmentPFXEnrollmentResponse result = apiInstance.enrollmentPostPFXEnroll(xKeyfactorRequestedWith, xCertificateformat, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentApi#enrollmentPostPFXEnroll");
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
| **xCertificateformat** | **String**| Desired format [PFX, Zip, STORE] | [default to PFX] |
| **request** | [**ModelsEnrollmentPFXEnrollmentRequest**](ModelsEnrollmentPFXEnrollmentRequest.md)| The information needed to perform the PFX Enrollment | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsEnrollmentPFXEnrollmentResponse**](ModelsEnrollmentPFXEnrollmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="enrollmentPostParsedCSR"></a>
# **enrollmentPostParsedCSR**
> List&lt;String&gt; enrollmentPostParsedCSR(xKeyfactorRequestedWith, csr, xKeyfactorApiVersion)

Parses the provided CSR and returns the properties

This functionality is equivalent to the result of pasting a CSR into the field within the Management Portal CSR Enrollment page.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.EnrollmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    EnrollmentApi apiInstance = new EnrollmentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsCSRContents csr = new ModelsCSRContents(); // ModelsCSRContents | CSR to be parsed
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<String> result = apiInstance.enrollmentPostParsedCSR(xKeyfactorRequestedWith, csr, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentApi#enrollmentPostParsedCSR");
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
| **csr** | [**ModelsCSRContents**](ModelsCSRContents.md)| CSR to be parsed | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="enrollmentRenew"></a>
# **enrollmentRenew**
> ModelsEnrollmentRenewalResponse enrollmentRenew(xKeyfactorRequestedWith, request, collectionId, xKeyfactorApiVersion)

Performs a renewal based upon the passed in request

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.EnrollmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    EnrollmentApi apiInstance = new EnrollmentApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsEnrollmentRenewalRequest request = new ModelsEnrollmentRenewalRequest(); // ModelsEnrollmentRenewalRequest | The information needed to perform the renewal
    Integer collectionId = 56; // Integer | The collection id for the given certificate
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsEnrollmentRenewalResponse result = apiInstance.enrollmentRenew(xKeyfactorRequestedWith, request, collectionId, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrollmentApi#enrollmentRenew");
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
| **request** | [**ModelsEnrollmentRenewalRequest**](ModelsEnrollmentRenewalRequest.md)| The information needed to perform the renewal | |
| **collectionId** | **Integer**| The collection id for the given certificate | [optional] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsEnrollmentRenewalResponse**](ModelsEnrollmentRenewalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


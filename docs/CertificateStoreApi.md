# CertificateStoreApi

All URIs are relative to *https://192.168.78.139/KeyfactorAPI*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**certificateStoreAddCertificate**](CertificateStoreApi.md#certificateStoreAddCertificate) | **POST** /CertificateStores/Certificates/Add | Configures a management job to add a certificate to one or more stores with the provided schedule |
| [**certificateStoreApprovePending**](CertificateStoreApi.md#certificateStoreApprovePending) | **POST** /CertificateStores/Approve | Approves the provided certificate stores to make them available for management |
| [**certificateStoreConfigureDiscoveryJob**](CertificateStoreApi.md#certificateStoreConfigureDiscoveryJob) | **PUT** /CertificateStores/DiscoveryJob | Configures a discovery job to locate currently unmanaged certificate stores |
| [**certificateStoreCreateCertificateStoreServer**](CertificateStoreApi.md#certificateStoreCreateCertificateStoreServer) | **POST** /CertificateStores/Server | Creates a new certificate store server with the provided properties |
| [**certificateStoreDeleteCertificateStore**](CertificateStoreApi.md#certificateStoreDeleteCertificateStore) | **DELETE** /CertificateStores/{id} | Deletes a persisted certificate store by its Keyfactor identifier |
| [**certificateStoreDeleteCertificateStores**](CertificateStoreApi.md#certificateStoreDeleteCertificateStores) | **DELETE** /CertificateStores | Deletes multiple persisted certificate store entities by their identifiers |
| [**certificateStoreGetCertificateStoreInventory**](CertificateStoreApi.md#certificateStoreGetCertificateStoreInventory) | **GET** /CertificateStores/{id}/Inventory | Returns a single certificate store&#39;s inventory associated with the provided id |
| [**certificateStoreRemoveCertificate**](CertificateStoreApi.md#certificateStoreRemoveCertificate) | **POST** /CertificateStores/Certificates/Remove | Configures a management job to remove a certificate from one or more stores with the provided schedule |
| [**certificateStoreSchedule**](CertificateStoreApi.md#certificateStoreSchedule) | **POST** /CertificateStores/Schedule | Creates an inventory schedule for the provided certificate stores |
| [**certificateStoreScheduleForReenrollment**](CertificateStoreApi.md#certificateStoreScheduleForReenrollment) | **POST** /CertificateStores/Reenrollment | Schedules a certificate store for reenrollment |
| [**certificateStoreSetPassword**](CertificateStoreApi.md#certificateStoreSetPassword) | **PUT** /CertificateStores/Password | Sets a password for the requested certificate store |
| [**certificateStoreUpdateCertificateStoreServer**](CertificateStoreApi.md#certificateStoreUpdateCertificateStoreServer) | **PUT** /CertificateStores/Server | Updates a given certificate store server with the properties of the provided instance |


<a name="certificateStoreAddCertificate"></a>
# **certificateStoreAddCertificate**
> List&lt;UUID&gt; certificateStoreAddCertificate(xKeyfactorRequestedWith, addRequest, xKeyfactorApiVersion)

Configures a management job to add a certificate to one or more stores with the provided schedule

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreApi apiInstance = new CertificateStoreApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsCertificateStoresAddCertificateRequest addRequest = new KeyfactorApiModelsCertificateStoresAddCertificateRequest(); // KeyfactorApiModelsCertificateStoresAddCertificateRequest | Configuration details of the management job
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<UUID> result = apiInstance.certificateStoreAddCertificate(xKeyfactorRequestedWith, addRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreApi#certificateStoreAddCertificate");
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
| **addRequest** | [**KeyfactorApiModelsCertificateStoresAddCertificateRequest**](KeyfactorApiModelsCertificateStoresAddCertificateRequest.md)| Configuration details of the management job | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;UUID&gt;**](UUID.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateStoreApprovePending"></a>
# **certificateStoreApprovePending**
> certificateStoreApprovePending(xKeyfactorRequestedWith, keystores, xKeyfactorApiVersion)

Approves the provided certificate stores to make them available for management

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreApi apiInstance = new CertificateStoreApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest> keystores = Arrays.asList(); // List<KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest> | Certificate stores to be approved
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateStoreApprovePending(xKeyfactorRequestedWith, keystores, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreApi#certificateStoreApprovePending");
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
| **keystores** | [**List&lt;KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest&gt;**](KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest.md)| Certificate stores to be approved | |
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

<a name="certificateStoreConfigureDiscoveryJob"></a>
# **certificateStoreConfigureDiscoveryJob**
> certificateStoreConfigureDiscoveryJob(xKeyfactorRequestedWith, discoveryJobRequest, xKeyfactorApiVersion)

Configures a discovery job to locate currently unmanaged certificate stores

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreApi apiInstance = new CertificateStoreApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsDiscoveryJobRequest discoveryJobRequest = new ModelsDiscoveryJobRequest(); // ModelsDiscoveryJobRequest | Configuration properties of the discovery job
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateStoreConfigureDiscoveryJob(xKeyfactorRequestedWith, discoveryJobRequest, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreApi#certificateStoreConfigureDiscoveryJob");
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
| **discoveryJobRequest** | [**ModelsDiscoveryJobRequest**](ModelsDiscoveryJobRequest.md)| Configuration properties of the discovery job | |
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

<a name="certificateStoreCreateCertificateStoreServer"></a>
# **certificateStoreCreateCertificateStoreServer**
> ModelsCertificateStoreServerResponse certificateStoreCreateCertificateStoreServer(xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Creates a new certificate store server with the provided properties

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreApi apiInstance = new CertificateStoreApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsCertificateStoreCreateServerRequest request = new ModelsCertificateStoreCreateServerRequest(); // ModelsCertificateStoreCreateServerRequest | Certificate store server to be created with the provided properties
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCertificateStoreServerResponse result = apiInstance.certificateStoreCreateCertificateStoreServer(xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreApi#certificateStoreCreateCertificateStoreServer");
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
| **request** | [**ModelsCertificateStoreCreateServerRequest**](ModelsCertificateStoreCreateServerRequest.md)| Certificate store server to be created with the provided properties | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCertificateStoreServerResponse**](ModelsCertificateStoreServerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateStoreDeleteCertificateStore"></a>
# **certificateStoreDeleteCertificateStore**
> certificateStoreDeleteCertificateStore(id, xKeyfactorRequestedWith, xKeyfactorApiVersion)

Deletes a persisted certificate store by its Keyfactor identifier

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreApi apiInstance = new CertificateStoreApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Keyfactor certificate store identifier (GUID)
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateStoreDeleteCertificateStore(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreApi#certificateStoreDeleteCertificateStore");
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
| **id** | **UUID**| Keyfactor certificate store identifier (GUID) | |
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

<a name="certificateStoreDeleteCertificateStores"></a>
# **certificateStoreDeleteCertificateStores**
> certificateStoreDeleteCertificateStores(xKeyfactorRequestedWith, ids, xKeyfactorApiVersion)

Deletes multiple persisted certificate store entities by their identifiers

This will ignore individual delete failures, and continue processing the array.

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreApi apiInstance = new CertificateStoreApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    List<UUID> ids = Arrays.asList(); // List<UUID> | Array of Keyfactor identifiers (GUID) for the certificate stores to be deleted
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateStoreDeleteCertificateStores(xKeyfactorRequestedWith, ids, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreApi#certificateStoreDeleteCertificateStores");
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
| **ids** | [**List&lt;UUID&gt;**](UUID.md)| Array of Keyfactor identifiers (GUID) for the certificate stores to be deleted | |
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

<a name="certificateStoreGetCertificateStoreInventory"></a>
# **certificateStoreGetCertificateStoreInventory**
> List&lt;ModelsCertificateStoreInventory&gt; certificateStoreGetCertificateStoreInventory(id, xKeyfactorRequestedWith, xKeyfactorApiVersion, queryPageReturned, queryReturnLimit, querySortField, querySortAscending)

Returns a single certificate store&#39;s inventory associated with the provided id

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreApi apiInstance = new CertificateStoreApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Keyfactor identifier (GUID) of the certificate store
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    Integer queryPageReturned = 56; // Integer | The current page within the result set to be returned
    Integer queryReturnLimit = 56; // Integer | Maximum number of records to be returned in a single call
    String querySortField = "querySortField_example"; // String | Field by which the results should be sorted (OperationStart, OperationEnd, UserName)
    Integer querySortAscending = 0; // Integer | Field sort direction [0=ascending, 1=descending]
    try {
      List<ModelsCertificateStoreInventory> result = apiInstance.certificateStoreGetCertificateStoreInventory(id, xKeyfactorRequestedWith, xKeyfactorApiVersion, queryPageReturned, queryReturnLimit, querySortField, querySortAscending);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreApi#certificateStoreGetCertificateStoreInventory");
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
| **id** | **UUID**| Keyfactor identifier (GUID) of the certificate store | |
| **xKeyfactorRequestedWith** | **String**| Type of the request [XMLHttpRequest, APIClient] | [default to APIClient] |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |
| **queryPageReturned** | **Integer**| The current page within the result set to be returned | [optional] |
| **queryReturnLimit** | **Integer**| Maximum number of records to be returned in a single call | [optional] |
| **querySortField** | **String**| Field by which the results should be sorted (OperationStart, OperationEnd, UserName) | [optional] |
| **querySortAscending** | **Integer**| Field sort direction [0&#x3D;ascending, 1&#x3D;descending] | [optional] [enum: 0, 1] |

### Return type

[**List&lt;ModelsCertificateStoreInventory&gt;**](ModelsCertificateStoreInventory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateStoreRemoveCertificate"></a>
# **certificateStoreRemoveCertificate**
> List&lt;UUID&gt; certificateStoreRemoveCertificate(xKeyfactorRequestedWith, removalRequest, xKeyfactorApiVersion)

Configures a management job to remove a certificate from one or more stores with the provided schedule

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreApi apiInstance = new CertificateStoreApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsCertificateStoresRemoveCertificateRequest removalRequest = new KeyfactorApiModelsCertificateStoresRemoveCertificateRequest(); // KeyfactorApiModelsCertificateStoresRemoveCertificateRequest | Configuration details of the management job
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      List<UUID> result = apiInstance.certificateStoreRemoveCertificate(xKeyfactorRequestedWith, removalRequest, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreApi#certificateStoreRemoveCertificate");
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
| **removalRequest** | [**KeyfactorApiModelsCertificateStoresRemoveCertificateRequest**](KeyfactorApiModelsCertificateStoresRemoveCertificateRequest.md)| Configuration details of the management job | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**List&lt;UUID&gt;**](UUID.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="certificateStoreSchedule"></a>
# **certificateStoreSchedule**
> certificateStoreSchedule(xKeyfactorRequestedWith, futureSchedule, xKeyfactorApiVersion)

Creates an inventory schedule for the provided certificate stores

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreApi apiInstance = new CertificateStoreApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsCertStoresSchedule futureSchedule = new ModelsCertStoresSchedule(); // ModelsCertStoresSchedule | Certificate store identifiers and the desired schedule
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateStoreSchedule(xKeyfactorRequestedWith, futureSchedule, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreApi#certificateStoreSchedule");
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
| **futureSchedule** | [**ModelsCertStoresSchedule**](ModelsCertStoresSchedule.md)| Certificate store identifiers and the desired schedule | |
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

<a name="certificateStoreScheduleForReenrollment"></a>
# **certificateStoreScheduleForReenrollment**
> certificateStoreScheduleForReenrollment(xKeyfactorRequestedWith, reenroll, xKeyfactorApiVersion)

Schedules a certificate store for reenrollment

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreApi apiInstance = new CertificateStoreApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    KeyfactorApiModelsCertificateStoresReenrollmentRequest reenroll = new KeyfactorApiModelsCertificateStoresReenrollmentRequest(); // KeyfactorApiModelsCertificateStoresReenrollmentRequest | An object that contains a Keystore Id, a Agent Guid, a string SubjectName and string Alias
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateStoreScheduleForReenrollment(xKeyfactorRequestedWith, reenroll, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreApi#certificateStoreScheduleForReenrollment");
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
| **reenroll** | [**KeyfactorApiModelsCertificateStoresReenrollmentRequest**](KeyfactorApiModelsCertificateStoresReenrollmentRequest.md)| An object that contains a Keystore Id, a Agent Guid, a string SubjectName and string Alias | |
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

<a name="certificateStoreSetPassword"></a>
# **certificateStoreSetPassword**
> certificateStoreSetPassword(xKeyfactorRequestedWith, passwordRequest, xKeyfactorApiVersion)

Sets a password for the requested certificate store

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreApi apiInstance = new CertificateStoreApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsCertStoreNewPasswordRequest passwordRequest = new ModelsCertStoreNewPasswordRequest(); // ModelsCertStoreNewPasswordRequest | Identifier of the certificate store and the password to be applied to it
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      apiInstance.certificateStoreSetPassword(xKeyfactorRequestedWith, passwordRequest, xKeyfactorApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreApi#certificateStoreSetPassword");
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
| **passwordRequest** | [**ModelsCertStoreNewPasswordRequest**](ModelsCertStoreNewPasswordRequest.md)| Identifier of the certificate store and the password to be applied to it | |
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

<a name="certificateStoreUpdateCertificateStoreServer"></a>
# **certificateStoreUpdateCertificateStoreServer**
> ModelsCertificateStoreServerResponse certificateStoreUpdateCertificateStoreServer(xKeyfactorRequestedWith, request, xKeyfactorApiVersion)

Updates a given certificate store server with the properties of the provided instance

### Example
```java
// Import classes:
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.models.*;
import com.keyfactor.command.client.api.CertificateStoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://192.168.78.139/KeyfactorAPI");

    CertificateStoreApi apiInstance = new CertificateStoreApi(defaultClient);
    String xKeyfactorRequestedWith = "APIClient"; // String | Type of the request [XMLHttpRequest, APIClient]
    ModelsCertificateStoreUpdateServerRequest request = new ModelsCertificateStoreUpdateServerRequest(); // ModelsCertificateStoreUpdateServerRequest | Server to be updated with the provided properties
    String xKeyfactorApiVersion = "1"; // String | Desired version of the api, if not provided defaults to v1
    try {
      ModelsCertificateStoreServerResponse result = apiInstance.certificateStoreUpdateCertificateStoreServer(xKeyfactorRequestedWith, request, xKeyfactorApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificateStoreApi#certificateStoreUpdateCertificateStoreServer");
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
| **request** | [**ModelsCertificateStoreUpdateServerRequest**](ModelsCertificateStoreUpdateServerRequest.md)| Server to be updated with the provided properties | |
| **xKeyfactorApiVersion** | **String**| Desired version of the api, if not provided defaults to v1 | [optional] [default to 1] |

### Return type

[**ModelsCertificateStoreServerResponse**](ModelsCertificateStoreServerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


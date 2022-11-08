/*
 * Keyfactor-v1
 * This reference serves to document REST-based methods to manage and integrate with Keyfactor. In addition, an embedded interface allows for the execution of calls against the current Keyfactor API instance.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.keyfactor.command.client.api;

import com.keyfactor.command.client.ApiCallback;
import com.keyfactor.command.client.ApiClient;
import com.keyfactor.command.client.ApiException;
import com.keyfactor.command.client.ApiResponse;
import com.keyfactor.command.client.Configuration;
import com.keyfactor.command.client.Pair;
import com.keyfactor.command.client.ProgressRequestBody;
import com.keyfactor.command.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.keyfactor.command.client.model.KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MacEnrollmentApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MacEnrollmentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MacEnrollmentApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for macEnrollmentEditMacEnrollment
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param macEnrollmentSettings  (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call macEnrollmentEditMacEnrollmentCall(String xKeyfactorRequestedWith, KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel macEnrollmentSettings, String xKeyfactorApiVersion, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = macEnrollmentSettings;

        // create path and map variables
        String localVarPath = "/MacEnrollment";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xKeyfactorApiVersion != null) {
            localVarHeaderParams.put("x-keyfactor-api-version", localVarApiClient.parameterToString(xKeyfactorApiVersion));
        }

        if (xKeyfactorRequestedWith != null) {
            localVarHeaderParams.put("x-keyfactor-requested-with", localVarApiClient.parameterToString(xKeyfactorRequestedWith));
        }

        final String[] localVarAccepts = {
            "application/json",
            "text/json",
            "application/xml",
            "text/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "text/json",
            "application/xml",
            "text/xml",
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call macEnrollmentEditMacEnrollmentValidateBeforeCall(String xKeyfactorRequestedWith, KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel macEnrollmentSettings, String xKeyfactorApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xKeyfactorRequestedWith' is set
        if (xKeyfactorRequestedWith == null) {
            throw new ApiException("Missing the required parameter 'xKeyfactorRequestedWith' when calling macEnrollmentEditMacEnrollment(Async)");
        }

        // verify the required parameter 'macEnrollmentSettings' is set
        if (macEnrollmentSettings == null) {
            throw new ApiException("Missing the required parameter 'macEnrollmentSettings' when calling macEnrollmentEditMacEnrollment(Async)");
        }

        return macEnrollmentEditMacEnrollmentCall(xKeyfactorRequestedWith, macEnrollmentSettings, xKeyfactorApiVersion, _callback);

    }

    /**
     * Updates mac enrollment settings data
     * 
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param macEnrollmentSettings  (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @return KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel macEnrollmentEditMacEnrollment(String xKeyfactorRequestedWith, KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel macEnrollmentSettings, String xKeyfactorApiVersion) throws ApiException {
        ApiResponse<KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel> localVarResp = macEnrollmentEditMacEnrollmentWithHttpInfo(xKeyfactorRequestedWith, macEnrollmentSettings, xKeyfactorApiVersion);
        return localVarResp.getData();
    }

    /**
     * Updates mac enrollment settings data
     * 
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param macEnrollmentSettings  (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @return ApiResponse&lt;KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel> macEnrollmentEditMacEnrollmentWithHttpInfo(String xKeyfactorRequestedWith, KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel macEnrollmentSettings, String xKeyfactorApiVersion) throws ApiException {
        okhttp3.Call localVarCall = macEnrollmentEditMacEnrollmentValidateBeforeCall(xKeyfactorRequestedWith, macEnrollmentSettings, xKeyfactorApiVersion, null);
        Type localVarReturnType = new TypeToken<KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Updates mac enrollment settings data (asynchronously)
     * 
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param macEnrollmentSettings  (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call macEnrollmentEditMacEnrollmentAsync(String xKeyfactorRequestedWith, KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel macEnrollmentSettings, String xKeyfactorApiVersion, final ApiCallback<KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = macEnrollmentEditMacEnrollmentValidateBeforeCall(xKeyfactorRequestedWith, macEnrollmentSettings, xKeyfactorApiVersion, _callback);
        Type localVarReturnType = new TypeToken<KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for macEnrollmentMacEnrollment
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call macEnrollmentMacEnrollmentCall(String xKeyfactorRequestedWith, String xKeyfactorApiVersion, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/MacEnrollment";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xKeyfactorApiVersion != null) {
            localVarHeaderParams.put("x-keyfactor-api-version", localVarApiClient.parameterToString(xKeyfactorApiVersion));
        }

        if (xKeyfactorRequestedWith != null) {
            localVarHeaderParams.put("x-keyfactor-requested-with", localVarApiClient.parameterToString(xKeyfactorRequestedWith));
        }

        final String[] localVarAccepts = {
            "application/json",
            "text/json",
            "application/xml",
            "text/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call macEnrollmentMacEnrollmentValidateBeforeCall(String xKeyfactorRequestedWith, String xKeyfactorApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xKeyfactorRequestedWith' is set
        if (xKeyfactorRequestedWith == null) {
            throw new ApiException("Missing the required parameter 'xKeyfactorRequestedWith' when calling macEnrollmentMacEnrollment(Async)");
        }

        return macEnrollmentMacEnrollmentCall(xKeyfactorRequestedWith, xKeyfactorApiVersion, _callback);

    }

    /**
     * Gets mac enrollment settings data
     * 
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @return KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel macEnrollmentMacEnrollment(String xKeyfactorRequestedWith, String xKeyfactorApiVersion) throws ApiException {
        ApiResponse<KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel> localVarResp = macEnrollmentMacEnrollmentWithHttpInfo(xKeyfactorRequestedWith, xKeyfactorApiVersion);
        return localVarResp.getData();
    }

    /**
     * Gets mac enrollment settings data
     * 
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @return ApiResponse&lt;KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel> macEnrollmentMacEnrollmentWithHttpInfo(String xKeyfactorRequestedWith, String xKeyfactorApiVersion) throws ApiException {
        okhttp3.Call localVarCall = macEnrollmentMacEnrollmentValidateBeforeCall(xKeyfactorRequestedWith, xKeyfactorApiVersion, null);
        Type localVarReturnType = new TypeToken<KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets mac enrollment settings data (asynchronously)
     * 
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call macEnrollmentMacEnrollmentAsync(String xKeyfactorRequestedWith, String xKeyfactorApiVersion, final ApiCallback<KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = macEnrollmentMacEnrollmentValidateBeforeCall(xKeyfactorRequestedWith, xKeyfactorApiVersion, _callback);
        Type localVarReturnType = new TypeToken<KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

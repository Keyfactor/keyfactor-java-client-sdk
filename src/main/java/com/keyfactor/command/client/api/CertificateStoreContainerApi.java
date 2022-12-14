/*
 * Copyright 2022 Keyfactor
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.  You may obtain a
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0.  Unless
 * required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for
 * thespecific language governing permissions and limitations under the
 * License.
 *
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


import com.keyfactor.command.client.model.ModelsCertificateStoreContainerListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CertificateStoreContainerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CertificateStoreContainerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CertificateStoreContainerApi(ApiClient apiClient) {
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
     * Build call for certificateStoreContainerDeleteCertificateStoreContainers
     * @param id Id for the certificate store container (required)
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call certificateStoreContainerDeleteCertificateStoreContainersCall(Integer id, String xKeyfactorRequestedWith, String xKeyfactorApiVersion, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/CertificateStoreContainers/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call certificateStoreContainerDeleteCertificateStoreContainersValidateBeforeCall(Integer id, String xKeyfactorRequestedWith, String xKeyfactorApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling certificateStoreContainerDeleteCertificateStoreContainers(Async)");
        }

        // verify the required parameter 'xKeyfactorRequestedWith' is set
        if (xKeyfactorRequestedWith == null) {
            throw new ApiException("Missing the required parameter 'xKeyfactorRequestedWith' when calling certificateStoreContainerDeleteCertificateStoreContainers(Async)");
        }

        return certificateStoreContainerDeleteCertificateStoreContainersCall(id, xKeyfactorRequestedWith, xKeyfactorApiVersion, _callback);

    }

    /**
     * Delete a certificate store container
     * 
     * @param id Id for the certificate store container (required)
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public void certificateStoreContainerDeleteCertificateStoreContainers(Integer id, String xKeyfactorRequestedWith, String xKeyfactorApiVersion) throws ApiException {
        certificateStoreContainerDeleteCertificateStoreContainersWithHttpInfo(id, xKeyfactorRequestedWith, xKeyfactorApiVersion);
    }

    /**
     * Delete a certificate store container
     * 
     * @param id Id for the certificate store container (required)
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> certificateStoreContainerDeleteCertificateStoreContainersWithHttpInfo(Integer id, String xKeyfactorRequestedWith, String xKeyfactorApiVersion) throws ApiException {
        okhttp3.Call localVarCall = certificateStoreContainerDeleteCertificateStoreContainersValidateBeforeCall(id, xKeyfactorRequestedWith, xKeyfactorApiVersion, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete a certificate store container (asynchronously)
     * 
     * @param id Id for the certificate store container (required)
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call certificateStoreContainerDeleteCertificateStoreContainersAsync(Integer id, String xKeyfactorRequestedWith, String xKeyfactorApiVersion, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = certificateStoreContainerDeleteCertificateStoreContainersValidateBeforeCall(id, xKeyfactorRequestedWith, xKeyfactorApiVersion, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for certificateStoreContainerGetAllCertificateStoreContainers
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @param pqQueryString Contents of the query (ex: field1 -eq value1 AND field2 -gt value2) (optional)
     * @param pqPageReturned The current page within the result set to be returned (optional)
     * @param pqReturnLimit Maximum number of records to be returned in a single call (optional)
     * @param pqSortField Field by which the results should be sorted (view results via Management Portal for sortable columns) (optional)
     * @param pqSortAscending Field sort direction [0&#x3D;ascending, 1&#x3D;descending] (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call certificateStoreContainerGetAllCertificateStoreContainersCall(String xKeyfactorRequestedWith, String xKeyfactorApiVersion, String pqQueryString, Integer pqPageReturned, Integer pqReturnLimit, String pqSortField, Integer pqSortAscending, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/CertificateStoreContainers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pqQueryString != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pq.queryString", pqQueryString));
        }

        if (pqPageReturned != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pq.pageReturned", pqPageReturned));
        }

        if (pqReturnLimit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pq.returnLimit", pqReturnLimit));
        }

        if (pqSortField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pq.sortField", pqSortField));
        }

        if (pqSortAscending != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pq.sortAscending", pqSortAscending));
        }

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
    private okhttp3.Call certificateStoreContainerGetAllCertificateStoreContainersValidateBeforeCall(String xKeyfactorRequestedWith, String xKeyfactorApiVersion, String pqQueryString, Integer pqPageReturned, Integer pqReturnLimit, String pqSortField, Integer pqSortAscending, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xKeyfactorRequestedWith' is set
        if (xKeyfactorRequestedWith == null) {
            throw new ApiException("Missing the required parameter 'xKeyfactorRequestedWith' when calling certificateStoreContainerGetAllCertificateStoreContainers(Async)");
        }

        return certificateStoreContainerGetAllCertificateStoreContainersCall(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending, _callback);

    }

    /**
     * Returns all certificate store container according to the provided filter and output parameters
     * 
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @param pqQueryString Contents of the query (ex: field1 -eq value1 AND field2 -gt value2) (optional)
     * @param pqPageReturned The current page within the result set to be returned (optional)
     * @param pqReturnLimit Maximum number of records to be returned in a single call (optional)
     * @param pqSortField Field by which the results should be sorted (view results via Management Portal for sortable columns) (optional)
     * @param pqSortAscending Field sort direction [0&#x3D;ascending, 1&#x3D;descending] (optional)
     * @return List&lt;ModelsCertificateStoreContainerListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ModelsCertificateStoreContainerListResponse> certificateStoreContainerGetAllCertificateStoreContainers(String xKeyfactorRequestedWith, String xKeyfactorApiVersion, String pqQueryString, Integer pqPageReturned, Integer pqReturnLimit, String pqSortField, Integer pqSortAscending) throws ApiException {
        ApiResponse<List<ModelsCertificateStoreContainerListResponse>> localVarResp = certificateStoreContainerGetAllCertificateStoreContainersWithHttpInfo(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending);
        return localVarResp.getData();
    }

    /**
     * Returns all certificate store container according to the provided filter and output parameters
     * 
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @param pqQueryString Contents of the query (ex: field1 -eq value1 AND field2 -gt value2) (optional)
     * @param pqPageReturned The current page within the result set to be returned (optional)
     * @param pqReturnLimit Maximum number of records to be returned in a single call (optional)
     * @param pqSortField Field by which the results should be sorted (view results via Management Portal for sortable columns) (optional)
     * @param pqSortAscending Field sort direction [0&#x3D;ascending, 1&#x3D;descending] (optional)
     * @return ApiResponse&lt;List&lt;ModelsCertificateStoreContainerListResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ModelsCertificateStoreContainerListResponse>> certificateStoreContainerGetAllCertificateStoreContainersWithHttpInfo(String xKeyfactorRequestedWith, String xKeyfactorApiVersion, String pqQueryString, Integer pqPageReturned, Integer pqReturnLimit, String pqSortField, Integer pqSortAscending) throws ApiException {
        okhttp3.Call localVarCall = certificateStoreContainerGetAllCertificateStoreContainersValidateBeforeCall(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending, null);
        Type localVarReturnType = new TypeToken<List<ModelsCertificateStoreContainerListResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns all certificate store container according to the provided filter and output parameters (asynchronously)
     * 
     * @param xKeyfactorRequestedWith Type of the request [XMLHttpRequest, APIClient] (required)
     * @param xKeyfactorApiVersion Desired version of the api, if not provided defaults to v1 (optional, default to 1)
     * @param pqQueryString Contents of the query (ex: field1 -eq value1 AND field2 -gt value2) (optional)
     * @param pqPageReturned The current page within the result set to be returned (optional)
     * @param pqReturnLimit Maximum number of records to be returned in a single call (optional)
     * @param pqSortField Field by which the results should be sorted (view results via Management Portal for sortable columns) (optional)
     * @param pqSortAscending Field sort direction [0&#x3D;ascending, 1&#x3D;descending] (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call certificateStoreContainerGetAllCertificateStoreContainersAsync(String xKeyfactorRequestedWith, String xKeyfactorApiVersion, String pqQueryString, Integer pqPageReturned, Integer pqReturnLimit, String pqSortField, Integer pqSortAscending, final ApiCallback<List<ModelsCertificateStoreContainerListResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = certificateStoreContainerGetAllCertificateStoreContainersValidateBeforeCall(xKeyfactorRequestedWith, xKeyfactorApiVersion, pqQueryString, pqPageReturned, pqReturnLimit, pqSortField, pqSortAscending, _callback);
        Type localVarReturnType = new TypeToken<List<ModelsCertificateStoreContainerListResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

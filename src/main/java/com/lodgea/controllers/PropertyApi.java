/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: support@lodgea.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lodgea.controllers;

import com.lodgea.ApiCallback;
import com.lodgea.ApiClient;
import com.lodgea.ApiException;
import com.lodgea.ApiResponse;
import com.lodgea.Configuration;
import com.lodgea.Pair;
import com.lodgea.ProgressRequestBody;
import com.lodgea.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.lodgea.model.PropertyGet;
import com.lodgea.model.PropertyList;
import com.lodgea.model.V1PropertyGetPost200Response;
import com.lodgea.model.V1PropertyListPost200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PropertyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PropertyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PropertyApi(ApiClient apiClient) {
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
     * Build call for v1PropertyGetPost
     * @param propertyGet Provide the property ID to get more information about it (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request - missing parameter </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 401 </td><td> API Key is missing or invalid </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 503 </td><td> Server error </td><td>  * apiKey -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call v1PropertyGetPostCall(PropertyGet propertyGet, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = propertyGet;

        // create path and map variables
        String localVarPath = "/v1/property/get";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1PropertyGetPostValidateBeforeCall(PropertyGet propertyGet, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'propertyGet' is set
        if (propertyGet == null) {
            throw new ApiException("Missing the required parameter 'propertyGet' when calling v1PropertyGetPost(Async)");
        }
        

        okhttp3.Call localVarCall = v1PropertyGetPostCall(propertyGet, _callback);
        return localVarCall;

    }

    /**
     * Get Property by ID
     * Get all information about a specific property by its ID. This parameter is required.
     * @param propertyGet Provide the property ID to get more information about it (required)
     * @return V1PropertyGetPost200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request - missing parameter </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 401 </td><td> API Key is missing or invalid </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 503 </td><td> Server error </td><td>  * apiKey -  <br>  </td></tr>
     </table>
     */
    public V1PropertyGetPost200Response v1PropertyGetPost(PropertyGet propertyGet) throws ApiException {
        ApiResponse<V1PropertyGetPost200Response> localVarResp = v1PropertyGetPostWithHttpInfo(propertyGet);
        return localVarResp.getData();
    }

    /**
     * Get Property by ID
     * Get all information about a specific property by its ID. This parameter is required.
     * @param propertyGet Provide the property ID to get more information about it (required)
     * @return ApiResponse&lt;V1PropertyGetPost200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request - missing parameter </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 401 </td><td> API Key is missing or invalid </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 503 </td><td> Server error </td><td>  * apiKey -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<V1PropertyGetPost200Response> v1PropertyGetPostWithHttpInfo(PropertyGet propertyGet) throws ApiException {
        okhttp3.Call localVarCall = v1PropertyGetPostValidateBeforeCall(propertyGet, null);
        Type localVarReturnType = new TypeToken<V1PropertyGetPost200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Property by ID (asynchronously)
     * Get all information about a specific property by its ID. This parameter is required.
     * @param propertyGet Provide the property ID to get more information about it (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request - missing parameter </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 401 </td><td> API Key is missing or invalid </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 503 </td><td> Server error </td><td>  * apiKey -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call v1PropertyGetPostAsync(PropertyGet propertyGet, final ApiCallback<V1PropertyGetPost200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1PropertyGetPostValidateBeforeCall(propertyGet, _callback);
        Type localVarReturnType = new TypeToken<V1PropertyGetPost200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1PropertyListPost
     * @param propertyList Provide the search keyword and optionally a page token to fetch further responses. The page token can be added if additional results should be returned. It is a base64 encoded dictionary and included in the first response in case not all results were delivered (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request - missing parameter </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 401 </td><td> API Key is missing or invalid </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 503 </td><td> Server error </td><td>  * apiKey -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call v1PropertyListPostCall(PropertyList propertyList, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = propertyList;

        // create path and map variables
        String localVarPath = "/v1/property/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1PropertyListPostValidateBeforeCall(PropertyList propertyList, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'propertyList' is set
        if (propertyList == null) {
            throw new ApiException("Missing the required parameter 'propertyList' when calling v1PropertyListPost(Async)");
        }
        

        okhttp3.Call localVarCall = v1PropertyListPostCall(propertyList, _callback);
        return localVarCall;

    }

    /**
     * List properties by a specific keyword
     * List properties by a specific keyword.
     * @param propertyList Provide the search keyword and optionally a page token to fetch further responses. The page token can be added if additional results should be returned. It is a base64 encoded dictionary and included in the first response in case not all results were delivered (required)
     * @return V1PropertyListPost200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request - missing parameter </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 401 </td><td> API Key is missing or invalid </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 503 </td><td> Server error </td><td>  * apiKey -  <br>  </td></tr>
     </table>
     */
    public V1PropertyListPost200Response v1PropertyListPost(PropertyList propertyList) throws ApiException {
        ApiResponse<V1PropertyListPost200Response> localVarResp = v1PropertyListPostWithHttpInfo(propertyList);
        return localVarResp.getData();
    }

    /**
     * List properties by a specific keyword
     * List properties by a specific keyword.
     * @param propertyList Provide the search keyword and optionally a page token to fetch further responses. The page token can be added if additional results should be returned. It is a base64 encoded dictionary and included in the first response in case not all results were delivered (required)
     * @return ApiResponse&lt;V1PropertyListPost200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request - missing parameter </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 401 </td><td> API Key is missing or invalid </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 503 </td><td> Server error </td><td>  * apiKey -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<V1PropertyListPost200Response> v1PropertyListPostWithHttpInfo(PropertyList propertyList) throws ApiException {
        okhttp3.Call localVarCall = v1PropertyListPostValidateBeforeCall(propertyList, null);
        Type localVarReturnType = new TypeToken<V1PropertyListPost200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List properties by a specific keyword (asynchronously)
     * List properties by a specific keyword.
     * @param propertyList Provide the search keyword and optionally a page token to fetch further responses. The page token can be added if additional results should be returned. It is a base64 encoded dictionary and included in the first response in case not all results were delivered (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request - missing parameter </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 401 </td><td> API Key is missing or invalid </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * apiKey -  <br>  </td></tr>
        <tr><td> 503 </td><td> Server error </td><td>  * apiKey -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call v1PropertyListPostAsync(PropertyList propertyList, final ApiCallback<V1PropertyListPost200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1PropertyListPostValidateBeforeCall(propertyList, _callback);
        Type localVarReturnType = new TypeToken<V1PropertyListPost200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

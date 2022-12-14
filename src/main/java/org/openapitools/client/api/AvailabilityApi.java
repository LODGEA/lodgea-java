/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://lodgea.redoc.ly for more information.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@lodgea.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.AvailabilitySearch;
import org.openapitools.client.model.V1AvailabilitySearchPost200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AvailabilityApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AvailabilityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AvailabilityApi(ApiClient apiClient) {
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
     * Build call for v1AvailabilitySearchPost
     * @param availabilitySearch Search Criteria, all parameters are optional (optional)
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
    public okhttp3.Call v1AvailabilitySearchPostCall(AvailabilitySearch availabilitySearch, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = availabilitySearch;

        // create path and map variables
        String localVarPath = "/v1/availability/search";

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
    private okhttp3.Call v1AvailabilitySearchPostValidateBeforeCall(AvailabilitySearch availabilitySearch, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = v1AvailabilitySearchPostCall(availabilitySearch, _callback);
        return localVarCall;

    }

    /**
     * Search for Availability
     * Get availability information based on search criteria. The possible values for the different content parameters are listed below. All parameters are optional.
     * @param availabilitySearch Search Criteria, all parameters are optional (optional)
     * @return V1AvailabilitySearchPost200Response
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
    public V1AvailabilitySearchPost200Response v1AvailabilitySearchPost(AvailabilitySearch availabilitySearch) throws ApiException {
        ApiResponse<V1AvailabilitySearchPost200Response> localVarResp = v1AvailabilitySearchPostWithHttpInfo(availabilitySearch);
        return localVarResp.getData();
    }

    /**
     * Search for Availability
     * Get availability information based on search criteria. The possible values for the different content parameters are listed below. All parameters are optional.
     * @param availabilitySearch Search Criteria, all parameters are optional (optional)
     * @return ApiResponse&lt;V1AvailabilitySearchPost200Response&gt;
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
    public ApiResponse<V1AvailabilitySearchPost200Response> v1AvailabilitySearchPostWithHttpInfo(AvailabilitySearch availabilitySearch) throws ApiException {
        okhttp3.Call localVarCall = v1AvailabilitySearchPostValidateBeforeCall(availabilitySearch, null);
        Type localVarReturnType = new TypeToken<V1AvailabilitySearchPost200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search for Availability (asynchronously)
     * Get availability information based on search criteria. The possible values for the different content parameters are listed below. All parameters are optional.
     * @param availabilitySearch Search Criteria, all parameters are optional (optional)
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
    public okhttp3.Call v1AvailabilitySearchPostAsync(AvailabilitySearch availabilitySearch, final ApiCallback<V1AvailabilitySearchPost200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1AvailabilitySearchPostValidateBeforeCall(availabilitySearch, _callback);
        Type localVarReturnType = new TypeToken<V1AvailabilitySearchPost200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

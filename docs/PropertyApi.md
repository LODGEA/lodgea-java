# PropertyApi

All URIs are relative to *https://api.eu.lodgea.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1PropertyGetPost**](PropertyApi.md#v1PropertyGetPost) | **POST** /v1/property/get | Get Property by ID |
| [**v1PropertyListPost**](PropertyApi.md#v1PropertyListPost) | **POST** /v1/property/list | List properties by a specific keyword |


<a name="v1PropertyGetPost"></a>
# **v1PropertyGetPost**
> V1PropertyGetPost200Response v1PropertyGetPost(propertyGet)

Get Property by ID

Get all information about a specific property by its ID. This parameter is required.

### Example
```java
// Import classes:
import com.lodgea.ApiClient;
import com.lodgea.ApiException;
import com.lodgea.Configuration;
import com.lodgea.auth.*;
import com.lodgea.models.*;
import com.lodgea.controllers.PropertyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu.lodgea.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PropertyApi apiInstance = new PropertyApi(defaultClient);
    PropertyGet propertyGet = new PropertyGet(); // PropertyGet | Provide the property ID to get more information about it
    try {
      V1PropertyGetPost200Response result = apiInstance.v1PropertyGetPost(propertyGet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyApi#v1PropertyGetPost");
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
| **propertyGet** | [**PropertyGet**](PropertyGet.md)| Provide the property ID to get more information about it | |

### Return type

[**V1PropertyGetPost200Response**](V1PropertyGetPost200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request - missing parameter |  * apiKey -  <br>  |
| **401** | API Key is missing or invalid |  * apiKey -  <br>  |
| **403** | Forbidden |  * apiKey -  <br>  |
| **404** | Not Found |  * apiKey -  <br>  |
| **405** | Invalid input |  * apiKey -  <br>  |
| **429** | Rate Limiting |  * apiKey -  <br>  |
| **500** | Internal server error |  * apiKey -  <br>  |
| **503** | Server error |  * apiKey -  <br>  |

<a name="v1PropertyListPost"></a>
# **v1PropertyListPost**
> V1PropertyListPost200Response v1PropertyListPost(propertyList)

List properties by a specific keyword

List properties by a specific keyword.

### Example
```java
// Import classes:
import com.lodgea.ApiClient;
import com.lodgea.ApiException;
import com.lodgea.Configuration;
import com.lodgea.auth.*;
import com.lodgea.models.*;
import com.lodgea.controllers.PropertyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu.lodgea.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PropertyApi apiInstance = new PropertyApi(defaultClient);
    PropertyList propertyList = new PropertyList(); // PropertyList | Provide the search keyword and optionally a page token to fetch further responses. The page token can be added if additional results should be returned. It is a base64 encoded dictionary and included in the first response in case not all results were delivered
    try {
      V1PropertyListPost200Response result = apiInstance.v1PropertyListPost(propertyList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyApi#v1PropertyListPost");
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
| **propertyList** | [**PropertyList**](PropertyList.md)| Provide the search keyword and optionally a page token to fetch further responses. The page token can be added if additional results should be returned. It is a base64 encoded dictionary and included in the first response in case not all results were delivered | |

### Return type

[**V1PropertyListPost200Response**](V1PropertyListPost200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request - missing parameter |  * apiKey -  <br>  |
| **401** | API Key is missing or invalid |  * apiKey -  <br>  |
| **403** | Forbidden |  * apiKey -  <br>  |
| **404** | Not Found |  * apiKey -  <br>  |
| **405** | Invalid input |  * apiKey -  <br>  |
| **429** | Rate Limiting |  * apiKey -  <br>  |
| **500** | Internal server error |  * apiKey -  <br>  |
| **503** | Server error |  * apiKey -  <br>  |


# LocationApi

All URIs are relative to *https://api.eu.lodgea.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1LocationSearchPost**](LocationApi.md#v1LocationSearchPost) | **POST** /v1/location/search | Search for Location |


<a name="v1LocationSearchPost"></a>
# **v1LocationSearchPost**
> V1LocationSearchPost200Response v1LocationSearchPost(locationSearch)

Search for Location

Get a location by search text in free from. This parameter is required.

### Example
```java
// Import classes:
import com.lodgea.ApiClient;
import com.lodgea.ApiException;
import com.lodgea.Configuration;
import com.lodgea.auth.*;
import com.lodgea.models.*;
import com.lodgea.controllers.LocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu.lodgea.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LocationApi apiInstance = new LocationApi(defaultClient);
    LocationSearch locationSearch = new LocationSearch(); // LocationSearch | Free-text search criteria
    try {
      V1LocationSearchPost200Response result = apiInstance.v1LocationSearchPost(locationSearch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#v1LocationSearchPost");
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
| **locationSearch** | [**LocationSearch**](LocationSearch.md)| Free-text search criteria | |

### Return type

[**V1LocationSearchPost200Response**](V1LocationSearchPost200Response.md)

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


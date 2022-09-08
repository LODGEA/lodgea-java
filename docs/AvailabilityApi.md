# AvailabilityApi

All URIs are relative to *https://api.eu.lodgea.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1AvailabilityGetPost**](AvailabilityApi.md#v1AvailabilityGetPost) | **POST** /v1/availability/get | Get Availability for Property |
| [**v1AvailabilitySearchPost**](AvailabilityApi.md#v1AvailabilitySearchPost) | **POST** /v1/availability/search | Search for Availability |


<a name="v1AvailabilityGetPost"></a>
# **v1AvailabilityGetPost**
> V1AvailabilityGetPost200Response v1AvailabilityGetPost(availabilityGet)

Get Availability for Property

Get availability information based on a specific property.

### Example
```java
// Import classes:
import com.lodgea.ApiClient;
import com.lodgea.ApiException;
import com.lodgea.Configuration;
import com.lodgea.auth.*;
import com.lodgea.models.*;
import com.lodgea.controllers.AvailabilityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu.lodgea.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
    AvailabilityGet availabilityGet = new AvailabilityGet(); // AvailabilityGet | Availability get parameter
    try {
      V1AvailabilityGetPost200Response result = apiInstance.v1AvailabilityGetPost(availabilityGet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#v1AvailabilityGetPost");
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
| **availabilityGet** | [**AvailabilityGet**](AvailabilityGet.md)| Availability get parameter | |

### Return type

[**V1AvailabilityGetPost200Response**](V1AvailabilityGetPost200Response.md)

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

<a name="v1AvailabilitySearchPost"></a>
# **v1AvailabilitySearchPost**
> V1AvailabilitySearchPost200Response v1AvailabilitySearchPost(availabilitySearch)

Search for Availability

Get availability information based on search criteria. The possible values for the different content parameters are listed below. All parameters are optional.

### Example
```java
// Import classes:
import com.lodgea.ApiClient;
import com.lodgea.ApiException;
import com.lodgea.Configuration;
import com.lodgea.auth.*;
import com.lodgea.models.*;
import com.lodgea.controllers.AvailabilityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu.lodgea.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
    AvailabilitySearch availabilitySearch = new AvailabilitySearch(); // AvailabilitySearch | Search Criteria, all parameters are optional
    try {
      V1AvailabilitySearchPost200Response result = apiInstance.v1AvailabilitySearchPost(availabilitySearch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#v1AvailabilitySearchPost");
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
| **availabilitySearch** | [**AvailabilitySearch**](AvailabilitySearch.md)| Search Criteria, all parameters are optional | [optional] |

### Return type

[**V1AvailabilitySearchPost200Response**](V1AvailabilitySearchPost200Response.md)

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


# PropertyApi

All URIs are relative to *https://api.eu.lodgea.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1PropertyGetPost**](PropertyApi.md#v1PropertyGetPost) | **POST** /v1/property/get | Get Property by ID |


<a name="v1PropertyGetPost"></a>
# **v1PropertyGetPost**
> V1PropertyGetPost200Response v1PropertyGetPost(propertyGet)

Get Property by ID

Get all information about a specific property by its ID. This parameter is required.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertyApi;

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


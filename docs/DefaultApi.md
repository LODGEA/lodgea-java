# DefaultApi

All URIs are relative to *https://api.eu.lodgea.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**availabilitySearchPost**](DefaultApi.md#availabilitySearchPost) | **POST** /availability/search | Search for availability
[**locationSearchPost**](DefaultApi.md#locationSearchPost) | **POST** /location/search | Search for location
[**propertiesGet**](DefaultApi.md#propertiesGet) | **GET** /properties | List (filtered) properties
[**propertiesPropertyIdAvailabilityGet**](DefaultApi.md#propertiesPropertyIdAvailabilityGet) | **GET** /properties/{propertyId}/availability | Get a properties availability
[**propertiesPropertyIdGet**](DefaultApi.md#propertiesPropertyIdGet) | **GET** /properties/{propertyId} | Get a properties details


<a name="availabilitySearchPost"></a>
# **availabilitySearchPost**
> InlineResponse2001 availabilitySearchPost(inlineObject1)

Search for availability

Get availability information based on search criteria.

### Example
```java
// Import classes:
import com.lodgea.ApiClient;
import com.lodgea.ApiException;
import com.lodgea.Configuration;
import com.lodgea.auth.*;
import com.lodgea.models.*;
import com.lodgea.controllers.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu.lodgea.io/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
    try {
      InlineResponse2001 result = apiInstance.availabilitySearchPost(inlineObject1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#availabilitySearchPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful, a list of available properties matching the given criteria is returned. |  -  |
**400** | We validate all calls to our API in a strict manner using Zod. In case of any validation errors, we send back a 400 response with a list of all validation errors. For more info see https://github.com/colinhacks/zod/blob/master/ERROR_HANDLING.md. |  -  |
**403** | Unauthorized, the api key in the \&quot;apiKey\&quot; header field is invalid. |  -  |

<a name="locationSearchPost"></a>
# **locationSearchPost**
> InlineResponse200 locationSearchPost(inlineObject)

Search for location

Get a list of locations and their lowest available rate related to a given keyword.

### Example
```java
// Import classes:
import com.lodgea.ApiClient;
import com.lodgea.ApiException;
import com.lodgea.Configuration;
import com.lodgea.auth.*;
import com.lodgea.models.*;
import com.lodgea.controllers.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu.lodgea.io/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      InlineResponse200 result = apiInstance.locationSearchPost(inlineObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#locationSearchPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful, a list of locations matching the given location search text is returned. |  -  |
**400** | We validate all calls to our API in a strict manner using Zod. In case of any validation errors, we send back a 400 response with a list of all validation errors. For more info see https://github.com/colinhacks/zod/blob/master/ERROR_HANDLING.md. |  -  |
**403** | Unauthorized, the api key in the \&quot;apiKey\&quot; header field is invalid. |  -  |

<a name="propertiesGet"></a>
# **propertiesGet**
> InlineResponse2002 propertiesGet(keyword, pageToken)

List (filtered) properties

List properties, optionally filtered by a keyword.

### Example
```java
// Import classes:
import com.lodgea.ApiClient;
import com.lodgea.ApiException;
import com.lodgea.Configuration;
import com.lodgea.auth.*;
import com.lodgea.models.*;
import com.lodgea.controllers.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu.lodgea.io/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String keyword = "Strandresidenz Sylt"; // String | 
    String pageToken = "eyJ0ZW5hbnRDb2RlIjoiZG1vLWRlbW8iLCJuYW1lIjoiTGFuZGhhdXMgVHJlc2tlcnNhbmQiLCJwcm9wZXJ0eUlkIjoibGFuZGhhdXMtdHJlc2tlcnNhbmQifQ=="; // String | 
    try {
      InlineResponse2002 result = apiInstance.propertiesGet(keyword, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#propertiesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyword** | **String**|  | [optional]
 **pageToken** | **String**|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful, a list of properties matching the given keyword is returned. |  -  |
**400** | We validate all calls to our API in a strict manner using Zod. In case of any validation errors, we send back a 400 response with a list of all validation errors. For more info see https://github.com/colinhacks/zod/blob/master/ERROR_HANDLING.md. |  -  |
**403** | Unauthorized, the api key in the \&quot;apiKey\&quot; header field is invalid. |  -  |

<a name="propertiesPropertyIdAvailabilityGet"></a>
# **propertiesPropertyIdAvailabilityGet**
> InlineResponse2004 propertiesPropertyIdAvailabilityGet(propertyId, currencyCode)

Get a properties availability

Get detailed availability information for a specific property.

### Example
```java
// Import classes:
import com.lodgea.ApiClient;
import com.lodgea.ApiException;
import com.lodgea.Configuration;
import com.lodgea.auth.*;
import com.lodgea.models.*;
import com.lodgea.controllers.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu.lodgea.io/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String propertyId = "strandresidenz-sylt"; // String | 
    String currencyCode = "EUR"; // String | 
    try {
      InlineResponse2004 result = apiInstance.propertiesPropertyIdAvailabilityGet(propertyId, currencyCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#propertiesPropertyIdAvailabilityGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyId** | **String**|  |
 **currencyCode** | **String**|  |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful, a list of properties matching the given keyword is returned. |  -  |
**400** | We validate all calls to our API in a strict manner using Zod. In case of any validation errors, we send back a 400 response with a list of all validation errors. For more info see https://github.com/colinhacks/zod/blob/master/ERROR_HANDLING.md. |  -  |
**403** | Unauthorized, the api key in the \&quot;apiKey\&quot; header field is invalid. |  -  |

<a name="propertiesPropertyIdGet"></a>
# **propertiesPropertyIdGet**
> InlineResponse2003 propertiesPropertyIdGet(propertyId)

Get a properties details

Get all information about a specific property by its ID.

### Example
```java
// Import classes:
import com.lodgea.ApiClient;
import com.lodgea.ApiException;
import com.lodgea.Configuration;
import com.lodgea.auth.*;
import com.lodgea.models.*;
import com.lodgea.controllers.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu.lodgea.io/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String propertyId = "strandresidenz-sylt"; // String | 
    try {
      InlineResponse2003 result = apiInstance.propertiesPropertyIdGet(propertyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#propertiesPropertyIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyId** | **String**|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful, property found, the whole property object is returned. |  -  |
**400** | We validate all calls to our API in a strict manner using Zod. In case of any validation errors, we send back a 400 response with a list of all validation errors. For more info see https://github.com/colinhacks/zod/blob/master/ERROR_HANDLING.md. |  -  |
**403** | Unauthorized, the api key in the \&quot;apiKey\&quot; header field is invalid. |  -  |
**404** | The requested resource was not found |  -  |


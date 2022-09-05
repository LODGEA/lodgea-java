# lodgea

lodgea-java
- API version: 1.0.0
  - Build date: 2022-09-05T14:33:56.924929748Z[Etc/UTC]

LODGEA SDK for Java. Check out https://docs.lodgea.io for more information.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.lodgea</groupId>
  <artifactId>lodgea</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'lodgea' jar has been published to maven central.
    mavenLocal()       // Needed if the 'lodgea' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.lodgea:lodgea:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/lodgea-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.eu.lodgea.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AvailabilityApi* | [**v1AvailabilitySearchPost**](docs/AvailabilityApi.md#v1AvailabilitySearchPost) | **POST** /v1/availability/search | Search for Availability
*LocationApi* | [**v1LocationSearchPost**](docs/LocationApi.md#v1LocationSearchPost) | **POST** /v1/location/search | Search for Location
*PropertyApi* | [**v1PropertyGetPost**](docs/PropertyApi.md#v1PropertyGetPost) | **POST** /v1/property/get | Get Property by ID


## Documentation for Models

 - [AvailabilitySearch](docs/AvailabilitySearch.md)
 - [LocationSearch](docs/LocationSearch.md)
 - [PropertyGet](docs/PropertyGet.md)
 - [V1AvailabilitySearchPost200Response](docs/V1AvailabilitySearchPost200Response.md)
 - [V1AvailabilitySearchPost200ResponseListInner](docs/V1AvailabilitySearchPost200ResponseListInner.md)
 - [V1AvailabilitySearchPost200ResponseListInnerAttractionListInner](docs/V1AvailabilitySearchPost200ResponseListInnerAttractionListInner.md)
 - [V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance](docs/V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance.md)
 - [V1AvailabilitySearchPost200ResponseListInnerGeo](docs/V1AvailabilitySearchPost200ResponseListInnerGeo.md)
 - [V1AvailabilitySearchPost200ResponseListInnerGeoLocation](docs/V1AvailabilitySearchPost200ResponseListInnerGeoLocation.md)
 - [V1AvailabilitySearchPost200ResponseListInnerLowestPrice](docs/V1AvailabilitySearchPost200ResponseListInnerLowestPrice.md)
 - [V1AvailabilitySearchPost200ResponseListInnerMediaListInner](docs/V1AvailabilitySearchPost200ResponseListInnerMediaListInner.md)
 - [V1LocationSearchPost200Response](docs/V1LocationSearchPost200Response.md)
 - [V1LocationSearchPost200ResponseListInner](docs/V1LocationSearchPost200ResponseListInner.md)
 - [V1PropertyGetPost200Response](docs/V1PropertyGetPost200Response.md)
 - [V1PropertyGetPost200ResponseProductListInner](docs/V1PropertyGetPost200ResponseProductListInner.md)
 - [V1PropertyGetPost200ResponseProductListInnerMealPlanListInner](docs/V1PropertyGetPost200ResponseProductListInnerMealPlanListInner.md)
 - [V1PropertyGetPost200ResponseProductListInnerPolicyInfo](docs/V1PropertyGetPost200ResponseProductListInnerPolicyInfo.md)
 - [V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner](docs/V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.md)
 - [V1PropertyGetPost200ResponseProductListInnerRatePlanListInner](docs/V1PropertyGetPost200ResponseProductListInnerRatePlanListInner.md)
 - [V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner](docs/V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner.md)
 - [V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInnerPriceList](docs/V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInnerPriceList.md)
 - [V1PropertyGetPost200ResponseProductListInnerRoomTypeListInner](docs/V1PropertyGetPost200ResponseProductListInnerRoomTypeListInner.md)
 - [V1PropertyGetPost200ResponseProperty](docs/V1PropertyGetPost200ResponseProperty.md)
 - [V1PropertyGetPost200ResponsePropertyAwardListInner](docs/V1PropertyGetPost200ResponsePropertyAwardListInner.md)
 - [V1PropertyGetPost200ResponsePropertyCancellationGracePeriod](docs/V1PropertyGetPost200ResponsePropertyCancellationGracePeriod.md)
 - [V1PropertyGetPost200ResponsePropertyContactListInner](docs/V1PropertyGetPost200ResponsePropertyContactListInner.md)
 - [V1PropertyGetPost200ResponsePropertyContactListInnerAddressListInner](docs/V1PropertyGetPost200ResponsePropertyContactListInnerAddressListInner.md)
 - [V1PropertyGetPost200ResponsePropertyFacilityInfo](docs/V1PropertyGetPost200ResponsePropertyFacilityInfo.md)
 - [V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner](docs/V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.md)
 - [V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner](docs/V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner.md)
 - [V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner](docs/V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner.md)
 - [V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInnerRoomAmenityListInner](docs/V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInnerRoomAmenityListInner.md)
 - [V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInnerTagListInner](docs/V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInnerTagListInner.md)
 - [V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner](docs/V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner.md)
 - [V1PropertyGetPost200ResponsePropertyGeo](docs/V1PropertyGetPost200ResponsePropertyGeo.md)
 - [V1PropertyGetPost200ResponsePropertyGeoDa](docs/V1PropertyGetPost200ResponsePropertyGeoDa.md)
 - [V1PropertyGetPost200ResponsePropertyGeoDe](docs/V1PropertyGetPost200ResponsePropertyGeoDe.md)
 - [V1PropertyGetPost200ResponsePropertyGeoDeLocation](docs/V1PropertyGetPost200ResponsePropertyGeoDeLocation.md)
 - [V1PropertyGetPost200ResponsePropertyGeoEn](docs/V1PropertyGetPost200ResponsePropertyGeoEn.md)
 - [V1PropertyGetPost200ResponsePropertyGeoNl](docs/V1PropertyGetPost200ResponsePropertyGeoNl.md)
 - [V1PropertyGetPost200ResponsePropertyGuestInfo](docs/V1PropertyGetPost200ResponsePropertyGuestInfo.md)
 - [V1PropertyGetPost200ResponsePropertyMediaListInner](docs/V1PropertyGetPost200ResponsePropertyMediaListInner.md)
 - [V1PropertyGetPost200ResponsePropertyMediaListInnerTagListInner](docs/V1PropertyGetPost200ResponsePropertyMediaListInnerTagListInner.md)
 - [V1PropertyGetPost200ResponsePropertyPolicyListInner](docs/V1PropertyGetPost200ResponsePropertyPolicyListInner.md)
 - [V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy](docs/V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy.md)
 - [V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner](docs/V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner.md)
 - [V1PropertyGetPost200ResponsePropertyPropertyInfo](docs/V1PropertyGetPost200ResponsePropertyPropertyInfo.md)
 - [V1PropertyGetPost200ResponsePropertyPropertyInfoAcceptedPaymentListInner](docs/V1PropertyGetPost200ResponsePropertyPropertyInfoAcceptedPaymentListInner.md)
 - [V1PropertyGetPost200ResponsePropertyPropertyInfoCategoryListInner](docs/V1PropertyGetPost200ResponsePropertyPropertyInfoCategoryListInner.md)
 - [V1PropertyGetPost200ResponsePropertyPropertyInfoLocation](docs/V1PropertyGetPost200ResponsePropertyPropertyInfoLocation.md)
 - [V1PropertyGetPost200ResponsePropertyPropertyInfoMessageListInner](docs/V1PropertyGetPost200ResponsePropertyPropertyInfoMessageListInner.md)
 - [V1PropertyGetPost200ResponsePropertyRecordCreated](docs/V1PropertyGetPost200ResponsePropertyRecordCreated.md)
 - [V1PropertyGetPost200ResponsePropertyRecordModified](docs/V1PropertyGetPost200ResponsePropertyRecordModified.md)
 - [V1PropertyGetPost200ResponsePropertyServiceListInner](docs/V1PropertyGetPost200ResponsePropertyServiceListInner.md)
 - [V1PropertyGetPost200ResponsePropertyTransaction](docs/V1PropertyGetPost200ResponsePropertyTransaction.md)
 - [V1PropertyGetPost200ResponsePropertyTransactionExternalListInner](docs/V1PropertyGetPost200ResponsePropertyTransactionExternalListInner.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: apiKey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@lodgea.com


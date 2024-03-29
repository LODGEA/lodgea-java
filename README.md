# lodgea

lodgea-java
- API version: 1.2.0
  - Build date: 2023-02-07T12:22:24.387616647Z[Etc/UTC]

LODGEA SDK for java. Check out https://docs.lodgea.io for more information.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
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
  <version>1.2.0</version>
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
     implementation "com.lodgea:lodgea:1.2.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/lodgea-1.2.0.jar`
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

## Documentation for API Endpoints

All URIs are relative to *https://api.eu.lodgea.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**availabilitySearchPost**](docs/DefaultApi.md#availabilitySearchPost) | **POST** /availability/search | Search for availability
*DefaultApi* | [**locationSearchPost**](docs/DefaultApi.md#locationSearchPost) | **POST** /location/search | Search for location
*DefaultApi* | [**propertiesGet**](docs/DefaultApi.md#propertiesGet) | **GET** /properties | List (filtered) properties
*DefaultApi* | [**propertiesPropertyIdAvailabilityGet**](docs/DefaultApi.md#propertiesPropertyIdAvailabilityGet) | **GET** /properties/{propertyId}/availability | Get a properties availability
*DefaultApi* | [**propertiesPropertyIdGet**](docs/DefaultApi.md#propertiesPropertyIdGet) | **GET** /properties/{propertyId} | Get a properties details


## Documentation for Models

 - [InlineObject](docs/InlineObject.md)
 - [InlineObject1](docs/InlineObject1.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2001AttractionList](docs/InlineResponse2001AttractionList.md)
 - [InlineResponse2001Distance](docs/InlineResponse2001Distance.md)
 - [InlineResponse2001Geo](docs/InlineResponse2001Geo.md)
 - [InlineResponse2001GeoLocation](docs/InlineResponse2001GeoLocation.md)
 - [InlineResponse2001List](docs/InlineResponse2001List.md)
 - [InlineResponse2001LowestPrice](docs/InlineResponse2001LowestPrice.md)
 - [InlineResponse2001MediaList](docs/InlineResponse2001MediaList.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2002List](docs/InlineResponse2002List.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2003PolicyInfo](docs/InlineResponse2003PolicyInfo.md)
 - [InlineResponse2003PolicyInfoFeePolicyList](docs/InlineResponse2003PolicyInfoFeePolicyList.md)
 - [InlineResponse2003PolicyInfoTaxPolicyList](docs/InlineResponse2003PolicyInfoTaxPolicyList.md)
 - [InlineResponse2003PricingList](docs/InlineResponse2003PricingList.md)
 - [InlineResponse2003ProductList](docs/InlineResponse2003ProductList.md)
 - [InlineResponse2003Property](docs/InlineResponse2003Property.md)
 - [InlineResponse2003PropertyAddressList](docs/InlineResponse2003PropertyAddressList.md)
 - [InlineResponse2003PropertyAwardList](docs/InlineResponse2003PropertyAwardList.md)
 - [InlineResponse2003PropertyCancellationGracePeriod](docs/InlineResponse2003PropertyCancellationGracePeriod.md)
 - [InlineResponse2003PropertyCancellationPolicyList](docs/InlineResponse2003PropertyCancellationPolicyList.md)
 - [InlineResponse2003PropertyContactList](docs/InlineResponse2003PropertyContactList.md)
 - [InlineResponse2003PropertyFacilityInfo](docs/InlineResponse2003PropertyFacilityInfo.md)
 - [InlineResponse2003PropertyFacilityInfoAmenityList](docs/InlineResponse2003PropertyFacilityInfoAmenityList.md)
 - [InlineResponse2003PropertyFacilityInfoGuestRoomList](docs/InlineResponse2003PropertyFacilityInfoGuestRoomList.md)
 - [InlineResponse2003PropertyFacilityInfoMediaList](docs/InlineResponse2003PropertyFacilityInfoMediaList.md)
 - [InlineResponse2003PropertyFacilityInfoMessageList](docs/InlineResponse2003PropertyFacilityInfoMessageList.md)
 - [InlineResponse2003PropertyFeePolicyList](docs/InlineResponse2003PropertyFeePolicyList.md)
 - [InlineResponse2003PropertyGuaranteePolicy](docs/InlineResponse2003PropertyGuaranteePolicy.md)
 - [InlineResponse2003PropertyGuestInfo](docs/InlineResponse2003PropertyGuestInfo.md)
 - [InlineResponse2003PropertyMediaList](docs/InlineResponse2003PropertyMediaList.md)
 - [InlineResponse2003PropertyOperationTimeList](docs/InlineResponse2003PropertyOperationTimeList.md)
 - [InlineResponse2003PropertyPetsPolicy](docs/InlineResponse2003PropertyPetsPolicy.md)
 - [InlineResponse2003PropertyPolicyList](docs/InlineResponse2003PropertyPolicyList.md)
 - [InlineResponse2003PropertyPropertyInfo](docs/InlineResponse2003PropertyPropertyInfo.md)
 - [InlineResponse2003PropertyPropertyInfoAcceptedPaymentList](docs/InlineResponse2003PropertyPropertyInfoAcceptedPaymentList.md)
 - [InlineResponse2003PropertyPropertyInfoMessageList](docs/InlineResponse2003PropertyPropertyInfoMessageList.md)
 - [InlineResponse2003PropertyRecordCreated](docs/InlineResponse2003PropertyRecordCreated.md)
 - [InlineResponse2003PropertyRecordModified](docs/InlineResponse2003PropertyRecordModified.md)
 - [InlineResponse2003PropertyServiceList](docs/InlineResponse2003PropertyServiceList.md)
 - [InlineResponse2003PropertyTaxPolicyList](docs/InlineResponse2003PropertyTaxPolicyList.md)
 - [InlineResponse2003RatePlanList](docs/InlineResponse2003RatePlanList.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2004AvailabilityList](docs/InlineResponse2004AvailabilityList.md)
 - [InlineResponse2004PricingList](docs/InlineResponse2004PricingList.md)
 - [InlineResponse2004RatePlanList](docs/InlineResponse2004RatePlanList.md)
 - [InlineResponse200List](docs/InlineResponse200List.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [InlineResponse4001](docs/InlineResponse4001.md)
 - [InlineResponse4001ValidationErrors](docs/InlineResponse4001ValidationErrors.md)
 - [InlineResponse400ValidationErrors](docs/InlineResponse400ValidationErrors.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: apiKey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@lodgea.com


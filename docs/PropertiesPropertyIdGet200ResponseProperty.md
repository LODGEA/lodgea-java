

# PropertiesPropertyIdGet200ResponseProperty

An object containing all available base data for the requested property.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The properties unique identifier. |  |
|**name** | **String** | The properties name. |  |
|**recordCreated** | [**PropertiesPropertyIdGet200ResponsePropertyRecordCreated**](PropertiesPropertyIdGet200ResponsePropertyRecordCreated.md) |  |  |
|**recordModified** | [**PropertiesPropertyIdGet200ResponsePropertyRecordModified**](PropertiesPropertyIdGet200ResponsePropertyRecordModified.md) |  |  |
|**propertyInfo** | [**PropertiesPropertyIdGet200ResponsePropertyPropertyInfo**](PropertiesPropertyIdGet200ResponsePropertyPropertyInfo.md) |  |  |
|**guestInfo** | [**PropertiesPropertyIdGet200ResponsePropertyGuestInfo**](PropertiesPropertyIdGet200ResponsePropertyGuestInfo.md) |  |  [optional] |
|**awardList** | [**List&lt;PropertiesPropertyIdGet200ResponsePropertyAwardListInner&gt;**](PropertiesPropertyIdGet200ResponsePropertyAwardListInner.md) | A list of the ratings available for this property. |  |
|**contactList** | [**List&lt;PropertiesPropertyIdGet200ResponsePropertyContactListInner&gt;**](PropertiesPropertyIdGet200ResponsePropertyContactListInner.md) | A contact with a profile type and a list of addresses |  |
|**facilityInfo** | [**PropertiesPropertyIdGet200ResponsePropertyFacilityInfo**](PropertiesPropertyIdGet200ResponsePropertyFacilityInfo.md) |  |  [optional] |
|**mediaList** | [**List&lt;PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner&gt;**](PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner.md) | A list of media objects for the property. |  |
|**geo** | [**Map&lt;String, AvailablePropertiesInner1Geo&gt;**](AvailablePropertiesInner1Geo.md) | An object containing language codes as keys and objects describing the properties geographical location as values. |  [optional] |
|**published** | **Boolean** | Indicates whether the policy has been published or not. |  |
|**policyList** | [**List&lt;PropertiesPropertyIdGet200ResponsePropertyPolicyListInner&gt;**](PropertiesPropertyIdGet200ResponsePropertyPolicyListInner.md) | A list of policies associated with the property. |  |
|**uri** | **String** | A unique identifier for the accommodation. |  [optional] |
|**cancellationGracePeriod** | [**PropertiesPropertyIdGet200ResponsePropertyCancellationGracePeriod**](PropertiesPropertyIdGet200ResponsePropertyCancellationGracePeriod.md) |  |  [optional] |
|**serviceList** | [**List&lt;PropertiesPropertyIdGet200ResponsePropertyServiceListInner&gt;**](PropertiesPropertyIdGet200ResponsePropertyServiceListInner.md) | A list of objects each describing an available service, its pricing and its availability. |  |






# InlineResponse2003Property

An object containing all available base data for the requested property.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The properties unique identifier. | 
**name** | **String** | The properties name. | 
**recordCreated** | [**InlineResponse2003PropertyRecordCreated**](InlineResponse2003PropertyRecordCreated.md) |  | 
**recordModified** | [**InlineResponse2003PropertyRecordModified**](InlineResponse2003PropertyRecordModified.md) |  | 
**propertyInfo** | [**InlineResponse2003PropertyPropertyInfo**](InlineResponse2003PropertyPropertyInfo.md) |  | 
**guestInfo** | [**InlineResponse2003PropertyGuestInfo**](InlineResponse2003PropertyGuestInfo.md) |  |  [optional]
**awardList** | [**List&lt;InlineResponse2003PropertyAwardList&gt;**](InlineResponse2003PropertyAwardList.md) | A list of the ratings available for this property. | 
**contactList** | [**List&lt;InlineResponse2003PropertyContactList&gt;**](InlineResponse2003PropertyContactList.md) | A contact with a profile type and a list of addresses | 
**facilityInfo** | [**InlineResponse2003PropertyFacilityInfo**](InlineResponse2003PropertyFacilityInfo.md) |  |  [optional]
**mediaList** | [**List&lt;InlineResponse2003PropertyMediaList&gt;**](InlineResponse2003PropertyMediaList.md) | A list of media objects for the property. | 
**geo** | [**Map&lt;String, InlineResponse2001Geo&gt;**](InlineResponse2001Geo.md) | An object containing language codes as keys and objects describing the properties geographical location as values. |  [optional]
**published** | **Boolean** | Indicates whether the policy has been published or not. | 
**policyList** | [**List&lt;InlineResponse2003PropertyPolicyList&gt;**](InlineResponse2003PropertyPolicyList.md) | A list of policies associated with the property. | 
**uri** | **String** | A unique identifier for the accommodation. |  [optional]
**cancellationGracePeriod** | [**InlineResponse2003PropertyCancellationGracePeriod**](InlineResponse2003PropertyCancellationGracePeriod.md) |  |  [optional]
**serviceList** | [**List&lt;InlineResponse2003PropertyServiceList&gt;**](InlineResponse2003PropertyServiceList.md) | A list of objects each describing an available service, its pricing and its availability. | 




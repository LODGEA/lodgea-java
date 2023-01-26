

# PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner

An object representing a room in the property.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isActive** | **Boolean** | Indicates whether the room is active or not. |  |
|**roomId** | **String** | The unique identifier for the room. |  |
|**name** | **String** | The name of the room. |  |
|**mediaList** | [**List&lt;PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner&gt;**](PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner.md) | A list of media objects for the room. |  |
|**roomTypeCode** | [**RoomTypeCodeEnum**](#RoomTypeCodeEnum) | The unit and room type code.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#unitand-room-type-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt; |  |
|**isNonSmoking** | **Boolean** | Indicates whether the room is designated as non-smoking. |  |
|**amenityList** | [**List&lt;PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner&gt;**](PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner.md) | A list of amenities provided in the room. |  |
|**messageList** | [**List&lt;PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner&gt;**](PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner.md) | A list of messages associated with the room. |  |
|**maxOccupancy** | **BigDecimal** | The maximum occupancy of the room. |  |
|**maxAdultOccupancy** | **BigDecimal** | The maximum number of adults that can occupy the room. |  |
|**maxChildOccupancy** | **BigDecimal** | The maximum number of children that can occupy the room. |  |



## Enum: RoomTypeCodeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | new BigDecimal(&quot;1&quot;) |
| NUMBER_4 | new BigDecimal(&quot;4&quot;) |
| NUMBER_5 | new BigDecimal(&quot;5&quot;) |
| NUMBER_7 | new BigDecimal(&quot;7&quot;) |
| NUMBER_8 | new BigDecimal(&quot;8&quot;) |
| NUMBER_9 | new BigDecimal(&quot;9&quot;) |
| NUMBER_10 | new BigDecimal(&quot;10&quot;) |
| NUMBER_12 | new BigDecimal(&quot;12&quot;) |
| NUMBER_13 | new BigDecimal(&quot;13&quot;) |
| NUMBER_24 | new BigDecimal(&quot;24&quot;) |
| NUMBER_25 | new BigDecimal(&quot;25&quot;) |
| NUMBER_26 | new BigDecimal(&quot;26&quot;) |
| NUMBER_27 | new BigDecimal(&quot;27&quot;) |
| NUMBER_28 | new BigDecimal(&quot;28&quot;) |
| NUMBER_29 | new BigDecimal(&quot;29&quot;) |
| NUMBER_31 | new BigDecimal(&quot;31&quot;) |
| NUMBER_32 | new BigDecimal(&quot;32&quot;) |
| NUMBER_33 | new BigDecimal(&quot;33&quot;) |




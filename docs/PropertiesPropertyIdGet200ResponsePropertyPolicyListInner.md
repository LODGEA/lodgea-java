

# PropertiesPropertyIdGet200ResponsePropertyPolicyListInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkInTime** | **BigDecimal** | Check-in time (unix timestamp in ms). |  |
|**checkOutTime** | **BigDecimal** | Check-out time (unix timestamp in ms). |  |
|**totalGuestCount** | **BigDecimal** | The maximum number of guests allowed. |  [optional] |
|**cancellationPolicyList** | [**List&lt;PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerCancellationPolicyListInner&gt;**](PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerCancellationPolicyListInner.md) | List of cancellation policies. |  |
|**advanceBookingMin** | **BigDecimal** | The minimum number of days in advance a booking must be made |  |
|**advanceBookingMax** | **BigDecimal** | The maximum number of days in advance a booking can be made |  |
|**petsPolicy** | [**PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy**](PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy.md) |  |  [optional] |
|**prepaymentPolicy** | [**PrepaymentPolicyEnum**](#PrepaymentPolicyEnum) | The type of the prepayment policy. |  [optional] |
|**guaranteePolicy** | [**PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy**](PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.md) |  |  [optional] |
|**taxPolicyList** | [**List&lt;PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerTaxPolicyListInner&gt;**](PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerTaxPolicyListInner.md) | A list of taxes and their policies. |  |
|**feePolicyList** | [**List&lt;PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner&gt;**](PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner.md) | A list of fees and their policies. |  |
|**name** | **String** | The name of this policy. |  [optional] |



## Enum: PrepaymentPolicyEnum

| Name | Value |
|---- | -----|
| CANCELLATION_FEE_BEGINS | &quot;after_cancellation_fee_begins&quot; |
| RESERVATION_IS_MADE | &quot;after_reservation_is_made&quot; |






# InlineResponse2003PropertyPolicyList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checkInTime** | **BigDecimal** | Check-in time (unix timestamp in ms). | 
**checkOutTime** | **BigDecimal** | Check-out time (unix timestamp in ms). | 
**totalGuestCount** | **BigDecimal** | The maximum number of guests allowed. |  [optional]
**cancellationPolicyList** | [**List&lt;InlineResponse2003PropertyCancellationPolicyList&gt;**](InlineResponse2003PropertyCancellationPolicyList.md) | List of cancellation policies. | 
**advanceBookingMin** | **BigDecimal** | The minimum number of days in advance a booking must be made | 
**advanceBookingMax** | **BigDecimal** | The maximum number of days in advance a booking can be made | 
**petsPolicy** | [**InlineResponse2003PropertyPetsPolicy**](InlineResponse2003PropertyPetsPolicy.md) |  |  [optional]
**prepaymentPolicy** | [**PrepaymentPolicyEnum**](#PrepaymentPolicyEnum) | The type of the prepayment policy. |  [optional]
**guaranteePolicy** | [**InlineResponse2003PropertyGuaranteePolicy**](InlineResponse2003PropertyGuaranteePolicy.md) |  |  [optional]
**taxPolicyList** | [**List&lt;InlineResponse2003PropertyTaxPolicyList&gt;**](InlineResponse2003PropertyTaxPolicyList.md) | A list of taxes and their policies. | 
**feePolicyList** | [**List&lt;InlineResponse2003PropertyFeePolicyList&gt;**](InlineResponse2003PropertyFeePolicyList.md) | A list of fees and their policies. | 
**name** | **String** | The name of this policy. |  [optional]



## Enum: PrepaymentPolicyEnum

Name | Value
---- | -----
CANCELLATION_FEE_BEGINS | &quot;after_cancellation_fee_begins&quot;
RESERVATION_IS_MADE | &quot;after_reservation_is_made&quot;




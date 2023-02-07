

# InlineResponse2003PropertyTaxPolicyList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**typeCode** | [**TypeCodeEnum**](#TypeCodeEnum) | The code that represents the type of tax.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#taxtype-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt; | 
**percent** | **BigDecimal** | The charged percentage if applicable. |  [optional]
**chargeType** | [**ChargeTypeEnum**](#ChargeTypeEnum) | The type of charge. | 
**chargeFrequencyCode** | [**ChargeFrequencyCodeEnum**](#ChargeFrequencyCodeEnum) | The code that represents the frequency of charge.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#chargetype-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt; | 
**currencyCode** | **String** | The currency code of the currency in that the charge is applied.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#currencycodes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt; | 
**conditionList** | [**List&lt;ConditionListEnum&gt;**](#List&lt;ConditionListEnum&gt;) | A list of conditions for the tax. Is empty if &lt;code&gt;chargeType&lt;/code&gt; is not &lt;code&gt;conditional&lt;/code&gt;. | 



## Enum: TypeCodeEnum

Name | Value
---- | -----
NUMBER_1 | new BigDecimal(&quot;1&quot;)
NUMBER_3 | new BigDecimal(&quot;3&quot;)
NUMBER_4 | new BigDecimal(&quot;4&quot;)
NUMBER_5 | new BigDecimal(&quot;5&quot;)
NUMBER_6 | new BigDecimal(&quot;6&quot;)
NUMBER_7 | new BigDecimal(&quot;7&quot;)
NUMBER_8 | new BigDecimal(&quot;8&quot;)
NUMBER_10 | new BigDecimal(&quot;10&quot;)
NUMBER_13 | new BigDecimal(&quot;13&quot;)
NUMBER_15 | new BigDecimal(&quot;15&quot;)
NUMBER_17 | new BigDecimal(&quot;17&quot;)
NUMBER_18 | new BigDecimal(&quot;18&quot;)
NUMBER_19 | new BigDecimal(&quot;19&quot;)
NUMBER_28 | new BigDecimal(&quot;28&quot;)
NUMBER_30 | new BigDecimal(&quot;30&quot;)
NUMBER_35 | new BigDecimal(&quot;35&quot;)
NUMBER_36 | new BigDecimal(&quot;36&quot;)
NUMBER_39 | new BigDecimal(&quot;39&quot;)
NUMBER_43 | new BigDecimal(&quot;43&quot;)
NUMBER_46 | new BigDecimal(&quot;46&quot;)
NUMBER_5001 | new BigDecimal(&quot;5001&quot;)
NUMBER_5002 | new BigDecimal(&quot;5002&quot;)
NUMBER_5004 | new BigDecimal(&quot;5004&quot;)
NUMBER_5007 | new BigDecimal(&quot;5007&quot;)
NUMBER_5008 | new BigDecimal(&quot;5008&quot;)



## Enum: ChargeTypeEnum

Name | Value
---- | -----
INCLUDED | &quot;included&quot;
EXCLUDED | &quot;excluded&quot;
CONDITIONAL | &quot;conditional&quot;



## Enum: ChargeFrequencyCodeEnum

Name | Value
---- | -----
NUMBER_1 | new BigDecimal(&quot;1&quot;)
NUMBER_2 | new BigDecimal(&quot;2&quot;)
NUMBER_7 | new BigDecimal(&quot;7&quot;)
NUMBER_10 | new BigDecimal(&quot;10&quot;)
NUMBER_12 | new BigDecimal(&quot;12&quot;)
NUMBER_17 | new BigDecimal(&quot;17&quot;)
NUMBER_19 | new BigDecimal(&quot;19&quot;)
NUMBER_20 | new BigDecimal(&quot;20&quot;)
NUMBER_21 | new BigDecimal(&quot;21&quot;)
NUMBER_25 | new BigDecimal(&quot;25&quot;)
NUMBER_31 | new BigDecimal(&quot;31&quot;)
NUMBER_5000 | new BigDecimal(&quot;5000&quot;)
NUMBER_5001 | new BigDecimal(&quot;5001&quot;)
NUMBER_5002 | new BigDecimal(&quot;5002&quot;)
NUMBER_5010 | new BigDecimal(&quot;5010&quot;)
NUMBER_5011 | new BigDecimal(&quot;5011&quot;)
NUMBER_5012 | new BigDecimal(&quot;5012&quot;)
NUMBER_5013 | new BigDecimal(&quot;5013&quot;)
NUMBER_5014 | new BigDecimal(&quot;5014&quot;)
NUMBER_5015 | new BigDecimal(&quot;5015&quot;)
NUMBER_5016 | new BigDecimal(&quot;5016&quot;)
NUMBER_5017 | new BigDecimal(&quot;5017&quot;)
NUMBER_90010 | new BigDecimal(&quot;90010&quot;)
NUMBER_90011 | new BigDecimal(&quot;90011&quot;)
NUMBER_90012 | new BigDecimal(&quot;90012&quot;)
NUMBER_90013 | new BigDecimal(&quot;90013&quot;)



## Enum: List&lt;ConditionListEnum&gt;

Name | Value
---- | -----
BRINGS_PET | &quot;guest_brings_pet&quot;
DOESNT_CLEAN_BEFORE_CHECKOUT | &quot;guest_doesnt_clean_before_checkout&quot;
SMOKES | &quot;guest_smokes&quot;




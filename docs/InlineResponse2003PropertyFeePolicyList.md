

# InlineResponse2003PropertyFeePolicyList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**typeCode** | [**TypeCodeEnum**](#TypeCodeEnum) | The code that represents the type of fee.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#feetype-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt; | 
**percent** | **BigDecimal** | The charged percentage if applicable. |  [optional]
**chargeType** | [**ChargeTypeEnum**](#ChargeTypeEnum) | The type of charge. | 
**chargeFrequencyCode** | [**ChargeFrequencyCodeEnum**](#ChargeFrequencyCodeEnum) | The code that represents the frequency of charge.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#chargetype-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt; | 
**currencyCode** | **String** | The currency code of the currency in that the charge is applied.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#currencycodes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt; | 
**conditionList** | [**List&lt;ConditionListEnum&gt;**](#List&lt;ConditionListEnum&gt;) | A list of conditions for the tax. Is empty if &lt;code&gt;chargeType&lt;/code&gt; is not &lt;code&gt;conditional&lt;/code&gt;. | 



## Enum: TypeCodeEnum

Name | Value
---- | -----
NUMBER_2 | new BigDecimal(&quot;2&quot;)
NUMBER_9 | new BigDecimal(&quot;9&quot;)
NUMBER_11 | new BigDecimal(&quot;11&quot;)
NUMBER_12 | new BigDecimal(&quot;12&quot;)
NUMBER_14 | new BigDecimal(&quot;14&quot;)
NUMBER_16 | new BigDecimal(&quot;16&quot;)
NUMBER_27 | new BigDecimal(&quot;27&quot;)
NUMBER_29 | new BigDecimal(&quot;29&quot;)
NUMBER_31 | new BigDecimal(&quot;31&quot;)
NUMBER_32 | new BigDecimal(&quot;32&quot;)
NUMBER_33 | new BigDecimal(&quot;33&quot;)
NUMBER_34 | new BigDecimal(&quot;34&quot;)
NUMBER_37 | new BigDecimal(&quot;37&quot;)
NUMBER_38 | new BigDecimal(&quot;38&quot;)
NUMBER_40 | new BigDecimal(&quot;40&quot;)
NUMBER_41 | new BigDecimal(&quot;41&quot;)
NUMBER_42 | new BigDecimal(&quot;42&quot;)
NUMBER_44 | new BigDecimal(&quot;44&quot;)
NUMBER_45 | new BigDecimal(&quot;45&quot;)
NUMBER_47 | new BigDecimal(&quot;47&quot;)
NUMBER_51 | new BigDecimal(&quot;51&quot;)
NUMBER_52 | new BigDecimal(&quot;52&quot;)
NUMBER_53 | new BigDecimal(&quot;53&quot;)
NUMBER_54 | new BigDecimal(&quot;54&quot;)
NUMBER_55 | new BigDecimal(&quot;55&quot;)
NUMBER_56 | new BigDecimal(&quot;56&quot;)
NUMBER_5000 | new BigDecimal(&quot;5000&quot;)
NUMBER_5003 | new BigDecimal(&quot;5003&quot;)
NUMBER_5005 | new BigDecimal(&quot;5005&quot;)
NUMBER_5006 | new BigDecimal(&quot;5006&quot;)
NUMBER_5009 | new BigDecimal(&quot;5009&quot;)
NUMBER_5010 | new BigDecimal(&quot;5010&quot;)
NUMBER_5011 | new BigDecimal(&quot;5011&quot;)
NUMBER_5012 | new BigDecimal(&quot;5012&quot;)
NUMBER_5013 | new BigDecimal(&quot;5013&quot;)
NUMBER_5014 | new BigDecimal(&quot;5014&quot;)
NUMBER_5015 | new BigDecimal(&quot;5015&quot;)
NUMBER_5016 | new BigDecimal(&quot;5016&quot;)
NUMBER_5017 | new BigDecimal(&quot;5017&quot;)
NUMBER_5018 | new BigDecimal(&quot;5018&quot;)
NUMBER_5019 | new BigDecimal(&quot;5019&quot;)
NUMBER_5020 | new BigDecimal(&quot;5020&quot;)
NUMBER_5021 | new BigDecimal(&quot;5021&quot;)
NUMBER_5022 | new BigDecimal(&quot;5022&quot;)
NUMBER_5023 | new BigDecimal(&quot;5023&quot;)
NUMBER_5024 | new BigDecimal(&quot;5024&quot;)
NUMBER_5025 | new BigDecimal(&quot;5025&quot;)
NUMBER_5026 | new BigDecimal(&quot;5026&quot;)
NUMBER_5027 | new BigDecimal(&quot;5027&quot;)
NUMBER_5028 | new BigDecimal(&quot;5028&quot;)
NUMBER_5029 | new BigDecimal(&quot;5029&quot;)
NUMBER_5030 | new BigDecimal(&quot;5030&quot;)
NUMBER_5031 | new BigDecimal(&quot;5031&quot;)
NUMBER_5032 | new BigDecimal(&quot;5032&quot;)
NUMBER_5033 | new BigDecimal(&quot;5033&quot;)
NUMBER_5035 | new BigDecimal(&quot;5035&quot;)
NUMBER_5036 | new BigDecimal(&quot;5036&quot;)
NUMBER_20001 | new BigDecimal(&quot;20001&quot;)



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




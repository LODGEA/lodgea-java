

# InlineResponse2003PropertyPropertyInfo

General information regarding the property.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unitCount** | **BigDecimal** | The amount of units the property has. |  [optional]
**messageList** | [**List&lt;InlineResponse2003PropertyPropertyInfoMessageList&gt;**](InlineResponse2003PropertyPropertyInfoMessageList.md) | Contains a descriptive message for this property in all supported languages. | 
**categoryList** | [**List&lt;CategoryListEnum&gt;**](#List&lt;CategoryListEnum&gt;) | A list of code of the property class types that apply to the property. | 
**languageList** | [**List&lt;LanguageListEnum&gt;**](#List&lt;LanguageListEnum&gt;) | The codes of languages the staff of this property can speak. Please note that these codes partially differ from the two character ISO language codes widely used throughout the API as they partially include country specific language code.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#languagecountry-code\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt; | 
**location** | [**InlineResponse2001GeoLocation**](InlineResponse2001GeoLocation.md) |  |  [optional]
**acceptedPaymentList** | [**List&lt;InlineResponse2003PropertyPropertyInfoAcceptedPaymentList&gt;**](InlineResponse2003PropertyPropertyInfoAcceptedPaymentList.md) | A list of the accepted payment methods. Payment methods might subject to frequent change as payment providers come and go. You should always implement a way to handle new, unexpected payment methods.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#paymenttypes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt; | 



## Enum: List&lt;CategoryListEnum&gt;

Name | Value
---- | -----
NUMBER_1 | new BigDecimal(&quot;1&quot;)
NUMBER_2 | new BigDecimal(&quot;2&quot;)
NUMBER_3 | new BigDecimal(&quot;3&quot;)
NUMBER_4 | new BigDecimal(&quot;4&quot;)
NUMBER_5 | new BigDecimal(&quot;5&quot;)
NUMBER_6 | new BigDecimal(&quot;6&quot;)
NUMBER_7 | new BigDecimal(&quot;7&quot;)
NUMBER_8 | new BigDecimal(&quot;8&quot;)
NUMBER_9 | new BigDecimal(&quot;9&quot;)
NUMBER_10 | new BigDecimal(&quot;10&quot;)
NUMBER_11 | new BigDecimal(&quot;11&quot;)
NUMBER_12 | new BigDecimal(&quot;12&quot;)
NUMBER_13 | new BigDecimal(&quot;13&quot;)
NUMBER_14 | new BigDecimal(&quot;14&quot;)
NUMBER_15 | new BigDecimal(&quot;15&quot;)
NUMBER_16 | new BigDecimal(&quot;16&quot;)
NUMBER_17 | new BigDecimal(&quot;17&quot;)
NUMBER_18 | new BigDecimal(&quot;18&quot;)
NUMBER_19 | new BigDecimal(&quot;19&quot;)
NUMBER_20 | new BigDecimal(&quot;20&quot;)
NUMBER_21 | new BigDecimal(&quot;21&quot;)
NUMBER_22 | new BigDecimal(&quot;22&quot;)
NUMBER_23 | new BigDecimal(&quot;23&quot;)
NUMBER_24 | new BigDecimal(&quot;24&quot;)
NUMBER_25 | new BigDecimal(&quot;25&quot;)
NUMBER_26 | new BigDecimal(&quot;26&quot;)
NUMBER_27 | new BigDecimal(&quot;27&quot;)
NUMBER_28 | new BigDecimal(&quot;28&quot;)
NUMBER_29 | new BigDecimal(&quot;29&quot;)
NUMBER_30 | new BigDecimal(&quot;30&quot;)
NUMBER_31 | new BigDecimal(&quot;31&quot;)
NUMBER_32 | new BigDecimal(&quot;32&quot;)
NUMBER_33 | new BigDecimal(&quot;33&quot;)
NUMBER_34 | new BigDecimal(&quot;34&quot;)
NUMBER_35 | new BigDecimal(&quot;35&quot;)
NUMBER_36 | new BigDecimal(&quot;36&quot;)
NUMBER_37 | new BigDecimal(&quot;37&quot;)
NUMBER_38 | new BigDecimal(&quot;38&quot;)
NUMBER_39 | new BigDecimal(&quot;39&quot;)
NUMBER_40 | new BigDecimal(&quot;40&quot;)
NUMBER_41 | new BigDecimal(&quot;41&quot;)
NUMBER_42 | new BigDecimal(&quot;42&quot;)
NUMBER_43 | new BigDecimal(&quot;43&quot;)
NUMBER_44 | new BigDecimal(&quot;44&quot;)
NUMBER_45 | new BigDecimal(&quot;45&quot;)
NUMBER_46 | new BigDecimal(&quot;46&quot;)
NUMBER_47 | new BigDecimal(&quot;47&quot;)
NUMBER_48 | new BigDecimal(&quot;48&quot;)
NUMBER_49 | new BigDecimal(&quot;49&quot;)
NUMBER_50 | new BigDecimal(&quot;50&quot;)
NUMBER_51 | new BigDecimal(&quot;51&quot;)
NUMBER_52 | new BigDecimal(&quot;52&quot;)
NUMBER_53 | new BigDecimal(&quot;53&quot;)
NUMBER_54 | new BigDecimal(&quot;54&quot;)
NUMBER_55 | new BigDecimal(&quot;55&quot;)
NUMBER_56 | new BigDecimal(&quot;56&quot;)
NUMBER_57 | new BigDecimal(&quot;57&quot;)
NUMBER_58 | new BigDecimal(&quot;58&quot;)
NUMBER_59 | new BigDecimal(&quot;59&quot;)
NUMBER_60 | new BigDecimal(&quot;60&quot;)
NUMBER_61 | new BigDecimal(&quot;61&quot;)
NUMBER_62 | new BigDecimal(&quot;62&quot;)
NUMBER_5000 | new BigDecimal(&quot;5000&quot;)
NUMBER_5001 | new BigDecimal(&quot;5001&quot;)
NUMBER_5002 | new BigDecimal(&quot;5002&quot;)
NUMBER_5003 | new BigDecimal(&quot;5003&quot;)
NUMBER_5004 | new BigDecimal(&quot;5004&quot;)
NUMBER_5005 | new BigDecimal(&quot;5005&quot;)
NUMBER_5006 | new BigDecimal(&quot;5006&quot;)
NUMBER_5007 | new BigDecimal(&quot;5007&quot;)
NUMBER_5008 | new BigDecimal(&quot;5008&quot;)
NUMBER_5009 | new BigDecimal(&quot;5009&quot;)



## Enum: List&lt;LanguageListEnum&gt;

Name | Value
---- | -----
AF | &quot;af&quot;
AR | &quot;ar&quot;
AZ | &quot;az&quot;
BE | &quot;be&quot;
BG | &quot;bg&quot;
CA | &quot;ca&quot;
CS | &quot;cs&quot;
DA | &quot;da&quot;
DE | &quot;de&quot;
EL | &quot;el&quot;
EN | &quot;en&quot;
EN_GB | &quot;en-gb&quot;
EN_US | &quot;en-us&quot;
ES | &quot;es&quot;
ES_AR | &quot;es-ar&quot;
ET | &quot;et&quot;
FR | &quot;fr&quot;
FI | &quot;fi&quot;
HE | &quot;he&quot;
HI | &quot;hi&quot;
HR | &quot;hr&quot;
HU | &quot;hu&quot;
ID | &quot;id&quot;
IS | &quot;is&quot;
IT | &quot;it&quot;
JA | &quot;ja&quot;
KM | &quot;km&quot;
KO | &quot;ko&quot;
LO | &quot;lo&quot;
LT | &quot;lt&quot;
LV | &quot;lv&quot;
MS | &quot;ms&quot;
NL | &quot;nl&quot;
NO | &quot;no&quot;
PL | &quot;pl&quot;
PT | &quot;pt&quot;
PT_BR | &quot;pt-br&quot;
PT_PT | &quot;pt-pt&quot;
RO | &quot;ro&quot;
RU | &quot;ru&quot;
SK | &quot;sk&quot;
SL | &quot;sl&quot;
SR | &quot;sr&quot;
SV | &quot;sv&quot;
TL | &quot;tl&quot;
TH | &quot;th&quot;
TR | &quot;tr&quot;
UK | &quot;uk&quot;
VI | &quot;vi&quot;
XA | &quot;xa&quot;
XB | &quot;xb&quot;
XS | &quot;xs&quot;
XT | &quot;xt&quot;
XU | &quot;xu&quot;
ZH | &quot;zh&quot;
ZH_CN | &quot;zh-cn&quot;
ZH_TW | &quot;zh-tw&quot;




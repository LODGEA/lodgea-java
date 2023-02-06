

# AvailablePropertiesInner1Geo

A geographical information set describing the location of this property.<br><br>See also <a href=\"#locationtypes\">in the appendix</a>.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**language** | [**LanguageEnum**](#LanguageEnum) | The language of the localizable fields ot this geographical information set.&lt;p&gt;Please note that beside the general restrictions listed below only languages configured during system setup for your respective tenant are allowed.&lt;/p&gt;&lt;p&gt;See also &lt;a href&#x3D;\&quot;#isolanguage-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt; |  |
|**formattedAddress** | **String** | The formatted address in the local format of the properties location. |  |
|**route** | **String** | The name of the route or street. |  [optional] |
|**streetNumber** | **String** | The number of the street. |  [optional] |
|**postalCode** | **String** | The postal code of the location. |  [optional] |
|**locality** | **String** | A city or town. |  [optional] |
|**sublocality** | **String** | A smaller area within a locality. |  [optional] |
|**sublocalityLevel1** | **String** | A smaller area within a locality at level 1. |  [optional] |
|**sublocalityLevel2** | **String** | A smaller area within a locality at level 2. |  [optional] |
|**sublocalityLevel3** | **String** | A smaller area within a locality at level 3. |  [optional] |
|**sublocalityLevel4** | **String** | A smaller area within a locality at level 4. |  [optional] |
|**sublocalityLevel5** | **String** | A smaller area within a locality at level 5. |  [optional] |
|**administrativeAreaLevel1** | **String** | A level 1 administrative area, such as a state or province. |  [optional] |
|**administrativeAreaLevel2** | **String** | A level 2 administrative area. |  [optional] |
|**administrativeAreaLevel3** | **String** | A level 3 administrative area |  [optional] |
|**administrativeAreaLevel4** | **String** | A level 4 administrative area. |  [optional] |
|**administrativeAreaLevel5** | **String** | A level 5 administrative area |  [optional] |
|**stateCode** | **String** | The state or province code for the administrative area. |  [optional] |
|**country** | **String** | The country of this geographical information set. |  [optional] |
|**countryCode** | **String** | The country code for the country. |  [optional] |
|**location** | [**AvailablePropertiesInner1GeoLocation**](AvailablePropertiesInner1GeoLocation.md) |  |  |
|**placeId** | **String** | Uniquely identifies a place in our database. |  |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| AF | &quot;af&quot; |
| AR | &quot;ar&quot; |
| BG | &quot;bg&quot; |
| CA | &quot;ca&quot; |
| CS | &quot;cs&quot; |
| DA | &quot;da&quot; |
| DE | &quot;de&quot; |
| EL | &quot;el&quot; |
| EN | &quot;en&quot; |
| ES | &quot;es&quot; |
| ET | &quot;et&quot; |
| FI | &quot;fi&quot; |
| FR | &quot;fr&quot; |
| HE | &quot;he&quot; |
| HI | &quot;hi&quot; |
| HR | &quot;hr&quot; |
| HU | &quot;hu&quot; |
| ID | &quot;id&quot; |
| IS | &quot;is&quot; |
| IT | &quot;it&quot; |
| JA | &quot;ja&quot; |
| KO | &quot;ko&quot; |
| LT | &quot;lt&quot; |
| LV | &quot;lv&quot; |
| NL | &quot;nl&quot; |
| NO | &quot;no&quot; |
| PL | &quot;pl&quot; |
| PT | &quot;pt&quot; |
| RO | &quot;ro&quot; |
| RU | &quot;ru&quot; |
| SK | &quot;sk&quot; |
| SL | &quot;sl&quot; |
| SR | &quot;sr&quot; |
| SV | &quot;sv&quot; |
| TH | &quot;th&quot; |
| TR | &quot;tr&quot; |
| VI | &quot;vi&quot; |
| ZH | &quot;zh&quot; |




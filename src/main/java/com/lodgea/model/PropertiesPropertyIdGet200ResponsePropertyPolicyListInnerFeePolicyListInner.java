/*
 * lodgea-java
 * LODGEA SDK for java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: support@lodgea.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lodgea.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.lodgea.JSON;

/**
 * PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner {
  /**
   * The code that represents the type of fee.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#feetype-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   */
  @JsonAdapter(TypeCodeEnum.Adapter.class)
  public enum TypeCodeEnum {
    NUMBER_2(new BigDecimal("2")),
    
    NUMBER_9(new BigDecimal("9")),
    
    NUMBER_11(new BigDecimal("11")),
    
    NUMBER_12(new BigDecimal("12")),
    
    NUMBER_14(new BigDecimal("14")),
    
    NUMBER_16(new BigDecimal("16")),
    
    NUMBER_27(new BigDecimal("27")),
    
    NUMBER_29(new BigDecimal("29")),
    
    NUMBER_31(new BigDecimal("31")),
    
    NUMBER_32(new BigDecimal("32")),
    
    NUMBER_33(new BigDecimal("33")),
    
    NUMBER_34(new BigDecimal("34")),
    
    NUMBER_37(new BigDecimal("37")),
    
    NUMBER_38(new BigDecimal("38")),
    
    NUMBER_40(new BigDecimal("40")),
    
    NUMBER_41(new BigDecimal("41")),
    
    NUMBER_42(new BigDecimal("42")),
    
    NUMBER_44(new BigDecimal("44")),
    
    NUMBER_45(new BigDecimal("45")),
    
    NUMBER_47(new BigDecimal("47")),
    
    NUMBER_51(new BigDecimal("51")),
    
    NUMBER_52(new BigDecimal("52")),
    
    NUMBER_53(new BigDecimal("53")),
    
    NUMBER_54(new BigDecimal("54")),
    
    NUMBER_55(new BigDecimal("55")),
    
    NUMBER_56(new BigDecimal("56")),
    
    NUMBER_5000(new BigDecimal("5000")),
    
    NUMBER_5003(new BigDecimal("5003")),
    
    NUMBER_5005(new BigDecimal("5005")),
    
    NUMBER_5006(new BigDecimal("5006")),
    
    NUMBER_5009(new BigDecimal("5009")),
    
    NUMBER_5010(new BigDecimal("5010")),
    
    NUMBER_5011(new BigDecimal("5011")),
    
    NUMBER_5012(new BigDecimal("5012")),
    
    NUMBER_5013(new BigDecimal("5013")),
    
    NUMBER_5014(new BigDecimal("5014")),
    
    NUMBER_5015(new BigDecimal("5015")),
    
    NUMBER_5016(new BigDecimal("5016")),
    
    NUMBER_5017(new BigDecimal("5017")),
    
    NUMBER_5018(new BigDecimal("5018")),
    
    NUMBER_5019(new BigDecimal("5019")),
    
    NUMBER_5020(new BigDecimal("5020")),
    
    NUMBER_5021(new BigDecimal("5021")),
    
    NUMBER_5022(new BigDecimal("5022")),
    
    NUMBER_5023(new BigDecimal("5023")),
    
    NUMBER_5024(new BigDecimal("5024")),
    
    NUMBER_5025(new BigDecimal("5025")),
    
    NUMBER_5026(new BigDecimal("5026")),
    
    NUMBER_5027(new BigDecimal("5027")),
    
    NUMBER_5028(new BigDecimal("5028")),
    
    NUMBER_5029(new BigDecimal("5029")),
    
    NUMBER_5030(new BigDecimal("5030")),
    
    NUMBER_5031(new BigDecimal("5031")),
    
    NUMBER_5032(new BigDecimal("5032")),
    
    NUMBER_5033(new BigDecimal("5033")),
    
    NUMBER_5035(new BigDecimal("5035")),
    
    NUMBER_5036(new BigDecimal("5036")),
    
    NUMBER_20001(new BigDecimal("20001"));

    private BigDecimal value;

    TypeCodeEnum(BigDecimal value) {
      this.value = value;
    }

    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeCodeEnum fromValue(BigDecimal value) {
      for (TypeCodeEnum b : TypeCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeCodeEnum.fromValue(new BigDecimal(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE_CODE = "typeCode";
  @SerializedName(SERIALIZED_NAME_TYPE_CODE)
  private TypeCodeEnum typeCode;

  public static final String SERIALIZED_NAME_PERCENT = "percent";
  @SerializedName(SERIALIZED_NAME_PERCENT)
  private BigDecimal percent;

  /**
   * The type of charge.
   */
  @JsonAdapter(ChargeTypeEnum.Adapter.class)
  public enum ChargeTypeEnum {
    INCLUDED("included"),
    
    EXCLUDED("excluded"),
    
    CONDITIONAL("conditional");

    private String value;

    ChargeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChargeTypeEnum fromValue(String value) {
      for (ChargeTypeEnum b : ChargeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChargeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChargeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChargeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHARGE_TYPE = "chargeType";
  @SerializedName(SERIALIZED_NAME_CHARGE_TYPE)
  private ChargeTypeEnum chargeType;

  /**
   * The code that represents the frequency of charge.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#chargetype-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   */
  @JsonAdapter(ChargeFrequencyCodeEnum.Adapter.class)
  public enum ChargeFrequencyCodeEnum {
    NUMBER_1(new BigDecimal("1")),
    
    NUMBER_2(new BigDecimal("2")),
    
    NUMBER_7(new BigDecimal("7")),
    
    NUMBER_10(new BigDecimal("10")),
    
    NUMBER_12(new BigDecimal("12")),
    
    NUMBER_17(new BigDecimal("17")),
    
    NUMBER_19(new BigDecimal("19")),
    
    NUMBER_20(new BigDecimal("20")),
    
    NUMBER_21(new BigDecimal("21")),
    
    NUMBER_25(new BigDecimal("25")),
    
    NUMBER_31(new BigDecimal("31")),
    
    NUMBER_5000(new BigDecimal("5000")),
    
    NUMBER_5001(new BigDecimal("5001")),
    
    NUMBER_5002(new BigDecimal("5002")),
    
    NUMBER_5010(new BigDecimal("5010")),
    
    NUMBER_5011(new BigDecimal("5011")),
    
    NUMBER_5012(new BigDecimal("5012")),
    
    NUMBER_5013(new BigDecimal("5013")),
    
    NUMBER_5014(new BigDecimal("5014")),
    
    NUMBER_5015(new BigDecimal("5015")),
    
    NUMBER_5016(new BigDecimal("5016")),
    
    NUMBER_5017(new BigDecimal("5017")),
    
    NUMBER_90010(new BigDecimal("90010")),
    
    NUMBER_90011(new BigDecimal("90011")),
    
    NUMBER_90012(new BigDecimal("90012")),
    
    NUMBER_90013(new BigDecimal("90013"));

    private BigDecimal value;

    ChargeFrequencyCodeEnum(BigDecimal value) {
      this.value = value;
    }

    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChargeFrequencyCodeEnum fromValue(BigDecimal value) {
      for (ChargeFrequencyCodeEnum b : ChargeFrequencyCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChargeFrequencyCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargeFrequencyCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChargeFrequencyCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChargeFrequencyCodeEnum.fromValue(new BigDecimal(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_CHARGE_FREQUENCY_CODE = "chargeFrequencyCode";
  @SerializedName(SERIALIZED_NAME_CHARGE_FREQUENCY_CODE)
  private ChargeFrequencyCodeEnum chargeFrequencyCode;

  /**
   * The currency code of the currency in that the charge is applied.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#currencycodes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   */
  @JsonAdapter(CurrencyCodeEnum.Adapter.class)
  public enum CurrencyCodeEnum {
    AED("AED"),
    
    ARS("ARS"),
    
    AUD("AUD"),
    
    AZN("AZN"),
    
    BGN("BGN"),
    
    BHD("BHD"),
    
    BRL("BRL"),
    
    CAD("CAD"),
    
    CHF("CHF"),
    
    CLP("CLP"),
    
    CNY("CNY"),
    
    COP("COP"),
    
    CZK("CZK"),
    
    DKK("DKK"),
    
    EGP("EGP"),
    
    EUR("EUR"),
    
    FJD("FJD"),
    
    GBP("GBP"),
    
    GEL("GEL"),
    
    HKD("HKD"),
    
    HUF("HUF"),
    
    IDR("IDR"),
    
    ILS("ILS"),
    
    INR("INR"),
    
    JOD("JOD"),
    
    JPY("JPY"),
    
    KRW("KRW"),
    
    KWD("KWD"),
    
    KZT("KZT"),
    
    MDL("MDL"),
    
    MXN("MXN"),
    
    MYR("MYR"),
    
    NAD("NAD"),
    
    NOK("NOK"),
    
    NZD("NZD"),
    
    OMR("OMR"),
    
    PLN("PLN"),
    
    QAR("QAR"),
    
    RON("RON"),
    
    RUB("RUB"),
    
    SAR("SAR"),
    
    SEK("SEK"),
    
    SGD("SGD"),
    
    THB("THB"),
    
    TRY("TRY"),
    
    TWD("TWD"),
    
    UAH("UAH"),
    
    USD("USD"),
    
    XOF("XOF"),
    
    ZAR("ZAR");

    private String value;

    CurrencyCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrencyCodeEnum fromValue(String value) {
      for (CurrencyCodeEnum b : CurrencyCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CurrencyCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrencyCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrencyCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CurrencyCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private CurrencyCodeEnum currencyCode;

  /**
   * Gets or Sets conditionList
   */
  @JsonAdapter(ConditionListEnum.Adapter.class)
  public enum ConditionListEnum {
    BRINGS_PET("guest_brings_pet"),
    
    DOESNT_CLEAN_BEFORE_CHECKOUT("guest_doesnt_clean_before_checkout"),
    
    SMOKES("guest_smokes");

    private String value;

    ConditionListEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConditionListEnum fromValue(String value) {
      for (ConditionListEnum b : ConditionListEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConditionListEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConditionListEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConditionListEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConditionListEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONDITION_LIST = "conditionList";
  @SerializedName(SERIALIZED_NAME_CONDITION_LIST)
  private List<ConditionListEnum> conditionList = new ArrayList<>();

  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner() {
  }

  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner typeCode(TypeCodeEnum typeCode) {
    
    this.typeCode = typeCode;
    return this;
  }

   /**
   * The code that represents the type of fee.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#feetype-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   * @return typeCode
  **/
  @javax.annotation.Nonnull

  public TypeCodeEnum getTypeCode() {
    return typeCode;
  }


  public void setTypeCode(TypeCodeEnum typeCode) {
    this.typeCode = typeCode;
  }


  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner percent(BigDecimal percent) {
    
    this.percent = percent;
    return this;
  }

   /**
   * The charged percentage if applicable.
   * @return percent
  **/
  @javax.annotation.Nullable

  public BigDecimal getPercent() {
    return percent;
  }


  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }


  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner chargeType(ChargeTypeEnum chargeType) {
    
    this.chargeType = chargeType;
    return this;
  }

   /**
   * The type of charge.
   * @return chargeType
  **/
  @javax.annotation.Nonnull

  public ChargeTypeEnum getChargeType() {
    return chargeType;
  }


  public void setChargeType(ChargeTypeEnum chargeType) {
    this.chargeType = chargeType;
  }


  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner chargeFrequencyCode(ChargeFrequencyCodeEnum chargeFrequencyCode) {
    
    this.chargeFrequencyCode = chargeFrequencyCode;
    return this;
  }

   /**
   * The code that represents the frequency of charge.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#chargetype-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   * @return chargeFrequencyCode
  **/
  @javax.annotation.Nonnull

  public ChargeFrequencyCodeEnum getChargeFrequencyCode() {
    return chargeFrequencyCode;
  }


  public void setChargeFrequencyCode(ChargeFrequencyCodeEnum chargeFrequencyCode) {
    this.chargeFrequencyCode = chargeFrequencyCode;
  }


  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner currencyCode(CurrencyCodeEnum currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency code of the currency in that the charge is applied.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#currencycodes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   * @return currencyCode
  **/
  @javax.annotation.Nonnull

  public CurrencyCodeEnum getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(CurrencyCodeEnum currencyCode) {
    this.currencyCode = currencyCode;
  }


  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner conditionList(List<ConditionListEnum> conditionList) {
    
    this.conditionList = conditionList;
    return this;
  }

  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner addConditionListItem(ConditionListEnum conditionListItem) {
    this.conditionList.add(conditionListItem);
    return this;
  }

   /**
   * A list of conditions for the tax. Is empty if &lt;code&gt;chargeType&lt;/code&gt; is not &lt;code&gt;conditional&lt;/code&gt;.
   * @return conditionList
  **/
  @javax.annotation.Nonnull

  public List<ConditionListEnum> getConditionList() {
    return conditionList;
  }


  public void setConditionList(List<ConditionListEnum> conditionList) {
    this.conditionList = conditionList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner propertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner = (PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner) o;
    return Objects.equals(this.typeCode, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner.typeCode) &&
        Objects.equals(this.percent, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner.percent) &&
        Objects.equals(this.chargeType, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner.chargeType) &&
        Objects.equals(this.chargeFrequencyCode, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner.chargeFrequencyCode) &&
        Objects.equals(this.currencyCode, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner.currencyCode) &&
        Objects.equals(this.conditionList, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner.conditionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeCode, percent, chargeType, chargeFrequencyCode, currencyCode, conditionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner {\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    chargeFrequencyCode: ").append(toIndentedString(chargeFrequencyCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    conditionList: ").append(toIndentedString(conditionList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("typeCode");
    openapiFields.add("percent");
    openapiFields.add("chargeType");
    openapiFields.add("chargeFrequencyCode");
    openapiFields.add("currencyCode");
    openapiFields.add("conditionList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("typeCode");
    openapiRequiredFields.add("chargeType");
    openapiRequiredFields.add("chargeFrequencyCode");
    openapiRequiredFields.add("currencyCode");
    openapiRequiredFields.add("conditionList");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner is not found in the empty JSON string", PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("chargeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargeType").toString()));
      }
      if (!jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("conditionList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("conditionList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `conditionList` to be an array in the JSON string but got `%s`", jsonObj.get("conditionList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner>() {
           @Override
           public void write(JsonWriter out, PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner
  * @throws IOException if the JSON string is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner
  */
  public static PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner.class);
  }

 /**
  * Convert an instance of PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerFeePolicyListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


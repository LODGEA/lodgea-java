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
 * AvailablePropertiesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class AvailablePropertiesInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The currency code of the currency of the lowest price.
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

  public static final String SERIALIZED_NAME_LOWEST_PRICE = "lowestPrice";
  @SerializedName(SERIALIZED_NAME_LOWEST_PRICE)
  private BigDecimal lowestPrice;

  /**
   * The type of the found location.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#locationtypes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FORMATTED_ADDRESS("formatted_address"),
    
    PLACE_ID("place_id"),
    
    LOCALITY("locality"),
    
    ADMINISTRATIVE_AREA_LEVEL_1("administrative_area_level_1"),
    
    ADMINISTRATIVE_AREA_LEVEL_2("administrative_area_level_2"),
    
    ADMINISTRATIVE_AREA_LEVEL_3("administrative_area_level_3"),
    
    ADMINISTRATIVE_AREA_LEVEL_4("administrative_area_level_4"),
    
    ADMINISTRATIVE_AREA_LEVEL_5("administrative_area_level_5"),
    
    STATE_CODE("state_code"),
    
    COUNTRY("country"),
    
    COUNTRY_CODE("country_code"),
    
    POSTAL_CODE("postal_code"),
    
    LANGUAGE("language"),
    
    NATURAL_FEATURE("natural_feature"),
    
    ESTABLISHMENT("establishment"),
    
    SUBLOCALITY("sublocality"),
    
    SUBLOCALITY_LEVEL_1("sublocality_level_1"),
    
    SUBLOCALITY_LEVEL_2("sublocality_level_2"),
    
    SUBLOCALITY_LEVEL_3("sublocality_level_3"),
    
    SUBLOCALITY_LEVEL_4("sublocality_level_4"),
    
    SUBLOCALITY_LEVEL_5("sublocality_level_5"),
    
    STREETNUMBER("streetNumber");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public AvailablePropertiesInner() {
  }

  public AvailablePropertiesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the location.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AvailablePropertiesInner currencyCode(CurrencyCodeEnum currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency code of the currency of the lowest price.
   * @return currencyCode
  **/
  @javax.annotation.Nonnull

  public CurrencyCodeEnum getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(CurrencyCodeEnum currencyCode) {
    this.currencyCode = currencyCode;
  }


  public AvailablePropertiesInner lowestPrice(BigDecimal lowestPrice) {
    
    this.lowestPrice = lowestPrice;
    return this;
  }

   /**
   * The lowest price available for this location.
   * @return lowestPrice
  **/
  @javax.annotation.Nonnull

  public BigDecimal getLowestPrice() {
    return lowestPrice;
  }


  public void setLowestPrice(BigDecimal lowestPrice) {
    this.lowestPrice = lowestPrice;
  }


  public AvailablePropertiesInner type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the found location.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#locationtypes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   * @return type
  **/
  @javax.annotation.Nonnull

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailablePropertiesInner availablePropertiesInner = (AvailablePropertiesInner) o;
    return Objects.equals(this.name, availablePropertiesInner.name) &&
        Objects.equals(this.currencyCode, availablePropertiesInner.currencyCode) &&
        Objects.equals(this.lowestPrice, availablePropertiesInner.lowestPrice) &&
        Objects.equals(this.type, availablePropertiesInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, currencyCode, lowestPrice, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailablePropertiesInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    lowestPrice: ").append(toIndentedString(lowestPrice)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("currencyCode");
    openapiFields.add("lowestPrice");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("currencyCode");
    openapiRequiredFields.add("lowestPrice");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AvailablePropertiesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AvailablePropertiesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailablePropertiesInner is not found in the empty JSON string", AvailablePropertiesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AvailablePropertiesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailablePropertiesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AvailablePropertiesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailablePropertiesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailablePropertiesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailablePropertiesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailablePropertiesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailablePropertiesInner>() {
           @Override
           public void write(JsonWriter out, AvailablePropertiesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailablePropertiesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AvailablePropertiesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvailablePropertiesInner
  * @throws IOException if the JSON string is invalid with respect to AvailablePropertiesInner
  */
  public static AvailablePropertiesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailablePropertiesInner.class);
  }

 /**
  * Convert an instance of AvailablePropertiesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

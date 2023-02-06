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
 * An object outlining the stay with the lowest available price point for this property.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class AvailablePropertiesInner1LowestPrice {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  /**
   * The currency code for the given amount.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#currencycodes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
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

  public static final String SERIALIZED_NAME_ARRIVAL_DATE = "arrivalDate";
  @SerializedName(SERIALIZED_NAME_ARRIVAL_DATE)
  private BigDecimal arrivalDate;

  public static final String SERIALIZED_NAME_RETURN_DATE = "returnDate";
  @SerializedName(SERIALIZED_NAME_RETURN_DATE)
  private BigDecimal returnDate;

  public static final String SERIALIZED_NAME_LENGTH_OF_STAY = "lengthOfStay";
  @SerializedName(SERIALIZED_NAME_LENGTH_OF_STAY)
  private BigDecimal lengthOfStay;

  public AvailablePropertiesInner1LowestPrice() {
  }

  public AvailablePropertiesInner1LowestPrice amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the lowest price.
   * @return amount
  **/
  @javax.annotation.Nonnull

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public AvailablePropertiesInner1LowestPrice currencyCode(CurrencyCodeEnum currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency code for the given amount.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#currencycodes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   * @return currencyCode
  **/
  @javax.annotation.Nonnull

  public CurrencyCodeEnum getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(CurrencyCodeEnum currencyCode) {
    this.currencyCode = currencyCode;
  }


  public AvailablePropertiesInner1LowestPrice arrivalDate(BigDecimal arrivalDate) {
    
    this.arrivalDate = arrivalDate;
    return this;
  }

   /**
   * Arrival date for the given price as unix timestamp (seconds).
   * @return arrivalDate
  **/
  @javax.annotation.Nonnull

  public BigDecimal getArrivalDate() {
    return arrivalDate;
  }


  public void setArrivalDate(BigDecimal arrivalDate) {
    this.arrivalDate = arrivalDate;
  }


  public AvailablePropertiesInner1LowestPrice returnDate(BigDecimal returnDate) {
    
    this.returnDate = returnDate;
    return this;
  }

   /**
   * Departure date for the given price as unix timestamp (seconds).
   * @return returnDate
  **/
  @javax.annotation.Nonnull

  public BigDecimal getReturnDate() {
    return returnDate;
  }


  public void setReturnDate(BigDecimal returnDate) {
    this.returnDate = returnDate;
  }


  public AvailablePropertiesInner1LowestPrice lengthOfStay(BigDecimal lengthOfStay) {
    
    this.lengthOfStay = lengthOfStay;
    return this;
  }

   /**
   * The amount of nights of stay this price is for
   * @return lengthOfStay
  **/
  @javax.annotation.Nonnull

  public BigDecimal getLengthOfStay() {
    return lengthOfStay;
  }


  public void setLengthOfStay(BigDecimal lengthOfStay) {
    this.lengthOfStay = lengthOfStay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailablePropertiesInner1LowestPrice availablePropertiesInner1LowestPrice = (AvailablePropertiesInner1LowestPrice) o;
    return Objects.equals(this.amount, availablePropertiesInner1LowestPrice.amount) &&
        Objects.equals(this.currencyCode, availablePropertiesInner1LowestPrice.currencyCode) &&
        Objects.equals(this.arrivalDate, availablePropertiesInner1LowestPrice.arrivalDate) &&
        Objects.equals(this.returnDate, availablePropertiesInner1LowestPrice.returnDate) &&
        Objects.equals(this.lengthOfStay, availablePropertiesInner1LowestPrice.lengthOfStay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode, arrivalDate, returnDate, lengthOfStay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailablePropertiesInner1LowestPrice {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    arrivalDate: ").append(toIndentedString(arrivalDate)).append("\n");
    sb.append("    returnDate: ").append(toIndentedString(returnDate)).append("\n");
    sb.append("    lengthOfStay: ").append(toIndentedString(lengthOfStay)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("currencyCode");
    openapiFields.add("arrivalDate");
    openapiFields.add("returnDate");
    openapiFields.add("lengthOfStay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currencyCode");
    openapiRequiredFields.add("arrivalDate");
    openapiRequiredFields.add("returnDate");
    openapiRequiredFields.add("lengthOfStay");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AvailablePropertiesInner1LowestPrice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AvailablePropertiesInner1LowestPrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailablePropertiesInner1LowestPrice is not found in the empty JSON string", AvailablePropertiesInner1LowestPrice.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AvailablePropertiesInner1LowestPrice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailablePropertiesInner1LowestPrice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AvailablePropertiesInner1LowestPrice.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailablePropertiesInner1LowestPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailablePropertiesInner1LowestPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailablePropertiesInner1LowestPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailablePropertiesInner1LowestPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailablePropertiesInner1LowestPrice>() {
           @Override
           public void write(JsonWriter out, AvailablePropertiesInner1LowestPrice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailablePropertiesInner1LowestPrice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AvailablePropertiesInner1LowestPrice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvailablePropertiesInner1LowestPrice
  * @throws IOException if the JSON string is invalid with respect to AvailablePropertiesInner1LowestPrice
  */
  public static AvailablePropertiesInner1LowestPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailablePropertiesInner1LowestPrice.class);
  }

 /**
  * Convert an instance of AvailablePropertiesInner1LowestPrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


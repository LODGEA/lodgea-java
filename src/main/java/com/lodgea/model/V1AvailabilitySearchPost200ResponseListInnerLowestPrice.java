/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@lodgea.com
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.lodgea.JSON;

/**
 * V1AvailabilitySearchPost200ResponseListInnerLowestPrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-05T14:11:24.889721894Z[Etc/UTC]")
public class V1AvailabilitySearchPost200ResponseListInnerLowestPrice {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_ARRIVAL_DATE = "arrivalDate";
  @SerializedName(SERIALIZED_NAME_ARRIVAL_DATE)
  private BigDecimal arrivalDate;

  public static final String SERIALIZED_NAME_RETURN_DATE = "returnDate";
  @SerializedName(SERIALIZED_NAME_RETURN_DATE)
  private BigDecimal returnDate;

  public static final String SERIALIZED_NAME_LENGTH_OF_STAY = "lengthOfStay";
  @SerializedName(SERIALIZED_NAME_LENGTH_OF_STAY)
  private BigDecimal lengthOfStay;

  public V1AvailabilitySearchPost200ResponseListInnerLowestPrice() { 
  }

  public V1AvailabilitySearchPost200ResponseListInnerLowestPrice amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "49", value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public V1AvailabilitySearchPost200ResponseListInnerLowestPrice currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EUR", value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public V1AvailabilitySearchPost200ResponseListInnerLowestPrice arrivalDate(BigDecimal arrivalDate) {
    
    this.arrivalDate = arrivalDate;
    return this;
  }

   /**
   * Get arrivalDate
   * @return arrivalDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1660780800", value = "")

  public BigDecimal getArrivalDate() {
    return arrivalDate;
  }


  public void setArrivalDate(BigDecimal arrivalDate) {
    this.arrivalDate = arrivalDate;
  }


  public V1AvailabilitySearchPost200ResponseListInnerLowestPrice returnDate(BigDecimal returnDate) {
    
    this.returnDate = returnDate;
    return this;
  }

   /**
   * Get returnDate
   * @return returnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1660867200", value = "")

  public BigDecimal getReturnDate() {
    return returnDate;
  }


  public void setReturnDate(BigDecimal returnDate) {
    this.returnDate = returnDate;
  }


  public V1AvailabilitySearchPost200ResponseListInnerLowestPrice lengthOfStay(BigDecimal lengthOfStay) {
    
    this.lengthOfStay = lengthOfStay;
    return this;
  }

   /**
   * Get lengthOfStay
   * @return lengthOfStay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

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
    V1AvailabilitySearchPost200ResponseListInnerLowestPrice v1AvailabilitySearchPost200ResponseListInnerLowestPrice = (V1AvailabilitySearchPost200ResponseListInnerLowestPrice) o;
    return Objects.equals(this.amount, v1AvailabilitySearchPost200ResponseListInnerLowestPrice.amount) &&
        Objects.equals(this.currencyCode, v1AvailabilitySearchPost200ResponseListInnerLowestPrice.currencyCode) &&
        Objects.equals(this.arrivalDate, v1AvailabilitySearchPost200ResponseListInnerLowestPrice.arrivalDate) &&
        Objects.equals(this.returnDate, v1AvailabilitySearchPost200ResponseListInnerLowestPrice.returnDate) &&
        Objects.equals(this.lengthOfStay, v1AvailabilitySearchPost200ResponseListInnerLowestPrice.lengthOfStay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode, arrivalDate, returnDate, lengthOfStay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AvailabilitySearchPost200ResponseListInnerLowestPrice {\n");
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
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1AvailabilitySearchPost200ResponseListInnerLowestPrice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1AvailabilitySearchPost200ResponseListInnerLowestPrice.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AvailabilitySearchPost200ResponseListInnerLowestPrice is not found in the empty JSON string", V1AvailabilitySearchPost200ResponseListInnerLowestPrice.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1AvailabilitySearchPost200ResponseListInnerLowestPrice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AvailabilitySearchPost200ResponseListInnerLowestPrice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AvailabilitySearchPost200ResponseListInnerLowestPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AvailabilitySearchPost200ResponseListInnerLowestPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AvailabilitySearchPost200ResponseListInnerLowestPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AvailabilitySearchPost200ResponseListInnerLowestPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AvailabilitySearchPost200ResponseListInnerLowestPrice>() {
           @Override
           public void write(JsonWriter out, V1AvailabilitySearchPost200ResponseListInnerLowestPrice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AvailabilitySearchPost200ResponseListInnerLowestPrice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1AvailabilitySearchPost200ResponseListInnerLowestPrice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1AvailabilitySearchPost200ResponseListInnerLowestPrice
  * @throws IOException if the JSON string is invalid with respect to V1AvailabilitySearchPost200ResponseListInnerLowestPrice
  */
  public static V1AvailabilitySearchPost200ResponseListInnerLowestPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AvailabilitySearchPost200ResponseListInnerLowestPrice.class);
  }

 /**
  * Convert an instance of V1AvailabilitySearchPost200ResponseListInnerLowestPrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


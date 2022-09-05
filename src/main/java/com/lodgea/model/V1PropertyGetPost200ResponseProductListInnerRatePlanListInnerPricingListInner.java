/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.0.0
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
import com.lodgea.model.V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInnerPriceList;
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
 * V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-05T16:14:26.477802845Z[Etc/UTC]")
public class V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner {
  public static final String SERIALIZED_NAME_DATE_TIME = "dateTime";
  @SerializedName(SERIALIZED_NAME_DATE_TIME)
  private BigDecimal dateTime;

  public static final String SERIALIZED_NAME_OCCUPANCY = "occupancy";
  @SerializedName(SERIALIZED_NAME_OCCUPANCY)
  private BigDecimal occupancy;

  public static final String SERIALIZED_NAME_PRICE_LIST = "priceList";
  @SerializedName(SERIALIZED_NAME_PRICE_LIST)
  private V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInnerPriceList priceList;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner() { 
  }

  public V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner dateTime(BigDecimal dateTime) {
    
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Get dateTime
   * @return dateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1614556800000", value = "")

  public BigDecimal getDateTime() {
    return dateTime;
  }


  public void setDateTime(BigDecimal dateTime) {
    this.dateTime = dateTime;
  }


  public V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner occupancy(BigDecimal occupancy) {
    
    this.occupancy = occupancy;
    return this;
  }

   /**
   * Get occupancy
   * @return occupancy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public BigDecimal getOccupancy() {
    return occupancy;
  }


  public void setOccupancy(BigDecimal occupancy) {
    this.occupancy = occupancy;
  }


  public V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner priceList(V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInnerPriceList priceList) {
    
    this.priceList = priceList;
    return this;
  }

   /**
   * Get priceList
   * @return priceList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInnerPriceList getPriceList() {
    return priceList;
  }


  public void setPriceList(V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInnerPriceList priceList) {
    this.priceList = priceList;
  }


  public V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner currencyCode(String currencyCode) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner v1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner = (V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner) o;
    return Objects.equals(this.dateTime, v1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner.dateTime) &&
        Objects.equals(this.occupancy, v1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner.occupancy) &&
        Objects.equals(this.priceList, v1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner.priceList) &&
        Objects.equals(this.currencyCode, v1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, occupancy, priceList, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner {\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    occupancy: ").append(toIndentedString(occupancy)).append("\n");
    sb.append("    priceList: ").append(toIndentedString(priceList)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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
    openapiFields.add("dateTime");
    openapiFields.add("occupancy");
    openapiFields.add("priceList");
    openapiFields.add("currencyCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner is not found in the empty JSON string", V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `priceList`
      if (jsonObj.getAsJsonObject("priceList") != null) {
        V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInnerPriceList.validateJsonObject(jsonObj.getAsJsonObject("priceList"));
      }
      if (jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner
  */
  public static V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


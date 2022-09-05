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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.lodgea.JSON;

/**
 * V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-05T14:11:24.889721894Z[Etc/UTC]")
public class V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner {
  public static final String SERIALIZED_NAME_TYPE_CODE = "typeCode";
  @SerializedName(SERIALIZED_NAME_TYPE_CODE)
  private BigDecimal typeCode;

  public static final String SERIALIZED_NAME_PERCENT = "percent";
  @SerializedName(SERIALIZED_NAME_PERCENT)
  private BigDecimal percent;

  public static final String SERIALIZED_NAME_CHARGE_TYPE = "chargeType";
  @SerializedName(SERIALIZED_NAME_CHARGE_TYPE)
  private String chargeType;

  public static final String SERIALIZED_NAME_CHARGE_FREQUENCY_CODE = "chargeFrequencyCode";
  @SerializedName(SERIALIZED_NAME_CHARGE_FREQUENCY_CODE)
  private BigDecimal chargeFrequencyCode;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_CONDITION_LIST = "conditionList";
  @SerializedName(SERIALIZED_NAME_CONDITION_LIST)
  private List<String> conditionList = null;

  public V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner() { 
  }

  public V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner typeCode(BigDecimal typeCode) {
    
    this.typeCode = typeCode;
    return this;
  }

   /**
   * Get typeCode
   * @return typeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "36", value = "")

  public BigDecimal getTypeCode() {
    return typeCode;
  }


  public void setTypeCode(BigDecimal typeCode) {
    this.typeCode = typeCode;
  }


  public V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner percent(BigDecimal percent) {
    
    this.percent = percent;
    return this;
  }

   /**
   * Get percent
   * @return percent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19", value = "")

  public BigDecimal getPercent() {
    return percent;
  }


  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }


  public V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner chargeType(String chargeType) {
    
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "included", value = "")

  public String getChargeType() {
    return chargeType;
  }


  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }


  public V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner chargeFrequencyCode(BigDecimal chargeFrequencyCode) {
    
    this.chargeFrequencyCode = chargeFrequencyCode;
    return this;
  }

   /**
   * Get chargeFrequencyCode
   * @return chargeFrequencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "")

  public BigDecimal getChargeFrequencyCode() {
    return chargeFrequencyCode;
  }


  public void setChargeFrequencyCode(BigDecimal chargeFrequencyCode) {
    this.chargeFrequencyCode = chargeFrequencyCode;
  }


  public V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner currencyCode(String currencyCode) {
    
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


  public V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner conditionList(List<String> conditionList) {
    
    this.conditionList = conditionList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner addConditionListItem(String conditionListItem) {
    if (this.conditionList == null) {
      this.conditionList = new ArrayList<>();
    }
    this.conditionList.add(conditionListItem);
    return this;
  }

   /**
   * Get conditionList
   * @return conditionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getConditionList() {
    return conditionList;
  }


  public void setConditionList(List<String> conditionList) {
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
    V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner v1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner = (V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner) o;
    return Objects.equals(this.typeCode, v1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner.typeCode) &&
        Objects.equals(this.percent, v1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner.percent) &&
        Objects.equals(this.chargeType, v1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner.chargeType) &&
        Objects.equals(this.chargeFrequencyCode, v1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner.chargeFrequencyCode) &&
        Objects.equals(this.currencyCode, v1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner.currencyCode) &&
        Objects.equals(this.conditionList, v1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner.conditionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeCode, percent, chargeType, chargeFrequencyCode, currencyCode, conditionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner {\n");
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
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner is not found in the empty JSON string", V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("chargeType") != null && !jsonObj.get("chargeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargeType").toString()));
      }
      if (jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("conditionList") != null && !jsonObj.get("conditionList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `conditionList` to be an array in the JSON string but got `%s`", jsonObj.get("conditionList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner
  */
  public static V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


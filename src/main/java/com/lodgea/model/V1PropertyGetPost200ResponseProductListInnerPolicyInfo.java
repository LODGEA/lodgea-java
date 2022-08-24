/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://lodgea.redoc.ly for more information.
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
import com.lodgea.model.V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner;
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
 * V1PropertyGetPost200ResponseProductListInnerPolicyInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-24T11:37:52.194432653Z[Etc/UTC]")
public class V1PropertyGetPost200ResponseProductListInnerPolicyInfo {
  public static final String SERIALIZED_NAME_CHECK_IN_TIME = "checkInTime";
  @SerializedName(SERIALIZED_NAME_CHECK_IN_TIME)
  private BigDecimal checkInTime;

  public static final String SERIALIZED_NAME_CHECK_OUT_TIME = "checkOutTime";
  @SerializedName(SERIALIZED_NAME_CHECK_OUT_TIME)
  private BigDecimal checkOutTime;

  public static final String SERIALIZED_NAME_TOTAL_GUEST_COUNT = "totalGuestCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_GUEST_COUNT)
  private BigDecimal totalGuestCount;

  public static final String SERIALIZED_NAME_CANCELLATION_POLICY_LIST = "cancellationPolicyList";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_POLICY_LIST)
  private List<V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner> cancellationPolicyList = null;

  public static final String SERIALIZED_NAME_ADVANCE_BOOKING_MIN = "advanceBookingMin";
  @SerializedName(SERIALIZED_NAME_ADVANCE_BOOKING_MIN)
  private BigDecimal advanceBookingMin;

  public static final String SERIALIZED_NAME_ADVANCE_BOOKING_MAX = "advanceBookingMax";
  @SerializedName(SERIALIZED_NAME_ADVANCE_BOOKING_MAX)
  private BigDecimal advanceBookingMax;

  public static final String SERIALIZED_NAME_PETS_POLICY = "petsPolicy";
  @SerializedName(SERIALIZED_NAME_PETS_POLICY)
  private V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy petsPolicy;

  public static final String SERIALIZED_NAME_PREPAYMENT_POLICY = "prepaymentPolicy";
  @SerializedName(SERIALIZED_NAME_PREPAYMENT_POLICY)
  private String prepaymentPolicy;

  public static final String SERIALIZED_NAME_GUARANTEE_POLICY = "guaranteePolicy";
  @SerializedName(SERIALIZED_NAME_GUARANTEE_POLICY)
  private String guaranteePolicy;

  public static final String SERIALIZED_NAME_TAX_POLICY_LIST = "taxPolicyList";
  @SerializedName(SERIALIZED_NAME_TAX_POLICY_LIST)
  private List<V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner> taxPolicyList = null;

  public static final String SERIALIZED_NAME_FEE_POLICY_LIST = "feePolicyList";
  @SerializedName(SERIALIZED_NAME_FEE_POLICY_LIST)
  private List<String> feePolicyList = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo() { 
  }

  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo checkInTime(BigDecimal checkInTime) {
    
    this.checkInTime = checkInTime;
    return this;
  }

   /**
   * Get checkInTime
   * @return checkInTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50400000", value = "")

  public BigDecimal getCheckInTime() {
    return checkInTime;
  }


  public void setCheckInTime(BigDecimal checkInTime) {
    this.checkInTime = checkInTime;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo checkOutTime(BigDecimal checkOutTime) {
    
    this.checkOutTime = checkOutTime;
    return this;
  }

   /**
   * Get checkOutTime
   * @return checkOutTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "39600000", value = "")

  public BigDecimal getCheckOutTime() {
    return checkOutTime;
  }


  public void setCheckOutTime(BigDecimal checkOutTime) {
    this.checkOutTime = checkOutTime;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo totalGuestCount(BigDecimal totalGuestCount) {
    
    this.totalGuestCount = totalGuestCount;
    return this;
  }

   /**
   * Get totalGuestCount
   * @return totalGuestCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public BigDecimal getTotalGuestCount() {
    return totalGuestCount;
  }


  public void setTotalGuestCount(BigDecimal totalGuestCount) {
    this.totalGuestCount = totalGuestCount;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo cancellationPolicyList(List<V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner> cancellationPolicyList) {
    
    this.cancellationPolicyList = cancellationPolicyList;
    return this;
  }

  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo addCancellationPolicyListItem(V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner cancellationPolicyListItem) {
    if (this.cancellationPolicyList == null) {
      this.cancellationPolicyList = new ArrayList<>();
    }
    this.cancellationPolicyList.add(cancellationPolicyListItem);
    return this;
  }

   /**
   * Get cancellationPolicyList
   * @return cancellationPolicyList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner> getCancellationPolicyList() {
    return cancellationPolicyList;
  }


  public void setCancellationPolicyList(List<V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner> cancellationPolicyList) {
    this.cancellationPolicyList = cancellationPolicyList;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo advanceBookingMin(BigDecimal advanceBookingMin) {
    
    this.advanceBookingMin = advanceBookingMin;
    return this;
  }

   /**
   * Get advanceBookingMin
   * @return advanceBookingMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "34560000", value = "")

  public BigDecimal getAdvanceBookingMin() {
    return advanceBookingMin;
  }


  public void setAdvanceBookingMin(BigDecimal advanceBookingMin) {
    this.advanceBookingMin = advanceBookingMin;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo advanceBookingMax(BigDecimal advanceBookingMax) {
    
    this.advanceBookingMax = advanceBookingMax;
    return this;
  }

   /**
   * Get advanceBookingMax
   * @return advanceBookingMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public BigDecimal getAdvanceBookingMax() {
    return advanceBookingMax;
  }


  public void setAdvanceBookingMax(BigDecimal advanceBookingMax) {
    this.advanceBookingMax = advanceBookingMax;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo petsPolicy(V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy petsPolicy) {
    
    this.petsPolicy = petsPolicy;
    return this;
  }

   /**
   * Get petsPolicy
   * @return petsPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy getPetsPolicy() {
    return petsPolicy;
  }


  public void setPetsPolicy(V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy petsPolicy) {
    this.petsPolicy = petsPolicy;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo prepaymentPolicy(String prepaymentPolicy) {
    
    this.prepaymentPolicy = prepaymentPolicy;
    return this;
  }

   /**
   * Get prepaymentPolicy
   * @return prepaymentPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrepaymentPolicy() {
    return prepaymentPolicy;
  }


  public void setPrepaymentPolicy(String prepaymentPolicy) {
    this.prepaymentPolicy = prepaymentPolicy;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo guaranteePolicy(String guaranteePolicy) {
    
    this.guaranteePolicy = guaranteePolicy;
    return this;
  }

   /**
   * Get guaranteePolicy
   * @return guaranteePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuaranteePolicy() {
    return guaranteePolicy;
  }


  public void setGuaranteePolicy(String guaranteePolicy) {
    this.guaranteePolicy = guaranteePolicy;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo taxPolicyList(List<V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner> taxPolicyList) {
    
    this.taxPolicyList = taxPolicyList;
    return this;
  }

  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo addTaxPolicyListItem(V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner taxPolicyListItem) {
    if (this.taxPolicyList == null) {
      this.taxPolicyList = new ArrayList<>();
    }
    this.taxPolicyList.add(taxPolicyListItem);
    return this;
  }

   /**
   * Get taxPolicyList
   * @return taxPolicyList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner> getTaxPolicyList() {
    return taxPolicyList;
  }


  public void setTaxPolicyList(List<V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner> taxPolicyList) {
    this.taxPolicyList = taxPolicyList;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo feePolicyList(List<String> feePolicyList) {
    
    this.feePolicyList = feePolicyList;
    return this;
  }

  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo addFeePolicyListItem(String feePolicyListItem) {
    if (this.feePolicyList == null) {
      this.feePolicyList = new ArrayList<>();
    }
    this.feePolicyList.add(feePolicyListItem);
    return this;
  }

   /**
   * Get feePolicyList
   * @return feePolicyList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFeePolicyList() {
    return feePolicyList;
  }


  public void setFeePolicyList(List<String> feePolicyList) {
    this.feePolicyList = feePolicyList;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Standard Amrum Policy", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponseProductListInnerPolicyInfo v1PropertyGetPost200ResponseProductListInnerPolicyInfo = (V1PropertyGetPost200ResponseProductListInnerPolicyInfo) o;
    return Objects.equals(this.checkInTime, v1PropertyGetPost200ResponseProductListInnerPolicyInfo.checkInTime) &&
        Objects.equals(this.checkOutTime, v1PropertyGetPost200ResponseProductListInnerPolicyInfo.checkOutTime) &&
        Objects.equals(this.totalGuestCount, v1PropertyGetPost200ResponseProductListInnerPolicyInfo.totalGuestCount) &&
        Objects.equals(this.cancellationPolicyList, v1PropertyGetPost200ResponseProductListInnerPolicyInfo.cancellationPolicyList) &&
        Objects.equals(this.advanceBookingMin, v1PropertyGetPost200ResponseProductListInnerPolicyInfo.advanceBookingMin) &&
        Objects.equals(this.advanceBookingMax, v1PropertyGetPost200ResponseProductListInnerPolicyInfo.advanceBookingMax) &&
        Objects.equals(this.petsPolicy, v1PropertyGetPost200ResponseProductListInnerPolicyInfo.petsPolicy) &&
        Objects.equals(this.prepaymentPolicy, v1PropertyGetPost200ResponseProductListInnerPolicyInfo.prepaymentPolicy) &&
        Objects.equals(this.guaranteePolicy, v1PropertyGetPost200ResponseProductListInnerPolicyInfo.guaranteePolicy) &&
        Objects.equals(this.taxPolicyList, v1PropertyGetPost200ResponseProductListInnerPolicyInfo.taxPolicyList) &&
        Objects.equals(this.feePolicyList, v1PropertyGetPost200ResponseProductListInnerPolicyInfo.feePolicyList) &&
        Objects.equals(this.name, v1PropertyGetPost200ResponseProductListInnerPolicyInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkInTime, checkOutTime, totalGuestCount, cancellationPolicyList, advanceBookingMin, advanceBookingMax, petsPolicy, prepaymentPolicy, guaranteePolicy, taxPolicyList, feePolicyList, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponseProductListInnerPolicyInfo {\n");
    sb.append("    checkInTime: ").append(toIndentedString(checkInTime)).append("\n");
    sb.append("    checkOutTime: ").append(toIndentedString(checkOutTime)).append("\n");
    sb.append("    totalGuestCount: ").append(toIndentedString(totalGuestCount)).append("\n");
    sb.append("    cancellationPolicyList: ").append(toIndentedString(cancellationPolicyList)).append("\n");
    sb.append("    advanceBookingMin: ").append(toIndentedString(advanceBookingMin)).append("\n");
    sb.append("    advanceBookingMax: ").append(toIndentedString(advanceBookingMax)).append("\n");
    sb.append("    petsPolicy: ").append(toIndentedString(petsPolicy)).append("\n");
    sb.append("    prepaymentPolicy: ").append(toIndentedString(prepaymentPolicy)).append("\n");
    sb.append("    guaranteePolicy: ").append(toIndentedString(guaranteePolicy)).append("\n");
    sb.append("    taxPolicyList: ").append(toIndentedString(taxPolicyList)).append("\n");
    sb.append("    feePolicyList: ").append(toIndentedString(feePolicyList)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("checkInTime");
    openapiFields.add("checkOutTime");
    openapiFields.add("totalGuestCount");
    openapiFields.add("cancellationPolicyList");
    openapiFields.add("advanceBookingMin");
    openapiFields.add("advanceBookingMax");
    openapiFields.add("petsPolicy");
    openapiFields.add("prepaymentPolicy");
    openapiFields.add("guaranteePolicy");
    openapiFields.add("taxPolicyList");
    openapiFields.add("feePolicyList");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponseProductListInnerPolicyInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponseProductListInnerPolicyInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponseProductListInnerPolicyInfo is not found in the empty JSON string", V1PropertyGetPost200ResponseProductListInnerPolicyInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponseProductListInnerPolicyInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponseProductListInnerPolicyInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraycancellationPolicyList = jsonObj.getAsJsonArray("cancellationPolicyList");
      if (jsonArraycancellationPolicyList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("cancellationPolicyList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `cancellationPolicyList` to be an array in the JSON string but got `%s`", jsonObj.get("cancellationPolicyList").toString()));
        }

        // validate the optional field `cancellationPolicyList` (array)
        for (int i = 0; i < jsonArraycancellationPolicyList.size(); i++) {
          V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.validateJsonObject(jsonArraycancellationPolicyList.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `petsPolicy`
      if (jsonObj.getAsJsonObject("petsPolicy") != null) {
        V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy.validateJsonObject(jsonObj.getAsJsonObject("petsPolicy"));
      }
      if (jsonObj.get("prepaymentPolicy") != null && !jsonObj.get("prepaymentPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prepaymentPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prepaymentPolicy").toString()));
      }
      if (jsonObj.get("guaranteePolicy") != null && !jsonObj.get("guaranteePolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guaranteePolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guaranteePolicy").toString()));
      }
      JsonArray jsonArraytaxPolicyList = jsonObj.getAsJsonArray("taxPolicyList");
      if (jsonArraytaxPolicyList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("taxPolicyList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `taxPolicyList` to be an array in the JSON string but got `%s`", jsonObj.get("taxPolicyList").toString()));
        }

        // validate the optional field `taxPolicyList` (array)
        for (int i = 0; i < jsonArraytaxPolicyList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyPolicyListInnerTaxPolicyListInner.validateJsonObject(jsonArraytaxPolicyList.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("feePolicyList") != null && !jsonObj.get("feePolicyList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `feePolicyList` to be an array in the JSON string but got `%s`", jsonObj.get("feePolicyList").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponseProductListInnerPolicyInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponseProductListInnerPolicyInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponseProductListInnerPolicyInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponseProductListInnerPolicyInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponseProductListInnerPolicyInfo>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponseProductListInnerPolicyInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponseProductListInnerPolicyInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponseProductListInnerPolicyInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponseProductListInnerPolicyInfo
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponseProductListInnerPolicyInfo
  */
  public static V1PropertyGetPost200ResponseProductListInnerPolicyInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponseProductListInnerPolicyInfo.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponseProductListInnerPolicyInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


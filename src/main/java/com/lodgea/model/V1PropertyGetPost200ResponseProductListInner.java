/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.0.2
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
import com.lodgea.model.V1PropertyGetPost200ResponseProductListInnerMealPlanListInner;
import com.lodgea.model.V1PropertyGetPost200ResponseProductListInnerPolicyInfo;
import com.lodgea.model.V1PropertyGetPost200ResponseProductListInnerRatePlanListInner;
import com.lodgea.model.V1PropertyGetPost200ResponseProductListInnerRoomTypeListInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * V1PropertyGetPost200ResponseProductListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-08T10:01:38.583514510Z[Etc/UTC]")
public class V1PropertyGetPost200ResponseProductListInner {
  public static final String SERIALIZED_NAME_PROPERTY_ID = "propertyId";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private String propertyId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MEAL_PLAN_LIST = "mealPlanList";
  @SerializedName(SERIALIZED_NAME_MEAL_PLAN_LIST)
  private List<V1PropertyGetPost200ResponseProductListInnerMealPlanListInner> mealPlanList = null;

  public static final String SERIALIZED_NAME_ROOM_TYPE_LIST = "roomTypeList";
  @SerializedName(SERIALIZED_NAME_ROOM_TYPE_LIST)
  private List<V1PropertyGetPost200ResponseProductListInnerRoomTypeListInner> roomTypeList = null;

  public static final String SERIALIZED_NAME_IS_L_O_S_PRICING = "isLOSPricing";
  @SerializedName(SERIALIZED_NAME_IS_L_O_S_PRICING)
  private Boolean isLOSPricing;

  public static final String SERIALIZED_NAME_IS_O_B_P_PRICING = "isOBPPricing";
  @SerializedName(SERIALIZED_NAME_IS_O_B_P_PRICING)
  private Boolean isOBPPricing;

  public static final String SERIALIZED_NAME_RATE_PLAN_LIST = "ratePlanList";
  @SerializedName(SERIALIZED_NAME_RATE_PLAN_LIST)
  private List<V1PropertyGetPost200ResponseProductListInnerRatePlanListInner> ratePlanList = null;

  public static final String SERIALIZED_NAME_POLICY_INFO = "policyInfo";
  @SerializedName(SERIALIZED_NAME_POLICY_INFO)
  private V1PropertyGetPost200ResponseProductListInnerPolicyInfo policyInfo;

  public V1PropertyGetPost200ResponseProductListInner() { 
  }

  public V1PropertyGetPost200ResponseProductListInner propertyId(String propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Get propertyId
   * @return propertyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "strandresidenz-sylt", value = "")

  public String getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(String propertyId) {
    this.propertyId = propertyId;
  }


  public V1PropertyGetPost200ResponseProductListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Standard Amrum", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1PropertyGetPost200ResponseProductListInner mealPlanList(List<V1PropertyGetPost200ResponseProductListInnerMealPlanListInner> mealPlanList) {
    
    this.mealPlanList = mealPlanList;
    return this;
  }

  public V1PropertyGetPost200ResponseProductListInner addMealPlanListItem(V1PropertyGetPost200ResponseProductListInnerMealPlanListInner mealPlanListItem) {
    if (this.mealPlanList == null) {
      this.mealPlanList = new ArrayList<>();
    }
    this.mealPlanList.add(mealPlanListItem);
    return this;
  }

   /**
   * Get mealPlanList
   * @return mealPlanList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponseProductListInnerMealPlanListInner> getMealPlanList() {
    return mealPlanList;
  }


  public void setMealPlanList(List<V1PropertyGetPost200ResponseProductListInnerMealPlanListInner> mealPlanList) {
    this.mealPlanList = mealPlanList;
  }


  public V1PropertyGetPost200ResponseProductListInner roomTypeList(List<V1PropertyGetPost200ResponseProductListInnerRoomTypeListInner> roomTypeList) {
    
    this.roomTypeList = roomTypeList;
    return this;
  }

  public V1PropertyGetPost200ResponseProductListInner addRoomTypeListItem(V1PropertyGetPost200ResponseProductListInnerRoomTypeListInner roomTypeListItem) {
    if (this.roomTypeList == null) {
      this.roomTypeList = new ArrayList<>();
    }
    this.roomTypeList.add(roomTypeListItem);
    return this;
  }

   /**
   * Get roomTypeList
   * @return roomTypeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponseProductListInnerRoomTypeListInner> getRoomTypeList() {
    return roomTypeList;
  }


  public void setRoomTypeList(List<V1PropertyGetPost200ResponseProductListInnerRoomTypeListInner> roomTypeList) {
    this.roomTypeList = roomTypeList;
  }


  public V1PropertyGetPost200ResponseProductListInner isLOSPricing(Boolean isLOSPricing) {
    
    this.isLOSPricing = isLOSPricing;
    return this;
  }

   /**
   * Get isLOSPricing
   * @return isLOSPricing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsLOSPricing() {
    return isLOSPricing;
  }


  public void setIsLOSPricing(Boolean isLOSPricing) {
    this.isLOSPricing = isLOSPricing;
  }


  public V1PropertyGetPost200ResponseProductListInner isOBPPricing(Boolean isOBPPricing) {
    
    this.isOBPPricing = isOBPPricing;
    return this;
  }

   /**
   * Get isOBPPricing
   * @return isOBPPricing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOBPPricing() {
    return isOBPPricing;
  }


  public void setIsOBPPricing(Boolean isOBPPricing) {
    this.isOBPPricing = isOBPPricing;
  }


  public V1PropertyGetPost200ResponseProductListInner ratePlanList(List<V1PropertyGetPost200ResponseProductListInnerRatePlanListInner> ratePlanList) {
    
    this.ratePlanList = ratePlanList;
    return this;
  }

  public V1PropertyGetPost200ResponseProductListInner addRatePlanListItem(V1PropertyGetPost200ResponseProductListInnerRatePlanListInner ratePlanListItem) {
    if (this.ratePlanList == null) {
      this.ratePlanList = new ArrayList<>();
    }
    this.ratePlanList.add(ratePlanListItem);
    return this;
  }

   /**
   * Get ratePlanList
   * @return ratePlanList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponseProductListInnerRatePlanListInner> getRatePlanList() {
    return ratePlanList;
  }


  public void setRatePlanList(List<V1PropertyGetPost200ResponseProductListInnerRatePlanListInner> ratePlanList) {
    this.ratePlanList = ratePlanList;
  }


  public V1PropertyGetPost200ResponseProductListInner policyInfo(V1PropertyGetPost200ResponseProductListInnerPolicyInfo policyInfo) {
    
    this.policyInfo = policyInfo;
    return this;
  }

   /**
   * Get policyInfo
   * @return policyInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponseProductListInnerPolicyInfo getPolicyInfo() {
    return policyInfo;
  }


  public void setPolicyInfo(V1PropertyGetPost200ResponseProductListInnerPolicyInfo policyInfo) {
    this.policyInfo = policyInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponseProductListInner v1PropertyGetPost200ResponseProductListInner = (V1PropertyGetPost200ResponseProductListInner) o;
    return Objects.equals(this.propertyId, v1PropertyGetPost200ResponseProductListInner.propertyId) &&
        Objects.equals(this.name, v1PropertyGetPost200ResponseProductListInner.name) &&
        Objects.equals(this.mealPlanList, v1PropertyGetPost200ResponseProductListInner.mealPlanList) &&
        Objects.equals(this.roomTypeList, v1PropertyGetPost200ResponseProductListInner.roomTypeList) &&
        Objects.equals(this.isLOSPricing, v1PropertyGetPost200ResponseProductListInner.isLOSPricing) &&
        Objects.equals(this.isOBPPricing, v1PropertyGetPost200ResponseProductListInner.isOBPPricing) &&
        Objects.equals(this.ratePlanList, v1PropertyGetPost200ResponseProductListInner.ratePlanList) &&
        Objects.equals(this.policyInfo, v1PropertyGetPost200ResponseProductListInner.policyInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyId, name, mealPlanList, roomTypeList, isLOSPricing, isOBPPricing, ratePlanList, policyInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponseProductListInner {\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mealPlanList: ").append(toIndentedString(mealPlanList)).append("\n");
    sb.append("    roomTypeList: ").append(toIndentedString(roomTypeList)).append("\n");
    sb.append("    isLOSPricing: ").append(toIndentedString(isLOSPricing)).append("\n");
    sb.append("    isOBPPricing: ").append(toIndentedString(isOBPPricing)).append("\n");
    sb.append("    ratePlanList: ").append(toIndentedString(ratePlanList)).append("\n");
    sb.append("    policyInfo: ").append(toIndentedString(policyInfo)).append("\n");
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
    openapiFields.add("propertyId");
    openapiFields.add("name");
    openapiFields.add("mealPlanList");
    openapiFields.add("roomTypeList");
    openapiFields.add("isLOSPricing");
    openapiFields.add("isOBPPricing");
    openapiFields.add("ratePlanList");
    openapiFields.add("policyInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponseProductListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponseProductListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponseProductListInner is not found in the empty JSON string", V1PropertyGetPost200ResponseProductListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponseProductListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponseProductListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("propertyId") != null && !jsonObj.get("propertyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propertyId").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      JsonArray jsonArraymealPlanList = jsonObj.getAsJsonArray("mealPlanList");
      if (jsonArraymealPlanList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("mealPlanList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `mealPlanList` to be an array in the JSON string but got `%s`", jsonObj.get("mealPlanList").toString()));
        }

        // validate the optional field `mealPlanList` (array)
        for (int i = 0; i < jsonArraymealPlanList.size(); i++) {
          V1PropertyGetPost200ResponseProductListInnerMealPlanListInner.validateJsonObject(jsonArraymealPlanList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayroomTypeList = jsonObj.getAsJsonArray("roomTypeList");
      if (jsonArrayroomTypeList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("roomTypeList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `roomTypeList` to be an array in the JSON string but got `%s`", jsonObj.get("roomTypeList").toString()));
        }

        // validate the optional field `roomTypeList` (array)
        for (int i = 0; i < jsonArrayroomTypeList.size(); i++) {
          V1PropertyGetPost200ResponseProductListInnerRoomTypeListInner.validateJsonObject(jsonArrayroomTypeList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayratePlanList = jsonObj.getAsJsonArray("ratePlanList");
      if (jsonArrayratePlanList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ratePlanList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ratePlanList` to be an array in the JSON string but got `%s`", jsonObj.get("ratePlanList").toString()));
        }

        // validate the optional field `ratePlanList` (array)
        for (int i = 0; i < jsonArrayratePlanList.size(); i++) {
          V1PropertyGetPost200ResponseProductListInnerRatePlanListInner.validateJsonObject(jsonArrayratePlanList.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `policyInfo`
      if (jsonObj.getAsJsonObject("policyInfo") != null) {
        V1PropertyGetPost200ResponseProductListInnerPolicyInfo.validateJsonObject(jsonObj.getAsJsonObject("policyInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponseProductListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponseProductListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponseProductListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponseProductListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponseProductListInner>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponseProductListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponseProductListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponseProductListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponseProductListInner
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponseProductListInner
  */
  public static V1PropertyGetPost200ResponseProductListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponseProductListInner.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponseProductListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


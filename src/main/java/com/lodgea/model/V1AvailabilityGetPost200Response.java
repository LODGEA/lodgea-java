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
import com.lodgea.model.V1AvailabilityGetPost200ResponseRatePlanListInner;
import com.lodgea.model.V1AvailabilityGetPost200ResponseRoomTypeListInner;
import com.lodgea.model.V1PropertyGetPost200ResponseProductListInnerMealPlanListInner;
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
 * V1AvailabilityGetPost200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-08T10:01:38.583514510Z[Etc/UTC]")
public class V1AvailabilityGetPost200Response {
  public static final String SERIALIZED_NAME_RATE_PLAN_LIST = "ratePlanList";
  @SerializedName(SERIALIZED_NAME_RATE_PLAN_LIST)
  private List<V1AvailabilityGetPost200ResponseRatePlanListInner> ratePlanList = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MEAL_PLAN_LIST = "mealPlanList";
  @SerializedName(SERIALIZED_NAME_MEAL_PLAN_LIST)
  private List<V1PropertyGetPost200ResponseProductListInnerMealPlanListInner> mealPlanList = null;

  public static final String SERIALIZED_NAME_ROOM_TYPE_LIST = "roomTypeList";
  @SerializedName(SERIALIZED_NAME_ROOM_TYPE_LIST)
  private List<V1AvailabilityGetPost200ResponseRoomTypeListInner> roomTypeList = null;

  public V1AvailabilityGetPost200Response() { 
  }

  public V1AvailabilityGetPost200Response ratePlanList(List<V1AvailabilityGetPost200ResponseRatePlanListInner> ratePlanList) {
    
    this.ratePlanList = ratePlanList;
    return this;
  }

  public V1AvailabilityGetPost200Response addRatePlanListItem(V1AvailabilityGetPost200ResponseRatePlanListInner ratePlanListItem) {
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

  public List<V1AvailabilityGetPost200ResponseRatePlanListInner> getRatePlanList() {
    return ratePlanList;
  }


  public void setRatePlanList(List<V1AvailabilityGetPost200ResponseRatePlanListInner> ratePlanList) {
    this.ratePlanList = ratePlanList;
  }


  public V1AvailabilityGetPost200Response name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Standard", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1AvailabilityGetPost200Response mealPlanList(List<V1PropertyGetPost200ResponseProductListInnerMealPlanListInner> mealPlanList) {
    
    this.mealPlanList = mealPlanList;
    return this;
  }

  public V1AvailabilityGetPost200Response addMealPlanListItem(V1PropertyGetPost200ResponseProductListInnerMealPlanListInner mealPlanListItem) {
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


  public V1AvailabilityGetPost200Response roomTypeList(List<V1AvailabilityGetPost200ResponseRoomTypeListInner> roomTypeList) {
    
    this.roomTypeList = roomTypeList;
    return this;
  }

  public V1AvailabilityGetPost200Response addRoomTypeListItem(V1AvailabilityGetPost200ResponseRoomTypeListInner roomTypeListItem) {
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

  public List<V1AvailabilityGetPost200ResponseRoomTypeListInner> getRoomTypeList() {
    return roomTypeList;
  }


  public void setRoomTypeList(List<V1AvailabilityGetPost200ResponseRoomTypeListInner> roomTypeList) {
    this.roomTypeList = roomTypeList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AvailabilityGetPost200Response v1AvailabilityGetPost200Response = (V1AvailabilityGetPost200Response) o;
    return Objects.equals(this.ratePlanList, v1AvailabilityGetPost200Response.ratePlanList) &&
        Objects.equals(this.name, v1AvailabilityGetPost200Response.name) &&
        Objects.equals(this.mealPlanList, v1AvailabilityGetPost200Response.mealPlanList) &&
        Objects.equals(this.roomTypeList, v1AvailabilityGetPost200Response.roomTypeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratePlanList, name, mealPlanList, roomTypeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AvailabilityGetPost200Response {\n");
    sb.append("    ratePlanList: ").append(toIndentedString(ratePlanList)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mealPlanList: ").append(toIndentedString(mealPlanList)).append("\n");
    sb.append("    roomTypeList: ").append(toIndentedString(roomTypeList)).append("\n");
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
    openapiFields.add("ratePlanList");
    openapiFields.add("name");
    openapiFields.add("mealPlanList");
    openapiFields.add("roomTypeList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1AvailabilityGetPost200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1AvailabilityGetPost200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AvailabilityGetPost200Response is not found in the empty JSON string", V1AvailabilityGetPost200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1AvailabilityGetPost200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AvailabilityGetPost200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayratePlanList = jsonObj.getAsJsonArray("ratePlanList");
      if (jsonArrayratePlanList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ratePlanList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ratePlanList` to be an array in the JSON string but got `%s`", jsonObj.get("ratePlanList").toString()));
        }

        // validate the optional field `ratePlanList` (array)
        for (int i = 0; i < jsonArrayratePlanList.size(); i++) {
          V1AvailabilityGetPost200ResponseRatePlanListInner.validateJsonObject(jsonArrayratePlanList.get(i).getAsJsonObject());
        };
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
          V1AvailabilityGetPost200ResponseRoomTypeListInner.validateJsonObject(jsonArrayroomTypeList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AvailabilityGetPost200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AvailabilityGetPost200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AvailabilityGetPost200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AvailabilityGetPost200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AvailabilityGetPost200Response>() {
           @Override
           public void write(JsonWriter out, V1AvailabilityGetPost200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AvailabilityGetPost200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1AvailabilityGetPost200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1AvailabilityGetPost200Response
  * @throws IOException if the JSON string is invalid with respect to V1AvailabilityGetPost200Response
  */
  public static V1AvailabilityGetPost200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AvailabilityGetPost200Response.class);
  }

 /**
  * Convert an instance of V1AvailabilityGetPost200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

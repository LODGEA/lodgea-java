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
import com.lodgea.model.PropertiesPropertyIdGet200ResponseProductListInnerRatePlanListInner;
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
 * PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner {
  public static final String SERIALIZED_NAME_RATE_PLAN_LIST = "ratePlanList";
  @SerializedName(SERIALIZED_NAME_RATE_PLAN_LIST)
  private List<PropertiesPropertyIdGet200ResponseProductListInnerRatePlanListInner> ratePlanList = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets mealPlanList
   */
  @JsonAdapter(MealPlanListEnum.Adapter.class)
  public enum MealPlanListEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1")),
    
    NUMBER_2(new BigDecimal("2")),
    
    NUMBER_3(new BigDecimal("3")),
    
    NUMBER_4(new BigDecimal("4")),
    
    NUMBER_5(new BigDecimal("5")),
    
    NUMBER_6(new BigDecimal("6")),
    
    NUMBER_7(new BigDecimal("7")),
    
    NUMBER_8(new BigDecimal("8")),
    
    NUMBER_9(new BigDecimal("9")),
    
    NUMBER_10(new BigDecimal("10")),
    
    NUMBER_11(new BigDecimal("11")),
    
    NUMBER_12(new BigDecimal("12")),
    
    NUMBER_14(new BigDecimal("14")),
    
    NUMBER_15(new BigDecimal("15")),
    
    NUMBER_16(new BigDecimal("16")),
    
    NUMBER_17(new BigDecimal("17")),
    
    NUMBER_18(new BigDecimal("18")),
    
    NUMBER_19(new BigDecimal("19")),
    
    NUMBER_20(new BigDecimal("20")),
    
    NUMBER_21(new BigDecimal("21")),
    
    NUMBER_22(new BigDecimal("22")),
    
    NUMBER_23(new BigDecimal("23")),
    
    NUMBER_24(new BigDecimal("24")),
    
    NUMBER_90001(new BigDecimal("90001"));

    private BigDecimal value;

    MealPlanListEnum(BigDecimal value) {
      this.value = value;
    }

    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MealPlanListEnum fromValue(BigDecimal value) {
      for (MealPlanListEnum b : MealPlanListEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MealPlanListEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MealPlanListEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MealPlanListEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MealPlanListEnum.fromValue(new BigDecimal(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_MEAL_PLAN_LIST = "mealPlanList";
  @SerializedName(SERIALIZED_NAME_MEAL_PLAN_LIST)
  private List<MealPlanListEnum> mealPlanList = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROOM_TYPE_LIST = "roomTypeList";
  @SerializedName(SERIALIZED_NAME_ROOM_TYPE_LIST)
  private List<String> roomTypeList = new ArrayList<>();

  public PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner() {
  }

  public PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner ratePlanList(List<PropertiesPropertyIdGet200ResponseProductListInnerRatePlanListInner> ratePlanList) {
    
    this.ratePlanList = ratePlanList;
    return this;
  }

  public PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner addRatePlanListItem(PropertiesPropertyIdGet200ResponseProductListInnerRatePlanListInner ratePlanListItem) {
    this.ratePlanList.add(ratePlanListItem);
    return this;
  }

   /**
   * A list of available rate plans.
   * @return ratePlanList
  **/
  @javax.annotation.Nonnull

  public List<PropertiesPropertyIdGet200ResponseProductListInnerRatePlanListInner> getRatePlanList() {
    return ratePlanList;
  }


  public void setRatePlanList(List<PropertiesPropertyIdGet200ResponseProductListInnerRatePlanListInner> ratePlanList) {
    this.ratePlanList = ratePlanList;
  }


  public PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the rate plan group.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner mealPlanList(List<MealPlanListEnum> mealPlanList) {
    
    this.mealPlanList = mealPlanList;
    return this;
  }

  public PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner addMealPlanListItem(MealPlanListEnum mealPlanListItem) {
    this.mealPlanList.add(mealPlanListItem);
    return this;
  }

   /**
   * The available meal plans.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#mealplan-type-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   * @return mealPlanList
  **/
  @javax.annotation.Nonnull

  public List<MealPlanListEnum> getMealPlanList() {
    return mealPlanList;
  }


  public void setMealPlanList(List<MealPlanListEnum> mealPlanList) {
    this.mealPlanList = mealPlanList;
  }


  public PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner roomTypeList(List<String> roomTypeList) {
    
    this.roomTypeList = roomTypeList;
    return this;
  }

  public PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner addRoomTypeListItem(String roomTypeListItem) {
    this.roomTypeList.add(roomTypeListItem);
    return this;
  }

   /**
   * The rooms this availability is for.
   * @return roomTypeList
  **/
  @javax.annotation.Nonnull

  public List<String> getRoomTypeList() {
    return roomTypeList;
  }


  public void setRoomTypeList(List<String> roomTypeList) {
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
    PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner propertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner = (PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner) o;
    return Objects.equals(this.ratePlanList, propertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner.ratePlanList) &&
        Objects.equals(this.name, propertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner.name) &&
        Objects.equals(this.mealPlanList, propertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner.mealPlanList) &&
        Objects.equals(this.roomTypeList, propertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner.roomTypeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratePlanList, name, mealPlanList, roomTypeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner {\n");
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
    openapiRequiredFields.add("ratePlanList");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("mealPlanList");
    openapiRequiredFields.add("roomTypeList");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner is not found in the empty JSON string", PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("ratePlanList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ratePlanList` to be an array in the JSON string but got `%s`", jsonObj.get("ratePlanList").toString()));
      }

      JsonArray jsonArrayratePlanList = jsonObj.getAsJsonArray("ratePlanList");
      // validate the required field `ratePlanList` (array)
      for (int i = 0; i < jsonArrayratePlanList.size(); i++) {
        PropertiesPropertyIdGet200ResponseProductListInnerRatePlanListInner.validateJsonObject(jsonArrayratePlanList.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("mealPlanList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("mealPlanList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mealPlanList` to be an array in the JSON string but got `%s`", jsonObj.get("mealPlanList").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("roomTypeList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("roomTypeList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roomTypeList` to be an array in the JSON string but got `%s`", jsonObj.get("roomTypeList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner>() {
           @Override
           public void write(JsonWriter out, PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner
  * @throws IOException if the JSON string is invalid with respect to PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner
  */
  public static PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner.class);
  }

 /**
  * Convert an instance of PropertiesPropertyIdAvailabilityGet200ResponseAvailabilityListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


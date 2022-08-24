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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
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
 * AvailabilitySearch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-24T11:46:35.796667073Z[Etc/UTC]")
public class AvailabilitySearch {
  public static final String SERIALIZED_NAME_ADULT_COUNT = "adultCount";
  @SerializedName(SERIALIZED_NAME_ADULT_COUNT)
  private BigDecimal adultCount;

  public static final String SERIALIZED_NAME_CHILD_COUNT = "childCount";
  @SerializedName(SERIALIZED_NAME_CHILD_COUNT)
  private BigDecimal childCount;

  public static final String SERIALIZED_NAME_CHILD_AGE_LIST = "childAgeList";
  @SerializedName(SERIALIZED_NAME_CHILD_AGE_LIST)
  private List<BigDecimal> childAgeList = null;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_MIN_LENGTH_OF_STAY = "minLengthOfStay";
  @SerializedName(SERIALIZED_NAME_MIN_LENGTH_OF_STAY)
  private BigDecimal minLengthOfStay;

  public static final String SERIALIZED_NAME_MAX_LENGTH_OF_STAY = "maxLengthOfStay";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH_OF_STAY)
  private BigDecimal maxLengthOfStay;

  public static final String SERIALIZED_NAME_LOCATION_NAME = "locationName";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "locationType";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private String locationType;

  public static final String SERIALIZED_NAME_EARLIEST_ARRIVAL = "earliestArrival";
  @SerializedName(SERIALIZED_NAME_EARLIEST_ARRIVAL)
  private LocalDate earliestArrival;

  public static final String SERIALIZED_NAME_LATEST_RETURN = "latestReturn";
  @SerializedName(SERIALIZED_NAME_LATEST_RETURN)
  private LocalDate latestReturn;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private String sort;

  public static final String SERIALIZED_NAME_SERVICE_LIST = "serviceList";
  @SerializedName(SERIALIZED_NAME_SERVICE_LIST)
  private List<BigDecimal> serviceList = null;

  public static final String SERIALIZED_NAME_TYPE_LIST = "typeList";
  @SerializedName(SERIALIZED_NAME_TYPE_LIST)
  private List<BigDecimal> typeList = null;

  public static final String SERIALIZED_NAME_UNIT_TYPE_LIST = "unitTypeList";
  @SerializedName(SERIALIZED_NAME_UNIT_TYPE_LIST)
  private List<BigDecimal> unitTypeList = null;

  public static final String SERIALIZED_NAME_UNIT_AMENITY_LIST = "unitAmenityList";
  @SerializedName(SERIALIZED_NAME_UNIT_AMENITY_LIST)
  private List<BigDecimal> unitAmenityList = null;

  public static final String SERIALIZED_NAME_MEAL_PLAN_LIST = "mealPlanList";
  @SerializedName(SERIALIZED_NAME_MEAL_PLAN_LIST)
  private List<BigDecimal> mealPlanList = null;

  public AvailabilitySearch() { 
  }

  public AvailabilitySearch adultCount(BigDecimal adultCount) {
    
    this.adultCount = adultCount;
    return this;
  }

   /**
   * Get adultCount
   * @return adultCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public BigDecimal getAdultCount() {
    return adultCount;
  }


  public void setAdultCount(BigDecimal adultCount) {
    this.adultCount = adultCount;
  }


  public AvailabilitySearch childCount(BigDecimal childCount) {
    
    this.childCount = childCount;
    return this;
  }

   /**
   * Get childCount
   * @return childCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public BigDecimal getChildCount() {
    return childCount;
  }


  public void setChildCount(BigDecimal childCount) {
    this.childCount = childCount;
  }


  public AvailabilitySearch childAgeList(List<BigDecimal> childAgeList) {
    
    this.childAgeList = childAgeList;
    return this;
  }

  public AvailabilitySearch addChildAgeListItem(BigDecimal childAgeListItem) {
    if (this.childAgeList == null) {
      this.childAgeList = new ArrayList<>();
    }
    this.childAgeList.add(childAgeListItem);
    return this;
  }

   /**
   * Get childAgeList
   * @return childAgeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getChildAgeList() {
    return childAgeList;
  }


  public void setChildAgeList(List<BigDecimal> childAgeList) {
    this.childAgeList = childAgeList;
  }


  public AvailabilitySearch currencyCode(String currencyCode) {
    
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


  public AvailabilitySearch minLengthOfStay(BigDecimal minLengthOfStay) {
    
    this.minLengthOfStay = minLengthOfStay;
    return this;
  }

   /**
   * Get minLengthOfStay
   * @return minLengthOfStay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public BigDecimal getMinLengthOfStay() {
    return minLengthOfStay;
  }


  public void setMinLengthOfStay(BigDecimal minLengthOfStay) {
    this.minLengthOfStay = minLengthOfStay;
  }


  public AvailabilitySearch maxLengthOfStay(BigDecimal maxLengthOfStay) {
    
    this.maxLengthOfStay = maxLengthOfStay;
    return this;
  }

   /**
   * Get maxLengthOfStay
   * @return maxLengthOfStay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "27", value = "")

  public BigDecimal getMaxLengthOfStay() {
    return maxLengthOfStay;
  }


  public void setMaxLengthOfStay(BigDecimal maxLengthOfStay) {
    this.maxLengthOfStay = maxLengthOfStay;
  }


  public AvailabilitySearch locationName(String locationName) {
    
    this.locationName = locationName;
    return this;
  }

   /**
   * Get locationName
   * @return locationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Oberbayern", value = "")

  public String getLocationName() {
    return locationName;
  }


  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public AvailabilitySearch locationType(String locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "locality", value = "")

  public String getLocationType() {
    return locationType;
  }


  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }


  public AvailabilitySearch earliestArrival(LocalDate earliestArrival) {
    
    this.earliestArrival = earliestArrival;
    return this;
  }

   /**
   * Get earliestArrival
   * @return earliestArrival
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu Sep 01 00:00:00 UTC 2022", value = "")

  public LocalDate getEarliestArrival() {
    return earliestArrival;
  }


  public void setEarliestArrival(LocalDate earliestArrival) {
    this.earliestArrival = earliestArrival;
  }


  public AvailabilitySearch latestReturn(LocalDate latestReturn) {
    
    this.latestReturn = latestReturn;
    return this;
  }

   /**
   * Get latestReturn
   * @return latestReturn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu Sep 08 00:00:00 UTC 2022", value = "")

  public LocalDate getLatestReturn() {
    return latestReturn;
  }


  public void setLatestReturn(LocalDate latestReturn) {
    this.latestReturn = latestReturn;
  }


  public AvailabilitySearch sort(String sort) {
    
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "quality", value = "")

  public String getSort() {
    return sort;
  }


  public void setSort(String sort) {
    this.sort = sort;
  }


  public AvailabilitySearch serviceList(List<BigDecimal> serviceList) {
    
    this.serviceList = serviceList;
    return this;
  }

  public AvailabilitySearch addServiceListItem(BigDecimal serviceListItem) {
    if (this.serviceList == null) {
      this.serviceList = new ArrayList<>();
    }
    this.serviceList.add(serviceListItem);
    return this;
  }

   /**
   * Get serviceList
   * @return serviceList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getServiceList() {
    return serviceList;
  }


  public void setServiceList(List<BigDecimal> serviceList) {
    this.serviceList = serviceList;
  }


  public AvailabilitySearch typeList(List<BigDecimal> typeList) {
    
    this.typeList = typeList;
    return this;
  }

  public AvailabilitySearch addTypeListItem(BigDecimal typeListItem) {
    if (this.typeList == null) {
      this.typeList = new ArrayList<>();
    }
    this.typeList.add(typeListItem);
    return this;
  }

   /**
   * Get typeList
   * @return typeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getTypeList() {
    return typeList;
  }


  public void setTypeList(List<BigDecimal> typeList) {
    this.typeList = typeList;
  }


  public AvailabilitySearch unitTypeList(List<BigDecimal> unitTypeList) {
    
    this.unitTypeList = unitTypeList;
    return this;
  }

  public AvailabilitySearch addUnitTypeListItem(BigDecimal unitTypeListItem) {
    if (this.unitTypeList == null) {
      this.unitTypeList = new ArrayList<>();
    }
    this.unitTypeList.add(unitTypeListItem);
    return this;
  }

   /**
   * Get unitTypeList
   * @return unitTypeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getUnitTypeList() {
    return unitTypeList;
  }


  public void setUnitTypeList(List<BigDecimal> unitTypeList) {
    this.unitTypeList = unitTypeList;
  }


  public AvailabilitySearch unitAmenityList(List<BigDecimal> unitAmenityList) {
    
    this.unitAmenityList = unitAmenityList;
    return this;
  }

  public AvailabilitySearch addUnitAmenityListItem(BigDecimal unitAmenityListItem) {
    if (this.unitAmenityList == null) {
      this.unitAmenityList = new ArrayList<>();
    }
    this.unitAmenityList.add(unitAmenityListItem);
    return this;
  }

   /**
   * Get unitAmenityList
   * @return unitAmenityList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getUnitAmenityList() {
    return unitAmenityList;
  }


  public void setUnitAmenityList(List<BigDecimal> unitAmenityList) {
    this.unitAmenityList = unitAmenityList;
  }


  public AvailabilitySearch mealPlanList(List<BigDecimal> mealPlanList) {
    
    this.mealPlanList = mealPlanList;
    return this;
  }

  public AvailabilitySearch addMealPlanListItem(BigDecimal mealPlanListItem) {
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

  public List<BigDecimal> getMealPlanList() {
    return mealPlanList;
  }


  public void setMealPlanList(List<BigDecimal> mealPlanList) {
    this.mealPlanList = mealPlanList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilitySearch availabilitySearch = (AvailabilitySearch) o;
    return Objects.equals(this.adultCount, availabilitySearch.adultCount) &&
        Objects.equals(this.childCount, availabilitySearch.childCount) &&
        Objects.equals(this.childAgeList, availabilitySearch.childAgeList) &&
        Objects.equals(this.currencyCode, availabilitySearch.currencyCode) &&
        Objects.equals(this.minLengthOfStay, availabilitySearch.minLengthOfStay) &&
        Objects.equals(this.maxLengthOfStay, availabilitySearch.maxLengthOfStay) &&
        Objects.equals(this.locationName, availabilitySearch.locationName) &&
        Objects.equals(this.locationType, availabilitySearch.locationType) &&
        Objects.equals(this.earliestArrival, availabilitySearch.earliestArrival) &&
        Objects.equals(this.latestReturn, availabilitySearch.latestReturn) &&
        Objects.equals(this.sort, availabilitySearch.sort) &&
        Objects.equals(this.serviceList, availabilitySearch.serviceList) &&
        Objects.equals(this.typeList, availabilitySearch.typeList) &&
        Objects.equals(this.unitTypeList, availabilitySearch.unitTypeList) &&
        Objects.equals(this.unitAmenityList, availabilitySearch.unitAmenityList) &&
        Objects.equals(this.mealPlanList, availabilitySearch.mealPlanList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adultCount, childCount, childAgeList, currencyCode, minLengthOfStay, maxLengthOfStay, locationName, locationType, earliestArrival, latestReturn, sort, serviceList, typeList, unitTypeList, unitAmenityList, mealPlanList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilitySearch {\n");
    sb.append("    adultCount: ").append(toIndentedString(adultCount)).append("\n");
    sb.append("    childCount: ").append(toIndentedString(childCount)).append("\n");
    sb.append("    childAgeList: ").append(toIndentedString(childAgeList)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    minLengthOfStay: ").append(toIndentedString(minLengthOfStay)).append("\n");
    sb.append("    maxLengthOfStay: ").append(toIndentedString(maxLengthOfStay)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    earliestArrival: ").append(toIndentedString(earliestArrival)).append("\n");
    sb.append("    latestReturn: ").append(toIndentedString(latestReturn)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    serviceList: ").append(toIndentedString(serviceList)).append("\n");
    sb.append("    typeList: ").append(toIndentedString(typeList)).append("\n");
    sb.append("    unitTypeList: ").append(toIndentedString(unitTypeList)).append("\n");
    sb.append("    unitAmenityList: ").append(toIndentedString(unitAmenityList)).append("\n");
    sb.append("    mealPlanList: ").append(toIndentedString(mealPlanList)).append("\n");
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
    openapiFields.add("adultCount");
    openapiFields.add("childCount");
    openapiFields.add("childAgeList");
    openapiFields.add("currencyCode");
    openapiFields.add("minLengthOfStay");
    openapiFields.add("maxLengthOfStay");
    openapiFields.add("locationName");
    openapiFields.add("locationType");
    openapiFields.add("earliestArrival");
    openapiFields.add("latestReturn");
    openapiFields.add("sort");
    openapiFields.add("serviceList");
    openapiFields.add("typeList");
    openapiFields.add("unitTypeList");
    openapiFields.add("unitAmenityList");
    openapiFields.add("mealPlanList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AvailabilitySearch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AvailabilitySearch.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailabilitySearch is not found in the empty JSON string", AvailabilitySearch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AvailabilitySearch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailabilitySearch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("childAgeList") != null && !jsonObj.get("childAgeList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `childAgeList` to be an array in the JSON string but got `%s`", jsonObj.get("childAgeList").toString()));
      }
      if (jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if (jsonObj.get("locationName") != null && !jsonObj.get("locationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationName").toString()));
      }
      if (jsonObj.get("locationType") != null && !jsonObj.get("locationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationType").toString()));
      }
      if (jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("serviceList") != null && !jsonObj.get("serviceList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceList` to be an array in the JSON string but got `%s`", jsonObj.get("serviceList").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("typeList") != null && !jsonObj.get("typeList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeList` to be an array in the JSON string but got `%s`", jsonObj.get("typeList").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("unitTypeList") != null && !jsonObj.get("unitTypeList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitTypeList` to be an array in the JSON string but got `%s`", jsonObj.get("unitTypeList").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("unitAmenityList") != null && !jsonObj.get("unitAmenityList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitAmenityList` to be an array in the JSON string but got `%s`", jsonObj.get("unitAmenityList").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("mealPlanList") != null && !jsonObj.get("mealPlanList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mealPlanList` to be an array in the JSON string but got `%s`", jsonObj.get("mealPlanList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailabilitySearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailabilitySearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailabilitySearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailabilitySearch.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailabilitySearch>() {
           @Override
           public void write(JsonWriter out, AvailabilitySearch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailabilitySearch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AvailabilitySearch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvailabilitySearch
  * @throws IOException if the JSON string is invalid with respect to AvailabilitySearch
  */
  public static AvailabilitySearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailabilitySearch.class);
  }

 /**
  * Convert an instance of AvailabilitySearch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


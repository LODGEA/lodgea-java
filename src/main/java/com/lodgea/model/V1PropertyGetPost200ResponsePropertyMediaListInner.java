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
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyMediaListInnerTagListInner;
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
 * V1PropertyGetPost200ResponsePropertyMediaListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-24T11:37:52.194432653Z[Etc/UTC]")
public class V1PropertyGetPost200ResponsePropertyMediaListInner {
  public static final String SERIALIZED_NAME_IS_MAIN_IMAGE = "isMainImage";
  @SerializedName(SERIALIZED_NAME_IS_MAIN_IMAGE)
  private Boolean isMainImage;

  public static final String SERIALIZED_NAME_SORT_ORDER = "sortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private BigDecimal sortOrder;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TAG_LIST = "tagList";
  @SerializedName(SERIALIZED_NAME_TAG_LIST)
  private List<V1PropertyGetPost200ResponsePropertyMediaListInnerTagListInner> tagList = null;

  public static final String SERIALIZED_NAME_MODERATION_LABEL_LIST = "moderationLabelList";
  @SerializedName(SERIALIZED_NAME_MODERATION_LABEL_LIST)
  private List<String> moderationLabelList = null;

  public static final String SERIALIZED_NAME_DETECTION_LABEL_LIST = "detectionLabelList";
  @SerializedName(SERIALIZED_NAME_DETECTION_LABEL_LIST)
  private List<String> detectionLabelList = null;

  public static final String SERIALIZED_NAME_PROPERTY_AMENITY_LIST = "propertyAmenityList";
  @SerializedName(SERIALIZED_NAME_PROPERTY_AMENITY_LIST)
  private List<String> propertyAmenityList = null;

  public static final String SERIALIZED_NAME_ROOM_AMENITY_LIST = "roomAmenityList";
  @SerializedName(SERIALIZED_NAME_ROOM_AMENITY_LIST)
  private List<String> roomAmenityList = null;

  public V1PropertyGetPost200ResponsePropertyMediaListInner() { 
  }

  public V1PropertyGetPost200ResponsePropertyMediaListInner isMainImage(Boolean isMainImage) {
    
    this.isMainImage = isMainImage;
    return this;
  }

   /**
   * Get isMainImage
   * @return isMainImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsMainImage() {
    return isMainImage;
  }


  public void setIsMainImage(Boolean isMainImage) {
    this.isMainImage = isMainImage;
  }


  public V1PropertyGetPost200ResponsePropertyMediaListInner sortOrder(BigDecimal sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "")

  public BigDecimal getSortOrder() {
    return sortOrder;
  }


  public void setSortOrder(BigDecimal sortOrder) {
    this.sortOrder = sortOrder;
  }


  public V1PropertyGetPost200ResponsePropertyMediaListInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "obj_1280x960_54620_001.jpg", value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public V1PropertyGetPost200ResponsePropertyMediaListInner tagList(List<V1PropertyGetPost200ResponsePropertyMediaListInnerTagListInner> tagList) {
    
    this.tagList = tagList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyMediaListInner addTagListItem(V1PropertyGetPost200ResponsePropertyMediaListInnerTagListInner tagListItem) {
    if (this.tagList == null) {
      this.tagList = new ArrayList<>();
    }
    this.tagList.add(tagListItem);
    return this;
  }

   /**
   * Get tagList
   * @return tagList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyMediaListInnerTagListInner> getTagList() {
    return tagList;
  }


  public void setTagList(List<V1PropertyGetPost200ResponsePropertyMediaListInnerTagListInner> tagList) {
    this.tagList = tagList;
  }


  public V1PropertyGetPost200ResponsePropertyMediaListInner moderationLabelList(List<String> moderationLabelList) {
    
    this.moderationLabelList = moderationLabelList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyMediaListInner addModerationLabelListItem(String moderationLabelListItem) {
    if (this.moderationLabelList == null) {
      this.moderationLabelList = new ArrayList<>();
    }
    this.moderationLabelList.add(moderationLabelListItem);
    return this;
  }

   /**
   * Get moderationLabelList
   * @return moderationLabelList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getModerationLabelList() {
    return moderationLabelList;
  }


  public void setModerationLabelList(List<String> moderationLabelList) {
    this.moderationLabelList = moderationLabelList;
  }


  public V1PropertyGetPost200ResponsePropertyMediaListInner detectionLabelList(List<String> detectionLabelList) {
    
    this.detectionLabelList = detectionLabelList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyMediaListInner addDetectionLabelListItem(String detectionLabelListItem) {
    if (this.detectionLabelList == null) {
      this.detectionLabelList = new ArrayList<>();
    }
    this.detectionLabelList.add(detectionLabelListItem);
    return this;
  }

   /**
   * Get detectionLabelList
   * @return detectionLabelList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDetectionLabelList() {
    return detectionLabelList;
  }


  public void setDetectionLabelList(List<String> detectionLabelList) {
    this.detectionLabelList = detectionLabelList;
  }


  public V1PropertyGetPost200ResponsePropertyMediaListInner propertyAmenityList(List<String> propertyAmenityList) {
    
    this.propertyAmenityList = propertyAmenityList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyMediaListInner addPropertyAmenityListItem(String propertyAmenityListItem) {
    if (this.propertyAmenityList == null) {
      this.propertyAmenityList = new ArrayList<>();
    }
    this.propertyAmenityList.add(propertyAmenityListItem);
    return this;
  }

   /**
   * Get propertyAmenityList
   * @return propertyAmenityList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPropertyAmenityList() {
    return propertyAmenityList;
  }


  public void setPropertyAmenityList(List<String> propertyAmenityList) {
    this.propertyAmenityList = propertyAmenityList;
  }


  public V1PropertyGetPost200ResponsePropertyMediaListInner roomAmenityList(List<String> roomAmenityList) {
    
    this.roomAmenityList = roomAmenityList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyMediaListInner addRoomAmenityListItem(String roomAmenityListItem) {
    if (this.roomAmenityList == null) {
      this.roomAmenityList = new ArrayList<>();
    }
    this.roomAmenityList.add(roomAmenityListItem);
    return this;
  }

   /**
   * Get roomAmenityList
   * @return roomAmenityList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRoomAmenityList() {
    return roomAmenityList;
  }


  public void setRoomAmenityList(List<String> roomAmenityList) {
    this.roomAmenityList = roomAmenityList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponsePropertyMediaListInner v1PropertyGetPost200ResponsePropertyMediaListInner = (V1PropertyGetPost200ResponsePropertyMediaListInner) o;
    return Objects.equals(this.isMainImage, v1PropertyGetPost200ResponsePropertyMediaListInner.isMainImage) &&
        Objects.equals(this.sortOrder, v1PropertyGetPost200ResponsePropertyMediaListInner.sortOrder) &&
        Objects.equals(this.url, v1PropertyGetPost200ResponsePropertyMediaListInner.url) &&
        Objects.equals(this.tagList, v1PropertyGetPost200ResponsePropertyMediaListInner.tagList) &&
        Objects.equals(this.moderationLabelList, v1PropertyGetPost200ResponsePropertyMediaListInner.moderationLabelList) &&
        Objects.equals(this.detectionLabelList, v1PropertyGetPost200ResponsePropertyMediaListInner.detectionLabelList) &&
        Objects.equals(this.propertyAmenityList, v1PropertyGetPost200ResponsePropertyMediaListInner.propertyAmenityList) &&
        Objects.equals(this.roomAmenityList, v1PropertyGetPost200ResponsePropertyMediaListInner.roomAmenityList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMainImage, sortOrder, url, tagList, moderationLabelList, detectionLabelList, propertyAmenityList, roomAmenityList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponsePropertyMediaListInner {\n");
    sb.append("    isMainImage: ").append(toIndentedString(isMainImage)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
    sb.append("    moderationLabelList: ").append(toIndentedString(moderationLabelList)).append("\n");
    sb.append("    detectionLabelList: ").append(toIndentedString(detectionLabelList)).append("\n");
    sb.append("    propertyAmenityList: ").append(toIndentedString(propertyAmenityList)).append("\n");
    sb.append("    roomAmenityList: ").append(toIndentedString(roomAmenityList)).append("\n");
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
    openapiFields.add("isMainImage");
    openapiFields.add("sortOrder");
    openapiFields.add("url");
    openapiFields.add("tagList");
    openapiFields.add("moderationLabelList");
    openapiFields.add("detectionLabelList");
    openapiFields.add("propertyAmenityList");
    openapiFields.add("roomAmenityList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponsePropertyMediaListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponsePropertyMediaListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponsePropertyMediaListInner is not found in the empty JSON string", V1PropertyGetPost200ResponsePropertyMediaListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponsePropertyMediaListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponsePropertyMediaListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      JsonArray jsonArraytagList = jsonObj.getAsJsonArray("tagList");
      if (jsonArraytagList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("tagList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `tagList` to be an array in the JSON string but got `%s`", jsonObj.get("tagList").toString()));
        }

        // validate the optional field `tagList` (array)
        for (int i = 0; i < jsonArraytagList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyMediaListInnerTagListInner.validateJsonObject(jsonArraytagList.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("moderationLabelList") != null && !jsonObj.get("moderationLabelList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `moderationLabelList` to be an array in the JSON string but got `%s`", jsonObj.get("moderationLabelList").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("detectionLabelList") != null && !jsonObj.get("detectionLabelList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `detectionLabelList` to be an array in the JSON string but got `%s`", jsonObj.get("detectionLabelList").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("propertyAmenityList") != null && !jsonObj.get("propertyAmenityList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyAmenityList` to be an array in the JSON string but got `%s`", jsonObj.get("propertyAmenityList").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("roomAmenityList") != null && !jsonObj.get("roomAmenityList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roomAmenityList` to be an array in the JSON string but got `%s`", jsonObj.get("roomAmenityList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponsePropertyMediaListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponsePropertyMediaListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponsePropertyMediaListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponsePropertyMediaListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponsePropertyMediaListInner>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponsePropertyMediaListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponsePropertyMediaListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponsePropertyMediaListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponsePropertyMediaListInner
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponsePropertyMediaListInner
  */
  public static V1PropertyGetPost200ResponsePropertyMediaListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponsePropertyMediaListInner.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponsePropertyMediaListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


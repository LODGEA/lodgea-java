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
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner;
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
 * V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T06:59:27.988647194Z[Etc/UTC]")
public class V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner {
  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_ROOM_ID = "roomId";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private String roomId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE_NAME = "typeName";
  @SerializedName(SERIALIZED_NAME_TYPE_NAME)
  private String typeName;

  public static final String SERIALIZED_NAME_DESCRIPTION_TEXT = "descriptionText";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_TEXT)
  private String descriptionText;

  public static final String SERIALIZED_NAME_IMAGE_LIST = "imageList";
  @SerializedName(SERIALIZED_NAME_IMAGE_LIST)
  private List<String> imageList = null;

  public static final String SERIALIZED_NAME_ROOM_TYPE_CODE = "roomTypeCode";
  @SerializedName(SERIALIZED_NAME_ROOM_TYPE_CODE)
  private String roomTypeCode;

  public static final String SERIALIZED_NAME_IS_NON_SMOKING = "isNonSmoking";
  @SerializedName(SERIALIZED_NAME_IS_NON_SMOKING)
  private Boolean isNonSmoking;

  public static final String SERIALIZED_NAME_ROOM_TYPE_NAME = "roomTypeName";
  @SerializedName(SERIALIZED_NAME_ROOM_TYPE_NAME)
  private String roomTypeName;

  public static final String SERIALIZED_NAME_AMENITY_LIST = "amenityList";
  @SerializedName(SERIALIZED_NAME_AMENITY_LIST)
  private List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner> amenityList = null;

  public static final String SERIALIZED_NAME_MAX_OCCUPANCY = "maxOccupancy";
  @SerializedName(SERIALIZED_NAME_MAX_OCCUPANCY)
  private String maxOccupancy;

  public static final String SERIALIZED_NAME_MESSAGE_LIST = "messageList";
  @SerializedName(SERIALIZED_NAME_MESSAGE_LIST)
  private List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner> messageList = null;

  public static final String SERIALIZED_NAME_MEDIA_LIST = "mediaList";
  @SerializedName(SERIALIZED_NAME_MEDIA_LIST)
  private List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner> mediaList = null;

  public static final String SERIALIZED_NAME_MAX_ADULT_OCCUPANCY = "maxAdultOccupancy";
  @SerializedName(SERIALIZED_NAME_MAX_ADULT_OCCUPANCY)
  private String maxAdultOccupancy;

  public static final String SERIALIZED_NAME_MAX_CHILD_OCCUPANCY = "maxChildOccupancy";
  @SerializedName(SERIALIZED_NAME_MAX_CHILD_OCCUPANCY)
  private String maxChildOccupancy;

  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner() { 
  }

  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner roomId(String roomId) {
    
    this.roomId = roomId;
    return this;
  }

   /**
   * Get roomId
   * @return roomId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "amrum", value = "")

  public String getRoomId() {
    return roomId;
  }


  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }


  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Amrum", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner typeName(String typeName) {
    
    this.typeName = typeName;
    return this;
  }

   /**
   * Get typeName
   * @return typeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTypeName() {
    return typeName;
  }


  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner descriptionText(String descriptionText) {
    
    this.descriptionText = descriptionText;
    return this;
  }

   /**
   * Get descriptionText
   * @return descriptionText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionText() {
    return descriptionText;
  }


  public void setDescriptionText(String descriptionText) {
    this.descriptionText = descriptionText;
  }


  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner imageList(List<String> imageList) {
    
    this.imageList = imageList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner addImageListItem(String imageListItem) {
    if (this.imageList == null) {
      this.imageList = new ArrayList<>();
    }
    this.imageList.add(imageListItem);
    return this;
  }

   /**
   * Get imageList
   * @return imageList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getImageList() {
    return imageList;
  }


  public void setImageList(List<String> imageList) {
    this.imageList = imageList;
  }


  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner roomTypeCode(String roomTypeCode) {
    
    this.roomTypeCode = roomTypeCode;
    return this;
  }

   /**
   * Get roomTypeCode
   * @return roomTypeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public String getRoomTypeCode() {
    return roomTypeCode;
  }


  public void setRoomTypeCode(String roomTypeCode) {
    this.roomTypeCode = roomTypeCode;
  }


  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner isNonSmoking(Boolean isNonSmoking) {
    
    this.isNonSmoking = isNonSmoking;
    return this;
  }

   /**
   * Get isNonSmoking
   * @return isNonSmoking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsNonSmoking() {
    return isNonSmoking;
  }


  public void setIsNonSmoking(Boolean isNonSmoking) {
    this.isNonSmoking = isNonSmoking;
  }


  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner roomTypeName(String roomTypeName) {
    
    this.roomTypeName = roomTypeName;
    return this;
  }

   /**
   * Get roomTypeName
   * @return roomTypeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoomTypeName() {
    return roomTypeName;
  }


  public void setRoomTypeName(String roomTypeName) {
    this.roomTypeName = roomTypeName;
  }


  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner amenityList(List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner> amenityList) {
    
    this.amenityList = amenityList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner addAmenityListItem(V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner amenityListItem) {
    if (this.amenityList == null) {
      this.amenityList = new ArrayList<>();
    }
    this.amenityList.add(amenityListItem);
    return this;
  }

   /**
   * Get amenityList
   * @return amenityList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner> getAmenityList() {
    return amenityList;
  }


  public void setAmenityList(List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner> amenityList) {
    this.amenityList = amenityList;
  }


  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner maxOccupancy(String maxOccupancy) {
    
    this.maxOccupancy = maxOccupancy;
    return this;
  }

   /**
   * Get maxOccupancy
   * @return maxOccupancy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public String getMaxOccupancy() {
    return maxOccupancy;
  }


  public void setMaxOccupancy(String maxOccupancy) {
    this.maxOccupancy = maxOccupancy;
  }


  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner messageList(List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner> messageList) {
    
    this.messageList = messageList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner addMessageListItem(V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner messageListItem) {
    if (this.messageList == null) {
      this.messageList = new ArrayList<>();
    }
    this.messageList.add(messageListItem);
    return this;
  }

   /**
   * Get messageList
   * @return messageList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner> getMessageList() {
    return messageList;
  }


  public void setMessageList(List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner> messageList) {
    this.messageList = messageList;
  }


  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner mediaList(List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner> mediaList) {
    
    this.mediaList = mediaList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner addMediaListItem(V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner mediaListItem) {
    if (this.mediaList == null) {
      this.mediaList = new ArrayList<>();
    }
    this.mediaList.add(mediaListItem);
    return this;
  }

   /**
   * Get mediaList
   * @return mediaList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner> getMediaList() {
    return mediaList;
  }


  public void setMediaList(List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner> mediaList) {
    this.mediaList = mediaList;
  }


  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner maxAdultOccupancy(String maxAdultOccupancy) {
    
    this.maxAdultOccupancy = maxAdultOccupancy;
    return this;
  }

   /**
   * Get maxAdultOccupancy
   * @return maxAdultOccupancy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public String getMaxAdultOccupancy() {
    return maxAdultOccupancy;
  }


  public void setMaxAdultOccupancy(String maxAdultOccupancy) {
    this.maxAdultOccupancy = maxAdultOccupancy;
  }


  public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner maxChildOccupancy(String maxChildOccupancy) {
    
    this.maxChildOccupancy = maxChildOccupancy;
    return this;
  }

   /**
   * Get maxChildOccupancy
   * @return maxChildOccupancy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public String getMaxChildOccupancy() {
    return maxChildOccupancy;
  }


  public void setMaxChildOccupancy(String maxChildOccupancy) {
    this.maxChildOccupancy = maxChildOccupancy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner = (V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner) o;
    return Objects.equals(this.isActive, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.isActive) &&
        Objects.equals(this.roomId, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.roomId) &&
        Objects.equals(this.name, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.name) &&
        Objects.equals(this.typeName, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.typeName) &&
        Objects.equals(this.descriptionText, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.descriptionText) &&
        Objects.equals(this.imageList, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.imageList) &&
        Objects.equals(this.roomTypeCode, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.roomTypeCode) &&
        Objects.equals(this.isNonSmoking, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.isNonSmoking) &&
        Objects.equals(this.roomTypeName, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.roomTypeName) &&
        Objects.equals(this.amenityList, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.amenityList) &&
        Objects.equals(this.maxOccupancy, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.maxOccupancy) &&
        Objects.equals(this.messageList, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.messageList) &&
        Objects.equals(this.mediaList, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.mediaList) &&
        Objects.equals(this.maxAdultOccupancy, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.maxAdultOccupancy) &&
        Objects.equals(this.maxChildOccupancy, v1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.maxChildOccupancy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, roomId, name, typeName, descriptionText, imageList, roomTypeCode, isNonSmoking, roomTypeName, amenityList, maxOccupancy, messageList, mediaList, maxAdultOccupancy, maxChildOccupancy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner {\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    descriptionText: ").append(toIndentedString(descriptionText)).append("\n");
    sb.append("    imageList: ").append(toIndentedString(imageList)).append("\n");
    sb.append("    roomTypeCode: ").append(toIndentedString(roomTypeCode)).append("\n");
    sb.append("    isNonSmoking: ").append(toIndentedString(isNonSmoking)).append("\n");
    sb.append("    roomTypeName: ").append(toIndentedString(roomTypeName)).append("\n");
    sb.append("    amenityList: ").append(toIndentedString(amenityList)).append("\n");
    sb.append("    maxOccupancy: ").append(toIndentedString(maxOccupancy)).append("\n");
    sb.append("    messageList: ").append(toIndentedString(messageList)).append("\n");
    sb.append("    mediaList: ").append(toIndentedString(mediaList)).append("\n");
    sb.append("    maxAdultOccupancy: ").append(toIndentedString(maxAdultOccupancy)).append("\n");
    sb.append("    maxChildOccupancy: ").append(toIndentedString(maxChildOccupancy)).append("\n");
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
    openapiFields.add("isActive");
    openapiFields.add("roomId");
    openapiFields.add("name");
    openapiFields.add("typeName");
    openapiFields.add("descriptionText");
    openapiFields.add("imageList");
    openapiFields.add("roomTypeCode");
    openapiFields.add("isNonSmoking");
    openapiFields.add("roomTypeName");
    openapiFields.add("amenityList");
    openapiFields.add("maxOccupancy");
    openapiFields.add("messageList");
    openapiFields.add("mediaList");
    openapiFields.add("maxAdultOccupancy");
    openapiFields.add("maxChildOccupancy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner is not found in the empty JSON string", V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("roomId") != null && !jsonObj.get("roomId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roomId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roomId").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("typeName") != null && !jsonObj.get("typeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typeName").toString()));
      }
      if (jsonObj.get("descriptionText") != null && !jsonObj.get("descriptionText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptionText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptionText").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("imageList") != null && !jsonObj.get("imageList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageList` to be an array in the JSON string but got `%s`", jsonObj.get("imageList").toString()));
      }
      if (jsonObj.get("roomTypeCode") != null && !jsonObj.get("roomTypeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roomTypeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roomTypeCode").toString()));
      }
      if (jsonObj.get("roomTypeName") != null && !jsonObj.get("roomTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roomTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roomTypeName").toString()));
      }
      JsonArray jsonArrayamenityList = jsonObj.getAsJsonArray("amenityList");
      if (jsonArrayamenityList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("amenityList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `amenityList` to be an array in the JSON string but got `%s`", jsonObj.get("amenityList").toString()));
        }

        // validate the optional field `amenityList` (array)
        for (int i = 0; i < jsonArrayamenityList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner.validateJsonObject(jsonArrayamenityList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("maxOccupancy") != null && !jsonObj.get("maxOccupancy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxOccupancy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxOccupancy").toString()));
      }
      JsonArray jsonArraymessageList = jsonObj.getAsJsonArray("messageList");
      if (jsonArraymessageList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("messageList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `messageList` to be an array in the JSON string but got `%s`", jsonObj.get("messageList").toString()));
        }

        // validate the optional field `messageList` (array)
        for (int i = 0; i < jsonArraymessageList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner.validateJsonObject(jsonArraymessageList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraymediaList = jsonObj.getAsJsonArray("mediaList");
      if (jsonArraymediaList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("mediaList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `mediaList` to be an array in the JSON string but got `%s`", jsonObj.get("mediaList").toString()));
        }

        // validate the optional field `mediaList` (array)
        for (int i = 0; i < jsonArraymediaList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner.validateJsonObject(jsonArraymediaList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("maxAdultOccupancy") != null && !jsonObj.get("maxAdultOccupancy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxAdultOccupancy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxAdultOccupancy").toString()));
      }
      if (jsonObj.get("maxChildOccupancy") != null && !jsonObj.get("maxChildOccupancy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxChildOccupancy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxChildOccupancy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner
  */
  public static V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


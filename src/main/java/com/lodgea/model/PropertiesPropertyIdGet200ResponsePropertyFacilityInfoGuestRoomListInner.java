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
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner;
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner;
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner;
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
 * An object representing a room in the property.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner {
  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_ROOM_ID = "roomId";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private String roomId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MEDIA_LIST = "mediaList";
  @SerializedName(SERIALIZED_NAME_MEDIA_LIST)
  private List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner> mediaList = new ArrayList<>();

  /**
   * The unit and room type code.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#unitand-room-type-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   */
  @JsonAdapter(RoomTypeCodeEnum.Adapter.class)
  public enum RoomTypeCodeEnum {
    NUMBER_1(new BigDecimal("1")),
    
    NUMBER_4(new BigDecimal("4")),
    
    NUMBER_5(new BigDecimal("5")),
    
    NUMBER_7(new BigDecimal("7")),
    
    NUMBER_8(new BigDecimal("8")),
    
    NUMBER_9(new BigDecimal("9")),
    
    NUMBER_10(new BigDecimal("10")),
    
    NUMBER_12(new BigDecimal("12")),
    
    NUMBER_13(new BigDecimal("13")),
    
    NUMBER_24(new BigDecimal("24")),
    
    NUMBER_25(new BigDecimal("25")),
    
    NUMBER_26(new BigDecimal("26")),
    
    NUMBER_27(new BigDecimal("27")),
    
    NUMBER_28(new BigDecimal("28")),
    
    NUMBER_29(new BigDecimal("29")),
    
    NUMBER_31(new BigDecimal("31")),
    
    NUMBER_32(new BigDecimal("32")),
    
    NUMBER_33(new BigDecimal("33"));

    private BigDecimal value;

    RoomTypeCodeEnum(BigDecimal value) {
      this.value = value;
    }

    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoomTypeCodeEnum fromValue(BigDecimal value) {
      for (RoomTypeCodeEnum b : RoomTypeCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RoomTypeCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoomTypeCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoomTypeCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoomTypeCodeEnum.fromValue(new BigDecimal(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_ROOM_TYPE_CODE = "roomTypeCode";
  @SerializedName(SERIALIZED_NAME_ROOM_TYPE_CODE)
  private RoomTypeCodeEnum roomTypeCode;

  public static final String SERIALIZED_NAME_IS_NON_SMOKING = "isNonSmoking";
  @SerializedName(SERIALIZED_NAME_IS_NON_SMOKING)
  private Boolean isNonSmoking;

  public static final String SERIALIZED_NAME_AMENITY_LIST = "amenityList";
  @SerializedName(SERIALIZED_NAME_AMENITY_LIST)
  private List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner> amenityList = new ArrayList<>();

  public static final String SERIALIZED_NAME_MESSAGE_LIST = "messageList";
  @SerializedName(SERIALIZED_NAME_MESSAGE_LIST)
  private List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner> messageList = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAX_OCCUPANCY = "maxOccupancy";
  @SerializedName(SERIALIZED_NAME_MAX_OCCUPANCY)
  private BigDecimal maxOccupancy;

  public static final String SERIALIZED_NAME_MAX_ADULT_OCCUPANCY = "maxAdultOccupancy";
  @SerializedName(SERIALIZED_NAME_MAX_ADULT_OCCUPANCY)
  private BigDecimal maxAdultOccupancy;

  public static final String SERIALIZED_NAME_MAX_CHILD_OCCUPANCY = "maxChildOccupancy";
  @SerializedName(SERIALIZED_NAME_MAX_CHILD_OCCUPANCY)
  private BigDecimal maxChildOccupancy;

  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner() {
  }

  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates whether the room is active or not.
   * @return isActive
  **/
  @javax.annotation.Nonnull

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner roomId(String roomId) {
    
    this.roomId = roomId;
    return this;
  }

   /**
   * The unique identifier for the room.
   * @return roomId
  **/
  @javax.annotation.Nonnull

  public String getRoomId() {
    return roomId;
  }


  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }


  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the room.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner mediaList(List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner> mediaList) {
    
    this.mediaList = mediaList;
    return this;
  }

  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner addMediaListItem(PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner mediaListItem) {
    this.mediaList.add(mediaListItem);
    return this;
  }

   /**
   * A list of media objects for the room.
   * @return mediaList
  **/
  @javax.annotation.Nonnull

  public List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner> getMediaList() {
    return mediaList;
  }


  public void setMediaList(List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner> mediaList) {
    this.mediaList = mediaList;
  }


  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner roomTypeCode(RoomTypeCodeEnum roomTypeCode) {
    
    this.roomTypeCode = roomTypeCode;
    return this;
  }

   /**
   * The unit and room type code.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#unitand-room-type-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   * @return roomTypeCode
  **/
  @javax.annotation.Nonnull

  public RoomTypeCodeEnum getRoomTypeCode() {
    return roomTypeCode;
  }


  public void setRoomTypeCode(RoomTypeCodeEnum roomTypeCode) {
    this.roomTypeCode = roomTypeCode;
  }


  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner isNonSmoking(Boolean isNonSmoking) {
    
    this.isNonSmoking = isNonSmoking;
    return this;
  }

   /**
   * Indicates whether the room is designated as non-smoking.
   * @return isNonSmoking
  **/
  @javax.annotation.Nonnull

  public Boolean getIsNonSmoking() {
    return isNonSmoking;
  }


  public void setIsNonSmoking(Boolean isNonSmoking) {
    this.isNonSmoking = isNonSmoking;
  }


  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner amenityList(List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner> amenityList) {
    
    this.amenityList = amenityList;
    return this;
  }

  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner addAmenityListItem(PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner amenityListItem) {
    this.amenityList.add(amenityListItem);
    return this;
  }

   /**
   * A list of amenities provided in the room.
   * @return amenityList
  **/
  @javax.annotation.Nonnull

  public List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner> getAmenityList() {
    return amenityList;
  }


  public void setAmenityList(List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner> amenityList) {
    this.amenityList = amenityList;
  }


  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner messageList(List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner> messageList) {
    
    this.messageList = messageList;
    return this;
  }

  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner addMessageListItem(PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner messageListItem) {
    this.messageList.add(messageListItem);
    return this;
  }

   /**
   * A list of messages associated with the room.
   * @return messageList
  **/
  @javax.annotation.Nonnull

  public List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner> getMessageList() {
    return messageList;
  }


  public void setMessageList(List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner> messageList) {
    this.messageList = messageList;
  }


  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner maxOccupancy(BigDecimal maxOccupancy) {
    
    this.maxOccupancy = maxOccupancy;
    return this;
  }

   /**
   * The maximum occupancy of the room.
   * @return maxOccupancy
  **/
  @javax.annotation.Nonnull

  public BigDecimal getMaxOccupancy() {
    return maxOccupancy;
  }


  public void setMaxOccupancy(BigDecimal maxOccupancy) {
    this.maxOccupancy = maxOccupancy;
  }


  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner maxAdultOccupancy(BigDecimal maxAdultOccupancy) {
    
    this.maxAdultOccupancy = maxAdultOccupancy;
    return this;
  }

   /**
   * The maximum number of adults that can occupy the room.
   * @return maxAdultOccupancy
  **/
  @javax.annotation.Nonnull

  public BigDecimal getMaxAdultOccupancy() {
    return maxAdultOccupancy;
  }


  public void setMaxAdultOccupancy(BigDecimal maxAdultOccupancy) {
    this.maxAdultOccupancy = maxAdultOccupancy;
  }


  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner maxChildOccupancy(BigDecimal maxChildOccupancy) {
    
    this.maxChildOccupancy = maxChildOccupancy;
    return this;
  }

   /**
   * The maximum number of children that can occupy the room.
   * @return maxChildOccupancy
  **/
  @javax.annotation.Nonnull

  public BigDecimal getMaxChildOccupancy() {
    return maxChildOccupancy;
  }


  public void setMaxChildOccupancy(BigDecimal maxChildOccupancy) {
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
    PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner = (PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner) o;
    return Objects.equals(this.isActive, propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.isActive) &&
        Objects.equals(this.roomId, propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.roomId) &&
        Objects.equals(this.name, propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.name) &&
        Objects.equals(this.mediaList, propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.mediaList) &&
        Objects.equals(this.roomTypeCode, propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.roomTypeCode) &&
        Objects.equals(this.isNonSmoking, propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.isNonSmoking) &&
        Objects.equals(this.amenityList, propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.amenityList) &&
        Objects.equals(this.messageList, propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.messageList) &&
        Objects.equals(this.maxOccupancy, propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.maxOccupancy) &&
        Objects.equals(this.maxAdultOccupancy, propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.maxAdultOccupancy) &&
        Objects.equals(this.maxChildOccupancy, propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.maxChildOccupancy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, roomId, name, mediaList, roomTypeCode, isNonSmoking, amenityList, messageList, maxOccupancy, maxAdultOccupancy, maxChildOccupancy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner {\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mediaList: ").append(toIndentedString(mediaList)).append("\n");
    sb.append("    roomTypeCode: ").append(toIndentedString(roomTypeCode)).append("\n");
    sb.append("    isNonSmoking: ").append(toIndentedString(isNonSmoking)).append("\n");
    sb.append("    amenityList: ").append(toIndentedString(amenityList)).append("\n");
    sb.append("    messageList: ").append(toIndentedString(messageList)).append("\n");
    sb.append("    maxOccupancy: ").append(toIndentedString(maxOccupancy)).append("\n");
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
    openapiFields.add("mediaList");
    openapiFields.add("roomTypeCode");
    openapiFields.add("isNonSmoking");
    openapiFields.add("amenityList");
    openapiFields.add("messageList");
    openapiFields.add("maxOccupancy");
    openapiFields.add("maxAdultOccupancy");
    openapiFields.add("maxChildOccupancy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("isActive");
    openapiRequiredFields.add("roomId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("mediaList");
    openapiRequiredFields.add("roomTypeCode");
    openapiRequiredFields.add("isNonSmoking");
    openapiRequiredFields.add("amenityList");
    openapiRequiredFields.add("messageList");
    openapiRequiredFields.add("maxOccupancy");
    openapiRequiredFields.add("maxAdultOccupancy");
    openapiRequiredFields.add("maxChildOccupancy");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner is not found in the empty JSON string", PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("roomId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roomId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roomId").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("mediaList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaList` to be an array in the JSON string but got `%s`", jsonObj.get("mediaList").toString()));
      }

      JsonArray jsonArraymediaList = jsonObj.getAsJsonArray("mediaList");
      // validate the required field `mediaList` (array)
      for (int i = 0; i < jsonArraymediaList.size(); i++) {
        PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner.validateJsonObject(jsonArraymediaList.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("amenityList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `amenityList` to be an array in the JSON string but got `%s`", jsonObj.get("amenityList").toString()));
      }

      JsonArray jsonArrayamenityList = jsonObj.getAsJsonArray("amenityList");
      // validate the required field `amenityList` (array)
      for (int i = 0; i < jsonArrayamenityList.size(); i++) {
        PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner.validateJsonObject(jsonArrayamenityList.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("messageList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageList` to be an array in the JSON string but got `%s`", jsonObj.get("messageList").toString()));
      }

      JsonArray jsonArraymessageList = jsonObj.getAsJsonArray("messageList");
      // validate the required field `messageList` (array)
      for (int i = 0; i < jsonArraymessageList.size(); i++) {
        PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMessageListInner.validateJsonObject(jsonArraymessageList.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner>() {
           @Override
           public void write(JsonWriter out, PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner
  * @throws IOException if the JSON string is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner
  */
  public static PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner.class);
  }

 /**
  * Convert an instance of PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


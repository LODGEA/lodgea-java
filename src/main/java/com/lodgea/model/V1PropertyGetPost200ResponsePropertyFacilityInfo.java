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
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner;
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
 * V1PropertyGetPost200ResponsePropertyFacilityInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-24T11:46:35.796667073Z[Etc/UTC]")
public class V1PropertyGetPost200ResponsePropertyFacilityInfo {
  public static final String SERIALIZED_NAME_GUEST_ROOM_LIST = "guestRoomList";
  @SerializedName(SERIALIZED_NAME_GUEST_ROOM_LIST)
  private List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner> guestRoomList = null;

  public V1PropertyGetPost200ResponsePropertyFacilityInfo() { 
  }

  public V1PropertyGetPost200ResponsePropertyFacilityInfo guestRoomList(List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner> guestRoomList) {
    
    this.guestRoomList = guestRoomList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyFacilityInfo addGuestRoomListItem(V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner guestRoomListItem) {
    if (this.guestRoomList == null) {
      this.guestRoomList = new ArrayList<>();
    }
    this.guestRoomList.add(guestRoomListItem);
    return this;
  }

   /**
   * Get guestRoomList
   * @return guestRoomList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner> getGuestRoomList() {
    return guestRoomList;
  }


  public void setGuestRoomList(List<V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner> guestRoomList) {
    this.guestRoomList = guestRoomList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponsePropertyFacilityInfo v1PropertyGetPost200ResponsePropertyFacilityInfo = (V1PropertyGetPost200ResponsePropertyFacilityInfo) o;
    return Objects.equals(this.guestRoomList, v1PropertyGetPost200ResponsePropertyFacilityInfo.guestRoomList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guestRoomList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponsePropertyFacilityInfo {\n");
    sb.append("    guestRoomList: ").append(toIndentedString(guestRoomList)).append("\n");
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
    openapiFields.add("guestRoomList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponsePropertyFacilityInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponsePropertyFacilityInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponsePropertyFacilityInfo is not found in the empty JSON string", V1PropertyGetPost200ResponsePropertyFacilityInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponsePropertyFacilityInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponsePropertyFacilityInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayguestRoomList = jsonObj.getAsJsonArray("guestRoomList");
      if (jsonArrayguestRoomList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("guestRoomList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `guestRoomList` to be an array in the JSON string but got `%s`", jsonObj.get("guestRoomList").toString()));
        }

        // validate the optional field `guestRoomList` (array)
        for (int i = 0; i < jsonArrayguestRoomList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyFacilityInfoGuestRoomListInner.validateJsonObject(jsonArrayguestRoomList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponsePropertyFacilityInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponsePropertyFacilityInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponsePropertyFacilityInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponsePropertyFacilityInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponsePropertyFacilityInfo>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponsePropertyFacilityInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponsePropertyFacilityInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponsePropertyFacilityInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponsePropertyFacilityInfo
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponsePropertyFacilityInfo
  */
  public static V1PropertyGetPost200ResponsePropertyFacilityInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponsePropertyFacilityInfo.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponsePropertyFacilityInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyContactListInnerAddressListInner;
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
 * V1PropertyGetPost200ResponsePropertyContactListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-05T14:33:56.924929748Z[Etc/UTC]")
public class V1PropertyGetPost200ResponsePropertyContactListInner {
  public static final String SERIALIZED_NAME_PROFILE_TYPE = "profileType";
  @SerializedName(SERIALIZED_NAME_PROFILE_TYPE)
  private String profileType;

  public static final String SERIALIZED_NAME_ADDRESS_LIST = "addressList";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LIST)
  private List<V1PropertyGetPost200ResponsePropertyContactListInnerAddressListInner> addressList = null;

  public V1PropertyGetPost200ResponsePropertyContactListInner() { 
  }

  public V1PropertyGetPost200ResponsePropertyContactListInner profileType(String profileType) {
    
    this.profileType = profileType;
    return this;
  }

   /**
   * Get profileType
   * @return profileType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "physicallocation", value = "")

  public String getProfileType() {
    return profileType;
  }


  public void setProfileType(String profileType) {
    this.profileType = profileType;
  }


  public V1PropertyGetPost200ResponsePropertyContactListInner addressList(List<V1PropertyGetPost200ResponsePropertyContactListInnerAddressListInner> addressList) {
    
    this.addressList = addressList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyContactListInner addAddressListItem(V1PropertyGetPost200ResponsePropertyContactListInnerAddressListInner addressListItem) {
    if (this.addressList == null) {
      this.addressList = new ArrayList<>();
    }
    this.addressList.add(addressListItem);
    return this;
  }

   /**
   * Get addressList
   * @return addressList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyContactListInnerAddressListInner> getAddressList() {
    return addressList;
  }


  public void setAddressList(List<V1PropertyGetPost200ResponsePropertyContactListInnerAddressListInner> addressList) {
    this.addressList = addressList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponsePropertyContactListInner v1PropertyGetPost200ResponsePropertyContactListInner = (V1PropertyGetPost200ResponsePropertyContactListInner) o;
    return Objects.equals(this.profileType, v1PropertyGetPost200ResponsePropertyContactListInner.profileType) &&
        Objects.equals(this.addressList, v1PropertyGetPost200ResponsePropertyContactListInner.addressList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileType, addressList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponsePropertyContactListInner {\n");
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
    sb.append("    addressList: ").append(toIndentedString(addressList)).append("\n");
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
    openapiFields.add("profileType");
    openapiFields.add("addressList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponsePropertyContactListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponsePropertyContactListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponsePropertyContactListInner is not found in the empty JSON string", V1PropertyGetPost200ResponsePropertyContactListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponsePropertyContactListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponsePropertyContactListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("profileType") != null && !jsonObj.get("profileType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileType").toString()));
      }
      JsonArray jsonArrayaddressList = jsonObj.getAsJsonArray("addressList");
      if (jsonArrayaddressList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("addressList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `addressList` to be an array in the JSON string but got `%s`", jsonObj.get("addressList").toString()));
        }

        // validate the optional field `addressList` (array)
        for (int i = 0; i < jsonArrayaddressList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyContactListInnerAddressListInner.validateJsonObject(jsonArrayaddressList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponsePropertyContactListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponsePropertyContactListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponsePropertyContactListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponsePropertyContactListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponsePropertyContactListInner>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponsePropertyContactListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponsePropertyContactListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponsePropertyContactListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponsePropertyContactListInner
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponsePropertyContactListInner
  */
  public static V1PropertyGetPost200ResponsePropertyContactListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponsePropertyContactListInner.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponsePropertyContactListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


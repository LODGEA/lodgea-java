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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * V1PropertyGetPost200ResponsePropertyGuestInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-05T15:55:54.541212362Z[Etc/UTC]")
public class V1PropertyGetPost200ResponsePropertyGuestInfo {
  public static final String SERIALIZED_NAME_GUEST_ADDRESS_REQUIRED = "guestAddressRequired";
  @SerializedName(SERIALIZED_NAME_GUEST_ADDRESS_REQUIRED)
  private Boolean guestAddressRequired;

  public static final String SERIALIZED_NAME_GUEST_CONTACT_NUMBER_REQUIRED = "guestContactNumberRequired";
  @SerializedName(SERIALIZED_NAME_GUEST_CONTACT_NUMBER_REQUIRED)
  private Boolean guestContactNumberRequired;

  public static final String SERIALIZED_NAME_GUEST_NAME_LIST_REQUIRED = "guestNameListRequired";
  @SerializedName(SERIALIZED_NAME_GUEST_NAME_LIST_REQUIRED)
  private Boolean guestNameListRequired;

  public V1PropertyGetPost200ResponsePropertyGuestInfo() { 
  }

  public V1PropertyGetPost200ResponsePropertyGuestInfo guestAddressRequired(Boolean guestAddressRequired) {
    
    this.guestAddressRequired = guestAddressRequired;
    return this;
  }

   /**
   * Get guestAddressRequired
   * @return guestAddressRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGuestAddressRequired() {
    return guestAddressRequired;
  }


  public void setGuestAddressRequired(Boolean guestAddressRequired) {
    this.guestAddressRequired = guestAddressRequired;
  }


  public V1PropertyGetPost200ResponsePropertyGuestInfo guestContactNumberRequired(Boolean guestContactNumberRequired) {
    
    this.guestContactNumberRequired = guestContactNumberRequired;
    return this;
  }

   /**
   * Get guestContactNumberRequired
   * @return guestContactNumberRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGuestContactNumberRequired() {
    return guestContactNumberRequired;
  }


  public void setGuestContactNumberRequired(Boolean guestContactNumberRequired) {
    this.guestContactNumberRequired = guestContactNumberRequired;
  }


  public V1PropertyGetPost200ResponsePropertyGuestInfo guestNameListRequired(Boolean guestNameListRequired) {
    
    this.guestNameListRequired = guestNameListRequired;
    return this;
  }

   /**
   * Get guestNameListRequired
   * @return guestNameListRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGuestNameListRequired() {
    return guestNameListRequired;
  }


  public void setGuestNameListRequired(Boolean guestNameListRequired) {
    this.guestNameListRequired = guestNameListRequired;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponsePropertyGuestInfo v1PropertyGetPost200ResponsePropertyGuestInfo = (V1PropertyGetPost200ResponsePropertyGuestInfo) o;
    return Objects.equals(this.guestAddressRequired, v1PropertyGetPost200ResponsePropertyGuestInfo.guestAddressRequired) &&
        Objects.equals(this.guestContactNumberRequired, v1PropertyGetPost200ResponsePropertyGuestInfo.guestContactNumberRequired) &&
        Objects.equals(this.guestNameListRequired, v1PropertyGetPost200ResponsePropertyGuestInfo.guestNameListRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guestAddressRequired, guestContactNumberRequired, guestNameListRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponsePropertyGuestInfo {\n");
    sb.append("    guestAddressRequired: ").append(toIndentedString(guestAddressRequired)).append("\n");
    sb.append("    guestContactNumberRequired: ").append(toIndentedString(guestContactNumberRequired)).append("\n");
    sb.append("    guestNameListRequired: ").append(toIndentedString(guestNameListRequired)).append("\n");
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
    openapiFields.add("guestAddressRequired");
    openapiFields.add("guestContactNumberRequired");
    openapiFields.add("guestNameListRequired");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponsePropertyGuestInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponsePropertyGuestInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponsePropertyGuestInfo is not found in the empty JSON string", V1PropertyGetPost200ResponsePropertyGuestInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponsePropertyGuestInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponsePropertyGuestInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponsePropertyGuestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponsePropertyGuestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponsePropertyGuestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponsePropertyGuestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponsePropertyGuestInfo>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponsePropertyGuestInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponsePropertyGuestInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponsePropertyGuestInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponsePropertyGuestInfo
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponsePropertyGuestInfo
  */
  public static V1PropertyGetPost200ResponsePropertyGuestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponsePropertyGuestInfo.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponsePropertyGuestInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


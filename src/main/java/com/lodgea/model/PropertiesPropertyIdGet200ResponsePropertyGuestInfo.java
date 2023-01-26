/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://docs.lodgea.io for more information.
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
 * Information regarding requirements towards guests.
 */
@ApiModel(description = "Information regarding requirements towards guests.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-26T16:09:38.541455406Z[Etc/UTC]")
public class PropertiesPropertyIdGet200ResponsePropertyGuestInfo {
  public static final String SERIALIZED_NAME_GUEST_ADDRESS_REQUIRED = "guestAddressRequired";
  @SerializedName(SERIALIZED_NAME_GUEST_ADDRESS_REQUIRED)
  private Boolean guestAddressRequired;

  public static final String SERIALIZED_NAME_GUEST_CONTACT_NUMBER_REQUIRED = "guestContactNumberRequired";
  @SerializedName(SERIALIZED_NAME_GUEST_CONTACT_NUMBER_REQUIRED)
  private Boolean guestContactNumberRequired;

  public static final String SERIALIZED_NAME_GUEST_NAME_LIST_REQUIRED = "guestNameListRequired";
  @SerializedName(SERIALIZED_NAME_GUEST_NAME_LIST_REQUIRED)
  private Boolean guestNameListRequired;

  public PropertiesPropertyIdGet200ResponsePropertyGuestInfo() { 
  }

  public PropertiesPropertyIdGet200ResponsePropertyGuestInfo guestAddressRequired(Boolean guestAddressRequired) {
    
    this.guestAddressRequired = guestAddressRequired;
    return this;
  }

   /**
   * Whether the address of the guest is required to book this property.
   * @return guestAddressRequired
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the address of the guest is required to book this property.")

  public Boolean getGuestAddressRequired() {
    return guestAddressRequired;
  }


  public void setGuestAddressRequired(Boolean guestAddressRequired) {
    this.guestAddressRequired = guestAddressRequired;
  }


  public PropertiesPropertyIdGet200ResponsePropertyGuestInfo guestContactNumberRequired(Boolean guestContactNumberRequired) {
    
    this.guestContactNumberRequired = guestContactNumberRequired;
    return this;
  }

   /**
   * Whether the phone number of the guest is required to book this property.
   * @return guestContactNumberRequired
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the phone number of the guest is required to book this property.")

  public Boolean getGuestContactNumberRequired() {
    return guestContactNumberRequired;
  }


  public void setGuestContactNumberRequired(Boolean guestContactNumberRequired) {
    this.guestContactNumberRequired = guestContactNumberRequired;
  }


  public PropertiesPropertyIdGet200ResponsePropertyGuestInfo guestNameListRequired(Boolean guestNameListRequired) {
    
    this.guestNameListRequired = guestNameListRequired;
    return this;
  }

   /**
   * Whether a list of the guests names is required to book this property.
   * @return guestNameListRequired
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether a list of the guests names is required to book this property.")

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
    PropertiesPropertyIdGet200ResponsePropertyGuestInfo propertiesPropertyIdGet200ResponsePropertyGuestInfo = (PropertiesPropertyIdGet200ResponsePropertyGuestInfo) o;
    return Objects.equals(this.guestAddressRequired, propertiesPropertyIdGet200ResponsePropertyGuestInfo.guestAddressRequired) &&
        Objects.equals(this.guestContactNumberRequired, propertiesPropertyIdGet200ResponsePropertyGuestInfo.guestContactNumberRequired) &&
        Objects.equals(this.guestNameListRequired, propertiesPropertyIdGet200ResponsePropertyGuestInfo.guestNameListRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guestAddressRequired, guestContactNumberRequired, guestNameListRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesPropertyIdGet200ResponsePropertyGuestInfo {\n");
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
    openapiRequiredFields.add("guestAddressRequired");
    openapiRequiredFields.add("guestContactNumberRequired");
    openapiRequiredFields.add("guestNameListRequired");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyGuestInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PropertiesPropertyIdGet200ResponsePropertyGuestInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertiesPropertyIdGet200ResponsePropertyGuestInfo is not found in the empty JSON string", PropertiesPropertyIdGet200ResponsePropertyGuestInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PropertiesPropertyIdGet200ResponsePropertyGuestInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertiesPropertyIdGet200ResponsePropertyGuestInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertiesPropertyIdGet200ResponsePropertyGuestInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesPropertyIdGet200ResponsePropertyGuestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesPropertyIdGet200ResponsePropertyGuestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyGuestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesPropertyIdGet200ResponsePropertyGuestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyGuestInfo>() {
           @Override
           public void write(JsonWriter out, PropertiesPropertyIdGet200ResponsePropertyGuestInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesPropertyIdGet200ResponsePropertyGuestInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesPropertyIdGet200ResponsePropertyGuestInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesPropertyIdGet200ResponsePropertyGuestInfo
  * @throws IOException if the JSON string is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyGuestInfo
  */
  public static PropertiesPropertyIdGet200ResponsePropertyGuestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesPropertyIdGet200ResponsePropertyGuestInfo.class);
  }

 /**
  * Convert an instance of PropertiesPropertyIdGet200ResponsePropertyGuestInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


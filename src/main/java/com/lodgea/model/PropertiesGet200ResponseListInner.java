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
import java.io.IOException;
import java.math.BigDecimal;

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
 * PropertiesGet200ResponseListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class PropertiesGet200ResponseListInner {
  public static final String SERIALIZED_NAME_PUBLISHED = "published";
  @SerializedName(SERIALIZED_NAME_PUBLISHED)
  private Boolean published;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROPERTY_ID = "propertyId";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private String propertyId;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private BigDecimal lastUpdated;

  public PropertiesGet200ResponseListInner() {
  }

  public PropertiesGet200ResponseListInner published(Boolean published) {
    
    this.published = published;
    return this;
  }

   /**
   * Whether the property is in published state.
   * @return published
  **/
  @javax.annotation.Nonnull

  public Boolean getPublished() {
    return published;
  }


  public void setPublished(Boolean published) {
    this.published = published;
  }


  public PropertiesGet200ResponseListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the property.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PropertiesGet200ResponseListInner propertyId(String propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * The unique identifier for the property.
   * @return propertyId
  **/
  @javax.annotation.Nonnull

  public String getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(String propertyId) {
    this.propertyId = propertyId;
  }


  public PropertiesGet200ResponseListInner image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * The file name of the image for the property.
   * @return image
  **/
  @javax.annotation.Nonnull

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public PropertiesGet200ResponseListInner address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The address of the property.
   * @return address
  **/
  @javax.annotation.Nonnull

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public PropertiesGet200ResponseListInner lastUpdated(BigDecimal lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The timestamp of the last update to the property (Unix in ms).
   * @return lastUpdated
  **/
  @javax.annotation.Nonnull

  public BigDecimal getLastUpdated() {
    return lastUpdated;
  }


  public void setLastUpdated(BigDecimal lastUpdated) {
    this.lastUpdated = lastUpdated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertiesGet200ResponseListInner propertiesGet200ResponseListInner = (PropertiesGet200ResponseListInner) o;
    return Objects.equals(this.published, propertiesGet200ResponseListInner.published) &&
        Objects.equals(this.name, propertiesGet200ResponseListInner.name) &&
        Objects.equals(this.propertyId, propertiesGet200ResponseListInner.propertyId) &&
        Objects.equals(this.image, propertiesGet200ResponseListInner.image) &&
        Objects.equals(this.address, propertiesGet200ResponseListInner.address) &&
        Objects.equals(this.lastUpdated, propertiesGet200ResponseListInner.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(published, name, propertyId, image, address, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesGet200ResponseListInner {\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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
    openapiFields.add("published");
    openapiFields.add("name");
    openapiFields.add("propertyId");
    openapiFields.add("image");
    openapiFields.add("address");
    openapiFields.add("lastUpdated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("published");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("propertyId");
    openapiRequiredFields.add("image");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("lastUpdated");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PropertiesGet200ResponseListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PropertiesGet200ResponseListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertiesGet200ResponseListInner is not found in the empty JSON string", PropertiesGet200ResponseListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PropertiesGet200ResponseListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertiesGet200ResponseListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertiesGet200ResponseListInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("propertyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propertyId").toString()));
      }
      if (!jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if (!jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesGet200ResponseListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesGet200ResponseListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesGet200ResponseListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesGet200ResponseListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesGet200ResponseListInner>() {
           @Override
           public void write(JsonWriter out, PropertiesGet200ResponseListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesGet200ResponseListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesGet200ResponseListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesGet200ResponseListInner
  * @throws IOException if the JSON string is invalid with respect to PropertiesGet200ResponseListInner
  */
  public static PropertiesGet200ResponseListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesGet200ResponseListInner.class);
  }

 /**
  * Convert an instance of PropertiesGet200ResponseListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

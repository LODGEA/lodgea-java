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
 * AvailablePropertiesInner1GeoLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class AvailablePropertiesInner1GeoLocation {
  public static final String SERIALIZED_NAME_LNG = "lng";
  @SerializedName(SERIALIZED_NAME_LNG)
  private BigDecimal lng;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private BigDecimal lat;

  public AvailablePropertiesInner1GeoLocation() {
  }

  public AvailablePropertiesInner1GeoLocation lng(BigDecimal lng) {
    
    this.lng = lng;
    return this;
  }

   /**
   * The longitude coordinate of the location.
   * @return lng
  **/
  @javax.annotation.Nonnull

  public BigDecimal getLng() {
    return lng;
  }


  public void setLng(BigDecimal lng) {
    this.lng = lng;
  }


  public AvailablePropertiesInner1GeoLocation lat(BigDecimal lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * The location of the property as coordinates
   * @return lat
  **/
  @javax.annotation.Nonnull

  public BigDecimal getLat() {
    return lat;
  }


  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailablePropertiesInner1GeoLocation availablePropertiesInner1GeoLocation = (AvailablePropertiesInner1GeoLocation) o;
    return Objects.equals(this.lng, availablePropertiesInner1GeoLocation.lng) &&
        Objects.equals(this.lat, availablePropertiesInner1GeoLocation.lat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lng, lat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailablePropertiesInner1GeoLocation {\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
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
    openapiFields.add("lng");
    openapiFields.add("lat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lng");
    openapiRequiredFields.add("lat");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AvailablePropertiesInner1GeoLocation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AvailablePropertiesInner1GeoLocation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailablePropertiesInner1GeoLocation is not found in the empty JSON string", AvailablePropertiesInner1GeoLocation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AvailablePropertiesInner1GeoLocation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailablePropertiesInner1GeoLocation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AvailablePropertiesInner1GeoLocation.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailablePropertiesInner1GeoLocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailablePropertiesInner1GeoLocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailablePropertiesInner1GeoLocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailablePropertiesInner1GeoLocation.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailablePropertiesInner1GeoLocation>() {
           @Override
           public void write(JsonWriter out, AvailablePropertiesInner1GeoLocation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailablePropertiesInner1GeoLocation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AvailablePropertiesInner1GeoLocation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvailablePropertiesInner1GeoLocation
  * @throws IOException if the JSON string is invalid with respect to AvailablePropertiesInner1GeoLocation
  */
  public static AvailablePropertiesInner1GeoLocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailablePropertiesInner1GeoLocation.class);
  }

 /**
  * Convert an instance of AvailablePropertiesInner1GeoLocation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

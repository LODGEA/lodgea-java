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
 * V1AvailabilitySearchPost200ResponseListInnerGeoLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-24T11:37:52.194432653Z[Etc/UTC]")
public class V1AvailabilitySearchPost200ResponseListInnerGeoLocation {
  public static final String SERIALIZED_NAME_LNG = "lng";
  @SerializedName(SERIALIZED_NAME_LNG)
  private BigDecimal lng;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private BigDecimal lat;

  public V1AvailabilitySearchPost200ResponseListInnerGeoLocation() { 
  }

  public V1AvailabilitySearchPost200ResponseListInnerGeoLocation lng(BigDecimal lng) {
    
    this.lng = lng;
    return this;
  }

   /**
   * Get lng
   * @return lng
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.3339872", value = "")

  public BigDecimal getLng() {
    return lng;
  }


  public void setLng(BigDecimal lng) {
    this.lng = lng;
  }


  public V1AvailabilitySearchPost200ResponseListInnerGeoLocation lat(BigDecimal lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * Get lat
   * @return lat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "54.8962436", value = "")

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
    V1AvailabilitySearchPost200ResponseListInnerGeoLocation v1AvailabilitySearchPost200ResponseListInnerGeoLocation = (V1AvailabilitySearchPost200ResponseListInnerGeoLocation) o;
    return Objects.equals(this.lng, v1AvailabilitySearchPost200ResponseListInnerGeoLocation.lng) &&
        Objects.equals(this.lat, v1AvailabilitySearchPost200ResponseListInnerGeoLocation.lat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lng, lat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AvailabilitySearchPost200ResponseListInnerGeoLocation {\n");
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
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1AvailabilitySearchPost200ResponseListInnerGeoLocation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1AvailabilitySearchPost200ResponseListInnerGeoLocation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AvailabilitySearchPost200ResponseListInnerGeoLocation is not found in the empty JSON string", V1AvailabilitySearchPost200ResponseListInnerGeoLocation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1AvailabilitySearchPost200ResponseListInnerGeoLocation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AvailabilitySearchPost200ResponseListInnerGeoLocation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AvailabilitySearchPost200ResponseListInnerGeoLocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AvailabilitySearchPost200ResponseListInnerGeoLocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AvailabilitySearchPost200ResponseListInnerGeoLocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AvailabilitySearchPost200ResponseListInnerGeoLocation.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AvailabilitySearchPost200ResponseListInnerGeoLocation>() {
           @Override
           public void write(JsonWriter out, V1AvailabilitySearchPost200ResponseListInnerGeoLocation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AvailabilitySearchPost200ResponseListInnerGeoLocation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1AvailabilitySearchPost200ResponseListInnerGeoLocation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1AvailabilitySearchPost200ResponseListInnerGeoLocation
  * @throws IOException if the JSON string is invalid with respect to V1AvailabilitySearchPost200ResponseListInnerGeoLocation
  */
  public static V1AvailabilitySearchPost200ResponseListInnerGeoLocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AvailabilitySearchPost200ResponseListInnerGeoLocation.class);
  }

 /**
  * Convert an instance of V1AvailabilitySearchPost200ResponseListInnerGeoLocation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


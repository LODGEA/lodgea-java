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
import com.lodgea.model.V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance;
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
 * V1AvailabilitySearchPost200ResponseListInnerAttractionListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-24T11:46:35.796667073Z[Etc/UTC]")
public class V1AvailabilitySearchPost200ResponseListInnerAttractionListInner {
  public static final String SERIALIZED_NAME_TYPE_CODE = "typeCode";
  @SerializedName(SERIALIZED_NAME_TYPE_CODE)
  private BigDecimal typeCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance distance;

  public V1AvailabilitySearchPost200ResponseListInnerAttractionListInner() { 
  }

  public V1AvailabilitySearchPost200ResponseListInnerAttractionListInner typeCode(BigDecimal typeCode) {
    
    this.typeCode = typeCode;
    return this;
  }

   /**
   * Get typeCode
   * @return typeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public BigDecimal getTypeCode() {
    return typeCode;
  }


  public void setTypeCode(BigDecimal typeCode) {
    this.typeCode = typeCode;
  }


  public V1AvailabilitySearchPost200ResponseListInnerAttractionListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Flughafen Sylt", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1AvailabilitySearchPost200ResponseListInnerAttractionListInner distance(V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance getDistance() {
    return distance;
  }


  public void setDistance(V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance distance) {
    this.distance = distance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AvailabilitySearchPost200ResponseListInnerAttractionListInner v1AvailabilitySearchPost200ResponseListInnerAttractionListInner = (V1AvailabilitySearchPost200ResponseListInnerAttractionListInner) o;
    return Objects.equals(this.typeCode, v1AvailabilitySearchPost200ResponseListInnerAttractionListInner.typeCode) &&
        Objects.equals(this.name, v1AvailabilitySearchPost200ResponseListInnerAttractionListInner.name) &&
        Objects.equals(this.distance, v1AvailabilitySearchPost200ResponseListInnerAttractionListInner.distance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeCode, name, distance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AvailabilitySearchPost200ResponseListInnerAttractionListInner {\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
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
    openapiFields.add("typeCode");
    openapiFields.add("name");
    openapiFields.add("distance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1AvailabilitySearchPost200ResponseListInnerAttractionListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1AvailabilitySearchPost200ResponseListInnerAttractionListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AvailabilitySearchPost200ResponseListInnerAttractionListInner is not found in the empty JSON string", V1AvailabilitySearchPost200ResponseListInnerAttractionListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1AvailabilitySearchPost200ResponseListInnerAttractionListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AvailabilitySearchPost200ResponseListInnerAttractionListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `distance`
      if (jsonObj.getAsJsonObject("distance") != null) {
        V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance.validateJsonObject(jsonObj.getAsJsonObject("distance"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AvailabilitySearchPost200ResponseListInnerAttractionListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AvailabilitySearchPost200ResponseListInnerAttractionListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AvailabilitySearchPost200ResponseListInnerAttractionListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AvailabilitySearchPost200ResponseListInnerAttractionListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AvailabilitySearchPost200ResponseListInnerAttractionListInner>() {
           @Override
           public void write(JsonWriter out, V1AvailabilitySearchPost200ResponseListInnerAttractionListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AvailabilitySearchPost200ResponseListInnerAttractionListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1AvailabilitySearchPost200ResponseListInnerAttractionListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1AvailabilitySearchPost200ResponseListInnerAttractionListInner
  * @throws IOException if the JSON string is invalid with respect to V1AvailabilitySearchPost200ResponseListInnerAttractionListInner
  */
  public static V1AvailabilitySearchPost200ResponseListInnerAttractionListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AvailabilitySearchPost200ResponseListInnerAttractionListInner.class);
  }

 /**
  * Convert an instance of V1AvailabilitySearchPost200ResponseListInnerAttractionListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

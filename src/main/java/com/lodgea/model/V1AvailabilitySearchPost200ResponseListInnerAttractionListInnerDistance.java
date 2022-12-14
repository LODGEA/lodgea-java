/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.0.2
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
 * V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-08T10:01:38.583514510Z[Etc/UTC]")
public class V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance() { 
  }

  public V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2800", value = "")

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "m", value = "")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance v1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance = (V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance) o;
    return Objects.equals(this.value, v1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance.value) &&
        Objects.equals(this.unit, v1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance is not found in the empty JSON string", V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance>() {
           @Override
           public void write(JsonWriter out, V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance
  * @throws IOException if the JSON string is invalid with respect to V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance
  */
  public static V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance.class);
  }

 /**
  * Convert an instance of V1AvailabilitySearchPost200ResponseListInnerAttractionListInnerDistance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


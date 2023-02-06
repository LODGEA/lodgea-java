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
 * The distance from the property to this attraction. Whether this is road or air distance is not clearly defined as the values are entered by the tenants admins.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class AvailablePropertiesInner1AttractionListInnerDistance {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  /**
   * The unit of the value of the distance.
   */
  @JsonAdapter(UnitEnum.Adapter.class)
  public enum UnitEnum {
    M("m"),
    
    FT("ft");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UnitEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private UnitEnum unit;

  public AvailablePropertiesInner1AttractionListInnerDistance() {
  }

  public AvailablePropertiesInner1AttractionListInnerDistance value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * The numeric value of the distance.
   * @return value
  **/
  @javax.annotation.Nonnull

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public AvailablePropertiesInner1AttractionListInnerDistance unit(UnitEnum unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * The unit of the value of the distance.
   * @return unit
  **/
  @javax.annotation.Nonnull

  public UnitEnum getUnit() {
    return unit;
  }


  public void setUnit(UnitEnum unit) {
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
    AvailablePropertiesInner1AttractionListInnerDistance availablePropertiesInner1AttractionListInnerDistance = (AvailablePropertiesInner1AttractionListInnerDistance) o;
    return Objects.equals(this.value, availablePropertiesInner1AttractionListInnerDistance.value) &&
        Objects.equals(this.unit, availablePropertiesInner1AttractionListInnerDistance.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailablePropertiesInner1AttractionListInnerDistance {\n");
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
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("unit");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AvailablePropertiesInner1AttractionListInnerDistance
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AvailablePropertiesInner1AttractionListInnerDistance.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailablePropertiesInner1AttractionListInnerDistance is not found in the empty JSON string", AvailablePropertiesInner1AttractionListInnerDistance.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AvailablePropertiesInner1AttractionListInnerDistance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailablePropertiesInner1AttractionListInnerDistance` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AvailablePropertiesInner1AttractionListInnerDistance.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailablePropertiesInner1AttractionListInnerDistance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailablePropertiesInner1AttractionListInnerDistance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailablePropertiesInner1AttractionListInnerDistance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailablePropertiesInner1AttractionListInnerDistance.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailablePropertiesInner1AttractionListInnerDistance>() {
           @Override
           public void write(JsonWriter out, AvailablePropertiesInner1AttractionListInnerDistance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailablePropertiesInner1AttractionListInnerDistance read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AvailablePropertiesInner1AttractionListInnerDistance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvailablePropertiesInner1AttractionListInnerDistance
  * @throws IOException if the JSON string is invalid with respect to AvailablePropertiesInner1AttractionListInnerDistance
  */
  public static AvailablePropertiesInner1AttractionListInnerDistance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailablePropertiesInner1AttractionListInnerDistance.class);
  }

 /**
  * Convert an instance of AvailablePropertiesInner1AttractionListInnerDistance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


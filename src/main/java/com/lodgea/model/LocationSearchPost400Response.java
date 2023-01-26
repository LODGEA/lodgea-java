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
import com.lodgea.model.LocationSearchPost400ResponseValidationErrorsInner;
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
 * LocationSearchPost400Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-26T16:09:38.541455406Z[Etc/UTC]")
public class LocationSearchPost400Response {
  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "validationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private List<LocationSearchPost400ResponseValidationErrorsInner> validationErrors = new ArrayList<>();

  public LocationSearchPost400Response() { 
  }

  public LocationSearchPost400Response validationErrors(List<LocationSearchPost400ResponseValidationErrorsInner> validationErrors) {
    
    this.validationErrors = validationErrors;
    return this;
  }

  public LocationSearchPost400Response addValidationErrorsItem(LocationSearchPost400ResponseValidationErrorsInner validationErrorsItem) {
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Get validationErrors
   * @return validationErrors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<LocationSearchPost400ResponseValidationErrorsInner> getValidationErrors() {
    return validationErrors;
  }


  public void setValidationErrors(List<LocationSearchPost400ResponseValidationErrorsInner> validationErrors) {
    this.validationErrors = validationErrors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationSearchPost400Response locationSearchPost400Response = (LocationSearchPost400Response) o;
    return Objects.equals(this.validationErrors, locationSearchPost400Response.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationSearchPost400Response {\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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
    openapiFields.add("validationErrors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("validationErrors");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LocationSearchPost400Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LocationSearchPost400Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocationSearchPost400Response is not found in the empty JSON string", LocationSearchPost400Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LocationSearchPost400Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LocationSearchPost400Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LocationSearchPost400Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayvalidationErrors = jsonObj.getAsJsonArray("validationErrors");
      if (jsonArrayvalidationErrors != null) {
        // ensure the json data is an array
        if (!jsonObj.get("validationErrors").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `validationErrors` to be an array in the JSON string but got `%s`", jsonObj.get("validationErrors").toString()));
        }

        // validate the optional field `validationErrors` (array)
        for (int i = 0; i < jsonArrayvalidationErrors.size(); i++) {
          LocationSearchPost400ResponseValidationErrorsInner.validateJsonObject(jsonArrayvalidationErrors.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocationSearchPost400Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocationSearchPost400Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocationSearchPost400Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocationSearchPost400Response.class));

       return (TypeAdapter<T>) new TypeAdapter<LocationSearchPost400Response>() {
           @Override
           public void write(JsonWriter out, LocationSearchPost400Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocationSearchPost400Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocationSearchPost400Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocationSearchPost400Response
  * @throws IOException if the JSON string is invalid with respect to LocationSearchPost400Response
  */
  public static LocationSearchPost400Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocationSearchPost400Response.class);
  }

 /**
  * Convert an instance of LocationSearchPost400Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * Contains information about the pets policy of the property
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy {
  public static final String SERIALIZED_NAME_ALLOWED = "allowed";
  @SerializedName(SERIALIZED_NAME_ALLOWED)
  private Boolean allowed;

  public static final String SERIALIZED_NAME_BY_ARRANGEMENT = "byArrangement";
  @SerializedName(SERIALIZED_NAME_BY_ARRANGEMENT)
  private Boolean byArrangement;

  public static final String SERIALIZED_NAME_FREE_OF_CHARGE = "freeOfCharge";
  @SerializedName(SERIALIZED_NAME_FREE_OF_CHARGE)
  private Boolean freeOfCharge;

  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy() {
  }

  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy allowed(Boolean allowed) {
    
    this.allowed = allowed;
    return this;
  }

   /**
   * Indicates if pets are allowed in the property.
   * @return allowed
  **/
  @javax.annotation.Nonnull

  public Boolean getAllowed() {
    return allowed;
  }


  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }


  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy byArrangement(Boolean byArrangement) {
    
    this.byArrangement = byArrangement;
    return this;
  }

   /**
   * Indicates if pets are allowed by arrangement.
   * @return byArrangement
  **/
  @javax.annotation.Nonnull

  public Boolean getByArrangement() {
    return byArrangement;
  }


  public void setByArrangement(Boolean byArrangement) {
    this.byArrangement = byArrangement;
  }


  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy freeOfCharge(Boolean freeOfCharge) {
    
    this.freeOfCharge = freeOfCharge;
    return this;
  }

   /**
   * Indicates if pets are allowed without any additional charge.
   * @return freeOfCharge
  **/
  @javax.annotation.Nonnull

  public Boolean getFreeOfCharge() {
    return freeOfCharge;
  }


  public void setFreeOfCharge(Boolean freeOfCharge) {
    this.freeOfCharge = freeOfCharge;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy propertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy = (PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy) o;
    return Objects.equals(this.allowed, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy.allowed) &&
        Objects.equals(this.byArrangement, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy.byArrangement) &&
        Objects.equals(this.freeOfCharge, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy.freeOfCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, byArrangement, freeOfCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    byArrangement: ").append(toIndentedString(byArrangement)).append("\n");
    sb.append("    freeOfCharge: ").append(toIndentedString(freeOfCharge)).append("\n");
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
    openapiFields.add("allowed");
    openapiFields.add("byArrangement");
    openapiFields.add("freeOfCharge");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("allowed");
    openapiRequiredFields.add("byArrangement");
    openapiRequiredFields.add("freeOfCharge");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy is not found in the empty JSON string", PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy>() {
           @Override
           public void write(JsonWriter out, PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy
  * @throws IOException if the JSON string is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy
  */
  public static PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy.class);
  }

 /**
  * Convert an instance of PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerPetsPolicy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

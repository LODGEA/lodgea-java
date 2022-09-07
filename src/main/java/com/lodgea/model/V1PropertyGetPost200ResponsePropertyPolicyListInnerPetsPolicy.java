/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.0.1
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
 * V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:05:49.716494803Z[Etc/UTC]")
public class V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy {
  public static final String SERIALIZED_NAME_ALLOWED = "allowed";
  @SerializedName(SERIALIZED_NAME_ALLOWED)
  private Boolean allowed;

  public static final String SERIALIZED_NAME_BY_ARRANGEMENT = "byArrangement";
  @SerializedName(SERIALIZED_NAME_BY_ARRANGEMENT)
  private Boolean byArrangement;

  public static final String SERIALIZED_NAME_FREE_OF_CHARGE = "freeOfCharge";
  @SerializedName(SERIALIZED_NAME_FREE_OF_CHARGE)
  private Boolean freeOfCharge;

  public V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy() { 
  }

  public V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy allowed(Boolean allowed) {
    
    this.allowed = allowed;
    return this;
  }

   /**
   * Get allowed
   * @return allowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowed() {
    return allowed;
  }


  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }


  public V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy byArrangement(Boolean byArrangement) {
    
    this.byArrangement = byArrangement;
    return this;
  }

   /**
   * Get byArrangement
   * @return byArrangement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getByArrangement() {
    return byArrangement;
  }


  public void setByArrangement(Boolean byArrangement) {
    this.byArrangement = byArrangement;
  }


  public V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy freeOfCharge(Boolean freeOfCharge) {
    
    this.freeOfCharge = freeOfCharge;
    return this;
  }

   /**
   * Get freeOfCharge
   * @return freeOfCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy v1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy = (V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy) o;
    return Objects.equals(this.allowed, v1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy.allowed) &&
        Objects.equals(this.byArrangement, v1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy.byArrangement) &&
        Objects.equals(this.freeOfCharge, v1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy.freeOfCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, byArrangement, freeOfCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy {\n");
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
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy is not found in the empty JSON string", V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy
  */
  public static V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponsePropertyPolicyListInnerPetsPolicy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


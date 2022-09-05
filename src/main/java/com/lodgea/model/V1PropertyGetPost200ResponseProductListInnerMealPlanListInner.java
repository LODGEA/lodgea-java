/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.0.0
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
 * V1PropertyGetPost200ResponseProductListInnerMealPlanListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-05T16:14:26.477802845Z[Etc/UTC]")
public class V1PropertyGetPost200ResponseProductListInnerMealPlanListInner {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private BigDecimal code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V1PropertyGetPost200ResponseProductListInnerMealPlanListInner() { 
  }

  public V1PropertyGetPost200ResponseProductListInnerMealPlanListInner code(BigDecimal code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14", value = "")

  public BigDecimal getCode() {
    return code;
  }


  public void setCode(BigDecimal code) {
    this.code = code;
  }


  public V1PropertyGetPost200ResponseProductListInnerMealPlanListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Room only", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponseProductListInnerMealPlanListInner v1PropertyGetPost200ResponseProductListInnerMealPlanListInner = (V1PropertyGetPost200ResponseProductListInnerMealPlanListInner) o;
    return Objects.equals(this.code, v1PropertyGetPost200ResponseProductListInnerMealPlanListInner.code) &&
        Objects.equals(this.name, v1PropertyGetPost200ResponseProductListInnerMealPlanListInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponseProductListInnerMealPlanListInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponseProductListInnerMealPlanListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponseProductListInnerMealPlanListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponseProductListInnerMealPlanListInner is not found in the empty JSON string", V1PropertyGetPost200ResponseProductListInnerMealPlanListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponseProductListInnerMealPlanListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponseProductListInnerMealPlanListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponseProductListInnerMealPlanListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponseProductListInnerMealPlanListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponseProductListInnerMealPlanListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponseProductListInnerMealPlanListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponseProductListInnerMealPlanListInner>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponseProductListInnerMealPlanListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponseProductListInnerMealPlanListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponseProductListInnerMealPlanListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponseProductListInnerMealPlanListInner
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponseProductListInnerMealPlanListInner
  */
  public static V1PropertyGetPost200ResponseProductListInnerMealPlanListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponseProductListInnerMealPlanListInner.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponseProductListInnerMealPlanListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * V1LocationSearchPost200ResponseListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-24T11:37:52.194432653Z[Etc/UTC]")
public class V1LocationSearchPost200ResponseListInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_LOWEST_PRICE = "lowestPrice";
  @SerializedName(SERIALIZED_NAME_LOWEST_PRICE)
  private BigDecimal lowestPrice;

  public static final String SERIALIZED_NAME_PROPERTY_ID = "propertyId";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private String propertyId;

  public static final String SERIALIZED_NAME_PROPERTY_URI_NAME = "propertyUriName";
  @SerializedName(SERIALIZED_NAME_PROPERTY_URI_NAME)
  private String propertyUriName;

  public static final String SERIALIZED_NAME_PROPERTY_URI_PATH = "propertyUriPath";
  @SerializedName(SERIALIZED_NAME_PROPERTY_URI_PATH)
  private String propertyUriPath;

  public V1LocationSearchPost200ResponseListInner() { 
  }

  public V1LocationSearchPost200ResponseListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Landhaus Treskersand", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1LocationSearchPost200ResponseListInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "property", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public V1LocationSearchPost200ResponseListInner currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EUR", value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public V1LocationSearchPost200ResponseListInner lowestPrice(BigDecimal lowestPrice) {
    
    this.lowestPrice = lowestPrice;
    return this;
  }

   /**
   * Get lowestPrice
   * @return lowestPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "49", value = "")

  public BigDecimal getLowestPrice() {
    return lowestPrice;
  }


  public void setLowestPrice(BigDecimal lowestPrice) {
    this.lowestPrice = lowestPrice;
  }


  public V1LocationSearchPost200ResponseListInner propertyId(String propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Get propertyId
   * @return propertyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dmo-demo:landhaus-treskersand", value = "")

  public String getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(String propertyId) {
    this.propertyId = propertyId;
  }


  public V1LocationSearchPost200ResponseListInner propertyUriName(String propertyUriName) {
    
    this.propertyUriName = propertyUriName;
    return this;
  }

   /**
   * Get propertyUriName
   * @return propertyUriName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "landhaus-treskersand", value = "")

  public String getPropertyUriName() {
    return propertyUriName;
  }


  public void setPropertyUriName(String propertyUriName) {
    this.propertyUriName = propertyUriName;
  }


  public V1LocationSearchPost200ResponseListInner propertyUriPath(String propertyUriPath) {
    
    this.propertyUriPath = propertyUriPath;
    return this;
  }

   /**
   * Get propertyUriPath
   * @return propertyUriPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en:germany/schleswig-holstein/nordfriesland/sylt/tinnum/landhaus-treskersand", value = "")

  public String getPropertyUriPath() {
    return propertyUriPath;
  }


  public void setPropertyUriPath(String propertyUriPath) {
    this.propertyUriPath = propertyUriPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LocationSearchPost200ResponseListInner v1LocationSearchPost200ResponseListInner = (V1LocationSearchPost200ResponseListInner) o;
    return Objects.equals(this.name, v1LocationSearchPost200ResponseListInner.name) &&
        Objects.equals(this.type, v1LocationSearchPost200ResponseListInner.type) &&
        Objects.equals(this.currencyCode, v1LocationSearchPost200ResponseListInner.currencyCode) &&
        Objects.equals(this.lowestPrice, v1LocationSearchPost200ResponseListInner.lowestPrice) &&
        Objects.equals(this.propertyId, v1LocationSearchPost200ResponseListInner.propertyId) &&
        Objects.equals(this.propertyUriName, v1LocationSearchPost200ResponseListInner.propertyUriName) &&
        Objects.equals(this.propertyUriPath, v1LocationSearchPost200ResponseListInner.propertyUriPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, currencyCode, lowestPrice, propertyId, propertyUriName, propertyUriPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LocationSearchPost200ResponseListInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    lowestPrice: ").append(toIndentedString(lowestPrice)).append("\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    propertyUriName: ").append(toIndentedString(propertyUriName)).append("\n");
    sb.append("    propertyUriPath: ").append(toIndentedString(propertyUriPath)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("currencyCode");
    openapiFields.add("lowestPrice");
    openapiFields.add("propertyId");
    openapiFields.add("propertyUriName");
    openapiFields.add("propertyUriPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1LocationSearchPost200ResponseListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1LocationSearchPost200ResponseListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1LocationSearchPost200ResponseListInner is not found in the empty JSON string", V1LocationSearchPost200ResponseListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1LocationSearchPost200ResponseListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1LocationSearchPost200ResponseListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if (jsonObj.get("propertyId") != null && !jsonObj.get("propertyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propertyId").toString()));
      }
      if (jsonObj.get("propertyUriName") != null && !jsonObj.get("propertyUriName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyUriName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propertyUriName").toString()));
      }
      if (jsonObj.get("propertyUriPath") != null && !jsonObj.get("propertyUriPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyUriPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propertyUriPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1LocationSearchPost200ResponseListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1LocationSearchPost200ResponseListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1LocationSearchPost200ResponseListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1LocationSearchPost200ResponseListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1LocationSearchPost200ResponseListInner>() {
           @Override
           public void write(JsonWriter out, V1LocationSearchPost200ResponseListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1LocationSearchPost200ResponseListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1LocationSearchPost200ResponseListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1LocationSearchPost200ResponseListInner
  * @throws IOException if the JSON string is invalid with respect to V1LocationSearchPost200ResponseListInner
  */
  public static V1LocationSearchPost200ResponseListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1LocationSearchPost200ResponseListInner.class);
  }

 /**
  * Convert an instance of V1LocationSearchPost200ResponseListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


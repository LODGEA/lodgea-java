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
import com.lodgea.model.PropertiesPropertyIdGet200ResponseProductListInner;
import com.lodgea.model.PropertiesPropertyIdGet200ResponseProperty;
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
 * PropertiesPropertyIdGet200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-26T16:09:38.541455406Z[Etc/UTC]")
public class PropertiesPropertyIdGet200Response {
  public static final String SERIALIZED_NAME_PROPERTY = "property";
  @SerializedName(SERIALIZED_NAME_PROPERTY)
  private PropertiesPropertyIdGet200ResponseProperty property;

  public static final String SERIALIZED_NAME_PRODUCT_LIST = "productList";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LIST)
  private List<PropertiesPropertyIdGet200ResponseProductListInner> productList = new ArrayList<>();

  public PropertiesPropertyIdGet200Response() { 
  }

  public PropertiesPropertyIdGet200Response property(PropertiesPropertyIdGet200ResponseProperty property) {
    
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PropertiesPropertyIdGet200ResponseProperty getProperty() {
    return property;
  }


  public void setProperty(PropertiesPropertyIdGet200ResponseProperty property) {
    this.property = property;
  }


  public PropertiesPropertyIdGet200Response productList(List<PropertiesPropertyIdGet200ResponseProductListInner> productList) {
    
    this.productList = productList;
    return this;
  }

  public PropertiesPropertyIdGet200Response addProductListItem(PropertiesPropertyIdGet200ResponseProductListInner productListItem) {
    this.productList.add(productListItem);
    return this;
  }

   /**
   * Get productList
   * @return productList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<PropertiesPropertyIdGet200ResponseProductListInner> getProductList() {
    return productList;
  }


  public void setProductList(List<PropertiesPropertyIdGet200ResponseProductListInner> productList) {
    this.productList = productList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertiesPropertyIdGet200Response propertiesPropertyIdGet200Response = (PropertiesPropertyIdGet200Response) o;
    return Objects.equals(this.property, propertiesPropertyIdGet200Response.property) &&
        Objects.equals(this.productList, propertiesPropertyIdGet200Response.productList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, productList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesPropertyIdGet200Response {\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    productList: ").append(toIndentedString(productList)).append("\n");
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
    openapiFields.add("property");
    openapiFields.add("productList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("property");
    openapiRequiredFields.add("productList");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PropertiesPropertyIdGet200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PropertiesPropertyIdGet200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertiesPropertyIdGet200Response is not found in the empty JSON string", PropertiesPropertyIdGet200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PropertiesPropertyIdGet200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertiesPropertyIdGet200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertiesPropertyIdGet200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `property`
      if (jsonObj.getAsJsonObject("property") != null) {
        PropertiesPropertyIdGet200ResponseProperty.validateJsonObject(jsonObj.getAsJsonObject("property"));
      }
      JsonArray jsonArrayproductList = jsonObj.getAsJsonArray("productList");
      if (jsonArrayproductList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("productList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `productList` to be an array in the JSON string but got `%s`", jsonObj.get("productList").toString()));
        }

        // validate the optional field `productList` (array)
        for (int i = 0; i < jsonArrayproductList.size(); i++) {
          PropertiesPropertyIdGet200ResponseProductListInner.validateJsonObject(jsonArrayproductList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesPropertyIdGet200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesPropertyIdGet200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesPropertyIdGet200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesPropertyIdGet200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesPropertyIdGet200Response>() {
           @Override
           public void write(JsonWriter out, PropertiesPropertyIdGet200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesPropertyIdGet200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesPropertyIdGet200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesPropertyIdGet200Response
  * @throws IOException if the JSON string is invalid with respect to PropertiesPropertyIdGet200Response
  */
  public static PropertiesPropertyIdGet200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesPropertyIdGet200Response.class);
  }

 /**
  * Convert an instance of PropertiesPropertyIdGet200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


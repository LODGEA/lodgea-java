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
import com.lodgea.model.V1PropertyGetPost200ResponseProductListInner;
import com.lodgea.model.V1PropertyGetPost200ResponseProperty;
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
 * V1PropertyGetPost200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:37:29.796161556Z[Etc/UTC]")
public class V1PropertyGetPost200Response {
  public static final String SERIALIZED_NAME_VERSION_ID = "versionId";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private String versionId;

  public static final String SERIALIZED_NAME_PROPERTY = "property";
  @SerializedName(SERIALIZED_NAME_PROPERTY)
  private V1PropertyGetPost200ResponseProperty property;

  public static final String SERIALIZED_NAME_PRODUCT_LIST = "productList";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LIST)
  private List<V1PropertyGetPost200ResponseProductListInner> productList = null;

  public V1PropertyGetPost200Response() { 
  }

  public V1PropertyGetPost200Response versionId(String versionId) {
    
    this.versionId = versionId;
    return this;
  }

   /**
   * Get versionId
   * @return versionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionId() {
    return versionId;
  }


  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  public V1PropertyGetPost200Response property(V1PropertyGetPost200ResponseProperty property) {
    
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponseProperty getProperty() {
    return property;
  }


  public void setProperty(V1PropertyGetPost200ResponseProperty property) {
    this.property = property;
  }


  public V1PropertyGetPost200Response productList(List<V1PropertyGetPost200ResponseProductListInner> productList) {
    
    this.productList = productList;
    return this;
  }

  public V1PropertyGetPost200Response addProductListItem(V1PropertyGetPost200ResponseProductListInner productListItem) {
    if (this.productList == null) {
      this.productList = new ArrayList<>();
    }
    this.productList.add(productListItem);
    return this;
  }

   /**
   * Get productList
   * @return productList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponseProductListInner> getProductList() {
    return productList;
  }


  public void setProductList(List<V1PropertyGetPost200ResponseProductListInner> productList) {
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
    V1PropertyGetPost200Response v1PropertyGetPost200Response = (V1PropertyGetPost200Response) o;
    return Objects.equals(this.versionId, v1PropertyGetPost200Response.versionId) &&
        Objects.equals(this.property, v1PropertyGetPost200Response.property) &&
        Objects.equals(this.productList, v1PropertyGetPost200Response.productList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionId, property, productList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200Response {\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
    openapiFields.add("versionId");
    openapiFields.add("property");
    openapiFields.add("productList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200Response is not found in the empty JSON string", V1PropertyGetPost200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("versionId") != null && !jsonObj.get("versionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionId").toString()));
      }
      // validate the optional field `property`
      if (jsonObj.getAsJsonObject("property") != null) {
        V1PropertyGetPost200ResponseProperty.validateJsonObject(jsonObj.getAsJsonObject("property"));
      }
      JsonArray jsonArrayproductList = jsonObj.getAsJsonArray("productList");
      if (jsonArrayproductList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("productList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `productList` to be an array in the JSON string but got `%s`", jsonObj.get("productList").toString()));
        }

        // validate the optional field `productList` (array)
        for (int i = 0; i < jsonArrayproductList.size(); i++) {
          V1PropertyGetPost200ResponseProductListInner.validateJsonObject(jsonArrayproductList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200Response>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200Response
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200Response
  */
  public static V1PropertyGetPost200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200Response.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


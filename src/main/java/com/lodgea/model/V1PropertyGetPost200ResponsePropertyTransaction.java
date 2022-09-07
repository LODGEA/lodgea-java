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
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyTransactionExternalListInner;
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
 * V1PropertyGetPost200ResponsePropertyTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:31:24.250712094Z[Etc/UTC]")
public class V1PropertyGetPost200ResponsePropertyTransaction {
  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_CONTACT_TYPE_LIST = "contactTypeList";
  @SerializedName(SERIALIZED_NAME_CONTACT_TYPE_LIST)
  private List<String> contactTypeList = null;

  public static final String SERIALIZED_NAME_EXTERNAL_LIST = "externalList";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_LIST)
  private List<V1PropertyGetPost200ResponsePropertyTransactionExternalListInner> externalList = null;

  public V1PropertyGetPost200ResponsePropertyTransaction() { 
  }

  public V1PropertyGetPost200ResponsePropertyTransaction method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MANDATORY_BOOKING", value = "")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public V1PropertyGetPost200ResponsePropertyTransaction contactTypeList(List<String> contactTypeList) {
    
    this.contactTypeList = contactTypeList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyTransaction addContactTypeListItem(String contactTypeListItem) {
    if (this.contactTypeList == null) {
      this.contactTypeList = new ArrayList<>();
    }
    this.contactTypeList.add(contactTypeListItem);
    return this;
  }

   /**
   * Get contactTypeList
   * @return contactTypeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getContactTypeList() {
    return contactTypeList;
  }


  public void setContactTypeList(List<String> contactTypeList) {
    this.contactTypeList = contactTypeList;
  }


  public V1PropertyGetPost200ResponsePropertyTransaction externalList(List<V1PropertyGetPost200ResponsePropertyTransactionExternalListInner> externalList) {
    
    this.externalList = externalList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyTransaction addExternalListItem(V1PropertyGetPost200ResponsePropertyTransactionExternalListInner externalListItem) {
    if (this.externalList == null) {
      this.externalList = new ArrayList<>();
    }
    this.externalList.add(externalListItem);
    return this;
  }

   /**
   * Get externalList
   * @return externalList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyTransactionExternalListInner> getExternalList() {
    return externalList;
  }


  public void setExternalList(List<V1PropertyGetPost200ResponsePropertyTransactionExternalListInner> externalList) {
    this.externalList = externalList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponsePropertyTransaction v1PropertyGetPost200ResponsePropertyTransaction = (V1PropertyGetPost200ResponsePropertyTransaction) o;
    return Objects.equals(this.method, v1PropertyGetPost200ResponsePropertyTransaction.method) &&
        Objects.equals(this.contactTypeList, v1PropertyGetPost200ResponsePropertyTransaction.contactTypeList) &&
        Objects.equals(this.externalList, v1PropertyGetPost200ResponsePropertyTransaction.externalList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, contactTypeList, externalList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponsePropertyTransaction {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    contactTypeList: ").append(toIndentedString(contactTypeList)).append("\n");
    sb.append("    externalList: ").append(toIndentedString(externalList)).append("\n");
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
    openapiFields.add("method");
    openapiFields.add("contactTypeList");
    openapiFields.add("externalList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponsePropertyTransaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponsePropertyTransaction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponsePropertyTransaction is not found in the empty JSON string", V1PropertyGetPost200ResponsePropertyTransaction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponsePropertyTransaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponsePropertyTransaction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("method") != null && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("contactTypeList") != null && !jsonObj.get("contactTypeList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contactTypeList` to be an array in the JSON string but got `%s`", jsonObj.get("contactTypeList").toString()));
      }
      JsonArray jsonArrayexternalList = jsonObj.getAsJsonArray("externalList");
      if (jsonArrayexternalList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("externalList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `externalList` to be an array in the JSON string but got `%s`", jsonObj.get("externalList").toString()));
        }

        // validate the optional field `externalList` (array)
        for (int i = 0; i < jsonArrayexternalList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyTransactionExternalListInner.validateJsonObject(jsonArrayexternalList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponsePropertyTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponsePropertyTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponsePropertyTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponsePropertyTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponsePropertyTransaction>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponsePropertyTransaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponsePropertyTransaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponsePropertyTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponsePropertyTransaction
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponsePropertyTransaction
  */
  public static V1PropertyGetPost200ResponsePropertyTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponsePropertyTransaction.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponsePropertyTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


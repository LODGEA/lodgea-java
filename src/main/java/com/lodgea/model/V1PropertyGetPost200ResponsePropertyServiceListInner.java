/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://docs.lodgea.io for more information.
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
 * V1PropertyGetPost200ResponsePropertyServiceListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-05T14:33:56.924929748Z[Etc/UTC]")
public class V1PropertyGetPost200ResponsePropertyServiceListInner {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private BigDecimal code;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_EXISTS = "exists";
  @SerializedName(SERIALIZED_NAME_EXISTS)
  private Boolean exists;

  public static final String SERIALIZED_NAME_INCLUDED = "included";
  @SerializedName(SERIALIZED_NAME_INCLUDED)
  private Boolean included;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_FEATURE_LIST = "featureList";
  @SerializedName(SERIALIZED_NAME_FEATURE_LIST)
  private List<String> featureList = null;

  public static final String SERIALIZED_NAME_TYPE_LIST = "typeList";
  @SerializedName(SERIALIZED_NAME_TYPE_LIST)
  private List<String> typeList = null;

  public static final String SERIALIZED_NAME_ITEM_LIST = "itemList";
  @SerializedName(SERIALIZED_NAME_ITEM_LIST)
  private List<String> itemList = null;

  public static final String SERIALIZED_NAME_OPERATION_TIME_LIST = "operationTimeList";
  @SerializedName(SERIALIZED_NAME_OPERATION_TIME_LIST)
  private List<String> operationTimeList = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V1PropertyGetPost200ResponsePropertyServiceListInner() { 
  }

  public V1PropertyGetPost200ResponsePropertyServiceListInner code(BigDecimal code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5015", value = "")

  public BigDecimal getCode() {
    return code;
  }


  public void setCode(BigDecimal code) {
    this.code = code;
  }


  public V1PropertyGetPost200ResponsePropertyServiceListInner price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public V1PropertyGetPost200ResponsePropertyServiceListInner exists(Boolean exists) {
    
    this.exists = exists;
    return this;
  }

   /**
   * Get exists
   * @return exists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExists() {
    return exists;
  }


  public void setExists(Boolean exists) {
    this.exists = exists;
  }


  public V1PropertyGetPost200ResponsePropertyServiceListInner included(Boolean included) {
    
    this.included = included;
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncluded() {
    return included;
  }


  public void setIncluded(Boolean included) {
    this.included = included;
  }


  public V1PropertyGetPost200ResponsePropertyServiceListInner currencyCode(String currencyCode) {
    
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


  public V1PropertyGetPost200ResponsePropertyServiceListInner featureList(List<String> featureList) {
    
    this.featureList = featureList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyServiceListInner addFeatureListItem(String featureListItem) {
    if (this.featureList == null) {
      this.featureList = new ArrayList<>();
    }
    this.featureList.add(featureListItem);
    return this;
  }

   /**
   * Get featureList
   * @return featureList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFeatureList() {
    return featureList;
  }


  public void setFeatureList(List<String> featureList) {
    this.featureList = featureList;
  }


  public V1PropertyGetPost200ResponsePropertyServiceListInner typeList(List<String> typeList) {
    
    this.typeList = typeList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyServiceListInner addTypeListItem(String typeListItem) {
    if (this.typeList == null) {
      this.typeList = new ArrayList<>();
    }
    this.typeList.add(typeListItem);
    return this;
  }

   /**
   * Get typeList
   * @return typeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTypeList() {
    return typeList;
  }


  public void setTypeList(List<String> typeList) {
    this.typeList = typeList;
  }


  public V1PropertyGetPost200ResponsePropertyServiceListInner itemList(List<String> itemList) {
    
    this.itemList = itemList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyServiceListInner addItemListItem(String itemListItem) {
    if (this.itemList == null) {
      this.itemList = new ArrayList<>();
    }
    this.itemList.add(itemListItem);
    return this;
  }

   /**
   * Get itemList
   * @return itemList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getItemList() {
    return itemList;
  }


  public void setItemList(List<String> itemList) {
    this.itemList = itemList;
  }


  public V1PropertyGetPost200ResponsePropertyServiceListInner operationTimeList(List<String> operationTimeList) {
    
    this.operationTimeList = operationTimeList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyServiceListInner addOperationTimeListItem(String operationTimeListItem) {
    if (this.operationTimeList == null) {
      this.operationTimeList = new ArrayList<>();
    }
    this.operationTimeList.add(operationTimeListItem);
    return this;
  }

   /**
   * Get operationTimeList
   * @return operationTimeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOperationTimeList() {
    return operationTimeList;
  }


  public void setOperationTimeList(List<String> operationTimeList) {
    this.operationTimeList = operationTimeList;
  }


  public V1PropertyGetPost200ResponsePropertyServiceListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Beach", value = "")

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
    V1PropertyGetPost200ResponsePropertyServiceListInner v1PropertyGetPost200ResponsePropertyServiceListInner = (V1PropertyGetPost200ResponsePropertyServiceListInner) o;
    return Objects.equals(this.code, v1PropertyGetPost200ResponsePropertyServiceListInner.code) &&
        Objects.equals(this.price, v1PropertyGetPost200ResponsePropertyServiceListInner.price) &&
        Objects.equals(this.exists, v1PropertyGetPost200ResponsePropertyServiceListInner.exists) &&
        Objects.equals(this.included, v1PropertyGetPost200ResponsePropertyServiceListInner.included) &&
        Objects.equals(this.currencyCode, v1PropertyGetPost200ResponsePropertyServiceListInner.currencyCode) &&
        Objects.equals(this.featureList, v1PropertyGetPost200ResponsePropertyServiceListInner.featureList) &&
        Objects.equals(this.typeList, v1PropertyGetPost200ResponsePropertyServiceListInner.typeList) &&
        Objects.equals(this.itemList, v1PropertyGetPost200ResponsePropertyServiceListInner.itemList) &&
        Objects.equals(this.operationTimeList, v1PropertyGetPost200ResponsePropertyServiceListInner.operationTimeList) &&
        Objects.equals(this.name, v1PropertyGetPost200ResponsePropertyServiceListInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, price, exists, included, currencyCode, featureList, typeList, itemList, operationTimeList, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponsePropertyServiceListInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    featureList: ").append(toIndentedString(featureList)).append("\n");
    sb.append("    typeList: ").append(toIndentedString(typeList)).append("\n");
    sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
    sb.append("    operationTimeList: ").append(toIndentedString(operationTimeList)).append("\n");
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
    openapiFields.add("price");
    openapiFields.add("exists");
    openapiFields.add("included");
    openapiFields.add("currencyCode");
    openapiFields.add("featureList");
    openapiFields.add("typeList");
    openapiFields.add("itemList");
    openapiFields.add("operationTimeList");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponsePropertyServiceListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponsePropertyServiceListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponsePropertyServiceListInner is not found in the empty JSON string", V1PropertyGetPost200ResponsePropertyServiceListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponsePropertyServiceListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponsePropertyServiceListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("featureList") != null && !jsonObj.get("featureList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `featureList` to be an array in the JSON string but got `%s`", jsonObj.get("featureList").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("typeList") != null && !jsonObj.get("typeList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeList` to be an array in the JSON string but got `%s`", jsonObj.get("typeList").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("itemList") != null && !jsonObj.get("itemList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemList` to be an array in the JSON string but got `%s`", jsonObj.get("itemList").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("operationTimeList") != null && !jsonObj.get("operationTimeList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operationTimeList` to be an array in the JSON string but got `%s`", jsonObj.get("operationTimeList").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponsePropertyServiceListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponsePropertyServiceListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponsePropertyServiceListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponsePropertyServiceListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponsePropertyServiceListInner>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponsePropertyServiceListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponsePropertyServiceListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponsePropertyServiceListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponsePropertyServiceListInner
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponsePropertyServiceListInner
  */
  public static V1PropertyGetPost200ResponsePropertyServiceListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponsePropertyServiceListInner.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponsePropertyServiceListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyPropertyInfoAcceptedPaymentListInner;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyPropertyInfoCategoryListInner;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyPropertyInfoLocation;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyPropertyInfoMessageListInner;
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
 * V1PropertyGetPost200ResponsePropertyPropertyInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T14:58:29.143647463Z[Etc/UTC]")
public class V1PropertyGetPost200ResponsePropertyPropertyInfo {
  public static final String SERIALIZED_NAME_UNIT_COUNT = "unitCount";
  @SerializedName(SERIALIZED_NAME_UNIT_COUNT)
  private BigDecimal unitCount;

  public static final String SERIALIZED_NAME_MESSAGE_LIST = "messageList";
  @SerializedName(SERIALIZED_NAME_MESSAGE_LIST)
  private List<V1PropertyGetPost200ResponsePropertyPropertyInfoMessageListInner> messageList = null;

  public static final String SERIALIZED_NAME_CATEGORY_LIST = "categoryList";
  @SerializedName(SERIALIZED_NAME_CATEGORY_LIST)
  private List<V1PropertyGetPost200ResponsePropertyPropertyInfoCategoryListInner> categoryList = null;

  public static final String SERIALIZED_NAME_LANGUAGE_LIST = "languageList";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_LIST)
  private List<String> languageList = null;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private V1PropertyGetPost200ResponsePropertyPropertyInfoLocation location;

  public static final String SERIALIZED_NAME_ACCEPTED_PAYMENT_LIST = "acceptedPaymentList";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_PAYMENT_LIST)
  private List<V1PropertyGetPost200ResponsePropertyPropertyInfoAcceptedPaymentListInner> acceptedPaymentList = null;

  public V1PropertyGetPost200ResponsePropertyPropertyInfo() { 
  }

  public V1PropertyGetPost200ResponsePropertyPropertyInfo unitCount(BigDecimal unitCount) {
    
    this.unitCount = unitCount;
    return this;
  }

   /**
   * Get unitCount
   * @return unitCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public BigDecimal getUnitCount() {
    return unitCount;
  }


  public void setUnitCount(BigDecimal unitCount) {
    this.unitCount = unitCount;
  }


  public V1PropertyGetPost200ResponsePropertyPropertyInfo messageList(List<V1PropertyGetPost200ResponsePropertyPropertyInfoMessageListInner> messageList) {
    
    this.messageList = messageList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyPropertyInfo addMessageListItem(V1PropertyGetPost200ResponsePropertyPropertyInfoMessageListInner messageListItem) {
    if (this.messageList == null) {
      this.messageList = new ArrayList<>();
    }
    this.messageList.add(messageListItem);
    return this;
  }

   /**
   * Get messageList
   * @return messageList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyPropertyInfoMessageListInner> getMessageList() {
    return messageList;
  }


  public void setMessageList(List<V1PropertyGetPost200ResponsePropertyPropertyInfoMessageListInner> messageList) {
    this.messageList = messageList;
  }


  public V1PropertyGetPost200ResponsePropertyPropertyInfo categoryList(List<V1PropertyGetPost200ResponsePropertyPropertyInfoCategoryListInner> categoryList) {
    
    this.categoryList = categoryList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyPropertyInfo addCategoryListItem(V1PropertyGetPost200ResponsePropertyPropertyInfoCategoryListInner categoryListItem) {
    if (this.categoryList == null) {
      this.categoryList = new ArrayList<>();
    }
    this.categoryList.add(categoryListItem);
    return this;
  }

   /**
   * Get categoryList
   * @return categoryList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyPropertyInfoCategoryListInner> getCategoryList() {
    return categoryList;
  }


  public void setCategoryList(List<V1PropertyGetPost200ResponsePropertyPropertyInfoCategoryListInner> categoryList) {
    this.categoryList = categoryList;
  }


  public V1PropertyGetPost200ResponsePropertyPropertyInfo languageList(List<String> languageList) {
    
    this.languageList = languageList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyPropertyInfo addLanguageListItem(String languageListItem) {
    if (this.languageList == null) {
      this.languageList = new ArrayList<>();
    }
    this.languageList.add(languageListItem);
    return this;
  }

   /**
   * Get languageList
   * @return languageList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLanguageList() {
    return languageList;
  }


  public void setLanguageList(List<String> languageList) {
    this.languageList = languageList;
  }


  public V1PropertyGetPost200ResponsePropertyPropertyInfo location(V1PropertyGetPost200ResponsePropertyPropertyInfoLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyPropertyInfoLocation getLocation() {
    return location;
  }


  public void setLocation(V1PropertyGetPost200ResponsePropertyPropertyInfoLocation location) {
    this.location = location;
  }


  public V1PropertyGetPost200ResponsePropertyPropertyInfo acceptedPaymentList(List<V1PropertyGetPost200ResponsePropertyPropertyInfoAcceptedPaymentListInner> acceptedPaymentList) {
    
    this.acceptedPaymentList = acceptedPaymentList;
    return this;
  }

  public V1PropertyGetPost200ResponsePropertyPropertyInfo addAcceptedPaymentListItem(V1PropertyGetPost200ResponsePropertyPropertyInfoAcceptedPaymentListInner acceptedPaymentListItem) {
    if (this.acceptedPaymentList == null) {
      this.acceptedPaymentList = new ArrayList<>();
    }
    this.acceptedPaymentList.add(acceptedPaymentListItem);
    return this;
  }

   /**
   * Get acceptedPaymentList
   * @return acceptedPaymentList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyPropertyInfoAcceptedPaymentListInner> getAcceptedPaymentList() {
    return acceptedPaymentList;
  }


  public void setAcceptedPaymentList(List<V1PropertyGetPost200ResponsePropertyPropertyInfoAcceptedPaymentListInner> acceptedPaymentList) {
    this.acceptedPaymentList = acceptedPaymentList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponsePropertyPropertyInfo v1PropertyGetPost200ResponsePropertyPropertyInfo = (V1PropertyGetPost200ResponsePropertyPropertyInfo) o;
    return Objects.equals(this.unitCount, v1PropertyGetPost200ResponsePropertyPropertyInfo.unitCount) &&
        Objects.equals(this.messageList, v1PropertyGetPost200ResponsePropertyPropertyInfo.messageList) &&
        Objects.equals(this.categoryList, v1PropertyGetPost200ResponsePropertyPropertyInfo.categoryList) &&
        Objects.equals(this.languageList, v1PropertyGetPost200ResponsePropertyPropertyInfo.languageList) &&
        Objects.equals(this.location, v1PropertyGetPost200ResponsePropertyPropertyInfo.location) &&
        Objects.equals(this.acceptedPaymentList, v1PropertyGetPost200ResponsePropertyPropertyInfo.acceptedPaymentList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitCount, messageList, categoryList, languageList, location, acceptedPaymentList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponsePropertyPropertyInfo {\n");
    sb.append("    unitCount: ").append(toIndentedString(unitCount)).append("\n");
    sb.append("    messageList: ").append(toIndentedString(messageList)).append("\n");
    sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
    sb.append("    languageList: ").append(toIndentedString(languageList)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    acceptedPaymentList: ").append(toIndentedString(acceptedPaymentList)).append("\n");
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
    openapiFields.add("unitCount");
    openapiFields.add("messageList");
    openapiFields.add("categoryList");
    openapiFields.add("languageList");
    openapiFields.add("location");
    openapiFields.add("acceptedPaymentList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponsePropertyPropertyInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponsePropertyPropertyInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponsePropertyPropertyInfo is not found in the empty JSON string", V1PropertyGetPost200ResponsePropertyPropertyInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponsePropertyPropertyInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponsePropertyPropertyInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraymessageList = jsonObj.getAsJsonArray("messageList");
      if (jsonArraymessageList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("messageList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `messageList` to be an array in the JSON string but got `%s`", jsonObj.get("messageList").toString()));
        }

        // validate the optional field `messageList` (array)
        for (int i = 0; i < jsonArraymessageList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyPropertyInfoMessageListInner.validateJsonObject(jsonArraymessageList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraycategoryList = jsonObj.getAsJsonArray("categoryList");
      if (jsonArraycategoryList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("categoryList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `categoryList` to be an array in the JSON string but got `%s`", jsonObj.get("categoryList").toString()));
        }

        // validate the optional field `categoryList` (array)
        for (int i = 0; i < jsonArraycategoryList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyPropertyInfoCategoryListInner.validateJsonObject(jsonArraycategoryList.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("languageList") != null && !jsonObj.get("languageList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `languageList` to be an array in the JSON string but got `%s`", jsonObj.get("languageList").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.getAsJsonObject("location") != null) {
        V1PropertyGetPost200ResponsePropertyPropertyInfoLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      JsonArray jsonArrayacceptedPaymentList = jsonObj.getAsJsonArray("acceptedPaymentList");
      if (jsonArrayacceptedPaymentList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("acceptedPaymentList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `acceptedPaymentList` to be an array in the JSON string but got `%s`", jsonObj.get("acceptedPaymentList").toString()));
        }

        // validate the optional field `acceptedPaymentList` (array)
        for (int i = 0; i < jsonArrayacceptedPaymentList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyPropertyInfoAcceptedPaymentListInner.validateJsonObject(jsonArrayacceptedPaymentList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponsePropertyPropertyInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponsePropertyPropertyInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponsePropertyPropertyInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponsePropertyPropertyInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponsePropertyPropertyInfo>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponsePropertyPropertyInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponsePropertyPropertyInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponsePropertyPropertyInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponsePropertyPropertyInfo
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponsePropertyPropertyInfo
  */
  public static V1PropertyGetPost200ResponsePropertyPropertyInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponsePropertyPropertyInfo.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponsePropertyPropertyInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


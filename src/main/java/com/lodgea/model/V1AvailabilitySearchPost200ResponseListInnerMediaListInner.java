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
 * V1AvailabilitySearchPost200ResponseListInnerMediaListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-24T11:46:35.796667073Z[Etc/UTC]")
public class V1AvailabilitySearchPost200ResponseListInnerMediaListInner {
  public static final String SERIALIZED_NAME_TAG_CODE_LIST = "tagCodeList";
  @SerializedName(SERIALIZED_NAME_TAG_CODE_LIST)
  private List<BigDecimal> tagCodeList = null;

  public static final String SERIALIZED_NAME_IS_MAIN_IMAGE = "isMainImage";
  @SerializedName(SERIALIZED_NAME_IS_MAIN_IMAGE)
  private Boolean isMainImage;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_SORT_ORDER = "sortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private BigDecimal sortOrder;

  public V1AvailabilitySearchPost200ResponseListInnerMediaListInner() { 
  }

  public V1AvailabilitySearchPost200ResponseListInnerMediaListInner tagCodeList(List<BigDecimal> tagCodeList) {
    
    this.tagCodeList = tagCodeList;
    return this;
  }

  public V1AvailabilitySearchPost200ResponseListInnerMediaListInner addTagCodeListItem(BigDecimal tagCodeListItem) {
    if (this.tagCodeList == null) {
      this.tagCodeList = new ArrayList<>();
    }
    this.tagCodeList.add(tagCodeListItem);
    return this;
  }

   /**
   * Get tagCodeList
   * @return tagCodeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getTagCodeList() {
    return tagCodeList;
  }


  public void setTagCodeList(List<BigDecimal> tagCodeList) {
    this.tagCodeList = tagCodeList;
  }


  public V1AvailabilitySearchPost200ResponseListInnerMediaListInner isMainImage(Boolean isMainImage) {
    
    this.isMainImage = isMainImage;
    return this;
  }

   /**
   * Get isMainImage
   * @return isMainImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsMainImage() {
    return isMainImage;
  }


  public void setIsMainImage(Boolean isMainImage) {
    this.isMainImage = isMainImage;
  }


  public V1AvailabilitySearchPost200ResponseListInnerMediaListInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "obj_1280x960_55480_005.jpg", value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public V1AvailabilitySearchPost200ResponseListInnerMediaListInner sortOrder(BigDecimal sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1004", value = "")

  public BigDecimal getSortOrder() {
    return sortOrder;
  }


  public void setSortOrder(BigDecimal sortOrder) {
    this.sortOrder = sortOrder;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AvailabilitySearchPost200ResponseListInnerMediaListInner v1AvailabilitySearchPost200ResponseListInnerMediaListInner = (V1AvailabilitySearchPost200ResponseListInnerMediaListInner) o;
    return Objects.equals(this.tagCodeList, v1AvailabilitySearchPost200ResponseListInnerMediaListInner.tagCodeList) &&
        Objects.equals(this.isMainImage, v1AvailabilitySearchPost200ResponseListInnerMediaListInner.isMainImage) &&
        Objects.equals(this.url, v1AvailabilitySearchPost200ResponseListInnerMediaListInner.url) &&
        Objects.equals(this.sortOrder, v1AvailabilitySearchPost200ResponseListInnerMediaListInner.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagCodeList, isMainImage, url, sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AvailabilitySearchPost200ResponseListInnerMediaListInner {\n");
    sb.append("    tagCodeList: ").append(toIndentedString(tagCodeList)).append("\n");
    sb.append("    isMainImage: ").append(toIndentedString(isMainImage)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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
    openapiFields.add("tagCodeList");
    openapiFields.add("isMainImage");
    openapiFields.add("url");
    openapiFields.add("sortOrder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1AvailabilitySearchPost200ResponseListInnerMediaListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1AvailabilitySearchPost200ResponseListInnerMediaListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AvailabilitySearchPost200ResponseListInnerMediaListInner is not found in the empty JSON string", V1AvailabilitySearchPost200ResponseListInnerMediaListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1AvailabilitySearchPost200ResponseListInnerMediaListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AvailabilitySearchPost200ResponseListInnerMediaListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("tagCodeList") != null && !jsonObj.get("tagCodeList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagCodeList` to be an array in the JSON string but got `%s`", jsonObj.get("tagCodeList").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AvailabilitySearchPost200ResponseListInnerMediaListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AvailabilitySearchPost200ResponseListInnerMediaListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AvailabilitySearchPost200ResponseListInnerMediaListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AvailabilitySearchPost200ResponseListInnerMediaListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AvailabilitySearchPost200ResponseListInnerMediaListInner>() {
           @Override
           public void write(JsonWriter out, V1AvailabilitySearchPost200ResponseListInnerMediaListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AvailabilitySearchPost200ResponseListInnerMediaListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1AvailabilitySearchPost200ResponseListInnerMediaListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1AvailabilitySearchPost200ResponseListInnerMediaListInner
  * @throws IOException if the JSON string is invalid with respect to V1AvailabilitySearchPost200ResponseListInnerMediaListInner
  */
  public static V1AvailabilitySearchPost200ResponseListInnerMediaListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AvailabilitySearchPost200ResponseListInnerMediaListInner.class);
  }

 /**
  * Convert an instance of V1AvailabilitySearchPost200ResponseListInnerMediaListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


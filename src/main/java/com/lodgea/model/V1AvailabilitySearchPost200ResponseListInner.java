/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.0.2
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
import com.lodgea.model.V1AvailabilitySearchPost200ResponseListInnerAttractionListInner;
import com.lodgea.model.V1AvailabilitySearchPost200ResponseListInnerGeo;
import com.lodgea.model.V1AvailabilitySearchPost200ResponseListInnerLowestPrice;
import com.lodgea.model.V1AvailabilitySearchPost200ResponseListInnerMediaListInner;
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
 * V1AvailabilitySearchPost200ResponseListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-08T10:01:38.583514510Z[Etc/UTC]")
public class V1AvailabilitySearchPost200ResponseListInner {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "languageCode";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_UNIT_SYSTEM = "unitSystem";
  @SerializedName(SERIALIZED_NAME_UNIT_SYSTEM)
  private String unitSystem;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_SERVICE_LIST = "serviceList";
  @SerializedName(SERIALIZED_NAME_SERVICE_LIST)
  private List<BigDecimal> serviceList = null;

  public static final String SERIALIZED_NAME_CATEGORY_LIST = "categoryList";
  @SerializedName(SERIALIZED_NAME_CATEGORY_LIST)
  private List<BigDecimal> categoryList = null;

  public static final String SERIALIZED_NAME_URI_PATH = "uriPath";
  @SerializedName(SERIALIZED_NAME_URI_PATH)
  private String uriPath;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_GEO = "geo";
  @SerializedName(SERIALIZED_NAME_GEO)
  private V1AvailabilitySearchPost200ResponseListInnerGeo geo;

  public static final String SERIALIZED_NAME_MEDIA_LIST = "mediaList";
  @SerializedName(SERIALIZED_NAME_MEDIA_LIST)
  private List<V1AvailabilitySearchPost200ResponseListInnerMediaListInner> mediaList = null;

  public static final String SERIALIZED_NAME_ATTRACTION_LIST = "attractionList";
  @SerializedName(SERIALIZED_NAME_ATTRACTION_LIST)
  private List<V1AvailabilitySearchPost200ResponseListInnerAttractionListInner> attractionList = null;

  public static final String SERIALIZED_NAME_LOWEST_PRICE = "lowestPrice";
  @SerializedName(SERIALIZED_NAME_LOWEST_PRICE)
  private V1AvailabilitySearchPost200ResponseListInnerLowestPrice lowestPrice;

  public V1AvailabilitySearchPost200ResponseListInner() { 
  }

  public V1AvailabilitySearchPost200ResponseListInner code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "landhaus-treskersand", value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public V1AvailabilitySearchPost200ResponseListInner languageCode(String languageCode) {
    
    this.languageCode = languageCode;
    return this;
  }

   /**
   * Get languageCode
   * @return languageCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de", value = "")

  public String getLanguageCode() {
    return languageCode;
  }


  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public V1AvailabilitySearchPost200ResponseListInner currencyCode(String currencyCode) {
    
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


  public V1AvailabilitySearchPost200ResponseListInner unitSystem(String unitSystem) {
    
    this.unitSystem = unitSystem;
    return this;
  }

   /**
   * Get unitSystem
   * @return unitSystem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "metric", value = "")

  public String getUnitSystem() {
    return unitSystem;
  }


  public void setUnitSystem(String unitSystem) {
    this.unitSystem = unitSystem;
  }


  public V1AvailabilitySearchPost200ResponseListInner name(String name) {
    
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


  public V1AvailabilitySearchPost200ResponseListInner uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "landhaus-treskersand", value = "")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public V1AvailabilitySearchPost200ResponseListInner serviceList(List<BigDecimal> serviceList) {
    
    this.serviceList = serviceList;
    return this;
  }

  public V1AvailabilitySearchPost200ResponseListInner addServiceListItem(BigDecimal serviceListItem) {
    if (this.serviceList == null) {
      this.serviceList = new ArrayList<>();
    }
    this.serviceList.add(serviceListItem);
    return this;
  }

   /**
   * Get serviceList
   * @return serviceList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getServiceList() {
    return serviceList;
  }


  public void setServiceList(List<BigDecimal> serviceList) {
    this.serviceList = serviceList;
  }


  public V1AvailabilitySearchPost200ResponseListInner categoryList(List<BigDecimal> categoryList) {
    
    this.categoryList = categoryList;
    return this;
  }

  public V1AvailabilitySearchPost200ResponseListInner addCategoryListItem(BigDecimal categoryListItem) {
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

  public List<BigDecimal> getCategoryList() {
    return categoryList;
  }


  public void setCategoryList(List<BigDecimal> categoryList) {
    this.categoryList = categoryList;
  }


  public V1AvailabilitySearchPost200ResponseListInner uriPath(String uriPath) {
    
    this.uriPath = uriPath;
    return this;
  }

   /**
   * Get uriPath
   * @return uriPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "deutschland/schleswig-holstein/nordfriesland/sylt/tinnum/landhaus-treskersand", value = "")

  public String getUriPath() {
    return uriPath;
  }


  public void setUriPath(String uriPath) {
    this.uriPath = uriPath;
  }


  public V1AvailabilitySearchPost200ResponseListInner text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Im Herzen der Insel-im S??den von Tinnum in einer ruhigen Seitenstrasse unmittelbar an den Tinnumer Wiesen liegt das wundersch??ne Landhaus Treskersand mit seiner Wohnung unter Reet.", value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public V1AvailabilitySearchPost200ResponseListInner geo(V1AvailabilitySearchPost200ResponseListInnerGeo geo) {
    
    this.geo = geo;
    return this;
  }

   /**
   * Get geo
   * @return geo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1AvailabilitySearchPost200ResponseListInnerGeo getGeo() {
    return geo;
  }


  public void setGeo(V1AvailabilitySearchPost200ResponseListInnerGeo geo) {
    this.geo = geo;
  }


  public V1AvailabilitySearchPost200ResponseListInner mediaList(List<V1AvailabilitySearchPost200ResponseListInnerMediaListInner> mediaList) {
    
    this.mediaList = mediaList;
    return this;
  }

  public V1AvailabilitySearchPost200ResponseListInner addMediaListItem(V1AvailabilitySearchPost200ResponseListInnerMediaListInner mediaListItem) {
    if (this.mediaList == null) {
      this.mediaList = new ArrayList<>();
    }
    this.mediaList.add(mediaListItem);
    return this;
  }

   /**
   * Get mediaList
   * @return mediaList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1AvailabilitySearchPost200ResponseListInnerMediaListInner> getMediaList() {
    return mediaList;
  }


  public void setMediaList(List<V1AvailabilitySearchPost200ResponseListInnerMediaListInner> mediaList) {
    this.mediaList = mediaList;
  }


  public V1AvailabilitySearchPost200ResponseListInner attractionList(List<V1AvailabilitySearchPost200ResponseListInnerAttractionListInner> attractionList) {
    
    this.attractionList = attractionList;
    return this;
  }

  public V1AvailabilitySearchPost200ResponseListInner addAttractionListItem(V1AvailabilitySearchPost200ResponseListInnerAttractionListInner attractionListItem) {
    if (this.attractionList == null) {
      this.attractionList = new ArrayList<>();
    }
    this.attractionList.add(attractionListItem);
    return this;
  }

   /**
   * Get attractionList
   * @return attractionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1AvailabilitySearchPost200ResponseListInnerAttractionListInner> getAttractionList() {
    return attractionList;
  }


  public void setAttractionList(List<V1AvailabilitySearchPost200ResponseListInnerAttractionListInner> attractionList) {
    this.attractionList = attractionList;
  }


  public V1AvailabilitySearchPost200ResponseListInner lowestPrice(V1AvailabilitySearchPost200ResponseListInnerLowestPrice lowestPrice) {
    
    this.lowestPrice = lowestPrice;
    return this;
  }

   /**
   * Get lowestPrice
   * @return lowestPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1AvailabilitySearchPost200ResponseListInnerLowestPrice getLowestPrice() {
    return lowestPrice;
  }


  public void setLowestPrice(V1AvailabilitySearchPost200ResponseListInnerLowestPrice lowestPrice) {
    this.lowestPrice = lowestPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AvailabilitySearchPost200ResponseListInner v1AvailabilitySearchPost200ResponseListInner = (V1AvailabilitySearchPost200ResponseListInner) o;
    return Objects.equals(this.code, v1AvailabilitySearchPost200ResponseListInner.code) &&
        Objects.equals(this.languageCode, v1AvailabilitySearchPost200ResponseListInner.languageCode) &&
        Objects.equals(this.currencyCode, v1AvailabilitySearchPost200ResponseListInner.currencyCode) &&
        Objects.equals(this.unitSystem, v1AvailabilitySearchPost200ResponseListInner.unitSystem) &&
        Objects.equals(this.name, v1AvailabilitySearchPost200ResponseListInner.name) &&
        Objects.equals(this.uri, v1AvailabilitySearchPost200ResponseListInner.uri) &&
        Objects.equals(this.serviceList, v1AvailabilitySearchPost200ResponseListInner.serviceList) &&
        Objects.equals(this.categoryList, v1AvailabilitySearchPost200ResponseListInner.categoryList) &&
        Objects.equals(this.uriPath, v1AvailabilitySearchPost200ResponseListInner.uriPath) &&
        Objects.equals(this.text, v1AvailabilitySearchPost200ResponseListInner.text) &&
        Objects.equals(this.geo, v1AvailabilitySearchPost200ResponseListInner.geo) &&
        Objects.equals(this.mediaList, v1AvailabilitySearchPost200ResponseListInner.mediaList) &&
        Objects.equals(this.attractionList, v1AvailabilitySearchPost200ResponseListInner.attractionList) &&
        Objects.equals(this.lowestPrice, v1AvailabilitySearchPost200ResponseListInner.lowestPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, languageCode, currencyCode, unitSystem, name, uri, serviceList, categoryList, uriPath, text, geo, mediaList, attractionList, lowestPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AvailabilitySearchPost200ResponseListInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    unitSystem: ").append(toIndentedString(unitSystem)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    serviceList: ").append(toIndentedString(serviceList)).append("\n");
    sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
    sb.append("    uriPath: ").append(toIndentedString(uriPath)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
    sb.append("    mediaList: ").append(toIndentedString(mediaList)).append("\n");
    sb.append("    attractionList: ").append(toIndentedString(attractionList)).append("\n");
    sb.append("    lowestPrice: ").append(toIndentedString(lowestPrice)).append("\n");
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
    openapiFields.add("languageCode");
    openapiFields.add("currencyCode");
    openapiFields.add("unitSystem");
    openapiFields.add("name");
    openapiFields.add("uri");
    openapiFields.add("serviceList");
    openapiFields.add("categoryList");
    openapiFields.add("uriPath");
    openapiFields.add("text");
    openapiFields.add("geo");
    openapiFields.add("mediaList");
    openapiFields.add("attractionList");
    openapiFields.add("lowestPrice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1AvailabilitySearchPost200ResponseListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1AvailabilitySearchPost200ResponseListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AvailabilitySearchPost200ResponseListInner is not found in the empty JSON string", V1AvailabilitySearchPost200ResponseListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1AvailabilitySearchPost200ResponseListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AvailabilitySearchPost200ResponseListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("languageCode") != null && !jsonObj.get("languageCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `languageCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("languageCode").toString()));
      }
      if (jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if (jsonObj.get("unitSystem") != null && !jsonObj.get("unitSystem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitSystem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitSystem").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("serviceList") != null && !jsonObj.get("serviceList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceList` to be an array in the JSON string but got `%s`", jsonObj.get("serviceList").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("categoryList") != null && !jsonObj.get("categoryList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryList` to be an array in the JSON string but got `%s`", jsonObj.get("categoryList").toString()));
      }
      if (jsonObj.get("uriPath") != null && !jsonObj.get("uriPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uriPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uriPath").toString()));
      }
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      // validate the optional field `geo`
      if (jsonObj.getAsJsonObject("geo") != null) {
        V1AvailabilitySearchPost200ResponseListInnerGeo.validateJsonObject(jsonObj.getAsJsonObject("geo"));
      }
      JsonArray jsonArraymediaList = jsonObj.getAsJsonArray("mediaList");
      if (jsonArraymediaList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("mediaList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `mediaList` to be an array in the JSON string but got `%s`", jsonObj.get("mediaList").toString()));
        }

        // validate the optional field `mediaList` (array)
        for (int i = 0; i < jsonArraymediaList.size(); i++) {
          V1AvailabilitySearchPost200ResponseListInnerMediaListInner.validateJsonObject(jsonArraymediaList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayattractionList = jsonObj.getAsJsonArray("attractionList");
      if (jsonArrayattractionList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("attractionList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `attractionList` to be an array in the JSON string but got `%s`", jsonObj.get("attractionList").toString()));
        }

        // validate the optional field `attractionList` (array)
        for (int i = 0; i < jsonArrayattractionList.size(); i++) {
          V1AvailabilitySearchPost200ResponseListInnerAttractionListInner.validateJsonObject(jsonArrayattractionList.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `lowestPrice`
      if (jsonObj.getAsJsonObject("lowestPrice") != null) {
        V1AvailabilitySearchPost200ResponseListInnerLowestPrice.validateJsonObject(jsonObj.getAsJsonObject("lowestPrice"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AvailabilitySearchPost200ResponseListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AvailabilitySearchPost200ResponseListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AvailabilitySearchPost200ResponseListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AvailabilitySearchPost200ResponseListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AvailabilitySearchPost200ResponseListInner>() {
           @Override
           public void write(JsonWriter out, V1AvailabilitySearchPost200ResponseListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AvailabilitySearchPost200ResponseListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1AvailabilitySearchPost200ResponseListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1AvailabilitySearchPost200ResponseListInner
  * @throws IOException if the JSON string is invalid with respect to V1AvailabilitySearchPost200ResponseListInner
  */
  public static V1AvailabilitySearchPost200ResponseListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AvailabilitySearchPost200ResponseListInner.class);
  }

 /**
  * Convert an instance of V1AvailabilitySearchPost200ResponseListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


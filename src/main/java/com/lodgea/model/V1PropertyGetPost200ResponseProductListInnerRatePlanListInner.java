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
import com.lodgea.model.V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner;
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
 * V1PropertyGetPost200ResponseProductListInnerRatePlanListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T14:58:29.143647463Z[Etc/UTC]")
public class V1PropertyGetPost200ResponseProductListInnerRatePlanListInner {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_PROPERTY_ID = "propertyId";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private String propertyId;

  public static final String SERIALIZED_NAME_PRICING_LIST = "pricingList";
  @SerializedName(SERIALIZED_NAME_PRICING_LIST)
  private List<V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner> pricingList = null;

  public V1PropertyGetPost200ResponseProductListInnerRatePlanListInner() { 
  }

  public V1PropertyGetPost200ResponseProductListInnerRatePlanListInner active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public V1PropertyGetPost200ResponseProductListInnerRatePlanListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Standard Amrum", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1PropertyGetPost200ResponseProductListInnerRatePlanListInner code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "standard-amrum", value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public V1PropertyGetPost200ResponseProductListInnerRatePlanListInner propertyId(String propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Get propertyId
   * @return propertyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "strandresidenz-sylt", value = "")

  public String getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(String propertyId) {
    this.propertyId = propertyId;
  }


  public V1PropertyGetPost200ResponseProductListInnerRatePlanListInner pricingList(List<V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner> pricingList) {
    
    this.pricingList = pricingList;
    return this;
  }

  public V1PropertyGetPost200ResponseProductListInnerRatePlanListInner addPricingListItem(V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner pricingListItem) {
    if (this.pricingList == null) {
      this.pricingList = new ArrayList<>();
    }
    this.pricingList.add(pricingListItem);
    return this;
  }

   /**
   * Get pricingList
   * @return pricingList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner> getPricingList() {
    return pricingList;
  }


  public void setPricingList(List<V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner> pricingList) {
    this.pricingList = pricingList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponseProductListInnerRatePlanListInner v1PropertyGetPost200ResponseProductListInnerRatePlanListInner = (V1PropertyGetPost200ResponseProductListInnerRatePlanListInner) o;
    return Objects.equals(this.active, v1PropertyGetPost200ResponseProductListInnerRatePlanListInner.active) &&
        Objects.equals(this.name, v1PropertyGetPost200ResponseProductListInnerRatePlanListInner.name) &&
        Objects.equals(this.code, v1PropertyGetPost200ResponseProductListInnerRatePlanListInner.code) &&
        Objects.equals(this.propertyId, v1PropertyGetPost200ResponseProductListInnerRatePlanListInner.propertyId) &&
        Objects.equals(this.pricingList, v1PropertyGetPost200ResponseProductListInnerRatePlanListInner.pricingList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, name, code, propertyId, pricingList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponseProductListInnerRatePlanListInner {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    pricingList: ").append(toIndentedString(pricingList)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("name");
    openapiFields.add("code");
    openapiFields.add("propertyId");
    openapiFields.add("pricingList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponseProductListInnerRatePlanListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponseProductListInnerRatePlanListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponseProductListInnerRatePlanListInner is not found in the empty JSON string", V1PropertyGetPost200ResponseProductListInnerRatePlanListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponseProductListInnerRatePlanListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponseProductListInnerRatePlanListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("propertyId") != null && !jsonObj.get("propertyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propertyId").toString()));
      }
      JsonArray jsonArraypricingList = jsonObj.getAsJsonArray("pricingList");
      if (jsonArraypricingList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("pricingList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `pricingList` to be an array in the JSON string but got `%s`", jsonObj.get("pricingList").toString()));
        }

        // validate the optional field `pricingList` (array)
        for (int i = 0; i < jsonArraypricingList.size(); i++) {
          V1PropertyGetPost200ResponseProductListInnerRatePlanListInnerPricingListInner.validateJsonObject(jsonArraypricingList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponseProductListInnerRatePlanListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponseProductListInnerRatePlanListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponseProductListInnerRatePlanListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponseProductListInnerRatePlanListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponseProductListInnerRatePlanListInner>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponseProductListInnerRatePlanListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponseProductListInnerRatePlanListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponseProductListInnerRatePlanListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponseProductListInnerRatePlanListInner
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponseProductListInnerRatePlanListInner
  */
  public static V1PropertyGetPost200ResponseProductListInnerRatePlanListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponseProductListInnerRatePlanListInner.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponseProductListInnerRatePlanListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


/*
 * lodgea-java
 * LODGEA SDK for java. Check out https://docs.lodgea.io for more information.
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
import java.io.IOException;

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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.lodgea.JSON;

/**
 * PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner {
  public static final String SERIALIZED_NAME_ADDRESS_LINE = "addressLine";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE)
  private String addressLine;

  public static final String SERIALIZED_NAME_PROPERTY_NAME = "propertyName";
  @SerializedName(SERIALIZED_NAME_PROPERTY_NAME)
  private String propertyName;

  public static final String SERIALIZED_NAME_CITY_NAME = "cityName";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner() {
  }

  public PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner addressLine(String addressLine) {
    
    this.addressLine = addressLine;
    return this;
  }

   /**
   * The first line of the address for this contact
   * @return addressLine
  **/
  @javax.annotation.Nonnull

  public String getAddressLine() {
    return addressLine;
  }


  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }


  public PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner propertyName(String propertyName) {
    
    this.propertyName = propertyName;
    return this;
  }

   /**
   * The name of the property for this contact
   * @return propertyName
  **/
  @javax.annotation.Nullable

  public String getPropertyName() {
    return propertyName;
  }


  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }


  public PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * The city of this contact
   * @return cityName
  **/
  @javax.annotation.Nonnull

  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code of this contact
   * @return postalCode
  **/
  @javax.annotation.Nonnull

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state/region of this contact
   * @return state
  **/
  @javax.annotation.Nullable

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code of this contact
   * @return countryCode
  **/
  @javax.annotation.Nullable

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner propertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner = (PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner) o;
    return Objects.equals(this.addressLine, propertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner.addressLine) &&
        Objects.equals(this.propertyName, propertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner.propertyName) &&
        Objects.equals(this.cityName, propertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner.cityName) &&
        Objects.equals(this.postalCode, propertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner.postalCode) &&
        Objects.equals(this.state, propertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner.state) &&
        Objects.equals(this.countryCode, propertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine, propertyName, cityName, postalCode, state, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner {\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
    openapiFields.add("addressLine");
    openapiFields.add("propertyName");
    openapiFields.add("cityName");
    openapiFields.add("postalCode");
    openapiFields.add("state");
    openapiFields.add("countryCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("addressLine");
    openapiRequiredFields.add("cityName");
    openapiRequiredFields.add("postalCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner is not found in the empty JSON string", PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("addressLine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressLine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressLine").toString()));
      }
      if ((jsonObj.get("propertyName") != null && !jsonObj.get("propertyName").isJsonNull()) && !jsonObj.get("propertyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propertyName").toString()));
      }
      if (!jsonObj.get("cityName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cityName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cityName").toString()));
      }
      if (!jsonObj.get("postalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalCode").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner>() {
           @Override
           public void write(JsonWriter out, PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner
  * @throws IOException if the JSON string is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner
  */
  public static PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner.class);
  }

 /**
  * Convert an instance of PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

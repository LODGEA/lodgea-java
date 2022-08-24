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
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyGeoDeLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.lodgea.JSON;

/**
 * V1PropertyGetPost200ResponsePropertyGeoEn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-24T11:46:35.796667073Z[Etc/UTC]")
public class V1PropertyGetPost200ResponsePropertyGeoEn {
  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private V1PropertyGetPost200ResponsePropertyGeoDeLocation location;

  public static final String SERIALIZED_NAME_FORMATTED_ADDRESS = "formatted_address";
  @SerializedName(SERIALIZED_NAME_FORMATTED_ADDRESS)
  private String formattedAddress;

  public static final String SERIALIZED_NAME_PLACE_ID = "place_id";
  @SerializedName(SERIALIZED_NAME_PLACE_ID)
  private String placeId;

  public static final String SERIALIZED_NAME_LOCALITY = "locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private String locality;

  public static final String SERIALIZED_NAME_ADMINISTRATIVE_AREA_LEVEL3 = "administrative_area_level_3";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATIVE_AREA_LEVEL3)
  private String administrativeAreaLevel3;

  public static final String SERIALIZED_NAME_ADMINISTRATIVE_AREA_LEVEL1 = "administrative_area_level_1";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATIVE_AREA_LEVEL1)
  private String administrativeAreaLevel1;

  public static final String SERIALIZED_NAME_STATE_CODE = "state_code";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_NATURAL_FEATURE = "natural_feature";
  @SerializedName(SERIALIZED_NAME_NATURAL_FEATURE)
  private String naturalFeature;

  public static final String SERIALIZED_NAME_ESTABLISHMENT = "establishment";
  @SerializedName(SERIALIZED_NAME_ESTABLISHMENT)
  private String establishment;

  public static final String SERIALIZED_NAME_SUBLOCALITY = "sublocality";
  @SerializedName(SERIALIZED_NAME_SUBLOCALITY)
  private String sublocality;

  public static final String SERIALIZED_NAME_SUBLOCALITY_LEVEL1 = "sublocality_level_1";
  @SerializedName(SERIALIZED_NAME_SUBLOCALITY_LEVEL1)
  private String sublocalityLevel1;

  public static final String SERIALIZED_NAME_STREET_NUMBER = "street_number";
  @SerializedName(SERIALIZED_NAME_STREET_NUMBER)
  private String streetNumber;

  public static final String SERIALIZED_NAME_ROUTE = "route";
  @SerializedName(SERIALIZED_NAME_ROUTE)
  private String route;

  public V1PropertyGetPost200ResponsePropertyGeoEn() { 
  }

  public V1PropertyGetPost200ResponsePropertyGeoEn location(V1PropertyGetPost200ResponsePropertyGeoDeLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyGeoDeLocation getLocation() {
    return location;
  }


  public void setLocation(V1PropertyGetPost200ResponsePropertyGeoDeLocation location) {
    this.location = location;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn formattedAddress(String formattedAddress) {
    
    this.formattedAddress = formattedAddress;
    return this;
  }

   /**
   * Get formattedAddress
   * @return formattedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nordhedig 20 25980 Sylt Germany", value = "")

  public String getFormattedAddress() {
    return formattedAddress;
  }


  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn placeId(String placeId) {
    
    this.placeId = placeId;
    return this;
  }

   /**
   * Get placeId
   * @return placeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ChIJVaxqTevetEcRyfs8PGHK6mw", value = "")

  public String getPlaceId() {
    return placeId;
  }


  public void setPlaceId(String placeId) {
    this.placeId = placeId;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn locality(String locality) {
    
    this.locality = locality;
    return this;
  }

   /**
   * Get locality
   * @return locality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sylt", value = "")

  public String getLocality() {
    return locality;
  }


  public void setLocality(String locality) {
    this.locality = locality;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn administrativeAreaLevel3(String administrativeAreaLevel3) {
    
    this.administrativeAreaLevel3 = administrativeAreaLevel3;
    return this;
  }

   /**
   * Get administrativeAreaLevel3
   * @return administrativeAreaLevel3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nordfriesland", value = "")

  public String getAdministrativeAreaLevel3() {
    return administrativeAreaLevel3;
  }


  public void setAdministrativeAreaLevel3(String administrativeAreaLevel3) {
    this.administrativeAreaLevel3 = administrativeAreaLevel3;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn administrativeAreaLevel1(String administrativeAreaLevel1) {
    
    this.administrativeAreaLevel1 = administrativeAreaLevel1;
    return this;
  }

   /**
   * Get administrativeAreaLevel1
   * @return administrativeAreaLevel1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Schleswig-Holstein", value = "")

  public String getAdministrativeAreaLevel1() {
    return administrativeAreaLevel1;
  }


  public void setAdministrativeAreaLevel1(String administrativeAreaLevel1) {
    this.administrativeAreaLevel1 = administrativeAreaLevel1;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn stateCode(String stateCode) {
    
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Get stateCode
   * @return stateCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SH", value = "")

  public String getStateCode() {
    return stateCode;
  }


  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Germany", value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DE", value = "")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25980", value = "")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en", value = "")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn naturalFeature(String naturalFeature) {
    
    this.naturalFeature = naturalFeature;
    return this;
  }

   /**
   * Get naturalFeature
   * @return naturalFeature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sylt", value = "")

  public String getNaturalFeature() {
    return naturalFeature;
  }


  public void setNaturalFeature(String naturalFeature) {
    this.naturalFeature = naturalFeature;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn establishment(String establishment) {
    
    this.establishment = establishment;
    return this;
  }

   /**
   * Get establishment
   * @return establishment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sylt", value = "")

  public String getEstablishment() {
    return establishment;
  }


  public void setEstablishment(String establishment) {
    this.establishment = establishment;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn sublocality(String sublocality) {
    
    this.sublocality = sublocality;
    return this;
  }

   /**
   * Get sublocality
   * @return sublocality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Westerland", value = "")

  public String getSublocality() {
    return sublocality;
  }


  public void setSublocality(String sublocality) {
    this.sublocality = sublocality;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn sublocalityLevel1(String sublocalityLevel1) {
    
    this.sublocalityLevel1 = sublocalityLevel1;
    return this;
  }

   /**
   * Get sublocalityLevel1
   * @return sublocalityLevel1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Westerland", value = "")

  public String getSublocalityLevel1() {
    return sublocalityLevel1;
  }


  public void setSublocalityLevel1(String sublocalityLevel1) {
    this.sublocalityLevel1 = sublocalityLevel1;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn streetNumber(String streetNumber) {
    
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Get streetNumber
   * @return streetNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "")

  public String getStreetNumber() {
    return streetNumber;
  }


  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }


  public V1PropertyGetPost200ResponsePropertyGeoEn route(String route) {
    
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nordhedig", value = "")

  public String getRoute() {
    return route;
  }


  public void setRoute(String route) {
    this.route = route;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponsePropertyGeoEn v1PropertyGetPost200ResponsePropertyGeoEn = (V1PropertyGetPost200ResponsePropertyGeoEn) o;
    return Objects.equals(this.location, v1PropertyGetPost200ResponsePropertyGeoEn.location) &&
        Objects.equals(this.formattedAddress, v1PropertyGetPost200ResponsePropertyGeoEn.formattedAddress) &&
        Objects.equals(this.placeId, v1PropertyGetPost200ResponsePropertyGeoEn.placeId) &&
        Objects.equals(this.locality, v1PropertyGetPost200ResponsePropertyGeoEn.locality) &&
        Objects.equals(this.administrativeAreaLevel3, v1PropertyGetPost200ResponsePropertyGeoEn.administrativeAreaLevel3) &&
        Objects.equals(this.administrativeAreaLevel1, v1PropertyGetPost200ResponsePropertyGeoEn.administrativeAreaLevel1) &&
        Objects.equals(this.stateCode, v1PropertyGetPost200ResponsePropertyGeoEn.stateCode) &&
        Objects.equals(this.country, v1PropertyGetPost200ResponsePropertyGeoEn.country) &&
        Objects.equals(this.countryCode, v1PropertyGetPost200ResponsePropertyGeoEn.countryCode) &&
        Objects.equals(this.postalCode, v1PropertyGetPost200ResponsePropertyGeoEn.postalCode) &&
        Objects.equals(this.language, v1PropertyGetPost200ResponsePropertyGeoEn.language) &&
        Objects.equals(this.naturalFeature, v1PropertyGetPost200ResponsePropertyGeoEn.naturalFeature) &&
        Objects.equals(this.establishment, v1PropertyGetPost200ResponsePropertyGeoEn.establishment) &&
        Objects.equals(this.sublocality, v1PropertyGetPost200ResponsePropertyGeoEn.sublocality) &&
        Objects.equals(this.sublocalityLevel1, v1PropertyGetPost200ResponsePropertyGeoEn.sublocalityLevel1) &&
        Objects.equals(this.streetNumber, v1PropertyGetPost200ResponsePropertyGeoEn.streetNumber) &&
        Objects.equals(this.route, v1PropertyGetPost200ResponsePropertyGeoEn.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, formattedAddress, placeId, locality, administrativeAreaLevel3, administrativeAreaLevel1, stateCode, country, countryCode, postalCode, language, naturalFeature, establishment, sublocality, sublocalityLevel1, streetNumber, route);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponsePropertyGeoEn {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeAreaLevel3: ").append(toIndentedString(administrativeAreaLevel3)).append("\n");
    sb.append("    administrativeAreaLevel1: ").append(toIndentedString(administrativeAreaLevel1)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    naturalFeature: ").append(toIndentedString(naturalFeature)).append("\n");
    sb.append("    establishment: ").append(toIndentedString(establishment)).append("\n");
    sb.append("    sublocality: ").append(toIndentedString(sublocality)).append("\n");
    sb.append("    sublocalityLevel1: ").append(toIndentedString(sublocalityLevel1)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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
    openapiFields.add("location");
    openapiFields.add("formatted_address");
    openapiFields.add("place_id");
    openapiFields.add("locality");
    openapiFields.add("administrative_area_level_3");
    openapiFields.add("administrative_area_level_1");
    openapiFields.add("state_code");
    openapiFields.add("country");
    openapiFields.add("country_code");
    openapiFields.add("postal_code");
    openapiFields.add("language");
    openapiFields.add("natural_feature");
    openapiFields.add("establishment");
    openapiFields.add("sublocality");
    openapiFields.add("sublocality_level_1");
    openapiFields.add("street_number");
    openapiFields.add("route");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponsePropertyGeoEn
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponsePropertyGeoEn.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponsePropertyGeoEn is not found in the empty JSON string", V1PropertyGetPost200ResponsePropertyGeoEn.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponsePropertyGeoEn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponsePropertyGeoEn` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `location`
      if (jsonObj.getAsJsonObject("location") != null) {
        V1PropertyGetPost200ResponsePropertyGeoDeLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      if (jsonObj.get("formatted_address") != null && !jsonObj.get("formatted_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formatted_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formatted_address").toString()));
      }
      if (jsonObj.get("place_id") != null && !jsonObj.get("place_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `place_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("place_id").toString()));
      }
      if (jsonObj.get("locality") != null && !jsonObj.get("locality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locality").toString()));
      }
      if (jsonObj.get("administrative_area_level_3") != null && !jsonObj.get("administrative_area_level_3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `administrative_area_level_3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("administrative_area_level_3").toString()));
      }
      if (jsonObj.get("administrative_area_level_1") != null && !jsonObj.get("administrative_area_level_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `administrative_area_level_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("administrative_area_level_1").toString()));
      }
      if (jsonObj.get("state_code") != null && !jsonObj.get("state_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_code").toString()));
      }
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if (jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (jsonObj.get("natural_feature") != null && !jsonObj.get("natural_feature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `natural_feature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("natural_feature").toString()));
      }
      if (jsonObj.get("establishment") != null && !jsonObj.get("establishment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `establishment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("establishment").toString()));
      }
      if (jsonObj.get("sublocality") != null && !jsonObj.get("sublocality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sublocality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sublocality").toString()));
      }
      if (jsonObj.get("sublocality_level_1") != null && !jsonObj.get("sublocality_level_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sublocality_level_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sublocality_level_1").toString()));
      }
      if (jsonObj.get("street_number") != null && !jsonObj.get("street_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street_number").toString()));
      }
      if (jsonObj.get("route") != null && !jsonObj.get("route").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponsePropertyGeoEn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponsePropertyGeoEn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponsePropertyGeoEn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponsePropertyGeoEn.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponsePropertyGeoEn>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponsePropertyGeoEn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponsePropertyGeoEn read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponsePropertyGeoEn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponsePropertyGeoEn
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponsePropertyGeoEn
  */
  public static V1PropertyGetPost200ResponsePropertyGeoEn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponsePropertyGeoEn.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponsePropertyGeoEn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

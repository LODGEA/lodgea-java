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
import com.lodgea.model.AvailablePropertiesInner1GeoLocation;
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
 * A geographical information set describing the location of this property.&lt;br&gt;&lt;br&gt;See also &lt;a href&#x3D;\&quot;#locationtypes\&quot;&gt;in the appendix&lt;/a&gt;.
 */
@ApiModel(description = "A geographical information set describing the location of this property.<br><br>See also <a href=\"#locationtypes\">in the appendix</a>.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-26T16:09:38.541455406Z[Etc/UTC]")
public class AvailablePropertiesInner1Geo {
  /**
   * The language of the localizable fields ot this geographical information set.&lt;p&gt;Please note that beside the general restrictions listed below only languages configured during system setup for your respective tenant are allowed.&lt;/p&gt;&lt;p&gt;See also &lt;a href&#x3D;\&quot;#isolanguage-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   */
  @JsonAdapter(LanguageEnum.Adapter.class)
  public enum LanguageEnum {
    AF("af"),
    
    AR("ar"),
    
    BG("bg"),
    
    CA("ca"),
    
    CS("cs"),
    
    DA("da"),
    
    DE("de"),
    
    EL("el"),
    
    EN("en"),
    
    ES("es"),
    
    ET("et"),
    
    FI("fi"),
    
    FR("fr"),
    
    HE("he"),
    
    HI("hi"),
    
    HR("hr"),
    
    HU("hu"),
    
    ID("id"),
    
    IS("is"),
    
    IT("it"),
    
    JA("ja"),
    
    KO("ko"),
    
    LT("lt"),
    
    LV("lv"),
    
    NL("nl"),
    
    NO("no"),
    
    PL("pl"),
    
    PT("pt"),
    
    RO("ro"),
    
    RU("ru"),
    
    SK("sk"),
    
    SL("sl"),
    
    SR("sr"),
    
    SV("sv"),
    
    TH("th"),
    
    TR("tr"),
    
    VI("vi"),
    
    ZH("zh");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LanguageEnum fromValue(String value) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LanguageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LanguageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LanguageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private LanguageEnum language;

  public static final String SERIALIZED_NAME_FORMATTED_ADDRESS = "formatted_address";
  @SerializedName(SERIALIZED_NAME_FORMATTED_ADDRESS)
  private String formattedAddress;

  public static final String SERIALIZED_NAME_ROUTE = "route";
  @SerializedName(SERIALIZED_NAME_ROUTE)
  private String route;

  public static final String SERIALIZED_NAME_STREET_NUMBER = "street_number";
  @SerializedName(SERIALIZED_NAME_STREET_NUMBER)
  private String streetNumber;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_LOCALITY = "locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private String locality;

  public static final String SERIALIZED_NAME_SUBLOCALITY = "sublocality";
  @SerializedName(SERIALIZED_NAME_SUBLOCALITY)
  private String sublocality;

  public static final String SERIALIZED_NAME_SUBLOCALITY_LEVEL1 = "sublocality_level_1";
  @SerializedName(SERIALIZED_NAME_SUBLOCALITY_LEVEL1)
  private String sublocalityLevel1;

  public static final String SERIALIZED_NAME_SUBLOCALITY_LEVEL2 = "sublocality_level_2";
  @SerializedName(SERIALIZED_NAME_SUBLOCALITY_LEVEL2)
  private String sublocalityLevel2;

  public static final String SERIALIZED_NAME_SUBLOCALITY_LEVEL3 = "sublocality_level_3";
  @SerializedName(SERIALIZED_NAME_SUBLOCALITY_LEVEL3)
  private String sublocalityLevel3;

  public static final String SERIALIZED_NAME_SUBLOCALITY_LEVEL4 = "sublocality_level_4";
  @SerializedName(SERIALIZED_NAME_SUBLOCALITY_LEVEL4)
  private String sublocalityLevel4;

  public static final String SERIALIZED_NAME_SUBLOCALITY_LEVEL5 = "sublocality_level_5";
  @SerializedName(SERIALIZED_NAME_SUBLOCALITY_LEVEL5)
  private String sublocalityLevel5;

  public static final String SERIALIZED_NAME_ADMINISTRATIVE_AREA_LEVEL1 = "administrative_area_level_1";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATIVE_AREA_LEVEL1)
  private String administrativeAreaLevel1;

  public static final String SERIALIZED_NAME_ADMINISTRATIVE_AREA_LEVEL2 = "administrative_area_level_2";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATIVE_AREA_LEVEL2)
  private String administrativeAreaLevel2;

  public static final String SERIALIZED_NAME_ADMINISTRATIVE_AREA_LEVEL3 = "administrative_area_level_3";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATIVE_AREA_LEVEL3)
  private String administrativeAreaLevel3;

  public static final String SERIALIZED_NAME_ADMINISTRATIVE_AREA_LEVEL4 = "administrative_area_level_4";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATIVE_AREA_LEVEL4)
  private String administrativeAreaLevel4;

  public static final String SERIALIZED_NAME_ADMINISTRATIVE_AREA_LEVEL5 = "administrative_area_level_5";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATIVE_AREA_LEVEL5)
  private String administrativeAreaLevel5;

  public static final String SERIALIZED_NAME_STATE_CODE = "state_code";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private AvailablePropertiesInner1GeoLocation location;

  public static final String SERIALIZED_NAME_PLACE_ID = "place_id";
  @SerializedName(SERIALIZED_NAME_PLACE_ID)
  private String placeId;

  public AvailablePropertiesInner1Geo() { 
  }

  public AvailablePropertiesInner1Geo language(LanguageEnum language) {
    
    this.language = language;
    return this;
  }

   /**
   * The language of the localizable fields ot this geographical information set.&lt;p&gt;Please note that beside the general restrictions listed below only languages configured during system setup for your respective tenant are allowed.&lt;/p&gt;&lt;p&gt;See also &lt;a href&#x3D;\&quot;#isolanguage-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   * @return language
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "de", required = true, value = "The language of the localizable fields ot this geographical information set.<p>Please note that beside the general restrictions listed below only languages configured during system setup for your respective tenant are allowed.</p><p>See also <a href=\"#isolanguage-codes\">in the appendix</a>.</p>")

  public LanguageEnum getLanguage() {
    return language;
  }


  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  public AvailablePropertiesInner1Geo formattedAddress(String formattedAddress) {
    
    this.formattedAddress = formattedAddress;
    return this;
  }

   /**
   * The formatted address in the local format of the properties location.
   * @return formattedAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Nordhedig 20, 25980 Sylt, Germany", required = true, value = "The formatted address in the local format of the properties location.")

  public String getFormattedAddress() {
    return formattedAddress;
  }


  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }


  public AvailablePropertiesInner1Geo route(String route) {
    
    this.route = route;
    return this;
  }

   /**
   * The name of the route or street.
   * @return route
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nordhedig", value = "The name of the route or street.")

  public String getRoute() {
    return route;
  }


  public void setRoute(String route) {
    this.route = route;
  }


  public AvailablePropertiesInner1Geo streetNumber(String streetNumber) {
    
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * The number of the street.
   * @return streetNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "The number of the street.")

  public String getStreetNumber() {
    return streetNumber;
  }


  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }


  public AvailablePropertiesInner1Geo postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code of the location.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25980", value = "The postal code of the location.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public AvailablePropertiesInner1Geo locality(String locality) {
    
    this.locality = locality;
    return this;
  }

   /**
   * A city or town.
   * @return locality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sylt", value = "A city or town.")

  public String getLocality() {
    return locality;
  }


  public void setLocality(String locality) {
    this.locality = locality;
  }


  public AvailablePropertiesInner1Geo sublocality(String sublocality) {
    
    this.sublocality = sublocality;
    return this;
  }

   /**
   * A smaller area within a locality.
   * @return sublocality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Westerland", value = "A smaller area within a locality.")

  public String getSublocality() {
    return sublocality;
  }


  public void setSublocality(String sublocality) {
    this.sublocality = sublocality;
  }


  public AvailablePropertiesInner1Geo sublocalityLevel1(String sublocalityLevel1) {
    
    this.sublocalityLevel1 = sublocalityLevel1;
    return this;
  }

   /**
   * A smaller area within a locality at level 1.
   * @return sublocalityLevel1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Westerland", value = "A smaller area within a locality at level 1.")

  public String getSublocalityLevel1() {
    return sublocalityLevel1;
  }


  public void setSublocalityLevel1(String sublocalityLevel1) {
    this.sublocalityLevel1 = sublocalityLevel1;
  }


  public AvailablePropertiesInner1Geo sublocalityLevel2(String sublocalityLevel2) {
    
    this.sublocalityLevel2 = sublocalityLevel2;
    return this;
  }

   /**
   * A smaller area within a locality at level 2.
   * @return sublocalityLevel2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Some Sublocality", value = "A smaller area within a locality at level 2.")

  public String getSublocalityLevel2() {
    return sublocalityLevel2;
  }


  public void setSublocalityLevel2(String sublocalityLevel2) {
    this.sublocalityLevel2 = sublocalityLevel2;
  }


  public AvailablePropertiesInner1Geo sublocalityLevel3(String sublocalityLevel3) {
    
    this.sublocalityLevel3 = sublocalityLevel3;
    return this;
  }

   /**
   * A smaller area within a locality at level 3.
   * @return sublocalityLevel3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Some Sublocality", value = "A smaller area within a locality at level 3.")

  public String getSublocalityLevel3() {
    return sublocalityLevel3;
  }


  public void setSublocalityLevel3(String sublocalityLevel3) {
    this.sublocalityLevel3 = sublocalityLevel3;
  }


  public AvailablePropertiesInner1Geo sublocalityLevel4(String sublocalityLevel4) {
    
    this.sublocalityLevel4 = sublocalityLevel4;
    return this;
  }

   /**
   * A smaller area within a locality at level 4.
   * @return sublocalityLevel4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Some Sublocality", value = "A smaller area within a locality at level 4.")

  public String getSublocalityLevel4() {
    return sublocalityLevel4;
  }


  public void setSublocalityLevel4(String sublocalityLevel4) {
    this.sublocalityLevel4 = sublocalityLevel4;
  }


  public AvailablePropertiesInner1Geo sublocalityLevel5(String sublocalityLevel5) {
    
    this.sublocalityLevel5 = sublocalityLevel5;
    return this;
  }

   /**
   * A smaller area within a locality at level 5.
   * @return sublocalityLevel5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Some Sublocality", value = "A smaller area within a locality at level 5.")

  public String getSublocalityLevel5() {
    return sublocalityLevel5;
  }


  public void setSublocalityLevel5(String sublocalityLevel5) {
    this.sublocalityLevel5 = sublocalityLevel5;
  }


  public AvailablePropertiesInner1Geo administrativeAreaLevel1(String administrativeAreaLevel1) {
    
    this.administrativeAreaLevel1 = administrativeAreaLevel1;
    return this;
  }

   /**
   * A level 1 administrative area, such as a state or province.
   * @return administrativeAreaLevel1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Schleswig-Holstein", value = "A level 1 administrative area, such as a state or province.")

  public String getAdministrativeAreaLevel1() {
    return administrativeAreaLevel1;
  }


  public void setAdministrativeAreaLevel1(String administrativeAreaLevel1) {
    this.administrativeAreaLevel1 = administrativeAreaLevel1;
  }


  public AvailablePropertiesInner1Geo administrativeAreaLevel2(String administrativeAreaLevel2) {
    
    this.administrativeAreaLevel2 = administrativeAreaLevel2;
    return this;
  }

   /**
   * A level 2 administrative area.
   * @return administrativeAreaLevel2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Friesland", value = "A level 2 administrative area.")

  public String getAdministrativeAreaLevel2() {
    return administrativeAreaLevel2;
  }


  public void setAdministrativeAreaLevel2(String administrativeAreaLevel2) {
    this.administrativeAreaLevel2 = administrativeAreaLevel2;
  }


  public AvailablePropertiesInner1Geo administrativeAreaLevel3(String administrativeAreaLevel3) {
    
    this.administrativeAreaLevel3 = administrativeAreaLevel3;
    return this;
  }

   /**
   * A level 3 administrative area
   * @return administrativeAreaLevel3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A level 3 administrative area")

  public String getAdministrativeAreaLevel3() {
    return administrativeAreaLevel3;
  }


  public void setAdministrativeAreaLevel3(String administrativeAreaLevel3) {
    this.administrativeAreaLevel3 = administrativeAreaLevel3;
  }


  public AvailablePropertiesInner1Geo administrativeAreaLevel4(String administrativeAreaLevel4) {
    
    this.administrativeAreaLevel4 = administrativeAreaLevel4;
    return this;
  }

   /**
   * A level 4 administrative area.
   * @return administrativeAreaLevel4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A level 4 administrative area.")

  public String getAdministrativeAreaLevel4() {
    return administrativeAreaLevel4;
  }


  public void setAdministrativeAreaLevel4(String administrativeAreaLevel4) {
    this.administrativeAreaLevel4 = administrativeAreaLevel4;
  }


  public AvailablePropertiesInner1Geo administrativeAreaLevel5(String administrativeAreaLevel5) {
    
    this.administrativeAreaLevel5 = administrativeAreaLevel5;
    return this;
  }

   /**
   * A level 5 administrative area
   * @return administrativeAreaLevel5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A level 5 administrative area")

  public String getAdministrativeAreaLevel5() {
    return administrativeAreaLevel5;
  }


  public void setAdministrativeAreaLevel5(String administrativeAreaLevel5) {
    this.administrativeAreaLevel5 = administrativeAreaLevel5;
  }


  public AvailablePropertiesInner1Geo stateCode(String stateCode) {
    
    this.stateCode = stateCode;
    return this;
  }

   /**
   * The state or province code for the administrative area.
   * @return stateCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SH", value = "The state or province code for the administrative area.")

  public String getStateCode() {
    return stateCode;
  }


  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  public AvailablePropertiesInner1Geo country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country of this geographical information set.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Germany", value = "The country of this geographical information set.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public AvailablePropertiesInner1Geo countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code for the country.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DE", value = "The country code for the country.")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public AvailablePropertiesInner1Geo location(AvailablePropertiesInner1GeoLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AvailablePropertiesInner1GeoLocation getLocation() {
    return location;
  }


  public void setLocation(AvailablePropertiesInner1GeoLocation location) {
    this.location = location;
  }


  public AvailablePropertiesInner1Geo placeId(String placeId) {
    
    this.placeId = placeId;
    return this;
  }

   /**
   * Uniquely identifies a place in our database.
   * @return placeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ChIJVaxqTevetEcRyfs8PGHK6mw", required = true, value = "Uniquely identifies a place in our database.")

  public String getPlaceId() {
    return placeId;
  }


  public void setPlaceId(String placeId) {
    this.placeId = placeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailablePropertiesInner1Geo availablePropertiesInner1Geo = (AvailablePropertiesInner1Geo) o;
    return Objects.equals(this.language, availablePropertiesInner1Geo.language) &&
        Objects.equals(this.formattedAddress, availablePropertiesInner1Geo.formattedAddress) &&
        Objects.equals(this.route, availablePropertiesInner1Geo.route) &&
        Objects.equals(this.streetNumber, availablePropertiesInner1Geo.streetNumber) &&
        Objects.equals(this.postalCode, availablePropertiesInner1Geo.postalCode) &&
        Objects.equals(this.locality, availablePropertiesInner1Geo.locality) &&
        Objects.equals(this.sublocality, availablePropertiesInner1Geo.sublocality) &&
        Objects.equals(this.sublocalityLevel1, availablePropertiesInner1Geo.sublocalityLevel1) &&
        Objects.equals(this.sublocalityLevel2, availablePropertiesInner1Geo.sublocalityLevel2) &&
        Objects.equals(this.sublocalityLevel3, availablePropertiesInner1Geo.sublocalityLevel3) &&
        Objects.equals(this.sublocalityLevel4, availablePropertiesInner1Geo.sublocalityLevel4) &&
        Objects.equals(this.sublocalityLevel5, availablePropertiesInner1Geo.sublocalityLevel5) &&
        Objects.equals(this.administrativeAreaLevel1, availablePropertiesInner1Geo.administrativeAreaLevel1) &&
        Objects.equals(this.administrativeAreaLevel2, availablePropertiesInner1Geo.administrativeAreaLevel2) &&
        Objects.equals(this.administrativeAreaLevel3, availablePropertiesInner1Geo.administrativeAreaLevel3) &&
        Objects.equals(this.administrativeAreaLevel4, availablePropertiesInner1Geo.administrativeAreaLevel4) &&
        Objects.equals(this.administrativeAreaLevel5, availablePropertiesInner1Geo.administrativeAreaLevel5) &&
        Objects.equals(this.stateCode, availablePropertiesInner1Geo.stateCode) &&
        Objects.equals(this.country, availablePropertiesInner1Geo.country) &&
        Objects.equals(this.countryCode, availablePropertiesInner1Geo.countryCode) &&
        Objects.equals(this.location, availablePropertiesInner1Geo.location) &&
        Objects.equals(this.placeId, availablePropertiesInner1Geo.placeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, formattedAddress, route, streetNumber, postalCode, locality, sublocality, sublocalityLevel1, sublocalityLevel2, sublocalityLevel3, sublocalityLevel4, sublocalityLevel5, administrativeAreaLevel1, administrativeAreaLevel2, administrativeAreaLevel3, administrativeAreaLevel4, administrativeAreaLevel5, stateCode, country, countryCode, location, placeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailablePropertiesInner1Geo {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    sublocality: ").append(toIndentedString(sublocality)).append("\n");
    sb.append("    sublocalityLevel1: ").append(toIndentedString(sublocalityLevel1)).append("\n");
    sb.append("    sublocalityLevel2: ").append(toIndentedString(sublocalityLevel2)).append("\n");
    sb.append("    sublocalityLevel3: ").append(toIndentedString(sublocalityLevel3)).append("\n");
    sb.append("    sublocalityLevel4: ").append(toIndentedString(sublocalityLevel4)).append("\n");
    sb.append("    sublocalityLevel5: ").append(toIndentedString(sublocalityLevel5)).append("\n");
    sb.append("    administrativeAreaLevel1: ").append(toIndentedString(administrativeAreaLevel1)).append("\n");
    sb.append("    administrativeAreaLevel2: ").append(toIndentedString(administrativeAreaLevel2)).append("\n");
    sb.append("    administrativeAreaLevel3: ").append(toIndentedString(administrativeAreaLevel3)).append("\n");
    sb.append("    administrativeAreaLevel4: ").append(toIndentedString(administrativeAreaLevel4)).append("\n");
    sb.append("    administrativeAreaLevel5: ").append(toIndentedString(administrativeAreaLevel5)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
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
    openapiFields.add("language");
    openapiFields.add("formatted_address");
    openapiFields.add("route");
    openapiFields.add("street_number");
    openapiFields.add("postal_code");
    openapiFields.add("locality");
    openapiFields.add("sublocality");
    openapiFields.add("sublocality_level_1");
    openapiFields.add("sublocality_level_2");
    openapiFields.add("sublocality_level_3");
    openapiFields.add("sublocality_level_4");
    openapiFields.add("sublocality_level_5");
    openapiFields.add("administrative_area_level_1");
    openapiFields.add("administrative_area_level_2");
    openapiFields.add("administrative_area_level_3");
    openapiFields.add("administrative_area_level_4");
    openapiFields.add("administrative_area_level_5");
    openapiFields.add("state_code");
    openapiFields.add("country");
    openapiFields.add("country_code");
    openapiFields.add("location");
    openapiFields.add("place_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("language");
    openapiRequiredFields.add("formatted_address");
    openapiRequiredFields.add("location");
    openapiRequiredFields.add("place_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AvailablePropertiesInner1Geo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AvailablePropertiesInner1Geo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailablePropertiesInner1Geo is not found in the empty JSON string", AvailablePropertiesInner1Geo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AvailablePropertiesInner1Geo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailablePropertiesInner1Geo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AvailablePropertiesInner1Geo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (jsonObj.get("formatted_address") != null && !jsonObj.get("formatted_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formatted_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formatted_address").toString()));
      }
      if (jsonObj.get("route") != null && !jsonObj.get("route").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route").toString()));
      }
      if (jsonObj.get("street_number") != null && !jsonObj.get("street_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street_number").toString()));
      }
      if (jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
      if (jsonObj.get("locality") != null && !jsonObj.get("locality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locality").toString()));
      }
      if (jsonObj.get("sublocality") != null && !jsonObj.get("sublocality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sublocality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sublocality").toString()));
      }
      if (jsonObj.get("sublocality_level_1") != null && !jsonObj.get("sublocality_level_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sublocality_level_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sublocality_level_1").toString()));
      }
      if (jsonObj.get("sublocality_level_2") != null && !jsonObj.get("sublocality_level_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sublocality_level_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sublocality_level_2").toString()));
      }
      if (jsonObj.get("sublocality_level_3") != null && !jsonObj.get("sublocality_level_3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sublocality_level_3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sublocality_level_3").toString()));
      }
      if (jsonObj.get("sublocality_level_4") != null && !jsonObj.get("sublocality_level_4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sublocality_level_4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sublocality_level_4").toString()));
      }
      if (jsonObj.get("sublocality_level_5") != null && !jsonObj.get("sublocality_level_5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sublocality_level_5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sublocality_level_5").toString()));
      }
      if (jsonObj.get("administrative_area_level_1") != null && !jsonObj.get("administrative_area_level_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `administrative_area_level_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("administrative_area_level_1").toString()));
      }
      if (jsonObj.get("administrative_area_level_2") != null && !jsonObj.get("administrative_area_level_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `administrative_area_level_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("administrative_area_level_2").toString()));
      }
      if (jsonObj.get("administrative_area_level_3") != null && !jsonObj.get("administrative_area_level_3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `administrative_area_level_3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("administrative_area_level_3").toString()));
      }
      if (jsonObj.get("administrative_area_level_4") != null && !jsonObj.get("administrative_area_level_4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `administrative_area_level_4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("administrative_area_level_4").toString()));
      }
      if (jsonObj.get("administrative_area_level_5") != null && !jsonObj.get("administrative_area_level_5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `administrative_area_level_5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("administrative_area_level_5").toString()));
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
      // validate the optional field `location`
      if (jsonObj.getAsJsonObject("location") != null) {
        AvailablePropertiesInner1GeoLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      if (jsonObj.get("place_id") != null && !jsonObj.get("place_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `place_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("place_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailablePropertiesInner1Geo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailablePropertiesInner1Geo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailablePropertiesInner1Geo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailablePropertiesInner1Geo.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailablePropertiesInner1Geo>() {
           @Override
           public void write(JsonWriter out, AvailablePropertiesInner1Geo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailablePropertiesInner1Geo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AvailablePropertiesInner1Geo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvailablePropertiesInner1Geo
  * @throws IOException if the JSON string is invalid with respect to AvailablePropertiesInner1Geo
  */
  public static AvailablePropertiesInner1Geo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailablePropertiesInner1Geo.class);
  }

 /**
  * Convert an instance of AvailablePropertiesInner1Geo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


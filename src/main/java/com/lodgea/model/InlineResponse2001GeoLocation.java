/*
 * lodgea-java
 * LODGEA SDK for java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.2.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * InlineResponse2001GeoLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-07T12:22:24.387616647Z[Etc/UTC]")
public class InlineResponse2001GeoLocation {
  public static final String SERIALIZED_NAME_LNG = "lng";
  @SerializedName(SERIALIZED_NAME_LNG)
  private BigDecimal lng;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private BigDecimal lat;

  public InlineResponse2001GeoLocation() { 
  }

  public InlineResponse2001GeoLocation lng(BigDecimal lng) {
    
    this.lng = lng;
    return this;
  }

   /**
   * The longitude coordinate of the location.
   * @return lng
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8.304857", required = true, value = "The longitude coordinate of the location.")

  public BigDecimal getLng() {
    return lng;
  }


  public void setLng(BigDecimal lng) {
    this.lng = lng;
  }


  public InlineResponse2001GeoLocation lat(BigDecimal lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * The location of the property as coordinates
   * @return lat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "54.9157118", required = true, value = "The location of the property as coordinates")

  public BigDecimal getLat() {
    return lat;
  }


  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001GeoLocation inlineResponse2001GeoLocation = (InlineResponse2001GeoLocation) o;
    return Objects.equals(this.lng, inlineResponse2001GeoLocation.lng) &&
        Objects.equals(this.lat, inlineResponse2001GeoLocation.lat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lng, lat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001GeoLocation {\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
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

}


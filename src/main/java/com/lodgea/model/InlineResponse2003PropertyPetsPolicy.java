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

/**
 * Contains information about the pets policy of the property
 */
@ApiModel(description = "Contains information about the pets policy of the property")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-07T12:22:24.387616647Z[Etc/UTC]")
public class InlineResponse2003PropertyPetsPolicy {
  public static final String SERIALIZED_NAME_ALLOWED = "allowed";
  @SerializedName(SERIALIZED_NAME_ALLOWED)
  private Boolean allowed;

  public static final String SERIALIZED_NAME_BY_ARRANGEMENT = "byArrangement";
  @SerializedName(SERIALIZED_NAME_BY_ARRANGEMENT)
  private Boolean byArrangement;

  public static final String SERIALIZED_NAME_FREE_OF_CHARGE = "freeOfCharge";
  @SerializedName(SERIALIZED_NAME_FREE_OF_CHARGE)
  private Boolean freeOfCharge;

  public InlineResponse2003PropertyPetsPolicy() { 
  }

  public InlineResponse2003PropertyPetsPolicy allowed(Boolean allowed) {
    
    this.allowed = allowed;
    return this;
  }

   /**
   * Indicates if pets are allowed in the property.
   * @return allowed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Indicates if pets are allowed in the property.")

  public Boolean getAllowed() {
    return allowed;
  }


  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }


  public InlineResponse2003PropertyPetsPolicy byArrangement(Boolean byArrangement) {
    
    this.byArrangement = byArrangement;
    return this;
  }

   /**
   * Indicates if pets are allowed by arrangement.
   * @return byArrangement
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Indicates if pets are allowed by arrangement.")

  public Boolean getByArrangement() {
    return byArrangement;
  }


  public void setByArrangement(Boolean byArrangement) {
    this.byArrangement = byArrangement;
  }


  public InlineResponse2003PropertyPetsPolicy freeOfCharge(Boolean freeOfCharge) {
    
    this.freeOfCharge = freeOfCharge;
    return this;
  }

   /**
   * Indicates if pets are allowed without any additional charge.
   * @return freeOfCharge
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Indicates if pets are allowed without any additional charge.")

  public Boolean getFreeOfCharge() {
    return freeOfCharge;
  }


  public void setFreeOfCharge(Boolean freeOfCharge) {
    this.freeOfCharge = freeOfCharge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003PropertyPetsPolicy inlineResponse2003PropertyPetsPolicy = (InlineResponse2003PropertyPetsPolicy) o;
    return Objects.equals(this.allowed, inlineResponse2003PropertyPetsPolicy.allowed) &&
        Objects.equals(this.byArrangement, inlineResponse2003PropertyPetsPolicy.byArrangement) &&
        Objects.equals(this.freeOfCharge, inlineResponse2003PropertyPetsPolicy.freeOfCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, byArrangement, freeOfCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003PropertyPetsPolicy {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    byArrangement: ").append(toIndentedString(byArrangement)).append("\n");
    sb.append("    freeOfCharge: ").append(toIndentedString(freeOfCharge)).append("\n");
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


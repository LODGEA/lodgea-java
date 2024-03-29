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
 * Information regarding requirements towards guests.
 */
@ApiModel(description = "Information regarding requirements towards guests.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-07T12:22:24.387616647Z[Etc/UTC]")
public class InlineResponse2003PropertyGuestInfo {
  public static final String SERIALIZED_NAME_GUEST_ADDRESS_REQUIRED = "guestAddressRequired";
  @SerializedName(SERIALIZED_NAME_GUEST_ADDRESS_REQUIRED)
  private Boolean guestAddressRequired;

  public static final String SERIALIZED_NAME_GUEST_CONTACT_NUMBER_REQUIRED = "guestContactNumberRequired";
  @SerializedName(SERIALIZED_NAME_GUEST_CONTACT_NUMBER_REQUIRED)
  private Boolean guestContactNumberRequired;

  public static final String SERIALIZED_NAME_GUEST_NAME_LIST_REQUIRED = "guestNameListRequired";
  @SerializedName(SERIALIZED_NAME_GUEST_NAME_LIST_REQUIRED)
  private Boolean guestNameListRequired;

  public InlineResponse2003PropertyGuestInfo() { 
  }

  public InlineResponse2003PropertyGuestInfo guestAddressRequired(Boolean guestAddressRequired) {
    
    this.guestAddressRequired = guestAddressRequired;
    return this;
  }

   /**
   * Whether the address of the guest is required to book this property.
   * @return guestAddressRequired
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the address of the guest is required to book this property.")

  public Boolean getGuestAddressRequired() {
    return guestAddressRequired;
  }


  public void setGuestAddressRequired(Boolean guestAddressRequired) {
    this.guestAddressRequired = guestAddressRequired;
  }


  public InlineResponse2003PropertyGuestInfo guestContactNumberRequired(Boolean guestContactNumberRequired) {
    
    this.guestContactNumberRequired = guestContactNumberRequired;
    return this;
  }

   /**
   * Whether the phone number of the guest is required to book this property.
   * @return guestContactNumberRequired
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the phone number of the guest is required to book this property.")

  public Boolean getGuestContactNumberRequired() {
    return guestContactNumberRequired;
  }


  public void setGuestContactNumberRequired(Boolean guestContactNumberRequired) {
    this.guestContactNumberRequired = guestContactNumberRequired;
  }


  public InlineResponse2003PropertyGuestInfo guestNameListRequired(Boolean guestNameListRequired) {
    
    this.guestNameListRequired = guestNameListRequired;
    return this;
  }

   /**
   * Whether a list of the guests names is required to book this property.
   * @return guestNameListRequired
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether a list of the guests names is required to book this property.")

  public Boolean getGuestNameListRequired() {
    return guestNameListRequired;
  }


  public void setGuestNameListRequired(Boolean guestNameListRequired) {
    this.guestNameListRequired = guestNameListRequired;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003PropertyGuestInfo inlineResponse2003PropertyGuestInfo = (InlineResponse2003PropertyGuestInfo) o;
    return Objects.equals(this.guestAddressRequired, inlineResponse2003PropertyGuestInfo.guestAddressRequired) &&
        Objects.equals(this.guestContactNumberRequired, inlineResponse2003PropertyGuestInfo.guestContactNumberRequired) &&
        Objects.equals(this.guestNameListRequired, inlineResponse2003PropertyGuestInfo.guestNameListRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guestAddressRequired, guestContactNumberRequired, guestNameListRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003PropertyGuestInfo {\n");
    sb.append("    guestAddressRequired: ").append(toIndentedString(guestAddressRequired)).append("\n");
    sb.append("    guestContactNumberRequired: ").append(toIndentedString(guestContactNumberRequired)).append("\n");
    sb.append("    guestNameListRequired: ").append(toIndentedString(guestNameListRequired)).append("\n");
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


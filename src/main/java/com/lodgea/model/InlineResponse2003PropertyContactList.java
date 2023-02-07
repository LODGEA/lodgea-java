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
import com.lodgea.model.InlineResponse2003PropertyAddressList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2003PropertyContactList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-07T12:22:24.387616647Z[Etc/UTC]")
public class InlineResponse2003PropertyContactList {
  /**
   * The type of profile this contact belongs to.
   */
  @JsonAdapter(ProfileTypeEnum.Adapter.class)
  public enum ProfileTypeEnum {
    GENERAL("general"),
    
    CONTRACT("contract"),
    
    RESERVATIONS("reservations"),
    
    INVOICES("invoices"),
    
    AVAILABILITY("availability"),
    
    SITE_CONTENT("site_content"),
    
    PARITY("parity"),
    
    REQUESTS("requests"),
    
    CENTRAL_RESERVATIONS("central_reservations"),
    
    PHYSICALLOCATION("physicallocation");

    private String value;

    ProfileTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProfileTypeEnum fromValue(String value) {
      for (ProfileTypeEnum b : ProfileTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProfileTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProfileTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProfileTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProfileTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROFILE_TYPE = "profileType";
  @SerializedName(SERIALIZED_NAME_PROFILE_TYPE)
  private ProfileTypeEnum profileType;

  public static final String SERIALIZED_NAME_ADDRESS_LIST = "addressList";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LIST)
  private List<InlineResponse2003PropertyAddressList> addressList = new ArrayList<InlineResponse2003PropertyAddressList>();

  public InlineResponse2003PropertyContactList() { 
  }

  public InlineResponse2003PropertyContactList profileType(ProfileTypeEnum profileType) {
    
    this.profileType = profileType;
    return this;
  }

   /**
   * The type of profile this contact belongs to.
   * @return profileType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "physicallocation", required = true, value = "The type of profile this contact belongs to.")

  public ProfileTypeEnum getProfileType() {
    return profileType;
  }


  public void setProfileType(ProfileTypeEnum profileType) {
    this.profileType = profileType;
  }


  public InlineResponse2003PropertyContactList addressList(List<InlineResponse2003PropertyAddressList> addressList) {
    
    this.addressList = addressList;
    return this;
  }

  public InlineResponse2003PropertyContactList addAddressListItem(InlineResponse2003PropertyAddressList addressListItem) {
    this.addressList.add(addressListItem);
    return this;
  }

   /**
   * A list of addresses for this contact
   * @return addressList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of addresses for this contact")

  public List<InlineResponse2003PropertyAddressList> getAddressList() {
    return addressList;
  }


  public void setAddressList(List<InlineResponse2003PropertyAddressList> addressList) {
    this.addressList = addressList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003PropertyContactList inlineResponse2003PropertyContactList = (InlineResponse2003PropertyContactList) o;
    return Objects.equals(this.profileType, inlineResponse2003PropertyContactList.profileType) &&
        Objects.equals(this.addressList, inlineResponse2003PropertyContactList.addressList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileType, addressList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003PropertyContactList {\n");
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
    sb.append("    addressList: ").append(toIndentedString(addressList)).append("\n");
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

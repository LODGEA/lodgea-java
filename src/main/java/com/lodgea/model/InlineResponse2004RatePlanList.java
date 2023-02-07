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
import com.lodgea.model.InlineResponse2004PricingList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2004RatePlanList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-07T12:22:24.387616647Z[Etc/UTC]")
public class InlineResponse2004RatePlanList {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_PRICING_LIST = "pricingList";
  @SerializedName(SERIALIZED_NAME_PRICING_LIST)
  private List<InlineResponse2004PricingList> pricingList = new ArrayList<InlineResponse2004PricingList>();

  public InlineResponse2004RatePlanList() { 
  }

  public InlineResponse2004RatePlanList active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Whether the rate plan is active.
   * @return active
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Whether the rate plan is active.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public InlineResponse2004RatePlanList name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the rate plan.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Standard 8436", required = true, value = "The name of the rate plan.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse2004RatePlanList code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code identifying the rate plan.
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "standard-8436", required = true, value = "The code identifying the rate plan.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public InlineResponse2004RatePlanList pricingList(List<InlineResponse2004PricingList> pricingList) {
    
    this.pricingList = pricingList;
    return this;
  }

  public InlineResponse2004RatePlanList addPricingListItem(InlineResponse2004PricingList pricingListItem) {
    this.pricingList.add(pricingListItem);
    return this;
  }

   /**
   * Get pricingList
   * @return pricingList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<InlineResponse2004PricingList> getPricingList() {
    return pricingList;
  }


  public void setPricingList(List<InlineResponse2004PricingList> pricingList) {
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
    InlineResponse2004RatePlanList inlineResponse2004RatePlanList = (InlineResponse2004RatePlanList) o;
    return Objects.equals(this.active, inlineResponse2004RatePlanList.active) &&
        Objects.equals(this.name, inlineResponse2004RatePlanList.name) &&
        Objects.equals(this.code, inlineResponse2004RatePlanList.code) &&
        Objects.equals(this.pricingList, inlineResponse2004RatePlanList.pricingList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, name, code, pricingList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004RatePlanList {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

}

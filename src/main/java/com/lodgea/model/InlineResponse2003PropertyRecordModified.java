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
 * Information regarding the last modification of the property object.
 */
@ApiModel(description = "Information regarding the last modification of the property object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-07T12:22:24.387616647Z[Etc/UTC]")
public class InlineResponse2003PropertyRecordModified {
  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_TENANT = "tenant";
  @SerializedName(SERIALIZED_NAME_TENANT)
  private String tenant;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private BigDecimal time;

  public InlineResponse2003PropertyRecordModified() { 
  }

  public InlineResponse2003PropertyRecordModified user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * The user that performed the edit action on the property.
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "microsoft:user:2f1d8a1b-bae8-4333-8f0f-7ad28af03e3f", required = true, value = "The user that performed the edit action on the property.")

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  public InlineResponse2003PropertyRecordModified tenant(String tenant) {
    
    this.tenant = tenant;
    return this;
  }

   /**
   * The tenant for which the user performed the edit action on the property.
   * @return tenant
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "dmo-demo", required = true, value = "The tenant for which the user performed the edit action on the property.")

  public String getTenant() {
    return tenant;
  }


  public void setTenant(String tenant) {
    this.tenant = tenant;
  }


  public InlineResponse2003PropertyRecordModified role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * The role of the user that performed the edit action on the property.
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "admin", value = "The role of the user that performed the edit action on the property.")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public InlineResponse2003PropertyRecordModified time(BigDecimal time) {
    
    this.time = time;
    return this;
  }

   /**
   * The timestamp at which the edit action was performed.
   * @return time
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1652091332815", required = true, value = "The timestamp at which the edit action was performed.")

  public BigDecimal getTime() {
    return time;
  }


  public void setTime(BigDecimal time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003PropertyRecordModified inlineResponse2003PropertyRecordModified = (InlineResponse2003PropertyRecordModified) o;
    return Objects.equals(this.user, inlineResponse2003PropertyRecordModified.user) &&
        Objects.equals(this.tenant, inlineResponse2003PropertyRecordModified.tenant) &&
        Objects.equals(this.role, inlineResponse2003PropertyRecordModified.role) &&
        Objects.equals(this.time, inlineResponse2003PropertyRecordModified.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, tenant, role, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003PropertyRecordModified {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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


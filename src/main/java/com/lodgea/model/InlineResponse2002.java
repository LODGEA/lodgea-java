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
import com.lodgea.model.InlineResponse2002List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2002
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-07T12:22:24.387616647Z[Etc/UTC]")
public class InlineResponse2002 {
  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<InlineResponse2002List> _list = new ArrayList<InlineResponse2002List>();

  public static final String SERIALIZED_NAME_PAGE_TOKEN = "pageToken";
  @SerializedName(SERIALIZED_NAME_PAGE_TOKEN)
  private String pageToken;

  public InlineResponse2002() { 
  }

  public InlineResponse2002 _list(List<InlineResponse2002List> _list) {
    
    this._list = _list;
    return this;
  }

  public InlineResponse2002 addListItem(InlineResponse2002List _listItem) {
    this._list.add(_listItem);
    return this;
  }

   /**
   * Get _list
   * @return _list
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<InlineResponse2002List> getList() {
    return _list;
  }


  public void setList(List<InlineResponse2002List> _list) {
    this._list = _list;
  }


  public InlineResponse2002 pageToken(String pageToken) {
    
    this.pageToken = pageToken;
    return this;
  }

   /**
   * The page token to pass in the subsequent call to retrieve more results, only returned if more results are available.
   * @return pageToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eyJ0ZW5hbnRDb2RlIjoiZG1vLWRlbW8iLCJuYW1lIjoiTGFuZGhhdXMgVHJlc2tlcnNhbmQiLCJwcm9wZXJ0eUlkIjoibGFuZGhhdXMtdHJlc2tlcnNhbmQifQ==", value = "The page token to pass in the subsequent call to retrieve more results, only returned if more results are available.")

  public String getPageToken() {
    return pageToken;
  }


  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this._list, inlineResponse2002._list) &&
        Objects.equals(this.pageToken, inlineResponse2002.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_list, pageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
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


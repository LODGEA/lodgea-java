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
 * InlineResponse2003PropertyPropertyInfoMessageList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-07T12:22:24.387616647Z[Etc/UTC]")
public class InlineResponse2003PropertyPropertyInfoMessageList {
  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "languageCode";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public InlineResponse2003PropertyPropertyInfoMessageList() { 
  }

  public InlineResponse2003PropertyPropertyInfoMessageList languageCode(String languageCode) {
    
    this.languageCode = languageCode;
    return this;
  }

   /**
   * The language of this message.&lt;p&gt;Please note that beside the general restrictions listed below only languages configured during system setup for your respective tenant are allowed.&lt;/p&gt;&lt;p&gt;See also &lt;a href&#x3D;\&quot;#isolanguage-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   * @return languageCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "en", required = true, value = "The language of this message.<p>Please note that beside the general restrictions listed below only languages configured during system setup for your respective tenant are allowed.</p><p>See also <a href=\"#isolanguage-codes\">in the appendix</a>.</p>")

  public String getLanguageCode() {
    return languageCode;
  }


  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public InlineResponse2003PropertyPropertyInfoMessageList text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The text of this message.
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "More sea does not work! In a unique location just behind the dunes, less than 100 steps from the beach and the spa promenade, in a prime location on the beach “Nordhedig”, you can enjoy your stay in a small, new 5-star luxury complex (DTV classification) with a total of 4 separate apartments for 2-4 people. The interior has a modern rural style that offers all the amenities. You can find films about the property and individual apartments on our website.", required = true, value = "The text of this message.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003PropertyPropertyInfoMessageList inlineResponse2003PropertyPropertyInfoMessageList = (InlineResponse2003PropertyPropertyInfoMessageList) o;
    return Objects.equals(this.languageCode, inlineResponse2003PropertyPropertyInfoMessageList.languageCode) &&
        Objects.equals(this.text, inlineResponse2003PropertyPropertyInfoMessageList.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageCode, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003PropertyPropertyInfoMessageList {\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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


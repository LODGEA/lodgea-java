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
 * InlineResponse2003PropertyAwardList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-07T12:22:24.387616647Z[Etc/UTC]")
public class InlineResponse2003PropertyAwardList {
  /**
   * The source of this rating. Currently only &lt;code&gt;star-rating&lt;/code&gt; is possible.
   */
  @JsonAdapter(ProviderEnum.Adapter.class)
  public enum ProviderEnum {
    STAR_RATING("star-rating");

    private String value;

    ProviderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProviderEnum fromValue(String value) {
      for (ProviderEnum b : ProviderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProviderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProviderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProviderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProviderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private ProviderEnum provider;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private BigDecimal rating;

  public InlineResponse2003PropertyAwardList() { 
  }

  public InlineResponse2003PropertyAwardList provider(ProviderEnum provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * The source of this rating. Currently only &lt;code&gt;star-rating&lt;/code&gt; is possible.
   * @return provider
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "star-rating", required = true, value = "The source of this rating. Currently only <code>star-rating</code> is possible.")

  public ProviderEnum getProvider() {
    return provider;
  }


  public void setProvider(ProviderEnum provider) {
    this.provider = provider;
  }


  public InlineResponse2003PropertyAwardList rating(BigDecimal rating) {
    
    this.rating = rating;
    return this;
  }

   /**
   * The value of this rating
   * @return rating
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "The value of this rating")

  public BigDecimal getRating() {
    return rating;
  }


  public void setRating(BigDecimal rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003PropertyAwardList inlineResponse2003PropertyAwardList = (InlineResponse2003PropertyAwardList) o;
    return Objects.equals(this.provider, inlineResponse2003PropertyAwardList.provider) &&
        Objects.equals(this.rating, inlineResponse2003PropertyAwardList.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003PropertyAwardList {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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


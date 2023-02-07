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
 * An object outlining the stay with the lowest available price point for this property.
 */
@ApiModel(description = "An object outlining the stay with the lowest available price point for this property.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-07T12:22:24.387616647Z[Etc/UTC]")
public class InlineResponse2001LowestPrice {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_ARRIVAL_DATE = "arrivalDate";
  @SerializedName(SERIALIZED_NAME_ARRIVAL_DATE)
  private BigDecimal arrivalDate;

  public static final String SERIALIZED_NAME_RETURN_DATE = "returnDate";
  @SerializedName(SERIALIZED_NAME_RETURN_DATE)
  private BigDecimal returnDate;

  public static final String SERIALIZED_NAME_LENGTH_OF_STAY = "lengthOfStay";
  @SerializedName(SERIALIZED_NAME_LENGTH_OF_STAY)
  private BigDecimal lengthOfStay;

  public InlineResponse2001LowestPrice() { 
  }

  public InlineResponse2001LowestPrice amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the lowest price.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "89.99", required = true, value = "The amount of the lowest price.")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public InlineResponse2001LowestPrice currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency code for the given amount.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#currencycodes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   * @return currencyCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "EUR", required = true, value = "The currency code for the given amount.<p>See also <a href=\"#currencycodes\">in the appendix</a>.</p>")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public InlineResponse2001LowestPrice arrivalDate(BigDecimal arrivalDate) {
    
    this.arrivalDate = arrivalDate;
    return this;
  }

   /**
   * Arrival date for the given price as unix timestamp (seconds).
   * @return arrivalDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1660780800", required = true, value = "Arrival date for the given price as unix timestamp (seconds).")

  public BigDecimal getArrivalDate() {
    return arrivalDate;
  }


  public void setArrivalDate(BigDecimal arrivalDate) {
    this.arrivalDate = arrivalDate;
  }


  public InlineResponse2001LowestPrice returnDate(BigDecimal returnDate) {
    
    this.returnDate = returnDate;
    return this;
  }

   /**
   * Departure date for the given price as unix timestamp (seconds).
   * @return returnDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1660867200", required = true, value = "Departure date for the given price as unix timestamp (seconds).")

  public BigDecimal getReturnDate() {
    return returnDate;
  }


  public void setReturnDate(BigDecimal returnDate) {
    this.returnDate = returnDate;
  }


  public InlineResponse2001LowestPrice lengthOfStay(BigDecimal lengthOfStay) {
    
    this.lengthOfStay = lengthOfStay;
    return this;
  }

   /**
   * The amount of nights of stay this price is for
   * @return lengthOfStay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The amount of nights of stay this price is for")

  public BigDecimal getLengthOfStay() {
    return lengthOfStay;
  }


  public void setLengthOfStay(BigDecimal lengthOfStay) {
    this.lengthOfStay = lengthOfStay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001LowestPrice inlineResponse2001LowestPrice = (InlineResponse2001LowestPrice) o;
    return Objects.equals(this.amount, inlineResponse2001LowestPrice.amount) &&
        Objects.equals(this.currencyCode, inlineResponse2001LowestPrice.currencyCode) &&
        Objects.equals(this.arrivalDate, inlineResponse2001LowestPrice.arrivalDate) &&
        Objects.equals(this.returnDate, inlineResponse2001LowestPrice.returnDate) &&
        Objects.equals(this.lengthOfStay, inlineResponse2001LowestPrice.lengthOfStay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode, arrivalDate, returnDate, lengthOfStay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001LowestPrice {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    arrivalDate: ").append(toIndentedString(arrivalDate)).append("\n");
    sb.append("    returnDate: ").append(toIndentedString(returnDate)).append("\n");
    sb.append("    lengthOfStay: ").append(toIndentedString(lengthOfStay)).append("\n");
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


/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@lodgea.com
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.lodgea.JSON;

/**
 * V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-05T14:33:56.924929748Z[Etc/UTC]")
public class V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private BigDecimal code;

  public static final String SERIALIZED_NAME_PERCENT_AFTER_RESERVATION = "percentAfterReservation";
  @SerializedName(SERIALIZED_NAME_PERCENT_AFTER_RESERVATION)
  private BigDecimal percentAfterReservation;

  public static final String SERIALIZED_NAME_NIGHTS_AFTER_RESERVATION = "nightsAfterReservation";
  @SerializedName(SERIALIZED_NAME_NIGHTS_AFTER_RESERVATION)
  private BigDecimal nightsAfterReservation;

  public static final String SERIALIZED_NAME_DEADLINE_DAYS = "deadlineDays";
  @SerializedName(SERIALIZED_NAME_DEADLINE_DAYS)
  private BigDecimal deadlineDays;

  public static final String SERIALIZED_NAME_DEADLINE_HOURS = "deadlineHours";
  @SerializedName(SERIALIZED_NAME_DEADLINE_HOURS)
  private BigDecimal deadlineHours;

  public static final String SERIALIZED_NAME_PERCENT_AFTER_DEADLINE = "percentAfterDeadline";
  @SerializedName(SERIALIZED_NAME_PERCENT_AFTER_DEADLINE)
  private BigDecimal percentAfterDeadline;

  public static final String SERIALIZED_NAME_NIGHTS_AFTER_DEADLINE = "nightsAfterDeadline";
  @SerializedName(SERIALIZED_NAME_NIGHTS_AFTER_DEADLINE)
  private BigDecimal nightsAfterDeadline;

  public static final String SERIALIZED_NAME_NO_SHOW_POLICY = "noShowPolicy";
  @SerializedName(SERIALIZED_NAME_NO_SHOW_POLICY)
  private String noShowPolicy;

  public V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner() { 
  }

  public V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner code(BigDecimal code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "152", value = "")

  public BigDecimal getCode() {
    return code;
  }


  public void setCode(BigDecimal code) {
    this.code = code;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner percentAfterReservation(BigDecimal percentAfterReservation) {
    
    this.percentAfterReservation = percentAfterReservation;
    return this;
  }

   /**
   * Get percentAfterReservation
   * @return percentAfterReservation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public BigDecimal getPercentAfterReservation() {
    return percentAfterReservation;
  }


  public void setPercentAfterReservation(BigDecimal percentAfterReservation) {
    this.percentAfterReservation = percentAfterReservation;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner nightsAfterReservation(BigDecimal nightsAfterReservation) {
    
    this.nightsAfterReservation = nightsAfterReservation;
    return this;
  }

   /**
   * Get nightsAfterReservation
   * @return nightsAfterReservation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public BigDecimal getNightsAfterReservation() {
    return nightsAfterReservation;
  }


  public void setNightsAfterReservation(BigDecimal nightsAfterReservation) {
    this.nightsAfterReservation = nightsAfterReservation;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner deadlineDays(BigDecimal deadlineDays) {
    
    this.deadlineDays = deadlineDays;
    return this;
  }

   /**
   * Get deadlineDays
   * @return deadlineDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public BigDecimal getDeadlineDays() {
    return deadlineDays;
  }


  public void setDeadlineDays(BigDecimal deadlineDays) {
    this.deadlineDays = deadlineDays;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner deadlineHours(BigDecimal deadlineHours) {
    
    this.deadlineHours = deadlineHours;
    return this;
  }

   /**
   * Get deadlineHours
   * @return deadlineHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public BigDecimal getDeadlineHours() {
    return deadlineHours;
  }


  public void setDeadlineHours(BigDecimal deadlineHours) {
    this.deadlineHours = deadlineHours;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner percentAfterDeadline(BigDecimal percentAfterDeadline) {
    
    this.percentAfterDeadline = percentAfterDeadline;
    return this;
  }

   /**
   * Get percentAfterDeadline
   * @return percentAfterDeadline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public BigDecimal getPercentAfterDeadline() {
    return percentAfterDeadline;
  }


  public void setPercentAfterDeadline(BigDecimal percentAfterDeadline) {
    this.percentAfterDeadline = percentAfterDeadline;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner nightsAfterDeadline(BigDecimal nightsAfterDeadline) {
    
    this.nightsAfterDeadline = nightsAfterDeadline;
    return this;
  }

   /**
   * Get nightsAfterDeadline
   * @return nightsAfterDeadline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public BigDecimal getNightsAfterDeadline() {
    return nightsAfterDeadline;
  }


  public void setNightsAfterDeadline(BigDecimal nightsAfterDeadline) {
    this.nightsAfterDeadline = nightsAfterDeadline;
  }


  public V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner noShowPolicy(String noShowPolicy) {
    
    this.noShowPolicy = noShowPolicy;
    return this;
  }

   /**
   * Get noShowPolicy
   * @return noShowPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "default", value = "")

  public String getNoShowPolicy() {
    return noShowPolicy;
  }


  public void setNoShowPolicy(String noShowPolicy) {
    this.noShowPolicy = noShowPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner v1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner = (V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner) o;
    return Objects.equals(this.code, v1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.code) &&
        Objects.equals(this.percentAfterReservation, v1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.percentAfterReservation) &&
        Objects.equals(this.nightsAfterReservation, v1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.nightsAfterReservation) &&
        Objects.equals(this.deadlineDays, v1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.deadlineDays) &&
        Objects.equals(this.deadlineHours, v1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.deadlineHours) &&
        Objects.equals(this.percentAfterDeadline, v1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.percentAfterDeadline) &&
        Objects.equals(this.nightsAfterDeadline, v1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.nightsAfterDeadline) &&
        Objects.equals(this.noShowPolicy, v1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.noShowPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, percentAfterReservation, nightsAfterReservation, deadlineDays, deadlineHours, percentAfterDeadline, nightsAfterDeadline, noShowPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    percentAfterReservation: ").append(toIndentedString(percentAfterReservation)).append("\n");
    sb.append("    nightsAfterReservation: ").append(toIndentedString(nightsAfterReservation)).append("\n");
    sb.append("    deadlineDays: ").append(toIndentedString(deadlineDays)).append("\n");
    sb.append("    deadlineHours: ").append(toIndentedString(deadlineHours)).append("\n");
    sb.append("    percentAfterDeadline: ").append(toIndentedString(percentAfterDeadline)).append("\n");
    sb.append("    nightsAfterDeadline: ").append(toIndentedString(nightsAfterDeadline)).append("\n");
    sb.append("    noShowPolicy: ").append(toIndentedString(noShowPolicy)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("code");
    openapiFields.add("percentAfterReservation");
    openapiFields.add("nightsAfterReservation");
    openapiFields.add("deadlineDays");
    openapiFields.add("deadlineHours");
    openapiFields.add("percentAfterDeadline");
    openapiFields.add("nightsAfterDeadline");
    openapiFields.add("noShowPolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner is not found in the empty JSON string", V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("noShowPolicy") != null && !jsonObj.get("noShowPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `noShowPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("noShowPolicy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner
  */
  public static V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponseProductListInnerPolicyInfoCancellationPolicyListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


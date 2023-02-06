/*
 * lodgea-java
 * LODGEA SDK for java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.1.0
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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.lodgea.JSON;

/**
 * Defines the guarantee amount that has to be paid to the property.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy {
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

  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy() {
  }

  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy percentAfterReservation(BigDecimal percentAfterReservation) {
    
    this.percentAfterReservation = percentAfterReservation;
    return this;
  }

   /**
   * Percentage of refund after reservation.
   * @return percentAfterReservation
  **/
  @javax.annotation.Nonnull

  public BigDecimal getPercentAfterReservation() {
    return percentAfterReservation;
  }


  public void setPercentAfterReservation(BigDecimal percentAfterReservation) {
    this.percentAfterReservation = percentAfterReservation;
  }


  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy nightsAfterReservation(BigDecimal nightsAfterReservation) {
    
    this.nightsAfterReservation = nightsAfterReservation;
    return this;
  }

   /**
   * Number of nights after reservation.
   * @return nightsAfterReservation
  **/
  @javax.annotation.Nonnull

  public BigDecimal getNightsAfterReservation() {
    return nightsAfterReservation;
  }


  public void setNightsAfterReservation(BigDecimal nightsAfterReservation) {
    this.nightsAfterReservation = nightsAfterReservation;
  }


  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy deadlineDays(BigDecimal deadlineDays) {
    
    this.deadlineDays = deadlineDays;
    return this;
  }

   /**
   * Deadline in days.
   * @return deadlineDays
  **/
  @javax.annotation.Nonnull

  public BigDecimal getDeadlineDays() {
    return deadlineDays;
  }


  public void setDeadlineDays(BigDecimal deadlineDays) {
    this.deadlineDays = deadlineDays;
  }


  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy deadlineHours(BigDecimal deadlineHours) {
    
    this.deadlineHours = deadlineHours;
    return this;
  }

   /**
   * Deadline in hours.
   * @return deadlineHours
  **/
  @javax.annotation.Nonnull

  public BigDecimal getDeadlineHours() {
    return deadlineHours;
  }


  public void setDeadlineHours(BigDecimal deadlineHours) {
    this.deadlineHours = deadlineHours;
  }


  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy percentAfterDeadline(BigDecimal percentAfterDeadline) {
    
    this.percentAfterDeadline = percentAfterDeadline;
    return this;
  }

   /**
   * Percentage of refund after deadline.
   * @return percentAfterDeadline
  **/
  @javax.annotation.Nonnull

  public BigDecimal getPercentAfterDeadline() {
    return percentAfterDeadline;
  }


  public void setPercentAfterDeadline(BigDecimal percentAfterDeadline) {
    this.percentAfterDeadline = percentAfterDeadline;
  }


  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy nightsAfterDeadline(BigDecimal nightsAfterDeadline) {
    
    this.nightsAfterDeadline = nightsAfterDeadline;
    return this;
  }

   /**
   * Number of nights after deadline.
   * @return nightsAfterDeadline
  **/
  @javax.annotation.Nonnull

  public BigDecimal getNightsAfterDeadline() {
    return nightsAfterDeadline;
  }


  public void setNightsAfterDeadline(BigDecimal nightsAfterDeadline) {
    this.nightsAfterDeadline = nightsAfterDeadline;
  }


  public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy noShowPolicy(String noShowPolicy) {
    
    this.noShowPolicy = noShowPolicy;
    return this;
  }

   /**
   * No-show policy
   * @return noShowPolicy
  **/
  @javax.annotation.Nonnull

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
    PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy propertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy = (PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy) o;
    return Objects.equals(this.percentAfterReservation, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.percentAfterReservation) &&
        Objects.equals(this.nightsAfterReservation, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.nightsAfterReservation) &&
        Objects.equals(this.deadlineDays, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.deadlineDays) &&
        Objects.equals(this.deadlineHours, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.deadlineHours) &&
        Objects.equals(this.percentAfterDeadline, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.percentAfterDeadline) &&
        Objects.equals(this.nightsAfterDeadline, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.nightsAfterDeadline) &&
        Objects.equals(this.noShowPolicy, propertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.noShowPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentAfterReservation, nightsAfterReservation, deadlineDays, deadlineHours, percentAfterDeadline, nightsAfterDeadline, noShowPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy {\n");
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
    openapiFields.add("percentAfterReservation");
    openapiFields.add("nightsAfterReservation");
    openapiFields.add("deadlineDays");
    openapiFields.add("deadlineHours");
    openapiFields.add("percentAfterDeadline");
    openapiFields.add("nightsAfterDeadline");
    openapiFields.add("noShowPolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("percentAfterReservation");
    openapiRequiredFields.add("nightsAfterReservation");
    openapiRequiredFields.add("deadlineDays");
    openapiRequiredFields.add("deadlineHours");
    openapiRequiredFields.add("percentAfterDeadline");
    openapiRequiredFields.add("nightsAfterDeadline");
    openapiRequiredFields.add("noShowPolicy");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy is not found in the empty JSON string", PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("noShowPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `noShowPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("noShowPolicy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy>() {
           @Override
           public void write(JsonWriter out, PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy
  * @throws IOException if the JSON string is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy
  */
  public static PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy.class);
  }

 /**
  * Convert an instance of PropertiesPropertyIdGet200ResponsePropertyPolicyListInnerGuaranteePolicy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

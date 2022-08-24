/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://lodgea.redoc.ly for more information.
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
 * V1PropertyGetPost200ResponsePropertyCancellationGracePeriod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-24T11:37:52.194432653Z[Etc/UTC]")
public class V1PropertyGetPost200ResponsePropertyCancellationGracePeriod {
  public static final String SERIALIZED_NAME_HOURS_AFTER_BOOKING = "hoursAfterBooking";
  @SerializedName(SERIALIZED_NAME_HOURS_AFTER_BOOKING)
  private BigDecimal hoursAfterBooking;

  public static final String SERIALIZED_NAME_WEEKS_BEFORE_CHECK_IN = "weeksBeforeCheckIn";
  @SerializedName(SERIALIZED_NAME_WEEKS_BEFORE_CHECK_IN)
  private BigDecimal weeksBeforeCheckIn;

  public V1PropertyGetPost200ResponsePropertyCancellationGracePeriod() { 
  }

  public V1PropertyGetPost200ResponsePropertyCancellationGracePeriod hoursAfterBooking(BigDecimal hoursAfterBooking) {
    
    this.hoursAfterBooking = hoursAfterBooking;
    return this;
  }

   /**
   * Get hoursAfterBooking
   * @return hoursAfterBooking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24", value = "")

  public BigDecimal getHoursAfterBooking() {
    return hoursAfterBooking;
  }


  public void setHoursAfterBooking(BigDecimal hoursAfterBooking) {
    this.hoursAfterBooking = hoursAfterBooking;
  }


  public V1PropertyGetPost200ResponsePropertyCancellationGracePeriod weeksBeforeCheckIn(BigDecimal weeksBeforeCheckIn) {
    
    this.weeksBeforeCheckIn = weeksBeforeCheckIn;
    return this;
  }

   /**
   * Get weeksBeforeCheckIn
   * @return weeksBeforeCheckIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public BigDecimal getWeeksBeforeCheckIn() {
    return weeksBeforeCheckIn;
  }


  public void setWeeksBeforeCheckIn(BigDecimal weeksBeforeCheckIn) {
    this.weeksBeforeCheckIn = weeksBeforeCheckIn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponsePropertyCancellationGracePeriod v1PropertyGetPost200ResponsePropertyCancellationGracePeriod = (V1PropertyGetPost200ResponsePropertyCancellationGracePeriod) o;
    return Objects.equals(this.hoursAfterBooking, v1PropertyGetPost200ResponsePropertyCancellationGracePeriod.hoursAfterBooking) &&
        Objects.equals(this.weeksBeforeCheckIn, v1PropertyGetPost200ResponsePropertyCancellationGracePeriod.weeksBeforeCheckIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hoursAfterBooking, weeksBeforeCheckIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponsePropertyCancellationGracePeriod {\n");
    sb.append("    hoursAfterBooking: ").append(toIndentedString(hoursAfterBooking)).append("\n");
    sb.append("    weeksBeforeCheckIn: ").append(toIndentedString(weeksBeforeCheckIn)).append("\n");
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
    openapiFields.add("hoursAfterBooking");
    openapiFields.add("weeksBeforeCheckIn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponsePropertyCancellationGracePeriod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponsePropertyCancellationGracePeriod.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponsePropertyCancellationGracePeriod is not found in the empty JSON string", V1PropertyGetPost200ResponsePropertyCancellationGracePeriod.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponsePropertyCancellationGracePeriod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponsePropertyCancellationGracePeriod` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponsePropertyCancellationGracePeriod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponsePropertyCancellationGracePeriod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponsePropertyCancellationGracePeriod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponsePropertyCancellationGracePeriod.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponsePropertyCancellationGracePeriod>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponsePropertyCancellationGracePeriod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponsePropertyCancellationGracePeriod read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponsePropertyCancellationGracePeriod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponsePropertyCancellationGracePeriod
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponsePropertyCancellationGracePeriod
  */
  public static V1PropertyGetPost200ResponsePropertyCancellationGracePeriod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponsePropertyCancellationGracePeriod.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponsePropertyCancellationGracePeriod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


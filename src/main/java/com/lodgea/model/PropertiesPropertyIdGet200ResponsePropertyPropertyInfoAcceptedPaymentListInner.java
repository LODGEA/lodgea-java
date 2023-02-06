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
 * PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner {
  /**
   * The code of the payment option.
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    AMEX("amex"),
    
    VISA("visa"),
    
    MASTERCARD("mastercard"),
    
    DINERS("diners"),
    
    JCB("jcb"),
    
    MAESTRO("maestro"),
    
    DISCOVER("discover"),
    
    BANCONTACT("bancontact"),
    
    CASHONLY("cashonly"),
    
    BANKCARD("bankcard"),
    
    CARTASI("cartasi"),
    
    ARGENCARD("argencard"),
    
    CABAL("cabal"),
    
    REDCOMPRA("redcompra"),
    
    OTHER("other"),
    
    GREATWALL("greatwall"),
    
    DRAGONPAY("dragonpay"),
    
    EFTPOS("eftpos"),
    
    HIPERCARD("hipercard"),
    
    UNIONPAYDEBIT("unionpaydebit"),
    
    ECCARD("eccard"),
    
    BCCARD("bccard"),
    
    MASTERCARDVIRTUAL("mastercardvirtual"),
    
    MASTERCARDGOOGLE("mastercardgoogle"),
    
    UNIONPAYCREDIT("unionpaycredit");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  /**
   * The type of the payment option.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CREDITCARD("creditcard"),
    
    DEBITCARD("debitcard"),
    
    PAYMENTSERVICE("paymentservice"),
    
    CASH("cash");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner() {
  }

  public PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code of the payment option.
   * @return code
  **/
  @javax.annotation.Nonnull

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the payment option.
   * @return type
  **/
  @javax.annotation.Nonnull

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner propertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner = (PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner) o;
    return Objects.equals(this.code, propertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner.code) &&
        Objects.equals(this.type, propertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner is not found in the empty JSON string", PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner>() {
           @Override
           public void write(JsonWriter out, PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner
  * @throws IOException if the JSON string is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner
  */
  public static PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner.class);
  }

 /**
  * Convert an instance of PropertiesPropertyIdGet200ResponsePropertyPropertyInfoAcceptedPaymentListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

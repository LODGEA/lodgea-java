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
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyGeoDa;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyGeoDe;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyGeoEn;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyGeoNl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.lodgea.JSON;

/**
 * V1PropertyGetPost200ResponsePropertyGeo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-05T14:33:56.924929748Z[Etc/UTC]")
public class V1PropertyGetPost200ResponsePropertyGeo {
  public static final String SERIALIZED_NAME_DE = "de";
  @SerializedName(SERIALIZED_NAME_DE)
  private V1PropertyGetPost200ResponsePropertyGeoDe de;

  public static final String SERIALIZED_NAME_EN = "en";
  @SerializedName(SERIALIZED_NAME_EN)
  private V1PropertyGetPost200ResponsePropertyGeoEn en;

  public static final String SERIALIZED_NAME_DA = "da";
  @SerializedName(SERIALIZED_NAME_DA)
  private V1PropertyGetPost200ResponsePropertyGeoDa da;

  public static final String SERIALIZED_NAME_NL = "nl";
  @SerializedName(SERIALIZED_NAME_NL)
  private V1PropertyGetPost200ResponsePropertyGeoNl nl;

  public V1PropertyGetPost200ResponsePropertyGeo() { 
  }

  public V1PropertyGetPost200ResponsePropertyGeo de(V1PropertyGetPost200ResponsePropertyGeoDe de) {
    
    this.de = de;
    return this;
  }

   /**
   * Get de
   * @return de
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyGeoDe getDe() {
    return de;
  }


  public void setDe(V1PropertyGetPost200ResponsePropertyGeoDe de) {
    this.de = de;
  }


  public V1PropertyGetPost200ResponsePropertyGeo en(V1PropertyGetPost200ResponsePropertyGeoEn en) {
    
    this.en = en;
    return this;
  }

   /**
   * Get en
   * @return en
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyGeoEn getEn() {
    return en;
  }


  public void setEn(V1PropertyGetPost200ResponsePropertyGeoEn en) {
    this.en = en;
  }


  public V1PropertyGetPost200ResponsePropertyGeo da(V1PropertyGetPost200ResponsePropertyGeoDa da) {
    
    this.da = da;
    return this;
  }

   /**
   * Get da
   * @return da
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyGeoDa getDa() {
    return da;
  }


  public void setDa(V1PropertyGetPost200ResponsePropertyGeoDa da) {
    this.da = da;
  }


  public V1PropertyGetPost200ResponsePropertyGeo nl(V1PropertyGetPost200ResponsePropertyGeoNl nl) {
    
    this.nl = nl;
    return this;
  }

   /**
   * Get nl
   * @return nl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyGeoNl getNl() {
    return nl;
  }


  public void setNl(V1PropertyGetPost200ResponsePropertyGeoNl nl) {
    this.nl = nl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PropertyGetPost200ResponsePropertyGeo v1PropertyGetPost200ResponsePropertyGeo = (V1PropertyGetPost200ResponsePropertyGeo) o;
    return Objects.equals(this.de, v1PropertyGetPost200ResponsePropertyGeo.de) &&
        Objects.equals(this.en, v1PropertyGetPost200ResponsePropertyGeo.en) &&
        Objects.equals(this.da, v1PropertyGetPost200ResponsePropertyGeo.da) &&
        Objects.equals(this.nl, v1PropertyGetPost200ResponsePropertyGeo.nl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(de, en, da, nl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponsePropertyGeo {\n");
    sb.append("    de: ").append(toIndentedString(de)).append("\n");
    sb.append("    en: ").append(toIndentedString(en)).append("\n");
    sb.append("    da: ").append(toIndentedString(da)).append("\n");
    sb.append("    nl: ").append(toIndentedString(nl)).append("\n");
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
    openapiFields.add("de");
    openapiFields.add("en");
    openapiFields.add("da");
    openapiFields.add("nl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponsePropertyGeo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponsePropertyGeo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponsePropertyGeo is not found in the empty JSON string", V1PropertyGetPost200ResponsePropertyGeo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponsePropertyGeo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponsePropertyGeo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `de`
      if (jsonObj.getAsJsonObject("de") != null) {
        V1PropertyGetPost200ResponsePropertyGeoDe.validateJsonObject(jsonObj.getAsJsonObject("de"));
      }
      // validate the optional field `en`
      if (jsonObj.getAsJsonObject("en") != null) {
        V1PropertyGetPost200ResponsePropertyGeoEn.validateJsonObject(jsonObj.getAsJsonObject("en"));
      }
      // validate the optional field `da`
      if (jsonObj.getAsJsonObject("da") != null) {
        V1PropertyGetPost200ResponsePropertyGeoDa.validateJsonObject(jsonObj.getAsJsonObject("da"));
      }
      // validate the optional field `nl`
      if (jsonObj.getAsJsonObject("nl") != null) {
        V1PropertyGetPost200ResponsePropertyGeoNl.validateJsonObject(jsonObj.getAsJsonObject("nl"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponsePropertyGeo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponsePropertyGeo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponsePropertyGeo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponsePropertyGeo.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponsePropertyGeo>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponsePropertyGeo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponsePropertyGeo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponsePropertyGeo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponsePropertyGeo
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponsePropertyGeo
  */
  public static V1PropertyGetPost200ResponsePropertyGeo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponsePropertyGeo.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponsePropertyGeo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


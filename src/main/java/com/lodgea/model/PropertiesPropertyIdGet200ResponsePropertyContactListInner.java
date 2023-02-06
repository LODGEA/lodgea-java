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
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * PropertiesPropertyIdGet200ResponsePropertyContactListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class PropertiesPropertyIdGet200ResponsePropertyContactListInner {
  /**
   * The type of profile this contact belongs to.
   */
  @JsonAdapter(ProfileTypeEnum.Adapter.class)
  public enum ProfileTypeEnum {
    GENERAL("general"),
    
    CONTRACT("contract"),
    
    RESERVATIONS("reservations"),
    
    INVOICES("invoices"),
    
    AVAILABILITY("availability"),
    
    SITE_CONTENT("site_content"),
    
    PARITY("parity"),
    
    REQUESTS("requests"),
    
    CENTRAL_RESERVATIONS("central_reservations"),
    
    PHYSICALLOCATION("physicallocation");

    private String value;

    ProfileTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProfileTypeEnum fromValue(String value) {
      for (ProfileTypeEnum b : ProfileTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProfileTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProfileTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProfileTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProfileTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROFILE_TYPE = "profileType";
  @SerializedName(SERIALIZED_NAME_PROFILE_TYPE)
  private ProfileTypeEnum profileType;

  public static final String SERIALIZED_NAME_ADDRESS_LIST = "addressList";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LIST)
  private List<PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner> addressList = new ArrayList<>();

  public PropertiesPropertyIdGet200ResponsePropertyContactListInner() {
  }

  public PropertiesPropertyIdGet200ResponsePropertyContactListInner profileType(ProfileTypeEnum profileType) {
    
    this.profileType = profileType;
    return this;
  }

   /**
   * The type of profile this contact belongs to.
   * @return profileType
  **/
  @javax.annotation.Nonnull

  public ProfileTypeEnum getProfileType() {
    return profileType;
  }


  public void setProfileType(ProfileTypeEnum profileType) {
    this.profileType = profileType;
  }


  public PropertiesPropertyIdGet200ResponsePropertyContactListInner addressList(List<PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner> addressList) {
    
    this.addressList = addressList;
    return this;
  }

  public PropertiesPropertyIdGet200ResponsePropertyContactListInner addAddressListItem(PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner addressListItem) {
    this.addressList.add(addressListItem);
    return this;
  }

   /**
   * A list of addresses for this contact
   * @return addressList
  **/
  @javax.annotation.Nonnull

  public List<PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner> getAddressList() {
    return addressList;
  }


  public void setAddressList(List<PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner> addressList) {
    this.addressList = addressList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertiesPropertyIdGet200ResponsePropertyContactListInner propertiesPropertyIdGet200ResponsePropertyContactListInner = (PropertiesPropertyIdGet200ResponsePropertyContactListInner) o;
    return Objects.equals(this.profileType, propertiesPropertyIdGet200ResponsePropertyContactListInner.profileType) &&
        Objects.equals(this.addressList, propertiesPropertyIdGet200ResponsePropertyContactListInner.addressList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileType, addressList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesPropertyIdGet200ResponsePropertyContactListInner {\n");
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
    sb.append("    addressList: ").append(toIndentedString(addressList)).append("\n");
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
    openapiFields.add("profileType");
    openapiFields.add("addressList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("profileType");
    openapiRequiredFields.add("addressList");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyContactListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PropertiesPropertyIdGet200ResponsePropertyContactListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertiesPropertyIdGet200ResponsePropertyContactListInner is not found in the empty JSON string", PropertiesPropertyIdGet200ResponsePropertyContactListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PropertiesPropertyIdGet200ResponsePropertyContactListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertiesPropertyIdGet200ResponsePropertyContactListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertiesPropertyIdGet200ResponsePropertyContactListInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("profileType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileType").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("addressList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressList` to be an array in the JSON string but got `%s`", jsonObj.get("addressList").toString()));
      }

      JsonArray jsonArrayaddressList = jsonObj.getAsJsonArray("addressList");
      // validate the required field `addressList` (array)
      for (int i = 0; i < jsonArrayaddressList.size(); i++) {
        PropertiesPropertyIdGet200ResponsePropertyContactListInnerAddressListInner.validateJsonObject(jsonArrayaddressList.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesPropertyIdGet200ResponsePropertyContactListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesPropertyIdGet200ResponsePropertyContactListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyContactListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesPropertyIdGet200ResponsePropertyContactListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyContactListInner>() {
           @Override
           public void write(JsonWriter out, PropertiesPropertyIdGet200ResponsePropertyContactListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesPropertyIdGet200ResponsePropertyContactListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesPropertyIdGet200ResponsePropertyContactListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesPropertyIdGet200ResponsePropertyContactListInner
  * @throws IOException if the JSON string is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyContactListInner
  */
  public static PropertiesPropertyIdGet200ResponsePropertyContactListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesPropertyIdGet200ResponsePropertyContactListInner.class);
  }

 /**
  * Convert an instance of PropertiesPropertyIdGet200ResponsePropertyContactListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

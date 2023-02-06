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
import com.lodgea.model.AvailablePropertiesInner1Geo;
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyAwardListInner;
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyCancellationGracePeriod;
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyContactListInner;
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyFacilityInfo;
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner;
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyGuestInfo;
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyPolicyListInner;
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyPropertyInfo;
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyRecordCreated;
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyRecordModified;
import com.lodgea.model.PropertiesPropertyIdGet200ResponsePropertyServiceListInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * An object containing all available base data for the requested property.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class PropertiesPropertyIdGet200ResponseProperty {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RECORD_CREATED = "recordCreated";
  @SerializedName(SERIALIZED_NAME_RECORD_CREATED)
  private PropertiesPropertyIdGet200ResponsePropertyRecordCreated recordCreated;

  public static final String SERIALIZED_NAME_RECORD_MODIFIED = "recordModified";
  @SerializedName(SERIALIZED_NAME_RECORD_MODIFIED)
  private PropertiesPropertyIdGet200ResponsePropertyRecordModified recordModified;

  public static final String SERIALIZED_NAME_PROPERTY_INFO = "propertyInfo";
  @SerializedName(SERIALIZED_NAME_PROPERTY_INFO)
  private PropertiesPropertyIdGet200ResponsePropertyPropertyInfo propertyInfo;

  public static final String SERIALIZED_NAME_GUEST_INFO = "guestInfo";
  @SerializedName(SERIALIZED_NAME_GUEST_INFO)
  private PropertiesPropertyIdGet200ResponsePropertyGuestInfo guestInfo;

  public static final String SERIALIZED_NAME_AWARD_LIST = "awardList";
  @SerializedName(SERIALIZED_NAME_AWARD_LIST)
  private List<PropertiesPropertyIdGet200ResponsePropertyAwardListInner> awardList = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTACT_LIST = "contactList";
  @SerializedName(SERIALIZED_NAME_CONTACT_LIST)
  private List<PropertiesPropertyIdGet200ResponsePropertyContactListInner> contactList = new ArrayList<>();

  public static final String SERIALIZED_NAME_FACILITY_INFO = "facilityInfo";
  @SerializedName(SERIALIZED_NAME_FACILITY_INFO)
  private PropertiesPropertyIdGet200ResponsePropertyFacilityInfo facilityInfo;

  public static final String SERIALIZED_NAME_MEDIA_LIST = "mediaList";
  @SerializedName(SERIALIZED_NAME_MEDIA_LIST)
  private List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner> mediaList = new ArrayList<>();

  public static final String SERIALIZED_NAME_GEO = "geo";
  @SerializedName(SERIALIZED_NAME_GEO)
  private Map<String, AvailablePropertiesInner1Geo> geo = null;

  public static final String SERIALIZED_NAME_PUBLISHED = "published";
  @SerializedName(SERIALIZED_NAME_PUBLISHED)
  private Boolean published;

  public static final String SERIALIZED_NAME_POLICY_LIST = "policyList";
  @SerializedName(SERIALIZED_NAME_POLICY_LIST)
  private List<PropertiesPropertyIdGet200ResponsePropertyPolicyListInner> policyList = new ArrayList<>();

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_CANCELLATION_GRACE_PERIOD = "cancellationGracePeriod";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_GRACE_PERIOD)
  private PropertiesPropertyIdGet200ResponsePropertyCancellationGracePeriod cancellationGracePeriod;

  public static final String SERIALIZED_NAME_SERVICE_LIST = "serviceList";
  @SerializedName(SERIALIZED_NAME_SERVICE_LIST)
  private List<PropertiesPropertyIdGet200ResponsePropertyServiceListInner> serviceList = new ArrayList<>();

  public PropertiesPropertyIdGet200ResponseProperty() {
  }

  public PropertiesPropertyIdGet200ResponseProperty code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The properties unique identifier.
   * @return code
  **/
  @javax.annotation.Nonnull

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public PropertiesPropertyIdGet200ResponseProperty name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The properties name.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PropertiesPropertyIdGet200ResponseProperty recordCreated(PropertiesPropertyIdGet200ResponsePropertyRecordCreated recordCreated) {
    
    this.recordCreated = recordCreated;
    return this;
  }

   /**
   * Get recordCreated
   * @return recordCreated
  **/
  @javax.annotation.Nonnull

  public PropertiesPropertyIdGet200ResponsePropertyRecordCreated getRecordCreated() {
    return recordCreated;
  }


  public void setRecordCreated(PropertiesPropertyIdGet200ResponsePropertyRecordCreated recordCreated) {
    this.recordCreated = recordCreated;
  }


  public PropertiesPropertyIdGet200ResponseProperty recordModified(PropertiesPropertyIdGet200ResponsePropertyRecordModified recordModified) {
    
    this.recordModified = recordModified;
    return this;
  }

   /**
   * Get recordModified
   * @return recordModified
  **/
  @javax.annotation.Nonnull

  public PropertiesPropertyIdGet200ResponsePropertyRecordModified getRecordModified() {
    return recordModified;
  }


  public void setRecordModified(PropertiesPropertyIdGet200ResponsePropertyRecordModified recordModified) {
    this.recordModified = recordModified;
  }


  public PropertiesPropertyIdGet200ResponseProperty propertyInfo(PropertiesPropertyIdGet200ResponsePropertyPropertyInfo propertyInfo) {
    
    this.propertyInfo = propertyInfo;
    return this;
  }

   /**
   * Get propertyInfo
   * @return propertyInfo
  **/
  @javax.annotation.Nonnull

  public PropertiesPropertyIdGet200ResponsePropertyPropertyInfo getPropertyInfo() {
    return propertyInfo;
  }


  public void setPropertyInfo(PropertiesPropertyIdGet200ResponsePropertyPropertyInfo propertyInfo) {
    this.propertyInfo = propertyInfo;
  }


  public PropertiesPropertyIdGet200ResponseProperty guestInfo(PropertiesPropertyIdGet200ResponsePropertyGuestInfo guestInfo) {
    
    this.guestInfo = guestInfo;
    return this;
  }

   /**
   * Get guestInfo
   * @return guestInfo
  **/
  @javax.annotation.Nullable

  public PropertiesPropertyIdGet200ResponsePropertyGuestInfo getGuestInfo() {
    return guestInfo;
  }


  public void setGuestInfo(PropertiesPropertyIdGet200ResponsePropertyGuestInfo guestInfo) {
    this.guestInfo = guestInfo;
  }


  public PropertiesPropertyIdGet200ResponseProperty awardList(List<PropertiesPropertyIdGet200ResponsePropertyAwardListInner> awardList) {
    
    this.awardList = awardList;
    return this;
  }

  public PropertiesPropertyIdGet200ResponseProperty addAwardListItem(PropertiesPropertyIdGet200ResponsePropertyAwardListInner awardListItem) {
    this.awardList.add(awardListItem);
    return this;
  }

   /**
   * A list of the ratings available for this property.
   * @return awardList
  **/
  @javax.annotation.Nonnull

  public List<PropertiesPropertyIdGet200ResponsePropertyAwardListInner> getAwardList() {
    return awardList;
  }


  public void setAwardList(List<PropertiesPropertyIdGet200ResponsePropertyAwardListInner> awardList) {
    this.awardList = awardList;
  }


  public PropertiesPropertyIdGet200ResponseProperty contactList(List<PropertiesPropertyIdGet200ResponsePropertyContactListInner> contactList) {
    
    this.contactList = contactList;
    return this;
  }

  public PropertiesPropertyIdGet200ResponseProperty addContactListItem(PropertiesPropertyIdGet200ResponsePropertyContactListInner contactListItem) {
    this.contactList.add(contactListItem);
    return this;
  }

   /**
   * A contact with a profile type and a list of addresses
   * @return contactList
  **/
  @javax.annotation.Nonnull

  public List<PropertiesPropertyIdGet200ResponsePropertyContactListInner> getContactList() {
    return contactList;
  }


  public void setContactList(List<PropertiesPropertyIdGet200ResponsePropertyContactListInner> contactList) {
    this.contactList = contactList;
  }


  public PropertiesPropertyIdGet200ResponseProperty facilityInfo(PropertiesPropertyIdGet200ResponsePropertyFacilityInfo facilityInfo) {
    
    this.facilityInfo = facilityInfo;
    return this;
  }

   /**
   * Get facilityInfo
   * @return facilityInfo
  **/
  @javax.annotation.Nullable

  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfo getFacilityInfo() {
    return facilityInfo;
  }


  public void setFacilityInfo(PropertiesPropertyIdGet200ResponsePropertyFacilityInfo facilityInfo) {
    this.facilityInfo = facilityInfo;
  }


  public PropertiesPropertyIdGet200ResponseProperty mediaList(List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner> mediaList) {
    
    this.mediaList = mediaList;
    return this;
  }

  public PropertiesPropertyIdGet200ResponseProperty addMediaListItem(PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner mediaListItem) {
    this.mediaList.add(mediaListItem);
    return this;
  }

   /**
   * A list of media objects for the property.
   * @return mediaList
  **/
  @javax.annotation.Nonnull

  public List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner> getMediaList() {
    return mediaList;
  }


  public void setMediaList(List<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner> mediaList) {
    this.mediaList = mediaList;
  }


  public PropertiesPropertyIdGet200ResponseProperty geo(Map<String, AvailablePropertiesInner1Geo> geo) {
    
    this.geo = geo;
    return this;
  }

  public PropertiesPropertyIdGet200ResponseProperty putGeoItem(String key, AvailablePropertiesInner1Geo geoItem) {
    if (this.geo == null) {
      this.geo = new HashMap<>();
    }
    this.geo.put(key, geoItem);
    return this;
  }

   /**
   * An object containing language codes as keys and objects describing the properties geographical location as values.
   * @return geo
  **/
  @javax.annotation.Nullable

  public Map<String, AvailablePropertiesInner1Geo> getGeo() {
    return geo;
  }


  public void setGeo(Map<String, AvailablePropertiesInner1Geo> geo) {
    this.geo = geo;
  }


  public PropertiesPropertyIdGet200ResponseProperty published(Boolean published) {
    
    this.published = published;
    return this;
  }

   /**
   * Indicates whether the policy has been published or not.
   * @return published
  **/
  @javax.annotation.Nonnull

  public Boolean getPublished() {
    return published;
  }


  public void setPublished(Boolean published) {
    this.published = published;
  }


  public PropertiesPropertyIdGet200ResponseProperty policyList(List<PropertiesPropertyIdGet200ResponsePropertyPolicyListInner> policyList) {
    
    this.policyList = policyList;
    return this;
  }

  public PropertiesPropertyIdGet200ResponseProperty addPolicyListItem(PropertiesPropertyIdGet200ResponsePropertyPolicyListInner policyListItem) {
    this.policyList.add(policyListItem);
    return this;
  }

   /**
   * A list of policies associated with the property.
   * @return policyList
  **/
  @javax.annotation.Nonnull

  public List<PropertiesPropertyIdGet200ResponsePropertyPolicyListInner> getPolicyList() {
    return policyList;
  }


  public void setPolicyList(List<PropertiesPropertyIdGet200ResponsePropertyPolicyListInner> policyList) {
    this.policyList = policyList;
  }


  public PropertiesPropertyIdGet200ResponseProperty uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * A unique identifier for the accommodation.
   * @return uri
  **/
  @javax.annotation.Nullable

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public PropertiesPropertyIdGet200ResponseProperty cancellationGracePeriod(PropertiesPropertyIdGet200ResponsePropertyCancellationGracePeriod cancellationGracePeriod) {
    
    this.cancellationGracePeriod = cancellationGracePeriod;
    return this;
  }

   /**
   * Get cancellationGracePeriod
   * @return cancellationGracePeriod
  **/
  @javax.annotation.Nullable

  public PropertiesPropertyIdGet200ResponsePropertyCancellationGracePeriod getCancellationGracePeriod() {
    return cancellationGracePeriod;
  }


  public void setCancellationGracePeriod(PropertiesPropertyIdGet200ResponsePropertyCancellationGracePeriod cancellationGracePeriod) {
    this.cancellationGracePeriod = cancellationGracePeriod;
  }


  public PropertiesPropertyIdGet200ResponseProperty serviceList(List<PropertiesPropertyIdGet200ResponsePropertyServiceListInner> serviceList) {
    
    this.serviceList = serviceList;
    return this;
  }

  public PropertiesPropertyIdGet200ResponseProperty addServiceListItem(PropertiesPropertyIdGet200ResponsePropertyServiceListInner serviceListItem) {
    this.serviceList.add(serviceListItem);
    return this;
  }

   /**
   * A list of objects each describing an available service, its pricing and its availability.
   * @return serviceList
  **/
  @javax.annotation.Nonnull

  public List<PropertiesPropertyIdGet200ResponsePropertyServiceListInner> getServiceList() {
    return serviceList;
  }


  public void setServiceList(List<PropertiesPropertyIdGet200ResponsePropertyServiceListInner> serviceList) {
    this.serviceList = serviceList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertiesPropertyIdGet200ResponseProperty propertiesPropertyIdGet200ResponseProperty = (PropertiesPropertyIdGet200ResponseProperty) o;
    return Objects.equals(this.code, propertiesPropertyIdGet200ResponseProperty.code) &&
        Objects.equals(this.name, propertiesPropertyIdGet200ResponseProperty.name) &&
        Objects.equals(this.recordCreated, propertiesPropertyIdGet200ResponseProperty.recordCreated) &&
        Objects.equals(this.recordModified, propertiesPropertyIdGet200ResponseProperty.recordModified) &&
        Objects.equals(this.propertyInfo, propertiesPropertyIdGet200ResponseProperty.propertyInfo) &&
        Objects.equals(this.guestInfo, propertiesPropertyIdGet200ResponseProperty.guestInfo) &&
        Objects.equals(this.awardList, propertiesPropertyIdGet200ResponseProperty.awardList) &&
        Objects.equals(this.contactList, propertiesPropertyIdGet200ResponseProperty.contactList) &&
        Objects.equals(this.facilityInfo, propertiesPropertyIdGet200ResponseProperty.facilityInfo) &&
        Objects.equals(this.mediaList, propertiesPropertyIdGet200ResponseProperty.mediaList) &&
        Objects.equals(this.geo, propertiesPropertyIdGet200ResponseProperty.geo) &&
        Objects.equals(this.published, propertiesPropertyIdGet200ResponseProperty.published) &&
        Objects.equals(this.policyList, propertiesPropertyIdGet200ResponseProperty.policyList) &&
        Objects.equals(this.uri, propertiesPropertyIdGet200ResponseProperty.uri) &&
        Objects.equals(this.cancellationGracePeriod, propertiesPropertyIdGet200ResponseProperty.cancellationGracePeriod) &&
        Objects.equals(this.serviceList, propertiesPropertyIdGet200ResponseProperty.serviceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, recordCreated, recordModified, propertyInfo, guestInfo, awardList, contactList, facilityInfo, mediaList, geo, published, policyList, uri, cancellationGracePeriod, serviceList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesPropertyIdGet200ResponseProperty {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recordCreated: ").append(toIndentedString(recordCreated)).append("\n");
    sb.append("    recordModified: ").append(toIndentedString(recordModified)).append("\n");
    sb.append("    propertyInfo: ").append(toIndentedString(propertyInfo)).append("\n");
    sb.append("    guestInfo: ").append(toIndentedString(guestInfo)).append("\n");
    sb.append("    awardList: ").append(toIndentedString(awardList)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    facilityInfo: ").append(toIndentedString(facilityInfo)).append("\n");
    sb.append("    mediaList: ").append(toIndentedString(mediaList)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    policyList: ").append(toIndentedString(policyList)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    cancellationGracePeriod: ").append(toIndentedString(cancellationGracePeriod)).append("\n");
    sb.append("    serviceList: ").append(toIndentedString(serviceList)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("recordCreated");
    openapiFields.add("recordModified");
    openapiFields.add("propertyInfo");
    openapiFields.add("guestInfo");
    openapiFields.add("awardList");
    openapiFields.add("contactList");
    openapiFields.add("facilityInfo");
    openapiFields.add("mediaList");
    openapiFields.add("geo");
    openapiFields.add("published");
    openapiFields.add("policyList");
    openapiFields.add("uri");
    openapiFields.add("cancellationGracePeriod");
    openapiFields.add("serviceList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("recordCreated");
    openapiRequiredFields.add("recordModified");
    openapiRequiredFields.add("propertyInfo");
    openapiRequiredFields.add("awardList");
    openapiRequiredFields.add("contactList");
    openapiRequiredFields.add("mediaList");
    openapiRequiredFields.add("published");
    openapiRequiredFields.add("policyList");
    openapiRequiredFields.add("serviceList");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PropertiesPropertyIdGet200ResponseProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PropertiesPropertyIdGet200ResponseProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertiesPropertyIdGet200ResponseProperty is not found in the empty JSON string", PropertiesPropertyIdGet200ResponseProperty.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PropertiesPropertyIdGet200ResponseProperty.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertiesPropertyIdGet200ResponseProperty` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertiesPropertyIdGet200ResponseProperty.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `recordCreated`
      PropertiesPropertyIdGet200ResponsePropertyRecordCreated.validateJsonObject(jsonObj.getAsJsonObject("recordCreated"));
      // validate the required field `recordModified`
      PropertiesPropertyIdGet200ResponsePropertyRecordModified.validateJsonObject(jsonObj.getAsJsonObject("recordModified"));
      // validate the required field `propertyInfo`
      PropertiesPropertyIdGet200ResponsePropertyPropertyInfo.validateJsonObject(jsonObj.getAsJsonObject("propertyInfo"));
      // validate the optional field `guestInfo`
      if (jsonObj.get("guestInfo") != null && !jsonObj.get("guestInfo").isJsonNull()) {
        PropertiesPropertyIdGet200ResponsePropertyGuestInfo.validateJsonObject(jsonObj.getAsJsonObject("guestInfo"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("awardList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `awardList` to be an array in the JSON string but got `%s`", jsonObj.get("awardList").toString()));
      }

      JsonArray jsonArrayawardList = jsonObj.getAsJsonArray("awardList");
      // validate the required field `awardList` (array)
      for (int i = 0; i < jsonArrayawardList.size(); i++) {
        PropertiesPropertyIdGet200ResponsePropertyAwardListInner.validateJsonObject(jsonArrayawardList.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("contactList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contactList` to be an array in the JSON string but got `%s`", jsonObj.get("contactList").toString()));
      }

      JsonArray jsonArraycontactList = jsonObj.getAsJsonArray("contactList");
      // validate the required field `contactList` (array)
      for (int i = 0; i < jsonArraycontactList.size(); i++) {
        PropertiesPropertyIdGet200ResponsePropertyContactListInner.validateJsonObject(jsonArraycontactList.get(i).getAsJsonObject());
      };
      // validate the optional field `facilityInfo`
      if (jsonObj.get("facilityInfo") != null && !jsonObj.get("facilityInfo").isJsonNull()) {
        PropertiesPropertyIdGet200ResponsePropertyFacilityInfo.validateJsonObject(jsonObj.getAsJsonObject("facilityInfo"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("mediaList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaList` to be an array in the JSON string but got `%s`", jsonObj.get("mediaList").toString()));
      }

      JsonArray jsonArraymediaList = jsonObj.getAsJsonArray("mediaList");
      // validate the required field `mediaList` (array)
      for (int i = 0; i < jsonArraymediaList.size(); i++) {
        PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerMediaListInner.validateJsonObject(jsonArraymediaList.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("policyList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyList` to be an array in the JSON string but got `%s`", jsonObj.get("policyList").toString()));
      }

      JsonArray jsonArraypolicyList = jsonObj.getAsJsonArray("policyList");
      // validate the required field `policyList` (array)
      for (int i = 0; i < jsonArraypolicyList.size(); i++) {
        PropertiesPropertyIdGet200ResponsePropertyPolicyListInner.validateJsonObject(jsonArraypolicyList.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      // validate the optional field `cancellationGracePeriod`
      if (jsonObj.get("cancellationGracePeriod") != null && !jsonObj.get("cancellationGracePeriod").isJsonNull()) {
        PropertiesPropertyIdGet200ResponsePropertyCancellationGracePeriod.validateJsonObject(jsonObj.getAsJsonObject("cancellationGracePeriod"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("serviceList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceList` to be an array in the JSON string but got `%s`", jsonObj.get("serviceList").toString()));
      }

      JsonArray jsonArrayserviceList = jsonObj.getAsJsonArray("serviceList");
      // validate the required field `serviceList` (array)
      for (int i = 0; i < jsonArrayserviceList.size(); i++) {
        PropertiesPropertyIdGet200ResponsePropertyServiceListInner.validateJsonObject(jsonArrayserviceList.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesPropertyIdGet200ResponseProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesPropertyIdGet200ResponseProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesPropertyIdGet200ResponseProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesPropertyIdGet200ResponseProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesPropertyIdGet200ResponseProperty>() {
           @Override
           public void write(JsonWriter out, PropertiesPropertyIdGet200ResponseProperty value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesPropertyIdGet200ResponseProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesPropertyIdGet200ResponseProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesPropertyIdGet200ResponseProperty
  * @throws IOException if the JSON string is invalid with respect to PropertiesPropertyIdGet200ResponseProperty
  */
  public static PropertiesPropertyIdGet200ResponseProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesPropertyIdGet200ResponseProperty.class);
  }

 /**
  * Convert an instance of PropertiesPropertyIdGet200ResponseProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.0.2
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
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyAwardListInner;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyCancellationGracePeriod;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyContactListInner;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyFacilityInfo;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyGeo;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyGuestInfo;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyMediaListInner;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyPolicyListInner;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyPropertyInfo;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyRecordCreated;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyRecordModified;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyServiceListInner;
import com.lodgea.model.V1PropertyGetPost200ResponsePropertyTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.lodgea.JSON;

/**
 * V1PropertyGetPost200ResponseProperty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-08T10:01:38.583514510Z[Etc/UTC]")
public class V1PropertyGetPost200ResponseProperty {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RECORD_CREATED = "recordCreated";
  @SerializedName(SERIALIZED_NAME_RECORD_CREATED)
  private V1PropertyGetPost200ResponsePropertyRecordCreated recordCreated;

  public static final String SERIALIZED_NAME_RECORD_MODIFIED = "recordModified";
  @SerializedName(SERIALIZED_NAME_RECORD_MODIFIED)
  private V1PropertyGetPost200ResponsePropertyRecordModified recordModified;

  public static final String SERIALIZED_NAME_PROPERTY_INFO = "propertyInfo";
  @SerializedName(SERIALIZED_NAME_PROPERTY_INFO)
  private V1PropertyGetPost200ResponsePropertyPropertyInfo propertyInfo;

  public static final String SERIALIZED_NAME_GUEST_INFO = "guestInfo";
  @SerializedName(SERIALIZED_NAME_GUEST_INFO)
  private V1PropertyGetPost200ResponsePropertyGuestInfo guestInfo;

  public static final String SERIALIZED_NAME_AWARD_LIST = "awardList";
  @SerializedName(SERIALIZED_NAME_AWARD_LIST)
  private List<V1PropertyGetPost200ResponsePropertyAwardListInner> awardList = null;

  public static final String SERIALIZED_NAME_CONTACT_LIST = "contactList";
  @SerializedName(SERIALIZED_NAME_CONTACT_LIST)
  private List<V1PropertyGetPost200ResponsePropertyContactListInner> contactList = null;

  public static final String SERIALIZED_NAME_FACILITY_INFO = "facilityInfo";
  @SerializedName(SERIALIZED_NAME_FACILITY_INFO)
  private V1PropertyGetPost200ResponsePropertyFacilityInfo facilityInfo;

  public static final String SERIALIZED_NAME_MEDIA_LIST = "mediaList";
  @SerializedName(SERIALIZED_NAME_MEDIA_LIST)
  private List<V1PropertyGetPost200ResponsePropertyMediaListInner> mediaList = null;

  public static final String SERIALIZED_NAME_GEO = "geo";
  @SerializedName(SERIALIZED_NAME_GEO)
  private V1PropertyGetPost200ResponsePropertyGeo geo;

  public static final String SERIALIZED_NAME_REFINEMENT_DATE = "refinementDate";
  @SerializedName(SERIALIZED_NAME_REFINEMENT_DATE)
  private BigDecimal refinementDate;

  public static final String SERIALIZED_NAME_PUBLISHED = "published";
  @SerializedName(SERIALIZED_NAME_PUBLISHED)
  private Boolean published;

  public static final String SERIALIZED_NAME_POLICY_LIST = "policyList";
  @SerializedName(SERIALIZED_NAME_POLICY_LIST)
  private List<V1PropertyGetPost200ResponsePropertyPolicyListInner> policyList = null;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private V1PropertyGetPost200ResponsePropertyTransaction transaction;

  public static final String SERIALIZED_NAME_CANCELLATION_GRACE_PERIOD = "cancellationGracePeriod";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_GRACE_PERIOD)
  private V1PropertyGetPost200ResponsePropertyCancellationGracePeriod cancellationGracePeriod;

  public static final String SERIALIZED_NAME_SERVICE_LIST = "serviceList";
  @SerializedName(SERIALIZED_NAME_SERVICE_LIST)
  private List<V1PropertyGetPost200ResponsePropertyServiceListInner> serviceList = null;

  public V1PropertyGetPost200ResponseProperty() { 
  }

  public V1PropertyGetPost200ResponseProperty code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "strandresidenz-sylt", value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public V1PropertyGetPost200ResponseProperty name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Strandresidenz Sylt", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1PropertyGetPost200ResponseProperty recordCreated(V1PropertyGetPost200ResponsePropertyRecordCreated recordCreated) {
    
    this.recordCreated = recordCreated;
    return this;
  }

   /**
   * Get recordCreated
   * @return recordCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyRecordCreated getRecordCreated() {
    return recordCreated;
  }


  public void setRecordCreated(V1PropertyGetPost200ResponsePropertyRecordCreated recordCreated) {
    this.recordCreated = recordCreated;
  }


  public V1PropertyGetPost200ResponseProperty recordModified(V1PropertyGetPost200ResponsePropertyRecordModified recordModified) {
    
    this.recordModified = recordModified;
    return this;
  }

   /**
   * Get recordModified
   * @return recordModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyRecordModified getRecordModified() {
    return recordModified;
  }


  public void setRecordModified(V1PropertyGetPost200ResponsePropertyRecordModified recordModified) {
    this.recordModified = recordModified;
  }


  public V1PropertyGetPost200ResponseProperty propertyInfo(V1PropertyGetPost200ResponsePropertyPropertyInfo propertyInfo) {
    
    this.propertyInfo = propertyInfo;
    return this;
  }

   /**
   * Get propertyInfo
   * @return propertyInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyPropertyInfo getPropertyInfo() {
    return propertyInfo;
  }


  public void setPropertyInfo(V1PropertyGetPost200ResponsePropertyPropertyInfo propertyInfo) {
    this.propertyInfo = propertyInfo;
  }


  public V1PropertyGetPost200ResponseProperty guestInfo(V1PropertyGetPost200ResponsePropertyGuestInfo guestInfo) {
    
    this.guestInfo = guestInfo;
    return this;
  }

   /**
   * Get guestInfo
   * @return guestInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyGuestInfo getGuestInfo() {
    return guestInfo;
  }


  public void setGuestInfo(V1PropertyGetPost200ResponsePropertyGuestInfo guestInfo) {
    this.guestInfo = guestInfo;
  }


  public V1PropertyGetPost200ResponseProperty awardList(List<V1PropertyGetPost200ResponsePropertyAwardListInner> awardList) {
    
    this.awardList = awardList;
    return this;
  }

  public V1PropertyGetPost200ResponseProperty addAwardListItem(V1PropertyGetPost200ResponsePropertyAwardListInner awardListItem) {
    if (this.awardList == null) {
      this.awardList = new ArrayList<>();
    }
    this.awardList.add(awardListItem);
    return this;
  }

   /**
   * Get awardList
   * @return awardList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyAwardListInner> getAwardList() {
    return awardList;
  }


  public void setAwardList(List<V1PropertyGetPost200ResponsePropertyAwardListInner> awardList) {
    this.awardList = awardList;
  }


  public V1PropertyGetPost200ResponseProperty contactList(List<V1PropertyGetPost200ResponsePropertyContactListInner> contactList) {
    
    this.contactList = contactList;
    return this;
  }

  public V1PropertyGetPost200ResponseProperty addContactListItem(V1PropertyGetPost200ResponsePropertyContactListInner contactListItem) {
    if (this.contactList == null) {
      this.contactList = new ArrayList<>();
    }
    this.contactList.add(contactListItem);
    return this;
  }

   /**
   * Get contactList
   * @return contactList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyContactListInner> getContactList() {
    return contactList;
  }


  public void setContactList(List<V1PropertyGetPost200ResponsePropertyContactListInner> contactList) {
    this.contactList = contactList;
  }


  public V1PropertyGetPost200ResponseProperty facilityInfo(V1PropertyGetPost200ResponsePropertyFacilityInfo facilityInfo) {
    
    this.facilityInfo = facilityInfo;
    return this;
  }

   /**
   * Get facilityInfo
   * @return facilityInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyFacilityInfo getFacilityInfo() {
    return facilityInfo;
  }


  public void setFacilityInfo(V1PropertyGetPost200ResponsePropertyFacilityInfo facilityInfo) {
    this.facilityInfo = facilityInfo;
  }


  public V1PropertyGetPost200ResponseProperty mediaList(List<V1PropertyGetPost200ResponsePropertyMediaListInner> mediaList) {
    
    this.mediaList = mediaList;
    return this;
  }

  public V1PropertyGetPost200ResponseProperty addMediaListItem(V1PropertyGetPost200ResponsePropertyMediaListInner mediaListItem) {
    if (this.mediaList == null) {
      this.mediaList = new ArrayList<>();
    }
    this.mediaList.add(mediaListItem);
    return this;
  }

   /**
   * Get mediaList
   * @return mediaList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyMediaListInner> getMediaList() {
    return mediaList;
  }


  public void setMediaList(List<V1PropertyGetPost200ResponsePropertyMediaListInner> mediaList) {
    this.mediaList = mediaList;
  }


  public V1PropertyGetPost200ResponseProperty geo(V1PropertyGetPost200ResponsePropertyGeo geo) {
    
    this.geo = geo;
    return this;
  }

   /**
   * Get geo
   * @return geo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyGeo getGeo() {
    return geo;
  }


  public void setGeo(V1PropertyGetPost200ResponsePropertyGeo geo) {
    this.geo = geo;
  }


  public V1PropertyGetPost200ResponseProperty refinementDate(BigDecimal refinementDate) {
    
    this.refinementDate = refinementDate;
    return this;
  }

   /**
   * Get refinementDate
   * @return refinementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1643706934194", value = "")

  public BigDecimal getRefinementDate() {
    return refinementDate;
  }


  public void setRefinementDate(BigDecimal refinementDate) {
    this.refinementDate = refinementDate;
  }


  public V1PropertyGetPost200ResponseProperty published(Boolean published) {
    
    this.published = published;
    return this;
  }

   /**
   * Get published
   * @return published
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPublished() {
    return published;
  }


  public void setPublished(Boolean published) {
    this.published = published;
  }


  public V1PropertyGetPost200ResponseProperty policyList(List<V1PropertyGetPost200ResponsePropertyPolicyListInner> policyList) {
    
    this.policyList = policyList;
    return this;
  }

  public V1PropertyGetPost200ResponseProperty addPolicyListItem(V1PropertyGetPost200ResponsePropertyPolicyListInner policyListItem) {
    if (this.policyList == null) {
      this.policyList = new ArrayList<>();
    }
    this.policyList.add(policyListItem);
    return this;
  }

   /**
   * Get policyList
   * @return policyList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyPolicyListInner> getPolicyList() {
    return policyList;
  }


  public void setPolicyList(List<V1PropertyGetPost200ResponsePropertyPolicyListInner> policyList) {
    this.policyList = policyList;
  }


  public V1PropertyGetPost200ResponseProperty uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "strandresidenz-sylt", value = "")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public V1PropertyGetPost200ResponseProperty transaction(V1PropertyGetPost200ResponsePropertyTransaction transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyTransaction getTransaction() {
    return transaction;
  }


  public void setTransaction(V1PropertyGetPost200ResponsePropertyTransaction transaction) {
    this.transaction = transaction;
  }


  public V1PropertyGetPost200ResponseProperty cancellationGracePeriod(V1PropertyGetPost200ResponsePropertyCancellationGracePeriod cancellationGracePeriod) {
    
    this.cancellationGracePeriod = cancellationGracePeriod;
    return this;
  }

   /**
   * Get cancellationGracePeriod
   * @return cancellationGracePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PropertyGetPost200ResponsePropertyCancellationGracePeriod getCancellationGracePeriod() {
    return cancellationGracePeriod;
  }


  public void setCancellationGracePeriod(V1PropertyGetPost200ResponsePropertyCancellationGracePeriod cancellationGracePeriod) {
    this.cancellationGracePeriod = cancellationGracePeriod;
  }


  public V1PropertyGetPost200ResponseProperty serviceList(List<V1PropertyGetPost200ResponsePropertyServiceListInner> serviceList) {
    
    this.serviceList = serviceList;
    return this;
  }

  public V1PropertyGetPost200ResponseProperty addServiceListItem(V1PropertyGetPost200ResponsePropertyServiceListInner serviceListItem) {
    if (this.serviceList == null) {
      this.serviceList = new ArrayList<>();
    }
    this.serviceList.add(serviceListItem);
    return this;
  }

   /**
   * Get serviceList
   * @return serviceList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1PropertyGetPost200ResponsePropertyServiceListInner> getServiceList() {
    return serviceList;
  }


  public void setServiceList(List<V1PropertyGetPost200ResponsePropertyServiceListInner> serviceList) {
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
    V1PropertyGetPost200ResponseProperty v1PropertyGetPost200ResponseProperty = (V1PropertyGetPost200ResponseProperty) o;
    return Objects.equals(this.code, v1PropertyGetPost200ResponseProperty.code) &&
        Objects.equals(this.name, v1PropertyGetPost200ResponseProperty.name) &&
        Objects.equals(this.recordCreated, v1PropertyGetPost200ResponseProperty.recordCreated) &&
        Objects.equals(this.recordModified, v1PropertyGetPost200ResponseProperty.recordModified) &&
        Objects.equals(this.propertyInfo, v1PropertyGetPost200ResponseProperty.propertyInfo) &&
        Objects.equals(this.guestInfo, v1PropertyGetPost200ResponseProperty.guestInfo) &&
        Objects.equals(this.awardList, v1PropertyGetPost200ResponseProperty.awardList) &&
        Objects.equals(this.contactList, v1PropertyGetPost200ResponseProperty.contactList) &&
        Objects.equals(this.facilityInfo, v1PropertyGetPost200ResponseProperty.facilityInfo) &&
        Objects.equals(this.mediaList, v1PropertyGetPost200ResponseProperty.mediaList) &&
        Objects.equals(this.geo, v1PropertyGetPost200ResponseProperty.geo) &&
        Objects.equals(this.refinementDate, v1PropertyGetPost200ResponseProperty.refinementDate) &&
        Objects.equals(this.published, v1PropertyGetPost200ResponseProperty.published) &&
        Objects.equals(this.policyList, v1PropertyGetPost200ResponseProperty.policyList) &&
        Objects.equals(this.uri, v1PropertyGetPost200ResponseProperty.uri) &&
        Objects.equals(this.transaction, v1PropertyGetPost200ResponseProperty.transaction) &&
        Objects.equals(this.cancellationGracePeriod, v1PropertyGetPost200ResponseProperty.cancellationGracePeriod) &&
        Objects.equals(this.serviceList, v1PropertyGetPost200ResponseProperty.serviceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, recordCreated, recordModified, propertyInfo, guestInfo, awardList, contactList, facilityInfo, mediaList, geo, refinementDate, published, policyList, uri, transaction, cancellationGracePeriod, serviceList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PropertyGetPost200ResponseProperty {\n");
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
    sb.append("    refinementDate: ").append(toIndentedString(refinementDate)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    policyList: ").append(toIndentedString(policyList)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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
    openapiFields.add("refinementDate");
    openapiFields.add("published");
    openapiFields.add("policyList");
    openapiFields.add("uri");
    openapiFields.add("transaction");
    openapiFields.add("cancellationGracePeriod");
    openapiFields.add("serviceList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PropertyGetPost200ResponseProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1PropertyGetPost200ResponseProperty.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PropertyGetPost200ResponseProperty is not found in the empty JSON string", V1PropertyGetPost200ResponseProperty.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PropertyGetPost200ResponseProperty.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PropertyGetPost200ResponseProperty` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `recordCreated`
      if (jsonObj.getAsJsonObject("recordCreated") != null) {
        V1PropertyGetPost200ResponsePropertyRecordCreated.validateJsonObject(jsonObj.getAsJsonObject("recordCreated"));
      }
      // validate the optional field `recordModified`
      if (jsonObj.getAsJsonObject("recordModified") != null) {
        V1PropertyGetPost200ResponsePropertyRecordModified.validateJsonObject(jsonObj.getAsJsonObject("recordModified"));
      }
      // validate the optional field `propertyInfo`
      if (jsonObj.getAsJsonObject("propertyInfo") != null) {
        V1PropertyGetPost200ResponsePropertyPropertyInfo.validateJsonObject(jsonObj.getAsJsonObject("propertyInfo"));
      }
      // validate the optional field `guestInfo`
      if (jsonObj.getAsJsonObject("guestInfo") != null) {
        V1PropertyGetPost200ResponsePropertyGuestInfo.validateJsonObject(jsonObj.getAsJsonObject("guestInfo"));
      }
      JsonArray jsonArrayawardList = jsonObj.getAsJsonArray("awardList");
      if (jsonArrayawardList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("awardList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `awardList` to be an array in the JSON string but got `%s`", jsonObj.get("awardList").toString()));
        }

        // validate the optional field `awardList` (array)
        for (int i = 0; i < jsonArrayawardList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyAwardListInner.validateJsonObject(jsonArrayawardList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraycontactList = jsonObj.getAsJsonArray("contactList");
      if (jsonArraycontactList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("contactList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `contactList` to be an array in the JSON string but got `%s`", jsonObj.get("contactList").toString()));
        }

        // validate the optional field `contactList` (array)
        for (int i = 0; i < jsonArraycontactList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyContactListInner.validateJsonObject(jsonArraycontactList.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `facilityInfo`
      if (jsonObj.getAsJsonObject("facilityInfo") != null) {
        V1PropertyGetPost200ResponsePropertyFacilityInfo.validateJsonObject(jsonObj.getAsJsonObject("facilityInfo"));
      }
      JsonArray jsonArraymediaList = jsonObj.getAsJsonArray("mediaList");
      if (jsonArraymediaList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("mediaList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `mediaList` to be an array in the JSON string but got `%s`", jsonObj.get("mediaList").toString()));
        }

        // validate the optional field `mediaList` (array)
        for (int i = 0; i < jsonArraymediaList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyMediaListInner.validateJsonObject(jsonArraymediaList.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `geo`
      if (jsonObj.getAsJsonObject("geo") != null) {
        V1PropertyGetPost200ResponsePropertyGeo.validateJsonObject(jsonObj.getAsJsonObject("geo"));
      }
      JsonArray jsonArraypolicyList = jsonObj.getAsJsonArray("policyList");
      if (jsonArraypolicyList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("policyList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `policyList` to be an array in the JSON string but got `%s`", jsonObj.get("policyList").toString()));
        }

        // validate the optional field `policyList` (array)
        for (int i = 0; i < jsonArraypolicyList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyPolicyListInner.validateJsonObject(jsonArraypolicyList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      // validate the optional field `transaction`
      if (jsonObj.getAsJsonObject("transaction") != null) {
        V1PropertyGetPost200ResponsePropertyTransaction.validateJsonObject(jsonObj.getAsJsonObject("transaction"));
      }
      // validate the optional field `cancellationGracePeriod`
      if (jsonObj.getAsJsonObject("cancellationGracePeriod") != null) {
        V1PropertyGetPost200ResponsePropertyCancellationGracePeriod.validateJsonObject(jsonObj.getAsJsonObject("cancellationGracePeriod"));
      }
      JsonArray jsonArrayserviceList = jsonObj.getAsJsonArray("serviceList");
      if (jsonArrayserviceList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("serviceList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `serviceList` to be an array in the JSON string but got `%s`", jsonObj.get("serviceList").toString()));
        }

        // validate the optional field `serviceList` (array)
        for (int i = 0; i < jsonArrayserviceList.size(); i++) {
          V1PropertyGetPost200ResponsePropertyServiceListInner.validateJsonObject(jsonArrayserviceList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PropertyGetPost200ResponseProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PropertyGetPost200ResponseProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PropertyGetPost200ResponseProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PropertyGetPost200ResponseProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PropertyGetPost200ResponseProperty>() {
           @Override
           public void write(JsonWriter out, V1PropertyGetPost200ResponseProperty value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PropertyGetPost200ResponseProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PropertyGetPost200ResponseProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PropertyGetPost200ResponseProperty
  * @throws IOException if the JSON string is invalid with respect to V1PropertyGetPost200ResponseProperty
  */
  public static V1PropertyGetPost200ResponseProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PropertyGetPost200ResponseProperty.class);
  }

 /**
  * Convert an instance of V1PropertyGetPost200ResponseProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


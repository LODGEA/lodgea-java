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
import com.lodgea.model.InlineResponse2001Geo;
import com.lodgea.model.InlineResponse2003PropertyAwardList;
import com.lodgea.model.InlineResponse2003PropertyCancellationGracePeriod;
import com.lodgea.model.InlineResponse2003PropertyContactList;
import com.lodgea.model.InlineResponse2003PropertyFacilityInfo;
import com.lodgea.model.InlineResponse2003PropertyGuestInfo;
import com.lodgea.model.InlineResponse2003PropertyMediaList;
import com.lodgea.model.InlineResponse2003PropertyPolicyList;
import com.lodgea.model.InlineResponse2003PropertyPropertyInfo;
import com.lodgea.model.InlineResponse2003PropertyRecordCreated;
import com.lodgea.model.InlineResponse2003PropertyRecordModified;
import com.lodgea.model.InlineResponse2003PropertyServiceList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * An object containing all available base data for the requested property.
 */
@ApiModel(description = "An object containing all available base data for the requested property.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-07T12:22:24.387616647Z[Etc/UTC]")
public class InlineResponse2003Property {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RECORD_CREATED = "recordCreated";
  @SerializedName(SERIALIZED_NAME_RECORD_CREATED)
  private InlineResponse2003PropertyRecordCreated recordCreated;

  public static final String SERIALIZED_NAME_RECORD_MODIFIED = "recordModified";
  @SerializedName(SERIALIZED_NAME_RECORD_MODIFIED)
  private InlineResponse2003PropertyRecordModified recordModified;

  public static final String SERIALIZED_NAME_PROPERTY_INFO = "propertyInfo";
  @SerializedName(SERIALIZED_NAME_PROPERTY_INFO)
  private InlineResponse2003PropertyPropertyInfo propertyInfo;

  public static final String SERIALIZED_NAME_GUEST_INFO = "guestInfo";
  @SerializedName(SERIALIZED_NAME_GUEST_INFO)
  private InlineResponse2003PropertyGuestInfo guestInfo;

  public static final String SERIALIZED_NAME_AWARD_LIST = "awardList";
  @SerializedName(SERIALIZED_NAME_AWARD_LIST)
  private List<InlineResponse2003PropertyAwardList> awardList = new ArrayList<InlineResponse2003PropertyAwardList>();

  public static final String SERIALIZED_NAME_CONTACT_LIST = "contactList";
  @SerializedName(SERIALIZED_NAME_CONTACT_LIST)
  private List<InlineResponse2003PropertyContactList> contactList = new ArrayList<InlineResponse2003PropertyContactList>();

  public static final String SERIALIZED_NAME_FACILITY_INFO = "facilityInfo";
  @SerializedName(SERIALIZED_NAME_FACILITY_INFO)
  private InlineResponse2003PropertyFacilityInfo facilityInfo;

  public static final String SERIALIZED_NAME_MEDIA_LIST = "mediaList";
  @SerializedName(SERIALIZED_NAME_MEDIA_LIST)
  private List<InlineResponse2003PropertyMediaList> mediaList = new ArrayList<InlineResponse2003PropertyMediaList>();

  public static final String SERIALIZED_NAME_GEO = "geo";
  @SerializedName(SERIALIZED_NAME_GEO)
  private Map<String, InlineResponse2001Geo> geo = null;

  public static final String SERIALIZED_NAME_PUBLISHED = "published";
  @SerializedName(SERIALIZED_NAME_PUBLISHED)
  private Boolean published;

  public static final String SERIALIZED_NAME_POLICY_LIST = "policyList";
  @SerializedName(SERIALIZED_NAME_POLICY_LIST)
  private List<InlineResponse2003PropertyPolicyList> policyList = new ArrayList<InlineResponse2003PropertyPolicyList>();

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_CANCELLATION_GRACE_PERIOD = "cancellationGracePeriod";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_GRACE_PERIOD)
  private InlineResponse2003PropertyCancellationGracePeriod cancellationGracePeriod;

  public static final String SERIALIZED_NAME_SERVICE_LIST = "serviceList";
  @SerializedName(SERIALIZED_NAME_SERVICE_LIST)
  private List<InlineResponse2003PropertyServiceList> serviceList = new ArrayList<InlineResponse2003PropertyServiceList>();

  public InlineResponse2003Property() { 
  }

  public InlineResponse2003Property code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The properties unique identifier.
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "strandresidenz-sylt", required = true, value = "The properties unique identifier.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public InlineResponse2003Property name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The properties name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Strandresidenz Sylt", required = true, value = "The properties name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse2003Property recordCreated(InlineResponse2003PropertyRecordCreated recordCreated) {
    
    this.recordCreated = recordCreated;
    return this;
  }

   /**
   * Get recordCreated
   * @return recordCreated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InlineResponse2003PropertyRecordCreated getRecordCreated() {
    return recordCreated;
  }


  public void setRecordCreated(InlineResponse2003PropertyRecordCreated recordCreated) {
    this.recordCreated = recordCreated;
  }


  public InlineResponse2003Property recordModified(InlineResponse2003PropertyRecordModified recordModified) {
    
    this.recordModified = recordModified;
    return this;
  }

   /**
   * Get recordModified
   * @return recordModified
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InlineResponse2003PropertyRecordModified getRecordModified() {
    return recordModified;
  }


  public void setRecordModified(InlineResponse2003PropertyRecordModified recordModified) {
    this.recordModified = recordModified;
  }


  public InlineResponse2003Property propertyInfo(InlineResponse2003PropertyPropertyInfo propertyInfo) {
    
    this.propertyInfo = propertyInfo;
    return this;
  }

   /**
   * Get propertyInfo
   * @return propertyInfo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InlineResponse2003PropertyPropertyInfo getPropertyInfo() {
    return propertyInfo;
  }


  public void setPropertyInfo(InlineResponse2003PropertyPropertyInfo propertyInfo) {
    this.propertyInfo = propertyInfo;
  }


  public InlineResponse2003Property guestInfo(InlineResponse2003PropertyGuestInfo guestInfo) {
    
    this.guestInfo = guestInfo;
    return this;
  }

   /**
   * Get guestInfo
   * @return guestInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse2003PropertyGuestInfo getGuestInfo() {
    return guestInfo;
  }


  public void setGuestInfo(InlineResponse2003PropertyGuestInfo guestInfo) {
    this.guestInfo = guestInfo;
  }


  public InlineResponse2003Property awardList(List<InlineResponse2003PropertyAwardList> awardList) {
    
    this.awardList = awardList;
    return this;
  }

  public InlineResponse2003Property addAwardListItem(InlineResponse2003PropertyAwardList awardListItem) {
    this.awardList.add(awardListItem);
    return this;
  }

   /**
   * A list of the ratings available for this property.
   * @return awardList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of the ratings available for this property.")

  public List<InlineResponse2003PropertyAwardList> getAwardList() {
    return awardList;
  }


  public void setAwardList(List<InlineResponse2003PropertyAwardList> awardList) {
    this.awardList = awardList;
  }


  public InlineResponse2003Property contactList(List<InlineResponse2003PropertyContactList> contactList) {
    
    this.contactList = contactList;
    return this;
  }

  public InlineResponse2003Property addContactListItem(InlineResponse2003PropertyContactList contactListItem) {
    this.contactList.add(contactListItem);
    return this;
  }

   /**
   * A contact with a profile type and a list of addresses
   * @return contactList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A contact with a profile type and a list of addresses")

  public List<InlineResponse2003PropertyContactList> getContactList() {
    return contactList;
  }


  public void setContactList(List<InlineResponse2003PropertyContactList> contactList) {
    this.contactList = contactList;
  }


  public InlineResponse2003Property facilityInfo(InlineResponse2003PropertyFacilityInfo facilityInfo) {
    
    this.facilityInfo = facilityInfo;
    return this;
  }

   /**
   * Get facilityInfo
   * @return facilityInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse2003PropertyFacilityInfo getFacilityInfo() {
    return facilityInfo;
  }


  public void setFacilityInfo(InlineResponse2003PropertyFacilityInfo facilityInfo) {
    this.facilityInfo = facilityInfo;
  }


  public InlineResponse2003Property mediaList(List<InlineResponse2003PropertyMediaList> mediaList) {
    
    this.mediaList = mediaList;
    return this;
  }

  public InlineResponse2003Property addMediaListItem(InlineResponse2003PropertyMediaList mediaListItem) {
    this.mediaList.add(mediaListItem);
    return this;
  }

   /**
   * A list of media objects for the property.
   * @return mediaList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of media objects for the property.")

  public List<InlineResponse2003PropertyMediaList> getMediaList() {
    return mediaList;
  }


  public void setMediaList(List<InlineResponse2003PropertyMediaList> mediaList) {
    this.mediaList = mediaList;
  }


  public InlineResponse2003Property geo(Map<String, InlineResponse2001Geo> geo) {
    
    this.geo = geo;
    return this;
  }

  public InlineResponse2003Property putGeoItem(String key, InlineResponse2001Geo geoItem) {
    if (this.geo == null) {
      this.geo = new HashMap<String, InlineResponse2001Geo>();
    }
    this.geo.put(key, geoItem);
    return this;
  }

   /**
   * An object containing language codes as keys and objects describing the properties geographical location as values.
   * @return geo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"de\":{\"location\":{\"lat\":54.9157118,\"lng\":8.304857},\"formatted_address\":\"Nordhedig 20, 25980 Sylt, Deutschland\",\"place_id\":\"ChIJVaxqTevetEcRyfs8PGHK6mw\",\"street_number\":\"20\",\"route\":\"Nordhedig\",\"sublocality\":\"Westerland\",\"sublocality_level_1\":\"Westerland\",\"locality\":\"Sylt\",\"administrative_area_level_3\":\"Nordfriesland\",\"administrative_area_level_1\":\"Schleswig-Holstein\",\"state_code\":\"SH\",\"country\":\"Deutschland\",\"country_code\":\"DE\",\"postal_code\":\"25980\",\"language\":\"de\"},\"en\":{\"location\":{\"lat\":54.9157118,\"lng\":8.304857},\"formatted_address\":\"Nordhedig 20, 25980 Sylt, Germany\",\"place_id\":\"ChIJVaxqTevetEcRyfs8PGHK6mw\",\"street_number\":\"20\",\"route\":\"Nordhedig\",\"sublocality\":\"Westerland\",\"sublocality_level_1\":\"Westerland\",\"locality\":\"Sylt\",\"administrative_area_level_3\":\"Nordfriesland\",\"administrative_area_level_1\":\"Schleswig-Holstein\",\"state_code\":\"SH\",\"country\":\"Germany\",\"country_code\":\"DE\",\"postal_code\":\"25980\",\"language\":\"en\"},\"da\":{\"location\":{\"lat\":54.9157118,\"lng\":8.304857},\"formatted_address\":\"Nordhedig 20, 25980 Sylt, Tyskland\",\"place_id\":\"ChIJVaxqTevetEcRyfs8PGHK6mw\",\"street_number\":\"20\",\"route\":\"Nordhedig\",\"sublocality\":\"Westerland\",\"sublocality_level_1\":\"Westerland\",\"locality\":\"Sylt\",\"administrative_area_level_3\":\"Nordfriesland\",\"administrative_area_level_1\":\"Schleswig-Holstein\",\"state_code\":\"SH\",\"country\":\"Tyskland\",\"country_code\":\"DE\",\"postal_code\":\"25980\",\"language\":\"da\"},\"nl\":{\"location\":{\"lat\":54.9157118,\"lng\":8.304857},\"formatted_address\":\"Nordhedig 20, 25980 Sylt, Duitsland\",\"place_id\":\"ChIJVaxqTevetEcRyfs8PGHK6mw\",\"street_number\":\"20\",\"route\":\"Nordhedig\",\"sublocality\":\"Westerland\",\"sublocality_level_1\":\"Westerland\",\"locality\":\"Sylt\",\"administrative_area_level_3\":\"Nordfriesland\",\"administrative_area_level_1\":\"Schleswig-Holstein\",\"state_code\":\"SH\",\"country\":\"Duitsland\",\"country_code\":\"DE\",\"postal_code\":\"25980\",\"language\":\"nl\"}}", value = "An object containing language codes as keys and objects describing the properties geographical location as values.")

  public Map<String, InlineResponse2001Geo> getGeo() {
    return geo;
  }


  public void setGeo(Map<String, InlineResponse2001Geo> geo) {
    this.geo = geo;
  }


  public InlineResponse2003Property published(Boolean published) {
    
    this.published = published;
    return this;
  }

   /**
   * Indicates whether the policy has been published or not.
   * @return published
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Indicates whether the policy has been published or not.")

  public Boolean getPublished() {
    return published;
  }


  public void setPublished(Boolean published) {
    this.published = published;
  }


  public InlineResponse2003Property policyList(List<InlineResponse2003PropertyPolicyList> policyList) {
    
    this.policyList = policyList;
    return this;
  }

  public InlineResponse2003Property addPolicyListItem(InlineResponse2003PropertyPolicyList policyListItem) {
    this.policyList.add(policyListItem);
    return this;
  }

   /**
   * A list of policies associated with the property.
   * @return policyList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of policies associated with the property.")

  public List<InlineResponse2003PropertyPolicyList> getPolicyList() {
    return policyList;
  }


  public void setPolicyList(List<InlineResponse2003PropertyPolicyList> policyList) {
    this.policyList = policyList;
  }


  public InlineResponse2003Property uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * A unique identifier for the accommodation.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "strandresidenz-sylt", value = "A unique identifier for the accommodation.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public InlineResponse2003Property cancellationGracePeriod(InlineResponse2003PropertyCancellationGracePeriod cancellationGracePeriod) {
    
    this.cancellationGracePeriod = cancellationGracePeriod;
    return this;
  }

   /**
   * Get cancellationGracePeriod
   * @return cancellationGracePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse2003PropertyCancellationGracePeriod getCancellationGracePeriod() {
    return cancellationGracePeriod;
  }


  public void setCancellationGracePeriod(InlineResponse2003PropertyCancellationGracePeriod cancellationGracePeriod) {
    this.cancellationGracePeriod = cancellationGracePeriod;
  }


  public InlineResponse2003Property serviceList(List<InlineResponse2003PropertyServiceList> serviceList) {
    
    this.serviceList = serviceList;
    return this;
  }

  public InlineResponse2003Property addServiceListItem(InlineResponse2003PropertyServiceList serviceListItem) {
    this.serviceList.add(serviceListItem);
    return this;
  }

   /**
   * A list of objects each describing an available service, its pricing and its availability.
   * @return serviceList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of objects each describing an available service, its pricing and its availability.")

  public List<InlineResponse2003PropertyServiceList> getServiceList() {
    return serviceList;
  }


  public void setServiceList(List<InlineResponse2003PropertyServiceList> serviceList) {
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
    InlineResponse2003Property inlineResponse2003Property = (InlineResponse2003Property) o;
    return Objects.equals(this.code, inlineResponse2003Property.code) &&
        Objects.equals(this.name, inlineResponse2003Property.name) &&
        Objects.equals(this.recordCreated, inlineResponse2003Property.recordCreated) &&
        Objects.equals(this.recordModified, inlineResponse2003Property.recordModified) &&
        Objects.equals(this.propertyInfo, inlineResponse2003Property.propertyInfo) &&
        Objects.equals(this.guestInfo, inlineResponse2003Property.guestInfo) &&
        Objects.equals(this.awardList, inlineResponse2003Property.awardList) &&
        Objects.equals(this.contactList, inlineResponse2003Property.contactList) &&
        Objects.equals(this.facilityInfo, inlineResponse2003Property.facilityInfo) &&
        Objects.equals(this.mediaList, inlineResponse2003Property.mediaList) &&
        Objects.equals(this.geo, inlineResponse2003Property.geo) &&
        Objects.equals(this.published, inlineResponse2003Property.published) &&
        Objects.equals(this.policyList, inlineResponse2003Property.policyList) &&
        Objects.equals(this.uri, inlineResponse2003Property.uri) &&
        Objects.equals(this.cancellationGracePeriod, inlineResponse2003Property.cancellationGracePeriod) &&
        Objects.equals(this.serviceList, inlineResponse2003Property.serviceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, recordCreated, recordModified, propertyInfo, guestInfo, awardList, contactList, facilityInfo, mediaList, geo, published, policyList, uri, cancellationGracePeriod, serviceList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003Property {\n");
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

}


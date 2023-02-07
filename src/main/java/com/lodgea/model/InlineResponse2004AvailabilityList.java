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
import com.lodgea.model.InlineResponse2004RatePlanList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2004AvailabilityList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-07T12:22:24.387616647Z[Etc/UTC]")
public class InlineResponse2004AvailabilityList {
  public static final String SERIALIZED_NAME_RATE_PLAN_LIST = "ratePlanList";
  @SerializedName(SERIALIZED_NAME_RATE_PLAN_LIST)
  private List<InlineResponse2004RatePlanList> ratePlanList = new ArrayList<InlineResponse2004RatePlanList>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets mealPlanList
   */
  @JsonAdapter(MealPlanListEnum.Adapter.class)
  public enum MealPlanListEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1")),
    
    NUMBER_2(new BigDecimal("2")),
    
    NUMBER_3(new BigDecimal("3")),
    
    NUMBER_4(new BigDecimal("4")),
    
    NUMBER_5(new BigDecimal("5")),
    
    NUMBER_6(new BigDecimal("6")),
    
    NUMBER_7(new BigDecimal("7")),
    
    NUMBER_8(new BigDecimal("8")),
    
    NUMBER_9(new BigDecimal("9")),
    
    NUMBER_10(new BigDecimal("10")),
    
    NUMBER_11(new BigDecimal("11")),
    
    NUMBER_12(new BigDecimal("12")),
    
    NUMBER_14(new BigDecimal("14")),
    
    NUMBER_15(new BigDecimal("15")),
    
    NUMBER_16(new BigDecimal("16")),
    
    NUMBER_17(new BigDecimal("17")),
    
    NUMBER_18(new BigDecimal("18")),
    
    NUMBER_19(new BigDecimal("19")),
    
    NUMBER_20(new BigDecimal("20")),
    
    NUMBER_21(new BigDecimal("21")),
    
    NUMBER_22(new BigDecimal("22")),
    
    NUMBER_23(new BigDecimal("23")),
    
    NUMBER_24(new BigDecimal("24")),
    
    NUMBER_90001(new BigDecimal("90001"));

    private BigDecimal value;

    MealPlanListEnum(BigDecimal value) {
      this.value = value;
    }

    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MealPlanListEnum fromValue(BigDecimal value) {
      for (MealPlanListEnum b : MealPlanListEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MealPlanListEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MealPlanListEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MealPlanListEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MealPlanListEnum.fromValue(new BigDecimal(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_MEAL_PLAN_LIST = "mealPlanList";
  @SerializedName(SERIALIZED_NAME_MEAL_PLAN_LIST)
  private List<MealPlanListEnum> mealPlanList = new ArrayList<MealPlanListEnum>();

  public static final String SERIALIZED_NAME_ROOM_TYPE_LIST = "roomTypeList";
  @SerializedName(SERIALIZED_NAME_ROOM_TYPE_LIST)
  private List<String> roomTypeList = new ArrayList<String>();

  public InlineResponse2004AvailabilityList() { 
  }

  public InlineResponse2004AvailabilityList ratePlanList(List<InlineResponse2004RatePlanList> ratePlanList) {
    
    this.ratePlanList = ratePlanList;
    return this;
  }

  public InlineResponse2004AvailabilityList addRatePlanListItem(InlineResponse2004RatePlanList ratePlanListItem) {
    this.ratePlanList.add(ratePlanListItem);
    return this;
  }

   /**
   * A list of available rate plans.
   * @return ratePlanList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of available rate plans.")

  public List<InlineResponse2004RatePlanList> getRatePlanList() {
    return ratePlanList;
  }


  public void setRatePlanList(List<InlineResponse2004RatePlanList> ratePlanList) {
    this.ratePlanList = ratePlanList;
  }


  public InlineResponse2004AvailabilityList name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the rate plan group.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Standard", required = true, value = "The name of the rate plan group.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse2004AvailabilityList mealPlanList(List<MealPlanListEnum> mealPlanList) {
    
    this.mealPlanList = mealPlanList;
    return this;
  }

  public InlineResponse2004AvailabilityList addMealPlanListItem(MealPlanListEnum mealPlanListItem) {
    this.mealPlanList.add(mealPlanListItem);
    return this;
  }

   /**
   * The available meal plans.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#mealplan-type-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   * @return mealPlanList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The available meal plans.<p>See also <a href=\"#mealplan-type-codes\">in the appendix</a>.</p>")

  public List<MealPlanListEnum> getMealPlanList() {
    return mealPlanList;
  }


  public void setMealPlanList(List<MealPlanListEnum> mealPlanList) {
    this.mealPlanList = mealPlanList;
  }


  public InlineResponse2004AvailabilityList roomTypeList(List<String> roomTypeList) {
    
    this.roomTypeList = roomTypeList;
    return this;
  }

  public InlineResponse2004AvailabilityList addRoomTypeListItem(String roomTypeListItem) {
    this.roomTypeList.add(roomTypeListItem);
    return this;
  }

   /**
   * The rooms this availability is for.
   * @return roomTypeList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The rooms this availability is for.")

  public List<String> getRoomTypeList() {
    return roomTypeList;
  }


  public void setRoomTypeList(List<String> roomTypeList) {
    this.roomTypeList = roomTypeList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004AvailabilityList inlineResponse2004AvailabilityList = (InlineResponse2004AvailabilityList) o;
    return Objects.equals(this.ratePlanList, inlineResponse2004AvailabilityList.ratePlanList) &&
        Objects.equals(this.name, inlineResponse2004AvailabilityList.name) &&
        Objects.equals(this.mealPlanList, inlineResponse2004AvailabilityList.mealPlanList) &&
        Objects.equals(this.roomTypeList, inlineResponse2004AvailabilityList.roomTypeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratePlanList, name, mealPlanList, roomTypeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004AvailabilityList {\n");
    sb.append("    ratePlanList: ").append(toIndentedString(ratePlanList)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mealPlanList: ").append(toIndentedString(mealPlanList)).append("\n");
    sb.append("    roomTypeList: ").append(toIndentedString(roomTypeList)).append("\n");
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


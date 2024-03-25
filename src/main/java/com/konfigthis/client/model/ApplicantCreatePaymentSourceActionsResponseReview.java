/*
 * Sumsub API
 * Sumsub is the one verification platform to secure the whole user journey. With Sumsub's customizable KYC, KYB, transaction monitoring and fraud prevention solutions, you can orchestrate your verification process, welcome more customers worldwide, meet compliance requirements, reduce costs and protect your business.  Sumsub has over 2,000 clients in fintech, crypto, transportation, trading, e-commerce and gaming industries including Binance, Wirex, Avis, Bybit, Huobi, Unlimit, Flutter, Kaizen Gaming, and TransferGo.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ApplicantCreatePaymentSourceActionsResponseReview
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApplicantCreatePaymentSourceActionsResponseReview {
  public static final String SERIALIZED_NAME_REVIEW_ID = "reviewId";
  @SerializedName(SERIALIZED_NAME_REVIEW_ID)
  private String reviewId;

  public static final String SERIALIZED_NAME_ATTEMPT_ID = "attemptId";
  @SerializedName(SERIALIZED_NAME_ATTEMPT_ID)
  private String attemptId;

  public static final String SERIALIZED_NAME_ATTEMPT_CNT = "attemptCnt";
  @SerializedName(SERIALIZED_NAME_ATTEMPT_CNT)
  private Integer attemptCnt = 0;

  public static final String SERIALIZED_NAME_LEVEL_NAME = "levelName";
  @SerializedName(SERIALIZED_NAME_LEVEL_NAME)
  private String levelName;

  public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private String createDate;

  public static final String SERIALIZED_NAME_REVIEW_STATUS = "reviewStatus";
  @SerializedName(SERIALIZED_NAME_REVIEW_STATUS)
  private String reviewStatus;

  public ApplicantCreatePaymentSourceActionsResponseReview() {
  }

  public ApplicantCreatePaymentSourceActionsResponseReview reviewId(String reviewId) {
    
    
    
    
    this.reviewId = reviewId;
    return this;
  }

   /**
   * Get reviewId
   * @return reviewId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RlWfu", value = "")

  public String getReviewId() {
    return reviewId;
  }


  public void setReviewId(String reviewId) {
    
    
    
    this.reviewId = reviewId;
  }


  public ApplicantCreatePaymentSourceActionsResponseReview attemptId(String attemptId) {
    
    
    
    
    this.attemptId = attemptId;
    return this;
  }

   /**
   * Get attemptId
   * @return attemptId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dhABq", value = "")

  public String getAttemptId() {
    return attemptId;
  }


  public void setAttemptId(String attemptId) {
    
    
    
    this.attemptId = attemptId;
  }


  public ApplicantCreatePaymentSourceActionsResponseReview attemptCnt(Integer attemptCnt) {
    
    
    
    
    this.attemptCnt = attemptCnt;
    return this;
  }

   /**
   * Get attemptCnt
   * @return attemptCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getAttemptCnt() {
    return attemptCnt;
  }


  public void setAttemptCnt(Integer attemptCnt) {
    
    
    
    this.attemptCnt = attemptCnt;
  }


  public ApplicantCreatePaymentSourceActionsResponseReview levelName(String levelName) {
    
    
    
    
    this.levelName = levelName;
    return this;
  }

   /**
   * Get levelName
   * @return levelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "paymentSource", value = "")

  public String getLevelName() {
    return levelName;
  }


  public void setLevelName(String levelName) {
    
    
    
    this.levelName = levelName;
  }


  public ApplicantCreatePaymentSourceActionsResponseReview createDate(String createDate) {
    
    
    
    
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2024-03-07 06:44:24+0000", value = "")

  public String getCreateDate() {
    return createDate;
  }


  public void setCreateDate(String createDate) {
    
    
    
    this.createDate = createDate;
  }


  public ApplicantCreatePaymentSourceActionsResponseReview reviewStatus(String reviewStatus) {
    
    
    
    
    this.reviewStatus = reviewStatus;
    return this;
  }

   /**
   * Get reviewStatus
   * @return reviewStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "init", value = "")

  public String getReviewStatus() {
    return reviewStatus;
  }


  public void setReviewStatus(String reviewStatus) {
    
    
    
    this.reviewStatus = reviewStatus;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ApplicantCreatePaymentSourceActionsResponseReview instance itself
   */
  public ApplicantCreatePaymentSourceActionsResponseReview putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicantCreatePaymentSourceActionsResponseReview applicantCreatePaymentSourceActionsResponseReview = (ApplicantCreatePaymentSourceActionsResponseReview) o;
    return Objects.equals(this.reviewId, applicantCreatePaymentSourceActionsResponseReview.reviewId) &&
        Objects.equals(this.attemptId, applicantCreatePaymentSourceActionsResponseReview.attemptId) &&
        Objects.equals(this.attemptCnt, applicantCreatePaymentSourceActionsResponseReview.attemptCnt) &&
        Objects.equals(this.levelName, applicantCreatePaymentSourceActionsResponseReview.levelName) &&
        Objects.equals(this.createDate, applicantCreatePaymentSourceActionsResponseReview.createDate) &&
        Objects.equals(this.reviewStatus, applicantCreatePaymentSourceActionsResponseReview.reviewStatus)&&
        Objects.equals(this.additionalProperties, applicantCreatePaymentSourceActionsResponseReview.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewId, attemptId, attemptCnt, levelName, createDate, reviewStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantCreatePaymentSourceActionsResponseReview {\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    attemptId: ").append(toIndentedString(attemptId)).append("\n");
    sb.append("    attemptCnt: ").append(toIndentedString(attemptCnt)).append("\n");
    sb.append("    levelName: ").append(toIndentedString(levelName)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("reviewId");
    openapiFields.add("attemptId");
    openapiFields.add("attemptCnt");
    openapiFields.add("levelName");
    openapiFields.add("createDate");
    openapiFields.add("reviewStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicantCreatePaymentSourceActionsResponseReview
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicantCreatePaymentSourceActionsResponseReview.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicantCreatePaymentSourceActionsResponseReview is not found in the empty JSON string", ApplicantCreatePaymentSourceActionsResponseReview.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("reviewId") != null && !jsonObj.get("reviewId").isJsonNull()) && !jsonObj.get("reviewId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reviewId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reviewId").toString()));
      }
      if ((jsonObj.get("attemptId") != null && !jsonObj.get("attemptId").isJsonNull()) && !jsonObj.get("attemptId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attemptId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attemptId").toString()));
      }
      if ((jsonObj.get("levelName") != null && !jsonObj.get("levelName").isJsonNull()) && !jsonObj.get("levelName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `levelName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("levelName").toString()));
      }
      if ((jsonObj.get("createDate") != null && !jsonObj.get("createDate").isJsonNull()) && !jsonObj.get("createDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createDate").toString()));
      }
      if ((jsonObj.get("reviewStatus") != null && !jsonObj.get("reviewStatus").isJsonNull()) && !jsonObj.get("reviewStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reviewStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reviewStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicantCreatePaymentSourceActionsResponseReview.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicantCreatePaymentSourceActionsResponseReview' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicantCreatePaymentSourceActionsResponseReview> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicantCreatePaymentSourceActionsResponseReview.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicantCreatePaymentSourceActionsResponseReview>() {
           @Override
           public void write(JsonWriter out, ApplicantCreatePaymentSourceActionsResponseReview value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicantCreatePaymentSourceActionsResponseReview read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApplicantCreatePaymentSourceActionsResponseReview instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicantCreatePaymentSourceActionsResponseReview given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicantCreatePaymentSourceActionsResponseReview
  * @throws IOException if the JSON string is invalid with respect to ApplicantCreatePaymentSourceActionsResponseReview
  */
  public static ApplicantCreatePaymentSourceActionsResponseReview fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicantCreatePaymentSourceActionsResponseReview.class);
  }

 /**
  * Convert an instance of ApplicantCreatePaymentSourceActionsResponseReview to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


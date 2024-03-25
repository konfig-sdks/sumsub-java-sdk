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
 * ApplicantImportCompletedRequestReviewReview
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApplicantImportCompletedRequestReviewReview {
  public static final String SERIALIZED_NAME_MODERATION_COMMENT = "moderationComment";
  @SerializedName(SERIALIZED_NAME_MODERATION_COMMENT)
  private String moderationComment;

  public static final String SERIALIZED_NAME_CLIENT_COMMENT = "clientComment";
  @SerializedName(SERIALIZED_NAME_CLIENT_COMMENT)
  private String clientComment;

  public static final String SERIALIZED_NAME_REVIEW_ANSWER = "reviewAnswer";
  @SerializedName(SERIALIZED_NAME_REVIEW_ANSWER)
  private String reviewAnswer;

  public static final String SERIALIZED_NAME_REVIEW_REJECT_TYPE = "reviewRejectType";
  @SerializedName(SERIALIZED_NAME_REVIEW_REJECT_TYPE)
  private String reviewRejectType;

  public ApplicantImportCompletedRequestReviewReview() {
  }

  public ApplicantImportCompletedRequestReviewReview moderationComment(String moderationComment) {
    
    
    
    
    this.moderationComment = moderationComment;
    return this;
  }

   /**
   * Reason of rejection for end-user
   * @return moderationComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reason of rejection for end-user")

  public String getModerationComment() {
    return moderationComment;
  }


  public void setModerationComment(String moderationComment) {
    
    
    
    this.moderationComment = moderationComment;
  }


  public ApplicantImportCompletedRequestReviewReview clientComment(String clientComment) {
    
    
    
    
    this.clientComment = clientComment;
    return this;
  }

   /**
   * internal reason of rejection
   * @return clientComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "internal reason of rejection")

  public String getClientComment() {
    return clientComment;
  }


  public void setClientComment(String clientComment) {
    
    
    
    this.clientComment = clientComment;
  }


  public ApplicantImportCompletedRequestReviewReview reviewAnswer(String reviewAnswer) {
    
    
    
    
    this.reviewAnswer = reviewAnswer;
    return this;
  }

   /**
   * \&quot;GREEN\&quot;/\&quot;RED\&quot;
   * @return reviewAnswer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "\"GREEN\"/\"RED\"")

  public String getReviewAnswer() {
    return reviewAnswer;
  }


  public void setReviewAnswer(String reviewAnswer) {
    
    
    
    this.reviewAnswer = reviewAnswer;
  }


  public ApplicantImportCompletedRequestReviewReview reviewRejectType(String reviewRejectType) {
    
    
    
    
    this.reviewRejectType = reviewRejectType;
    return this;
  }

   /**
   * \&quot;FINAL\&quot;/\&quot;RETRY\&quot;(used only when \&quot;reviewAnswer\&quot;&#x3D;\&quot;RED\&quot;)
   * @return reviewRejectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "\"FINAL\"/\"RETRY\"(used only when \"reviewAnswer\"=\"RED\")")

  public String getReviewRejectType() {
    return reviewRejectType;
  }


  public void setReviewRejectType(String reviewRejectType) {
    
    
    
    this.reviewRejectType = reviewRejectType;
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
   * @return the ApplicantImportCompletedRequestReviewReview instance itself
   */
  public ApplicantImportCompletedRequestReviewReview putAdditionalProperty(String key, Object value) {
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
    ApplicantImportCompletedRequestReviewReview applicantImportCompletedRequestReviewReview = (ApplicantImportCompletedRequestReviewReview) o;
    return Objects.equals(this.moderationComment, applicantImportCompletedRequestReviewReview.moderationComment) &&
        Objects.equals(this.clientComment, applicantImportCompletedRequestReviewReview.clientComment) &&
        Objects.equals(this.reviewAnswer, applicantImportCompletedRequestReviewReview.reviewAnswer) &&
        Objects.equals(this.reviewRejectType, applicantImportCompletedRequestReviewReview.reviewRejectType)&&
        Objects.equals(this.additionalProperties, applicantImportCompletedRequestReviewReview.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moderationComment, clientComment, reviewAnswer, reviewRejectType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantImportCompletedRequestReviewReview {\n");
    sb.append("    moderationComment: ").append(toIndentedString(moderationComment)).append("\n");
    sb.append("    clientComment: ").append(toIndentedString(clientComment)).append("\n");
    sb.append("    reviewAnswer: ").append(toIndentedString(reviewAnswer)).append("\n");
    sb.append("    reviewRejectType: ").append(toIndentedString(reviewRejectType)).append("\n");
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
    openapiFields.add("moderationComment");
    openapiFields.add("clientComment");
    openapiFields.add("reviewAnswer");
    openapiFields.add("reviewRejectType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicantImportCompletedRequestReviewReview
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicantImportCompletedRequestReviewReview.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicantImportCompletedRequestReviewReview is not found in the empty JSON string", ApplicantImportCompletedRequestReviewReview.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("moderationComment") != null && !jsonObj.get("moderationComment").isJsonNull()) && !jsonObj.get("moderationComment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `moderationComment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("moderationComment").toString()));
      }
      if ((jsonObj.get("clientComment") != null && !jsonObj.get("clientComment").isJsonNull()) && !jsonObj.get("clientComment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientComment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientComment").toString()));
      }
      if ((jsonObj.get("reviewAnswer") != null && !jsonObj.get("reviewAnswer").isJsonNull()) && !jsonObj.get("reviewAnswer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reviewAnswer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reviewAnswer").toString()));
      }
      if ((jsonObj.get("reviewRejectType") != null && !jsonObj.get("reviewRejectType").isJsonNull()) && !jsonObj.get("reviewRejectType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reviewRejectType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reviewRejectType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicantImportCompletedRequestReviewReview.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicantImportCompletedRequestReviewReview' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicantImportCompletedRequestReviewReview> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicantImportCompletedRequestReviewReview.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicantImportCompletedRequestReviewReview>() {
           @Override
           public void write(JsonWriter out, ApplicantImportCompletedRequestReviewReview value) throws IOException {
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
           public ApplicantImportCompletedRequestReviewReview read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApplicantImportCompletedRequestReviewReview instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApplicantImportCompletedRequestReviewReview given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicantImportCompletedRequestReviewReview
  * @throws IOException if the JSON string is invalid with respect to ApplicantImportCompletedRequestReviewReview
  */
  public static ApplicantImportCompletedRequestReviewReview fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicantImportCompletedRequestReviewReview.class);
  }

 /**
  * Convert an instance of ApplicantImportCompletedRequestReviewReview to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


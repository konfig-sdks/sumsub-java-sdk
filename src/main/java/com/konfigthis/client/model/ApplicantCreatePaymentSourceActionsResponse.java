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
import com.konfigthis.client.model.ApplicantCreatePaymentSourceActionsResponsePaymentSource;
import com.konfigthis.client.model.ApplicantCreatePaymentSourceActionsResponseRequiredIdDocs;
import com.konfigthis.client.model.ApplicantCreatePaymentSourceActionsResponseReview;
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
 * ApplicantCreatePaymentSourceActionsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApplicantCreatePaymentSourceActionsResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION_ID = "externalActionId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION_ID)
  private String externalActionId;

  public static final String SERIALIZED_NAME_APPLICANT_ID = "applicantId";
  @SerializedName(SERIALIZED_NAME_APPLICANT_ID)
  private String applicantId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_REVIEW = "review";
  @SerializedName(SERIALIZED_NAME_REVIEW)
  private ApplicantCreatePaymentSourceActionsResponseReview review;

  public static final String SERIALIZED_NAME_REQUIRED_ID_DOCS = "requiredIdDocs";
  @SerializedName(SERIALIZED_NAME_REQUIRED_ID_DOCS)
  private ApplicantCreatePaymentSourceActionsResponseRequiredIdDocs requiredIdDocs;

  public static final String SERIALIZED_NAME_PAYMENT_SOURCE = "paymentSource";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SOURCE)
  private ApplicantCreatePaymentSourceActionsResponsePaymentSource paymentSource;

  public ApplicantCreatePaymentSourceActionsResponse() {
  }

  public ApplicantCreatePaymentSourceActionsResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "65e9624496bed30142a6d15c", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ApplicantCreatePaymentSourceActionsResponse createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2024-03-07 06:44:24", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public ApplicantCreatePaymentSourceActionsResponse key(String key) {
    
    
    
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SBCJVLAAMRHYAB", value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    
    
    
    this.key = key;
  }


  public ApplicantCreatePaymentSourceActionsResponse clientId(String clientId) {
    
    
    
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "client_id", value = "")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    
    
    
    this.clientId = clientId;
  }


  public ApplicantCreatePaymentSourceActionsResponse externalActionId(String externalActionId) {
    
    
    
    
    this.externalActionId = externalActionId;
    return this;
  }

   /**
   * Get externalActionId
   * @return externalActionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "payment-source-1fbH9AYHn", value = "")

  public String getExternalActionId() {
    return externalActionId;
  }


  public void setExternalActionId(String externalActionId) {
    
    
    
    this.externalActionId = externalActionId;
  }


  public ApplicantCreatePaymentSourceActionsResponse applicantId(String applicantId) {
    
    
    
    
    this.applicantId = applicantId;
    return this;
  }

   /**
   * Get applicantId
   * @return applicantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "65e881a212b4ef468def3bbb", value = "")

  public String getApplicantId() {
    return applicantId;
  }


  public void setApplicantId(String applicantId) {
    
    
    
    this.applicantId = applicantId;
  }


  public ApplicantCreatePaymentSourceActionsResponse type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "paymentMethod", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public ApplicantCreatePaymentSourceActionsResponse review(ApplicantCreatePaymentSourceActionsResponseReview review) {
    
    
    
    
    this.review = review;
    return this;
  }

   /**
   * Get review
   * @return review
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantCreatePaymentSourceActionsResponseReview getReview() {
    return review;
  }


  public void setReview(ApplicantCreatePaymentSourceActionsResponseReview review) {
    
    
    
    this.review = review;
  }


  public ApplicantCreatePaymentSourceActionsResponse requiredIdDocs(ApplicantCreatePaymentSourceActionsResponseRequiredIdDocs requiredIdDocs) {
    
    
    
    
    this.requiredIdDocs = requiredIdDocs;
    return this;
  }

   /**
   * Get requiredIdDocs
   * @return requiredIdDocs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantCreatePaymentSourceActionsResponseRequiredIdDocs getRequiredIdDocs() {
    return requiredIdDocs;
  }


  public void setRequiredIdDocs(ApplicantCreatePaymentSourceActionsResponseRequiredIdDocs requiredIdDocs) {
    
    
    
    this.requiredIdDocs = requiredIdDocs;
  }


  public ApplicantCreatePaymentSourceActionsResponse paymentSource(ApplicantCreatePaymentSourceActionsResponsePaymentSource paymentSource) {
    
    
    
    
    this.paymentSource = paymentSource;
    return this;
  }

   /**
   * Get paymentSource
   * @return paymentSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantCreatePaymentSourceActionsResponsePaymentSource getPaymentSource() {
    return paymentSource;
  }


  public void setPaymentSource(ApplicantCreatePaymentSourceActionsResponsePaymentSource paymentSource) {
    
    
    
    this.paymentSource = paymentSource;
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
   * @return the ApplicantCreatePaymentSourceActionsResponse instance itself
   */
  public ApplicantCreatePaymentSourceActionsResponse putAdditionalProperty(String key, Object value) {
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
    ApplicantCreatePaymentSourceActionsResponse applicantCreatePaymentSourceActionsResponse = (ApplicantCreatePaymentSourceActionsResponse) o;
    return Objects.equals(this.id, applicantCreatePaymentSourceActionsResponse.id) &&
        Objects.equals(this.createdAt, applicantCreatePaymentSourceActionsResponse.createdAt) &&
        Objects.equals(this.key, applicantCreatePaymentSourceActionsResponse.key) &&
        Objects.equals(this.clientId, applicantCreatePaymentSourceActionsResponse.clientId) &&
        Objects.equals(this.externalActionId, applicantCreatePaymentSourceActionsResponse.externalActionId) &&
        Objects.equals(this.applicantId, applicantCreatePaymentSourceActionsResponse.applicantId) &&
        Objects.equals(this.type, applicantCreatePaymentSourceActionsResponse.type) &&
        Objects.equals(this.review, applicantCreatePaymentSourceActionsResponse.review) &&
        Objects.equals(this.requiredIdDocs, applicantCreatePaymentSourceActionsResponse.requiredIdDocs) &&
        Objects.equals(this.paymentSource, applicantCreatePaymentSourceActionsResponse.paymentSource)&&
        Objects.equals(this.additionalProperties, applicantCreatePaymentSourceActionsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, key, clientId, externalActionId, applicantId, type, review, requiredIdDocs, paymentSource, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantCreatePaymentSourceActionsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    externalActionId: ").append(toIndentedString(externalActionId)).append("\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    requiredIdDocs: ").append(toIndentedString(requiredIdDocs)).append("\n");
    sb.append("    paymentSource: ").append(toIndentedString(paymentSource)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("createdAt");
    openapiFields.add("key");
    openapiFields.add("clientId");
    openapiFields.add("externalActionId");
    openapiFields.add("applicantId");
    openapiFields.add("type");
    openapiFields.add("review");
    openapiFields.add("requiredIdDocs");
    openapiFields.add("paymentSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicantCreatePaymentSourceActionsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicantCreatePaymentSourceActionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicantCreatePaymentSourceActionsResponse is not found in the empty JSON string", ApplicantCreatePaymentSourceActionsResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("clientId") != null && !jsonObj.get("clientId").isJsonNull()) && !jsonObj.get("clientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientId").toString()));
      }
      if ((jsonObj.get("externalActionId") != null && !jsonObj.get("externalActionId").isJsonNull()) && !jsonObj.get("externalActionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalActionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalActionId").toString()));
      }
      if ((jsonObj.get("applicantId") != null && !jsonObj.get("applicantId").isJsonNull()) && !jsonObj.get("applicantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicantId").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `review`
      if (jsonObj.get("review") != null && !jsonObj.get("review").isJsonNull()) {
        ApplicantCreatePaymentSourceActionsResponseReview.validateJsonObject(jsonObj.getAsJsonObject("review"));
      }
      // validate the optional field `requiredIdDocs`
      if (jsonObj.get("requiredIdDocs") != null && !jsonObj.get("requiredIdDocs").isJsonNull()) {
        ApplicantCreatePaymentSourceActionsResponseRequiredIdDocs.validateJsonObject(jsonObj.getAsJsonObject("requiredIdDocs"));
      }
      // validate the optional field `paymentSource`
      if (jsonObj.get("paymentSource") != null && !jsonObj.get("paymentSource").isJsonNull()) {
        ApplicantCreatePaymentSourceActionsResponsePaymentSource.validateJsonObject(jsonObj.getAsJsonObject("paymentSource"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicantCreatePaymentSourceActionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicantCreatePaymentSourceActionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicantCreatePaymentSourceActionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicantCreatePaymentSourceActionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicantCreatePaymentSourceActionsResponse>() {
           @Override
           public void write(JsonWriter out, ApplicantCreatePaymentSourceActionsResponse value) throws IOException {
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
           public ApplicantCreatePaymentSourceActionsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApplicantCreatePaymentSourceActionsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApplicantCreatePaymentSourceActionsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicantCreatePaymentSourceActionsResponse
  * @throws IOException if the JSON string is invalid with respect to ApplicantCreatePaymentSourceActionsResponse
  */
  public static ApplicantCreatePaymentSourceActionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicantCreatePaymentSourceActionsResponse.class);
  }

 /**
  * Convert an instance of ApplicantCreatePaymentSourceActionsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


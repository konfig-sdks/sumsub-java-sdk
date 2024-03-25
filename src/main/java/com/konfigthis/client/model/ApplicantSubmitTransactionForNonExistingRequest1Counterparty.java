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
import com.konfigthis.client.model.ApplicantSubmitTransactionDataRequestApplicantAddress;
import com.konfigthis.client.model.ApplicantSubmitTransactionDataRequestApplicantDevice;
import com.konfigthis.client.model.ApplicantSubmitTransactionDataRequestApplicantIdDocsInner;
import com.konfigthis.client.model.ApplicantSubmitTransactionDataRequestApplicantInstitutionInfo;
import com.konfigthis.client.model.ApplicantSubmitTransactionDataRequestApplicantPaymentMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * Transaction participant data (sender or remitter, depending on &#x60;info.direction&#x60;).
 */
@ApiModel(description = "Transaction participant data (sender or remitter, depending on `info.direction`).")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApplicantSubmitTransactionForNonExistingRequest1Counterparty {
  public static final String SERIALIZED_NAME_EXTERNAL_USER_ID = "externalUserId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USER_ID)
  private String externalUserId;

  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = "individual";

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private ApplicantSubmitTransactionDataRequestApplicantAddress address;

  public static final String SERIALIZED_NAME_INSTITUTION_INFO = "institutionInfo";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_INFO)
  private ApplicantSubmitTransactionDataRequestApplicantInstitutionInfo institutionInfo;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private ApplicantSubmitTransactionDataRequestApplicantPaymentMethod paymentMethod;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private ApplicantSubmitTransactionDataRequestApplicantDevice device;

  public static final String SERIALIZED_NAME_ID_DOCS = "idDocs";
  @SerializedName(SERIALIZED_NAME_ID_DOCS)
  private List<ApplicantSubmitTransactionDataRequestApplicantIdDocsInner> idDocs = null;

  public ApplicantSubmitTransactionForNonExistingRequest1Counterparty() {
  }

  public ApplicantSubmitTransactionForNonExistingRequest1Counterparty externalUserId(String externalUserId) {
    
    
    
    
    this.externalUserId = externalUserId;
    return this;
  }

   /**
   * An external identifier of the transaction participant (applicant or counterparty). Each participant must have a unique identifier that must be reused during all subsequent transactions. Make sure to use the same &#x60;externalUserID&#x60; for the same counterparty or applicant.
   * @return externalUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An external identifier of the transaction participant (applicant or counterparty). Each participant must have a unique identifier that must be reused during all subsequent transactions. Make sure to use the same `externalUserID` for the same counterparty or applicant.")

  public String getExternalUserId() {
    return externalUserId;
  }


  public void setExternalUserId(String externalUserId) {
    
    
    
    this.externalUserId = externalUserId;
  }


  public ApplicantSubmitTransactionForNonExistingRequest1Counterparty fullName(String fullName) {
    
    
    
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Full name of the participant.
   * @return fullName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Full name of the participant.")

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    
    
    
    this.fullName = fullName;
  }


  public ApplicantSubmitTransactionForNonExistingRequest1Counterparty type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Participant entity type: &#x60;company&#x60; or &#x60;individual&#x60;. Set to &#x60;individual&#x60; by default.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "individual", required = true, value = "Participant entity type: `company` or `individual`. Set to `individual` by default.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public ApplicantSubmitTransactionForNonExistingRequest1Counterparty address(ApplicantSubmitTransactionDataRequestApplicantAddress address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantSubmitTransactionDataRequestApplicantAddress getAddress() {
    return address;
  }


  public void setAddress(ApplicantSubmitTransactionDataRequestApplicantAddress address) {
    
    
    
    this.address = address;
  }


  public ApplicantSubmitTransactionForNonExistingRequest1Counterparty institutionInfo(ApplicantSubmitTransactionDataRequestApplicantInstitutionInfo institutionInfo) {
    
    
    
    
    this.institutionInfo = institutionInfo;
    return this;
  }

   /**
   * Get institutionInfo
   * @return institutionInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantSubmitTransactionDataRequestApplicantInstitutionInfo getInstitutionInfo() {
    return institutionInfo;
  }


  public void setInstitutionInfo(ApplicantSubmitTransactionDataRequestApplicantInstitutionInfo institutionInfo) {
    
    
    
    this.institutionInfo = institutionInfo;
  }


  public ApplicantSubmitTransactionForNonExistingRequest1Counterparty paymentMethod(ApplicantSubmitTransactionDataRequestApplicantPaymentMethod paymentMethod) {
    
    
    
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantSubmitTransactionDataRequestApplicantPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(ApplicantSubmitTransactionDataRequestApplicantPaymentMethod paymentMethod) {
    
    
    
    this.paymentMethod = paymentMethod;
  }


  public ApplicantSubmitTransactionForNonExistingRequest1Counterparty device(ApplicantSubmitTransactionDataRequestApplicantDevice device) {
    
    
    
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantSubmitTransactionDataRequestApplicantDevice getDevice() {
    return device;
  }


  public void setDevice(ApplicantSubmitTransactionDataRequestApplicantDevice device) {
    
    
    
    this.device = device;
  }


  public ApplicantSubmitTransactionForNonExistingRequest1Counterparty idDocs(List<ApplicantSubmitTransactionDataRequestApplicantIdDocsInner> idDocs) {
    
    
    
    
    this.idDocs = idDocs;
    return this;
  }

  public ApplicantSubmitTransactionForNonExistingRequest1Counterparty addIdDocsItem(ApplicantSubmitTransactionDataRequestApplicantIdDocsInner idDocsItem) {
    if (this.idDocs == null) {
      this.idDocs = new ArrayList<>();
    }
    this.idDocs.add(idDocsItem);
    return this;
  }

   /**
   * Data about the user and their documents.
   * @return idDocs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data about the user and their documents.")

  public List<ApplicantSubmitTransactionDataRequestApplicantIdDocsInner> getIdDocs() {
    return idDocs;
  }


  public void setIdDocs(List<ApplicantSubmitTransactionDataRequestApplicantIdDocsInner> idDocs) {
    
    
    
    this.idDocs = idDocs;
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
   * @return the ApplicantSubmitTransactionForNonExistingRequest1Counterparty instance itself
   */
  public ApplicantSubmitTransactionForNonExistingRequest1Counterparty putAdditionalProperty(String key, Object value) {
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
    ApplicantSubmitTransactionForNonExistingRequest1Counterparty applicantSubmitTransactionForNonExistingRequest1Counterparty = (ApplicantSubmitTransactionForNonExistingRequest1Counterparty) o;
    return Objects.equals(this.externalUserId, applicantSubmitTransactionForNonExistingRequest1Counterparty.externalUserId) &&
        Objects.equals(this.fullName, applicantSubmitTransactionForNonExistingRequest1Counterparty.fullName) &&
        Objects.equals(this.type, applicantSubmitTransactionForNonExistingRequest1Counterparty.type) &&
        Objects.equals(this.address, applicantSubmitTransactionForNonExistingRequest1Counterparty.address) &&
        Objects.equals(this.institutionInfo, applicantSubmitTransactionForNonExistingRequest1Counterparty.institutionInfo) &&
        Objects.equals(this.paymentMethod, applicantSubmitTransactionForNonExistingRequest1Counterparty.paymentMethod) &&
        Objects.equals(this.device, applicantSubmitTransactionForNonExistingRequest1Counterparty.device) &&
        Objects.equals(this.idDocs, applicantSubmitTransactionForNonExistingRequest1Counterparty.idDocs)&&
        Objects.equals(this.additionalProperties, applicantSubmitTransactionForNonExistingRequest1Counterparty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUserId, fullName, type, address, institutionInfo, paymentMethod, device, idDocs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantSubmitTransactionForNonExistingRequest1Counterparty {\n");
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    institutionInfo: ").append(toIndentedString(institutionInfo)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    idDocs: ").append(toIndentedString(idDocs)).append("\n");
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
    openapiFields.add("externalUserId");
    openapiFields.add("fullName");
    openapiFields.add("type");
    openapiFields.add("address");
    openapiFields.add("institutionInfo");
    openapiFields.add("paymentMethod");
    openapiFields.add("device");
    openapiFields.add("idDocs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("externalUserId");
    openapiRequiredFields.add("fullName");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicantSubmitTransactionForNonExistingRequest1Counterparty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicantSubmitTransactionForNonExistingRequest1Counterparty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicantSubmitTransactionForNonExistingRequest1Counterparty is not found in the empty JSON string", ApplicantSubmitTransactionForNonExistingRequest1Counterparty.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicantSubmitTransactionForNonExistingRequest1Counterparty.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("externalUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalUserId").toString()));
      }
      if (!jsonObj.get("fullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullName").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        ApplicantSubmitTransactionDataRequestApplicantAddress.validateJsonObject(jsonObj.getAsJsonObject("address"));
      }
      // validate the optional field `institutionInfo`
      if (jsonObj.get("institutionInfo") != null && !jsonObj.get("institutionInfo").isJsonNull()) {
        ApplicantSubmitTransactionDataRequestApplicantInstitutionInfo.validateJsonObject(jsonObj.getAsJsonObject("institutionInfo"));
      }
      // validate the optional field `paymentMethod`
      if (jsonObj.get("paymentMethod") != null && !jsonObj.get("paymentMethod").isJsonNull()) {
        ApplicantSubmitTransactionDataRequestApplicantPaymentMethod.validateJsonObject(jsonObj.getAsJsonObject("paymentMethod"));
      }
      // validate the optional field `device`
      if (jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()) {
        ApplicantSubmitTransactionDataRequestApplicantDevice.validateJsonObject(jsonObj.getAsJsonObject("device"));
      }
      if (jsonObj.get("idDocs") != null && !jsonObj.get("idDocs").isJsonNull()) {
        JsonArray jsonArrayidDocs = jsonObj.getAsJsonArray("idDocs");
        if (jsonArrayidDocs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("idDocs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `idDocs` to be an array in the JSON string but got `%s`", jsonObj.get("idDocs").toString()));
          }

          // validate the optional field `idDocs` (array)
          for (int i = 0; i < jsonArrayidDocs.size(); i++) {
            ApplicantSubmitTransactionDataRequestApplicantIdDocsInner.validateJsonObject(jsonArrayidDocs.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicantSubmitTransactionForNonExistingRequest1Counterparty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicantSubmitTransactionForNonExistingRequest1Counterparty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicantSubmitTransactionForNonExistingRequest1Counterparty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicantSubmitTransactionForNonExistingRequest1Counterparty.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicantSubmitTransactionForNonExistingRequest1Counterparty>() {
           @Override
           public void write(JsonWriter out, ApplicantSubmitTransactionForNonExistingRequest1Counterparty value) throws IOException {
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
           public ApplicantSubmitTransactionForNonExistingRequest1Counterparty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApplicantSubmitTransactionForNonExistingRequest1Counterparty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApplicantSubmitTransactionForNonExistingRequest1Counterparty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicantSubmitTransactionForNonExistingRequest1Counterparty
  * @throws IOException if the JSON string is invalid with respect to ApplicantSubmitTransactionForNonExistingRequest1Counterparty
  */
  public static ApplicantSubmitTransactionForNonExistingRequest1Counterparty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicantSubmitTransactionForNonExistingRequest1Counterparty.class);
  }

 /**
  * Convert an instance of ApplicantSubmitTransactionForNonExistingRequest1Counterparty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


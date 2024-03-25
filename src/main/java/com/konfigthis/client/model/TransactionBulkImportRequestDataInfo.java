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
 * Transaction information.
 */
@ApiModel(description = "Transaction information.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TransactionBulkImportRequestDataInfo {
  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private String direction;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_AMOUNT_IN_DEFAULT_CURRENCY = "amountInDefaultCurrency";
  @SerializedName(SERIALIZED_NAME_AMOUNT_IN_DEFAULT_CURRENCY)
  private Double amountInDefaultCurrency;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_CRYPTO_CHAIN = "cryptoChain";
  @SerializedName(SERIALIZED_NAME_CRYPTO_CHAIN)
  private String cryptoChain;

  public static final String SERIALIZED_NAME_PAYMENT_TXN_ID = "paymentTxnId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TXN_ID)
  private String paymentTxnId;

  public static final String SERIALIZED_NAME_PAYMENT_DETAILS = "paymentDetails";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DETAILS)
  private String paymentDetails;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public TransactionBulkImportRequestDataInfo() {
  }

  public TransactionBulkImportRequestDataInfo direction(String direction) {
    
    
    
    
    this.direction = direction;
    return this;
  }

   /**
   * Can be &#x60;out&#x60; (applicant sends to counterparty) or &#x60;in&#x60; (counterparty sends to applicant).
   * @return direction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Can be `out` (applicant sends to counterparty) or `in` (counterparty sends to applicant).")

  public String getDirection() {
    return direction;
  }


  public void setDirection(String direction) {
    
    
    
    this.direction = direction;
  }


  public TransactionBulkImportRequestDataInfo amount(Double amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of funds used in this transaction.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The amount of funds used in this transaction.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    
    
    
    this.amount = amount;
  }


  public TransactionBulkImportRequestDataInfo amountInDefaultCurrency(Double amountInDefaultCurrency) {
    
    
    
    
    this.amountInDefaultCurrency = amountInDefaultCurrency;
    return this;
  }

   /**
   * The amount of funds used in this transaction in the default currency. For more precise calculations, you can submit already converted default currency amount in this field.
   * @return amountInDefaultCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of funds used in this transaction in the default currency. For more precise calculations, you can submit already converted default currency amount in this field.")

  public Double getAmountInDefaultCurrency() {
    return amountInDefaultCurrency;
  }


  public void setAmountInDefaultCurrency(Double amountInDefaultCurrency) {
    
    
    
    this.amountInDefaultCurrency = amountInDefaultCurrency;
  }


  public TransactionBulkImportRequestDataInfo currencyCode(String currencyCode) {
    
    
    
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Currency code (&#x60;USD&#x60;, &#x60;GBP&#x60;, &#x60;BTC&#x60;, etc).
   * @return currencyCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Currency code (`USD`, `GBP`, `BTC`, etc).")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    
    
    
    this.currencyCode = currencyCode;
  }


  public TransactionBulkImportRequestDataInfo cryptoChain(String cryptoChain) {
    
    
    
    
    this.cryptoChain = cryptoChain;
    return this;
  }

   /**
   * The crypto chain name. Mandatory for crypto tokens only. Specifies the network name to which the token at &#x60;currencyCode&#x60; belongs. Empty for native tokens (e.g. for &#x60;BTC&#x60;, &#x60;ETH&#x60;). For more information, see [chain codes](ref:crypto-chain-codes).
   * @return cryptoChain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The crypto chain name. Mandatory for crypto tokens only. Specifies the network name to which the token at `currencyCode` belongs. Empty for native tokens (e.g. for `BTC`, `ETH`). For more information, see [chain codes](ref:crypto-chain-codes).")

  public String getCryptoChain() {
    return cryptoChain;
  }


  public void setCryptoChain(String cryptoChain) {
    
    
    
    this.cryptoChain = cryptoChain;
  }


  public TransactionBulkImportRequestDataInfo paymentTxnId(String paymentTxnId) {
    
    
    
    
    this.paymentTxnId = paymentTxnId;
    return this;
  }

   /**
   * Crypto transaction ID from the blockchain. Required for crypto check requests only.
   * @return paymentTxnId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Crypto transaction ID from the blockchain. Required for crypto check requests only.")

  public String getPaymentTxnId() {
    return paymentTxnId;
  }


  public void setPaymentTxnId(String paymentTxnId) {
    
    
    
    this.paymentTxnId = paymentTxnId;
  }


  public TransactionBulkImportRequestDataInfo paymentDetails(String paymentDetails) {
    
    
    
    
    this.paymentDetails = paymentDetails;
    return this;
  }

   /**
   * A comment with payment details.
   * @return paymentDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comment with payment details.")

  public String getPaymentDetails() {
    return paymentDetails;
  }


  public void setPaymentDetails(String paymentDetails) {
    
    
    
    this.paymentDetails = paymentDetails;
  }


  public TransactionBulkImportRequestDataInfo type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Accepts any value that helps you categorize transactions. For example, for gambling transactions, you can specify &#x60;bonus&#x60;, &#x60;payroll&#x60;, or &#x60;cashback&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Accepts any value that helps you categorize transactions. For example, for gambling transactions, you can specify `bonus`, `payroll`, or `cashback`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
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
   * @return the TransactionBulkImportRequestDataInfo instance itself
   */
  public TransactionBulkImportRequestDataInfo putAdditionalProperty(String key, Object value) {
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
    TransactionBulkImportRequestDataInfo transactionBulkImportRequestDataInfo = (TransactionBulkImportRequestDataInfo) o;
    return Objects.equals(this.direction, transactionBulkImportRequestDataInfo.direction) &&
        Objects.equals(this.amount, transactionBulkImportRequestDataInfo.amount) &&
        Objects.equals(this.amountInDefaultCurrency, transactionBulkImportRequestDataInfo.amountInDefaultCurrency) &&
        Objects.equals(this.currencyCode, transactionBulkImportRequestDataInfo.currencyCode) &&
        Objects.equals(this.cryptoChain, transactionBulkImportRequestDataInfo.cryptoChain) &&
        Objects.equals(this.paymentTxnId, transactionBulkImportRequestDataInfo.paymentTxnId) &&
        Objects.equals(this.paymentDetails, transactionBulkImportRequestDataInfo.paymentDetails) &&
        Objects.equals(this.type, transactionBulkImportRequestDataInfo.type)&&
        Objects.equals(this.additionalProperties, transactionBulkImportRequestDataInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, amount, amountInDefaultCurrency, currencyCode, cryptoChain, paymentTxnId, paymentDetails, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionBulkImportRequestDataInfo {\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountInDefaultCurrency: ").append(toIndentedString(amountInDefaultCurrency)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    cryptoChain: ").append(toIndentedString(cryptoChain)).append("\n");
    sb.append("    paymentTxnId: ").append(toIndentedString(paymentTxnId)).append("\n");
    sb.append("    paymentDetails: ").append(toIndentedString(paymentDetails)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("direction");
    openapiFields.add("amount");
    openapiFields.add("amountInDefaultCurrency");
    openapiFields.add("currencyCode");
    openapiFields.add("cryptoChain");
    openapiFields.add("paymentTxnId");
    openapiFields.add("paymentDetails");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("direction");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currencyCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionBulkImportRequestDataInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransactionBulkImportRequestDataInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionBulkImportRequestDataInfo is not found in the empty JSON string", TransactionBulkImportRequestDataInfo.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionBulkImportRequestDataInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
      if (!jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("cryptoChain") != null && !jsonObj.get("cryptoChain").isJsonNull()) && !jsonObj.get("cryptoChain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cryptoChain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cryptoChain").toString()));
      }
      if ((jsonObj.get("paymentTxnId") != null && !jsonObj.get("paymentTxnId").isJsonNull()) && !jsonObj.get("paymentTxnId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentTxnId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentTxnId").toString()));
      }
      if ((jsonObj.get("paymentDetails") != null && !jsonObj.get("paymentDetails").isJsonNull()) && !jsonObj.get("paymentDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentDetails").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionBulkImportRequestDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionBulkImportRequestDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionBulkImportRequestDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionBulkImportRequestDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionBulkImportRequestDataInfo>() {
           @Override
           public void write(JsonWriter out, TransactionBulkImportRequestDataInfo value) throws IOException {
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
           public TransactionBulkImportRequestDataInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TransactionBulkImportRequestDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionBulkImportRequestDataInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionBulkImportRequestDataInfo
  * @throws IOException if the JSON string is invalid with respect to TransactionBulkImportRequestDataInfo
  */
  public static TransactionBulkImportRequestDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionBulkImportRequestDataInfo.class);
  }

 /**
  * Convert an instance of TransactionBulkImportRequestDataInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


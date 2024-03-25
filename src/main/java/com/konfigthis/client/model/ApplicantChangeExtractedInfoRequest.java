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
 * ApplicantChangeExtractedInfoRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApplicantChangeExtractedInfoRequest {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legalName";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob;

  public static final String SERIALIZED_NAME_PLACE_OF_BIRTH = "placeOfBirth";
  @SerializedName(SERIALIZED_NAME_PLACE_OF_BIRTH)
  private String placeOfBirth;

  public static final String SERIALIZED_NAME_COUNTRY_OF_BIRTH = "countryOfBirth";
  @SerializedName(SERIALIZED_NAME_COUNTRY_OF_BIRTH)
  private String countryOfBirth;

  public static final String SERIALIZED_NAME_STATE_OF_BIRTH = "stateOfBirth";
  @SerializedName(SERIALIZED_NAME_STATE_OF_BIRTH)
  private String stateOfBirth;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private String addresses;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public ApplicantChangeExtractedInfoRequest() {
  }

  public ApplicantChangeExtractedInfoRequest firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the applicant.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first name of the applicant.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public ApplicantChangeExtractedInfoRequest lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the applicant.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last name of the applicant.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public ApplicantChangeExtractedInfoRequest middleName(String middleName) {
    
    
    
    
    this.middleName = middleName;
    return this;
  }

   /**
   * The middle name of the applicant.
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The middle name of the applicant.")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    
    
    
    this.middleName = middleName;
  }


  public ApplicantChangeExtractedInfoRequest legalName(String legalName) {
    
    
    
    
    this.legalName = legalName;
    return this;
  }

   /**
   * Legal name.
   * @return legalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Legal name.")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    
    
    
    this.legalName = legalName;
  }


  public ApplicantChangeExtractedInfoRequest gender(String gender) {
    
    
    
    
    this.gender = gender;
    return this;
  }

   /**
   * An applicant gender (&#x60;M&#x60; or &#x60;F&#x60;).
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An applicant gender (`M` or `F`).")

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    
    
    
    this.gender = gender;
  }


  public ApplicantChangeExtractedInfoRequest dob(String dob) {
    
    
    
    
    this.dob = dob;
    return this;
  }

   /**
   * Applicant date of birth (format &#x60;YYYY-mm-dd&#x60;, e.g. 2001-09-25).
   * @return dob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applicant date of birth (format `YYYY-mm-dd`, e.g. 2001-09-25).")

  public String getDob() {
    return dob;
  }


  public void setDob(String dob) {
    
    
    
    this.dob = dob;
  }


  public ApplicantChangeExtractedInfoRequest placeOfBirth(String placeOfBirth) {
    
    
    
    
    this.placeOfBirth = placeOfBirth;
    return this;
  }

   /**
   * The applicant birthplace.
   * @return placeOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The applicant birthplace.")

  public String getPlaceOfBirth() {
    return placeOfBirth;
  }


  public void setPlaceOfBirth(String placeOfBirth) {
    
    
    
    this.placeOfBirth = placeOfBirth;
  }


  public ApplicantChangeExtractedInfoRequest countryOfBirth(String countryOfBirth) {
    
    
    
    
    this.countryOfBirth = countryOfBirth;
    return this;
  }

   /**
   * Applicant country of birth.
   * @return countryOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applicant country of birth.")

  public String getCountryOfBirth() {
    return countryOfBirth;
  }


  public void setCountryOfBirth(String countryOfBirth) {
    
    
    
    this.countryOfBirth = countryOfBirth;
  }


  public ApplicantChangeExtractedInfoRequest stateOfBirth(String stateOfBirth) {
    
    
    
    
    this.stateOfBirth = stateOfBirth;
    return this;
  }

   /**
   * Applicant state of birth.
   * @return stateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applicant state of birth.")

  public String getStateOfBirth() {
    return stateOfBirth;
  }


  public void setStateOfBirth(String stateOfBirth) {
    
    
    
    this.stateOfBirth = stateOfBirth;
  }


  public ApplicantChangeExtractedInfoRequest country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Alpha-3 country code (e.g. &#x60;DEU&#x60; or &#x60;GBR&#x60;).
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Alpha-3 country code (e.g. `DEU` or `GBR`).")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public ApplicantChangeExtractedInfoRequest nationality(String nationality) {
    
    
    
    
    this.nationality = nationality;
    return this;
  }

   /**
   * Alpha-3 country code.
   * @return nationality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Alpha-3 country code.")

  public String getNationality() {
    return nationality;
  }


  public void setNationality(String nationality) {
    
    
    
    this.nationality = nationality;
  }


  public ApplicantChangeExtractedInfoRequest addresses(String addresses) {
    
    
    
    
    this.addresses = addresses;
    return this;
  }

   /**
   * List of applicant addresses.
   * @return addresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of applicant addresses.")

  public String getAddresses() {
    return addresses;
  }


  public void setAddresses(String addresses) {
    
    
    
    this.addresses = addresses;
  }


  public ApplicantChangeExtractedInfoRequest tin(String tin) {
    
    
    
    
    this.tin = tin;
    return this;
  }

   /**
   * Tax identification number.
   * @return tin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax identification number.")

  public String getTin() {
    return tin;
  }


  public void setTin(String tin) {
    
    
    
    this.tin = tin;
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
   * @return the ApplicantChangeExtractedInfoRequest instance itself
   */
  public ApplicantChangeExtractedInfoRequest putAdditionalProperty(String key, Object value) {
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
    ApplicantChangeExtractedInfoRequest applicantChangeExtractedInfoRequest = (ApplicantChangeExtractedInfoRequest) o;
    return Objects.equals(this.firstName, applicantChangeExtractedInfoRequest.firstName) &&
        Objects.equals(this.lastName, applicantChangeExtractedInfoRequest.lastName) &&
        Objects.equals(this.middleName, applicantChangeExtractedInfoRequest.middleName) &&
        Objects.equals(this.legalName, applicantChangeExtractedInfoRequest.legalName) &&
        Objects.equals(this.gender, applicantChangeExtractedInfoRequest.gender) &&
        Objects.equals(this.dob, applicantChangeExtractedInfoRequest.dob) &&
        Objects.equals(this.placeOfBirth, applicantChangeExtractedInfoRequest.placeOfBirth) &&
        Objects.equals(this.countryOfBirth, applicantChangeExtractedInfoRequest.countryOfBirth) &&
        Objects.equals(this.stateOfBirth, applicantChangeExtractedInfoRequest.stateOfBirth) &&
        Objects.equals(this.country, applicantChangeExtractedInfoRequest.country) &&
        Objects.equals(this.nationality, applicantChangeExtractedInfoRequest.nationality) &&
        Objects.equals(this.addresses, applicantChangeExtractedInfoRequest.addresses) &&
        Objects.equals(this.tin, applicantChangeExtractedInfoRequest.tin)&&
        Objects.equals(this.additionalProperties, applicantChangeExtractedInfoRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, middleName, legalName, gender, dob, placeOfBirth, countryOfBirth, stateOfBirth, country, nationality, addresses, tin, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantChangeExtractedInfoRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
    sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
    sb.append("    stateOfBirth: ").append(toIndentedString(stateOfBirth)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("middleName");
    openapiFields.add("legalName");
    openapiFields.add("gender");
    openapiFields.add("dob");
    openapiFields.add("placeOfBirth");
    openapiFields.add("countryOfBirth");
    openapiFields.add("stateOfBirth");
    openapiFields.add("country");
    openapiFields.add("nationality");
    openapiFields.add("addresses");
    openapiFields.add("tin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicantChangeExtractedInfoRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicantChangeExtractedInfoRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicantChangeExtractedInfoRequest is not found in the empty JSON string", ApplicantChangeExtractedInfoRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("middleName") != null && !jsonObj.get("middleName").isJsonNull()) && !jsonObj.get("middleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middleName").toString()));
      }
      if ((jsonObj.get("legalName") != null && !jsonObj.get("legalName").isJsonNull()) && !jsonObj.get("legalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalName").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("placeOfBirth") != null && !jsonObj.get("placeOfBirth").isJsonNull()) && !jsonObj.get("placeOfBirth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placeOfBirth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placeOfBirth").toString()));
      }
      if ((jsonObj.get("countryOfBirth") != null && !jsonObj.get("countryOfBirth").isJsonNull()) && !jsonObj.get("countryOfBirth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryOfBirth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryOfBirth").toString()));
      }
      if ((jsonObj.get("stateOfBirth") != null && !jsonObj.get("stateOfBirth").isJsonNull()) && !jsonObj.get("stateOfBirth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateOfBirth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateOfBirth").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      if ((jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonNull()) && !jsonObj.get("addresses").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }
      if ((jsonObj.get("tin") != null && !jsonObj.get("tin").isJsonNull()) && !jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicantChangeExtractedInfoRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicantChangeExtractedInfoRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicantChangeExtractedInfoRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicantChangeExtractedInfoRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicantChangeExtractedInfoRequest>() {
           @Override
           public void write(JsonWriter out, ApplicantChangeExtractedInfoRequest value) throws IOException {
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
           public ApplicantChangeExtractedInfoRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApplicantChangeExtractedInfoRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApplicantChangeExtractedInfoRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicantChangeExtractedInfoRequest
  * @throws IOException if the JSON string is invalid with respect to ApplicantChangeExtractedInfoRequest
  */
  public static ApplicantChangeExtractedInfoRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicantChangeExtractedInfoRequest.class);
  }

 /**
  * Convert an instance of ApplicantChangeExtractedInfoRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


# ApplicantApi

All URIs are relative to *https://api.sumsub.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBeneficiary**](ApplicantApi.md#addBeneficiary) | **POST** /resources/applicants/{applicantId}/info/companyInfo/beneficiaries | Add applicant as beneficiary |
| [**addConsentToProfile**](ApplicantApi.md#addConsentToProfile) | **POST** /resources/applicants/{applicantId}/agreement | Add applicant consent |
| [**addCustomTags**](ApplicantApi.md#addCustomTags) | **POST** /resources/applicants/{applicantId}/tags/add | Add custom applicant tags |
| [**addCustomTags_0**](ApplicantApi.md#addCustomTags_0) | **POST** /resources/applicants/{applicantId}/tags | Add and overwrite custom applicant tags |
| [**addIdDocument**](ApplicantApi.md#addIdDocument) | **POST** /resources/applicants/{applicantId}/info/idDoc | Add ID document |
| [**addImageToPaymentMethod**](ApplicantApi.md#addImageToPaymentMethod) | **POST** /resources/applicantActions/{actionId}/images | Add image to payment method |
| [**addPaymentMethodInformation**](ApplicantApi.md#addPaymentMethodInformation) | **POST** /resources/applicantActions/{actionId}/paymentMethod | Add payment method information |
| [**addToBlocklist**](ApplicantApi.md#addToBlocklist) | **POST** /resources/applicants/{applicantId}/blacklist?note&#x3D;{note} | Add applicant to blocklist |
| [**changeCompanyData**](ApplicantApi.md#changeCompanyData) | **PATCH** /resources/applicants/{applicantId}/info/companyInfo | Change company data |
| [**changeExtractedInfo**](ApplicantApi.md#changeExtractedInfo) | **PATCH** /resources/applicants/{applicantId}/info | Change information extracted by Sumsub |
| [**changeRequiredDocumentSet**](ApplicantApi.md#changeRequiredDocumentSet) | **POST** /resources/applicants/{applicantId}/moveToLevel | Change required document set |
| [**clarifyRejectionReason**](ApplicantApi.md#clarifyRejectionReason) | **GET** /resources/moderationStates/-;applicantId&#x3D;{applicantId} | Clarify rejection reason |
| [**confirmData**](ApplicantApi.md#confirmData) | **POST** /resources/applicants/{applicantId}/ekyc/confirm/{confirmationid} | Confirm applicant data |
| [**createAction**](ApplicantApi.md#createAction) | **POST** /resources/applicantActions/-/forApplicant/{applicantId}?levelName&#x3D;{levelName} | Create applicant action |
| [**createCryptoSourceOfFunds**](ApplicantApi.md#createCryptoSourceOfFunds) | **POST** /resources/applicantActions/-/forApplicant/{applicantId}/cryptoSourceOfFunds | Submission |
| [**createPaymentSourceActions**](ApplicantApi.md#createPaymentSourceActions) | **POST** /resources/applicantActions/-/forApplicant/{applicantId}/?levelName&#x3D;paymentSource | Create payment source actions |
| [**deactivateProfile**](ApplicantApi.md#deactivateProfile) | **PATCH** /resources/applicants/{applicantId}/presence/{status} | Deactivate applicant profile |
| [**enrichTransactionWithTravelRuleData**](ApplicantApi.md#enrichTransactionWithTravelRuleData) | **PATCH** /resources/kyt/txns/{txnId}/data/applicant | Enriching transaction with Travel Rule |
| [**getActionOneInfo**](ApplicantApi.md#getActionOneInfo) | **GET** /resources/applicantActions/{actionId}/one | Get action information |
| [**getActions**](ApplicantApi.md#getActions) | **GET** /resources/applicantActions/-;applicantId&#x3D;{applicantId} | Get applicant actions |
| [**getBankCardImage**](ApplicantApi.md#getBankCardImage) | **GET** /resources/applicantActions/{actionId}/images/{imageId}?preview&#x3D;{isPreview} | Get bank card image |
| [**getData**](ApplicantApi.md#getData) | **GET** /resources/applicants/{applicantId}/one | Get applicant data |
| [**getDataByExternalUserId**](ApplicantApi.md#getDataByExternalUserId) | **GET** /resources/applicants/-;externalUserId&#x3D;{externalUserId}/one | Get applicant data (externalUserId) |
| [**getDataLatest**](ApplicantApi.md#getDataLatest) | **GET** /resources/checks/latest | Get applicant data |
| [**getFraudNetworkById**](ApplicantApi.md#getFraudNetworkById) | **GET** /resources/applicantFraudNetworks/{networkId}/one | Get fraud network by ID |
| [**getFraudNetworks**](ApplicantApi.md#getFraudNetworks) | **GET** /resources/applicantFraudNetworks | Get fraud networks |
| [**getFraudNetworksByApplicant**](ApplicantApi.md#getFraudNetworksByApplicant) | **GET** /resources/applicantFraudNetworks/-/byApplicant/{applicantId} | Get applicant fraud networks |
| [**getLevels**](ApplicantApi.md#getLevels) | **GET** /resources/applicants/-/levels | Get available applicant levels |
| [**getRequiredIdDocs**](ApplicantApi.md#getRequiredIdDocs) | **POST** /resources/applicants/{applicantId}/requiredIdDocs | Get required ID documents |
| [**getReviewStatus**](ApplicantApi.md#getReviewStatus) | **GET** /resources/applicants/{applicantId}/status | Get applicant review status |
| [**getVerificationStepsStatus**](ApplicantApi.md#getVerificationStepsStatus) | **GET** /resources/applicants/{applicantId}/requiredIdDocsStatus | Get applicant verification steps status |
| [**getVideoCallMedia**](ApplicantApi.md#getVideoCallMedia) | **GET** /resources/videoIdent/applicant/{applicantId}/media/{compositionMediaId} | Get video call media |
| [**importByArchive**](ApplicantApi.md#importByArchive) | **POST** /resources/applicants/-/applicantImport | Import applicant with images by archive |
| [**importCompleted**](ApplicantApi.md#importCompleted) | **POST** /resources/applicants/-/ingestCompleted?levelName&#x3D;{levelName} | Import applicants |
| [**initiateApplicantCheck**](ApplicantApi.md#initiateApplicantCheck) | **POST** /resources/applicants/{applicantId}/status/pending?reason&#x3D;{reason} | Request applicant check |
| [**moveTransactionToAnotherApplicant**](ApplicantApi.md#moveTransactionToAnotherApplicant) | **POST** /resources/kyt/txns/{txnId}/applicantId/{applicantId} | Move transaction to another applicant |
| [**removeCustomTags**](ApplicantApi.md#removeCustomTags) | **DELETE** /resources/applicants/{applicantId}/tags | Remove custom applicant tags |
| [**removeFromBeneficiaryList**](ApplicantApi.md#removeFromBeneficiaryList) | **DELETE** /resources/applicants/{applicantId}/info/companyInfo/beneficiaries/{beneficiaryApplicantId} | Remove applicant from beneficiary list |
| [**requestActionCheck**](ApplicantApi.md#requestActionCheck) | **POST** /resources/applicantActions/{actionId}/review/status/pending | Request action check |
| [**resetProfile**](ApplicantApi.md#resetProfile) | **POST** /resources/applicants/{applicantId}/reset | Reset applicant profile |
| [**resetVerificationStep**](ApplicantApi.md#resetVerificationStep) | **POST** /resources/applicants/{applicantId}/resetStep/{idDocSetType} | Reset verification step |
| [**sandboxVerificationResponse**](ApplicantApi.md#sandboxVerificationResponse) | **POST** /resources/applicants/{applicantId}/status/testCompleted | Set review for applicant in sandbox |
| [**submitDataNoDocVerification**](ApplicantApi.md#submitDataNoDocVerification) | **POST** /resources/applicants/{applicantId}/ekyc/submit | Submit applicant data |
| [**submitPaymentMethod**](ApplicantApi.md#submitPaymentMethod) | **POST** /resources/applicantActions/-/forApplicant/{applicantId}/paymentMethod | Submission |
| [**submitTransactionData**](ApplicantApi.md#submitTransactionData) | **POST** /resources/applicants/{applicantId}/kyt/txns/-/data | Submit transaction for existing applicant |
| [**submitTransactionForNonExisting**](ApplicantApi.md#submitTransactionForNonExisting) | **POST** /resources/applicants/-/kyt/txns/-/data | Submit transaction for non-existing applicant |
| [**updateFixedInfo**](ApplicantApi.md#updateFixedInfo) | **PATCH** /resources/applicants/{applicantId}/fixedInfo | Change provided information |
| [**updateTopLevelInfo**](ApplicantApi.md#updateTopLevelInfo) | **PATCH** /resources/applicants | Change top-level information |


<a name="addBeneficiary"></a>
# **addBeneficiary**
> addBeneficiary(applicantId).applicantAddBeneficiaryRequest(applicantAddBeneficiaryRequest).execute();

Add applicant as beneficiary

Adds an existing individual applicant as a beneficiary.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    ApplicantAddBeneficiaryRequestApplicant applicant = new ApplicantAddBeneficiaryRequestApplicant();
    String applicantId = "applicantId_example"; // Beneficiary applicant identified.
    String type = "type_example"; // Type of beneficiary: `ubo`, `shareholder`, `representative`.
    String applicantId = "applicantId_example"; // A unique company applicant identifier.
    List<String> positions = Arrays.asList(); // The list of positions in the company (`[\\\"director\\\", \\\"shareholder\\\", \\\"other\\\"]`).
    try {
      client
              .applicant
              .addBeneficiary(applicant, applicantId, type, applicantId)
              .positions(positions)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addBeneficiary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .addBeneficiary(applicant, applicantId, type, applicantId)
              .positions(positions)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addBeneficiary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique company applicant identifier. | |
| **applicantAddBeneficiaryRequest** | [**ApplicantAddBeneficiaryRequest**](ApplicantAddBeneficiaryRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addConsentToProfile"></a>
# **addConsentToProfile**
> addConsentToProfile(applicantId).applicantAddConsentToProfileRequest(applicantAddConsentToProfileRequest).execute();

Add applicant consent

Adds a consent to an applicant profile.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    List<ApplicantAddConsentToProfileRequestRecordsInner> records = Arrays.asList(); // An array of applicant consents.
    String applicantId = "applicantId_example"; // A unique identifier of an applicant profile to which a consent should be added.
    String acceptedAt = "acceptedAt_example"; // Date and time a consent was accepted by the applicant.
    String residenceCountry = "residenceCountry_example"; // An applicant country of residence.
    try {
      client
              .applicant
              .addConsentToProfile(records, applicantId)
              .acceptedAt(acceptedAt)
              .residenceCountry(residenceCountry)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addConsentToProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .addConsentToProfile(records, applicantId)
              .acceptedAt(acceptedAt)
              .residenceCountry(residenceCountry)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addConsentToProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique identifier of an applicant profile to which a consent should be added. | |
| **applicantAddConsentToProfileRequest** | [**ApplicantAddConsentToProfileRequest**](ApplicantAddConsentToProfileRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addCustomTags"></a>
# **addCustomTags**
> addCustomTags(applicantId).applicantAddCustomTagsRequest(applicantAddCustomTagsRequest).execute();

Add custom applicant tags

Adds custom tags to applicant profiles.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    List<String> RAW_BODY = Arrays.asList();
    try {
      client
              .applicant
              .addCustomTags(applicantId)
              .RAW_BODY(RAW_BODY)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addCustomTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .addCustomTags(applicantId)
              .RAW_BODY(RAW_BODY)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addCustomTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **applicantAddCustomTagsRequest** | [**ApplicantAddCustomTagsRequest**](ApplicantAddCustomTagsRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addCustomTags_0"></a>
# **addCustomTags_0**
> addCustomTags_0(applicantId).applicantAddCustomTagsRequest2(applicantAddCustomTagsRequest2).execute();

Add and overwrite custom applicant tags

Adds and overwrites custom tags in applicant profiles.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    List<String> RAW_BODY = Arrays.asList();
    try {
      client
              .applicant
              .addCustomTags_0(applicantId)
              .RAW_BODY(RAW_BODY)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addCustomTags_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .addCustomTags_0(applicantId)
              .RAW_BODY(RAW_BODY)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addCustomTags_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **applicantAddCustomTagsRequest2** | [**ApplicantAddCustomTagsRequest2**](ApplicantAddCustomTagsRequest2.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addIdDocument"></a>
# **addIdDocument**
> ApplicantAddIdDocumentResponse addIdDocument(xReturnDocWarnings, applicantId).applicantAddIdDocumentRequest(applicantAddIdDocumentRequest).execute();

Add ID document

Adds an identification document to be verified.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    Boolean xReturnDocWarnings = true; // `true` / `false`
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    ApplicantAddIdDocumentRequestMetadata metadata = new ApplicantAddIdDocumentRequestMetadata();
    File content = new File("/path/to/file"); // A photo of the document.
    try {
      ApplicantAddIdDocumentResponse result = client
              .applicant
              .addIdDocument(xReturnDocWarnings, applicantId)
              .metadata(metadata)
              .content(content)
              .execute();
      System.out.println(result);
      System.out.println(result.getIdDocType());
      System.out.println(result.getCountry());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addIdDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicantAddIdDocumentResponse> response = client
              .applicant
              .addIdDocument(xReturnDocWarnings, applicantId)
              .metadata(metadata)
              .content(content)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addIdDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xReturnDocWarnings** | **Boolean**| &#x60;true&#x60; / &#x60;false&#x60; | |
| **applicantId** | **String**| A unique applicant identifier. | |
| **applicantAddIdDocumentRequest** | [**ApplicantAddIdDocumentRequest**](ApplicantAddIdDocumentRequest.md)|  | [optional] |

### Return type

[**ApplicantAddIdDocumentResponse**](ApplicantAddIdDocumentResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="addImageToPaymentMethod"></a>
# **addImageToPaymentMethod**
> addImageToPaymentMethod(actionId).applicantAddImageToPaymentMethodRequest(applicantAddImageToPaymentMethodRequest).execute();

Add image to payment method

Adds an image to the payment method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    File content = new File("/path/to/file"); // A document photo.
    ApplicantAddImageToPaymentMethodRequestMetadata metadata = new ApplicantAddImageToPaymentMethodRequestMetadata();
    String actionId = "actionId_example"; // A unique applicant action identifier.
    try {
      client
              .applicant
              .addImageToPaymentMethod(content, metadata, actionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addImageToPaymentMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .addImageToPaymentMethod(content, metadata, actionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addImageToPaymentMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **actionId** | **String**| A unique applicant action identifier. | |
| **applicantAddImageToPaymentMethodRequest** | [**ApplicantAddImageToPaymentMethodRequest**](ApplicantAddImageToPaymentMethodRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addPaymentMethodInformation"></a>
# **addPaymentMethodInformation**
> addPaymentMethodInformation(actionId).applicantAddPaymentMethodInformationRequest(applicantAddPaymentMethodInformationRequest).execute();

Add payment method information

Adds additional information to the payment method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String type = "type_example"; // A payment type. Can be: `bankCard`, `eWallet`, `wireTransfer`.
    String actionId = "actionId_example"; // A unique applicant action identifier.
    String subType = "subType_example"; // A payment subtype. For example, `VISA`, `MASTERCARD`, etc.
    ApplicantCreateActionRequestPaymentMethodData data = new ApplicantCreateActionRequestPaymentMethodData();
    try {
      client
              .applicant
              .addPaymentMethodInformation(type, actionId)
              .subType(subType)
              .data(data)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addPaymentMethodInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .addPaymentMethodInformation(type, actionId)
              .subType(subType)
              .data(data)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addPaymentMethodInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **actionId** | **String**| A unique applicant action identifier. | |
| **applicantAddPaymentMethodInformationRequest** | [**ApplicantAddPaymentMethodInformationRequest**](ApplicantAddPaymentMethodInformationRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addToBlocklist"></a>
# **addToBlocklist**
> addToBlocklist(note, applicantId).execute();

Add applicant to blocklist

Add an applicant to blocklist.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String note = "note_example"; // A note indicating the reason for blocklisting the applicant profile.
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .applicant
              .addToBlocklist(note, applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addToBlocklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .addToBlocklist(note, applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#addToBlocklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **note** | **String**| A note indicating the reason for blocklisting the applicant profile. | |
| **applicantId** | **String**| A unique applicant identifier. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="changeCompanyData"></a>
# **changeCompanyData**
> changeCompanyData(applicantId).applicantChangeCompanyDataRequest(applicantChangeCompanyDataRequest).execute();

Change company data

Changes company data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String companyName = "companyName_example"; // Name of the company.
    String registrationNumber = "registrationNumber_example"; // Registration number.
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    String country = "country_example"; // A three-letter country code (e.g. `DEU`).
    String legalAddress = "legalAddress_example"; // Legal name.
    String incorporatedOn = "incorporatedOn_example"; // Date of incorporation (format `YYYY-mm-dd`, e.g. 2001-09-25).
    String type = "type_example"; // Type of entity.
    String email = "email_example"; // Email address.
    String controlScheme = "controlScheme_example"; // Description of the control scheme of the group of entities.
    String phone = "phone_example"; // Phone number.
    String taxId = "taxId_example"; // Taxpayer registration number/Code of taxpayer registration.
    String registrationLocation = "registrationLocation_example"; // Location of registration.
    String website = "website_example"; // Website's URL.
    String postalAddress = "postalAddress_example"; // Postal address.
    List<String> beneficiaries = Arrays.asList(); // Contains applicantIds of beneficiaries and additional info like position and type.
    List<String> addresses = Arrays.asList(); // List of addresses.
    try {
      client
              .applicant
              .changeCompanyData(companyName, registrationNumber, applicantId)
              .country(country)
              .legalAddress(legalAddress)
              .incorporatedOn(incorporatedOn)
              .type(type)
              .email(email)
              .controlScheme(controlScheme)
              .phone(phone)
              .taxId(taxId)
              .registrationLocation(registrationLocation)
              .website(website)
              .postalAddress(postalAddress)
              .beneficiaries(beneficiaries)
              .addresses(addresses)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#changeCompanyData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .changeCompanyData(companyName, registrationNumber, applicantId)
              .country(country)
              .legalAddress(legalAddress)
              .incorporatedOn(incorporatedOn)
              .type(type)
              .email(email)
              .controlScheme(controlScheme)
              .phone(phone)
              .taxId(taxId)
              .registrationLocation(registrationLocation)
              .website(website)
              .postalAddress(postalAddress)
              .beneficiaries(beneficiaries)
              .addresses(addresses)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#changeCompanyData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **applicantChangeCompanyDataRequest** | [**ApplicantChangeCompanyDataRequest**](ApplicantChangeCompanyDataRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="changeExtractedInfo"></a>
# **changeExtractedInfo**
> changeExtractedInfo(applicantId).applicantChangeExtractedInfoRequest(applicantChangeExtractedInfoRequest).execute();

Change information extracted by Sumsub

Changes extracted information.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    String firstName = "firstName_example"; // The first name of the applicant.
    String lastName = "lastName_example"; // The last name of the applicant.
    String middleName = "middleName_example"; // The middle name of the applicant.
    String legalName = "legalName_example"; // Legal name.
    String gender = "gender_example"; // An applicant gender (`M` or `F`).
    String dob = "dob_example"; // Applicant date of birth (format `YYYY-mm-dd`, e.g. 2001-09-25).
    String placeOfBirth = "placeOfBirth_example"; // The applicant birthplace.
    String countryOfBirth = "countryOfBirth_example"; // Applicant country of birth.
    String stateOfBirth = "stateOfBirth_example"; // Applicant state of birth.
    String country = "country_example"; // Alpha-3 country code (e.g. `DEU` or `GBR`).
    String nationality = "nationality_example"; // Alpha-3 country code.
    String addresses = "addresses_example"; // List of applicant addresses.
    String tin = "tin_example"; // Tax identification number.
    try {
      client
              .applicant
              .changeExtractedInfo(applicantId)
              .firstName(firstName)
              .lastName(lastName)
              .middleName(middleName)
              .legalName(legalName)
              .gender(gender)
              .dob(dob)
              .placeOfBirth(placeOfBirth)
              .countryOfBirth(countryOfBirth)
              .stateOfBirth(stateOfBirth)
              .country(country)
              .nationality(nationality)
              .addresses(addresses)
              .tin(tin)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#changeExtractedInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .changeExtractedInfo(applicantId)
              .firstName(firstName)
              .lastName(lastName)
              .middleName(middleName)
              .legalName(legalName)
              .gender(gender)
              .dob(dob)
              .placeOfBirth(placeOfBirth)
              .countryOfBirth(countryOfBirth)
              .stateOfBirth(stateOfBirth)
              .country(country)
              .nationality(nationality)
              .addresses(addresses)
              .tin(tin)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#changeExtractedInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **applicantChangeExtractedInfoRequest** | [**ApplicantChangeExtractedInfoRequest**](ApplicantChangeExtractedInfoRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="changeRequiredDocumentSet"></a>
# **changeRequiredDocumentSet**
> changeRequiredDocumentSet(name, applicantId).execute();

Change required document set

Changes the list of required documents.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String name = "name_example"; // A [verification level](https://docs.sumsub.com/reference) name. Case-sensitive and has to be created in the same environment. If contains reserved characters (e.g., `@`, `+\"`, white spaces as `%20`), it should be URL-encoded, otherwise you may get signature mismatch.
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .applicant
              .changeRequiredDocumentSet(name, applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#changeRequiredDocumentSet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .changeRequiredDocumentSet(name, applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#changeRequiredDocumentSet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| A [verification level](https://docs.sumsub.com/reference) name. Case-sensitive and has to be created in the same environment. If contains reserved characters (e.g., &#x60;@&#x60;, &#x60;+\&quot;&#x60;, white spaces as &#x60;%20&#x60;), it should be URL-encoded, otherwise you may get signature mismatch. | |
| **applicantId** | **String**| A unique applicant identifier. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="clarifyRejectionReason"></a>
# **clarifyRejectionReason**
> clarifyRejectionReason(applicantId).execute();

Clarify rejection reason

Returns rejection reason clarification.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .applicant
              .clarifyRejectionReason(applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#clarifyRejectionReason");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .clarifyRejectionReason(applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#clarifyRejectionReason");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="confirmData"></a>
# **confirmData**
> confirmData(applicantId, confirmationId).applicantConfirmDataRequest(applicantConfirmDataRequest).execute();

Confirm applicant data

Confirms applicant data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    String confirmationId = "confirmationId_example"; // A confirmation identifier from the [submission](ref:submit-applicant-data) response.
    ApplicantConfirmDataRequestOtp otp = new ApplicantConfirmDataRequestOtp();
    ApplicantConfirmDataRequestOauth oauth = new ApplicantConfirmDataRequestOauth();
    try {
      client
              .applicant
              .confirmData(applicantId, confirmationId)
              .otp(otp)
              .oauth(oauth)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#confirmData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .confirmData(applicantId, confirmationId)
              .otp(otp)
              .oauth(oauth)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#confirmData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **confirmationId** | **String**| A confirmation identifier from the [submission](ref:submit-applicant-data) response. | |
| **applicantConfirmDataRequest** | [**ApplicantConfirmDataRequest**](ApplicantConfirmDataRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createAction"></a>
# **createAction**
> createAction(applicantId, levelName).applicantCreateActionRequest(applicantCreateActionRequest).execute();

Create applicant action

Creates an applicant action.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String externalActionId = "externalActionId_example"; // An external action ID which will be bound to the token.
    String applicantId = "applicantId_example"; // A unique aplicant identifier.
    String levelName = "levelName_example"; // A name of the level configured in the dashboard.
    ApplicantCreateActionRequestPaymentMethod paymentMethod = new ApplicantCreateActionRequestPaymentMethod();
    String email = "email_example"; // Applicant email address.
    String phone = "phone_example"; // Applicant phone number.
    try {
      client
              .applicant
              .createAction(externalActionId, applicantId, levelName)
              .paymentMethod(paymentMethod)
              .email(email)
              .phone(phone)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#createAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .createAction(externalActionId, applicantId, levelName)
              .paymentMethod(paymentMethod)
              .email(email)
              .phone(phone)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#createAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique aplicant identifier. | |
| **levelName** | **String**| A name of the level configured in the dashboard. | |
| **applicantCreateActionRequest** | [**ApplicantCreateActionRequest**](ApplicantCreateActionRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createCryptoSourceOfFunds"></a>
# **createCryptoSourceOfFunds**
> createCryptoSourceOfFunds(applicantId).applicantCreateCryptoSourceOfFundsRequest(applicantCreateCryptoSourceOfFundsRequest).execute();

Submission

Creates an action with transaction information.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String currency = "currency_example"; // `BTC`, `ETH`, `BCH`, `LTC`, `USDT`, `ERC-20`, `BSV`, `XLM`, ...
    String direction = "direction_example"; // Operation type. Can be `withdrawal` or `deposit`.
    String address = "address_example"; // Target address hash.
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    String txn = "txn_example"; // Transaction hash. For `withdrawals`, `txn` should not be set at all or set to `null`.
    String tokenId = "tokenId_example"; // Check the [Get available tokens](ref:get-available-tokens) method to get the full list of available currencies and token IDs.
    try {
      client
              .applicant
              .createCryptoSourceOfFunds(currency, direction, address, applicantId)
              .txn(txn)
              .tokenId(tokenId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#createCryptoSourceOfFunds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .createCryptoSourceOfFunds(currency, direction, address, applicantId)
              .txn(txn)
              .tokenId(tokenId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#createCryptoSourceOfFunds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **applicantCreateCryptoSourceOfFundsRequest** | [**ApplicantCreateCryptoSourceOfFundsRequest**](ApplicantCreateCryptoSourceOfFundsRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createPaymentSourceActions"></a>
# **createPaymentSourceActions**
> ApplicantCreatePaymentSourceActionsResponse createPaymentSourceActions(applicantId, levelName).applicantCreatePaymentSourceActionsRequest(applicantCreatePaymentSourceActionsRequest).execute();

Create payment source actions

Creates an action to process a payment source and to confirm the owner of the payment method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // An unique applicant identifier.
    String levelName = "levelName_example"; // A verification level name for which you want to create a payment source action.
    String externalActionId = "externalActionId_example"; // An external identifier for an action.
    ApplicantCreatePaymentSourceActionsRequestPaymentSource paymentSource = new ApplicantCreatePaymentSourceActionsRequestPaymentSource();
    try {
      ApplicantCreatePaymentSourceActionsResponse result = client
              .applicant
              .createPaymentSourceActions(applicantId, levelName)
              .externalActionId(externalActionId)
              .paymentSource(paymentSource)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getKey());
      System.out.println(result.getClientId());
      System.out.println(result.getExternalActionId());
      System.out.println(result.getApplicantId());
      System.out.println(result.getType());
      System.out.println(result.getReview());
      System.out.println(result.getRequiredIdDocs());
      System.out.println(result.getPaymentSource());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#createPaymentSourceActions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicantCreatePaymentSourceActionsResponse> response = client
              .applicant
              .createPaymentSourceActions(applicantId, levelName)
              .externalActionId(externalActionId)
              .paymentSource(paymentSource)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#createPaymentSourceActions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| An unique applicant identifier. | |
| **levelName** | **String**| A verification level name for which you want to create a payment source action. | |
| **applicantCreatePaymentSourceActionsRequest** | [**ApplicantCreatePaymentSourceActionsRequest**](ApplicantCreatePaymentSourceActionsRequest.md)|  | [optional] |

### Return type

[**ApplicantCreatePaymentSourceActionsResponse**](ApplicantCreatePaymentSourceActionsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="deactivateProfile"></a>
# **deactivateProfile**
> deactivateProfile(applicantId, status).execute();

Deactivate applicant profile

Deactivates an applicant profile.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    String status = "status_example"; // Possible values: `deactivated` to deactivate the applicant profile. `activated` to reactivate the applicant profile.
    try {
      client
              .applicant
              .deactivateProfile(applicantId, status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#deactivateProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .deactivateProfile(applicantId, status)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#deactivateProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **status** | **String**| Possible values: &#x60;deactivated&#x60; to deactivate the applicant profile. &#x60;activated&#x60; to reactivate the applicant profile. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="enrichTransactionWithTravelRuleData"></a>
# **enrichTransactionWithTravelRuleData**
> Object enrichTransactionWithTravelRuleData(txnId).applicantEnrichTransactionWithTravelRuleDataRequest(applicantEnrichTransactionWithTravelRuleDataRequest).execute();

Enriching transaction with Travel Rule

Enriches transaction with the Travel Rule data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String fullName = "fullName_example"; // Participant full name.
    String txnId = "txnId_example"; // A unique transaction identifier.
    try {
      Object result = client
              .applicant
              .enrichTransactionWithTravelRuleData(fullName, txnId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#enrichTransactionWithTravelRuleData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .applicant
              .enrichTransactionWithTravelRuleData(fullName, txnId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#enrichTransactionWithTravelRuleData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **txnId** | **String**| A unique transaction identifier. | |
| **applicantEnrichTransactionWithTravelRuleDataRequest** | [**ApplicantEnrichTransactionWithTravelRuleDataRequest**](ApplicantEnrichTransactionWithTravelRuleDataRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getActionOneInfo"></a>
# **getActionOneInfo**
> getActionOneInfo(actionId).execute();

Get action information

Returns information about the applicant action checks.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String actionId = "actionId_example"; // A unique applicant action identifier.
    try {
      client
              .applicant
              .getActionOneInfo(actionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getActionOneInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .getActionOneInfo(actionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getActionOneInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **actionId** | **String**| A unique applicant action identifier. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getActions"></a>
# **getActions**
> getActions(applicantId).limit(limit).offset(offset).execute();

Get applicant actions

Returns a list of applicant actions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    Integer limit = 1000; // Limit of applicant actions to be returned.
    Integer offset = 0; // Offset of applicant actions to be returned.
    try {
      client
              .applicant
              .getActions(applicantId)
              .limit(limit)
              .offset(offset)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getActions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .getActions(applicantId)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getActions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **limit** | **Integer**| Limit of applicant actions to be returned. | [optional] [default to 1000] |
| **offset** | **Integer**| Offset of applicant actions to be returned. | [optional] [default to 0] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBankCardImage"></a>
# **getBankCardImage**
> getBankCardImage(actionId, imageId).isPreview(isPreview).execute();

Get bank card image

Returns an original bank card image.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String actionId = "actionId_example"; // A unique applicant action identifier.
    String imageId = "imageId_example"; // An image identifier taken from `images[].imageId`.
    Boolean isPreview = false; // Indicates if an image thumbnail should be returned.
    try {
      client
              .applicant
              .getBankCardImage(actionId, imageId)
              .isPreview(isPreview)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getBankCardImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .getBankCardImage(actionId, imageId)
              .isPreview(isPreview)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getBankCardImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **actionId** | **String**| A unique applicant action identifier. | |
| **imageId** | **String**| An image identifier taken from &#x60;images[].imageId&#x60;. | |
| **isPreview** | **Boolean**| Indicates if an image thumbnail should be returned. | [optional] [default to false] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getData"></a>
# **getData**
> getData(applicantId).execute();

Get applicant data

Returns applicant information.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier
    try {
      client
              .applicant
              .getData(applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .getData(applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDataByExternalUserId"></a>
# **getDataByExternalUserId**
> getDataByExternalUserId(externalUserId).execute();

Get applicant data (externalUserId)

Returns applicant information based on the provided &#x60;externalUserId&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String externalUserId = "externalUserId_example"; // A unique applicant identifier in your system.
    try {
      client
              .applicant
              .getDataByExternalUserId(externalUserId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getDataByExternalUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .getDataByExternalUserId(externalUserId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getDataByExternalUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **externalUserId** | **String**| A unique applicant identifier in your system. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDataLatest"></a>
# **getDataLatest**
> getDataLatest(type, applicantId).execute();

Get applicant data

Returns the applicant data for Non-Doc verification.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String type = "E_KYC_CHECK"; // Check type.
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .applicant
              .getDataLatest(type, applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getDataLatest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .getDataLatest(type, applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getDataLatest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Check type. | [enum: E_KYC_CHECK, RESIDENCY_CHECK] |
| **applicantId** | **String**| A unique applicant identifier. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getFraudNetworkById"></a>
# **getFraudNetworkById**
> getFraudNetworkById(networkId).execute();

Get fraud network by ID

Returns fraud network by &#x60;networkId&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String networkId = "networkId_example"; // A unique network identifier.
    try {
      client
              .applicant
              .getFraudNetworkById(networkId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getFraudNetworkById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .getFraudNetworkById(networkId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getFraudNetworkById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkId** | **String**| A unique network identifier. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getFraudNetworks"></a>
# **getFraudNetworks**
> getFraudNetworks().offset(offset).limit(limit).execute();

Get fraud networks

Returns fraud networks.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    Integer offset = 0; // Offset of the found networks to be returned.
    Integer limit = 10; // Maximum number of the found networks to be returned. The maximum value you can set is 100.
    try {
      client
              .applicant
              .getFraudNetworks()
              .offset(offset)
              .limit(limit)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getFraudNetworks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .getFraudNetworks()
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getFraudNetworks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **offset** | **Integer**| Offset of the found networks to be returned. | [optional] [default to 0] |
| **limit** | **Integer**| Maximum number of the found networks to be returned. The maximum value you can set is 100. | [optional] [default to 10] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getFraudNetworksByApplicant"></a>
# **getFraudNetworksByApplicant**
> getFraudNetworksByApplicant(applicantId).execute();

Get applicant fraud networks

Returns all fraud networks by &#x60;applicantId&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .applicant
              .getFraudNetworksByApplicant(applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getFraudNetworksByApplicant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .getFraudNetworksByApplicant(applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getFraudNetworksByApplicant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getLevels"></a>
# **getLevels**
> getLevels().execute();

Get available applicant levels

Returns a list of verification levels.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    try {
      client
              .applicant
              .getLevels()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getLevels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .getLevels()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getLevels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getRequiredIdDocs"></a>
# **getRequiredIdDocs**
> getRequiredIdDocs(applicantId).execute();

Get required ID documents

Returns the list of required documents.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .applicant
              .getRequiredIdDocs(applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getRequiredIdDocs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .getRequiredIdDocs(applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getRequiredIdDocs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReviewStatus"></a>
# **getReviewStatus**
> getReviewStatus(applicantId).execute();

Get applicant review status

Returns applicant review status.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .applicant
              .getReviewStatus(applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getReviewStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .getReviewStatus(applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getReviewStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getVerificationStepsStatus"></a>
# **getVerificationStepsStatus**
> getVerificationStepsStatus(applicantId).execute();

Get applicant verification steps status

Returns information about the documents or separate verification step results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .applicant
              .getVerificationStepsStatus(applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getVerificationStepsStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .getVerificationStepsStatus(applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getVerificationStepsStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getVideoCallMedia"></a>
# **getVideoCallMedia**
> Object getVideoCallMedia(applicantId, compositionMediaId).execute();

Get video call media

Returns video call media.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    String compositionMediaId = "compositionMediaId_example"; // Video call media identifier.
    try {
      Object result = client
              .applicant
              .getVideoCallMedia(applicantId, compositionMediaId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getVideoCallMedia");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .applicant
              .getVideoCallMedia(applicantId, compositionMediaId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#getVideoCallMedia");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **compositionMediaId** | **String**| Video call media identifier. | |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="importByArchive"></a>
# **importByArchive**
> importByArchive().applicantImportByArchiveRequest(applicantImportByArchiveRequest).execute();

Import applicant with images by archive

Imports applicant data and images including associated review results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    File content = new File("/path/to/file"); // An archive file.
    try {
      client
              .applicant
              .importByArchive()
              .content(content)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#importByArchive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .importByArchive()
              .content(content)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#importByArchive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantImportByArchiveRequest** | [**ApplicantImportByArchiveRequest**](ApplicantImportByArchiveRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="importCompleted"></a>
# **importCompleted**
> importCompleted().levelName(levelName).applicantImportCompletedRequest(applicantImportCompletedRequest).execute();

Import applicants

Imports applicants.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    ApplicantImportCompletedRequestInfo info = new ApplicantImportCompletedRequestInfo();
    String externalUserId = "externalUserId_example"; // someClientUserId
    ApplicantImportCompletedRequestReview review = new ApplicantImportCompletedRequestReview();
    String levelName = "levelName_example"; // A [verification level](https://docs.sumsub.com/reference) name. Case-sensitive and has to be created in the same environment. If contains reserved characters (e.g., `@`, `+\"`, white spaces as `%20`), it should be URL-encoded, otherwise you may get signature mismatch.
    try {
      client
              .applicant
              .importCompleted()
              .info(info)
              .externalUserId(externalUserId)
              .review(review)
              .levelName(levelName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#importCompleted");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .importCompleted()
              .info(info)
              .externalUserId(externalUserId)
              .review(review)
              .levelName(levelName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#importCompleted");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **levelName** | **String**| A [verification level](https://docs.sumsub.com/reference) name. Case-sensitive and has to be created in the same environment. If contains reserved characters (e.g., &#x60;@&#x60;, &#x60;+\&quot;&#x60;, white spaces as &#x60;%20&#x60;), it should be URL-encoded, otherwise you may get signature mismatch. | [optional] |
| **applicantImportCompletedRequest** | [**ApplicantImportCompletedRequest**](ApplicantImportCompletedRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="initiateApplicantCheck"></a>
# **initiateApplicantCheck**
> initiateApplicantCheck(applicantId).reason(reason).execute();

Request applicant check

Initiates a check of the applicant profile.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    String reason = "reason_example"; // A note indicating the reason for checking the applicant profile.
    try {
      client
              .applicant
              .initiateApplicantCheck(applicantId)
              .reason(reason)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#initiateApplicantCheck");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .initiateApplicantCheck(applicantId)
              .reason(reason)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#initiateApplicantCheck");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **reason** | **String**| A note indicating the reason for checking the applicant profile. | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="moveTransactionToAnotherApplicant"></a>
# **moveTransactionToAnotherApplicant**
> Object moveTransactionToAnotherApplicant(txnId, applicantId).execute();

Move transaction to another applicant

Moves transaction to the specified applicant.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String txnId = "txnId_example"; // A unique transaction identifier.
    String applicantId = "applicantId_example"; // A unique applicant identifier who should own the transaction.
    try {
      Object result = client
              .applicant
              .moveTransactionToAnotherApplicant(txnId, applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#moveTransactionToAnotherApplicant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .applicant
              .moveTransactionToAnotherApplicant(txnId, applicantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#moveTransactionToAnotherApplicant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **txnId** | **String**| A unique transaction identifier. | |
| **applicantId** | **String**| A unique applicant identifier who should own the transaction. | |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="removeCustomTags"></a>
# **removeCustomTags**
> removeCustomTags(applicantId).applicantRemoveCustomTagsRequest(applicantRemoveCustomTagsRequest).execute();

Remove custom applicant tags

Removes all custom tags from applicant profiles.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    List<String> RAW_BODY = Arrays.asList();
    try {
      client
              .applicant
              .removeCustomTags(applicantId)
              .RAW_BODY(RAW_BODY)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#removeCustomTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .removeCustomTags(applicantId)
              .RAW_BODY(RAW_BODY)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#removeCustomTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **applicantRemoveCustomTagsRequest** | [**ApplicantRemoveCustomTagsRequest**](ApplicantRemoveCustomTagsRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeFromBeneficiaryList"></a>
# **removeFromBeneficiaryList**
> removeFromBeneficiaryList(applicantId, beneficiaryApplicantId).execute();

Remove applicant from beneficiary list

Removes the applicant from the list of company beneficial owners.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique company applicant identifier.
    String beneficiaryApplicantId = "beneficiaryApplicantId_example"; // Beneficiary applicant identifier.
    try {
      client
              .applicant
              .removeFromBeneficiaryList(applicantId, beneficiaryApplicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#removeFromBeneficiaryList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .removeFromBeneficiaryList(applicantId, beneficiaryApplicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#removeFromBeneficiaryList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique company applicant identifier. | |
| **beneficiaryApplicantId** | **String**| Beneficiary applicant identifier. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="requestActionCheck"></a>
# **requestActionCheck**
> requestActionCheck(actionId).execute();

Request action check

Requests an applicant action check.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String actionId = "actionId_example"; // A unique applicant action identifier.
    try {
      client
              .applicant
              .requestActionCheck(actionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#requestActionCheck");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .requestActionCheck(actionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#requestActionCheck");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **actionId** | **String**| A unique applicant action identifier. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="resetProfile"></a>
# **resetProfile**
> resetProfile(applicantId).execute();

Reset applicant profile

Marks documents uploaded by the applicant as inactive and deletes all statuses assigned earlier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .applicant
              .resetProfile(applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#resetProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .resetProfile(applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#resetProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="resetVerificationStep"></a>
# **resetVerificationStep**
> resetVerificationStep(applicantId, idDocSetType).execute();

Reset verification step

Resets the specified verification step.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    String idDocSetType = "idDocSetType_example"; // A [step name](ref:reset-single-verification-step#available-steps-to-reset) to reset.
    try {
      client
              .applicant
              .resetVerificationStep(applicantId, idDocSetType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#resetVerificationStep");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .resetVerificationStep(applicantId, idDocSetType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#resetVerificationStep");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **idDocSetType** | **String**| A [step name](ref:reset-single-verification-step#available-steps-to-reset) to reset. | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="sandboxVerificationResponse"></a>
# **sandboxVerificationResponse**
> sandboxVerificationResponse(applicantId).applicantSandboxVerificationResponseRequest(applicantSandboxVerificationResponseRequest).execute();

Set review for applicant in sandbox

Simulates a verification reposnose.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String reviewAnswer = "reviewAnswer_example"; // A `GREEN` or `RED` label under which you want to simulate the response. For more information, see [this article](https://docs.sumsub.com/reference).
    List<String> rejectLabels = Arrays.asList(); // An array of [rejection labels](/docs/receive-and-interpret-results-via-api#understand-rejection).
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    String reviewRejectType = "reviewRejectType_example"; // A `FINAL` or `RETRY` rejection type indicating whether a rejection should be final or temporary.
    String clientComment = "clientComment_example"; // A rejection comment that should not be available to your applicants.
    String moderationComment = "moderationComment_example"; // A comment that supposed to be shown to the applicant, explaining the reason of rejection.
    try {
      client
              .applicant
              .sandboxVerificationResponse(reviewAnswer, rejectLabels, applicantId)
              .reviewRejectType(reviewRejectType)
              .clientComment(clientComment)
              .moderationComment(moderationComment)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#sandboxVerificationResponse");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .sandboxVerificationResponse(reviewAnswer, rejectLabels, applicantId)
              .reviewRejectType(reviewRejectType)
              .clientComment(clientComment)
              .moderationComment(moderationComment)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#sandboxVerificationResponse");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **applicantSandboxVerificationResponseRequest** | [**ApplicantSandboxVerificationResponseRequest**](ApplicantSandboxVerificationResponseRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="submitDataNoDocVerification"></a>
# **submitDataNoDocVerification**
> submitDataNoDocVerification(applicantId).applicantSubmitDataNoDocVerificationRequest(applicantSubmitDataNoDocVerificationRequest).execute();

Submit applicant data

Sends applicant data for no-document verification.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    ApplicantSubmitDataNoDocVerificationRequestInfo info = new ApplicantSubmitDataNoDocVerificationRequestInfo();
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .applicant
              .submitDataNoDocVerification(info, applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#submitDataNoDocVerification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .submitDataNoDocVerification(info, applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#submitDataNoDocVerification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **applicantSubmitDataNoDocVerificationRequest** | [**ApplicantSubmitDataNoDocVerificationRequest**](ApplicantSubmitDataNoDocVerificationRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="submitPaymentMethod"></a>
# **submitPaymentMethod**
> submitPaymentMethod(xExternalActionId, applicantId).requireSelfie(requireSelfie).execute();

Submission

Submits a payment method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String xExternalActionId = "xExternalActionId_example"; // Use `externalActionId` if you intend to [initialize SDK](ref:about-applicant-actions) for that particular action.
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    Boolean requireSelfie = false; // Sets the video selfie at `requiredIdDocs` for the action.
    try {
      client
              .applicant
              .submitPaymentMethod(xExternalActionId, applicantId)
              .requireSelfie(requireSelfie)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#submitPaymentMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .submitPaymentMethod(xExternalActionId, applicantId)
              .requireSelfie(requireSelfie)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#submitPaymentMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xExternalActionId** | **String**| Use &#x60;externalActionId&#x60; if you intend to [initialize SDK](ref:about-applicant-actions) for that particular action. | |
| **applicantId** | **String**| A unique applicant identifier. | |
| **requireSelfie** | **Boolean**| Sets the video selfie at &#x60;requiredIdDocs&#x60; for the action. | [optional] [default to false] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="submitTransactionData"></a>
# **submitTransactionData**
> submitTransactionData(applicantId).applicantSubmitTransactionDataRequest(applicantSubmitTransactionDataRequest).execute();

Submit transaction for existing applicant

Initiates transaction processing.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    ApplicantSubmitTransactionDataRequestInfo info = new ApplicantSubmitTransactionDataRequestInfo();
    String txnId = "txnId_example"; // A unique transaction identification number. <br>**Note:** If the specified `txnId` already exists, a `409` error code \\\"Entity already exists\\\" is returned. To update an existing transaction, use the [bulk import method](doc:update-transactions-via-bulk-import-method).
    ApplicantSubmitTransactionDataRequestApplicant applicant = new ApplicantSubmitTransactionDataRequestApplicant();
    ApplicantSubmitTransactionDataRequestCounterparty counterparty = new ApplicantSubmitTransactionDataRequestCounterparty();
    String applicantId = "applicantId_example"; // A unique identification number of the applicant who passed user verification (KYC). If you do no have such an applicant, use [Submit transaction for non-existing applicant](ref:submit-transaction-for-non-existing-applicant) instead.
    LocalDate txnDate = LocalDate.now(); // Date and time when the transaction was initiated (format `yyyy-MM-dd HH:mm:ss+XXXX`, e.g. 2022-11-24 23:37:02+0000).
    String type = "finance"; // A transaction type. Expects values: </br> <ul>   <li><code>finance</code>(default)</li>   <li><code>gamblingBet</code></li>   <li><code>gamblingLimitChange</code></li>   <li><code>gamblingBonusChange</code></li>   <li><code>kyc</code></li>   <li><code>travelRule</code></li>   <li><code>userPlatformEvent</code></li>   <ul>     <li><code>login</code></li>     <li><code>signup</code></li>     <li><code>passwordChange</code></li>     <li><code>twoFaReset</code></li>   </ul> </ul>
    String sourceKey = "sourceKey_example"; // A source key indication to separate access to transactions.
    ApplicantSubmitTransactionDataRequestProps props = new ApplicantSubmitTransactionDataRequestProps();
    try {
      client
              .applicant
              .submitTransactionData(info, txnId, applicant, counterparty, applicantId)
              .txnDate(txnDate)
              .type(type)
              .sourceKey(sourceKey)
              .props(props)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#submitTransactionData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .submitTransactionData(info, txnId, applicant, counterparty, applicantId)
              .txnDate(txnDate)
              .type(type)
              .sourceKey(sourceKey)
              .props(props)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#submitTransactionData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique identification number of the applicant who passed user verification (KYC). If you do no have such an applicant, use [Submit transaction for non-existing applicant](ref:submit-transaction-for-non-existing-applicant) instead. | |
| **applicantSubmitTransactionDataRequest** | [**ApplicantSubmitTransactionDataRequest**](ApplicantSubmitTransactionDataRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="submitTransactionForNonExisting"></a>
# **submitTransactionForNonExisting**
> submitTransactionForNonExisting(levelName).applicantSubmitTransactionForNonExistingRequest(applicantSubmitTransactionForNonExistingRequest).execute();

Submit transaction for non-existing applicant

Initiates transaction processing for non-existing applicants.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    ApplicantSubmitTransactionDataRequestInfo info = new ApplicantSubmitTransactionDataRequestInfo();
    String txnId = "txnId_example"; // A unique transaction identification number.
    ApplicantSubmitTransactionForNonExistingRequestApplicant applicant = new ApplicantSubmitTransactionForNonExistingRequestApplicant();
    ApplicantSubmitTransactionForNonExistingRequestCounterparty counterparty = new ApplicantSubmitTransactionForNonExistingRequestCounterparty();
    String levelName = "levelName_example"; // A [verification level](https://docs.sumsub.com/reference) name. Case-sensitive and has to be created in the same environment. If contains reserved characters (e.g., `@`, `+\"`, white spaces as `%20`), it should be URL-encoded, otherwise you may get signature mismatch.
    LocalDate txnDate = LocalDate.now(); // Date and time when the transaction was initiated (format `yyyy-MM-dd HH:mm:ss+XXXX`, e.g. 2022-11-24 23:37:02+0000).
    Object props = null; // Transaction properties. Map of strings (JSON) of custom keys and string values.
    String type = "finance"; // A transaction type. Expects values: </br> <ul>   <li><code>finance</code>(default)</li>   <li><code>gamblingBet</code></li>   <li><code>gamblingLimitChange</code></li>   <li><code>gamblingBonusChange</code></li>   <li><code>kyc</code></li>   <li><code>travelRule</code></li>   <li><code>userPlatformEvent</code></li>   <ul>     <li><code>login</code></li>     <li><code>signup</code></li>     <li><code>passwordChange</code></li>     <li><code>twoFaReset</code></li>   </ul> </ul>
    String sourceKey = "sourceKey_example"; // A source key indication to separate access to transactions.
    try {
      client
              .applicant
              .submitTransactionForNonExisting(info, txnId, applicant, counterparty, levelName)
              .txnDate(txnDate)
              .props(props)
              .type(type)
              .sourceKey(sourceKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#submitTransactionForNonExisting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .submitTransactionForNonExisting(info, txnId, applicant, counterparty, levelName)
              .txnDate(txnDate)
              .props(props)
              .type(type)
              .sourceKey(sourceKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#submitTransactionForNonExisting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **levelName** | **String**| A [verification level](https://docs.sumsub.com/reference) name. Case-sensitive and has to be created in the same environment. If contains reserved characters (e.g., &#x60;@&#x60;, &#x60;+\&quot;&#x60;, white spaces as &#x60;%20&#x60;), it should be URL-encoded, otherwise you may get signature mismatch. | |
| **applicantSubmitTransactionForNonExistingRequest** | [**ApplicantSubmitTransactionForNonExistingRequest**](ApplicantSubmitTransactionForNonExistingRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateFixedInfo"></a>
# **updateFixedInfo**
> updateFixedInfo(applicantId).applicantUpdateFixedInfoRequest(applicantUpdateFixedInfoRequest).execute();

Change provided information

Updates information provided when [creating an applicant](ref:create-applicants).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    String firstName = "firstName_example"; // The first name of the applicant.
    String lastName = "lastName_example"; // The last name of the applicant.
    String middleName = "middleName_example"; // The middle name of the applicant.
    String firstNameEn = "firstNameEn_example"; // Automatic transliteration of the first name.
    String lastNameEn = "lastNameEn_example"; // Automatic transliteration of the last name.
    String middleNameEn = "middleNameEn_example"; // Automatic transliteration of the middle name.
    String legalName = "legalName_example"; // Legal name.
    String gender = "gender_example"; // An applicant gender (`M` or `F`).
    String dob = "dob_example"; // Applicant date of birth (format `YYYY-mm-dd`, e.g. 2001-09-25).
    String placeOfBirth = "placeOfBirth_example"; // The applicant birthplace.
    String countryOfBirth = "countryOfBirth_example"; // Applicant country of birth.
    String stateOfBirth = "stateOfBirth_example"; // Applicant state of birth.
    String country = "country_example"; // Alpha-3 country code (e.g. `DEU` or `GBR`).
    String nationality = "nationality_example"; // Alpha-3 country code.
    List<Object> addresses = Arrays.asList(null); // List of applicant addresses.
    String tin = "tin_example"; // Tax identification number.
    try {
      client
              .applicant
              .updateFixedInfo(applicantId)
              .firstName(firstName)
              .lastName(lastName)
              .middleName(middleName)
              .firstNameEn(firstNameEn)
              .lastNameEn(lastNameEn)
              .middleNameEn(middleNameEn)
              .legalName(legalName)
              .gender(gender)
              .dob(dob)
              .placeOfBirth(placeOfBirth)
              .countryOfBirth(countryOfBirth)
              .stateOfBirth(stateOfBirth)
              .country(country)
              .nationality(nationality)
              .addresses(addresses)
              .tin(tin)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#updateFixedInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .updateFixedInfo(applicantId)
              .firstName(firstName)
              .lastName(lastName)
              .middleName(middleName)
              .firstNameEn(firstNameEn)
              .lastNameEn(lastNameEn)
              .middleNameEn(middleNameEn)
              .legalName(legalName)
              .gender(gender)
              .dob(dob)
              .placeOfBirth(placeOfBirth)
              .countryOfBirth(countryOfBirth)
              .stateOfBirth(stateOfBirth)
              .country(country)
              .nationality(nationality)
              .addresses(addresses)
              .tin(tin)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#updateFixedInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantId** | **String**| A unique applicant identifier. | |
| **applicantUpdateFixedInfoRequest** | [**ApplicantUpdateFixedInfoRequest**](ApplicantUpdateFixedInfoRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateTopLevelInfo"></a>
# **updateTopLevelInfo**
> updateTopLevelInfo().applicantUpdateTopLevelInfoRequest(applicantUpdateTopLevelInfoRequest).execute();

Change top-level information

Changes existing verification level configuration.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String id = "id_example"; // A unique applicant identifier.
    String externalUserId = "externalUserId_example"; // An external applicant identifier.
    String email = "email_example"; // A new email address that you want to assign to the given applicant.
    String phone = "phone_example"; // A new phone number that you want to assign to the given applicant.
    String sourceKey = "sourceKey_example"; // A new [source key](https://docs.sumsub.com/reference) that you want to assign to the given applicant.
    String lang = "lang_example"; // The language, in which the applicant should see the verification results.
    List<Object> questionnaires = Arrays.asList(null); // A [questionnaire](https://docs.sumsub.com/reference) configuration with answers.
    List<Object> metadata = Arrays.asList(null); // Additional information about the applicant.
    Boolean deleted = true; // Marks an applicant as inactive if set to `true`. The applicant will not be considered a duplicate. SDKs will not initiate checks for this applicant.
    try {
      client
              .applicant
              .updateTopLevelInfo(id)
              .externalUserId(externalUserId)
              .email(email)
              .phone(phone)
              .sourceKey(sourceKey)
              .lang(lang)
              .questionnaires(questionnaires)
              .metadata(metadata)
              .deleted(deleted)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#updateTopLevelInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicant
              .updateTopLevelInfo(id)
              .externalUserId(externalUserId)
              .email(email)
              .phone(phone)
              .sourceKey(sourceKey)
              .lang(lang)
              .questionnaires(questionnaires)
              .metadata(metadata)
              .deleted(deleted)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantApi#updateTopLevelInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicantUpdateTopLevelInfoRequest** | [**ApplicantUpdateTopLevelInfoRequest**](ApplicantUpdateTopLevelInfoRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


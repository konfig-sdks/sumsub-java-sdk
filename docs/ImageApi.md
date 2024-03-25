# ImageApi

All URIs are relative to *https://api.sumsub.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDocumentImages**](ImageApi.md#getDocumentImages) | **GET** /resources/inspections/{inspectionId}/resources/{imageId} | Get document images |
| [**markAsInactive**](ImageApi.md#markAsInactive) | **DELETE** /resources/inspections/{inspectionId}/resources/{imageId} | Mark image as inactive |


<a name="getDocumentImages"></a>
# **getDocumentImages**
> getDocumentImages(inspectionId, imageId).execute();

Get document images

Returns document images.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImageApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String inspectionId = "inspectionId_example"; // An inspection identifier. This identifier is returned as a root field upon running [this API method](ref:get-applicant-data).
    String imageId = "imageId_example"; // An image identifier. You can get this number by using [this API method](ref:get-applicant-verification-steps-status).
    try {
      client
              .image
              .getDocumentImages(inspectionId, imageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#getDocumentImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .image
              .getDocumentImages(inspectionId, imageId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#getDocumentImages");
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
| **inspectionId** | **String**| An inspection identifier. This identifier is returned as a root field upon running [this API method](ref:get-applicant-data). | |
| **imageId** | **String**| An image identifier. You can get this number by using [this API method](ref:get-applicant-verification-steps-status). | |

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

<a name="markAsInactive"></a>
# **markAsInactive**
> markAsInactive(inspectionId, imageId).revert(revert).execute();

Mark image as inactive

Marks uploaded images as deleted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImageApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String inspectionId = "inspectionId_example"; // An inspection identifier. You can get this number by using [this API method](ref:get-applicant-data).
    String imageId = "imageId_example"; // An image identifier. You can get this number by using [this API method](ref:get-applicant-verification-steps-status).
    Boolean revert = false; // Set `true` to revert inactivity of the image.
    try {
      client
              .image
              .markAsInactive(inspectionId, imageId)
              .revert(revert)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#markAsInactive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .image
              .markAsInactive(inspectionId, imageId)
              .revert(revert)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#markAsInactive");
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
| **inspectionId** | **String**| An inspection identifier. You can get this number by using [this API method](ref:get-applicant-data). | |
| **imageId** | **String**| An image identifier. You can get this number by using [this API method](ref:get-applicant-verification-steps-status). | |
| **revert** | **Boolean**| Set &#x60;true&#x60; to revert inactivity of the image. | [optional] [default to false] |

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


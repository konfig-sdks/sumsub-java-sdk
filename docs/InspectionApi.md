# InspectionApi

All URIs are relative to *https://api.sumsub.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVideoIdentData**](InspectionApi.md#getVideoIdentData) | **GET** /resources/inspections/{inspectionId}?fields&#x3D;videoIdentData | Get video call data |


<a name="getVideoIdentData"></a>
# **getVideoIdentData**
> getVideoIdentData(inspectionId).execute();

Get video call data

Returns the video call results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InspectionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String inspectionId = "inspectionId_example"; // A unique inspection identifier.
    try {
      client
              .inspection
              .getVideoIdentData(inspectionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InspectionApi#getVideoIdentData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .inspection
              .getVideoIdentData(inspectionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling InspectionApi#getVideoIdentData");
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
| **inspectionId** | **String**| A unique inspection identifier. | |

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


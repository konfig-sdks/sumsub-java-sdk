# TagApi

All URIs are relative to *https://api.sumsub.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTransactionTags**](TagApi.md#addTransactionTags) | **POST** /resources/kyt/txns/{id}/tags | Add tags |


<a name="addTransactionTags"></a>
# **addTransactionTags**
> addTransactionTags(id).tagAddTransactionTagsRequest(tagAddTransactionTagsRequest).execute();

Add tags

Adds tags to transactions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String id = "id_example"; // A unique transaction identifier.
    List<String> RAW_BODY = Arrays.asList(); // Tags to add. Case-sensitive.
    try {
      client
              .tag
              .addTransactionTags(id)
              .RAW_BODY(RAW_BODY)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#addTransactionTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tag
              .addTransactionTags(id)
              .RAW_BODY(RAW_BODY)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#addTransactionTags");
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
| **id** | **String**| A unique transaction identifier. | |
| **tagAddTransactionTagsRequest** | [**TagAddTransactionTagsRequest**](TagAddTransactionTagsRequest.md)|  | [optional] |

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


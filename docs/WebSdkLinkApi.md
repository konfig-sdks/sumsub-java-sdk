# WebSdkLinkApi

All URIs are relative to *https://api.sumsub.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateExternal**](WebSdkLinkApi.md#generateExternal) | **POST** /resources/sdkIntegrations/levels/{levelName}/websdkLink | Generate external WebSDK link |


<a name="generateExternal"></a>
# **generateExternal**
> generateExternal(levelName).ttlInSecs(ttlInSecs).externalUserId(externalUserId).lang(lang).execute();

Generate external WebSDK link

Creates a link to WebSDK for the specified applicant.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebSdkLinkApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String levelName = "levelName_example"; // A [verification level](https://docs.sumsub.com/reference) name. Case-sensitive and has to be created in the same environment. If contains reserved characters (e.g., `@`, `+\"`, white spaces as `%20`), it should be URL-encoded, otherwise you may get signature mismatch.
    Integer ttlInSecs = 56; // A lifespan of the link in seconds.
    String externalUserId = "externalUserId_example"; // An external user ID on your side.
    String lang = "lang_example"; // The language for WebSDK in ISO 639-1 format.
    try {
      client
              .webSdkLink
              .generateExternal(levelName)
              .ttlInSecs(ttlInSecs)
              .externalUserId(externalUserId)
              .lang(lang)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSdkLinkApi#generateExternal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webSdkLink
              .generateExternal(levelName)
              .ttlInSecs(ttlInSecs)
              .externalUserId(externalUserId)
              .lang(lang)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebSdkLinkApi#generateExternal");
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
| **ttlInSecs** | **Integer**| A lifespan of the link in seconds. | [optional] |
| **externalUserId** | **String**| An external user ID on your side. | [optional] |
| **lang** | **String**| The language for WebSDK in ISO 639-1 format. | [optional] |

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


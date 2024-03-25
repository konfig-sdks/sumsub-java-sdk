# TokenApi

All URIs are relative to *https://api.sumsub.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createActionToken**](TokenApi.md#createActionToken) | **POST** /resources/accessTokens | Generate access token |
| [**getAvailableCurrencies**](TokenApi.md#getAvailableCurrencies) | **GET** /resources/standalone/crypto/availableCurrencies | Get available tokens |


<a name="createActionToken"></a>
# **createActionToken**
> createActionToken(userId, externalActionId, levelName).ttlInSecs(ttlInSecs).execute();

Generate access token

Creates an applicant action token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String userId = "userId_example"; // An external user ID which will be bound to the token.
    String externalActionId = "externalActionId_example"; // An external action ID which will be bound to the token.
    String levelName = "levelName_example"; // The name of the [verification level](https://docs.sumsub.com/reference).
    String ttlInSecs = "600"; // A lifespan of a token in seconds. Default value is 10 mins.
    try {
      client
              .token
              .createActionToken(userId, externalActionId, levelName)
              .ttlInSecs(ttlInSecs)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#createActionToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .token
              .createActionToken(userId, externalActionId, levelName)
              .ttlInSecs(ttlInSecs)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#createActionToken");
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
| **userId** | **String**| An external user ID which will be bound to the token. | |
| **externalActionId** | **String**| An external action ID which will be bound to the token. | |
| **levelName** | **String**| The name of the [verification level](https://docs.sumsub.com/reference). | |
| **ttlInSecs** | **String**| A lifespan of a token in seconds. Default value is 10 mins. | [optional] [default to 600] |

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

<a name="getAvailableCurrencies"></a>
# **getAvailableCurrencies**
> getAvailableCurrencies().execute();

Get available tokens

Returns available tokens.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenApi;
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
              .token
              .getAvailableCurrencies()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#getAvailableCurrencies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .token
              .getAvailableCurrencies()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#getAvailableCurrencies");
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


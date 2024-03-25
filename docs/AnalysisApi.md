# AnalysisApi

All URIs are relative to *https://api.sumsub.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**standaloneCryptoInitiation**](AnalysisApi.md#standaloneCryptoInitiation) | **POST** /resources/standalone/crypto/cryptoSourceOfFunds | Standalone crypto analysis |


<a name="standaloneCryptoInitiation"></a>
# **standaloneCryptoInitiation**
> standaloneCryptoInitiation().analysisStandaloneCryptoInitiationRequest(analysisStandaloneCryptoInitiationRequest).execute();

Standalone crypto analysis

Initiates standalone crypto analysis.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AnalysisApi;
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
    String direction = "direction_example"; // An operation type. Can be `withdrawal` or `deposit`.
    String address = "address_example"; // Target address hash.
    String txn = "txn_example"; // Transaction hash. For `withdrawals`, `txn` should not be set at all or set to `null`.
    String tokenId = "tokenId_example"; // Check the [Get available tokens](ref:get-available-tokens) method to get the full list of available currencies and token IDs.
    try {
      client
              .analysis
              .standaloneCryptoInitiation(currency, direction, address)
              .txn(txn)
              .tokenId(tokenId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisApi#standaloneCryptoInitiation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .analysis
              .standaloneCryptoInitiation(currency, direction, address)
              .txn(txn)
              .tokenId(tokenId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisApi#standaloneCryptoInitiation");
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
| **analysisStandaloneCryptoInitiationRequest** | [**AnalysisStandaloneCryptoInitiationRequest**](AnalysisStandaloneCryptoInitiationRequest.md)|  | [optional] |

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


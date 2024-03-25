# VaspApi

All URIs are relative to *https://api.sumsub.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAvailableVasps**](VaspApi.md#getAvailableVasps) | **GET** /resources/vasps/- | Get available VASPs |


<a name="getAvailableVasps"></a>
# **getAvailableVasps**
> Object getAvailableVasps().limit(limit).offset(offset).execute();

Get available VASPs

Returns a list of VASPs from the Sumsub VASP directory.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VaspApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    Integer limit = 10; // Maximum number of the VASPs to be returned. The maximum recommended value you can set is 100.
    Integer offset = 0; // Offset of the VASPs to be returned.
    try {
      Object result = client
              .vasp
              .getAvailableVasps()
              .limit(limit)
              .offset(offset)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VaspApi#getAvailableVasps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .vasp
              .getAvailableVasps()
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VaspApi#getAvailableVasps");
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
| **limit** | **Integer**| Maximum number of the VASPs to be returned. The maximum recommended value you can set is 100. | [optional] [default to 10] |
| **offset** | **Integer**| Offset of the VASPs to be returned. | [optional] [default to 0] |

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


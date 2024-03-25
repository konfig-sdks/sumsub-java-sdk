# AuditTrailEventApi

All URIs are relative to *https://api.sumsub.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEvents**](AuditTrailEventApi.md#getEvents) | **GET** /resources/auditTrailEvents | Audit trail events |


<a name="getEvents"></a>
# **getEvents**
> getEvents().subjectName(subjectName).activity(activity).from(from).to(to).limit(limit).offset(offset).execute();

Audit trail events

Returns audit trail events.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuditTrailEventApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String subjectName = "subjectName_example"; // The name of the subject for which events are received. If the name is not specified, events are received for all subjects on the key.
    String activity = "activity_example"; // If specified, only events with this activity will be in the response.
    String from = "from_example"; // From the date/time events are received (format yyyy-MM-dd HH:mm:ss, e.g. 2022-10-01 12:05:00). If it's not specified - events are received from yesterday.
    String to = "to_example"; // To the date/time events are received (format yyyy-MM-dd HH:mm:ss, e.g. 2022-10-01 12:15:00). If it's not specified - events are received up to now.
    String limit = "10"; // Max number of events in one request. Can't be more than 20000. By default is 10.
    String offset = "offset_example"; // Allows to skip the offset events before beginning to return the events. By default is 0.
    try {
      client
              .auditTrailEvent
              .getEvents()
              .subjectName(subjectName)
              .activity(activity)
              .from(from)
              .to(to)
              .limit(limit)
              .offset(offset)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditTrailEventApi#getEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .auditTrailEvent
              .getEvents()
              .subjectName(subjectName)
              .activity(activity)
              .from(from)
              .to(to)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditTrailEventApi#getEvents");
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
| **subjectName** | **String**| The name of the subject for which events are received. If the name is not specified, events are received for all subjects on the key. | [optional] |
| **activity** | **String**| If specified, only events with this activity will be in the response. | [optional] |
| **from** | **String**| From the date/time events are received (format yyyy-MM-dd HH:mm:ss, e.g. 2022-10-01 12:05:00). If it&#39;s not specified - events are received from yesterday. | [optional] |
| **to** | **String**| To the date/time events are received (format yyyy-MM-dd HH:mm:ss, e.g. 2022-10-01 12:15:00). If it&#39;s not specified - events are received up to now. | [optional] |
| **limit** | **String**| Max number of events in one request. Can&#39;t be more than 20000. By default is 10. | [optional] [default to 10] |
| **offset** | **String**| Allows to skip the offset events before beginning to return the events. By default is 0. | [optional] |

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


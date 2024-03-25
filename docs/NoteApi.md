# NoteApi

All URIs are relative to *https://api.sumsub.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToTransaction**](NoteApi.md#addToTransaction) | **POST** /resources/kyt/txns/notes | Add notes |
| [**getTransactionNotes**](NoteApi.md#getTransactionNotes) | **GET** /resources/kyt/txns/{id}/notes | Get notes |
| [**removeFromTransaction**](NoteApi.md#removeFromTransaction) | **DELETE** /resources/kyt/txns/notes | Remove notes |
| [**updateTransactionNotes**](NoteApi.md#updateTransactionNotes) | **PATCH** /resources/kyt/txns/notes | Edit notes |


<a name="addToTransaction"></a>
# **addToTransaction**
> addToTransaction().noteAddToTransactionRequest(noteAddToTransactionRequest).execute();

Add notes

Adds notes to transactions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NoteApi;
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
    String note = "note_example"; // A note to add.
    List<String> tags = Arrays.asList(); // [Tags](https://docs.sumsub.com/reference) that you may want to assign.
    try {
      client
              .note
              .addToTransaction(txnId, note)
              .tags(tags)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NoteApi#addToTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .note
              .addToTransaction(txnId, note)
              .tags(tags)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling NoteApi#addToTransaction");
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
| **noteAddToTransactionRequest** | [**NoteAddToTransactionRequest**](NoteAddToTransactionRequest.md)|  | [optional] |

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

<a name="getTransactionNotes"></a>
# **getTransactionNotes**
> getTransactionNotes(id).execute();

Get notes

Returns transaction notes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NoteApi;
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
    try {
      client
              .note
              .getTransactionNotes(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NoteApi#getTransactionNotes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .note
              .getTransactionNotes(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling NoteApi#getTransactionNotes");
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

<a name="removeFromTransaction"></a>
# **removeFromTransaction**
> removeFromTransaction().noteRemoveFromTransactionRequest(noteRemoveFromTransactionRequest).execute();

Remove notes

Removes notes from transactions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NoteApi;
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
    String id = "id_example"; // A unique note identifier.
    try {
      client
              .note
              .removeFromTransaction(txnId, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NoteApi#removeFromTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .note
              .removeFromTransaction(txnId, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling NoteApi#removeFromTransaction");
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
| **noteRemoveFromTransactionRequest** | [**NoteRemoveFromTransactionRequest**](NoteRemoveFromTransactionRequest.md)|  | [optional] |

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

<a name="updateTransactionNotes"></a>
# **updateTransactionNotes**
> updateTransactionNotes().noteUpdateTransactionNotesRequest(noteUpdateTransactionNotesRequest).execute();

Edit notes

Updates a note.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NoteApi;
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
    String id = "id_example"; // A unique note identifier.
    String note = "note_example"; // A new note.
    List<String> tags = Arrays.asList(); // [Tags](https://docs.sumsub.com/reference) that you may want to assign.
    try {
      client
              .note
              .updateTransactionNotes(txnId, id, note)
              .tags(tags)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NoteApi#updateTransactionNotes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .note
              .updateTransactionNotes(txnId, id, note)
              .tags(tags)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling NoteApi#updateTransactionNotes");
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
| **noteUpdateTransactionNotesRequest** | [**NoteUpdateTransactionNotesRequest**](NoteUpdateTransactionNotesRequest.md)|  | [optional] |

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


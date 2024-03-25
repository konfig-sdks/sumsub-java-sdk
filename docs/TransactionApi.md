# TransactionApi

All URIs are relative to *https://api.sumsub.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveReject**](TransactionApi.md#approveReject) | **POST** /resources/kyt/txns/{id}/review/status/completed | Approve and reject transaction |
| [**bulkImport**](TransactionApi.md#bulkImport) | **POST** /resources/kyt/misc/txns/import | Bulk transaction import |
| [**confirmOwnership**](TransactionApi.md#confirmOwnership) | **POST** /resources/kyt/txns/{txnId}/ownership/confirmed | Confirm transaction ownership |
| [**getOneData**](TransactionApi.md#getOneData) | **GET** /resources/kyt/txns/-;data.txnId&#x3D;{externalTxnId}/one | Get transaction information (externalTxnId) |
| [**informationOne**](TransactionApi.md#informationOne) | **GET** /resources/kyt/txns/{id}/one | Get transaction information |
| [**listTags**](TransactionApi.md#listTags) | **GET** /resources/kyt/txns/{id}/tags | Get tags |
| [**reScore**](TransactionApi.md#reScore) | **POST** /resources/kyt/txns/{id}/-/score | Re-score transaction |
| [**removeOwnership**](TransactionApi.md#removeOwnership) | **POST** /resources/kyt/txns/{txnId}/ownership/unconfirmed | Remove transaction ownership |
| [**removeTags**](TransactionApi.md#removeTags) | **DELETE** /resources/kyt/txns/{id}/tags | Remove tags |
| [**updateBlockchainInfo**](TransactionApi.md#updateBlockchainInfo) | **PATCH** /resources/kyt/txns/{txnId}/data/info | Patch transaction with chain transaction ID |
| [**updateProperties**](TransactionApi.md#updateProperties) | **PATCH** /resources/kyt/txns/{id}/props | Change transaction properties |


<a name="approveReject"></a>
# **approveReject**
> approveReject(id).transactionApproveRejectRequest(transactionApproveRejectRequest).execute();

Approve and reject transaction

Approves or rejects transactions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String id = "id_example"; // A unique transaction identification number.
    String reviewAnswer = "reviewAnswer_example"; // Sets the review answer. Can be `GREEN` or `RED`.
    try {
      client
              .transaction
              .approveReject(id)
              .reviewAnswer(reviewAnswer)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#approveReject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .approveReject(id)
              .reviewAnswer(reviewAnswer)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#approveReject");
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
| **id** | **String**| A unique transaction identification number. | |
| **transactionApproveRejectRequest** | [**TransactionApproveRejectRequest**](TransactionApproveRejectRequest.md)|  | [optional] |

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

<a name="bulkImport"></a>
# **bulkImport**
> bulkImport().ignoreErrors(ignoreErrors).scoreSavedTxns(scoreSavedTxns).transactionBulkImportRequest(transactionBulkImportRequest).execute();

Bulk transaction import

Imports a list of transactions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique identification number of the applicant who passed user verification (KYC).
    TransactionBulkImportRequestData data = new TransactionBulkImportRequestData();
    Boolean ignoreErrors = false; // <ul><li><code>true</code> — all valid transactions will be created and returned, errors will be ignored during the processing and listed in the response.</li><li><code>false</code> (default) — valid transactions will be created up to the first detected error. The response will only contain the error on which the processing was interrupted.</li></ul>
    Boolean scoreSavedTxns = true; // Allows you to control whether scoring should be run on imported transactions or not:<ul><li><code>true</code> (default) — start scoring after import.</li><li><code>false</code> — do not start scoring after import.</li></ul>
    try {
      client
              .transaction
              .bulkImport(applicantId, data)
              .ignoreErrors(ignoreErrors)
              .scoreSavedTxns(scoreSavedTxns)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#bulkImport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .bulkImport(applicantId, data)
              .ignoreErrors(ignoreErrors)
              .scoreSavedTxns(scoreSavedTxns)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#bulkImport");
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
| **ignoreErrors** | **Boolean**| &lt;ul&gt;&lt;li&gt;&lt;code&gt;true&lt;/code&gt; — all valid transactions will be created and returned, errors will be ignored during the processing and listed in the response.&lt;/li&gt;&lt;li&gt;&lt;code&gt;false&lt;/code&gt; (default) — valid transactions will be created up to the first detected error. The response will only contain the error on which the processing was interrupted.&lt;/li&gt;&lt;/ul&gt; | [optional] [default to false] |
| **scoreSavedTxns** | **Boolean**| Allows you to control whether scoring should be run on imported transactions or not:&lt;ul&gt;&lt;li&gt;&lt;code&gt;true&lt;/code&gt; (default) — start scoring after import.&lt;/li&gt;&lt;li&gt;&lt;code&gt;false&lt;/code&gt; — do not start scoring after import.&lt;/li&gt;&lt;/ul&gt; | [optional] [default to true] |
| **transactionBulkImportRequest** | [**TransactionBulkImportRequest**](TransactionBulkImportRequest.md)|  | [optional] |

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

<a name="confirmOwnership"></a>
# **confirmOwnership**
> confirmOwnership(txnId).execute();

Confirm transaction ownership

Confirms that the specified transaction belongs to your exchange (VASP).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    try {
      client
              .transaction
              .confirmOwnership(txnId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#confirmOwnership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .confirmOwnership(txnId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#confirmOwnership");
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

<a name="getOneData"></a>
# **getOneData**
> getOneData(externalTxnId).execute();

Get transaction information (externalTxnId)

Returns transaction information based on the provided &#x60;externalTxnId&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String externalTxnId = "externalTxnId_example"; // A unique transaction identifier on your side.
    try {
      client
              .transaction
              .getOneData(externalTxnId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getOneData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .getOneData(externalTxnId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getOneData");
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
| **externalTxnId** | **String**| A unique transaction identifier on your side. | |

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

<a name="informationOne"></a>
# **informationOne**
> informationOne(id).execute();

Get transaction information

Returns transaction information.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
              .transaction
              .informationOne(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#informationOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .informationOne(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#informationOne");
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

<a name="listTags"></a>
# **listTags**
> listTags(id).execute();

Get tags

Returns a list of transaction tags.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
              .transaction
              .listTags(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#listTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .listTags(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#listTags");
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

<a name="reScore"></a>
# **reScore**
> reScore(id).execute();

Re-score transaction

Re-scores transactions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String id = "id_example"; // A unique transaction identification number.
    try {
      client
              .transaction
              .reScore(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#reScore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .reScore(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#reScore");
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
| **id** | **String**| A unique transaction identification number. | |

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

<a name="removeOwnership"></a>
# **removeOwnership**
> removeOwnership(txnId).execute();

Remove transaction ownership

Removes the ownership from a previously confirmed transaction.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    try {
      client
              .transaction
              .removeOwnership(txnId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#removeOwnership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .removeOwnership(txnId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#removeOwnership");
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

<a name="removeTags"></a>
# **removeTags**
> removeTags(id).transactionRemoveTagsRequest(transactionRemoveTagsRequest).execute();

Remove tags

Removes tags from transactions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    List<String> RAW_BODY = Arrays.asList(); // Tags to remove. Case-sensitive.
    try {
      client
              .transaction
              .removeTags(id)
              .RAW_BODY(RAW_BODY)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#removeTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .removeTags(id)
              .RAW_BODY(RAW_BODY)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#removeTags");
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
| **transactionRemoveTagsRequest** | [**TransactionRemoveTagsRequest**](TransactionRemoveTagsRequest.md)|  | [optional] |

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

<a name="updateBlockchainInfo"></a>
# **updateBlockchainInfo**
> Object updateBlockchainInfo(txnId).transactionUpdateBlockchainInfoRequest(transactionUpdateBlockchainInfoRequest).execute();

Patch transaction with chain transaction ID

Updates information from the blockchain.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    String fingerprint = "fingerprint_example"; // A crypto transaction ID received from the blockchain.
    try {
      Object result = client
              .transaction
              .updateBlockchainInfo(txnId)
              .fingerprint(fingerprint)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#updateBlockchainInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .transaction
              .updateBlockchainInfo(txnId)
              .fingerprint(fingerprint)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#updateBlockchainInfo");
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
| **transactionUpdateBlockchainInfoRequest** | [**TransactionUpdateBlockchainInfoRequest**](TransactionUpdateBlockchainInfoRequest.md)|  | [optional] |

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

<a name="updateProperties"></a>
# **updateProperties**
> updateProperties(id).unsetKeys(unsetKeys).transactionUpdatePropertiesRequest(transactionUpdatePropertiesRequest).execute();

Change transaction properties

Updates transaction properties.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String customProperty = "newValue";
    String id = "id_example"; // A unique transaction identification number.
    String unsetKeys = "unsetKeys_example"; // A list of property names separated by commas that should be set to `null`.
    try {
      client
              .transaction
              .updateProperties(customProperty, id)
              .unsetKeys(unsetKeys)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#updateProperties");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .updateProperties(customProperty, id)
              .unsetKeys(unsetKeys)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#updateProperties");
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
| **id** | **String**| A unique transaction identification number. | |
| **unsetKeys** | **String**| A list of property names separated by commas that should be set to &#x60;null&#x60;. | [optional] |
| **transactionUpdatePropertiesRequest** | [**TransactionUpdatePropertiesRequest**](TransactionUpdatePropertiesRequest.md)|  | [optional] |

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


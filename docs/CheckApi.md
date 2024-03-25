# CheckApi

All URIs are relative to *https://api.sumsub.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**additionalCompanyData**](CheckApi.md#additionalCompanyData) | **GET** /resources/checks/latest?type&#x3D;COMPANY | Get additional company check data |
| [**additionalPoaData**](CheckApi.md#additionalPoaData) | **GET** /resources/checks/latest?type&#x3D;POA | Get additional PoA data |
| [**emailConfirmationResults**](CheckApi.md#emailConfirmationResults) | **GET** /resources/checks/latest?type&#x3D;EMAIL_CONFIRMATION | Get email confirmation check results |
| [**ipCheckResults**](CheckApi.md#ipCheckResults) | **GET** /resources/checks/latest?type&#x3D;IP_CHECK | Get IP check results |
| [**performNameCrossValidation**](CheckApi.md#performNameCrossValidation) | **POST** /resources/checks/crossCheck?comparisonMode&#x3D;{comparisonMode} | Perform name cross validation |
| [**phoneConfirmationResults**](CheckApi.md#phoneConfirmationResults) | **GET** /resources/checks/latest?type&#x3D;PHONE_CONFIRMATION | Get phone confirmation check results |
| [**tinSsnCheckResults**](CheckApi.md#tinSsnCheckResults) | **GET** /resources/checks/latest?type&#x3D;TIN | Get TIN (SSN) check results |


<a name="additionalCompanyData"></a>
# **additionalCompanyData**
> additionalCompanyData(applicantId).execute();

Get additional company check data

Returns company check results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .check
              .additionalCompanyData(applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#additionalCompanyData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .check
              .additionalCompanyData(applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#additionalCompanyData");
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
| **applicantId** | **String**| A unique applicant identifier. | |

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

<a name="additionalPoaData"></a>
# **additionalPoaData**
> additionalPoaData(applicantId).execute();

Get additional PoA data

Returns PoA data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .check
              .additionalPoaData(applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#additionalPoaData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .check
              .additionalPoaData(applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#additionalPoaData");
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
| **applicantId** | **String**| A unique applicant identifier. | |

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

<a name="emailConfirmationResults"></a>
# **emailConfirmationResults**
> emailConfirmationResults(applicantId).execute();

Get email confirmation check results

Returns email confirmation check results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .check
              .emailConfirmationResults(applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#emailConfirmationResults");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .check
              .emailConfirmationResults(applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#emailConfirmationResults");
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
| **applicantId** | **String**| A unique applicant identifier. | |

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

<a name="ipCheckResults"></a>
# **ipCheckResults**
> ipCheckResults(applicantId).execute();

Get IP check results

Returns IP check results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .check
              .ipCheckResults(applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#ipCheckResults");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .check
              .ipCheckResults(applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#ipCheckResults");
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
| **applicantId** | **String**| A unique applicant identifier. | |

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

<a name="performNameCrossValidation"></a>
# **performNameCrossValidation**
> performNameCrossValidation(comparisonMode).checkPerformNameCrossValidationRequest(checkPerformNameCrossValidationRequest).execute();

Perform name cross validation

Performs a name cross validation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    List<CheckPerformNameCrossValidationRequestIdDocsInner> idDocs = Arrays.asList(); // A list with a maximum of two objects to be compared.
    String comparisonMode = "comparisonMode_example"; // Data comparison mode. See the [possible values](/reference/perform-name-cross-validation#possible-comparisonmode-values).
    try {
      client
              .check
              .performNameCrossValidation(idDocs, comparisonMode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#performNameCrossValidation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .check
              .performNameCrossValidation(idDocs, comparisonMode)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#performNameCrossValidation");
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
| **comparisonMode** | **String**| Data comparison mode. See the [possible values](/reference/perform-name-cross-validation#possible-comparisonmode-values). | |
| **checkPerformNameCrossValidationRequest** | [**CheckPerformNameCrossValidationRequest**](CheckPerformNameCrossValidationRequest.md)|  | [optional] |

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

<a name="phoneConfirmationResults"></a>
# **phoneConfirmationResults**
> phoneConfirmationResults(applicantId).execute();

Get phone confirmation check results

Returns phone confirmation check results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identifier.
    try {
      client
              .check
              .phoneConfirmationResults(applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#phoneConfirmationResults");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .check
              .phoneConfirmationResults(applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#phoneConfirmationResults");
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
| **applicantId** | **String**| A unique applicant identifier. | |

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

<a name="tinSsnCheckResults"></a>
# **tinSsnCheckResults**
> tinSsnCheckResults(applicantId).execute();

Get TIN (SSN) check results

Returns TIN (SSN) check results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sumsub;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sumsub.com";
    
    configuration.sec0  = "YOUR API KEY";
    Sumsub client = new Sumsub(configuration);
    String applicantId = "applicantId_example"; // A unique applicant identification number.
    try {
      client
              .check
              .tinSsnCheckResults(applicantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#tinSsnCheckResults");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .check
              .tinSsnCheckResults(applicantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#tinSsnCheckResults");
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
| **applicantId** | **String**| A unique applicant identification number. | |

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


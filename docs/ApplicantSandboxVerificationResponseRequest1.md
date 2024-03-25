

# ApplicantSandboxVerificationResponseRequest1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reviewAnswer** | **String** | A &#x60;GREEN&#x60; or &#x60;RED&#x60; label under which you want to simulate the response. For more information, see [this article](https://docs.sumsub.com/reference). |  |
|**rejectLabels** | **List&lt;String&gt;** | An array of [rejection labels](/docs/receive-and-interpret-results-via-api#understand-rejection). |  |
|**reviewRejectType** | **String** | A &#x60;FINAL&#x60; or &#x60;RETRY&#x60; rejection type indicating whether a rejection should be final or temporary. |  [optional] |
|**clientComment** | **String** | A rejection comment that should not be available to your applicants. |  [optional] |
|**moderationComment** | **String** | A comment that supposed to be shown to the applicant, explaining the reason of rejection. |  [optional] |




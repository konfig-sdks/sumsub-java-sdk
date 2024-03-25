

# ApplicantUpdateTopLevelInfoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique applicant identifier. |  |
|**externalUserId** | **String** | An external applicant identifier. |  [optional] |
|**email** | **String** | A new email address that you want to assign to the given applicant. |  [optional] |
|**phone** | **String** | A new phone number that you want to assign to the given applicant. |  [optional] |
|**sourceKey** | **String** | A new [source key](https://docs.sumsub.com/reference) that you want to assign to the given applicant. |  [optional] |
|**lang** | **String** | The language, in which the applicant should see the verification results. |  [optional] |
|**questionnaires** | **List&lt;Object&gt;** | A [questionnaire](https://docs.sumsub.com/reference) configuration with answers. |  [optional] |
|**metadata** | **List&lt;Object&gt;** | Additional information about the applicant. |  [optional] |
|**deleted** | **Boolean** | Marks an applicant as inactive if set to &#x60;true&#x60;. The applicant will not be considered a duplicate. SDKs will not initiate checks for this applicant. |  [optional] |




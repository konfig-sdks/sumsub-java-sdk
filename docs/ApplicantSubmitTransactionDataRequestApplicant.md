

# ApplicantSubmitTransactionDataRequestApplicant

Transaction participant data with mandatory `applicantId` (sender or remitter, depending on `info.direction`).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalUserId** | **String** | An external identifier of the transaction participant (applicant or counterparty). Each participant must have a unique identifier that must be reused during all subsequent transactions. Make sure to use the same &#x60;externalUserID&#x60; for the same counterparty or applicant. |  |
|**fullName** | **String** | Full name of the participant. |  |
|**type** | **String** | Participant entity type: &#x60;company&#x60; or &#x60;individual&#x60;. Set to &#x60;individual&#x60; by default. |  |
|**address** | [**ApplicantSubmitTransactionDataRequestApplicantAddress**](ApplicantSubmitTransactionDataRequestApplicantAddress.md) |  |  [optional] |
|**institutionInfo** | [**ApplicantSubmitTransactionDataRequestApplicantInstitutionInfo**](ApplicantSubmitTransactionDataRequestApplicantInstitutionInfo.md) |  |  [optional] |
|**paymentMethod** | [**ApplicantSubmitTransactionDataRequestApplicantPaymentMethod**](ApplicantSubmitTransactionDataRequestApplicantPaymentMethod.md) |  |  [optional] |
|**device** | [**ApplicantSubmitTransactionDataRequestApplicantDevice**](ApplicantSubmitTransactionDataRequestApplicantDevice.md) |  |  [optional] |
|**idDocs** | [**List&lt;ApplicantSubmitTransactionDataRequestApplicantIdDocsInner&gt;**](ApplicantSubmitTransactionDataRequestApplicantIdDocsInner.md) | Data about the user and their documents. |  [optional] |




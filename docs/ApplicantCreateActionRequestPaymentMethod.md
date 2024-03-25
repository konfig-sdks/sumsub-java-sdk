

# ApplicantCreateActionRequestPaymentMethod

Object that represents a specific payment method required from the applicant. You can send the data that will be shown to the user as a hint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | A payment type. Can be: &#x60;bankCard&#x60;, &#x60;eWallet&#x60;, &#x60;wireTransfer&#x60;. |  |
|**subType** | **String** | A payment subtype. For example, &#x60;VISA&#x60;, &#x60;MASTERCARD&#x60;, etc. |  [optional] |
|**data** | [**ApplicantCreateActionRequestPaymentMethodData**](ApplicantCreateActionRequestPaymentMethodData.md) |  |  [optional] |




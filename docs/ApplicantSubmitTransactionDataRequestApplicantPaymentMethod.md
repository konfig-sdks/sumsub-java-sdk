

# ApplicantSubmitTransactionDataRequestApplicantPaymentMethod

Information about the payment method.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Payment method type: &#x60;card&#x60;/&#x60;account&#x60;/&#x60;crypto&#x60;. |  [optional] |
|**accountId** | **String** | Representation of the account ID: Account number, IBAN or DC hash for &#x60;card&#x60;, crypto wallet address for &#x60;crypto&#x60; type etc. |  [optional] |
|**issuingCountry** | **String** | The payment issuing country code in Alpha-3 format. |  [optional] |
|**_3dsUsed** | **Boolean** | Indication of 3d secure auth being used. |  [optional] |
|**_2faUsed** | **Boolean** | Indication of 2fa being used. |  [optional] |




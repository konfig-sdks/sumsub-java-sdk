

# TransactionBulkImportRequestData

An object representing the transaction. For more information on the structure, see [Submit transaction for existing applicant](ref:submit-transaction-for-existing-applicant).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**info** | [**TransactionBulkImportRequestDataInfo**](TransactionBulkImportRequestDataInfo.md) |  |  [optional] |
|**txnId** | **String** | A unique transaction identifier. |  |
|**txnDate** | **LocalDate** | Time when the transaction was initiated (format &#x60;yyyy-MM-dd HH:mm:ss+XXXX&#x60;, e.g. 2022-11-24 23:37:02+0000). |  [optional] |
|**props** | **String** | Transaction properties. Map of strings - JSON of custom keys and string values. |  [optional] |
|**applicant** | [**TransactionBulkImportRequestDataApplicant**](TransactionBulkImportRequestDataApplicant.md) |  |  [optional] |
|**counterparty** | [**TransactionBulkImportRequestDataCounterparty**](TransactionBulkImportRequestDataCounterparty.md) |  |  [optional] |
|**type** | **String** | Transaction type. Takes predefined values: &#x60;finance&#x60;/&#x60;gamblingBet&#x60;/&#x60;gamblingLimitChange&#x60;/&#x60;kyc&#x60;/&#x60;login&#x60;/&#x60;signup&#x60;/&#x60;passwordChange&#x60;/&#x60;twoFaReset&#x60;/&#x60;travelRule&#x60; (&#x60;finance&#x60; by default). |  [optional] |
|**sourceKey** | **String** | Source Key indication to separate accesses to transactions. |  [optional] |




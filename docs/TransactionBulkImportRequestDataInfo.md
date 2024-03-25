

# TransactionBulkImportRequestDataInfo

Transaction information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**direction** | **String** | Can be &#x60;out&#x60; (applicant sends to counterparty) or &#x60;in&#x60; (counterparty sends to applicant). |  |
|**amount** | **Double** | The amount of funds used in this transaction. |  |
|**amountInDefaultCurrency** | **Double** | The amount of funds used in this transaction in the default currency. For more precise calculations, you can submit already converted default currency amount in this field. |  [optional] |
|**currencyCode** | **String** | Currency code (&#x60;USD&#x60;, &#x60;GBP&#x60;, &#x60;BTC&#x60;, etc). |  |
|**cryptoChain** | **String** | The crypto chain name. Mandatory for crypto tokens only. Specifies the network name to which the token at &#x60;currencyCode&#x60; belongs. Empty for native tokens (e.g. for &#x60;BTC&#x60;, &#x60;ETH&#x60;). For more information, see [chain codes](ref:crypto-chain-codes). |  [optional] |
|**paymentTxnId** | **String** | Crypto transaction ID from the blockchain. Required for crypto check requests only. |  [optional] |
|**paymentDetails** | **String** | A comment with payment details. |  [optional] |
|**type** | **String** | Accepts any value that helps you categorize transactions. For example, for gambling transactions, you can specify &#x60;bonus&#x60;, &#x60;payroll&#x60;, or &#x60;cashback&#x60;. |  [optional] |




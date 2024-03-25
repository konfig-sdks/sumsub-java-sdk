

# AnalysisStandaloneCryptoInitiationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | &#x60;BTC&#x60;, &#x60;ETH&#x60;, &#x60;BCH&#x60;, &#x60;LTC&#x60;, &#x60;USDT&#x60;, &#x60;ERC-20&#x60;, &#x60;BSV&#x60;, &#x60;XLM&#x60;, ... |  |
|**direction** | **String** | An operation type. Can be &#x60;withdrawal&#x60; or &#x60;deposit&#x60;. |  |
|**txn** | **String** | Transaction hash. For &#x60;withdrawals&#x60;, &#x60;txn&#x60; should not be set at all or set to &#x60;null&#x60;. |  [optional] |
|**address** | **String** | Target address hash. |  |
|**tokenId** | **String** | Check the [Get available tokens](ref:get-available-tokens) method to get the full list of available currencies and token IDs. |  [optional] |




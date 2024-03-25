

# ApplicantSubmitTransactionForNonExistingRequest1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**info** | [**ApplicantSubmitTransactionDataRequestInfo**](ApplicantSubmitTransactionDataRequestInfo.md) |  |  |
|**txnId** | **String** | A unique transaction identification number. |  |
|**txnDate** | **LocalDate** | Date and time when the transaction was initiated (format &#x60;yyyy-MM-dd HH:mm:ss+XXXX&#x60;, e.g. 2022-11-24 23:37:02+0000). |  [optional] |
|**props** | **Object** | Transaction properties. Map of strings (JSON) of custom keys and string values. |  [optional] |
|**applicant** | [**ApplicantSubmitTransactionForNonExistingRequest1Applicant**](ApplicantSubmitTransactionForNonExistingRequest1Applicant.md) |  |  |
|**counterparty** | [**ApplicantSubmitTransactionForNonExistingRequest1Counterparty**](ApplicantSubmitTransactionForNonExistingRequest1Counterparty.md) |  |  |
|**type** | **String** | A transaction type. Expects values: &lt;/br&gt; &lt;ul&gt;   &lt;li&gt;&lt;code&gt;finance&lt;/code&gt;(default)&lt;/li&gt;   &lt;li&gt;&lt;code&gt;gamblingBet&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;gamblingLimitChange&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;gamblingBonusChange&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;kyc&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;travelRule&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;userPlatformEvent&lt;/code&gt;&lt;/li&gt;   &lt;ul&gt;     &lt;li&gt;&lt;code&gt;login&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;signup&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;passwordChange&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;twoFaReset&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/ul&gt; |  [optional] |
|**sourceKey** | **String** | A source key indication to separate access to transactions. |  [optional] |




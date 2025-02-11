/*
 * Sumsub API
 * Sumsub is the one verification platform to secure the whole user journey. With Sumsub's customizable KYC, KYB, transaction monitoring and fraud prevention solutions, you can orchestrate your verification process, welcome more customers worldwide, meet compliance requirements, reduce costs and protect your business.  Sumsub has over 2,000 clients in fintech, crypto, transportation, trading, e-commerce and gaming industries including Binance, Wirex, Avis, Bybit, Huobi, Unlimit, Flutter, Kaizen Gaming, and TransferGo.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TokenApi
 */
@Disabled
public class TokenApiTest {

    private static TokenApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TokenApi(apiClient);
    }

    /**
     * Generate access token
     *
     * Creates an applicant action token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createActionTokenTest() throws ApiException {
        String userId = null;
        String externalActionId = null;
        String levelName = null;
        String ttlInSecs = null;
        api.createActionToken(userId, externalActionId, levelName)
                .ttlInSecs(ttlInSecs)
                .execute();
        // TODO: test validations
    }

    /**
     * Get available tokens
     *
     * Returns available tokens.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAvailableCurrenciesTest() throws ApiException {
        api.getAvailableCurrencies()
                .execute();
        // TODO: test validations
    }

}

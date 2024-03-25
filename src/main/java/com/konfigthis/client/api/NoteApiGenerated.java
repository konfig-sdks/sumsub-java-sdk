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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.NoteAddToTransactionRequest;
import com.konfigthis.client.model.NoteAddToTransactionRequest1;
import com.konfigthis.client.model.NoteRemoveFromTransactionRequest;
import com.konfigthis.client.model.NoteRemoveFromTransactionRequest1;
import com.konfigthis.client.model.NoteUpdateTransactionNotesRequest;
import com.konfigthis.client.model.NoteUpdateTransactionNotesRequest1;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class NoteApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NoteApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public NoteApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getSec0() == null) {
            throw new IllegalArgumentException("\"X-App-Token\" is required but no API key was provided. Please set \"X-App-Token\" with ApiClient#setSec0(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call addToTransactionCall(NoteAddToTransactionRequest noteAddToTransactionRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = noteAddToTransactionRequest;

        // create path and map variables
        String localVarPath = "/resources/kyt/txns/notes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addToTransactionValidateBeforeCall(NoteAddToTransactionRequest noteAddToTransactionRequest, final ApiCallback _callback) throws ApiException {
        return addToTransactionCall(noteAddToTransactionRequest, _callback);

    }


    private ApiResponse<Void> addToTransactionWithHttpInfo(NoteAddToTransactionRequest noteAddToTransactionRequest) throws ApiException {
        okhttp3.Call localVarCall = addToTransactionValidateBeforeCall(noteAddToTransactionRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call addToTransactionAsync(NoteAddToTransactionRequest noteAddToTransactionRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addToTransactionValidateBeforeCall(noteAddToTransactionRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class AddToTransactionRequestBuilder {
        private final String txnId;
        private final String note;
        private List<String> tags;

        private AddToTransactionRequestBuilder(String txnId, String note) {
            this.txnId = txnId;
            this.note = note;
        }

        /**
         * Set tags
         * @param tags [Tags](https://docs.sumsub.com/reference) that you may want to assign. (optional)
         * @return AddToTransactionRequestBuilder
         */
        public AddToTransactionRequestBuilder tags(List<String> tags) {
            this.tags = tags;
            return this;
        }
        
        /**
         * Build call for addToTransaction
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            NoteAddToTransactionRequest noteAddToTransactionRequest = buildBodyParams();
            return addToTransactionCall(noteAddToTransactionRequest, _callback);
        }

        private NoteAddToTransactionRequest buildBodyParams() {
            NoteAddToTransactionRequest noteAddToTransactionRequest = new NoteAddToTransactionRequest();
            noteAddToTransactionRequest.tags(this.tags);
            noteAddToTransactionRequest.txnId(this.txnId);
            noteAddToTransactionRequest.note(this.note);
            return noteAddToTransactionRequest;
        }

        /**
         * Execute addToTransaction request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            NoteAddToTransactionRequest noteAddToTransactionRequest = buildBodyParams();
            addToTransactionWithHttpInfo(noteAddToTransactionRequest);
        }

        /**
         * Execute addToTransaction request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            NoteAddToTransactionRequest noteAddToTransactionRequest = buildBodyParams();
            return addToTransactionWithHttpInfo(noteAddToTransactionRequest);
        }

        /**
         * Execute addToTransaction request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            NoteAddToTransactionRequest noteAddToTransactionRequest = buildBodyParams();
            return addToTransactionAsync(noteAddToTransactionRequest, _callback);
        }
    }

    /**
     * Add notes
     * Adds notes to transactions.
     * @return AddToTransactionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AddToTransactionRequestBuilder addToTransaction(String txnId, String note) throws IllegalArgumentException {
        if (txnId == null) throw new IllegalArgumentException("\"txnId\" is required but got null");
            

        if (note == null) throw new IllegalArgumentException("\"note\" is required but got null");
            

        return new AddToTransactionRequestBuilder(txnId, note);
    }
    private okhttp3.Call getTransactionNotesCall(String id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/resources/kyt/txns/{id}/notes"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionNotesValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTransactionNotes(Async)");
        }

        return getTransactionNotesCall(id, _callback);

    }


    private ApiResponse<Void> getTransactionNotesWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getTransactionNotesValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call getTransactionNotesAsync(String id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransactionNotesValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class GetTransactionNotesRequestBuilder {
        private final String id;

        private GetTransactionNotesRequestBuilder(String id) {
            this.id = id;
        }

        /**
         * Build call for getTransactionNotes
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getTransactionNotesCall(id, _callback);
        }


        /**
         * Execute getTransactionNotes request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            getTransactionNotesWithHttpInfo(id);
        }

        /**
         * Execute getTransactionNotes request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return getTransactionNotesWithHttpInfo(id);
        }

        /**
         * Execute getTransactionNotes request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return getTransactionNotesAsync(id, _callback);
        }
    }

    /**
     * Get notes
     * Returns transaction notes.
     * @param id A unique transaction identifier. (required)
     * @return GetTransactionNotesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetTransactionNotesRequestBuilder getTransactionNotes(String id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        return new GetTransactionNotesRequestBuilder(id);
    }
    private okhttp3.Call removeFromTransactionCall(NoteRemoveFromTransactionRequest noteRemoveFromTransactionRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = noteRemoveFromTransactionRequest;

        // create path and map variables
        String localVarPath = "/resources/kyt/txns/notes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeFromTransactionValidateBeforeCall(NoteRemoveFromTransactionRequest noteRemoveFromTransactionRequest, final ApiCallback _callback) throws ApiException {
        return removeFromTransactionCall(noteRemoveFromTransactionRequest, _callback);

    }


    private ApiResponse<Void> removeFromTransactionWithHttpInfo(NoteRemoveFromTransactionRequest noteRemoveFromTransactionRequest) throws ApiException {
        okhttp3.Call localVarCall = removeFromTransactionValidateBeforeCall(noteRemoveFromTransactionRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call removeFromTransactionAsync(NoteRemoveFromTransactionRequest noteRemoveFromTransactionRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeFromTransactionValidateBeforeCall(noteRemoveFromTransactionRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class RemoveFromTransactionRequestBuilder {
        private final String txnId;
        private final String id;

        private RemoveFromTransactionRequestBuilder(String txnId, String id) {
            this.txnId = txnId;
            this.id = id;
        }

        /**
         * Build call for removeFromTransaction
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            NoteRemoveFromTransactionRequest noteRemoveFromTransactionRequest = buildBodyParams();
            return removeFromTransactionCall(noteRemoveFromTransactionRequest, _callback);
        }

        private NoteRemoveFromTransactionRequest buildBodyParams() {
            NoteRemoveFromTransactionRequest noteRemoveFromTransactionRequest = new NoteRemoveFromTransactionRequest();
            noteRemoveFromTransactionRequest.txnId(this.txnId);
            noteRemoveFromTransactionRequest.id(this.id);
            return noteRemoveFromTransactionRequest;
        }

        /**
         * Execute removeFromTransaction request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            NoteRemoveFromTransactionRequest noteRemoveFromTransactionRequest = buildBodyParams();
            removeFromTransactionWithHttpInfo(noteRemoveFromTransactionRequest);
        }

        /**
         * Execute removeFromTransaction request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            NoteRemoveFromTransactionRequest noteRemoveFromTransactionRequest = buildBodyParams();
            return removeFromTransactionWithHttpInfo(noteRemoveFromTransactionRequest);
        }

        /**
         * Execute removeFromTransaction request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            NoteRemoveFromTransactionRequest noteRemoveFromTransactionRequest = buildBodyParams();
            return removeFromTransactionAsync(noteRemoveFromTransactionRequest, _callback);
        }
    }

    /**
     * Remove notes
     * Removes notes from transactions.
     * @return RemoveFromTransactionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public RemoveFromTransactionRequestBuilder removeFromTransaction(String txnId, String id) throws IllegalArgumentException {
        if (txnId == null) throw new IllegalArgumentException("\"txnId\" is required but got null");
            

        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        return new RemoveFromTransactionRequestBuilder(txnId, id);
    }
    private okhttp3.Call updateTransactionNotesCall(NoteUpdateTransactionNotesRequest noteUpdateTransactionNotesRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = noteUpdateTransactionNotesRequest;

        // create path and map variables
        String localVarPath = "/resources/kyt/txns/notes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateTransactionNotesValidateBeforeCall(NoteUpdateTransactionNotesRequest noteUpdateTransactionNotesRequest, final ApiCallback _callback) throws ApiException {
        return updateTransactionNotesCall(noteUpdateTransactionNotesRequest, _callback);

    }


    private ApiResponse<Void> updateTransactionNotesWithHttpInfo(NoteUpdateTransactionNotesRequest noteUpdateTransactionNotesRequest) throws ApiException {
        okhttp3.Call localVarCall = updateTransactionNotesValidateBeforeCall(noteUpdateTransactionNotesRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call updateTransactionNotesAsync(NoteUpdateTransactionNotesRequest noteUpdateTransactionNotesRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateTransactionNotesValidateBeforeCall(noteUpdateTransactionNotesRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class UpdateTransactionNotesRequestBuilder {
        private final String txnId;
        private final String id;
        private final String note;
        private List<String> tags;

        private UpdateTransactionNotesRequestBuilder(String txnId, String id, String note) {
            this.txnId = txnId;
            this.id = id;
            this.note = note;
        }

        /**
         * Set tags
         * @param tags [Tags](https://docs.sumsub.com/reference) that you may want to assign. (optional)
         * @return UpdateTransactionNotesRequestBuilder
         */
        public UpdateTransactionNotesRequestBuilder tags(List<String> tags) {
            this.tags = tags;
            return this;
        }
        
        /**
         * Build call for updateTransactionNotes
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            NoteUpdateTransactionNotesRequest noteUpdateTransactionNotesRequest = buildBodyParams();
            return updateTransactionNotesCall(noteUpdateTransactionNotesRequest, _callback);
        }

        private NoteUpdateTransactionNotesRequest buildBodyParams() {
            NoteUpdateTransactionNotesRequest noteUpdateTransactionNotesRequest = new NoteUpdateTransactionNotesRequest();
            noteUpdateTransactionNotesRequest.tags(this.tags);
            noteUpdateTransactionNotesRequest.txnId(this.txnId);
            noteUpdateTransactionNotesRequest.id(this.id);
            noteUpdateTransactionNotesRequest.note(this.note);
            return noteUpdateTransactionNotesRequest;
        }

        /**
         * Execute updateTransactionNotes request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            NoteUpdateTransactionNotesRequest noteUpdateTransactionNotesRequest = buildBodyParams();
            updateTransactionNotesWithHttpInfo(noteUpdateTransactionNotesRequest);
        }

        /**
         * Execute updateTransactionNotes request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            NoteUpdateTransactionNotesRequest noteUpdateTransactionNotesRequest = buildBodyParams();
            return updateTransactionNotesWithHttpInfo(noteUpdateTransactionNotesRequest);
        }

        /**
         * Execute updateTransactionNotes request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            NoteUpdateTransactionNotesRequest noteUpdateTransactionNotesRequest = buildBodyParams();
            return updateTransactionNotesAsync(noteUpdateTransactionNotesRequest, _callback);
        }
    }

    /**
     * Edit notes
     * Updates a note.
     * @return UpdateTransactionNotesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public UpdateTransactionNotesRequestBuilder updateTransactionNotes(String txnId, String id, String note) throws IllegalArgumentException {
        if (txnId == null) throw new IllegalArgumentException("\"txnId\" is required but got null");
            

        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        if (note == null) throw new IllegalArgumentException("\"note\" is required but got null");
            

        return new UpdateTransactionNotesRequestBuilder(txnId, id, note);
    }
}

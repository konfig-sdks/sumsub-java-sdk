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
import com.konfigthis.client.model.ApplicantAddBeneficiaryRequest;
import com.konfigthis.client.model.ApplicantAddBeneficiaryRequest1;
import com.konfigthis.client.model.ApplicantAddBeneficiaryRequestApplicant;
import com.konfigthis.client.model.ApplicantAddConsentToProfileRequest;
import com.konfigthis.client.model.ApplicantAddConsentToProfileRequest1;
import com.konfigthis.client.model.ApplicantAddConsentToProfileRequestRecordsInner;
import com.konfigthis.client.model.ApplicantAddCustomTagsRequest;
import com.konfigthis.client.model.ApplicantAddCustomTagsRequest1;
import com.konfigthis.client.model.ApplicantAddCustomTagsRequest2;
import com.konfigthis.client.model.ApplicantAddCustomTagsRequest3;
import com.konfigthis.client.model.ApplicantAddIdDocumentRequest;
import com.konfigthis.client.model.ApplicantAddIdDocumentRequest1;
import com.konfigthis.client.model.ApplicantAddIdDocumentRequestMetadata;
import com.konfigthis.client.model.ApplicantAddIdDocumentResponse;
import com.konfigthis.client.model.ApplicantAddImageToPaymentMethodRequest;
import com.konfigthis.client.model.ApplicantAddImageToPaymentMethodRequest1;
import com.konfigthis.client.model.ApplicantAddImageToPaymentMethodRequestMetadata;
import com.konfigthis.client.model.ApplicantAddPaymentMethodInformationRequest;
import com.konfigthis.client.model.ApplicantAddPaymentMethodInformationRequest1;
import com.konfigthis.client.model.ApplicantChangeCompanyDataRequest;
import com.konfigthis.client.model.ApplicantChangeCompanyDataRequest1;
import com.konfigthis.client.model.ApplicantChangeExtractedInfoRequest;
import com.konfigthis.client.model.ApplicantChangeExtractedInfoRequest1;
import com.konfigthis.client.model.ApplicantConfirmDataRequest;
import com.konfigthis.client.model.ApplicantConfirmDataRequest1;
import com.konfigthis.client.model.ApplicantConfirmDataRequestOauth;
import com.konfigthis.client.model.ApplicantConfirmDataRequestOtp;
import com.konfigthis.client.model.ApplicantCreateActionRequest;
import com.konfigthis.client.model.ApplicantCreateActionRequest1;
import com.konfigthis.client.model.ApplicantCreateActionRequestPaymentMethod;
import com.konfigthis.client.model.ApplicantCreateActionRequestPaymentMethodData;
import com.konfigthis.client.model.ApplicantCreateCryptoSourceOfFundsRequest;
import com.konfigthis.client.model.ApplicantCreateCryptoSourceOfFundsRequest1;
import com.konfigthis.client.model.ApplicantCreatePaymentSourceActionsRequest;
import com.konfigthis.client.model.ApplicantCreatePaymentSourceActionsRequest1;
import com.konfigthis.client.model.ApplicantCreatePaymentSourceActionsRequestPaymentSource;
import com.konfigthis.client.model.ApplicantCreatePaymentSourceActionsResponse;
import com.konfigthis.client.model.ApplicantEnrichTransactionWithTravelRuleDataRequest;
import com.konfigthis.client.model.ApplicantEnrichTransactionWithTravelRuleDataRequest1;
import com.konfigthis.client.model.ApplicantImportByArchiveRequest;
import com.konfigthis.client.model.ApplicantImportByArchiveRequest1;
import com.konfigthis.client.model.ApplicantImportCompletedRequest;
import com.konfigthis.client.model.ApplicantImportCompletedRequest1;
import com.konfigthis.client.model.ApplicantImportCompletedRequestInfo;
import com.konfigthis.client.model.ApplicantImportCompletedRequestReview;
import com.konfigthis.client.model.ApplicantRemoveCustomTagsRequest;
import com.konfigthis.client.model.ApplicantRemoveCustomTagsRequest1;
import com.konfigthis.client.model.ApplicantSandboxVerificationResponseRequest;
import com.konfigthis.client.model.ApplicantSandboxVerificationResponseRequest1;
import com.konfigthis.client.model.ApplicantSubmitDataNoDocVerificationRequest;
import com.konfigthis.client.model.ApplicantSubmitDataNoDocVerificationRequest1;
import com.konfigthis.client.model.ApplicantSubmitDataNoDocVerificationRequestInfo;
import com.konfigthis.client.model.ApplicantSubmitTransactionDataRequest;
import com.konfigthis.client.model.ApplicantSubmitTransactionDataRequest1;
import com.konfigthis.client.model.ApplicantSubmitTransactionDataRequestApplicant;
import com.konfigthis.client.model.ApplicantSubmitTransactionDataRequestCounterparty;
import com.konfigthis.client.model.ApplicantSubmitTransactionDataRequestInfo;
import com.konfigthis.client.model.ApplicantSubmitTransactionDataRequestProps;
import com.konfigthis.client.model.ApplicantSubmitTransactionForNonExistingRequest;
import com.konfigthis.client.model.ApplicantSubmitTransactionForNonExistingRequest1;
import com.konfigthis.client.model.ApplicantSubmitTransactionForNonExistingRequestApplicant;
import com.konfigthis.client.model.ApplicantSubmitTransactionForNonExistingRequestCounterparty;
import com.konfigthis.client.model.ApplicantUpdateFixedInfoRequest;
import com.konfigthis.client.model.ApplicantUpdateFixedInfoRequest1;
import com.konfigthis.client.model.ApplicantUpdateTopLevelInfoRequest;
import com.konfigthis.client.model.ApplicantUpdateTopLevelInfoRequest1;
import java.io.File;
import java.time.LocalDate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicantApi
 */
@Disabled
public class ApplicantApiTest {

    private static ApplicantApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ApplicantApi(apiClient);
    }

    /**
     * Add applicant as beneficiary
     *
     * Adds an existing individual applicant as a beneficiary.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addBeneficiaryTest() throws ApiException {
        ApplicantAddBeneficiaryRequestApplicant applicant = null;
        String applicantId = null;
        String type = null;
        String applicantId = null;
        List<String> positions = null;
        api.addBeneficiary(applicant, applicantId, type, applicantId)
                .positions(positions)
                .execute();
        // TODO: test validations
    }

    /**
     * Add applicant consent
     *
     * Adds a consent to an applicant profile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addConsentToProfileTest() throws ApiException {
        List<ApplicantAddConsentToProfileRequestRecordsInner> records = null;
        String applicantId = null;
        String acceptedAt = null;
        String residenceCountry = null;
        api.addConsentToProfile(records, applicantId)
                .acceptedAt(acceptedAt)
                .residenceCountry(residenceCountry)
                .execute();
        // TODO: test validations
    }

    /**
     * Add custom applicant tags
     *
     * Adds custom tags to applicant profiles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCustomTagsTest() throws ApiException {
        String applicantId = null;
        List<String> RAW_BODY = null;
        api.addCustomTags(applicantId)
                .RAW_BODY(RAW_BODY)
                .execute();
        // TODO: test validations
    }

    /**
     * Add and overwrite custom applicant tags
     *
     * Adds and overwrites custom tags in applicant profiles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCustomTags_0Test() throws ApiException {
        String applicantId = null;
        List<String> RAW_BODY = null;
        api.addCustomTags_0(applicantId)
                .RAW_BODY(RAW_BODY)
                .execute();
        // TODO: test validations
    }

    /**
     * Add ID document
     *
     * Adds an identification document to be verified.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addIdDocumentTest() throws ApiException {
        Boolean xReturnDocWarnings = null;
        String applicantId = null;
        ApplicantAddIdDocumentRequestMetadata metadata = null;
        File content = null;
        ApplicantAddIdDocumentResponse response = api.addIdDocument(xReturnDocWarnings, applicantId)
                .metadata(metadata)
                .content(content)
                .execute();
        // TODO: test validations
    }

    /**
     * Add image to payment method
     *
     * Adds an image to the payment method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addImageToPaymentMethodTest() throws ApiException {
        File content = null;
        ApplicantAddImageToPaymentMethodRequestMetadata metadata = null;
        String actionId = null;
        api.addImageToPaymentMethod(content, metadata, actionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Add payment method information
     *
     * Adds additional information to the payment method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addPaymentMethodInformationTest() throws ApiException {
        String type = null;
        String actionId = null;
        String subType = null;
        ApplicantCreateActionRequestPaymentMethodData data = null;
        api.addPaymentMethodInformation(type, actionId)
                .subType(subType)
                .data(data)
                .execute();
        // TODO: test validations
    }

    /**
     * Add applicant to blocklist
     *
     * Add an applicant to blocklist.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addToBlocklistTest() throws ApiException {
        String note = null;
        String applicantId = null;
        api.addToBlocklist(note, applicantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Change company data
     *
     * Changes company data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changeCompanyDataTest() throws ApiException {
        String companyName = null;
        String registrationNumber = null;
        String applicantId = null;
        String country = null;
        String legalAddress = null;
        String incorporatedOn = null;
        String type = null;
        String email = null;
        String controlScheme = null;
        String phone = null;
        String taxId = null;
        String registrationLocation = null;
        String website = null;
        String postalAddress = null;
        List<String> beneficiaries = null;
        List<String> addresses = null;
        api.changeCompanyData(companyName, registrationNumber, applicantId)
                .country(country)
                .legalAddress(legalAddress)
                .incorporatedOn(incorporatedOn)
                .type(type)
                .email(email)
                .controlScheme(controlScheme)
                .phone(phone)
                .taxId(taxId)
                .registrationLocation(registrationLocation)
                .website(website)
                .postalAddress(postalAddress)
                .beneficiaries(beneficiaries)
                .addresses(addresses)
                .execute();
        // TODO: test validations
    }

    /**
     * Change information extracted by Sumsub
     *
     * Changes extracted information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changeExtractedInfoTest() throws ApiException {
        String applicantId = null;
        String firstName = null;
        String lastName = null;
        String middleName = null;
        String legalName = null;
        String gender = null;
        String dob = null;
        String placeOfBirth = null;
        String countryOfBirth = null;
        String stateOfBirth = null;
        String country = null;
        String nationality = null;
        String addresses = null;
        String tin = null;
        api.changeExtractedInfo(applicantId)
                .firstName(firstName)
                .lastName(lastName)
                .middleName(middleName)
                .legalName(legalName)
                .gender(gender)
                .dob(dob)
                .placeOfBirth(placeOfBirth)
                .countryOfBirth(countryOfBirth)
                .stateOfBirth(stateOfBirth)
                .country(country)
                .nationality(nationality)
                .addresses(addresses)
                .tin(tin)
                .execute();
        // TODO: test validations
    }

    /**
     * Change required document set
     *
     * Changes the list of required documents.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changeRequiredDocumentSetTest() throws ApiException {
        String name = null;
        String applicantId = null;
        api.changeRequiredDocumentSet(name, applicantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Clarify rejection reason
     *
     * Returns rejection reason clarification.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clarifyRejectionReasonTest() throws ApiException {
        String applicantId = null;
        api.clarifyRejectionReason(applicantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Confirm applicant data
     *
     * Confirms applicant data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void confirmDataTest() throws ApiException {
        String applicantId = null;
        String confirmationId = null;
        ApplicantConfirmDataRequestOtp otp = null;
        ApplicantConfirmDataRequestOauth oauth = null;
        api.confirmData(applicantId, confirmationId)
                .otp(otp)
                .oauth(oauth)
                .execute();
        // TODO: test validations
    }

    /**
     * Create applicant action
     *
     * Creates an applicant action.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createActionTest() throws ApiException {
        String externalActionId = null;
        String applicantId = null;
        String levelName = null;
        ApplicantCreateActionRequestPaymentMethod paymentMethod = null;
        String email = null;
        String phone = null;
        api.createAction(externalActionId, applicantId, levelName)
                .paymentMethod(paymentMethod)
                .email(email)
                .phone(phone)
                .execute();
        // TODO: test validations
    }

    /**
     * Submission
     *
     * Creates an action with transaction information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCryptoSourceOfFundsTest() throws ApiException {
        String currency = null;
        String direction = null;
        String address = null;
        String applicantId = null;
        String txn = null;
        String tokenId = null;
        api.createCryptoSourceOfFunds(currency, direction, address, applicantId)
                .txn(txn)
                .tokenId(tokenId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create payment source actions
     *
     * Creates an action to process a payment source and to confirm the owner of the payment method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPaymentSourceActionsTest() throws ApiException {
        String applicantId = null;
        String levelName = null;
        String externalActionId = null;
        ApplicantCreatePaymentSourceActionsRequestPaymentSource paymentSource = null;
        ApplicantCreatePaymentSourceActionsResponse response = api.createPaymentSourceActions(applicantId, levelName)
                .externalActionId(externalActionId)
                .paymentSource(paymentSource)
                .execute();
        // TODO: test validations
    }

    /**
     * Deactivate applicant profile
     *
     * Deactivates an applicant profile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deactivateProfileTest() throws ApiException {
        String applicantId = null;
        String status = null;
        api.deactivateProfile(applicantId, status)
                .execute();
        // TODO: test validations
    }

    /**
     * Enriching transaction with Travel Rule
     *
     * Enriches transaction with the Travel Rule data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enrichTransactionWithTravelRuleDataTest() throws ApiException {
        String fullName = null;
        String txnId = null;
        Object response = api.enrichTransactionWithTravelRuleData(fullName, txnId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get action information
     *
     * Returns information about the applicant action checks.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getActionOneInfoTest() throws ApiException {
        String actionId = null;
        api.getActionOneInfo(actionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get applicant actions
     *
     * Returns a list of applicant actions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getActionsTest() throws ApiException {
        String applicantId = null;
        Integer limit = null;
        Integer offset = null;
        api.getActions(applicantId)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Get bank card image
     *
     * Returns an original bank card image.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBankCardImageTest() throws ApiException {
        String actionId = null;
        String imageId = null;
        Boolean isPreview = null;
        api.getBankCardImage(actionId, imageId)
                .isPreview(isPreview)
                .execute();
        // TODO: test validations
    }

    /**
     * Get applicant data
     *
     * Returns applicant information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDataTest() throws ApiException {
        String applicantId = null;
        api.getData(applicantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get applicant data (externalUserId)
     *
     * Returns applicant information based on the provided &#x60;externalUserId&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDataByExternalUserIdTest() throws ApiException {
        String externalUserId = null;
        api.getDataByExternalUserId(externalUserId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get applicant data
     *
     * Returns the applicant data for Non-Doc verification.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDataLatestTest() throws ApiException {
        String type = null;
        String applicantId = null;
        api.getDataLatest(type, applicantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get fraud network by ID
     *
     * Returns fraud network by &#x60;networkId&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFraudNetworkByIdTest() throws ApiException {
        String networkId = null;
        api.getFraudNetworkById(networkId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get fraud networks
     *
     * Returns fraud networks.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFraudNetworksTest() throws ApiException {
        Integer offset = null;
        Integer limit = null;
        api.getFraudNetworks()
                .offset(offset)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Get applicant fraud networks
     *
     * Returns all fraud networks by &#x60;applicantId&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFraudNetworksByApplicantTest() throws ApiException {
        String applicantId = null;
        api.getFraudNetworksByApplicant(applicantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get available applicant levels
     *
     * Returns a list of verification levels.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLevelsTest() throws ApiException {
        api.getLevels()
                .execute();
        // TODO: test validations
    }

    /**
     * Get required ID documents
     *
     * Returns the list of required documents.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRequiredIdDocsTest() throws ApiException {
        String applicantId = null;
        api.getRequiredIdDocs(applicantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get applicant review status
     *
     * Returns applicant review status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReviewStatusTest() throws ApiException {
        String applicantId = null;
        api.getReviewStatus(applicantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get applicant verification steps status
     *
     * Returns information about the documents or separate verification step results.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVerificationStepsStatusTest() throws ApiException {
        String applicantId = null;
        api.getVerificationStepsStatus(applicantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get video call media
     *
     * Returns video call media.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVideoCallMediaTest() throws ApiException {
        String applicantId = null;
        String compositionMediaId = null;
        Object response = api.getVideoCallMedia(applicantId, compositionMediaId)
                .execute();
        // TODO: test validations
    }

    /**
     * Import applicant with images by archive
     *
     * Imports applicant data and images including associated review results.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importByArchiveTest() throws ApiException {
        File content = null;
        api.importByArchive()
                .content(content)
                .execute();
        // TODO: test validations
    }

    /**
     * Import applicants
     *
     * Imports applicants.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importCompletedTest() throws ApiException {
        ApplicantImportCompletedRequestInfo info = null;
        String externalUserId = null;
        ApplicantImportCompletedRequestReview review = null;
        String levelName = null;
        api.importCompleted()
                .info(info)
                .externalUserId(externalUserId)
                .review(review)
                .levelName(levelName)
                .execute();
        // TODO: test validations
    }

    /**
     * Request applicant check
     *
     * Initiates a check of the applicant profile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void initiateApplicantCheckTest() throws ApiException {
        String applicantId = null;
        String reason = null;
        api.initiateApplicantCheck(applicantId)
                .reason(reason)
                .execute();
        // TODO: test validations
    }

    /**
     * Move transaction to another applicant
     *
     * Moves transaction to the specified applicant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void moveTransactionToAnotherApplicantTest() throws ApiException {
        String txnId = null;
        String applicantId = null;
        Object response = api.moveTransactionToAnotherApplicant(txnId, applicantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove custom applicant tags
     *
     * Removes all custom tags from applicant profiles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeCustomTagsTest() throws ApiException {
        String applicantId = null;
        List<String> RAW_BODY = null;
        api.removeCustomTags(applicantId)
                .RAW_BODY(RAW_BODY)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove applicant from beneficiary list
     *
     * Removes the applicant from the list of company beneficial owners.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeFromBeneficiaryListTest() throws ApiException {
        String applicantId = null;
        String beneficiaryApplicantId = null;
        api.removeFromBeneficiaryList(applicantId, beneficiaryApplicantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Request action check
     *
     * Requests an applicant action check.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void requestActionCheckTest() throws ApiException {
        String actionId = null;
        api.requestActionCheck(actionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Reset applicant profile
     *
     * Marks documents uploaded by the applicant as inactive and deletes all statuses assigned earlier.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetProfileTest() throws ApiException {
        String applicantId = null;
        api.resetProfile(applicantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Reset verification step
     *
     * Resets the specified verification step.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetVerificationStepTest() throws ApiException {
        String applicantId = null;
        String idDocSetType = null;
        api.resetVerificationStep(applicantId, idDocSetType)
                .execute();
        // TODO: test validations
    }

    /**
     * Set review for applicant in sandbox
     *
     * Simulates a verification reposnose.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sandboxVerificationResponseTest() throws ApiException {
        String reviewAnswer = null;
        List<String> rejectLabels = null;
        String applicantId = null;
        String reviewRejectType = null;
        String clientComment = null;
        String moderationComment = null;
        api.sandboxVerificationResponse(reviewAnswer, rejectLabels, applicantId)
                .reviewRejectType(reviewRejectType)
                .clientComment(clientComment)
                .moderationComment(moderationComment)
                .execute();
        // TODO: test validations
    }

    /**
     * Submit applicant data
     *
     * Sends applicant data for no-document verification.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitDataNoDocVerificationTest() throws ApiException {
        ApplicantSubmitDataNoDocVerificationRequestInfo info = null;
        String applicantId = null;
        api.submitDataNoDocVerification(info, applicantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Submission
     *
     * Submits a payment method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitPaymentMethodTest() throws ApiException {
        String xExternalActionId = null;
        String applicantId = null;
        Boolean requireSelfie = null;
        api.submitPaymentMethod(xExternalActionId, applicantId)
                .requireSelfie(requireSelfie)
                .execute();
        // TODO: test validations
    }

    /**
     * Submit transaction for existing applicant
     *
     * Initiates transaction processing.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitTransactionDataTest() throws ApiException {
        ApplicantSubmitTransactionDataRequestInfo info = null;
        String txnId = null;
        ApplicantSubmitTransactionDataRequestApplicant applicant = null;
        ApplicantSubmitTransactionDataRequestCounterparty counterparty = null;
        String applicantId = null;
        LocalDate txnDate = null;
        String type = null;
        String sourceKey = null;
        ApplicantSubmitTransactionDataRequestProps props = null;
        api.submitTransactionData(info, txnId, applicant, counterparty, applicantId)
                .txnDate(txnDate)
                .type(type)
                .sourceKey(sourceKey)
                .props(props)
                .execute();
        // TODO: test validations
    }

    /**
     * Submit transaction for non-existing applicant
     *
     * Initiates transaction processing for non-existing applicants.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitTransactionForNonExistingTest() throws ApiException {
        ApplicantSubmitTransactionDataRequestInfo info = null;
        String txnId = null;
        ApplicantSubmitTransactionForNonExistingRequestApplicant applicant = null;
        ApplicantSubmitTransactionForNonExistingRequestCounterparty counterparty = null;
        String levelName = null;
        LocalDate txnDate = null;
        Object props = null;
        String type = null;
        String sourceKey = null;
        api.submitTransactionForNonExisting(info, txnId, applicant, counterparty, levelName)
                .txnDate(txnDate)
                .props(props)
                .type(type)
                .sourceKey(sourceKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Change provided information
     *
     * Updates information provided when [creating an applicant](ref:create-applicants).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateFixedInfoTest() throws ApiException {
        String applicantId = null;
        String firstName = null;
        String lastName = null;
        String middleName = null;
        String firstNameEn = null;
        String lastNameEn = null;
        String middleNameEn = null;
        String legalName = null;
        String gender = null;
        String dob = null;
        String placeOfBirth = null;
        String countryOfBirth = null;
        String stateOfBirth = null;
        String country = null;
        String nationality = null;
        List<Object> addresses = null;
        String tin = null;
        api.updateFixedInfo(applicantId)
                .firstName(firstName)
                .lastName(lastName)
                .middleName(middleName)
                .firstNameEn(firstNameEn)
                .lastNameEn(lastNameEn)
                .middleNameEn(middleNameEn)
                .legalName(legalName)
                .gender(gender)
                .dob(dob)
                .placeOfBirth(placeOfBirth)
                .countryOfBirth(countryOfBirth)
                .stateOfBirth(stateOfBirth)
                .country(country)
                .nationality(nationality)
                .addresses(addresses)
                .tin(tin)
                .execute();
        // TODO: test validations
    }

    /**
     * Change top-level information
     *
     * Changes existing verification level configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTopLevelInfoTest() throws ApiException {
        String id = null;
        String externalUserId = null;
        String email = null;
        String phone = null;
        String sourceKey = null;
        String lang = null;
        List<Object> questionnaires = null;
        List<Object> metadata = null;
        Boolean deleted = null;
        api.updateTopLevelInfo(id)
                .externalUserId(externalUserId)
                .email(email)
                .phone(phone)
                .sourceKey(sourceKey)
                .lang(lang)
                .questionnaires(questionnaires)
                .metadata(metadata)
                .deleted(deleted)
                .execute();
        // TODO: test validations
    }

}

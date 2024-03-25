package com.konfigthis.client;

import com.konfigthis.client.api.AnalysisApi;
import com.konfigthis.client.api.ApplicantApi;
import com.konfigthis.client.api.AuditTrailEventApi;
import com.konfigthis.client.api.CheckApi;
import com.konfigthis.client.api.HealthApi;
import com.konfigthis.client.api.ImageApi;
import com.konfigthis.client.api.InspectionApi;
import com.konfigthis.client.api.NoteApi;
import com.konfigthis.client.api.TagApi;
import com.konfigthis.client.api.TokenApi;
import com.konfigthis.client.api.TransactionApi;
import com.konfigthis.client.api.VaspApi;
import com.konfigthis.client.api.WebSdkLinkApi;

public class Sumsub {
    private ApiClient apiClient;
    public final AnalysisApi analysis;
    public final ApplicantApi applicant;
    public final AuditTrailEventApi auditTrailEvent;
    public final CheckApi check;
    public final HealthApi health;
    public final ImageApi image;
    public final InspectionApi inspection;
    public final NoteApi note;
    public final TagApi tag;
    public final TokenApi token;
    public final TransactionApi transaction;
    public final VaspApi vasp;
    public final WebSdkLinkApi webSdkLink;

    public Sumsub() {
        this(null);
    }

    public Sumsub(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.analysis = new AnalysisApi(this.apiClient);
        this.applicant = new ApplicantApi(this.apiClient);
        this.auditTrailEvent = new AuditTrailEventApi(this.apiClient);
        this.check = new CheckApi(this.apiClient);
        this.health = new HealthApi(this.apiClient);
        this.image = new ImageApi(this.apiClient);
        this.inspection = new InspectionApi(this.apiClient);
        this.note = new NoteApi(this.apiClient);
        this.tag = new TagApi(this.apiClient);
        this.token = new TokenApi(this.apiClient);
        this.transaction = new TransactionApi(this.apiClient);
        this.vasp = new VaspApi(this.apiClient);
        this.webSdkLink = new WebSdkLinkApi(this.apiClient);
    }

}

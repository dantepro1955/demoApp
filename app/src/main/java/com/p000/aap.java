package com.p000;

/* compiled from: SessionEventMetadata */
/* renamed from: aap */
final class aap {
    /* renamed from: a */
    public final String f109a;
    /* renamed from: b */
    public final String f110b;
    /* renamed from: c */
    public final String f111c;
    /* renamed from: d */
    public final String f112d;
    /* renamed from: e */
    public final String f113e;
    /* renamed from: f */
    public final Boolean f114f;
    /* renamed from: g */
    public final String f115g;
    /* renamed from: h */
    public final String f116h;
    /* renamed from: i */
    public final String f117i;
    /* renamed from: j */
    public final String f118j;
    /* renamed from: k */
    public final String f119k;
    /* renamed from: l */
    public final String f120l;
    /* renamed from: m */
    private String f121m;

    public aap(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f109a = str;
        this.f110b = str2;
        this.f111c = str3;
        this.f112d = str4;
        this.f113e = str5;
        this.f114f = bool;
        this.f115g = str6;
        this.f116h = str7;
        this.f117i = str8;
        this.f118j = str9;
        this.f119k = str10;
        this.f120l = str11;
    }

    public String toString() {
        if (this.f121m == null) {
            this.f121m = "appBundleId=" + this.f109a + ", executionId=" + this.f110b + ", installationId=" + this.f111c + ", androidId=" + this.f112d + ", advertisingId=" + this.f113e + ", limitAdTrackingEnabled=" + this.f114f + ", betaDeviceToken=" + this.f115g + ", buildId=" + this.f116h + ", osVersion=" + this.f117i + ", deviceModel=" + this.f118j + ", appVersionCode=" + this.f119k + ", appVersionName=" + this.f120l;
        }
        return this.f121m;
    }
}

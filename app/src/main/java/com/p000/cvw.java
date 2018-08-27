package com.p000;

import com.under9.android.lib.network.model.Constants;

/* compiled from: ApiHelper */
/* renamed from: cvw */
public class cvw {
    /* renamed from: a */
    private String f20346a;

    public cvw(String str) {
        this.f20346a = str;
        if (!this.f20346a.endsWith(Constants.SEP)) {
            this.f20346a += Constants.SEP;
        }
    }

    /* renamed from: a */
    public String m25156a() {
        return this.f20346a + "v1/list/available";
    }

    /* renamed from: b */
    public String m25157b() {
        return this.f20346a + "v1/list/posts";
    }

    /* renamed from: c */
    public String m25158c() {
        return this.f20346a + "v1/posts";
    }

    /* renamed from: d */
    public String m25159d() {
        return this.f20346a + "v1/account/authenticate";
    }
}

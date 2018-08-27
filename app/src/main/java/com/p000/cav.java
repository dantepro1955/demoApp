package com.p000;

import com.under9.android.remoteconfig.api.model.ApiAppLink;
import p000.cau.C16442;

/* renamed from: cav */
final /* synthetic */ class cav implements Runnable {
    /* renamed from: a */
    private final C16442 f8549a;
    /* renamed from: b */
    private final ApiAppLink[] f8550b;

    private cav(C16442 c16442, ApiAppLink[] apiAppLinkArr) {
        this.f8549a = c16442;
        this.f8550b = apiAppLinkArr;
    }

    /* renamed from: a */
    public static Runnable m12190a(C16442 c16442, ApiAppLink[] apiAppLinkArr) {
        return new cav(c16442, apiAppLinkArr);
    }

    public void run() {
        C16442.m12167a(this.f8549a, this.f8550b);
    }
}

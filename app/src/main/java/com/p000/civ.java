package com.p000;

import com.ninegag.android.app.model.api.ApiPostsResponse;

/* renamed from: civ */
final /* synthetic */ class civ implements dul {
    /* renamed from: a */
    private final cgc f9405a;

    private civ(cgc cgc) {
        this.f9405a = cgc;
    }

    /* renamed from: a */
    public static dul m14038a(cgc cgc) {
        return new civ(cgc);
    }

    public void call(Object obj) {
        new cky().mo1778a((ApiPostsResponse) obj, this.f9405a);
    }
}

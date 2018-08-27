package com.p000;

import com.ninegag.android.app.model.api.ApiPostsResponse;

/* renamed from: ckz */
final /* synthetic */ class ckz implements Runnable {
    /* renamed from: a */
    private final cky f9620a;
    /* renamed from: b */
    private final ApiPostsResponse f9621b;
    /* renamed from: c */
    private final cgc f9622c;

    private ckz(cky cky, ApiPostsResponse apiPostsResponse, cgc cgc) {
        this.f9620a = cky;
        this.f9621b = apiPostsResponse;
        this.f9622c = cgc;
    }

    /* renamed from: a */
    public static Runnable m14220a(cky cky, ApiPostsResponse apiPostsResponse, cgc cgc) {
        return new ckz(cky, apiPostsResponse, cgc);
    }

    public void run() {
        cky.m14217a(this.f9620a, this.f9621b, this.f9622c);
    }
}

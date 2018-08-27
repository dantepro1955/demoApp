package com.p000;

import com.ninegag.android.app.upload.info.UrlInfoFetchFragment;

/* renamed from: cot */
public final /* synthetic */ class cot implements Runnable {
    /* renamed from: a */
    private final UrlInfoFetchFragment f19902a;

    private cot(UrlInfoFetchFragment urlInfoFetchFragment) {
        this.f19902a = urlInfoFetchFragment;
    }

    /* renamed from: a */
    public static Runnable m24224a(UrlInfoFetchFragment urlInfoFetchFragment) {
        return new cot(urlInfoFetchFragment);
    }

    public void run() {
        UrlInfoFetchFragment.m22844a(this.f19902a);
    }
}

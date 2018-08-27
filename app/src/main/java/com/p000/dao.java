package com.p000;

import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: GoogleApiClientCompatProxy */
/* renamed from: dao */
public class dao {
    /* renamed from: a */
    private final GoogleApiClient f20946a;
    /* renamed from: b */
    private final Class f20947b;

    public dao(GoogleApiClient googleApiClient) {
        this.f20946a = googleApiClient;
        this.f20947b = googleApiClient.getClass();
    }

    /* renamed from: a */
    public void m26075a() {
        try {
            this.f20947b.getMethod("connect", new Class[0]).invoke(this.f20946a, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m26076b() {
        try {
            this.f20947b.getMethod("disconnect", new Class[0]).invoke(this.f20946a, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    public GoogleApiClient m26077c() {
        return this.f20946a;
    }
}

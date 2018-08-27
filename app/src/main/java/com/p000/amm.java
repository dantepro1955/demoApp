package com.p000;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* renamed from: amm */
public class amm implements amh {
    /* renamed from: e */
    private GoogleSignInOptions m2591e(GoogleApiClient googleApiClient) {
        return ((amn) googleApiClient.zza(alw.f2013c)).mo344e();
    }

    /* renamed from: a */
    public ami mo330a(Intent intent) {
        return amo.m2716a(intent);
    }

    /* renamed from: a */
    public Intent mo331a(GoogleApiClient googleApiClient) {
        return amo.m2717a(googleApiClient.getContext(), m2591e(googleApiClient));
    }

    /* renamed from: b */
    public anp<ami> mo332b(GoogleApiClient googleApiClient) {
        return amo.m2719a(googleApiClient, googleApiClient.getContext(), m2591e(googleApiClient));
    }

    /* renamed from: c */
    public anq<Status> mo333c(GoogleApiClient googleApiClient) {
        return amo.m2720a(googleApiClient, googleApiClient.getContext());
    }

    /* renamed from: d */
    public anq<Status> mo334d(GoogleApiClient googleApiClient) {
        return amo.m2723b(googleApiClient, googleApiClient.getContext());
    }
}

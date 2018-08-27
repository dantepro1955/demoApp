package com.p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;

/* renamed from: akw */
public interface akw extends MediationAdapter {
    void initialize(Context context, MediationAdRequest mediationAdRequest, String str, akx akx, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2);

    void showVideo();
}

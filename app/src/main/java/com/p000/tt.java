package com.p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.applovin.adview.AppLovinInterstitialActivity;

/* renamed from: tt */
public class tt implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ AppLovinInterstitialActivity f25568a;

    public tt(AppLovinInterstitialActivity appLovinInterstitialActivity) {
        this.f25568a = appLovinInterstitialActivity;
    }

    public void onClick(View view) {
        this.f25568a.dismiss();
    }
}

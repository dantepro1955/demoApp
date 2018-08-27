package com.p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.applovin.adview.AppLovinInterstitialActivity;

/* renamed from: tw */
public class tw implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ AppLovinInterstitialActivity f25571a;

    public tw(AppLovinInterstitialActivity appLovinInterstitialActivity) {
        this.f25571a = appLovinInterstitialActivity;
    }

    public void onClick(View view) {
        AppLovinInterstitialActivity.p(this.f25571a).performClick();
    }
}

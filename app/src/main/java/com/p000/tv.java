package com.p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.applovin.adview.AppLovinInterstitialActivity;

/* renamed from: tv */
public class tv implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ AppLovinInterstitialActivity f25570a;

    public tv(AppLovinInterstitialActivity appLovinInterstitialActivity) {
        this.f25570a = appLovinInterstitialActivity;
    }

    public void onClick(View view) {
        AppLovinInterstitialActivity.o(this.f25570a).performClick();
    }
}

package com.p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.applovin.adview.AppLovinInterstitialActivity;

/* renamed from: tx */
public class tx implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ AppLovinInterstitialActivity f25572a;

    public tx(AppLovinInterstitialActivity appLovinInterstitialActivity) {
        this.f25572a = appLovinInterstitialActivity;
    }

    public void onClick(View view) {
        AppLovinInterstitialActivity.q(this.f25572a);
    }
}

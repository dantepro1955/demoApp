package com.p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.applovin.adview.AppLovinInterstitialActivity;

/* renamed from: tr */
public class tr implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ AppLovinInterstitialActivity f25565a;

    public tr(AppLovinInterstitialActivity appLovinInterstitialActivity) {
        this.f25565a = appLovinInterstitialActivity;
    }

    public void onClick(View view) {
        float f = 1.0f;
        AppLovinInterstitialActivity.k(this.f25565a).mo5561g().mo5606a("AppLovinInterstitialActivity", "Video view tapped!");
        if (AppLovinInterstitialActivity.l(this.f25565a).m34701z() && AppLovinInterstitialActivity.m(this.f25565a) != null && AppLovinInterstitialActivity.m(this.f25565a).getVisibility() != 8) {
            boolean z = AppLovinInterstitialActivity.m(this.f25565a).getVisibility() == 4;
            float f2 = z ? 0.0f : 1.0f;
            if (!z) {
                f = 0.0f;
            }
            Animation alphaAnimation = new AlphaAnimation(f2, f);
            alphaAnimation.setDuration(750);
            alphaAnimation.setAnimationListener(new ts(this, z));
            AppLovinInterstitialActivity.m(this.f25565a).startAnimation(alphaAnimation);
        }
    }
}

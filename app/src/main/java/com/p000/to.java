package com.p000;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.applovin.adview.AppLovinInterstitialActivity;

/* renamed from: to */
public class to implements OnCompletionListener {
    /* renamed from: a */
    final /* synthetic */ AppLovinInterstitialActivity f25560a;

    public to(AppLovinInterstitialActivity appLovinInterstitialActivity) {
        this.f25560a = appLovinInterstitialActivity;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        AppLovinInterstitialActivity.a(this.f25560a, true);
        AppLovinInterstitialActivity.j(this.f25560a);
    }
}

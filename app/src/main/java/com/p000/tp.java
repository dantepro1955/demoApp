package com.p000;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.applovin.adview.AppLovinInterstitialActivity;

/* renamed from: tp */
public class tp implements OnErrorListener {
    /* renamed from: a */
    final /* synthetic */ AppLovinInterstitialActivity f25561a;

    public tp(AppLovinInterstitialActivity appLovinInterstitialActivity) {
        this.f25561a = appLovinInterstitialActivity;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        AppLovinInterstitialActivity.e(this.f25561a).post(new tq(this, i, i2));
        return true;
    }
}

package com.p000;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.applovin.adview.AppLovinInterstitialActivity;

/* renamed from: tg */
class tg implements OnErrorListener {
    /* renamed from: a */
    final /* synthetic */ tf f25547a;

    tg(tf tfVar) {
        this.f25547a = tfVar;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        AppLovinInterstitialActivity.e(this.f25547a.f25546a).post(new th(this, i, i2));
        return true;
    }
}

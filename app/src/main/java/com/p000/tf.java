package com.p000;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.applovin.adview.AppLovinInterstitialActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: tf */
public class tf implements OnPreparedListener {
    /* renamed from: a */
    final /* synthetic */ AppLovinInterstitialActivity f25546a;

    public tf(AppLovinInterstitialActivity appLovinInterstitialActivity) {
        this.f25546a = appLovinInterstitialActivity;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        AppLovinInterstitialActivity.a(this.f25546a, new WeakReference(mediaPlayer));
        int i = AppLovinInterstitialActivity.a(this.f25546a) ? 0 : 1;
        mediaPlayer.setVolume((float) i, (float) i);
        i = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        AppLovinInterstitialActivity.a(this.f25546a, (int) TimeUnit.MILLISECONDS.toSeconds((long) mediaPlayer.getDuration()));
        AppLovinInterstitialActivity.b(this.f25546a).setVideoSize(i, videoHeight);
        mediaPlayer.setDisplay(AppLovinInterstitialActivity.b(this.f25546a).getHolder());
        mediaPlayer.setOnErrorListener(new tg(this));
        AppLovinInterstitialActivity.f(this.f25546a);
        AppLovinInterstitialActivity.g(this.f25546a);
        AppLovinInterstitialActivity.h(this.f25546a);
        AppLovinInterstitialActivity.i(this.f25546a);
    }
}

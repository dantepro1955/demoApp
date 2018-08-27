package com.p000;

import android.os.Handler;
import com.mopub.nativeads.MoPubNativeAdPositioning;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import com.mopub.nativeads.PositioningSource;
import com.mopub.nativeads.PositioningSource.PositioningListener;

/* compiled from: ClientPositioningSource */
/* renamed from: bzp */
public class bzp implements PositioningSource {
    /* renamed from: a */
    private final Handler f8313a = new Handler();
    /* renamed from: b */
    private final MoPubClientPositioning f8314b;

    public bzp(MoPubClientPositioning moPubClientPositioning) {
        this.f8314b = MoPubNativeAdPositioning.a(moPubClientPositioning);
    }

    public void loadPositions(String str, final PositioningListener positioningListener) {
        this.f8313a.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bzp f8312b;

            public void run() {
                positioningListener.onLoad(this.f8312b.f8314b);
            }
        });
    }
}

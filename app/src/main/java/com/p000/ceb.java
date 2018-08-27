package com.p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.mopub.nativeads.StaticNativeAd;
import com.ninegag.android.app.component.postlist.overlay.AdOverlayFragment;

/* renamed from: ceb */
public final /* synthetic */ class ceb implements OnClickListener {
    /* renamed from: a */
    private final StaticNativeAd f8869a;
    /* renamed from: b */
    private final View f8870b;

    private ceb(StaticNativeAd staticNativeAd, View view) {
        this.f8869a = staticNativeAd;
        this.f8870b = view;
    }

    /* renamed from: a */
    public static OnClickListener m12729a(StaticNativeAd staticNativeAd, View view) {
        return new ceb(staticNativeAd, view);
    }

    public void onClick(View view) {
        AdOverlayFragment.a(this.f8869a, this.f8870b, view);
    }
}

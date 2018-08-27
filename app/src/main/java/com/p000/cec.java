package com.p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.ninegag.android.app.component.postlist.overlay.AdOverlayFragment;

/* renamed from: cec */
public final /* synthetic */ class cec implements OnClickListener {
    /* renamed from: a */
    private final AdOverlayFragment f8871a;
    /* renamed from: b */
    private final boolean f8872b;

    private cec(AdOverlayFragment adOverlayFragment, boolean z) {
        this.f8871a = adOverlayFragment;
        this.f8872b = z;
    }

    /* renamed from: a */
    public static OnClickListener m12730a(AdOverlayFragment adOverlayFragment, boolean z) {
        return new cec(adOverlayFragment, z);
    }

    public void onClick(View view) {
        AdOverlayFragment.a(this.f8871a, this.f8872b, view);
    }
}

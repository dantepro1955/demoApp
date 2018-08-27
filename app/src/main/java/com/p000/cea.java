package com.p000;

import com.ninegag.android.app.component.postlist.overlay.AdOverlayFragment;

/* renamed from: cea */
public final /* synthetic */ class cea implements Runnable {
    /* renamed from: a */
    private final AdOverlayFragment f8868a;

    private cea(AdOverlayFragment adOverlayFragment) {
        this.f8868a = adOverlayFragment;
    }

    /* renamed from: a */
    public static Runnable m12728a(AdOverlayFragment adOverlayFragment) {
        return new cea(adOverlayFragment);
    }

    public void run() {
        AdOverlayFragment.a(this.f8868a);
    }
}

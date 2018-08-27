package com.p000;

import com.ninegag.android.app.component.postlist.overlay.v1.OverlayUIVFragment$b;

/* renamed from: cem */
public final /* synthetic */ class cem implements Runnable {
    /* renamed from: a */
    private final OverlayUIVFragment$b f8930a;

    private cem(OverlayUIVFragment$b overlayUIVFragment$b) {
        this.f8930a = overlayUIVFragment$b;
    }

    /* renamed from: a */
    public static Runnable m12810a(OverlayUIVFragment$b overlayUIVFragment$b) {
        return new cem(overlayUIVFragment$b);
    }

    public void run() {
        OverlayUIVFragment$b.a(this.f8930a);
    }
}

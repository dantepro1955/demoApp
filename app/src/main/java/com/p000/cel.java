package com.p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.ninegag.android.app.component.postlist.overlay.v1.OverlayUIVFragment;

/* renamed from: cel */
public final /* synthetic */ class cel implements OnClickListener {
    /* renamed from: a */
    private final OverlayUIVFragment f8929a;

    private cel(OverlayUIVFragment overlayUIVFragment) {
        this.f8929a = overlayUIVFragment;
    }

    /* renamed from: a */
    public static OnClickListener m12809a(OverlayUIVFragment overlayUIVFragment) {
        return new cel(overlayUIVFragment);
    }

    public void onClick(View view) {
        this.f8929a.m20502u();
    }
}

package com.p000;

import com.under9.android.lib.widget.media.overlay.MultiImageOverlayBaseActivity;

/* compiled from: OverlayController */
/* renamed from: dkr */
public class dkr extends dfx {
    /* renamed from: a */
    private MultiImageOverlayBaseActivity f16778a;

    public dkr(MultiImageOverlayBaseActivity multiImageOverlayBaseActivity) {
        this.f16778a = multiImageOverlayBaseActivity;
    }

    public void s_() {
        super.s_();
        dhe.a(this);
    }

    public void t_() {
        super.t_();
        dhe.b(this);
    }

    @dhg
    public void onOverlayClose(dkt dkt) {
        this.f16778a.finish();
    }
}

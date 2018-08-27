package com.p000;

import com.ninegag.android.app.ui.SimpleOverlayActivity;

/* renamed from: cob */
public final /* synthetic */ class cob implements Runnable {
    /* renamed from: a */
    private final SimpleOverlayActivity f9907a;

    private cob(SimpleOverlayActivity simpleOverlayActivity) {
        this.f9907a = simpleOverlayActivity;
    }

    /* renamed from: a */
    public static Runnable m14953a(SimpleOverlayActivity simpleOverlayActivity) {
        return new cob(simpleOverlayActivity);
    }

    public void run() {
        SimpleOverlayActivity.lambda$onStart$59(this.f9907a);
    }
}

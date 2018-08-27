package com.p000;

import com.ninegag.android.app.otto.overlay.GagItemUpdatedEvent;

/* renamed from: cet */
final /* synthetic */ class cet implements Runnable {
    /* renamed from: a */
    private final ces f8970a;
    /* renamed from: b */
    private final int f8971b;

    private cet(ces ces, int i) {
        this.f8970a = ces;
        this.f8971b = i;
    }

    /* renamed from: a */
    public static Runnable m12885a(ces ces, int i) {
        return new cet(ces, i);
    }

    public void run() {
        dhe.c(this.f8970a.f8951d.f8730b, new GagItemUpdatedEvent(this.f8970a.m12875e().mo1693e(this.f8971b)));
    }
}

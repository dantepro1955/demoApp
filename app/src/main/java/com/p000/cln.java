package com.p000;

import com.ninegag.android.app.notif.GagNotifFragment;

/* renamed from: cln */
public final /* synthetic */ class cln implements Runnable {
    /* renamed from: a */
    private final GagNotifFragment f9676a;

    private cln(GagNotifFragment gagNotifFragment) {
        this.f9676a = gagNotifFragment;
    }

    /* renamed from: a */
    public static Runnable m14310a(GagNotifFragment gagNotifFragment) {
        return new cln(gagNotifFragment);
    }

    public void run() {
        GagNotifFragment.m20505a(this.f9676a);
    }
}

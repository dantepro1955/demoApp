package com.p000;

import com.ninegag.android.app.notif.GagNotifFragment;

/* renamed from: clm */
public final /* synthetic */ class clm implements Runnable {
    /* renamed from: a */
    private final GagNotifFragment f9675a;

    private clm(GagNotifFragment gagNotifFragment) {
        this.f9675a = gagNotifFragment;
    }

    /* renamed from: a */
    public static Runnable m14309a(GagNotifFragment gagNotifFragment) {
        return new clm(gagNotifFragment);
    }

    public void run() {
        this.f9675a.i().notifyDataSetChanged();
    }
}

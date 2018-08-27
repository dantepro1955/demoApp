package com.p000;

import android.app.AlertDialog.Builder;

/* compiled from: OneSignal */
/* renamed from: dat$3 */
class dat$3 implements Runnable {
    /* renamed from: a */
    final /* synthetic */ dat$c f20956a;
    /* renamed from: b */
    final /* synthetic */ String f20957b;

    dat$3(dat$c dat_c, String str) {
        this.f20956a = dat_c;
        this.f20957b = str;
    }

    public void run() {
        if (dae.f20925b != null) {
            new Builder(dae.f20925b).setTitle(this.f20956a.toString()).setMessage(this.f20957b).show();
        }
    }
}

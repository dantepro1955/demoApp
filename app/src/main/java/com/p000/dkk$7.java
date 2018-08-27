package com.p000;

import android.widget.Toast;

/* compiled from: ComposerModule */
/* renamed from: dkk$7 */
class dkk$7 implements Runnable {
    /* renamed from: a */
    final /* synthetic */ String f21890a;
    /* renamed from: b */
    final /* synthetic */ dkk f21891b;

    dkk$7(dkk dkk, String str) {
        this.f21891b = dkk;
        this.f21890a = str;
    }

    public void run() {
        Toast.makeText(this.f21891b.f16760i, this.f21890a, 1).show();
    }
}

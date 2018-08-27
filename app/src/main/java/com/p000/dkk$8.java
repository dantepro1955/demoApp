package com.p000;

/* compiled from: ComposerModule */
/* renamed from: dkk$8 */
class dkk$8 implements Runnable {
    /* renamed from: a */
    final /* synthetic */ boolean f21892a;
    /* renamed from: b */
    final /* synthetic */ String f21893b;
    /* renamed from: c */
    final /* synthetic */ dkk f21894c;

    dkk$8(dkk dkk, boolean z, String str) {
        this.f21894c = dkk;
        this.f21892a = z;
        this.f21893b = str;
    }

    public void run() {
        if (this.f21892a) {
            this.f21894c.af().setMessage(this.f21893b);
            if (!this.f21894c.af().isShowing()) {
                this.f21894c.af().show();
                return;
            }
            return;
        }
        this.f21894c.af().dismiss();
    }
}

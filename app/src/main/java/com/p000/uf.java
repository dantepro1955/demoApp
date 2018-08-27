package com.p000;

/* renamed from: uf */
class uf implements Runnable {
    /* renamed from: a */
    final /* synthetic */ vf f25612a;

    private uf(vf vfVar) {
        this.f25612a = vfVar;
    }

    public void run() {
        try {
            this.f25612a.dismiss();
        } catch (Throwable th) {
            if (this.f25612a.f25669c != null) {
                this.f25612a.f25669c.mo5609b("InterstitialAdDialog", "dismiss() threw exception", th);
            }
        }
    }
}

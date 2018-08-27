package com.p000;

import com.google.android.gms.ads.internal.overlay.zzl;

@bhd
/* renamed from: ail */
public class ail implements Runnable {
    /* renamed from: a */
    private zzl f1574a;
    /* renamed from: b */
    private boolean f1575b = false;

    public ail(zzl zzl) {
        this.f1574a = zzl;
    }

    /* renamed from: c */
    private void m1704c() {
        bkg.f6710a.removeCallbacks(this);
        bkg.f6710a.postDelayed(this, 250);
    }

    /* renamed from: a */
    public void m1705a() {
        this.f1575b = true;
    }

    /* renamed from: b */
    public void m1706b() {
        this.f1575b = false;
        m1704c();
    }

    public void run() {
        if (!this.f1575b) {
            this.f1574a.m19354o();
            m1704c();
        }
    }
}

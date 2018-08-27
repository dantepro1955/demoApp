package com.p000;

import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzft;
import p000.azx.C0217a;

/* renamed from: ban */
public class ban extends C0217a {
    /* renamed from: a */
    private azt f5283a;

    /* renamed from: ban$1 */
    class C09691 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ban f5282a;

        C09691(ban ban) {
            this.f5282a = ban;
        }

        public void run() {
            if (this.f5282a.f5283a != null) {
                try {
                    this.f5282a.f5283a.mo860a(1);
                } catch (Throwable e) {
                    bky.m9009c("Could not notify onAdFailedToLoad event.", e);
                }
            }
        }
    }

    /* renamed from: F */
    public String mo260F() {
        return null;
    }

    /* renamed from: G */
    public void mo261G() {
    }

    /* renamed from: a */
    public void mo226a(azs azs) {
    }

    /* renamed from: a */
    public void mo227a(azt azt) {
        this.f5283a = azt;
    }

    /* renamed from: a */
    public void mo228a(azz azz) {
    }

    /* renamed from: a */
    public void mo229a(bab bab) {
    }

    /* renamed from: a */
    public void mo230a(bbn bbn) {
    }

    /* renamed from: a */
    public void mo231a(bgc bgc) {
    }

    /* renamed from: a */
    public void mo232a(bgg bgg, String str) {
    }

    /* renamed from: a */
    public void mo233a(biq biq) {
    }

    /* renamed from: a */
    public void mo235a(zzeg zzeg) {
    }

    /* renamed from: a */
    public void mo236a(zzfc zzfc) {
    }

    /* renamed from: a */
    public void mo237a(zzft zzft) {
    }

    /* renamed from: a */
    public void mo238a(String str) {
    }

    /* renamed from: a */
    public void mo241a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo242a(zzec zzec) {
        bky.m9008c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        bkx.f6798a.post(new C09691(this));
        return false;
    }

    /* renamed from: h */
    public void mo245h() {
    }

    /* renamed from: i */
    public aqq mo246i() {
        return null;
    }

    /* renamed from: j */
    public zzeg mo247j() {
        return null;
    }

    /* renamed from: k */
    public boolean mo248k() {
        return false;
    }

    /* renamed from: l */
    public void mo249l() {
    }

    /* renamed from: m */
    public void mo250m() {
    }

    /* renamed from: n */
    public void mo251n() {
    }

    /* renamed from: o */
    public void mo252o() {
    }

    /* renamed from: p */
    public boolean mo254p() {
        return false;
    }

    /* renamed from: q */
    public baf mo255q() {
        return null;
    }
}

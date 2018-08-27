package com.p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzft;
import com.google.android.gms.internal.zzqh;
import p000.azx.C0217a;
import p000.bdx.C1082a;

@bhd
/* renamed from: bdz */
public class bdz extends C0217a {
    /* renamed from: a */
    private final String f5731a;
    /* renamed from: b */
    private final bdr f5732b;
    /* renamed from: c */
    private akf f5733c;
    /* renamed from: d */
    private final bdt f5734d;
    /* renamed from: e */
    private bgg f5735e;
    /* renamed from: f */
    private String f5736f;

    public bdz(Context context, String str, bex bex, zzqh zzqh, ajx ajx) {
        this(str, new bdr(context, bex, zzqh, ajx));
    }

    bdz(String str, bdr bdr) {
        this.f5731a = str;
        this.f5732b = bdr;
        this.f5734d = new bdt();
        ako.m2358t().m7687a(bdr);
    }

    /* renamed from: b */
    private void m7716b() {
        if (this.f5733c != null && this.f5735e != null) {
            this.f5733c.mo232a(this.f5735e, this.f5736f);
        }
    }

    /* renamed from: b */
    static boolean m7717b(zzec zzec) {
        return bdu.m7674a(zzec).contains("gw");
    }

    /* renamed from: c */
    static boolean m7718c(zzec zzec) {
        return bdu.m7674a(zzec).contains("_ad");
    }

    /* renamed from: F */
    public String mo260F() throws RemoteException {
        return this.f5733c != null ? this.f5733c.mo260F() : null;
    }

    /* renamed from: G */
    public void mo261G() throws RemoteException {
        if (this.f5733c != null) {
            this.f5733c.mo261G();
        } else {
            bky.m9011e("Interstitial ad must be loaded before showInterstitial().");
        }
    }

    /* renamed from: a */
    void m7721a() {
        if (this.f5733c == null) {
            this.f5733c = this.f5732b.m7617a(this.f5731a);
            this.f5734d.m7672a(this.f5733c);
            m7716b();
        }
    }

    /* renamed from: a */
    public void mo226a(azs azs) throws RemoteException {
        this.f5734d.f5702e = azs;
        if (this.f5733c != null) {
            this.f5734d.m7672a(this.f5733c);
        }
    }

    /* renamed from: a */
    public void mo227a(azt azt) throws RemoteException {
        this.f5734d.f5698a = azt;
        if (this.f5733c != null) {
            this.f5734d.m7672a(this.f5733c);
        }
    }

    /* renamed from: a */
    public void mo228a(azz azz) throws RemoteException {
        this.f5734d.f5699b = azz;
        if (this.f5733c != null) {
            this.f5734d.m7672a(this.f5733c);
        }
    }

    /* renamed from: a */
    public void mo229a(bab bab) throws RemoteException {
        m7721a();
        if (this.f5733c != null) {
            this.f5733c.mo229a(bab);
        }
    }

    /* renamed from: a */
    public void mo230a(bbn bbn) throws RemoteException {
        this.f5734d.f5701d = bbn;
        if (this.f5733c != null) {
            this.f5734d.m7672a(this.f5733c);
        }
    }

    /* renamed from: a */
    public void mo231a(bgc bgc) throws RemoteException {
        this.f5734d.f5700c = bgc;
        if (this.f5733c != null) {
            this.f5734d.m7672a(this.f5733c);
        }
    }

    /* renamed from: a */
    public void mo232a(bgg bgg, String str) throws RemoteException {
        this.f5735e = bgg;
        this.f5736f = str;
        m7716b();
    }

    /* renamed from: a */
    public void mo233a(biq biq) {
        this.f5734d.f5703f = biq;
        if (this.f5733c != null) {
            this.f5734d.m7672a(this.f5733c);
        }
    }

    /* renamed from: a */
    public void mo235a(zzeg zzeg) throws RemoteException {
        if (this.f5733c != null) {
            this.f5733c.mo235a(zzeg);
        }
    }

    /* renamed from: a */
    public void mo236a(zzfc zzfc) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public void mo237a(zzft zzft) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    /* renamed from: a */
    public void mo238a(String str) {
    }

    /* renamed from: a */
    public void mo241a(boolean z) throws RemoteException {
        m7721a();
        if (this.f5733c != null) {
            this.f5733c.mo241a(z);
        }
    }

    /* renamed from: a */
    public boolean mo242a(zzec zzec) throws RemoteException {
        if (!bdz.m7717b(zzec)) {
            m7721a();
        }
        if (bdu.m7680c(zzec)) {
            m7721a();
        }
        if (zzec.f14922j != null) {
            m7721a();
        }
        if (this.f5733c != null) {
            return this.f5733c.mo242a(zzec);
        }
        bdu t = ako.m2358t();
        if (bdz.m7718c(zzec)) {
            t.m7689b(zzec, this.f5731a);
        }
        C1082a a = t.m7685a(zzec, this.f5731a);
        if (a != null) {
            if (a.f5717e) {
                bdy.m7706a().m7710d();
            } else {
                a.m7692a();
                bdy.m7706a().m7711e();
            }
            this.f5733c = a.f5713a;
            a.f5715c.m7666a(this.f5734d);
            this.f5734d.m7672a(this.f5733c);
            m7716b();
            return a.f5718f;
        }
        m7721a();
        bdy.m7706a().m7711e();
        return this.f5733c.mo242a(zzec);
    }

    /* renamed from: h */
    public void mo245h() throws RemoteException {
        if (this.f5733c != null) {
            this.f5733c.mo245h();
        }
    }

    /* renamed from: i */
    public aqq mo246i() throws RemoteException {
        return this.f5733c != null ? this.f5733c.mo246i() : null;
    }

    /* renamed from: j */
    public zzeg mo247j() throws RemoteException {
        return this.f5733c != null ? this.f5733c.mo247j() : null;
    }

    /* renamed from: k */
    public boolean mo248k() throws RemoteException {
        return this.f5733c != null && this.f5733c.mo248k();
    }

    /* renamed from: l */
    public void mo249l() throws RemoteException {
        if (this.f5733c != null) {
            this.f5733c.mo249l();
        } else {
            bky.m9011e("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    /* renamed from: m */
    public void mo250m() throws RemoteException {
        if (this.f5733c != null) {
            this.f5733c.mo250m();
        }
    }

    /* renamed from: n */
    public void mo251n() throws RemoteException {
        if (this.f5733c != null) {
            this.f5733c.mo251n();
        }
    }

    /* renamed from: o */
    public void mo252o() throws RemoteException {
        if (this.f5733c != null) {
            this.f5733c.mo252o();
        }
    }

    /* renamed from: p */
    public boolean mo254p() throws RemoteException {
        return this.f5733c != null && this.f5733c.mo254p();
    }

    /* renamed from: q */
    public baf mo255q() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }
}

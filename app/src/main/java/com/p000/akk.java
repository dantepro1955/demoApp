package com.p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzqh;
import java.util.List;
import p000.bby.C0997a;
import p000.bjt.C1254a;

@bhd
/* renamed from: akk */
public class akk extends aju {
    /* renamed from: l */
    private blo f1861l;

    public akk(Context context, ajx ajx, zzeg zzeg, String str, bex bex, zzqh zzqh) {
        super(context, zzeg, str, bex, zzqh, ajx);
    }

    /* renamed from: a */
    private static bbs m2241a(bfb bfb) throws RemoteException {
        return new bbs(bfb.mo1080a(), bfb.mo1082b(), bfb.mo1084c(), bfb.mo1086d() != null ? bfb.mo1086d() : null, bfb.mo1087e(), bfb.mo1088f(), bfb.mo1089g(), bfb.mo1090h(), null, bfb.mo1094l(), bfb.mo1095m(), null);
    }

    /* renamed from: a */
    private static bbt m2242a(bfc bfc) throws RemoteException {
        return new bbt(bfc.mo1097a(), bfc.mo1099b(), bfc.mo1101c(), bfc.mo1103d() != null ? bfc.mo1103d() : null, bfc.mo1104e(), bfc.mo1105f(), null, bfc.mo1109j(), bfc.mo1111l(), null);
    }

    /* renamed from: a */
    private void m2243a(final bbs bbs) {
        bkg.f6710a.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ akk f1855b;

            public void run() {
                try {
                    if (this.f1855b.f.f14567s != null) {
                        this.f1855b.f.f14567s.mo999a(bbs);
                    }
                } catch (Throwable e) {
                    bky.m9009c("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
                }
            }
        });
    }

    /* renamed from: a */
    private void m2244a(final bbt bbt) {
        bkg.f6710a.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ akk f1857b;

            public void run() {
                try {
                    if (this.f1857b.f.f14568t != null) {
                        this.f1857b.f.f14568t.mo1000a(bbt);
                    }
                } catch (Throwable e) {
                    bky.m9009c("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
                }
            }
        });
    }

    /* renamed from: a */
    private void m2245a(final bjt bjt, final String str) {
        bkg.f6710a.post(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ akk f1860c;

            public void run() {
                try {
                    ((bco) this.f1860c.f.f14570v.get(str)).mo1002a((bbu) bjt.f6541E);
                } catch (Throwable e) {
                    bky.m9009c("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
                }
            }
        });
    }

    /* renamed from: G */
    public void mo261G() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    /* renamed from: J */
    public void m2247J() {
        if (this.f.f14558j == null || this.f1861l == null) {
            bky.m9011e("Request to enable ActiveView before adState is available.");
        } else {
            ako.m2347i().m8964s().m6452a(this.f.f14557i, this.f.f14558j, this.f1861l.mo1305b(), this.f1861l);
        }
    }

    /* renamed from: K */
    public String m2248K() {
        return this.f.f14550b;
    }

    /* renamed from: L */
    public hr<String, bco> m2249L() {
        aoi.m4687b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.f.f14570v;
    }

    /* renamed from: M */
    public void m2250M() {
        if (this.f1861l != null) {
            this.f1861l.destroy();
            this.f1861l = null;
        }
    }

    /* renamed from: N */
    public void m2251N() {
        if (this.f1861l != null && this.f1861l.mo1346z() != null && this.f.f14571w != null && this.f.f14571w.f14966f != null) {
            this.f1861l.mo1346z().m9594b(this.f.f14571w.f14966f.f14958a);
        }
    }

    /* renamed from: O */
    public boolean m2252O() {
        return this.f.f14558j != null && this.f.f14558j.f6559n && this.f.f14558j.f6563r != null && this.f.f14558j.f6563r.f5852o;
    }

    /* renamed from: a */
    public void mo230a(bbn bbn) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    /* renamed from: a */
    public void m2254a(bbv bbv) {
        if (this.f1861l != null) {
            this.f1861l.mo1299a(bbv);
        }
    }

    /* renamed from: a */
    public void m2255a(bby bby) {
        if (this.f.f14558j.f6555j != null) {
            ako.m2347i().m8964s().m6454a(this.f.f14557i, this.f.f14558j, bby);
        }
    }

    /* renamed from: a */
    public void m2256a(bcl bcl) {
        aoi.m4687b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        this.f.f14567s = bcl;
    }

    /* renamed from: a */
    public void m2257a(bcm bcm) {
        aoi.m4687b("setOnContentAdLoadedListener must be called on the main UI thread.");
        this.f.f14568t = bcm;
    }

    /* renamed from: a */
    public void mo231a(bgc bgc) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    /* renamed from: a */
    public void mo282a(final C1254a c1254a, bbj bbj) {
        if (c1254a.f6532d != null) {
            this.f.f14557i = c1254a.f6532d;
        }
        if (c1254a.f6533e != -2) {
            bkg.f6710a.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ akk f1853b;

                public void run() {
                    this.f1853b.mo243b(new bjt(c1254a, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        this.f.f14539F = 0;
        this.f.f14556h = ako.m2342d().m8315a(this.f.f14551c, this, c1254a, this.f.f14552d, null, this.j, this, bbj);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(this.f.f14556h.getClass().getName());
        bky.m9006b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    public void m2260a(blo blo) {
        this.f1861l = blo;
    }

    /* renamed from: a */
    public void m2261a(zzhc zzhc) {
        aoi.m4687b("setNativeAdOptions must be called on the main UI thread.");
        this.f.f14571w = zzhc;
    }

    /* renamed from: a */
    public void m2262a(hr<String, bco> hrVar) {
        aoi.m4687b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        this.f.f14570v = hrVar;
    }

    /* renamed from: a */
    public void m2263a(List<String> list) {
        aoi.m4687b("setNativeTemplates must be called on the main UI thread.");
        this.f.f14535B = list;
    }

    /* renamed from: a */
    protected boolean mo268a(bjt bjt, bjt bjt2) {
        m2263a(null);
        if (this.f.m19374e()) {
            if (bjt2.f6559n) {
                try {
                    bfb h = bjt2.f6561p != null ? bjt2.f6561p.mo1071h() : null;
                    bfc i = bjt2.f6561p != null ? bjt2.f6561p.mo1072i() : null;
                    if (h == null || this.f.f14567s == null) {
                        if (i != null) {
                            if (this.f.f14568t != null) {
                                bbt a = akk.m2242a(i);
                                a.mo925a(new bbw(this.f.f14551c, this, this.f.f14552d, i, (C0997a) a));
                                m2244a(a);
                            }
                        }
                        bky.m9011e("No matching mapper/listener for retrieved native ad template.");
                        m1954a(0);
                        return false;
                    }
                    bbs a2 = akk.m2241a(h);
                    a2.mo925a(new bbw(this.f.f14551c, this, this.f.f14552d, h, (C0997a) a2));
                    m2243a(a2);
                } catch (Throwable e) {
                    bky.m9009c("Failed to get native ad mapper", e);
                }
            } else {
                C0997a c0997a = bjt2.f6541E;
                if ((c0997a instanceof bbt) && this.f.f14568t != null) {
                    m2244a((bbt) bjt2.f6541E);
                } else if ((c0997a instanceof bbs) && this.f.f14567s != null) {
                    m2243a((bbs) bjt2.f6541E);
                } else if (!(c0997a instanceof bbu) || this.f.f14570v == null || this.f.f14570v.get(((bbu) c0997a).mo936l()) == null) {
                    bky.m9011e("No matching listener for retrieved native ad template.");
                    m1954a(0);
                    return false;
                } else {
                    m2245a(bjt2, ((bbu) c0997a).mo936l());
                }
            }
            return super.mo268a(bjt, bjt2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    /* renamed from: a */
    public boolean mo269a(zzec zzec, bbj bbj) {
        if (((Boolean) bbb.cg.m7064c()).booleanValue() && ((Boolean) bbb.ch.m7064c()).booleanValue()) {
            bgu bgu = new bgu(this.f.f14551c, this, this.f.f14552d, this.f.f14553e);
            bgu.m8351a();
            try {
                bgu.m8353b();
            } catch (Throwable e) {
                bky.m9009c("Initializing javascript failed", e);
                return false;
            }
        }
        return super.mo269a(zzec, bbj);
    }

    /* renamed from: a */
    protected boolean mo306a(zzec zzec, bjt bjt, boolean z) {
        return this.e.m2281d();
    }

    /* renamed from: b */
    public void m2267b(hr<String, bcn> hrVar) {
        aoi.m4687b("setOnCustomClickListener must be called on the main UI thread.");
        this.f.f14569u = hrVar;
    }

    /* renamed from: c */
    public bcn m2268c(String str) {
        aoi.m4687b("getOnCustomClickListener must be called on the main UI thread.");
        return (bcn) this.f.f14569u.get(str);
    }

    /* renamed from: m */
    public void mo250m() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    /* renamed from: n */
    public void mo251n() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }
}

package com.p000;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzoo;
import com.google.android.gms.internal.zzqh;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p000.bjt.C1254a;

@bhd
/* renamed from: bim */
public class bim extends aju implements bja {
    /* renamed from: l */
    private static bim f6460l;
    /* renamed from: m */
    private static final bev f6461m = new bev();
    /* renamed from: n */
    private final Map<String, bje> f6462n = new HashMap();
    /* renamed from: o */
    private boolean f6463o;

    /* renamed from: bim$1 */
    class C12381 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bim f6457a;

        C12381(bim bim) {
            this.f6457a = bim;
        }

        public void run() {
            this.f6457a.m1954a(1);
        }
    }

    public bim(Context context, ajx ajx, zzeg zzeg, bex bex, zzqh zzqh) {
        super(context, zzeg, null, bex, zzqh, ajx);
        f6460l = this;
    }

    /* renamed from: J */
    public static bim m8705J() {
        return f6460l;
    }

    /* renamed from: b */
    private C1254a m8707b(C1254a c1254a) {
        bkc.m9012a("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            String jSONObject = bhx.m8574a(c1254a.f6530b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, c1254a.f6529a.f15036e);
            bem bem = new bem(jSONObject, null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), null, null, Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList());
            return new C1254a(c1254a.f6529a, c1254a.f6530b, new ben(Arrays.asList(new bem[]{bem}), ((Long) bbb.bG.m7064c()).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, null, 0, -1, -1, false), c1254a.f6532d, c1254a.f6533e, c1254a.f6534f, c1254a.f6535g, c1254a.f6536h);
        } catch (Throwable e) {
            bky.m9007b("Unable to generate ad state for non-mediated rewarded video.", e);
            return m8708c(c1254a);
        }
    }

    /* renamed from: c */
    private C1254a m8708c(C1254a c1254a) {
        return new C1254a(c1254a.f6529a, c1254a.f6530b, null, c1254a.f6532d, 0, c1254a.f6534f, c1254a.f6535g, c1254a.f6536h);
    }

    /* renamed from: K */
    public void m8709K() {
        aoi.m4687b("showAd must be called on the main UI thread.");
        if (m8710L()) {
            this.f6463o = true;
            bje c = m8722c(this.f.f14558j.f6562q);
            if (c != null && c.m8840a() != null) {
                try {
                    c.m8840a().mo1069f();
                    return;
                } catch (Throwable e) {
                    bky.m9009c("Could not call showVideo.", e);
                    return;
                }
            }
            return;
        }
        bky.m9011e("The reward video has not loaded.");
    }

    /* renamed from: L */
    public boolean m8710L() {
        aoi.m4687b("isLoaded must be called on the main UI thread.");
        return this.f.f14555g == null && this.f.f14556h == null && this.f.f14558j != null && !this.f6463o;
    }

    /* renamed from: M */
    public void mo1216M() {
        mo287a(this.f.f14558j, false);
        m2000t();
    }

    /* renamed from: N */
    public void mo1217N() {
        if (!(this.f.f14558j == null || this.f.f14558j.f6560o == null)) {
            ako.m2362x().m7902a(this.f.f14551c, this.f.f14553e.f15121a, this.f.f14558j, this.f.f14550b, false, this.f.f14558j.f6560o.f5831j);
        }
        m2002v();
    }

    /* renamed from: O */
    public void mo1218O() {
        mo309r();
    }

    /* renamed from: P */
    public void mo1219P() {
        onAdClicked();
    }

    /* renamed from: Q */
    public void mo1220Q() {
        m1999s();
    }

    /* renamed from: a */
    public void m8716a(Context context) {
        for (bje a : this.f6462n.values()) {
            try {
                a.m8840a().mo1055a(aqr.m4967a((Object) context));
            } catch (Throwable e) {
                bky.m9007b("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    /* renamed from: a */
    public void mo282a(final C1254a c1254a, bbj bbj) {
        if (c1254a.f6533e != -2) {
            bkg.f6710a.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ bim f6459b;

                public void run() {
                    this.f6459b.mo243b(new bjt(c1254a, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        this.f.f14559k = c1254a;
        if (c1254a.f6531c == null) {
            this.f.f14559k = m8707b(c1254a);
        }
        this.f.f14539F = 0;
        this.f.f14556h = ako.m2342d().m8316a(this.f.f14551c, this.f.f14559k, this);
    }

    /* renamed from: a */
    public void m8718a(zzoa zzoa) {
        aoi.m4687b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(zzoa.f15113b)) {
            bky.m9011e("Invalid ad unit id. Aborting.");
            bkg.f6710a.post(new C12381(this));
            return;
        }
        this.f6463o = false;
        this.f.f14550b = zzoa.f15113b;
        super.mo242a(zzoa.f15112a);
    }

    /* renamed from: a */
    public boolean mo268a(bjt bjt, bjt bjt2) {
        return true;
    }

    /* renamed from: a */
    protected boolean mo306a(zzec zzec, bjt bjt, boolean z) {
        return false;
    }

    /* renamed from: b */
    public void mo1221b(zzoo zzoo) {
        if (!(this.f.f14558j == null || this.f.f14558j.f6560o == null)) {
            ako.m2362x().m7902a(this.f.f14551c, this.f.f14553e.f15121a, this.f.f14558j, this.f.f14550b, false, this.f.f14558j.f6560o.f5832k);
        }
        if (!(this.f.f14558j == null || this.f.f14558j.f6563r == null || TextUtils.isEmpty(this.f.f14558j.f6563r.f5847j))) {
            zzoo = new zzoo(this.f.f14558j.f6563r.f5847j, this.f.f14558j.f6563r.f5848k);
        }
        m1969a(zzoo);
    }

    /* renamed from: c */
    public bje m8722c(String str) {
        bje bje;
        Throwable th;
        String str2;
        String valueOf;
        bje bje2 = (bje) this.f6462n.get(str);
        if (bje2 != null) {
            return bje2;
        }
        try {
            bje = new bje(("com.google.ads.mediation.admob.AdMobAdapter".equals(str) ? f6461m : this.j).mo1052a(str), this);
            try {
                this.f6462n.put(str, bje);
                return bje;
            } catch (Throwable e) {
                th = e;
                str2 = "Fail to instantiate adapter ";
                valueOf = String.valueOf(str);
                bky.m9009c(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), th);
                return bje;
            }
        } catch (Throwable e2) {
            th = e2;
            bje = bje2;
            str2 = "Fail to instantiate adapter ";
            valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
            }
            bky.m9009c(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), th);
            return bje;
        }
    }

    /* renamed from: h */
    public void mo245h() {
        String valueOf;
        aoi.m4687b("destroy must be called on the main UI thread.");
        for (String valueOf2 : this.f6462n.keySet()) {
            try {
                bje bje = (bje) this.f6462n.get(valueOf2);
                if (!(bje == null || bje.m8840a() == null)) {
                    bje.m8840a().mo1066c();
                }
            } catch (RemoteException e) {
                String str = "Fail to destroy adapter: ";
                valueOf2 = String.valueOf(valueOf2);
                bky.m9011e(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
            }
        }
    }

    /* renamed from: m */
    public void mo250m() {
        aoi.m4687b("pause must be called on the main UI thread.");
        for (String str : this.f6462n.keySet()) {
            String str2;
            try {
                bje bje = (bje) this.f6462n.get(str2);
                if (!(bje == null || bje.m8840a() == null)) {
                    bje.m8840a().mo1067d();
                }
            } catch (RemoteException e) {
                String str3 = "Fail to pause adapter: ";
                str2 = String.valueOf(str2);
                bky.m9011e(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            }
        }
    }

    /* renamed from: n */
    public void mo251n() {
        aoi.m4687b("resume must be called on the main UI thread.");
        for (String str : this.f6462n.keySet()) {
            String str2;
            try {
                bje bje = (bje) this.f6462n.get(str2);
                if (!(bje == null || bje.m8840a() == null)) {
                    bje.m8840a().mo1068e();
                }
            } catch (RemoteException e) {
                String str3 = "Fail to resume adapter: ";
                str2 = String.valueOf(str2);
                bky.m9011e(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            }
        }
    }

    /* renamed from: r */
    protected void mo309r() {
        this.f.f14558j = null;
        super.mo309r();
    }
}

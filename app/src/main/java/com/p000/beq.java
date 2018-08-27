package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzqh;
import com.millennialmedia.internal.utils.EnvironmentUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p000.aih.C0193a;
import p000.ber.C1120a;
import p000.bfa.C1118a;

@bhd
/* renamed from: beq */
public class beq implements C1120a {
    /* renamed from: a */
    private final String f5861a;
    /* renamed from: b */
    private final bex f5862b;
    /* renamed from: c */
    private final long f5863c;
    /* renamed from: d */
    private final ben f5864d;
    /* renamed from: e */
    private final bem f5865e;
    /* renamed from: f */
    private zzec f5866f;
    /* renamed from: g */
    private final zzeg f5867g;
    /* renamed from: h */
    private final Context f5868h;
    /* renamed from: i */
    private final Object f5869i = new Object();
    /* renamed from: j */
    private final zzqh f5870j;
    /* renamed from: k */
    private final boolean f5871k;
    /* renamed from: l */
    private final zzhc f5872l;
    /* renamed from: m */
    private final List<String> f5873m;
    /* renamed from: n */
    private final boolean f5874n;
    /* renamed from: o */
    private bey f5875o;
    /* renamed from: p */
    private int f5876p = -2;
    /* renamed from: q */
    private bfa f5877q;

    /* renamed from: beq$2 */
    class C11192 extends C1118a {
        /* renamed from: a */
        final /* synthetic */ int f5860a;

        C11192(int i) {
            this.f5860a = i;
        }

        /* renamed from: a */
        public int mo1046a() throws RemoteException {
            return this.f5860a;
        }
    }

    public beq(Context context, String str, bex bex, ben ben, bem bem, zzec zzec, zzeg zzeg, zzqh zzqh, boolean z, boolean z2, zzhc zzhc, List<String> list) {
        this.f5868h = context;
        this.f5862b = bex;
        this.f5865e = bem;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.f5861a = m7883b();
        } else {
            this.f5861a = str;
        }
        this.f5864d = ben;
        this.f5863c = ben.f5839b != -1 ? ben.f5839b : 10000;
        this.f5866f = zzec;
        this.f5867g = zzeg;
        this.f5870j = zzqh;
        this.f5871k = z;
        this.f5874n = z2;
        this.f5872l = zzhc;
        this.f5873m = list;
    }

    /* renamed from: a */
    private long m7874a(long j, long j2, long j3, long j4) {
        while (this.f5876p == -2) {
            m7884b(j, j2, j3, j4);
        }
        return ako.m2349k().mo607b() - j;
    }

    /* renamed from: a */
    private String m7877a(String str) {
        if (!(str == null || !m7892e() || m7885b(2))) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.remove("cpm_floor_cents");
                str = jSONObject.toString();
            } catch (JSONException e) {
                bky.m9011e("Could not remove field. Returning the original value");
            }
        }
        return str;
    }

    /* renamed from: a */
    private void m7878a(bep bep) {
        String a = m7877a(this.f5865e.f5830i);
        try {
            if (this.f5870j.f15123c < 4100000) {
                if (this.f5867g.f14934d) {
                    this.f5875o.mo1057a(aqr.m4967a(this.f5868h), this.f5866f, a, bep);
                } else {
                    this.f5875o.mo1061a(aqr.m4967a(this.f5868h), this.f5867g, this.f5866f, a, (bez) bep);
                }
            } else if (this.f5871k) {
                this.f5875o.mo1060a(aqr.m4967a(this.f5868h), this.f5866f, a, this.f5865e.f5822a, bep, this.f5872l, this.f5873m);
            } else if (this.f5867g.f14934d) {
                this.f5875o.mo1059a(aqr.m4967a(this.f5868h), this.f5866f, a, this.f5865e.f5822a, (bez) bep);
            } else if (!this.f5874n) {
                this.f5875o.mo1062a(aqr.m4967a(this.f5868h), this.f5867g, this.f5866f, a, this.f5865e.f5822a, bep);
            } else if (this.f5865e.f5833l != null) {
                this.f5875o.mo1060a(aqr.m4967a(this.f5868h), this.f5866f, a, this.f5865e.f5822a, bep, new zzhc(beq.m7882b(this.f5865e.f5837p)), this.f5865e.f5836o);
            } else {
                this.f5875o.mo1062a(aqr.m4967a(this.f5868h), this.f5867g, this.f5866f, a, this.f5865e.f5822a, bep);
            }
        } catch (Throwable e) {
            bky.m9009c("Could not request ad from mediation adapter.", e);
            mo1047a(5);
        }
    }

    /* renamed from: b */
    private static aih m7882b(String str) {
        C0193a c0193a = new C0193a();
        if (str == null) {
            return c0193a.m1676a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            c0193a.m1678b(jSONObject.optBoolean("multiple_images", false));
            c0193a.m1675a(jSONObject.optBoolean("only_urls", false));
            c0193a.m1673a(beq.m7886c(jSONObject.optString("native_image_orientation", "any")));
        } catch (Throwable e) {
            bky.m9009c("Exception occurred when creating native ad options", e);
        }
        return c0193a.m1676a();
    }

    /* renamed from: b */
    private String m7883b() {
        try {
            if (!TextUtils.isEmpty(this.f5865e.f5826e)) {
                return this.f5862b.mo1053b(this.f5865e.f5826e) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException e) {
            bky.m9011e("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    /* renamed from: b */
    private void m7884b(long j, long j2, long j3, long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = j2 - (elapsedRealtime - j);
        elapsedRealtime = j4 - (elapsedRealtime - j3);
        if (j5 <= 0 || elapsedRealtime <= 0) {
            bky.m9010d("Timed out waiting for adapter.");
            this.f5876p = 3;
            return;
        }
        try {
            this.f5869i.wait(Math.min(j5, elapsedRealtime));
        } catch (InterruptedException e) {
            this.f5876p = -1;
        }
    }

    /* renamed from: b */
    private boolean m7885b(int i) {
        try {
            Bundle l = this.f5871k ? this.f5875o.mo1075l() : this.f5867g.f14934d ? this.f5875o.mo1074k() : this.f5875o.mo1073j();
            if (l == null) {
                return false;
            }
            return (l.getInt("capabilities", 0) & i) == i;
        } catch (RemoteException e) {
            bky.m9011e("Could not get adapter info. Returning false");
            return false;
        }
    }

    /* renamed from: c */
    private static int m7886c(String str) {
        return EnvironmentUtils.ORIENTATION_LANDSCAPE.equals(str) ? 2 : EnvironmentUtils.ORIENTATION_PORTRAIT.equals(str) ? 1 : 0;
    }

    /* renamed from: c */
    private bfa m7888c() {
        if (this.f5876p != 0 || !m7892e()) {
            return null;
        }
        try {
            if (!(!m7885b(4) || this.f5877q == null || this.f5877q.mo1046a() == 0)) {
                return this.f5877q;
            }
        } catch (RemoteException e) {
            bky.m9011e("Could not get cpm value from MediationResponseMetadata");
        }
        return beq.m7889c(m7894f());
    }

    /* renamed from: c */
    private static bfa m7889c(int i) {
        return new C11192(i);
    }

    /* renamed from: d */
    private bey m7890d() {
        String str = "Instantiating mediation adapter: ";
        String valueOf = String.valueOf(this.f5861a);
        bky.m9010d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (!this.f5871k) {
            if (((Boolean) bbb.bC.m7064c()).booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.f5861a)) {
                return m7897a(new AdMobAdapter());
            }
            if (((Boolean) bbb.bD.m7064c()).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.f5861a)) {
                return m7897a(new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.f5861a)) {
                return new bfe(new bfm());
            }
        }
        try {
            return this.f5862b.mo1052a(this.f5861a);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "Could not instantiate mediation adapter: ";
            valueOf = String.valueOf(this.f5861a);
            bky.m9004a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m7892e() {
        return this.f5864d.f5849l != -1;
    }

    /* renamed from: f */
    private int m7894f() {
        if (this.f5865e.f5830i == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f5865e.f5830i);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f5861a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = m7885b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            return optInt == 0 ? jSONObject.optInt("penalized_average_cpm_cents", 0) : optInt;
        } catch (JSONException e) {
            bky.m9011e("Could not convert to json. Returning 0");
            return 0;
        }
    }

    /* renamed from: a */
    public ber m7896a(long j, long j2) {
        ber ber;
        synchronized (this.f5869i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final bep bep = new bep();
            bkg.f6710a.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ beq f5859b;

                public void run() {
                    synchronized (this.f5859b.f5869i) {
                        if (this.f5859b.f5876p != -2) {
                            return;
                        }
                        this.f5859b.f5875o = this.f5859b.m7890d();
                        if (this.f5859b.f5875o == null) {
                            this.f5859b.mo1047a(4);
                        } else if (!this.f5859b.m7892e() || this.f5859b.m7885b(1)) {
                            bep.m7862a(this.f5859b);
                            this.f5859b.m7878a(bep);
                        } else {
                            String f = this.f5859b.f5861a;
                            bky.m9011e(new StringBuilder(String.valueOf(f).length() + 56).append("Ignoring adapter ").append(f).append(" as delayed impression is not supported").toString());
                            this.f5859b.mo1047a(2);
                        }
                    }
                }
            });
            bep bep2 = bep;
            ber = new ber(this.f5865e, this.f5875o, this.f5861a, bep2, this.f5876p, m7888c(), m7874a(elapsedRealtime, this.f5863c, j, j2));
        }
        return ber;
    }

    /* renamed from: a */
    protected bey m7897a(MediationAdapter mediationAdapter) {
        return new bfe(mediationAdapter);
    }

    /* renamed from: a */
    public void m7898a() {
        synchronized (this.f5869i) {
            try {
                if (this.f5875o != null) {
                    this.f5875o.mo1066c();
                }
            } catch (Throwable e) {
                bky.m9009c("Could not destroy mediation adapter.", e);
            }
            this.f5876p = -1;
            this.f5869i.notify();
        }
    }

    /* renamed from: a */
    public void mo1047a(int i) {
        synchronized (this.f5869i) {
            this.f5876p = i;
            this.f5869i.notify();
        }
    }

    /* renamed from: a */
    public void mo1048a(int i, bfa bfa) {
        synchronized (this.f5869i) {
            this.f5876p = i;
            this.f5877q = bfa;
            this.f5869i.notify();
        }
    }
}

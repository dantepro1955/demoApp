package com.p000;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzmk;
import com.google.android.gms.internal.zzmk.C3314a;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.internal.zzqh;
import org.json.JSONObject;
import p000.bhe.C0219a;
import p000.bhg.C1201a;
import p000.bjt.C1254a;

@bhd
/* renamed from: bhf */
public class bhf extends bkb implements C1201a {
    /* renamed from: a */
    bki f6233a;
    /* renamed from: b */
    zzmn f6234b;
    /* renamed from: c */
    ben f6235c;
    /* renamed from: d */
    private final C0219a f6236d;
    /* renamed from: e */
    private final C3314a f6237e;
    /* renamed from: f */
    private final Object f6238f = new Object();
    /* renamed from: g */
    private final Context f6239g;
    /* renamed from: h */
    private zzmk f6240h;
    /* renamed from: i */
    private Runnable f6241i;

    /* renamed from: bhf$1 */
    class C11981 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bhf f6229a;

        C11981(bhf bhf) {
            this.f6229a = bhf;
        }

        public void run() {
            synchronized (this.f6229a.f6238f) {
                if (this.f6229a.f6233a == null) {
                    return;
                }
                this.f6229a.mo197b();
                this.f6229a.m8450a(2, "Timed out waiting for ad response.");
            }
        }
    }

    @bhd
    /* renamed from: bhf$a */
    static final class C1200a extends Exception {
        /* renamed from: a */
        private final int f6232a;

        public C1200a(String str, int i) {
            super(str);
            this.f6232a = i;
        }

        /* renamed from: a */
        public int m8447a() {
            return this.f6232a;
        }
    }

    public bhf(Context context, C3314a c3314a, C0219a c0219a) {
        this.f6236d = c0219a;
        this.f6239g = context;
        this.f6237e = c3314a;
    }

    /* renamed from: a */
    private void m8450a(int i, String str) {
        if (i == 3 || i == -1) {
            bky.m9010d(str);
        } else {
            bky.m9011e(str);
        }
        if (this.f6234b == null) {
            this.f6234b = new zzmn(i);
        } else {
            this.f6234b = new zzmn(i, this.f6234b.f15085k);
        }
        this.f6236d.mo234a(new C1254a(this.f6240h != null ? this.f6240h : new zzmk(this.f6237e, -1, null, null, null), this.f6234b, this.f6235c, null, i, -1, this.f6234b.f15088n, null));
    }

    /* renamed from: a */
    bki m8454a(zzqh zzqh, blh<zzmk> blh) {
        return bhg.m8463a(this.f6239g, zzqh, blh, this);
    }

    /* renamed from: a */
    protected zzeg m8455a(zzmk zzmk) throws C1200a {
        int i;
        if (this.f6234b.f15058A) {
            for (zzeg zzeg : zzmk.f15035d.f14937g) {
                if (zzeg.f14939i) {
                    return new zzeg(zzeg, zzmk.f15035d.f14937g);
                }
            }
        }
        if (this.f6234b.f15087m == null) {
            throw new C1200a("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = this.f6234b.f15087m.split("x");
        if (split.length != 2) {
            String str = "Invalid ad size format from the ad response: ";
            String valueOf = String.valueOf(this.f6234b.f15087m);
            throw new C1200a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            for (zzeg zzeg2 : zzmk.f15035d.f14937g) {
                float f = this.f6239g.getResources().getDisplayMetrics().density;
                i = zzeg2.f14935e == -1 ? (int) (((float) zzeg2.f14936f) / f) : zzeg2.f14935e;
                int i2 = zzeg2.f14932b == -2 ? (int) (((float) zzeg2.f14933c) / f) : zzeg2.f14932b;
                if (parseInt == i && parseInt2 == i2 && !zzeg2.f14939i) {
                    return new zzeg(zzeg2, zzmk.f15035d.f14937g);
                }
            }
            str = "The ad size from the ad response was not one of the requested sizes: ";
            valueOf = String.valueOf(this.f6234b.f15087m);
            throw new C1200a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        } catch (NumberFormatException e) {
            str = "Invalid ad size number from the ad response: ";
            valueOf = String.valueOf(this.f6234b.f15087m);
            throw new C1200a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        }
    }

    /* renamed from: a */
    public void mo196a() {
        bky.m9006b("AdLoaderBackgroundTask started.");
        this.f6241i = new C11981(this);
        bkg.f6710a.postDelayed(this.f6241i, ((Long) bbb.bF.m7064c()).longValue());
        long b = ako.m2349k().mo607b();
        if (((Boolean) bbb.bE.m7064c()).booleanValue() && this.f6237e.f14985b.f14915c != null) {
            String string = this.f6237e.f14985b.f14915c.getString("_ad");
            if (string != null) {
                this.f6240h = new zzmk(this.f6237e, b, null, null, null);
                mo1188a(bhx.m8567a(this.f6239g, this.f6240h, string));
                return;
            }
        }
        final blh bli = new bli();
        bkf.m9059a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bhf f6231b;

            public void run() {
                synchronized (this.f6231b.f6238f) {
                    this.f6231b.f6233a = this.f6231b.m8454a(this.f6231b.f6237e.f14993j, bli);
                    if (this.f6231b.f6233a == null) {
                        this.f6231b.m8450a(0, "Could not start the ad request service.");
                        bkg.f6710a.removeCallbacks(this.f6231b.f6241i);
                    }
                }
            }
        });
        String b2 = ako.m2336D().m8880b(this.f6239g);
        String c = ako.m2336D().m8883c(this.f6239g);
        String d = ako.m2336D().m8886d(this.f6239g);
        ako.m2336D().m8889e(this.f6239g, d);
        this.f6240h = new zzmk(this.f6237e, b, b2, c, d);
        bli.mo1033a(this.f6240h);
    }

    /* renamed from: a */
    public void mo1188a(zzmn zzmn) {
        bky.m9006b("Received ad response.");
        this.f6234b = zzmn;
        long b = ako.m2349k().mo607b();
        synchronized (this.f6238f) {
            this.f6233a = null;
        }
        ako.m2347i().m8938b(this.f6239g, this.f6234b.f15065H);
        if (((Boolean) bbb.aW.m7064c()).booleanValue()) {
            if (this.f6234b.f15073P) {
                ako.m2347i().m8929a(this.f6239g, this.f6240h.f15036e);
            } else {
                ako.m2347i().m8940b(this.f6239g, this.f6240h.f15036e);
            }
        }
        try {
            if (this.f6234b.f15079e == -2 || this.f6234b.f15079e == -3) {
                JSONObject jSONObject;
                m8459e();
                zzeg a = this.f6240h.f15035d.f14937g != null ? m8455a(this.f6240h) : null;
                ako.m2347i().m8941b(this.f6234b.f15096v);
                ako.m2347i().m8943c(this.f6234b.f15072O);
                if (!TextUtils.isEmpty(this.f6234b.f15092r)) {
                    try {
                        jSONObject = new JSONObject(this.f6234b.f15092r);
                    } catch (Throwable e) {
                        bky.m9007b("Error parsing the JSON for Active View.", e);
                    }
                    this.f6236d.mo234a(new C1254a(this.f6240h, this.f6234b, this.f6235c, a, -2, b, this.f6234b.f15088n, jSONObject));
                    bkg.f6710a.removeCallbacks(this.f6241i);
                    return;
                }
                jSONObject = null;
                this.f6236d.mo234a(new C1254a(this.f6240h, this.f6234b, this.f6235c, a, -2, b, this.f6234b.f15088n, jSONObject));
                bkg.f6710a.removeCallbacks(this.f6241i);
                return;
            }
            throw new C1200a("There was a problem getting an ad response. ErrorCode: " + this.f6234b.f15079e, this.f6234b.f15079e);
        } catch (C1200a e2) {
            m8450a(e2.m8447a(), e2.getMessage());
            bkg.f6710a.removeCallbacks(this.f6241i);
        }
    }

    /* renamed from: b */
    public void mo197b() {
        synchronized (this.f6238f) {
            if (this.f6233a != null) {
                this.f6233a.mo194c();
            }
        }
    }

    /* renamed from: e */
    protected void m8459e() throws C1200a {
        if (this.f6234b.f15079e != -3) {
            if (TextUtils.isEmpty(this.f6234b.f15077c)) {
                throw new C1200a("No fill from ad server.", 3);
            }
            ako.m2347i().m8926a(this.f6239g, this.f6234b.f15095u);
            if (this.f6234b.f15082h) {
                try {
                    this.f6235c = new ben(this.f6234b.f15077c);
                    ako.m2347i().m8948d(this.f6235c.f5844g);
                } catch (Throwable e) {
                    bky.m9007b("Could not parse mediation config.", e);
                    String str = "Could not parse mediation config: ";
                    String valueOf = String.valueOf(this.f6234b.f15077c);
                    throw new C1200a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
                }
            }
            ako.m2347i().m8948d(this.f6234b.f15068K);
            if (!TextUtils.isEmpty(this.f6234b.f15066I) && ((Boolean) bbb.cV.m7064c()).booleanValue()) {
                bky.m9006b("Received cookie from server. Setting webview cookie in CookieManager.");
                CookieManager c = ako.m2345g().mo1281c(this.f6239g);
                if (c != null) {
                    c.setCookie("googleads.g.doubleclick.net", this.f6234b.f15066I);
                }
            }
        }
    }
}

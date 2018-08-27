package com.p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.zzeg;

@bhd
/* renamed from: bak */
public class bak {
    /* renamed from: a */
    private final bev f5263a;
    /* renamed from: b */
    private final Context f5264b;
    /* renamed from: c */
    private final azl f5265c;
    /* renamed from: d */
    private aht f5266d;
    /* renamed from: e */
    private azd f5267e;
    /* renamed from: f */
    private azx f5268f;
    /* renamed from: g */
    private String f5269g;
    /* renamed from: h */
    private String f5270h;
    /* renamed from: i */
    private aib f5271i;
    /* renamed from: j */
    private aks f5272j;
    /* renamed from: k */
    private akq f5273k;
    /* renamed from: l */
    private aif f5274l;
    /* renamed from: m */
    private aid f5275m;
    /* renamed from: n */
    private ahx f5276n;
    /* renamed from: o */
    private aku f5277o;
    /* renamed from: p */
    private boolean f5278p;

    public bak(Context context) {
        this(context, azl.m6730a(), null);
    }

    public bak(Context context, azl azl, aif aif) {
        this.f5263a = new bev();
        this.f5264b = context;
        this.f5265c = azl;
        this.f5274l = aif;
    }

    /* renamed from: b */
    private void m6974b(String str) throws RemoteException {
        if (this.f5269g == null) {
            m6975c(str);
        }
        this.f5268f = azp.m6791b().m6787b(this.f5264b, this.f5278p ? zzeg.m19666a() : new zzeg(), this.f5269g, this.f5263a);
        if (this.f5266d != null) {
            this.f5268f.mo227a(new azf(this.f5266d));
        }
        if (this.f5267e != null) {
            this.f5268f.mo226a(new aze(this.f5267e));
        }
        if (this.f5271i != null) {
            this.f5268f.mo228a(new azn(this.f5271i));
        }
        if (this.f5273k != null) {
            this.f5268f.mo231a(new bgh(this.f5273k));
        }
        if (this.f5272j != null) {
            this.f5268f.mo232a(new bgl(this.f5272j), this.f5270h);
        }
        if (this.f5275m != null) {
            this.f5268f.mo230a(new bbo(this.f5275m));
        }
        if (this.f5276n != null) {
            this.f5268f.mo229a(this.f5276n.m1633a());
        }
        if (this.f5277o != null) {
            this.f5268f.mo233a(new bit(this.f5277o));
        }
    }

    /* renamed from: c */
    private void m6975c(String str) {
        if (this.f5268f == null) {
            throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 63).append("The ad unit ID must be set on InterstitialAd before ").append(str).append(" is called.").toString());
        }
    }

    /* renamed from: a */
    public void m6976a() {
        try {
            m6975c("show");
            this.f5268f.mo261G();
        } catch (Throwable e) {
            bky.m9009c("Failed to show interstitial.", e);
        }
    }

    /* renamed from: a */
    public void m6977a(aht aht) {
        try {
            this.f5266d = aht;
            if (this.f5268f != null) {
                this.f5268f.mo227a(aht != null ? new azf(aht) : null);
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to set the AdListener.", e);
        }
    }

    /* renamed from: a */
    public void m6978a(aku aku) {
        try {
            this.f5277o = aku;
            if (this.f5268f != null) {
                this.f5268f.mo233a(aku != null ? new bit(aku) : null);
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to set the AdListener.", e);
        }
    }

    /* renamed from: a */
    public void m6979a(azd azd) {
        try {
            this.f5267e = azd;
            if (this.f5268f != null) {
                this.f5268f.mo226a(azd != null ? new aze(azd) : null);
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to set the AdClickListener.", e);
        }
    }

    /* renamed from: a */
    public void m6980a(bai bai) {
        try {
            if (this.f5268f == null) {
                m6974b("loadAd");
            }
            if (this.f5268f.mo242a(this.f5265c.m6731a(this.f5264b, bai))) {
                this.f5263a.m7924a(bai.m6933j());
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public void m6981a(String str) {
        if (this.f5269g != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.f5269g = str;
    }

    /* renamed from: a */
    public void m6982a(boolean z) {
        this.f5278p = z;
    }
}

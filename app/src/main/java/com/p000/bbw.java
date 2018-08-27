package com.p000;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
import p000.bby.C0997a;

@bhd
/* renamed from: bbw */
public class bbw extends bbz {
    /* renamed from: b */
    private bfb f5524b;
    /* renamed from: c */
    private bfc f5525c;
    /* renamed from: d */
    private final akk f5526d;
    /* renamed from: e */
    private bby f5527e;
    /* renamed from: f */
    private boolean f5528f;
    /* renamed from: g */
    private Object f5529g;

    private bbw(Context context, akk akk, avc avc, C0997a c0997a) {
        super(context, akk, null, avc, null, c0997a, null, null);
        this.f5528f = false;
        this.f5529g = new Object();
        this.f5526d = akk;
    }

    public bbw(Context context, akk akk, avc avc, bfb bfb, C0997a c0997a) {
        this(context, akk, avc, c0997a);
        this.f5524b = bfb;
    }

    public bbw(Context context, akk akk, avc avc, bfc bfc, C0997a c0997a) {
        this(context, akk, avc, c0997a);
        this.f5525c = bfc;
    }

    /* renamed from: a */
    public View mo961a(OnClickListener onClickListener, boolean z) {
        synchronized (this.f5529g) {
            if (this.f5527e != null) {
                View a = this.f5527e.mo961a(onClickListener, z);
                return a;
            }
            aqq n;
            try {
                if (this.f5524b != null) {
                    n = this.f5524b.mo1096n();
                } else {
                    if (this.f5525c != null) {
                        n = this.f5525c.mo1110k();
                    }
                    n = null;
                }
            } catch (Throwable e) {
                bky.m9009c("Failed to call getAdChoicesContent", e);
            }
            if (n != null) {
                a = (View) aqr.m4968a(n);
                return a;
            }
            return null;
        }
    }

    /* renamed from: a */
    public void mo966a(View view, Map<String, WeakReference<View>> map) {
        aoi.m4687b("recordImpression must be called on the main UI thread.");
        synchronized (this.f5529g) {
            m7330a(true);
            if (this.f5527e != null) {
                this.f5527e.mo966a(view, (Map) map);
                this.f5526d.m2021E();
            } else {
                try {
                    if (this.f5524b != null && !this.f5524b.mo1092j()) {
                        this.f5524b.mo1091i();
                        this.f5526d.m2021E();
                    } else if (!(this.f5525c == null || this.f5525c.mo1107h())) {
                        this.f5525c.mo1106g();
                        this.f5526d.m2021E();
                    }
                } catch (Throwable e) {
                    bky.m9009c("Failed to call recordImpression", e);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo973a(View view, Map<String, WeakReference<View>> map, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        synchronized (this.f5529g) {
            this.f5528f = true;
            try {
                if (this.f5524b != null) {
                    this.f5524b.mo1083b(aqr.m4967a((Object) view));
                } else if (this.f5525c != null) {
                    this.f5525c.mo1100b(aqr.m4967a((Object) view));
                }
            } catch (Throwable e) {
                bky.m9009c("Failed to call prepareAd", e);
            }
            this.f5528f = false;
        }
    }

    /* renamed from: a */
    public void mo967a(View view, Map<String, WeakReference<View>> map, JSONObject jSONObject, View view2) {
        aoi.m4687b("performClick must be called on the main UI thread.");
        synchronized (this.f5529g) {
            if (this.f5527e != null) {
                this.f5527e.mo967a(view, map, jSONObject, view2);
                this.f5526d.onAdClicked();
            } else {
                try {
                    if (!(this.f5524b == null || this.f5524b.mo1093k())) {
                        this.f5524b.mo1081a(aqr.m4967a((Object) view));
                        this.f5526d.onAdClicked();
                    }
                    if (!(this.f5525c == null || this.f5525c.mo1108i())) {
                        this.f5525c.mo1098a(aqr.m4967a((Object) view));
                        this.f5526d.onAdClicked();
                    }
                } catch (Throwable e) {
                    bky.m9009c("Failed to call performClick", e);
                }
            }
        }
    }

    /* renamed from: a */
    public void m7348a(bby bby) {
        synchronized (this.f5529g) {
            this.f5527e = bby;
        }
    }

    /* renamed from: a */
    public boolean mo968a() {
        boolean a;
        synchronized (this.f5529g) {
            if (this.f5527e != null) {
                a = this.f5527e.mo968a();
            } else {
                a = this.f5526d.m2252O();
            }
        }
        return a;
    }

    /* renamed from: b */
    public void mo969b(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f5529g) {
            try {
                if (this.f5524b != null) {
                    this.f5524b.mo1085c(aqr.m4967a((Object) view));
                } else if (this.f5525c != null) {
                    this.f5525c.mo1102c(aqr.m4967a((Object) view));
                }
            } catch (Throwable e) {
                bky.m9009c("Failed to call untrackView", e);
            }
        }
    }

    /* renamed from: b */
    public boolean m7351b() {
        boolean z;
        synchronized (this.f5529g) {
            z = this.f5528f;
        }
        return z;
    }

    /* renamed from: c */
    public bby m7352c() {
        bby bby;
        synchronized (this.f5529g) {
            bby = this.f5527e;
        }
        return bby;
    }

    /* renamed from: d */
    public blo mo974d() {
        return null;
    }
}

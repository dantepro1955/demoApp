package com.p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Window;
import com.facebook.internal.NativeProtocol;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.internal.zzoo;
import com.google.android.gms.internal.zzqh;
import com.inmobi.commons.ads.cache.AdDatabaseHelper;
import java.util.Collections;
import org.json.JSONObject;
import p000.bdi.C0251a;
import p000.bjt.C1254a;
import p000.blp.C0235c;

@bhd
/* renamed from: akf */
public class akf extends ajv implements bdc, C0251a {
    /* renamed from: l */
    protected transient boolean f1825l = false;
    /* renamed from: m */
    private int f1826m = -1;
    /* renamed from: n */
    private boolean f1827n;
    /* renamed from: o */
    private float f1828o;
    /* renamed from: p */
    private final bjm f1829p;

    @bhd
    /* renamed from: akf$a */
    class C0250a extends bkb {
        /* renamed from: a */
        final /* synthetic */ akf f1823a;
        /* renamed from: b */
        private final int f1824b;

        public C0250a(akf akf, int i) {
            this.f1823a = akf;
            this.f1824b = i;
        }

        /* renamed from: a */
        public void mo196a() {
            zzn zzn = new zzn(this.f1823a.f.f14541H, this.f1823a.m2175M(), this.f1823a.f1827n, this.f1823a.f1828o, this.f1823a.f.f14541H ? this.f1824b : -1);
            int q = this.f1823a.f.f14558j.f6547b.mo1332q();
            final AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this.f1823a, this.f1823a, this.f1823a, this.f1823a.f.f14558j.f6547b, q == -1 ? this.f1823a.f.f14558j.f6552g : q, this.f1823a.f.f14553e, this.f1823a.f.f14558j.f6539C, zzn);
            bkg.f6710a.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C0250a f1822b;

                public void run() {
                    ako.m2341c().m1778a(this.f1822b.f1823a.f.f14551c, adOverlayInfoParcel);
                }
            });
        }

        /* renamed from: b */
        public void mo197b() {
        }
    }

    public akf(Context context, zzeg zzeg, String str, bex bex, zzqh zzqh, ajx ajx) {
        super(context, zzeg, str, bex, zzqh, ajx);
        this.f1829p = ako.m2336D().m8888d() ? new bjm(context, str) : null;
    }

    /* renamed from: a */
    private void m2170a(Bundle bundle) {
        ako.m2343e().m9123b(this.f.f14551c, this.f.f14553e.f15121a, "gmob-apps", bundle, false);
    }

    /* renamed from: b */
    static C1254a m2173b(C1254a c1254a) {
        try {
            String jSONObject = bhx.m8574a(c1254a.f6530b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, c1254a.f6529a.f15036e);
            bem bem = new bem(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList());
            zzmn zzmn = c1254a.f6530b;
            ben ben = new ben(Collections.singletonList(bem), ((Long) bbb.bG.m7064c()).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zzmn.f15067J, zzmn.f15068K, "", -1, 0, 1, null, 0, -1, -1, false);
            return new C1254a(c1254a.f6529a, new zzmn(c1254a.f6529a, zzmn.f15076b, zzmn.f15077c, Collections.emptyList(), Collections.emptyList(), zzmn.f15081g, true, zzmn.f15083i, Collections.emptyList(), zzmn.f15085k, zzmn.f15086l, zzmn.f15087m, zzmn.f15088n, zzmn.f15089o, zzmn.f15090p, zzmn.f15091q, null, zzmn.f15093s, zzmn.f15094t, zzmn.f15095u, zzmn.f15096v, zzmn.f15097w, zzmn.f15100z, zzmn.f15058A, zzmn.f15059B, null, Collections.emptyList(), Collections.emptyList(), zzmn.f15063F, zzmn.f15064G, zzmn.f15065H, zzmn.f15066I, zzmn.f15067J, zzmn.f15068K, zzmn.f15069L, null, zzmn.f15071N, zzmn.f15072O, zzmn.f15073P), ben, c1254a.f6532d, c1254a.f6533e, c1254a.f6534f, c1254a.f6535g, null);
        } catch (Throwable e) {
            bky.m9007b("Unable to generate ad state for an interstitial ad with pooling.", e);
            return c1254a;
        }
    }

    /* renamed from: G */
    public void mo261G() {
        aoi.m4687b("showInterstitial must be called on the main UI thread.");
        if (this.f.f14558j == null) {
            bky.m9011e("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) bbb.br.m7064c()).booleanValue()) {
            Bundle bundle;
            String packageName = this.f.f14551c.getApplicationContext() != null ? this.f.f14551c.getApplicationContext().getPackageName() : this.f.f14551c.getPackageName();
            if (!this.f1825l) {
                bky.m9011e("It is not recommended to show an interstitial before onAdLoaded completes.");
                bundle = new Bundle();
                bundle.putString(AdDatabaseHelper.COLUMN_APPID, packageName);
                bundle.putString(NativeProtocol.WEB_DIALOG_ACTION, "show_interstitial_before_load_finish");
                m2170a(bundle);
            }
            if (!ako.m2343e().m9139g(this.f.f14551c)) {
                bky.m9011e("It is not recommended to show an interstitial when app is not in foreground.");
                bundle = new Bundle();
                bundle.putString(AdDatabaseHelper.COLUMN_APPID, packageName);
                bundle.putString(NativeProtocol.WEB_DIALOG_ACTION, "show_interstitial_app_not_in_foreground");
                m2170a(bundle);
            }
        }
        if (!this.f.m19375f()) {
            if (this.f.f14558j.f6559n && this.f.f14558j.f6561p != null) {
                try {
                    this.f.f14558j.f6561p.mo1065b();
                } catch (Throwable e) {
                    bky.m9009c("Could not show interstitial.", e);
                    m2176N();
                }
            } else if (this.f.f14558j.f6547b == null) {
                bky.m9011e("The interstitial failed to load.");
            } else if (this.f.f14558j.f6547b.mo1331p()) {
                bky.m9011e("The interstitial is already showing.");
            } else {
                this.f.f14558j.f6547b.mo1304a(true);
                if (this.f.f14558j.f6555j != null) {
                    this.h.m6450a(this.f.f14557i, this.f.f14558j);
                }
                aqd.m4912b();
                final bjt bjt = this.f.f14558j;
                if (bjt.m8899a()) {
                    new ayf(this.f.f14551c, bjt.f6547b.mo1305b()).m6565a(bjt.f6547b);
                } else {
                    bjt.f6547b.mo1322l().m9415a(new C0235c(this) {
                        /* renamed from: b */
                        final /* synthetic */ akf f1820b;

                        /* renamed from: a */
                        public void mo285a() {
                            new ayf(this.f1820b.f.f14551c, bjt.f6547b.mo1305b()).m6565a(bjt.f6547b);
                        }
                    });
                }
                Bitmap h = this.f.f14541H ? ako.m2343e().m9140h(this.f.f14551c) : null;
                this.f1826m = ako.m2364z().m9260a(h);
                if (!((Boolean) bbb.bU.m7064c()).booleanValue() || h == null) {
                    zzn zzn = new zzn(this.f.f14541H, m2175M(), false, 0.0f, -1);
                    int q = this.f.f14558j.f6547b.mo1332q();
                    if (q == -1) {
                        q = this.f.f14558j.f6552g;
                    }
                    ako.m2341c().m1778a(this.f.f14551c, new AdOverlayInfoParcel(this, this, this, this.f.f14558j.f6547b, q, this.f.f14553e, this.f.f14558j.f6539C, zzn));
                    return;
                }
                new C0250a(this, this.f1826m).mo195d();
            }
        }
    }

    /* renamed from: M */
    protected boolean m2175M() {
        if (!(this.f.f14551c instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.f.f14551c).getWindow();
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        boolean z = (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
        return z;
    }

    /* renamed from: N */
    public void m2176N() {
        ako.m2364z().m9262b(Integer.valueOf(this.f1826m));
        if (this.f.m19374e()) {
            this.f.m19371b();
            this.f.f14558j = null;
            this.f.f14541H = false;
            this.f1825l = false;
        }
    }

    /* renamed from: O */
    public void mo304O() {
        if (!(this.f.f14558j == null || this.f.f14558j.f6570y == null)) {
            ako.m2343e().m9102a(this.f.f14551c, this.f.f14553e.f15121a, this.f.f14558j.f6570y);
        }
        m2002v();
    }

    /* renamed from: a */
    protected blo mo286a(C1254a c1254a, ajy ajy, bjk bjk) {
        blo a = ako.m2344f().m9442a(this.f.f14551c, this.f.f14557i, false, false, this.f.f14552d, this.f.f14553e, this.a, this, this.i);
        a.mo1322l().m9411a(this, null, this, this, ((Boolean) bbb.ap.m7064c()).booleanValue(), this, this, ajy, null, bjk);
        m2059a((bef) a);
        a.mo1308b(c1254a.f6529a.f15053v);
        bdi.m7583a(a, (C0251a) this);
        return a;
    }

    /* renamed from: a */
    public void mo264a() {
        super.mo264a();
        if (ako.m2336D().m8888d()) {
            this.f1829p.m8869a(false);
        }
    }

    /* renamed from: a */
    public void mo282a(C1254a c1254a, bbj bbj) {
        Object obj = 1;
        if (!((Boolean) bbb.aW.m7064c()).booleanValue()) {
            super.mo282a(c1254a, bbj);
        } else if (c1254a.f6533e != -2) {
            super.mo282a(c1254a, bbj);
        } else {
            Bundle bundle = c1254a.f6529a.f15034c.f14925m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
            Object obj2 = (bundle == null || !bundle.containsKey("gw")) ? 1 : null;
            if (c1254a.f6530b.f15082h) {
                obj = null;
            }
            if (!(obj2 == null || r2 == null)) {
                this.f.f14559k = akf.m2173b(c1254a);
            }
            super.mo282a(this.f.f14559k, bbj);
        }
    }

    /* renamed from: a */
    public void mo305a(boolean z, float f) {
        this.f1827n = z;
        this.f1828o = f;
    }

    /* renamed from: a */
    public boolean mo268a(bjt bjt, bjt bjt2) {
        if (!super.mo268a(bjt, bjt2)) {
            return false;
        }
        if (!(this.f.m19374e() || this.f.f14538E == null || bjt2.f6555j == null)) {
            this.h.m6451a(this.f.f14557i, bjt2, this.f.f14538E);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo269a(zzec zzec, bbj bbj) {
        if (this.f.f14558j == null) {
            return super.mo269a(zzec, bbj);
        }
        bky.m9011e("An interstitial is already loading. Aborting.");
        return false;
    }

    /* renamed from: a */
    protected boolean mo306a(zzec zzec, bjt bjt, boolean z) {
        if (this.f.m19374e() && bjt.f6547b != null) {
            ako.m2345g().m9162a(bjt.f6547b);
        }
        return this.e.m2281d();
    }

    /* renamed from: b */
    public void mo307b(zzoo zzoo) {
        if (this.f.f14558j != null) {
            if (this.f.f14558j.f6571z != null) {
                ako.m2343e().m9102a(this.f.f14551c, this.f.f14553e.f15121a, this.f.f14558j.f6571z);
            }
            if (this.f.f14558j.f6569x != null) {
                zzoo = this.f.f14558j.f6569x;
            }
        }
        m1969a(zzoo);
    }

    /* renamed from: b */
    public void mo308b(boolean z) {
        this.f.f14541H = z;
    }

    /* renamed from: d */
    public void mo273d() {
        m2021E();
        super.mo273d();
        if (!(this.f.f14558j == null || this.f.f14558j.f6547b == null)) {
            blp l = this.f.f14558j.f6547b.mo1322l();
            if (l != null) {
                l.m9431h();
            }
        }
        if (ako.m2336D().m8888d()) {
            ako.m2336D().m8878a(this.f.f14551c, this.f.f14550b, ako.m2336D().m8876a(this.f.f14551c));
            this.f1829p.m8869a(true);
        }
    }

    /* renamed from: r */
    protected void mo309r() {
        m2176N();
        super.mo309r();
    }

    /* renamed from: u */
    protected void mo310u() {
        super.mo310u();
        this.f1825l = true;
    }
}

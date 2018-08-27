package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.zzx;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzmk.C3314a;
import com.google.android.gms.internal.zzmr;
import com.google.android.gms.internal.zzqh;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@bhd
/* renamed from: aju */
public abstract class aju extends ajt implements air, ajq, akm, bda, beo {
    /* renamed from: j */
    protected final bex f1741j;
    /* renamed from: k */
    protected transient boolean f1742k;

    /* renamed from: aju$1 */
    class C02201 implements Callable<Boolean> {
        /* renamed from: a */
        final /* synthetic */ aju f1730a;

        C02201(aju aju) {
            this.f1730a = aju;
        }

        /* renamed from: a */
        public Boolean m2004a() {
            return Boolean.valueOf(false);
        }

        public /* synthetic */ Object call() throws Exception {
            return m2004a();
        }
    }

    /* renamed from: aju$2 */
    class C02212 implements Callable<String> {
        /* renamed from: a */
        final /* synthetic */ aju f1731a;

        C02212(aju aju) {
            this.f1731a = aju;
        }

        /* renamed from: a */
        public String m2005a() {
            String str = "";
            if (((Boolean) bbb.cV.m7064c()).booleanValue()) {
                CookieManager c = ako.m2345g().mo1281c(this.f1731a.f.f14551c);
                if (c != null) {
                    return c.getCookie("googleads.g.doubleclick.net");
                }
            }
            return str;
        }

        public /* synthetic */ Object call() throws Exception {
            return m2005a();
        }
    }

    /* renamed from: aju$3 */
    class C02223 implements Callable<String> {
        /* renamed from: a */
        final /* synthetic */ aju f1732a;

        C02223(aju aju) {
            this.f1732a = aju;
        }

        /* renamed from: a */
        public String m2006a() {
            return this.f1732a.f.f14552d.m5929a().mo290a(this.f1732a.f.f14551c);
        }

        public /* synthetic */ Object call() throws Exception {
            return m2006a();
        }
    }

    /* renamed from: aju$6 */
    class C02256 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ aju f1739a;

        C02256(aju aju) {
            this.f1739a = aju;
        }

        public void run() {
            this.f1739a.e.m2278b();
        }
    }

    /* renamed from: aju$7 */
    class C02267 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ aju f1740a;

        C02267(aju aju) {
            this.f1740a = aju;
        }

        public void run() {
            this.f1740a.e.m2280c();
        }
    }

    public aju(Context context, zzeg zzeg, String str, bex bex, zzqh zzqh, ajx ajx) {
        this(new zzx(context, zzeg, str, zzqh), bex, null, ajx);
    }

    protected aju(zzx zzx, bex bex, akl akl, ajx ajx) {
        super(zzx, akl, ajx);
        this.f1741j = bex;
        this.f1742k = false;
    }

    /* renamed from: a */
    private C3314a m2016a(zzec zzec, Bundle bundle, bjv bjv) {
        PackageInfo b;
        ApplicationInfo applicationInfo = this.f.f14551c.getApplicationInfo();
        try {
            b = ato.m5611b(this.f.f14551c).m5609b(applicationInfo.packageName, 0);
        } catch (NameNotFoundException e) {
            b = null;
        }
        DisplayMetrics displayMetrics = this.f.f14551c.getResources().getDisplayMetrics();
        Bundle bundle2 = null;
        if (!(this.f.f14554f == null || this.f.f14554f.getParent() == null)) {
            int[] iArr = new int[2];
            this.f.f14554f.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int width = this.f.f14554f.getWidth();
            int height = this.f.f14554f.getHeight();
            int i3 = 0;
            if (this.f.f14554f.isShown() && i + width > 0 && i2 + height > 0 && i <= displayMetrics.widthPixels && i2 <= displayMetrics.heightPixels) {
                i3 = 1;
            }
            bundle2 = new Bundle(5);
            bundle2.putInt("x", i);
            bundle2.putInt("y", i2);
            bundle2.putInt("width", width);
            bundle2.putInt("height", height);
            bundle2.putInt("visible", i3);
        }
        String d = ako.m2347i().m8946d();
        this.f.f14560l = new bju(d, this.f.f14550b);
        this.f.f14560l.m8906a(zzec);
        String a = ako.m2343e().m9085a(this.f.f14551c, this.f.f14554f, this.f.f14557i);
        long j = 0;
        if (this.f.f14564p != null) {
            try {
                j = this.f.f14564p.mo870a();
            } catch (RemoteException e2) {
                bky.m9011e("Cannot get correlation id, default to 0.");
            }
        }
        String uuid = UUID.randomUUID().toString();
        Bundle a2 = ako.m2347i().m8921a(this.f.f14551c, this, d);
        List arrayList = new ArrayList();
        for (i = 0; i < this.f.f14570v.size(); i++) {
            arrayList.add((String) this.f.f14570v.b(i));
        }
        final boolean z = this.f.f14565q != null;
        final boolean z2 = this.f.f14566r != null && ako.m2347i().m8967v();
        final ble a3 = bkf.m9060a(new C02201(this));
        Future a4 = bkf.m9060a(new C02212(this));
        Future a5 = bkf.m9060a(new C02223(this));
        String str = null;
        if (bjv != null) {
            str = bjv.m8917c();
        }
        final blb blb = new blb();
        a3.mo1017a(new Runnable(this) {
            public void run() {
                boolean z = false;
                try {
                    z = a3.isDone() ? ((Boolean) a3.get()).booleanValue() : false;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } catch (Throwable e2) {
                    bky.m9007b("Error receiving app streaming support", e2);
                }
                blb.m7770b(new zzmr(z, z2, z));
            }
        });
        return new C3314a(bundle2, zzec, this.f.f14557i, this.f.f14550b, applicationInfo, b, d, ako.m2347i().m8923a(), this.f.f14553e, a2, this.f.f14535B, arrayList, bundle, ako.m2347i().m8953h(), displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density, a, j, uuid, bbb.m7127a(), this.f.f14549a, this.f.f14571w, blb, this.f.m19377h(), ako.m2343e().m9138g(), ako.m2343e().m9141h(), ako.m2343e().m9145k(this.f.f14551c), ako.m2343e().m9117b(this.f.f14554f), this.f.f14551c instanceof Activity, ako.m2347i().m8958m(), a4, str, ako.m2347i().m8962q(), ako.m2334B().m7594a(), ako.m2343e().m9143i(), ako.m2351m().m9220a(), this.f.f14573y, ako.m2351m().m9228b(), bdy.m7706a().m7715i(), ako.m2347i().m8945c(this.f.f14551c, this.f.f14550b), a5);
    }

    /* renamed from: A */
    public void mo256A() {
        mo244e();
    }

    /* renamed from: B */
    public void mo257B() {
        mo273d();
    }

    /* renamed from: C */
    public void mo258C() {
        if (this.f.f14558j != null) {
            String str = this.f.f14558j.f6562q;
            bky.m9011e(new StringBuilder(String.valueOf(str).length() + 74).append("Mediation adapter ").append(str).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        mo287a(this.f.f14558j, true);
        mo310u();
    }

    /* renamed from: D */
    public void mo259D() {
        m2021E();
    }

    /* renamed from: E */
    public void m2021E() {
        mo287a(this.f.f14558j, false);
    }

    /* renamed from: F */
    public String mo260F() {
        return this.f.f14558j == null ? null : this.f.f14558j.f6562q;
    }

    /* renamed from: G */
    public void mo261G() {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    /* renamed from: H */
    public void mo262H() {
        ako.m2343e().m9106a(new C02256(this));
    }

    /* renamed from: I */
    public void mo263I() {
        ako.m2343e().m9106a(new C02267(this));
    }

    /* renamed from: a */
    public void mo264a() {
        this.h.m6456b(this.f.f14558j);
        this.f1742k = false;
        mo309r();
        this.f.f14560l.m8911c();
    }

    /* renamed from: a */
    public void mo231a(bgc bgc) {
        aoi.m4687b("setInAppPurchaseListener must be called on the main UI thread.");
        this.f.f14565q = bgc;
    }

    /* renamed from: a */
    public void mo232a(bgg bgg, String str) {
        aoi.m4687b("setPlayStorePurchaseParams must be called on the main UI thread.");
        this.f.f14536C = new ajr(str);
        this.f.f14566r = bgg;
        if (!ako.m2347i().m8952g() && bgg != null) {
            new ajj(this.f.f14551c, this.f.f14566r, this.f.f14536C).mo195d();
        }
    }

    /* renamed from: a */
    protected void mo287a(bjt bjt, boolean z) {
        if (bjt == null) {
            bky.m9011e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        super.m1982c(bjt);
        if (!(bjt.f6563r == null || bjt.f6563r.f5841d == null)) {
            String d = ako.m2336D().m8886d(this.f.f14551c);
            ako.m2362x().m7902a(this.f.f14551c, this.f.f14553e.f15121a, bjt, this.f.f14550b, z, m1953a(d, bjt.f6563r.f5841d));
            if (bjt.f6563r.f5841d.size() > 0) {
                ako.m2336D().m8887d(this.f.f14551c, d);
            }
        }
        if (bjt.f6560o != null && bjt.f6560o.f5828g != null) {
            ako.m2362x().m7902a(this.f.f14551c, this.f.f14553e.f15121a, bjt, this.f.f14550b, z, bjt.f6560o.f5828g);
        }
    }

    /* renamed from: a */
    public void mo265a(String str, ArrayList<String> arrayList) {
        bgb ajk = new ajk(str, arrayList, this.f.f14551c, this.f.f14553e.f15121a);
        if (this.f.f14565q == null) {
            bky.m9011e("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (!azp.m6789a().m9299c(this.f.f14551c)) {
                bky.m9011e("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            } else if (this.f.f14566r == null) {
                bky.m9011e("PlayStorePurchaseListener is not set.");
                return;
            } else if (this.f.f14536C == null) {
                bky.m9011e("PlayStorePurchaseVerifier is not initialized.");
                return;
            } else if (this.f.f14540G) {
                bky.m9011e("An in-app purchase request is already in progress, abort");
                return;
            } else {
                this.f.f14540G = true;
                try {
                    if (this.f.f14566r.mo1175a(str)) {
                        ako.m2357s().m1909a(this.f.f14551c, this.f.f14553e.f15124d, new GInAppPurchaseManagerInfoParcel(this.f.f14551c, this.f.f14536C, ajk, (ajq) this));
                        return;
                    } else {
                        this.f.f14540G = false;
                        return;
                    }
                } catch (RemoteException e) {
                    bky.m9011e("Could not start In-App purchase.");
                    this.f.f14540G = false;
                    return;
                }
            }
        }
        try {
            this.f.f14565q.mo1008a(ajk);
        } catch (RemoteException e2) {
            bky.m9011e("Could not start In-App purchase.");
        }
    }

    /* renamed from: a */
    public void mo266a(String str, boolean z, int i, final Intent intent, ajm ajm) {
        try {
            if (this.f.f14566r != null) {
                this.f.f14566r.mo1174a(new ajn(this.f.f14551c, str, z, i, intent, ajm));
            }
        } catch (RemoteException e) {
            bky.m9011e("Fail to invoke PlayStorePurchaseListener.");
        }
        bkg.f6710a.postDelayed(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ aju f1738b;

            public void run() {
                int a = ako.m2357s().m1905a(intent);
                ako.m2357s();
                if (!(a != 0 || this.f1738b.f.f14558j == null || this.f1738b.f.f14558j.f6547b == null || this.f1738b.f.f14558j.f6547b.mo1319i() == null)) {
                    this.f1738b.f.f14558j.f6547b.mo1319i().m1748a();
                }
                this.f1738b.f.f14540G = false;
            }
        }, 500);
    }

    /* renamed from: a */
    boolean mo267a(bjt bjt) {
        zzec zzec;
        boolean z = false;
        if (this.g != null) {
            zzec = this.g;
            this.g = null;
        } else {
            zzec = bjt.f6546a;
            if (zzec.f14915c != null) {
                z = zzec.f14915c.getBoolean("_noRefresh", false);
            }
        }
        return mo306a(zzec, bjt, z);
    }

    /* renamed from: a */
    protected boolean mo268a(bjt bjt, bjt bjt2) {
        int i;
        int i2 = 0;
        if (!(bjt == null || bjt.f6564s == null)) {
            bjt.f6564s.m7861a(null);
        }
        if (bjt2.f6564s != null) {
            bjt2.f6564s.m7861a((beo) this);
        }
        if (bjt2.f6563r != null) {
            i = bjt2.f6563r.f5853p;
            i2 = bjt2.f6563r.f5854q;
        } else {
            i = 0;
        }
        this.f.f14537D.m8981a(i, i2);
        return true;
    }

    /* renamed from: a */
    public boolean mo269a(zzec zzec, bbj bbj) {
        if (!mo274x()) {
            return false;
        }
        bjv r;
        Bundle m = ako.m2343e().m9147m(this.f.f14551c);
        this.e.m2275a();
        this.f.f14539F = 0;
        if (((Boolean) bbb.cD.m7064c()).booleanValue()) {
            r = ako.m2347i().m8963r();
            ako.m2333A().m2111a(this.f.f14551c, this.f.f14553e, this.f.f14550b, r);
        } else {
            r = null;
        }
        C3314a a = m2016a(zzec, m, r);
        bbj.m7165a("seq_num", a.f14990g);
        bbj.m7165a("request_id", a.f15004u);
        bbj.m7165a("session_id", a.f14991h);
        if (a.f14989f != null) {
            bbj.m7165a("app_version", String.valueOf(a.f14989f.versionCode));
        }
        this.f.f14555g = ako.m2338a().m8446a(this.f.f14551c, a, this);
        return true;
    }

    /* renamed from: a */
    protected boolean mo306a(zzec zzec, bjt bjt, boolean z) {
        if (!z && this.f.m19374e()) {
            if (bjt.f6553h > 0) {
                this.e.m2277a(zzec, bjt.f6553h);
            } else if (bjt.f6563r != null && bjt.f6563r.f5846i > 0) {
                this.e.m2277a(zzec, bjt.f6563r.f5846i);
            } else if (!bjt.f6559n && bjt.f6549d == 2) {
                this.e.m2279b(zzec);
            }
        }
        return this.e.m2281d();
    }

    /* renamed from: b */
    public void mo270b() {
        this.h.m6458d(this.f.f14558j);
    }

    /* renamed from: b */
    public void mo243b(bjt bjt) {
        super.mo243b(bjt);
        if (bjt.f6560o != null) {
            bky.m9006b("Disable the debug gesture detector on the mediation ad frame.");
            if (this.f.f14554f != null) {
                this.f.f14554f.m19365d();
            }
            bky.m9006b("Pinging network fill URLs.");
            ako.m2362x().m7902a(this.f.f14551c, this.f.f14553e.f15121a, bjt, this.f.f14550b, false, bjt.f6560o.f5829h);
            if (!(bjt.f6563r == null || bjt.f6563r.f5843f == null || bjt.f6563r.f5843f.size() <= 0)) {
                bky.m9006b("Pinging urls remotely");
                ako.m2343e().m9105a(this.f.f14551c, bjt.f6563r.f5843f);
            }
        } else {
            bky.m9006b("Enable the debug gesture detector on the admob ad frame.");
            if (this.f.f14554f != null) {
                this.f.f14554f.m19364c();
            }
        }
        if (bjt.f6549d == 3 && bjt.f6563r != null && bjt.f6563r.f5842e != null) {
            bky.m9006b("Pinging no fill URLs.");
            ako.m2362x().m7902a(this.f.f14551c, this.f.f14553e.f15121a, bjt, this.f.f14550b, false, bjt.f6563r.f5842e);
        }
    }

    /* renamed from: b */
    protected boolean mo271b(zzec zzec) {
        return super.mo271b(zzec) && !this.f1742k;
    }

    /* renamed from: c */
    public void mo272c() {
        this.h.m6459e(this.f.f14558j);
    }

    /* renamed from: d */
    public void mo273d() {
        this.f1742k = true;
        m2000t();
    }

    /* renamed from: m */
    public void mo250m() {
        aoi.m4687b("pause must be called on the main UI thread.");
        if (!(this.f.f14558j == null || this.f.f14558j.f6547b == null || !this.f.m19374e())) {
            ako.m2345g().m9162a(this.f.f14558j.f6547b);
        }
        if (!(this.f.f14558j == null || this.f.f14558j.f6561p == null)) {
            try {
                this.f.f14558j.f6561p.mo1067d();
            } catch (RemoteException e) {
                bky.m9011e("Could not pause mediation adapter.");
            }
        }
        this.h.m6458d(this.f.f14558j);
        this.e.m2278b();
    }

    /* renamed from: n */
    public void mo251n() {
        aoi.m4687b("resume must be called on the main UI thread.");
        blo blo = null;
        if (!(this.f.f14558j == null || this.f.f14558j.f6547b == null)) {
            blo = this.f.f14558j.f6547b;
        }
        if (blo != null && this.f.m19374e()) {
            ako.m2345g().m9166b(this.f.f14558j.f6547b);
        }
        if (!(this.f.f14558j == null || this.f.f14558j.f6561p == null)) {
            try {
                this.f.f14558j.f6561p.mo1068e();
            } catch (RemoteException e) {
                bky.m9011e("Could not resume mediation adapter.");
            }
        }
        if (blo == null || !blo.mo1341u()) {
            this.e.m2280c();
        }
        this.h.m6459e(this.f.f14558j);
    }

    public void onAdClicked() {
        if (this.f.f14558j == null) {
            bky.m9011e("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.f.f14558j.f6563r == null || this.f.f14558j.f6563r.f5840c == null)) {
            String d = ako.m2336D().m8886d(this.f.f14551c);
            ako.m2362x().m7902a(this.f.f14551c, this.f.f14553e.f15121a, this.f.f14558j, this.f.f14550b, false, m1953a(d, this.f.f14558j.f6563r.f5840c));
            if (this.f.f14558j.f6563r.f5840c.size() > 0) {
                ako.m2336D().m8884c(this.f.f14551c, d);
            }
        }
        if (!(this.f.f14558j.f6560o == null || this.f.f14558j.f6560o.f5827f == null)) {
            ako.m2362x().m7902a(this.f.f14551c, this.f.f14553e.f15121a, this.f.f14558j, this.f.f14550b, false, this.f.f14558j.f6560o.f5827f);
        }
        super.onAdClicked();
    }

    /* renamed from: x */
    protected boolean mo274x() {
        return ako.m2343e().m9112a(this.f.f14551c, this.f.f14551c.getPackageName(), "android.permission.INTERNET") && ako.m2343e().m9111a(this.f.f14551c);
    }

    /* renamed from: y */
    public void mo275y() {
        onAdClicked();
    }

    /* renamed from: z */
    public void mo276z() {
        mo264a();
    }
}

package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.zzqh;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import p000.ayl.C0914b;
import p000.bke.C1256b;

@bhd
/* renamed from: bjw */
public class bjw implements C0914b, C1256b {
    /* renamed from: A */
    private String f6592A = "";
    /* renamed from: B */
    private long f6593B = 0;
    /* renamed from: C */
    private long f6594C = 0;
    /* renamed from: D */
    private long f6595D = 0;
    /* renamed from: E */
    private int f6596E = -1;
    /* renamed from: F */
    private final AtomicInteger f6597F = new AtomicInteger(0);
    /* renamed from: a */
    private final Object f6598a = new Object();
    /* renamed from: b */
    private final String f6599b;
    /* renamed from: c */
    private final bjx f6600c;
    /* renamed from: d */
    private axz f6601d;
    /* renamed from: e */
    private BigInteger f6602e = BigInteger.ONE;
    /* renamed from: f */
    private final HashSet<bju> f6603f = new HashSet();
    /* renamed from: g */
    private final HashMap<String, bjz> f6604g = new HashMap();
    /* renamed from: h */
    private boolean f6605h = false;
    /* renamed from: i */
    private boolean f6606i = true;
    /* renamed from: j */
    private int f6607j = 0;
    /* renamed from: k */
    private boolean f6608k = false;
    /* renamed from: l */
    private Context f6609l;
    /* renamed from: m */
    private zzqh f6610m;
    /* renamed from: n */
    private bbd f6611n = null;
    /* renamed from: o */
    private boolean f6612o = true;
    /* renamed from: p */
    private boolean f6613p = true;
    /* renamed from: q */
    private aym f6614q = null;
    /* renamed from: r */
    private ayk f6615r = null;
    /* renamed from: s */
    private String f6616s;
    /* renamed from: t */
    private String f6617t;
    /* renamed from: u */
    private Boolean f6618u = null;
    /* renamed from: v */
    private String f6619v;
    /* renamed from: w */
    private boolean f6620w = false;
    /* renamed from: x */
    private boolean f6621x = false;
    /* renamed from: y */
    private boolean f6622y = false;
    /* renamed from: z */
    private boolean f6623z = false;

    public bjw(bkg bkg) {
        this.f6599b = bkg.m9132d();
        this.f6600c = new bjx(this.f6599b);
    }

    /* renamed from: a */
    public Bundle m8921a(Context context, bjy bjy, String str) {
        Bundle bundle;
        synchronized (this.f6598a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.f6600c.m8974a(context, str));
            Bundle bundle2 = new Bundle();
            for (String str2 : this.f6604g.keySet()) {
                bundle2.putBundle(str2, ((bjz) this.f6604g.get(str2)).m8980a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f6603f.iterator();
            while (it.hasNext()) {
                arrayList.add(((bju) it.next()).m8912d());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            bjy.mo240a(this.f6603f);
            this.f6603f.clear();
        }
        return bundle;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public p000.aym m8922a(Context r6) {
        /*
        r5 = this;
        r1 = 0;
        r0 = p000.bbb.f5390W;
        r0 = r0.m7064c();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0011;
    L_0x000f:
        r0 = r1;
    L_0x0010:
        return r0;
    L_0x0011:
        p000.aqd.m4912b();
        r0 = p000.bbb.ae;
        r0 = r0.m7064c();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0032;
    L_0x0022:
        r0 = p000.bbb.ac;
        r0 = r0.m7064c();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0032;
    L_0x0030:
        r0 = r1;
        goto L_0x0010;
    L_0x0032:
        r0 = r5.m8942b();
        if (r0 == 0) goto L_0x0040;
    L_0x0038:
        r0 = r5.m8944c();
        if (r0 == 0) goto L_0x0040;
    L_0x003e:
        r0 = r1;
        goto L_0x0010;
    L_0x0040:
        r2 = r5.f6598a;
        monitor-enter(r2);
        r0 = android.os.Looper.getMainLooper();	 Catch:{ all -> 0x0077 }
        if (r0 == 0) goto L_0x004b;
    L_0x0049:
        if (r6 != 0) goto L_0x004e;
    L_0x004b:
        monitor-exit(r2);	 Catch:{ all -> 0x0077 }
        r0 = r1;
        goto L_0x0010;
    L_0x004e:
        r0 = r5.f6615r;	 Catch:{ all -> 0x0077 }
        if (r0 != 0) goto L_0x0059;
    L_0x0052:
        r0 = new ayk;	 Catch:{ all -> 0x0077 }
        r0.<init>();	 Catch:{ all -> 0x0077 }
        r5.f6615r = r0;	 Catch:{ all -> 0x0077 }
    L_0x0059:
        r0 = r5.f6614q;	 Catch:{ all -> 0x0077 }
        if (r0 != 0) goto L_0x006e;
    L_0x005d:
        r0 = new aym;	 Catch:{ all -> 0x0077 }
        r1 = r5.f6615r;	 Catch:{ all -> 0x0077 }
        r3 = r5.f6609l;	 Catch:{ all -> 0x0077 }
        r4 = r5.f6610m;	 Catch:{ all -> 0x0077 }
        r3 = p000.bhb.m8433a(r3, r4);	 Catch:{ all -> 0x0077 }
        r0.<init>(r1, r3);	 Catch:{ all -> 0x0077 }
        r5.f6614q = r0;	 Catch:{ all -> 0x0077 }
    L_0x006e:
        r0 = r5.f6614q;	 Catch:{ all -> 0x0077 }
        r0.m6613a();	 Catch:{ all -> 0x0077 }
        r0 = r5.f6614q;	 Catch:{ all -> 0x0077 }
        monitor-exit(r2);	 Catch:{ all -> 0x0077 }
        goto L_0x0010;
    L_0x0077:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0077 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bjw.a(android.content.Context):aym");
    }

    /* renamed from: a */
    public String m8923a() {
        return this.f6599b;
    }

    /* renamed from: a */
    Future m8924a(int i) {
        Future a;
        synchronized (this.f6598a) {
            this.f6596E = i;
            a = bke.m9035a(this.f6609l, i);
        }
        return a;
    }

    /* renamed from: a */
    Future m8925a(long j) {
        Future a;
        synchronized (this.f6598a) {
            this.f6594C = j;
            a = bke.m9036a(this.f6609l, j);
        }
        return a;
    }

    /* renamed from: a */
    public Future m8926a(Context context, boolean z) {
        Future a;
        synchronized (this.f6598a) {
            if (z != this.f6606i) {
                this.f6606i = z;
                a = bke.m9040a(context, z);
            } else {
                a = null;
            }
        }
        return a;
    }

    /* renamed from: a */
    public Future m8927a(String str) {
        Future a;
        synchronized (this.f6598a) {
            if (str != null) {
                if (!str.equals(this.f6616s)) {
                    this.f6616s = str;
                    a = bke.m9038a(this.f6609l, str);
                }
            }
            a = null;
        }
        return a;
    }

    @TargetApi(23)
    /* renamed from: a */
    public void m8928a(Context context, zzqh zzqh) {
        synchronized (this.f6598a) {
            if (!this.f6608k) {
                this.f6609l = context.getApplicationContext();
                this.f6610m = zzqh;
                ako.m2346h().m6609a((C0914b) this);
                bke.m9037a(context, (C1256b) this);
                bke.m9042b(context, (C1256b) this);
                bke.m9045c(context, (C1256b) this);
                bke.m9048d(context, (C1256b) this);
                bke.m9050e(context, (C1256b) this);
                bke.m9052f(context, this);
                bke.m9053g(context, this);
                bke.m9054h(context, this);
                bke.m9055i(context, this);
                m8966u();
                this.f6619v = ako.m2343e().m9087a(context, zzqh.f15121a);
                if (aqd.m4921k() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                    this.f6621x = true;
                }
                this.f6601d = new axz(context.getApplicationContext(), this.f6610m, ako.m2343e().m9084a(context, zzqh));
                m8968w();
                ako.m2357s().m1908a(this.f6609l);
                this.f6608k = true;
            }
        }
    }

    /* renamed from: a */
    public void m8929a(Context context, String str) {
        bke.m9047c(context, str);
    }

    /* renamed from: a */
    public void mo1253a(Bundle bundle) {
        synchronized (this.f6598a) {
            this.f6606i = bundle.getBoolean("use_https", this.f6606i);
            this.f6607j = bundle.getInt("webview_cache_version", this.f6607j);
            if (bundle.containsKey("content_url_opted_out")) {
                m8941b(bundle.getBoolean("content_url_opted_out"));
            }
            if (bundle.containsKey("content_url_hashes")) {
                this.f6616s = bundle.getString("content_url_hashes");
            }
            this.f6622y = bundle.getBoolean("auto_collect_location", this.f6622y);
            if (bundle.containsKey("content_vertical_opted_out")) {
                m8943c(bundle.getBoolean("content_vertical_opted_out"));
            }
            if (bundle.containsKey("content_vertical_hashes")) {
                this.f6617t = bundle.getString("content_vertical_hashes");
            }
            this.f6592A = bundle.containsKey("app_settings_json") ? bundle.getString("app_settings_json") : this.f6592A;
            this.f6593B = bundle.getLong("app_settings_last_update_ms", this.f6593B);
            this.f6594C = bundle.getLong("app_last_background_time_ms", this.f6594C);
            this.f6596E = bundle.getInt("request_in_session_count", this.f6596E);
            this.f6595D = bundle.getLong("first_ad_req_time_ms", this.f6595D);
        }
    }

    /* renamed from: a */
    public void m8931a(bju bju) {
        synchronized (this.f6598a) {
            this.f6603f.add(bju);
        }
    }

    /* renamed from: a */
    public void m8932a(Boolean bool) {
        synchronized (this.f6598a) {
            this.f6618u = bool;
        }
    }

    /* renamed from: a */
    public void m8933a(String str, bjz bjz) {
        synchronized (this.f6598a) {
            this.f6604g.put(str, bjz);
        }
    }

    /* renamed from: a */
    public void m8934a(Throwable th, String str) {
        bhb.m8433a(this.f6609l, this.f6610m).mo1187a(th, str);
    }

    /* renamed from: a */
    public void m8935a(HashSet<bju> hashSet) {
        synchronized (this.f6598a) {
            this.f6603f.addAll(hashSet);
        }
    }

    /* renamed from: a */
    public void mo855a(boolean z) {
        long a = ako.m2349k().mo606a();
        if (!z) {
            m8925a(a);
            m8924a(this.f6600c.m8979d());
        } else if (a - this.f6594C > ((Long) bbb.aL.m7064c()).longValue()) {
            this.f6600c.m8975a(-1);
        } else {
            this.f6600c.m8975a(this.f6596E);
        }
    }

    /* renamed from: b */
    Future m8937b(long j) {
        Future b;
        synchronized (this.f6598a) {
            this.f6595D = j;
            b = bke.m9041b(this.f6609l, j);
        }
        return b;
    }

    /* renamed from: b */
    public Future m8938b(Context context, boolean z) {
        Future c;
        synchronized (this.f6598a) {
            if (z != this.f6622y) {
                this.f6622y = z;
                c = bke.m9046c(context, z);
            } else {
                c = null;
            }
        }
        return c;
    }

    /* renamed from: b */
    public Future m8939b(String str) {
        Future b;
        synchronized (this.f6598a) {
            if (str != null) {
                if (!str.equals(this.f6617t)) {
                    this.f6617t = str;
                    b = bke.m9043b(this.f6609l, str);
                }
            }
            b = null;
        }
        return b;
    }

    /* renamed from: b */
    public void m8940b(Context context, String str) {
        bke.m9049d(context, str);
    }

    /* renamed from: b */
    public void m8941b(boolean z) {
        synchronized (this.f6598a) {
            if (this.f6612o != z) {
                bke.m9044b(this.f6609l, z);
            }
            this.f6612o = z;
            aym a = m8922a(this.f6609l);
            if (!(a == null || a.isAlive())) {
                bky.m9010d("start fetching content...");
                a.m6613a();
            }
        }
    }

    /* renamed from: b */
    public boolean m8942b() {
        boolean z;
        synchronized (this.f6598a) {
            z = this.f6612o;
        }
        return z;
    }

    /* renamed from: c */
    public void m8943c(boolean z) {
        synchronized (this.f6598a) {
            if (this.f6613p != z) {
                bke.m9044b(this.f6609l, z);
            }
            bke.m9044b(this.f6609l, z);
            this.f6613p = z;
            aym a = m8922a(this.f6609l);
            if (!(a == null || a.isAlive())) {
                bky.m9010d("start fetching content...");
                a.m6613a();
            }
        }
    }

    /* renamed from: c */
    public boolean m8944c() {
        boolean z;
        synchronized (this.f6598a) {
            z = this.f6613p;
        }
        return z;
    }

    /* renamed from: c */
    public boolean m8945c(Context context, String str) {
        return bke.m9051e(context, str);
    }

    /* renamed from: d */
    public String m8946d() {
        String bigInteger;
        synchronized (this.f6598a) {
            bigInteger = this.f6602e.toString();
            this.f6602e = this.f6602e.add(BigInteger.ONE);
        }
        return bigInteger;
    }

    /* renamed from: d */
    public Future m8947d(Context context, String str) {
        Future a;
        this.f6593B = ako.m2349k().mo606a();
        synchronized (this.f6598a) {
            if (str != null) {
                if (!str.equals(this.f6592A)) {
                    this.f6592A = str;
                    a = bke.m9039a(context, str, this.f6593B);
                }
            }
            a = null;
        }
        return a;
    }

    /* renamed from: d */
    public void m8948d(boolean z) {
        this.f6623z = z;
    }

    /* renamed from: e */
    public bjx m8949e() {
        bjx bjx;
        synchronized (this.f6598a) {
            bjx = this.f6600c;
        }
        return bjx;
    }

    /* renamed from: e */
    public void m8950e(boolean z) {
        synchronized (this.f6598a) {
            this.f6620w = z;
        }
    }

    /* renamed from: f */
    public bbd m8951f() {
        bbd bbd;
        synchronized (this.f6598a) {
            bbd = this.f6611n;
        }
        return bbd;
    }

    /* renamed from: g */
    public boolean m8952g() {
        boolean z;
        synchronized (this.f6598a) {
            z = this.f6605h;
            this.f6605h = true;
        }
        return z;
    }

    /* renamed from: h */
    public boolean m8953h() {
        boolean z;
        synchronized (this.f6598a) {
            z = this.f6606i || this.f6621x;
        }
        return z;
    }

    /* renamed from: i */
    public String m8954i() {
        String str;
        synchronized (this.f6598a) {
            str = this.f6619v;
        }
        return str;
    }

    /* renamed from: j */
    public String m8955j() {
        String str;
        synchronized (this.f6598a) {
            str = this.f6616s;
        }
        return str;
    }

    /* renamed from: k */
    public String m8956k() {
        String str;
        synchronized (this.f6598a) {
            str = this.f6617t;
        }
        return str;
    }

    /* renamed from: l */
    public Boolean m8957l() {
        Boolean bool;
        synchronized (this.f6598a) {
            bool = this.f6618u;
        }
        return bool;
    }

    /* renamed from: m */
    public boolean m8958m() {
        boolean z;
        synchronized (this.f6598a) {
            z = this.f6622y;
        }
        return z;
    }

    /* renamed from: n */
    long m8959n() {
        long j;
        synchronized (this.f6598a) {
            j = this.f6594C;
        }
        return j;
    }

    /* renamed from: o */
    long m8960o() {
        long j;
        synchronized (this.f6598a) {
            j = this.f6595D;
        }
        return j;
    }

    /* renamed from: p */
    int m8961p() {
        int i;
        synchronized (this.f6598a) {
            i = this.f6596E;
        }
        return i;
    }

    /* renamed from: q */
    public boolean m8962q() {
        return this.f6623z;
    }

    /* renamed from: r */
    public bjv m8963r() {
        bjv bjv;
        synchronized (this.f6598a) {
            bjv = new bjv(this.f6592A, this.f6593B);
        }
        return bjv;
    }

    /* renamed from: s */
    public axz m8964s() {
        return this.f6601d;
    }

    /* renamed from: t */
    public Resources m8965t() {
        if (this.f6610m.f15124d) {
            return this.f6609l.getResources();
        }
        try {
            DynamiteModule a = DynamiteModule.m19580a(this.f6609l, DynamiteModule.f14821a, ModuleDescriptor.MODULE_ID);
            return a != null ? a.m19590a().getResources() : null;
        } catch (Throwable e) {
            bky.m9009c("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: u */
    public void m8966u() {
        bhb.m8433a(this.f6609l, this.f6610m);
    }

    /* renamed from: v */
    public boolean m8967v() {
        boolean z;
        synchronized (this.f6598a) {
            z = this.f6620w;
        }
        return z;
    }

    /* renamed from: w */
    void m8968w() {
        try {
            this.f6611n = ako.m2350l().m7144a(new bbc(this.f6609l, this.f6610m.f15121a));
        } catch (Throwable e) {
            bky.m9009c("Cannot initialize CSI reporter.", e);
        }
    }

    /* renamed from: x */
    public void m8969x() {
        this.f6597F.incrementAndGet();
    }

    /* renamed from: y */
    public void m8970y() {
        this.f6597F.decrementAndGet();
    }

    /* renamed from: z */
    public int m8971z() {
        return this.f6597F.get();
    }
}

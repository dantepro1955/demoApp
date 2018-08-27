package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzqh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p000.azu.C0246a;

@bhd
/* renamed from: akd */
public class akd extends C0246a {
    /* renamed from: a */
    private final Context f1792a;
    /* renamed from: b */
    private final azt f1793b;
    /* renamed from: c */
    private final bex f1794c;
    /* renamed from: d */
    private final bcl f1795d;
    /* renamed from: e */
    private final bcm f1796e;
    /* renamed from: f */
    private final hr<String, bco> f1797f;
    /* renamed from: g */
    private final hr<String, bcn> f1798g;
    /* renamed from: h */
    private final zzhc f1799h;
    /* renamed from: i */
    private final List<String> f1800i;
    /* renamed from: j */
    private final bab f1801j;
    /* renamed from: k */
    private final String f1802k;
    /* renamed from: l */
    private final zzqh f1803l;
    /* renamed from: m */
    private WeakReference<akk> f1804m;
    /* renamed from: n */
    private final ajx f1805n;
    /* renamed from: o */
    private final Object f1806o = new Object();

    akd(Context context, String str, bex bex, zzqh zzqh, azt azt, bcl bcl, bcm bcm, hr<String, bco> hrVar, hr<String, bcn> hrVar2, zzhc zzhc, bab bab, ajx ajx) {
        this.f1792a = context;
        this.f1802k = str;
        this.f1794c = bex;
        this.f1803l = zzqh;
        this.f1793b = azt;
        this.f1796e = bcm;
        this.f1795d = bcl;
        this.f1797f = hrVar;
        this.f1798g = hrVar2;
        this.f1799h = zzhc;
        this.f1800i = m2137d();
        this.f1801j = bab;
        this.f1805n = ajx;
    }

    /* renamed from: d */
    private List<String> m2137d() {
        List<String> arrayList = new ArrayList();
        if (this.f1796e != null) {
            arrayList.add("1");
        }
        if (this.f1795d != null) {
            arrayList.add("2");
        }
        if (this.f1797f.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public String mo294a() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.f1806o;
        monitor-enter(r2);
        r0 = r3.f1804m;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.f1804m;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (p000.akk) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.mo260F();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: akd.a():java.lang.String");
    }

    /* renamed from: a */
    public void mo295a(final zzec zzec) {
        m2145a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ akd f1791b;

            public void run() {
                synchronized (this.f1791b.f1806o) {
                    akk c = this.f1791b.m2147c();
                    this.f1791b.f1804m = new WeakReference(c);
                    c.m2256a(this.f1791b.f1795d);
                    c.m2257a(this.f1791b.f1796e);
                    c.m2262a(this.f1791b.f1797f);
                    c.mo227a(this.f1791b.f1793b);
                    c.m2267b(this.f1791b.f1798g);
                    c.m2263a(this.f1791b.m2137d());
                    c.m2261a(this.f1791b.f1799h);
                    c.mo229a(this.f1791b.f1801j);
                    c.mo242a(zzec);
                }
            }
        });
    }

    /* renamed from: a */
    protected void m2145a(Runnable runnable) {
        bkg.f6710a.post(runnable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public boolean mo296b() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.f1806o;
        monitor-enter(r2);
        r0 = r3.f1804m;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.f1804m;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (p000.akk) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.mo254p();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: akd.b():boolean");
    }

    /* renamed from: c */
    protected akk m2147c() {
        return new akk(this.f1792a, this.f1805n, zzeg.m19667a(this.f1792a), this.f1802k, this.f1794c, this.f1803l);
    }
}

package com.p000;

import android.content.Context;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: bmw */
public class bmw {
    /* renamed from: a */
    private static volatile bmw f7026a;
    /* renamed from: b */
    private final Context f7027b;
    /* renamed from: c */
    private final Context f7028c;
    /* renamed from: d */
    private final apt f7029d;
    /* renamed from: e */
    private final bni f7030e;
    /* renamed from: f */
    private final bnx f7031f;
    /* renamed from: g */
    private final alq f7032g;
    /* renamed from: h */
    private final bmr f7033h;
    /* renamed from: i */
    private final bnm f7034i;
    /* renamed from: j */
    private final bog f7035j;
    /* renamed from: k */
    private final boa f7036k;
    /* renamed from: l */
    private final alc f7037l;
    /* renamed from: m */
    private final bne f7038m;
    /* renamed from: n */
    private final bmq f7039n;
    /* renamed from: o */
    private final bnb f7040o;
    /* renamed from: p */
    private final bnl f7041p;

    /* renamed from: bmw$1 */
    class C13431 implements UncaughtExceptionHandler {
        /* renamed from: a */
        final /* synthetic */ bmw f7025a;

        C13431(bmw bmw) {
            this.f7025a = bmw;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            bnx g = this.f7025a.m9772g();
            if (g != null) {
                g.zze("Job execution failed", th);
            }
        }
    }

    protected bmw(bmx bmx) {
        Context a = bmx.m9786a();
        aoi.m4680a((Object) a, (Object) "Application context can't be null");
        Object b = bmx.m9788b();
        aoi.m4679a(b);
        this.f7027b = a;
        this.f7028c = b;
        this.f7029d = bmx.m9795h(this);
        this.f7030e = bmx.m9794g(this);
        bnx f = bmx.m9793f(this);
        f.initialize();
        this.f7031f = f;
        f = m9771f();
        String str = bmv.f7023a;
        f.zzbR(new StringBuilder(String.valueOf(str).length() + 134).append("Google Analytics ").append(str).append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4").toString());
        boa q = bmx.m9804q(this);
        q.initialize();
        this.f7036k = q;
        bog e = bmx.m9792e(this);
        e.initialize();
        this.f7035j = e;
        bmr l = bmx.m9799l(this);
        bne d = bmx.m9791d(this);
        bmq c = bmx.m9790c(this);
        bnb b2 = bmx.m9789b(this);
        bnl a2 = bmx.m9787a(this);
        alq a3 = bmx.m9785a(a);
        a3.m2516a(m9766a());
        this.f7032g = a3;
        alc i = bmx.m9796i(this);
        d.initialize();
        this.f7038m = d;
        c.initialize();
        this.f7039n = c;
        b2.initialize();
        this.f7040o = b2;
        a2.initialize();
        this.f7041p = a2;
        bnm p = bmx.m9803p(this);
        p.initialize();
        this.f7034i = p;
        l.initialize();
        this.f7033h = l;
        i.m2422a();
        this.f7037l = i;
        l.m9752a();
    }

    /* renamed from: a */
    public static bmw m9764a(Context context) {
        aoi.m4679a((Object) context);
        if (f7026a == null) {
            synchronized (bmw.class) {
                if (f7026a == null) {
                    apt d = apv.m4885d();
                    long b = d.mo607b();
                    bmw bmw = new bmw(new bmx(context));
                    f7026a = bmw;
                    alc.m2418d();
                    b = d.mo607b() - b;
                    long longValue = ((Long) bnp.f7130Q.m9985a()).longValue();
                    if (b > longValue) {
                        bmw.m9771f().zzc("Slow initialization (ms)", Long.valueOf(b), Long.valueOf(longValue));
                    }
                }
            }
        }
        return f7026a;
    }

    /* renamed from: a */
    private void m9765a(bmu bmu) {
        aoi.m4680a((Object) bmu, (Object) "Analytics service not created/initialized");
        aoi.m4689b(bmu.isInitialized(), "Analytics service not initialized");
    }

    /* renamed from: a */
    protected UncaughtExceptionHandler m9766a() {
        return new C13431(this);
    }

    /* renamed from: b */
    public Context m9767b() {
        return this.f7027b;
    }

    /* renamed from: c */
    public Context m9768c() {
        return this.f7028c;
    }

    /* renamed from: d */
    public apt m9769d() {
        return this.f7029d;
    }

    /* renamed from: e */
    public bni m9770e() {
        return this.f7030e;
    }

    /* renamed from: f */
    public bnx m9771f() {
        m9765a(this.f7031f);
        return this.f7031f;
    }

    /* renamed from: g */
    public bnx m9772g() {
        return this.f7031f;
    }

    /* renamed from: h */
    public alq m9773h() {
        aoi.m4679a(this.f7032g);
        return this.f7032g;
    }

    /* renamed from: i */
    public bmr m9774i() {
        m9765a(this.f7033h);
        return this.f7033h;
    }

    /* renamed from: j */
    public bnm m9775j() {
        m9765a(this.f7034i);
        return this.f7034i;
    }

    /* renamed from: k */
    public alc m9776k() {
        aoi.m4679a(this.f7037l);
        aoi.m4689b(this.f7037l.m2431c(), "Analytics instance not initialized");
        return this.f7037l;
    }

    /* renamed from: l */
    public bog m9777l() {
        m9765a(this.f7035j);
        return this.f7035j;
    }

    /* renamed from: m */
    public boa m9778m() {
        m9765a(this.f7036k);
        return this.f7036k;
    }

    /* renamed from: n */
    public boa m9779n() {
        return (this.f7036k == null || !this.f7036k.isInitialized()) ? null : this.f7036k;
    }

    /* renamed from: o */
    public bmq m9780o() {
        m9765a(this.f7039n);
        return this.f7039n;
    }

    /* renamed from: p */
    public bne m9781p() {
        m9765a(this.f7038m);
        return this.f7038m;
    }

    /* renamed from: q */
    public bnb m9782q() {
        m9765a(this.f7040o);
        return this.f7040o;
    }

    /* renamed from: r */
    public bnl m9783r() {
        return this.f7041p;
    }

    /* renamed from: s */
    public void m9784s() {
        alq.m2511d();
    }
}

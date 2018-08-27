package com.p000;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.KitGroup;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import p000.abk.C0047a;

/* compiled from: Crashlytics */
/* renamed from: zv */
public class zv extends Kit<Void> implements KitGroup {
    /* renamed from: a */
    public final zw f26177a;
    /* renamed from: b */
    public final aau f26178b;
    /* renamed from: c */
    public final abk f26179c;
    /* renamed from: d */
    public final Collection<? extends Kit> f26180d;

    /* compiled from: Crashlytics */
    /* renamed from: zv$a */
    public static class C5816a {
        /* renamed from: a */
        private zw f26173a;
        /* renamed from: b */
        private aau f26174b;
        /* renamed from: c */
        private abk f26175c;
        /* renamed from: d */
        private C0047a f26176d;

        /* renamed from: a */
        public C5816a m35031a(abk abk) {
            if (abk == null) {
                throw new NullPointerException("CrashlyticsCore Kit must not be null.");
            } else if (this.f26175c != null) {
                throw new IllegalStateException("CrashlyticsCore Kit already set.");
            } else {
                this.f26175c = abk;
                return this;
            }
        }

        /* renamed from: a */
        public zv m35032a() {
            if (this.f26176d != null) {
                if (this.f26175c != null) {
                    throw new IllegalStateException("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
                }
                this.f26175c = this.f26176d.a();
            }
            if (this.f26173a == null) {
                this.f26173a = new zw();
            }
            if (this.f26174b == null) {
                this.f26174b = new aau();
            }
            if (this.f26175c == null) {
                this.f26175c = new abk();
            }
            return new zv(this.f26173a, this.f26174b, this.f26175c);
        }
    }

    /* renamed from: f */
    protected /* synthetic */ Object mo4896f() {
        return m35039d();
    }

    public zv() {
        this(new zw(), new aau(), new abk());
    }

    zv(zw zwVar, aau aau, abk abk) {
        this.f26177a = zwVar;
        this.f26178b = aau;
        this.f26179c = abk;
        this.f26180d = Collections.unmodifiableCollection(Arrays.asList(new Kit[]{zwVar, aau, abk}));
    }

    /* renamed from: a */
    public String mo4894a() {
        return "2.6.8.dev";
    }

    /* renamed from: b */
    public String mo4895b() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    /* renamed from: c */
    public Collection<? extends Kit> mo5617c() {
        return this.f26180d;
    }

    /* renamed from: d */
    protected Void m35039d() {
        return null;
    }

    /* renamed from: e */
    public static zv m35034e() {
        return (zv) Fabric.m30870a(zv.class);
    }

    /* renamed from: a */
    public static void m35033a(String str) {
        zv.m35035g();
        zv.m35034e().f26179c.a(str);
    }

    /* renamed from: g */
    private static void m35035g() {
        if (zv.m35034e() == null) {
            throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
        }
    }
}

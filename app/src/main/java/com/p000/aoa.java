package com.p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import p000.ann.C0290a;
import p000.ann.C0296c;
import p000.ann.C0297f;
import p000.ari.C0301a;
import p000.asa.C0763a;

/* renamed from: aoa */
public abstract class aoa<O extends C0290a> {
    /* renamed from: a */
    protected final asa f3805a;
    /* renamed from: b */
    private final Context f3806b;
    /* renamed from: c */
    private final ann<O> f3807c;
    /* renamed from: d */
    private final O f3808d;
    /* renamed from: e */
    private final bps<O> f3809e;
    /* renamed from: f */
    private final Looper f3810f;
    /* renamed from: g */
    private final int f3811g;
    /* renamed from: h */
    private final GoogleApiClient f3812h;
    /* renamed from: i */
    private final ast f3813i;
    /* renamed from: j */
    private final Account f3814j;

    /* renamed from: aoa$a */
    public static class C0655a {
        /* renamed from: a */
        public static final C0655a f3801a = new C0654a().m4597a();
        /* renamed from: b */
        public final ast f3802b;
        /* renamed from: c */
        public final Account f3803c;
        /* renamed from: d */
        public final Looper f3804d;

        /* renamed from: aoa$a$a */
        public static class C0654a {
            /* renamed from: a */
            private ast f3799a;
            /* renamed from: b */
            private Looper f3800b;

            /* renamed from: a */
            public C0654a m4596a(ast ast) {
                aoi.m4680a((Object) ast, (Object) "StatusExceptionMapper must not be null.");
                this.f3799a = ast;
                return this;
            }

            /* renamed from: a */
            public C0655a m4597a() {
                if (this.f3799a == null) {
                    this.f3799a = new bpr();
                }
                if (this.f3800b == null) {
                    if (Looper.myLooper() != null) {
                        this.f3800b = Looper.myLooper();
                    } else {
                        this.f3800b = Looper.getMainLooper();
                    }
                }
                return new C0655a(this.f3799a, null, this.f3800b);
            }
        }

        private C0655a(ast ast, Account account, Looper looper) {
            this.f3802b = ast;
            this.f3803c = account;
            this.f3804d = looper;
        }
    }

    protected aoa(Context context, ann<O> ann, Looper looper) {
        aoi.m4680a((Object) context, (Object) "Null context is not permitted.");
        aoi.m4680a((Object) ann, (Object) "Api must not be null.");
        aoi.m4680a((Object) looper, (Object) "Looper must not be null.");
        this.f3806b = context.getApplicationContext();
        this.f3807c = ann;
        this.f3808d = null;
        this.f3810f = looper;
        this.f3809e = bps.m10370a(ann);
        this.f3812h = new asb(this);
        this.f3805a = asa.m5427a(this.f3806b);
        this.f3811g = this.f3805a.m5457c();
        this.f3813i = new bpr();
        this.f3814j = null;
    }

    public aoa(Context context, ann<O> ann, O o, C0655a c0655a) {
        aoi.m4680a((Object) context, (Object) "Null context is not permitted.");
        aoi.m4680a((Object) ann, (Object) "Api must not be null.");
        aoi.m4680a((Object) c0655a, (Object) "Settings must not be null; use Settings.createDefault() instead.");
        this.f3806b = context.getApplicationContext();
        this.f3807c = ann;
        this.f3808d = o;
        this.f3810f = c0655a.f3804d;
        this.f3809e = bps.m10371a(this.f3807c, this.f3808d);
        this.f3812h = new asb(this);
        this.f3805a = asa.m5427a(this.f3806b);
        this.f3811g = this.f3805a.m5457c();
        this.f3813i = c0655a.f3802b;
        this.f3814j = c0655a.f3803c;
        this.f3805a.m5451a(this);
    }

    @Deprecated
    public aoa(Context context, ann<O> ann, O o, ast ast) {
        this(context, (ann) ann, (C0290a) o, new C0654a().m4596a(ast).m4597a());
    }

    /* renamed from: a */
    private <A extends C0296c, T extends C0301a<? extends ant, A>> T m4598a(int i, T t) {
        t.m2691i();
        this.f3805a.m5452a(this, i, t);
        return t;
    }

    /* renamed from: a */
    public C0297f mo648a(Looper looper, C0763a<O> c0763a) {
        return this.f3807c.m4559b().mo323a(this.f3806b, looper, new Builder(this.f3806b).zze(this.f3814j).zzvp(), this.f3808d, c0763a, c0763a);
    }

    /* renamed from: a */
    public ann<O> m4600a() {
        return this.f3807c;
    }

    /* renamed from: a */
    public <A extends C0296c, T extends C0301a<? extends ant, A>> T m4601a(T t) {
        return m4598a(0, (C0301a) t);
    }

    /* renamed from: a */
    public ass mo649a(Context context, Handler handler) {
        return new ass(context, handler);
    }

    /* renamed from: b */
    public <A extends C0296c, T extends C0301a<? extends ant, A>> T m4603b(T t) {
        return m4598a(1, (C0301a) t);
    }

    /* renamed from: b */
    public bps<O> m4604b() {
        return this.f3809e;
    }

    /* renamed from: c */
    public int m4605c() {
        return this.f3811g;
    }

    /* renamed from: c */
    public <A extends C0296c, T extends C0301a<? extends ant, A>> T m4606c(T t) {
        return m4598a(2, (C0301a) t);
    }

    /* renamed from: d */
    public GoogleApiClient m4607d() {
        return this.f3812h;
    }

    /* renamed from: e */
    public Looper m4608e() {
        return this.f3810f;
    }

    /* renamed from: f */
    public Context m4609f() {
        return this.f3806b;
    }
}

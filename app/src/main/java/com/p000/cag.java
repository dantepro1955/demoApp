package com.p000;

import android.content.Context;

/* compiled from: GagAccount */
/* renamed from: cag */
public class cag {
    /* renamed from: i */
    private static final hh<String, String> f8474i = new hh();
    /* renamed from: a */
    String f8475a;
    /* renamed from: b */
    String f8476b;
    /* renamed from: c */
    Context f8477c;
    /* renamed from: d */
    C1636a f8478d;
    /* renamed from: e */
    int f8479e;
    /* renamed from: f */
    boolean f8480f;
    /* renamed from: g */
    boolean f8481g;
    /* renamed from: h */
    boolean f8482h;

    /* compiled from: GagAccount */
    /* renamed from: cag$a */
    public class C1636a {
        /* renamed from: a */
        final /* synthetic */ cag f8473a;

        public C1636a(cag cag) {
            this.f8473a = cag;
        }
    }

    private cag(Context context) {
        this.f8477c = context;
        m12101g();
    }

    /* renamed from: a */
    public static cag m12097a(Context context) {
        return new cag(context);
    }

    /* renamed from: a */
    public boolean m12102a() {
        return this.f8480f;
    }

    /* renamed from: b */
    public boolean m12103b() {
        return this.f8481g;
    }

    /* renamed from: c */
    public boolean m12104c() {
        return this.f8480f && !this.f8481g;
    }

    /* renamed from: d */
    public boolean m12105d() {
        return this.f8482h;
    }

    /* renamed from: a */
    public static void m12099a(String str, String str2) {
        f8474i.put(str, str2);
    }

    /* renamed from: a */
    public static String m12098a(String str) {
        return (String) f8474i.get(str);
    }

    /* renamed from: b */
    public static void m12100b(String str) {
        f8474i.remove(str);
    }

    /* renamed from: e */
    public void m12106e() {
        m12101g();
    }

    /* renamed from: g */
    private void m12101g() {
        cip a = cip.m13967a();
        this.f8476b = a.m13861V();
        this.f8479e = a.m13858S();
        this.f8475a = a.m13851L();
        this.f8481g = false;
        this.f8482h = chm.m13305a("com.ninegag.android.app.pro", this.f8475a, a.m13864Y());
        if (this.f8479e == 0) {
            this.f8480f = false;
            return;
        }
        this.f8478d = new C1636a(this);
        this.f8480f = true;
        if (this.f8479e == 5) {
            this.f8481g = true;
        }
    }

    /* renamed from: f */
    public boolean m12107f() {
        return cpm.a();
    }
}

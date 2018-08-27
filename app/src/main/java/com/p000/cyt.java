package com.p000;

import android.content.Context;
import android.os.Handler;
import p000.cyl.C3615a;
import p000.cyn.C3613a;
import p000.cyr.C3620a;
import p000.cyu.C3618a;
import p000.czs.C4709b;

/* renamed from: cyt */
public final class cyt extends czu {
    /* renamed from: a */
    private final czv f20677a;
    /* renamed from: b */
    private final Context f20678b;

    /* renamed from: cyt$a */
    public enum C4669a {
        NVC(0),
        DRAGON_NLU(1);
        
        /* renamed from: c */
        private int f20676c;

        private C4669a(int i) {
            this.f20676c = i;
        }

        /* renamed from: a */
        public final int m25664a() {
            return this.f20676c;
        }
    }

    private cyt(czv czv, Context context) {
        this.f20677a = czv;
        this.f20678b = context;
    }

    /* renamed from: a */
    public static cyt m25665a(Context context, String str, String str2, String str3, int i, String str4, boolean z, byte[] bArr, C4669a c4669a) {
        czv a = czv.m25880a(context, str, str2, str3, i, str4, z, bArr, c4669a);
        if (a == null) {
            return null;
        }
        cyt cyt;
        synchronized (czv.m25883a()) {
            cyt = (cyt) a.m25904c();
            if (cyt == null) {
                cyt = new cyt(a, context);
                a.m25902a((Object) cyt);
            }
        }
        return cyt;
    }

    /* renamed from: a */
    public static cyt m25666a(Context context, String str, String str2, String str3, int i, boolean z, byte[] bArr, C4669a c4669a) {
        return cyt.m25665a(context, str, str2, str3, i, null, z, bArr, c4669a);
    }

    /* renamed from: a */
    public final cyl m25667a(czr czr, int i, int i2, C3615a c3615a, Handler handler) {
        return this.f20677a.m25898a(czr, i, i2, c3615a, (Object) handler);
    }

    /* renamed from: a */
    public final cyn m25668a(String str, C4709b c4709b, String str2, C3613a c3613a, Handler handler) {
        return this.f20677a.m25899a(str, c4709b, str2, c3613a, (Object) handler);
    }

    /* renamed from: a */
    public final cyr m25669a(String str, int i, String str2, C3620a c3620a, Handler handler) {
        return this.f20677a.m25900a(str, i, str2, c3620a, (Object) handler);
    }

    /* renamed from: a */
    public final cyu m25670a(String str, C3618a c3618a, Handler handler) {
        return this.f20677a.m25901a(str, c3618a, handler);
    }

    /* renamed from: a */
    public final void m25671a() {
        this.f20677a.m25906f();
    }

    /* renamed from: b */
    public final void m25672b() {
        this.f20677a.m25907g();
    }

    /* renamed from: c */
    public final String m25673c() {
        return this.f20677a.m25908h();
    }

    /* renamed from: d */
    public final void m25674d() {
        this.f20677a.m25909i();
    }
}

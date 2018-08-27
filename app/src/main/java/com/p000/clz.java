package com.p000;

import android.text.TextUtils;
import java.util.HashSet;

/* compiled from: AppRemoteConfigModel */
/* renamed from: clz */
public class clz extends cmb {
    /* renamed from: e */
    private int f9708e;

    public clz(int i) {
        this.f9708e = i;
    }

    /* renamed from: a */
    public void m14421a() {
        super.a();
        m14385f(0);
        m14380c(1);
        m14382d(0);
        m14383e(0);
        m14374a(1);
        m14387g(0);
        m14390h(1);
        m14377b(0);
        m14396k(9);
        m14375a("comment-cdn.9gag.com");
        m14401o(5);
        m14400n(3);
        m14411t(20);
        m14409s(0);
        m14407r(0);
        m14399m(1);
        m14397l(1);
        m14413u(1);
        m14405q(1);
        m14378b("http://9gag.tv");
        m14415v(2);
        m14392i(60000);
        m14394j(60000);
        m14403p(30);
    }

    /* renamed from: b */
    public String mo1785b() {
        String b = super.mo1785b();
        if (TextUtils.isEmpty(b)) {
            return "LJEGX";
        }
        return b;
    }

    /* renamed from: c */
    public String mo1786c() {
        String c = super.mo1786c();
        if (TextUtils.isEmpty(c)) {
            return "oXbNX";
        }
        return c;
    }

    /* renamed from: d */
    public String mo1787d() {
        String d = super.mo1787d();
        if (TextUtils.isEmpty(d)) {
            return "UA-64055369-1";
        }
        return d;
    }

    /* renamed from: e */
    public String[] mo1788e() {
        String[] e = super.mo1788e();
        if (e == null || e.length == 0) {
            return "LJEGX,oXbNX,nJ1gX".split(",");
        }
        return e;
    }

    /* renamed from: f */
    public String[] mo1789f() {
        String[] f = super.mo1789f();
        if (f == null || f.length == 0) {
            return "aJNBJ".split(",");
        }
        return f;
    }

    /* renamed from: g */
    public String[] mo1790g() {
        String[] g = super.mo1790g();
        if (g == null || g.length == 0) {
            return "NSFW,girl,cosplay".split(",");
        }
        return g;
    }

    /* renamed from: h */
    public int mo1791h() {
        if (m14373I()) {
            return super.mo1791h();
        }
        return 100;
    }

    /* renamed from: i */
    public int mo1792i() {
        int i = super.mo1792i();
        if (i <= 0) {
            return 2;
        }
        return i;
    }

    /* renamed from: j */
    public int mo1793j() {
        int j = super.mo1793j();
        if (j <= 0) {
            return 60000;
        }
        return j;
    }

    /* renamed from: k */
    public int mo1794k() {
        int k = super.mo1794k();
        if (k <= 0) {
            return 60000;
        }
        return k;
    }

    /* renamed from: l */
    public HashSet<String> m14432l() {
        String[] H = super.m14372H();
        if (H == null) {
            return new HashSet();
        }
        HashSet<String> hashSet = new HashSet();
        for (Object add : H) {
            hashSet.add(add);
        }
        return hashSet;
    }

    /* renamed from: m */
    public int mo1795m() {
        if (m14366B()) {
            return super.mo1795m();
        }
        return 30;
    }

    /* renamed from: n */
    public boolean m14434n() {
        if (this.f9708e > m14369E()) {
            return false;
        }
        return true;
    }
}

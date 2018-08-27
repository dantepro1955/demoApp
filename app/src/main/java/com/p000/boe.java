package com.p000;

import android.app.Activity;
import java.util.Map;

/* renamed from: boe */
public class boe implements bng {
    /* renamed from: a */
    public String f7242a;
    /* renamed from: b */
    public double f7243b;
    /* renamed from: c */
    public int f7244c;
    /* renamed from: d */
    public int f7245d;
    /* renamed from: e */
    public int f7246e;
    /* renamed from: f */
    public int f7247f;
    /* renamed from: g */
    public Map<String, String> f7248g;

    /* renamed from: a */
    public String m10115a(Activity activity) {
        return m10116a(activity.getClass().getCanonicalName());
    }

    /* renamed from: a */
    public String m10116a(String str) {
        String str2 = (String) this.f7248g.get(str);
        return str2 != null ? str2 : str;
    }

    /* renamed from: a */
    public boolean m10117a() {
        return this.f7242a != null;
    }

    /* renamed from: b */
    public String m10118b() {
        return this.f7242a;
    }

    /* renamed from: c */
    public boolean m10119c() {
        return this.f7243b >= 0.0d;
    }

    /* renamed from: d */
    public double m10120d() {
        return this.f7243b;
    }

    /* renamed from: e */
    public boolean m10121e() {
        return this.f7244c >= 0;
    }

    /* renamed from: f */
    public int m10122f() {
        return this.f7244c;
    }

    /* renamed from: g */
    public boolean m10123g() {
        return this.f7245d != -1;
    }

    /* renamed from: h */
    public boolean m10124h() {
        return this.f7245d == 1;
    }

    /* renamed from: i */
    public boolean m10125i() {
        return this.f7246e != -1;
    }

    /* renamed from: j */
    public boolean m10126j() {
        return this.f7246e == 1;
    }

    /* renamed from: k */
    public boolean m10127k() {
        return this.f7247f == 1;
    }
}

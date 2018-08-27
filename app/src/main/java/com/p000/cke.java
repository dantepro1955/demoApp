package com.p000;

/* compiled from: GagMedia */
/* renamed from: cke */
public class cke extends cjv {
    /* renamed from: b */
    public int f9519b;
    /* renamed from: c */
    public int f9520c;
    /* renamed from: d */
    public int f9521d;
    /* renamed from: e */
    public int f9522e;
    /* renamed from: f */
    public long f9523f;
    /* renamed from: g */
    public long f9524g;
    /* renamed from: h */
    public String f9525h;
    /* renamed from: i */
    public String f9526i;

    /* renamed from: a */
    public String m14164a() {
        if (this.f9522e != 0) {
            return null;
        }
        return String.format("http://www.youtube.com/watch?v=%s", new Object[]{this.f9526i});
    }

    /* renamed from: b */
    public boolean m14165b() {
        return this.f9521d == 4 && this.f9522e == 0;
    }

    /* renamed from: a */
    public static int m14163a(String str) {
        if ("YouTube".equalsIgnoreCase(str)) {
            return 0;
        }
        return -1;
    }
}

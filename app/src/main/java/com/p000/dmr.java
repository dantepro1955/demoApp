package com.p000;

import android.text.TextUtils;

/* compiled from: Parameter */
/* renamed from: dmr */
public class dmr {
    /* renamed from: a */
    private int f22255a;
    /* renamed from: b */
    private String f22256b;
    /* renamed from: c */
    private String[] f22257c;
    /* renamed from: d */
    private int[] f22258d;
    /* renamed from: e */
    private double f22259e;
    /* renamed from: f */
    private int f22260f;

    public dmr(int i) {
        m28087a(i);
    }

    public dmr(String str) {
        m28088a(str);
    }

    public dmr(double d) {
        m28086a(d);
    }

    public dmr(int[] iArr) {
        m28089a(iArr);
    }

    public dmr(String[] strArr) {
        m28090a(strArr);
    }

    /* renamed from: a */
    public void m28087a(int i) {
        this.f22255a = i;
        this.f22260f = 1;
    }

    /* renamed from: a */
    public void m28088a(String str) {
        this.f22256b = str;
        this.f22260f = 3;
    }

    /* renamed from: a */
    public void m28086a(double d) {
        this.f22259e = d;
        this.f22260f = 2;
    }

    /* renamed from: a */
    public void m28089a(int[] iArr) {
        this.f22258d = iArr;
        this.f22260f = 4;
    }

    /* renamed from: a */
    public void m28090a(String[] strArr) {
        this.f22257c = strArr;
        this.f22260f = 5;
    }

    /* renamed from: a */
    public int m28085a() {
        return this.f22255a;
    }

    /* renamed from: b */
    public String m28092b() {
        return this.f22256b;
    }

    /* renamed from: c */
    public String[] m28093c() {
        return this.f22257c;
    }

    /* renamed from: a */
    public boolean m28091a(dmr dmr) {
        boolean z = true;
        if (this.f22260f != dmr.f22260f) {
            return false;
        }
        if (this.f22260f == 1) {
            if (this.f22255a != dmr.f22255a) {
                z = false;
            }
            return z;
        } else if (this.f22260f == 2) {
            if (this.f22259e != dmr.f22259e) {
                z = false;
            }
            return z;
        } else if (this.f22260f == 3) {
            return TextUtils.equals(this.f22256b, dmr.f22256b);
        } else {
            int length;
            int i;
            if (this.f22260f == 4) {
                length = this.f22258d.length;
                if (length != dmr.f22258d.length) {
                    return false;
                }
                for (i = 0; i < length; i++) {
                    if (this.f22258d[i] != dmr.f22258d[i]) {
                        return false;
                    }
                }
                return true;
            } else if (this.f22260f != 5) {
                return false;
            } else {
                length = this.f22257c.length;
                if (length != dmr.f22257c.length) {
                    return false;
                }
                for (i = 0; i < length; i++) {
                    if (!TextUtils.equals(this.f22257c[i], dmr.f22257c[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
    }
}

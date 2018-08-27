package com.p000;

import android.os.Bundle;

@bhd
/* renamed from: bdy */
public class bdy {
    /* renamed from: a */
    private static bdy f5725a = new bdy();
    /* renamed from: b */
    private int f5726b;
    /* renamed from: c */
    private int f5727c;
    /* renamed from: d */
    private int f5728d;
    /* renamed from: e */
    private int f5729e;
    /* renamed from: f */
    private int f5730f;

    /* renamed from: a */
    public static bdy m7706a() {
        return f5725a;
    }

    /* renamed from: a */
    void m7707a(int i) {
        this.f5726b += i;
    }

    /* renamed from: b */
    void m7708b() {
        this.f5727c++;
    }

    /* renamed from: c */
    void m7709c() {
        this.f5728d++;
    }

    /* renamed from: d */
    void m7710d() {
        this.f5729e++;
    }

    /* renamed from: e */
    void m7711e() {
        this.f5730f++;
    }

    /* renamed from: f */
    public int m7712f() {
        return this.f5727c;
    }

    /* renamed from: g */
    public int m7713g() {
        return this.f5728d;
    }

    /* renamed from: h */
    public int m7714h() {
        return this.f5729e;
    }

    /* renamed from: i */
    public Bundle m7715i() {
        Bundle bundle = new Bundle();
        bundle.putInt("ipl", this.f5726b);
        bundle.putInt("ipds", this.f5727c);
        bundle.putInt("ipde", this.f5728d);
        bundle.putInt("iph", this.f5729e);
        bundle.putInt("ipm", this.f5730f);
        return bundle;
    }
}

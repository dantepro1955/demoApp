package com.p000;

/* renamed from: amq */
public class amq {
    /* renamed from: a */
    static int f2083a = 31;
    /* renamed from: b */
    private int f2084b = 1;

    /* renamed from: a */
    public int m2727a() {
        return this.f2084b;
    }

    /* renamed from: a */
    public amq m2728a(Object obj) {
        this.f2084b = (obj == null ? 0 : obj.hashCode()) + (this.f2084b * f2083a);
        return this;
    }

    /* renamed from: a */
    public amq m2729a(boolean z) {
        this.f2084b = (z ? 1 : 0) + (this.f2084b * f2083a);
        return this;
    }
}

package com.p000;

import java.util.LinkedList;
import java.util.List;

/* compiled from: MultiplePermissionsReport */
/* renamed from: bxc */
public final class bxc {
    /* renamed from: a */
    private final List<bxi> f8063a = new LinkedList();
    /* renamed from: b */
    private final List<bxh> f8064b = new LinkedList();

    bxc() {
    }

    /* renamed from: a */
    public List<bxi> m11621a() {
        return this.f8063a;
    }

    /* renamed from: b */
    public List<bxh> m11624b() {
        return this.f8064b;
    }

    /* renamed from: a */
    boolean m11623a(bxi bxi) {
        return this.f8063a.add(bxi);
    }

    /* renamed from: a */
    boolean m11622a(bxh bxh) {
        return this.f8064b.add(bxh);
    }

    /* renamed from: c */
    void m11625c() {
        this.f8063a.clear();
        this.f8064b.clear();
    }
}

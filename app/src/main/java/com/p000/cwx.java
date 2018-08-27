package com.p000;

/* compiled from: Property */
/* renamed from: cwx */
public abstract class cwx<T, V> {
    /* renamed from: a */
    private final String f20418a;
    /* renamed from: b */
    private final Class<V> f20419b;

    /* renamed from: a */
    public abstract V mo4201a(T t);

    public cwx(Class<V> cls, String str) {
        this.f20418a = str;
        this.f20419b = cls;
    }

    /* renamed from: a */
    public void mo4200a(T t, V v) {
        throw new UnsupportedOperationException("Property " + m25285a() + " is read-only");
    }

    /* renamed from: a */
    public String m25285a() {
        return this.f20418a;
    }
}

package com.p000;

/* compiled from: OptionalStream */
/* renamed from: bwi */
public class bwi<T> {
    /* renamed from: a */
    private T f8005a = null;

    private bwi() {
    }

    private bwi(T t) {
        this.f8005a = t;
    }

    /* renamed from: a */
    public boolean m11540a() {
        return this.f8005a != null;
    }

    /* renamed from: b */
    public T m11541b() {
        if (m11540a()) {
            return this.f8005a;
        }
        throw new IllegalStateException("OptionalStream.get() cannot be called on an absent value");
    }

    /* renamed from: c */
    public static <T> bwi<T> m11539c() {
        return new bwi();
    }

    /* renamed from: a */
    public static <T> bwi<T> m11538a(T t) {
        return new bwi(t);
    }
}

package com.p000;

import java.util.NoSuchElementException;

/* compiled from: Optional */
/* renamed from: byv */
public final class byv<T> {
    /* renamed from: a */
    private static final byv<?> f8234a = new byv();
    /* renamed from: b */
    private final T f8235b;

    private byv() {
        this.f8235b = null;
    }

    /* renamed from: a */
    public static <T> byv<T> m11830a() {
        return f8234a;
    }

    private byv(T t) {
        if (t == null) {
            throw new NullPointerException("Optional of null value.");
        }
        this.f8235b = t;
    }

    /* renamed from: a */
    public static <T> byv<T> m11831a(T t) {
        return new byv(t);
    }

    /* renamed from: b */
    public T m11832b() {
        if (this.f8235b != null) {
            return this.f8235b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public boolean m11834c() {
        return this.f8235b != null;
    }

    /* renamed from: b */
    public T m11833b(T t) {
        return this.f8235b != null ? this.f8235b : t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byv)) {
            return false;
        }
        byv byv = (byv) obj;
        if (this.f8235b == byv.f8235b) {
            return true;
        }
        if (this.f8235b == null || byv.f8235b == null) {
            return false;
        }
        return this.f8235b.equals(byv.f8235b);
    }

    public int hashCode() {
        return this.f8235b == null ? 0 : this.f8235b.hashCode();
    }

    public String toString() {
        if (this.f8235b == null) {
            return "Optional.empty";
        }
        return String.format("Optional[%s]", new Object[]{this.f8235b});
    }
}

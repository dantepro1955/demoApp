package com.p000;

import java.io.IOException;
import java.lang.reflect.Array;

/* renamed from: axa */
public class axa<M extends awz<M>, T> {
    /* renamed from: a */
    protected final int f4819a;
    /* renamed from: b */
    protected final Class<T> f4820b;
    /* renamed from: c */
    public final int f4821c;
    /* renamed from: d */
    protected final boolean f4822d;

    /* renamed from: a */
    int m6263a(Object obj) {
        return this.f4822d ? m6265b(obj) : m6267c(obj);
    }

    /* renamed from: a */
    void m6264a(Object obj, awy awy) throws IOException {
        if (this.f4822d) {
            m6268c(obj, awy);
        } else {
            m6266b(obj, awy);
        }
    }

    /* renamed from: b */
    protected int m6265b(Object obj) {
        int i = 0;
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += m6267c(Array.get(obj, i2));
            }
        }
        return i;
    }

    /* renamed from: b */
    protected void m6266b(Object obj, awy awy) {
        try {
            awy.m6254e(this.f4821c);
            switch (this.f4819a) {
                case 10:
                    axf axf = (axf) obj;
                    int b = axi.m6312b(this.f4821c);
                    awy.m6240a(axf);
                    awy.m6250c(b, 4);
                    return;
                case 11:
                    awy.m6246b((axf) obj);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.f4819a);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    /* renamed from: c */
    protected int m6267c(Object obj) {
        int b = axi.m6312b(this.f4821c);
        switch (this.f4819a) {
            case 10:
                return awy.m6210b(b, (axf) obj);
            case 11:
                return awy.m6216c(b, (axf) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.f4819a);
        }
    }

    /* renamed from: c */
    protected void m6268c(Object obj, awy awy) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                m6266b(obj2, awy);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axa)) {
            return false;
        }
        axa axa = (axa) obj;
        return this.f4819a == axa.f4819a && this.f4820b == axa.f4820b && this.f4821c == axa.f4821c && this.f4822d == axa.f4822d;
    }

    public int hashCode() {
        return (this.f4822d ? 1 : 0) + ((((((this.f4819a + 1147) * 31) + this.f4820b.hashCode()) * 31) + this.f4821c) * 31);
    }
}

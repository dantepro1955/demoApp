package com.p000;

import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import java.util.Arrays;

/* compiled from: LongHashMap */
/* renamed from: dog */
public final class dog<T> {
    /* renamed from: a */
    private C5021a<T>[] f22404a;
    /* renamed from: b */
    private int f22405b;
    /* renamed from: c */
    private int f22406c;
    /* renamed from: d */
    private int f22407d;

    /* compiled from: LongHashMap */
    /* renamed from: dog$a */
    static final class C5021a<T> {
        /* renamed from: a */
        final long f22401a;
        /* renamed from: b */
        T f22402b;
        /* renamed from: c */
        C5021a<T> f22403c;

        C5021a(long j, T t, C5021a<T> c5021a) {
            this.f22401a = j;
            this.f22402b = t;
            this.f22403c = c5021a;
        }
    }

    public dog() {
        this(16);
    }

    public dog(int i) {
        this.f22405b = i;
        this.f22406c = (i * 4) / 3;
        this.f22404a = new C5021a[i];
    }

    /* renamed from: a */
    public T m28412a(long j) {
        for (C5021a c5021a = this.f22404a[((((int) (j >>> 32)) ^ ((int) j)) & MoPubClientPositioning.NO_REPEAT) % this.f22405b]; c5021a != null; c5021a = c5021a.f22403c) {
            if (c5021a.f22401a == j) {
                return c5021a.f22402b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public T m28413a(long j, T t) {
        int i = ((((int) (j >>> 32)) ^ ((int) j)) & MoPubClientPositioning.NO_REPEAT) % this.f22405b;
        C5021a c5021a = this.f22404a[i];
        for (C5021a c5021a2 = c5021a; c5021a2 != null; c5021a2 = c5021a2.f22403c) {
            if (c5021a2.f22401a == j) {
                T t2 = c5021a2.f22402b;
                c5021a2.f22402b = t;
                return t2;
            }
        }
        this.f22404a[i] = new C5021a(j, t, c5021a);
        this.f22407d++;
        if (this.f22407d > this.f22406c) {
            m28415a(this.f22405b * 2);
        }
        return null;
    }

    /* renamed from: b */
    public T m28416b(long j) {
        int i = ((((int) (j >>> 32)) ^ ((int) j)) & MoPubClientPositioning.NO_REPEAT) % this.f22405b;
        C5021a c5021a = this.f22404a[i];
        C5021a c5021a2 = null;
        while (c5021a != null) {
            C5021a c5021a3 = c5021a.f22403c;
            if (c5021a.f22401a == j) {
                if (c5021a2 == null) {
                    this.f22404a[i] = c5021a3;
                } else {
                    c5021a2.f22403c = c5021a3;
                }
                this.f22407d--;
                return c5021a.f22402b;
            }
            c5021a2 = c5021a;
            c5021a = c5021a3;
        }
        return null;
    }

    /* renamed from: a */
    public void m28414a() {
        this.f22407d = 0;
        Arrays.fill(this.f22404a, null);
    }

    /* renamed from: a */
    public void m28415a(int i) {
        C5021a[] c5021aArr = new C5021a[i];
        for (C5021a c5021a : this.f22404a) {
            C5021a c5021a2;
            while (c5021a2 != null) {
                long j = c5021a2.f22401a;
                int i2 = ((((int) (j >>> 32)) ^ ((int) j)) & MoPubClientPositioning.NO_REPEAT) % i;
                C5021a c5021a3 = c5021a2.f22403c;
                c5021a2.f22403c = c5021aArr[i2];
                c5021aArr[i2] = c5021a2;
                c5021a2 = c5021a3;
            }
        }
        this.f22404a = c5021aArr;
        this.f22405b = i;
        this.f22406c = (i * 4) / 3;
    }

    /* renamed from: b */
    public void m28417b(int i) {
        m28415a((i * 5) / 3);
    }
}

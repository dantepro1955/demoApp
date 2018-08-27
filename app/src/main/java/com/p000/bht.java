package com.p000;

import p000.avg.C0846a;

/* renamed from: bht */
public class bht<T> {
    /* renamed from: a */
    public final T f6281a;
    /* renamed from: b */
    public final C0846a f6282b;
    /* renamed from: c */
    public final bmt f6283c;
    /* renamed from: d */
    public boolean f6284d;

    /* renamed from: bht$a */
    public interface C1220a {
        /* renamed from: a */
        void mo1282a(bmt bmt);
    }

    /* renamed from: bht$b */
    public interface C1221b<T> {
        /* renamed from: a */
        void mo1285a(T t);
    }

    private bht(bmt bmt) {
        this.f6284d = false;
        this.f6281a = null;
        this.f6282b = null;
        this.f6283c = bmt;
    }

    private bht(T t, C0846a c0846a) {
        this.f6284d = false;
        this.f6281a = t;
        this.f6282b = c0846a;
        this.f6283c = null;
    }

    /* renamed from: a */
    public static <T> bht<T> m8538a(bmt bmt) {
        return new bht(bmt);
    }

    /* renamed from: a */
    public static <T> bht<T> m8539a(T t, C0846a c0846a) {
        return new bht(t, c0846a);
    }

    /* renamed from: a */
    public boolean m8540a() {
        return this.f6283c == null;
    }
}

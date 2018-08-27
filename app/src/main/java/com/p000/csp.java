package com.p000;

/* compiled from: BlitzQueryParam */
/* renamed from: csp */
public abstract class csp {
    /* renamed from: a */
    private boolean f20091a;
    /* renamed from: b */
    private String f20092b;
    /* renamed from: c */
    private long f20093c;
    /* renamed from: k */
    public String f20094k;
    /* renamed from: l */
    public String f20095l;
    /* renamed from: m */
    public String f20096m;
    /* renamed from: n */
    public String f20097n;
    /* renamed from: o */
    public String f20098o;
    /* renamed from: p */
    public int f20099p;
    /* renamed from: q */
    public int f20100q;

    /* renamed from: c */
    public String m24794c() {
        return this.f20092b;
    }

    /* renamed from: a */
    public csp m24792a(String str) {
        this.f20092b = str;
        return this;
    }

    /* renamed from: d */
    public long m24795d() {
        return this.f20093c;
    }

    /* renamed from: a */
    public csp m24791a(long j) {
        this.f20093c = j;
        return this;
    }

    /* renamed from: a */
    public csp m24793a(boolean z) {
        this.f20091a = z;
        return this;
    }

    /* renamed from: e */
    public boolean m24796e() {
        return this.f20091a;
    }

    public String toString() {
        return "listKey=" + this.f20094k + '\'' + ", listType=" + this.f20095l + '\'' + ", apiNextOffset=" + this.f20092b + '\'' + ", dbOffset=" + this.f20093c + '\'' + ", limit=" + this.f20099p + '\'' + ", apiFilterType=" + this.f20098o + '\'' + ", apiSort=" + this.f20096m + '\'' + ", apiOrder=" + this.f20097n + '\'' + ", forceRefresh=" + this.f20091a;
    }
}

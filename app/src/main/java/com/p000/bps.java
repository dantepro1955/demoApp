package com.p000;

import p000.ann.C0290a;

/* renamed from: bps */
public final class bps<O extends C0290a> {
    /* renamed from: a */
    private final boolean f7385a = true;
    /* renamed from: b */
    private final int f7386b;
    /* renamed from: c */
    private final ann<O> f7387c;
    /* renamed from: d */
    private final O f7388d;

    private bps(ann<O> ann) {
        this.f7387c = ann;
        this.f7388d = null;
        this.f7386b = System.identityHashCode(this);
    }

    private bps(ann<O> ann, O o) {
        this.f7387c = ann;
        this.f7388d = o;
        this.f7386b = aoh.m4675a(this.f7387c, this.f7388d);
    }

    /* renamed from: a */
    public static <O extends C0290a> bps<O> m10370a(ann<O> ann) {
        return new bps(ann);
    }

    /* renamed from: a */
    public static <O extends C0290a> bps<O> m10371a(ann<O> ann, O o) {
        return new bps(ann, o);
    }

    /* renamed from: a */
    public String m10372a() {
        return this.f7387c.m4561d();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bps)) {
            return false;
        }
        bps bps = (bps) obj;
        return !this.f7385a && !bps.f7385a && aoh.m4677a(this.f7387c, bps.f7387c) && aoh.m4677a(this.f7388d, bps.f7388d);
    }

    public int hashCode() {
        return this.f7386b;
    }
}

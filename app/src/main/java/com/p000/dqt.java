package com.p000;

import p000.dqq.C5041a;

/* renamed from: dqt */
public final class dqt implements dqq {
    /* renamed from: a */
    private String f22623a;
    /* renamed from: b */
    private long f22624b;
    /* renamed from: c */
    private long f22625c;
    /* renamed from: d */
    private double f22626d;
    /* renamed from: e */
    private boolean f22627e;
    /* renamed from: f */
    private boolean f22628f;
    /* renamed from: g */
    private boolean f22629g;
    /* renamed from: h */
    private boolean f22630h;

    private dqt(String str, long j, long j2, double d, boolean z) {
        int indexOf;
        this.f22627e = true;
        this.f22628f = false;
        this.f22629g = false;
        this.f22630h = false;
        this.f22623a = str;
        this.f22624b = j;
        this.f22625c = j2;
        this.f22626d = d;
        this.f22627e = z;
        if (this.f22623a.indexOf("\\*no-space-before") != -1) {
            this.f22629g = true;
            indexOf = this.f22623a.indexOf("\\*no-space-before");
            if (indexOf + 17 == this.f22623a.length()) {
                this.f22623a = this.f22623a.substring(0, indexOf);
            } else {
                this.f22623a = this.f22623a.substring(0, indexOf) + this.f22623a.substring(indexOf + 17);
            }
        }
        if (this.f22623a.indexOf("\\*no-space-after") != -1) {
            this.f22630h = true;
            indexOf = this.f22623a.indexOf("\\*no-space-after");
            if (indexOf + 16 == this.f22623a.length()) {
                this.f22623a = this.f22623a.substring(0, indexOf);
            } else {
                this.f22623a = this.f22623a.substring(0, indexOf) + this.f22623a.substring(indexOf + 16);
            }
        }
        if (this.f22623a.length() != 0 && drd.m28805a(this.f22623a).length() == 0) {
            this.f22628f = true;
        }
    }

    public dqt(String str, long j, long j2, double d, boolean z, byte b) {
        C5041a c5041a = C5041a.f22617a;
        this(str, j, j2, d, z);
    }

    /* renamed from: a */
    public final String m28763a() {
        return this.f22623a;
    }

    /* renamed from: a */
    public final void m28764a(String str) {
        this.f22623a = str;
    }

    /* renamed from: b */
    public final long m28765b() {
        return this.f22624b;
    }

    /* renamed from: c */
    public final long m28766c() {
        return this.f22625c;
    }

    /* renamed from: d */
    public final boolean m28767d() {
        return this.f22628f;
    }

    /* renamed from: e */
    public final boolean m28768e() {
        return this.f22629g;
    }

    /* renamed from: f */
    public final boolean m28769f() {
        return this.f22630h;
    }

    public final String toString() {
        return this.f22623a;
    }
}

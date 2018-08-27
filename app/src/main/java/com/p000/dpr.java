package com.p000;

import p000.rh.C5006j;

/* renamed from: dpr */
public final class dpr extends dpj implements C5006j {
    /* renamed from: a */
    private dnd f22532a;
    /* renamed from: b */
    private dnk f22533b;
    /* renamed from: c */
    private int f22534c;

    public dpr(String str, dpa dpa, dnd dnd, dnk dnk) {
        super(str, Byte.MAX_VALUE);
        this.f22532a = dnd;
        this.f22533b = dnk;
        this.f22534c = dpa.m28547c();
        dnd.mo4458b("audio_id", this.f22534c);
    }

    /* renamed from: a */
    protected final int m28641a() {
        return this.f22534c;
    }

    /* renamed from: d */
    protected final byte[] m28642d() {
        return this.f22532a.m28209b();
    }

    /* renamed from: e */
    protected final dnk m28643e() {
        return this.f22533b;
    }
}

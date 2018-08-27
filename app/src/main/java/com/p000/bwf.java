package com.p000;

import java.io.File;

/* compiled from: Entry */
/* renamed from: bwf */
final class bwf {
    /* renamed from: a */
    private final File f7971a;
    /* renamed from: b */
    private final String f7972b;
    /* renamed from: c */
    private long f7973c = 0;
    /* renamed from: d */
    private boolean f7974d = false;
    /* renamed from: e */
    private bwe f7975e;

    bwf(File file, String str) {
        this.f7971a = file;
        this.f7972b = str;
    }

    /* renamed from: a */
    File m11500a() {
        return new File(this.f7971a, this.f7972b + ".clean");
    }

    /* renamed from: b */
    File m11503b() {
        return new File(this.f7971a, this.f7972b + ".tmp");
    }

    /* renamed from: c */
    synchronized long m11504c() {
        return this.f7973c;
    }

    /* renamed from: d */
    synchronized boolean m11505d() {
        return this.f7974d;
    }

    /* renamed from: e */
    synchronized bwe m11506e() {
        return this.f7975e;
    }

    /* renamed from: a */
    synchronized void m11502a(bwe bwe) {
        this.f7975e = bwe;
    }

    /* renamed from: f */
    String m11507f() {
        return this.f7972b;
    }

    /* renamed from: a */
    synchronized void m11501a(long j) {
        this.f7973c = j;
        this.f7975e = null;
        this.f7974d = true;
    }
}

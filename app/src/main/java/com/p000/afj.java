package com.p000;

import java.io.IOException;

/* compiled from: TrackFragment */
/* renamed from: afj */
final class afj {
    /* renamed from: a */
    public afc f1062a;
    /* renamed from: b */
    public long f1063b;
    /* renamed from: c */
    public long f1064c;
    /* renamed from: d */
    public int f1065d;
    /* renamed from: e */
    public int[] f1066e;
    /* renamed from: f */
    public int[] f1067f;
    /* renamed from: g */
    public long[] f1068g;
    /* renamed from: h */
    public boolean[] f1069h;
    /* renamed from: i */
    public boolean f1070i;
    /* renamed from: j */
    public boolean[] f1071j;
    /* renamed from: k */
    public int f1072k;
    /* renamed from: l */
    public ahk f1073l;
    /* renamed from: m */
    public boolean f1074m;

    afj() {
    }

    /* renamed from: a */
    public void m1248a() {
        this.f1065d = 0;
        this.f1070i = false;
        this.f1074m = false;
    }

    /* renamed from: a */
    public void m1249a(int i) {
        this.f1065d = i;
        if (this.f1066e == null || this.f1066e.length < this.f1065d) {
            int i2 = (i * 125) / 100;
            this.f1066e = new int[i2];
            this.f1067f = new int[i2];
            this.f1068g = new long[i2];
            this.f1069h = new boolean[i2];
            this.f1071j = new boolean[i2];
        }
    }

    /* renamed from: b */
    public void m1252b(int i) {
        if (this.f1073l == null || this.f1073l.m1565c() < i) {
            this.f1073l = new ahk(i);
        }
        this.f1072k = i;
        this.f1070i = true;
        this.f1074m = true;
    }

    /* renamed from: a */
    public void m1250a(aeh aeh) throws IOException, InterruptedException {
        aeh.mo118b(this.f1073l.f1493a, 0, this.f1072k);
        this.f1073l.m1564b(0);
        this.f1074m = false;
    }

    /* renamed from: a */
    public void m1251a(ahk ahk) {
        ahk.m1562a(this.f1073l.f1493a, 0, this.f1072k);
        this.f1073l.m1564b(0);
        this.f1074m = false;
    }

    /* renamed from: c */
    public long m1253c(int i) {
        return this.f1068g[i] + ((long) this.f1067f[i]);
    }
}

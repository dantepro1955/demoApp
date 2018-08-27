package com.p000;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: DataSpec */
/* renamed from: agq */
public final class agq {
    /* renamed from: a */
    public final Uri f1390a;
    /* renamed from: b */
    public final byte[] f1391b;
    /* renamed from: c */
    public final long f1392c;
    /* renamed from: d */
    public final long f1393d;
    /* renamed from: e */
    public final long f1394e;
    /* renamed from: f */
    public final String f1395f;
    /* renamed from: g */
    public final int f1396g;

    public agq(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public agq(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public agq(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public agq(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        ahb.m1514a(j >= 0);
        ahb.m1514a(j2 >= 0);
        boolean z = j3 > 0 || j3 == -1;
        ahb.m1514a(z);
        this.f1390a = uri;
        this.f1391b = bArr;
        this.f1392c = j;
        this.f1393d = j2;
        this.f1394e = j3;
        this.f1395f = str;
        this.f1396g = i;
    }

    public String toString() {
        return "DataSpec[" + this.f1390a + ", " + Arrays.toString(this.f1391b) + ", " + this.f1392c + ", " + this.f1393d + ", " + this.f1394e + ", " + this.f1395f + ", " + this.f1396g + "]";
    }
}

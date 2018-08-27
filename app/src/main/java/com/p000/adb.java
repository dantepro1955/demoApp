package com.p000;

import android.annotation.TargetApi;
import android.media.MediaCodec.CryptoInfo;

/* compiled from: CryptoInfo */
/* renamed from: adb */
public final class adb {
    /* renamed from: a */
    public byte[] f467a;
    /* renamed from: b */
    public byte[] f468b;
    /* renamed from: c */
    public int f469c;
    /* renamed from: d */
    public int[] f470d;
    /* renamed from: e */
    public int[] f471e;
    /* renamed from: f */
    public int f472f;
    /* renamed from: g */
    private final CryptoInfo f473g;

    public adb() {
        this.f473g = ahr.f1511a >= 16 ? m570b() : null;
    }

    /* renamed from: a */
    public void m573a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f472f = i;
        this.f470d = iArr;
        this.f471e = iArr2;
        this.f468b = bArr;
        this.f467a = bArr2;
        this.f469c = i2;
        if (ahr.f1511a >= 16) {
            m571c();
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public CryptoInfo m572a() {
        return this.f473g;
    }

    @TargetApi(16)
    /* renamed from: b */
    private CryptoInfo m570b() {
        return new CryptoInfo();
    }

    @TargetApi(16)
    /* renamed from: c */
    private void m571c() {
        this.f473g.set(this.f472f, this.f470d, this.f471e, this.f468b, this.f467a, this.f469c);
    }
}

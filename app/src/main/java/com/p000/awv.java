package com.p000;

/* renamed from: awv */
public class awv {
    /* renamed from: a */
    private final byte[] f4790a = new byte[256];
    /* renamed from: b */
    private int f4791b;
    /* renamed from: c */
    private int f4792c;

    public awv(byte[] bArr) {
        int i;
        for (i = 0; i < 256; i++) {
            this.f4790a[i] = (byte) i;
        }
        i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            i = ((i + this.f4790a[i2]) + bArr[i2 % bArr.length]) & 255;
            byte b = this.f4790a[i2];
            this.f4790a[i2] = this.f4790a[i];
            this.f4790a[i] = b;
        }
        this.f4791b = 0;
        this.f4792c = 0;
    }

    /* renamed from: a */
    public void m6172a(byte[] bArr) {
        int i = this.f4791b;
        int i2 = this.f4792c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f4790a[i]) & 255;
            byte b = this.f4790a[i];
            this.f4790a[i] = this.f4790a[i2];
            this.f4790a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f4790a[(this.f4790a[i] + this.f4790a[i2]) & 255]);
        }
        this.f4791b = i;
        this.f4792c = i2;
    }
}

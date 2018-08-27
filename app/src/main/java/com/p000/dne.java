package com.p000;

/* renamed from: dne */
public final class dne extends dnc {
    /* renamed from: a */
    private int f22297a;

    public dne(int i) {
        super((short) 192);
        this.f22297a = i;
    }

    public dne(byte[] bArr) {
        super((short) 192);
        if (bArr.length == 1) {
            this.f22297a = bArr[0] & 255;
        } else if (bArr.length == 2) {
            this.f22297a = ((bArr[1] & 255) << 8) + (bArr[0] & 255);
        } else if (bArr.length == 3) {
            this.f22297a = (((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8)) + (bArr[0] & 255);
        } else {
            this.f22297a = ((((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16)) + ((bArr[1] & 255) << 8)) + (bArr[0] & 255);
        }
    }

    /* renamed from: a */
    public final int m28216a() {
        return this.f22297a;
    }

    /* renamed from: b */
    public final byte[] m28217b() {
        byte[] bArr = Math.abs(this.f22297a) < 128 ? new byte[]{(byte) this.f22297a} : Math.abs(this.f22297a) < 32768 ? new byte[]{(byte) this.f22297a, (byte) (this.f22297a >> 8)} : new byte[]{(byte) this.f22297a, (byte) (this.f22297a >> 8), (byte) (this.f22297a >> 16), (byte) (this.f22297a >>> 24)};
        return super.m28180a(bArr);
    }
}

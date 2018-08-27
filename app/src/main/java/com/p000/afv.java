package com.p000;

import java.util.Arrays;

/* compiled from: NalUnitTargetBuffer */
/* renamed from: afv */
final class afv {
    /* renamed from: a */
    public byte[] f1191a;
    /* renamed from: b */
    public int f1192b;
    /* renamed from: c */
    private final int f1193c;
    /* renamed from: d */
    private boolean f1194d;
    /* renamed from: e */
    private boolean f1195e;

    public afv(int i, int i2) {
        this.f1193c = i;
        this.f1191a = new byte[(i2 + 3)];
        this.f1191a[2] = (byte) 1;
    }

    /* renamed from: a */
    public void m1338a() {
        this.f1194d = false;
        this.f1195e = false;
    }

    /* renamed from: b */
    public boolean m1341b() {
        return this.f1195e;
    }

    /* renamed from: a */
    public void m1339a(int i) {
        boolean z = true;
        ahb.m1516b(!this.f1194d);
        if (i != this.f1193c) {
            z = false;
        }
        this.f1194d = z;
        if (this.f1194d) {
            this.f1192b = 3;
            this.f1195e = false;
        }
    }

    /* renamed from: a */
    public void m1340a(byte[] bArr, int i, int i2) {
        if (this.f1194d) {
            int i3 = i2 - i;
            if (this.f1191a.length < this.f1192b + i3) {
                this.f1191a = Arrays.copyOf(this.f1191a, (this.f1192b + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f1191a, this.f1192b, i3);
            this.f1192b = i3 + this.f1192b;
        }
    }

    /* renamed from: b */
    public boolean m1342b(int i) {
        if (!this.f1194d) {
            return false;
        }
        this.f1192b -= i;
        this.f1194d = false;
        this.f1195e = true;
        return true;
    }
}

package com.p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: asc */
public class asc extends ByteArrayOutputStream {
    /* renamed from: a */
    private final boo f4238a;

    public asc(boo boo, int i) {
        this.f4238a = boo;
        this.buf = this.f4238a.m10174a(Math.max(i, 256));
    }

    /* renamed from: a */
    private void m5461a(int i) {
        if (this.count + i > this.buf.length) {
            Object a = this.f4238a.m10174a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f4238a.m10173a(this.buf);
            this.buf = a;
        }
    }

    public void close() throws IOException {
        this.f4238a.m10173a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f4238a.m10173a(this.buf);
    }

    public synchronized void write(int i) {
        m5461a(1);
        super.write(i);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        m5461a(i2);
        super.write(bArr, i, i2);
    }
}

package com.p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: dph */
public class dph extends dnd {
    /* renamed from: a */
    private static final rk f22522a = dnn.m28258a(dph.class);
    /* renamed from: b */
    private short f22523b;

    public dph(short s) {
        this.f22523b = s;
    }

    public dph(short s, byte[] bArr) {
        super(bArr);
        this.f22523b = s;
    }

    /* renamed from: d */
    public final byte[] mo4538d() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.f22523b & 255);
        byteArrayOutputStream.write((this.f22523b >> 8) & 255);
        try {
            byteArrayOutputStream.write(super.mo4538d());
        } catch (IOException e) {
            f22522a.mo4281e("PDXMessage.toByteArray() " + e.toString() + ". ");
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: e */
    public final short m28626e() {
        return this.f22523b;
    }

    /* renamed from: f */
    public final byte[] m28627f() {
        return super.mo4538d();
    }
}

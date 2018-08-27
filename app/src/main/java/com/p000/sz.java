package com.p000;

/* renamed from: sz */
public final class sz extends dnc {
    /* renamed from: a */
    private String f25538a;

    public sz(String str) {
        super((short) 22);
        this.f25538a = str;
    }

    public sz(byte[] bArr) {
        super((short) 22);
        this.f25538a = new String(bArr);
    }

    /* renamed from: a */
    public final String m34168a() {
        return this.f25538a;
    }

    /* renamed from: b */
    public final byte[] m34169b() {
        return super.m28180a(this.f25538a.getBytes());
    }
}

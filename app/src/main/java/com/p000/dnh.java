package com.p000;

import com.facebook.stetho.common.Utf8Charset;

/* renamed from: dnh */
public class dnh extends dnc {
    /* renamed from: a */
    private static final rk f22300a = dnn.m28258a(dnh.class);
    /* renamed from: b */
    private String f22301b;

    public dnh(String str) {
        super((short) 193);
        this.f22301b = str;
    }

    public dnh(byte[] bArr) {
        super((short) 193);
        try {
            this.f22301b = new String(bArr, Utf8Charset.NAME);
        } catch (Exception e) {
            f22300a.mo4281e("PDXUTF8String() " + e.getMessage());
            this.f22301b = new String(bArr);
        }
    }

    /* renamed from: a */
    public final String m28235a() {
        return this.f22301b;
    }

    /* renamed from: b */
    public final byte[] m28236b() {
        try {
            return super.m28180a(this.f22301b.getBytes(Utf8Charset.NAME));
        } catch (Exception e) {
            f22300a.mo4281e("PDXUTF8String().toByteArray() " + e.getMessage());
            return super.m28180a(this.f22301b.getBytes());
        }
    }
}

package com.p000;

import com.facebook.stetho.common.Utf8Charset;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: ByteString */
/* renamed from: abd */
final class abd {
    /* renamed from: a */
    public static final abd f165a = new abd(new byte[0]);
    /* renamed from: b */
    private final byte[] f166b;
    /* renamed from: c */
    private volatile int f167c = 0;

    private abd(byte[] bArr) {
        this.f166b = bArr;
    }

    /* renamed from: a */
    public int m155a() {
        return this.f166b.length;
    }

    /* renamed from: a */
    public static abd m154a(byte[] bArr, int i, int i2) {
        Object obj = new byte[i2];
        System.arraycopy(bArr, i, obj, 0, i2);
        return new abd(obj);
    }

    /* renamed from: a */
    public static abd m153a(String str) {
        try {
            return new abd(str.getBytes(Utf8Charset.NAME));
        } catch (Throwable e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    /* renamed from: a */
    public void m156a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f166b, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof abd)) {
            return false;
        }
        abd abd = (abd) obj;
        int length = this.f166b.length;
        if (length != abd.f166b.length) {
            return false;
        }
        byte[] bArr = this.f166b;
        byte[] bArr2 = abd.f166b;
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f167c;
        if (i == 0) {
            byte[] bArr = this.f166b;
            int length = this.f166b.length;
            int i2 = 0;
            i = length;
            while (i2 < length) {
                int i3 = bArr[i2] + (i * 31);
                i2++;
                i = i3;
            }
            if (i == 0) {
                i = 1;
            }
            this.f167c = i;
        }
        return i;
    }

    /* renamed from: b */
    public InputStream m157b() {
        return new ByteArrayInputStream(this.f166b);
    }
}

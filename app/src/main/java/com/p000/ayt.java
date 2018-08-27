package com.p000;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;
import java.security.MessageDigest;

@bhd
/* renamed from: ayt */
public class ayt extends ayo {
    /* renamed from: b */
    private MessageDigest f5099b;
    /* renamed from: c */
    private final int f5100c;
    /* renamed from: d */
    private final int f5101d;

    public ayt(int i) {
        int i2 = i / 8;
        if (i % 8 > 0) {
            i2++;
        }
        this.f5100c = i2;
        this.f5101d = i;
    }

    /* renamed from: a */
    public byte[] mo854a(String str) {
        byte[] bArr;
        synchronized (this.a) {
            this.f5099b = m6631a();
            if (this.f5099b == null) {
                bArr = new byte[0];
            } else {
                this.f5099b.reset();
                this.f5099b.update(str.getBytes(Charset.forName(Utf8Charset.NAME)));
                Object digest = this.f5099b.digest();
                bArr = new byte[(digest.length > this.f5100c ? this.f5100c : digest.length)];
                System.arraycopy(digest, 0, bArr, 0, bArr.length);
                if (this.f5101d % 8 > 0) {
                    int i;
                    long j = 0;
                    for (i = 0; i < bArr.length; i++) {
                        if (i > 0) {
                            j <<= 8;
                        }
                        j += (long) (bArr[i] & 255);
                    }
                    j >>>= 8 - (this.f5101d % 8);
                    for (i = this.f5100c - 1; i >= 0; i--) {
                        bArr[i] = (byte) ((int) (255 & j));
                        j >>>= 8;
                    }
                }
            }
        }
        return bArr;
    }
}

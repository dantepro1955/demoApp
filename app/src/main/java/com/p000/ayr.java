package com.p000;

import com.mopub.mobileads.resource.DrawableConstants.CtaButton;
import java.security.MessageDigest;

@bhd
/* renamed from: ayr */
public class ayr extends ayo {
    /* renamed from: b */
    private MessageDigest f5095b;

    /* renamed from: a */
    byte m6645a(int i) {
        return (byte) ((((i & 255) ^ ((65280 & i) >> 8)) ^ ((16711680 & i) >> 16)) ^ ((CtaButton.BACKGROUND_COLOR & i) >> 24));
    }

    /* renamed from: a */
    public byte[] mo854a(String str) {
        byte[] bArr;
        int i = 4;
        byte[] a = m6647a(str.split(" "));
        this.f5095b = m6631a();
        synchronized (this.a) {
            if (this.f5095b == null) {
                bArr = new byte[0];
            } else {
                this.f5095b.reset();
                this.f5095b.update(a);
                Object digest = this.f5095b.digest();
                if (digest.length <= 4) {
                    i = digest.length;
                }
                bArr = new byte[i];
                System.arraycopy(digest, 0, bArr, 0, bArr.length);
            }
        }
        return bArr;
    }

    /* renamed from: a */
    byte[] m6647a(String[] strArr) {
        int i = 0;
        if (strArr.length == 1) {
            return ayq.m6642b(ayq.m6638a(strArr[0]));
        }
        if (strArr.length < 5) {
            byte[] bArr = new byte[(strArr.length * 2)];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                byte[] b = m6648b(ayq.m6638a(strArr[i2]));
                bArr[i2 * 2] = b[0];
                bArr[(i2 * 2) + 1] = b[1];
            }
            return bArr;
        }
        byte[] bArr2 = new byte[strArr.length];
        while (i < strArr.length) {
            bArr2[i] = m6645a(ayq.m6638a(strArr[i]));
            i++;
        }
        return bArr2;
    }

    /* renamed from: b */
    byte[] m6648b(int i) {
        int i2 = (65535 & i) ^ ((-65536 & i) >> 16);
        return new byte[]{(byte) i2, (byte) (i2 >> 8)};
    }
}

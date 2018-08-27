package com.p000;

import java.security.Key;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: dac */
public final class dac extends rm {
    /* renamed from: a */
    protected final String mo4291a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    protected final byte[] mo4292a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return new byte[0];
        }
        try {
            Key secretKeySpec = new SecretKeySpec(bArr, "HmacSHA1");
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            return instance.doFinal(bArr2);
        } catch (Exception e) {
            return new byte[0];
        }
    }
}

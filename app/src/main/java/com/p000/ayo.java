package com.p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@bhd
/* renamed from: ayo */
public abstract class ayo {
    /* renamed from: b */
    private static MessageDigest f5087b = null;
    /* renamed from: a */
    protected Object f5088a = new Object();

    /* renamed from: a */
    protected MessageDigest m6631a() {
        MessageDigest messageDigest;
        synchronized (this.f5088a) {
            if (f5087b != null) {
                messageDigest = f5087b;
            } else {
                for (int i = 0; i < 2; i++) {
                    try {
                        f5087b = MessageDigest.getInstance("MD5");
                    } catch (NoSuchAlgorithmException e) {
                    }
                }
                messageDigest = f5087b;
            }
        }
        return messageDigest;
    }

    /* renamed from: a */
    abstract byte[] mo854a(String str);
}

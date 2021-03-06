package com.p000;

import android.text.TextUtils;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;

@bhd
/* renamed from: ajs */
public class ajs {
    /* renamed from: a */
    public static PublicKey m1916a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            bky.m9008c("Invalid key specification.");
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: a */
    public static boolean m1917a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return ajs.m1918a(ajs.m1916a(str), str2, str3);
        }
        bky.m9008c("Purchase verification failed: missing data.");
        return false;
    }

    /* renamed from: a */
    public static boolean m1918a(PublicKey publicKey, String str, String str2) {
        try {
            Signature instance = Signature.getInstance("SHA1withRSA");
            instance.initVerify(publicKey);
            instance.update(str.getBytes());
            if (instance.verify(Base64.decode(str2, 0))) {
                return true;
            }
            bky.m9008c("Signature verification failed.");
            return false;
        } catch (NoSuchAlgorithmException e) {
            bky.m9008c("NoSuchAlgorithmException.");
            return false;
        } catch (InvalidKeyException e2) {
            bky.m9008c("Invalid key specification.");
            return false;
        } catch (SignatureException e3) {
            bky.m9008c("Signature exception.");
            return false;
        }
    }
}

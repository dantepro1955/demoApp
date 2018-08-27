package com.p000;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* compiled from: AuthUtil */
/* renamed from: ctm */
public class ctm {
    /* renamed from: a */
    public static final String[] f20192a = new String[]{"UNKNOWN", "9GAG", "FB", "email signup", "GPLUS", "GUEST", "RENEW"};
    /* renamed from: b */
    public static final String[] f20193b = new String[]{MMSDK$Event.INTENT_EMAIL};

    /* renamed from: a */
    public static String m24890a(String str, String str2, Key key) {
        return ctm.m24898c(String.format("%d|%s|%s", new Object[]{Integer.valueOf(1), str, djj.m27575a(djj.m27579c(str2))}), key);
    }

    /* renamed from: a */
    public static String m24891a(String str, Key key) {
        return ctm.m24898c(String.format("%d|%s|9gag", new Object[]{Integer.valueOf(2), str}), key);
    }

    /* renamed from: b */
    public static String m24895b(String str, String str2, Key key) {
        return ctm.m24898c(String.format("%d|%s|%s", new Object[]{Integer.valueOf(4), str, str2}), key);
    }

    /* renamed from: a */
    public static String m24889a(String str, String str2, String str3, Key key) {
        String a = djj.m27575a(str.getBytes());
        String a2 = djj.m27575a(str2.getBytes());
        String a3 = djj.m27575a(str3.getBytes());
        return ctm.m24898c(String.format("%d|%s|%s|%s", new Object[]{Integer.valueOf(3), a, a2, a3}), key);
    }

    /* renamed from: b */
    public static String m24896b(String str, Key key) {
        String str2 = null;
        try {
            String d = ctm.m24899d(str, key);
            if (d != null) {
                String[] split = d.split("\\|");
                if (split.length != 0) {
                    int parseInt = Integer.parseInt(split[0]);
                    if (split.length >= 1 && parseInt == 2) {
                        str2 = split[1];
                    }
                }
            }
        } catch (Exception e) {
        }
        return str2;
    }

    /* renamed from: a */
    private static Cipher m24893a() throws NoSuchAlgorithmException, NoSuchPaddingException {
        return Cipher.getInstance("AES/CBC/PKCS5Padding");
    }

    /* renamed from: b */
    private static Cipher m24897b() throws NoSuchAlgorithmException, NoSuchPaddingException {
        return Cipher.getInstance("AES/CFB8/NoPadding");
    }

    /* renamed from: c */
    public static String m24898c(String str, Key key) {
        if (str == null) {
            return null;
        }
        try {
            Cipher b = ctm.m24897b();
            b.init(1, key);
            byte[] bytes = str.getBytes();
            byte[] bArr = new byte[b.getOutputSize(bytes.length)];
            int update = b.update(bytes, 0, bytes.length, bArr, 0);
            int doFinal = b.doFinal(bArr, update) + update;
            return djj.m27575a(bArr);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: d */
    public static String m24899d(String str, Key key) throws NoSuchAlgorithmException, NoSuchPaddingException {
        return ctm.m24892a(str, key, ctm.m24897b());
    }

    /* renamed from: e */
    public static String m24900e(String str, Key key) throws NoSuchAlgorithmException, NoSuchPaddingException {
        return ctm.m24892a(str, key, ctm.m24893a());
    }

    /* renamed from: a */
    public static String m24892a(String str, Key key, Cipher cipher) {
        if (str == null) {
            return null;
        }
        try {
            cipher.init(2, key);
            byte[] a = djj.m27576a(str);
            byte[] bArr = new byte[cipher.getOutputSize(a.length)];
            int update = cipher.update(a, 0, a.length, bArr, 0);
            return new String(bArr, 0, cipher.doFinal(bArr, update) + update);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static SecretKey m24894a(String str, String str2) {
        try {
            return SecretKeyFactory.getInstance("PBEWITHSHA256AND256BITAES-CBC-BC").generateSecret(new PBEKeySpec(str.toCharArray(), str2.getBytes(), 1500, 16));
        } catch (NoSuchAlgorithmException e) {
            return null;
        } catch (InvalidKeySpecException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m24888a(long j, String str, String str2) {
        return djj.m27575a(djj.m27580d(String.format(djj.m27578b("2a25645f2e5f25732e5f2e257339474147"), new Object[]{Long.valueOf(j), str, str2})));
    }

    /* renamed from: a */
    public static String m24887a(int i) {
        if (i < f20192a.length) {
            return f20192a[i];
        }
        return f20192a[0];
    }
}

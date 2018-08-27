package com.p000;

import java.nio.ByteBuffer;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ave */
public class ave {
    /* renamed from: b */
    private static Cipher f4654b = null;
    /* renamed from: c */
    private static final Object f4655c = new Object();
    /* renamed from: d */
    private static final Object f4656d = new Object();
    /* renamed from: a */
    private final SecureRandom f4657a;

    /* renamed from: ave$a */
    public class C0845a extends Exception {
        public C0845a(ave ave) {
        }

        public C0845a(ave ave, Throwable th) {
            super(th);
        }
    }

    public ave(SecureRandom secureRandom) {
        this.f4657a = secureRandom;
    }

    /* renamed from: a */
    private Cipher m5938a() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f4656d) {
            if (f4654b == null) {
                f4654b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f4654b;
        }
        return cipher;
    }

    /* renamed from: a */
    static void m5939a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ 68);
        }
    }

    /* renamed from: a */
    public String m5940a(byte[] bArr, byte[] bArr2) throws C0845a {
        if (bArr.length != 16) {
            throw new C0845a(this);
        }
        try {
            byte[] doFinal;
            byte[] iv;
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f4655c) {
                m5938a().init(1, secretKeySpec, this.f4657a);
                doFinal = m5938a().doFinal(bArr2);
                iv = m5938a().getIV();
            }
            int length = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            doFinal = new byte[length];
            allocate.get(doFinal);
            return atv.m5690a(doFinal, false);
        } catch (Throwable e) {
            throw new C0845a(this, e);
        } catch (Throwable e2) {
            throw new C0845a(this, e2);
        } catch (Throwable e22) {
            throw new C0845a(this, e22);
        } catch (Throwable e222) {
            throw new C0845a(this, e222);
        } catch (Throwable e2222) {
            throw new C0845a(this, e2222);
        }
    }

    /* renamed from: a */
    public byte[] m5941a(String str) throws C0845a {
        try {
            byte[] a = atv.m5691a(str, false);
            if (a.length != 32) {
                throw new C0845a(this);
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(a, 4, 16).get(bArr);
            ave.m5939a(bArr);
            return bArr;
        } catch (Throwable e) {
            throw new C0845a(this, e);
        }
    }

    /* renamed from: a */
    public byte[] m5942a(byte[] bArr, String str) throws C0845a {
        if (bArr.length != 16) {
            throw new C0845a(this);
        }
        try {
            byte[] a = atv.m5691a(str, false);
            if (a.length <= 16) {
                throw new C0845a(this);
            }
            ByteBuffer allocate = ByteBuffer.allocate(a.length);
            allocate.put(a);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            a = new byte[(a.length - 16)];
            allocate.get(bArr2);
            allocate.get(a);
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f4655c) {
                m5938a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                a = m5938a().doFinal(a);
            }
            return a;
        } catch (Throwable e) {
            throw new C0845a(this, e);
        } catch (Throwable e2) {
            throw new C0845a(this, e2);
        } catch (Throwable e22) {
            throw new C0845a(this, e22);
        } catch (Throwable e222) {
            throw new C0845a(this, e222);
        } catch (Throwable e2222) {
            throw new C0845a(this, e2222);
        } catch (Throwable e22222) {
            throw new C0845a(this, e22222);
        } catch (Throwable e222222) {
            throw new C0845a(this, e222222);
        }
    }
}

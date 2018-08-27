package com.p000;

import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p000.atr.C0800a;
import p000.atr.C0802c;
import p000.atr.C0805f;

/* renamed from: atx */
final class atx {
    /* renamed from: a */
    static boolean f4516a = false;
    /* renamed from: b */
    static CountDownLatch f4517b = new CountDownLatch(1);
    /* renamed from: c */
    private static MessageDigest f4518c = null;
    /* renamed from: d */
    private static final Object f4519d = new Object();
    /* renamed from: e */
    private static final Object f4520e = new Object();

    /* renamed from: atx$a */
    static final class C0808a implements Runnable {
        private C0808a() {
        }

        public void run() {
            try {
                atx.f4518c = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
            } finally {
                atx.f4517b.countDown();
            }
        }
    }

    /* renamed from: a */
    private static int m5694a(boolean z) {
        return z ? 239 : 255;
    }

    /* renamed from: a */
    static C0800a m5695a(long j) {
        C0800a c0800a = new C0800a();
        c0800a.f4419t = Long.valueOf(j);
        return c0800a;
    }

    /* renamed from: a */
    static String m5696a(C0800a c0800a, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        return atx.m5699a(axf.m5615a((axf) c0800a), str, z);
    }

    /* renamed from: a */
    static String m5697a(String str, String str2, boolean z) {
        return atx.m5698a(str, str2, z, ((Boolean) bbb.bJ.m7064c()).booleanValue());
    }

    /* renamed from: a */
    static String m5698a(String str, String str2, boolean z, boolean z2) {
        byte[] b = atx.m5707b(str, str2, z, z2);
        return b != null ? atv.m5690a(b, true) : Integer.toString(7);
    }

    /* renamed from: a */
    static String m5699a(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        return atv.m5690a(z ? atx.m5708b(bArr, str) : atx.m5705a(bArr, str), true);
    }

    /* renamed from: a */
    static Vector<byte[]> m5701a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + i) - 1) / i;
        Vector<byte[]> vector = new Vector();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 * i;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > i ? i3 + i : bArr.length));
                i2++;
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: a */
    static void m5702a() {
        synchronized (f4520e) {
            if (!f4516a) {
                f4516a = true;
                new Thread(new C0808a()).start();
            }
        }
    }

    /* renamed from: a */
    static void m5703a(String str, byte[] bArr) throws UnsupportedEncodingException {
        if (str.length() > 32) {
            str = str.substring(0, 32);
        }
        new awv(str.getBytes(Utf8Charset.NAME)).m6172a(bArr);
    }

    /* renamed from: a */
    public static byte[] m5704a(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (f4519d) {
            MessageDigest b = atx.m5706b();
            if (b == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            b.reset();
            b.update(bArr);
            digest = f4518c.digest();
        }
        return digest;
    }

    /* renamed from: a */
    static byte[] m5705a(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Vector a = atx.m5701a(bArr, 255);
        if (a == null || a.size() == 0) {
            return atx.m5708b(axf.m5615a(atx.m5695a(4096)), str);
        }
        axf c0805f = new C0805f();
        c0805f.f4440a = new byte[a.size()][];
        Iterator it = a.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            c0805f.f4440a[i] = atx.m5709b((byte[]) it.next(), str, false);
            i = i2;
        }
        c0805f.f4441b = atx.m5704a(bArr);
        return axf.m5615a(c0805f);
    }

    /* renamed from: b */
    static MessageDigest m5706b() {
        atx.m5702a();
        boolean z = false;
        try {
            z = f4517b.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        return (z && f4518c != null) ? f4518c : null;
    }

    /* renamed from: b */
    static byte[] m5707b(String str, String str2, boolean z, boolean z2) {
        axf c0802c = new C0802c();
        try {
            c0802c.f4431a = str.length() < 3 ? str.getBytes("ISO-8859-1") : atv.m5691a(str, true);
            byte[] bytes = z ? str2.length() < 3 ? str2.getBytes("ISO-8859-1") : atv.m5691a(str2, true) : (str2 == null || str2.length() == 0) ? Integer.toString(5).getBytes("ISO-8859-1") : atv.m5691a(atx.m5699a(str2.getBytes("ISO-8859-1"), null, z2), true);
            c0802c.f4432b = bytes;
            return axf.m5615a(c0802c);
        } catch (UnsupportedEncodingException e) {
            return null;
        } catch (NoSuchAlgorithmException e2) {
            return null;
        }
    }

    /* renamed from: b */
    static byte[] m5708b(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        return atx.m5709b(bArr, str, true);
    }

    /* renamed from: b */
    private static byte[] m5709b(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArr2;
        byte[] array;
        int a = atx.m5694a(z);
        if (bArr.length > a) {
            bArr = axf.m5615a(atx.m5695a(4096));
        }
        if (bArr.length < a) {
            bArr2 = new byte[(a - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(a + 1).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(a + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(atx.m5704a(array)).put(array).array();
        }
        bArr2 = new byte[256];
        new aty().m5723a(array, bArr2);
        if (str != null && str.length() > 0) {
            atx.m5703a(str, bArr2);
        }
        return bArr2;
    }
}

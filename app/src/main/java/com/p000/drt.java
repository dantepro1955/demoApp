package com.p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: ByteString */
/* renamed from: drt */
public class drt implements Serializable, Comparable<drt> {
    /* renamed from: a */
    static final char[] f22761a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    /* renamed from: b */
    public static final drt f22762b = drt.m29020a(new byte[0]);
    private static final long serialVersionUID = 1;
    /* renamed from: c */
    final byte[] f22763c;
    /* renamed from: d */
    transient int f22764d;
    /* renamed from: e */
    transient String f22765e;

    public /* synthetic */ int compareTo(Object obj) {
        return m29031b((drt) obj);
    }

    drt(byte[] bArr) {
        this.f22763c = bArr;
    }

    /* renamed from: a */
    public static drt m29020a(byte... bArr) {
        if (bArr != null) {
            return new drt((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: a */
    public static drt m29019a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        drt drt = new drt(str.getBytes(dsj.f22803a));
        drt.f22765e = str;
        return drt;
    }

    /* renamed from: a */
    public String mo4616a() {
        String str = this.f22765e;
        if (str != null) {
            return str;
        }
        str = new String(this.f22763c, dsj.f22803a);
        this.f22765e = str;
        return str;
    }

    /* renamed from: b */
    public String mo4620b() {
        return drp.m28903a(this.f22763c);
    }

    /* renamed from: c */
    public drt mo4621c() {
        return m29023d("MD5");
    }

    /* renamed from: d */
    public drt mo4622d() {
        return m29023d("SHA-1");
    }

    /* renamed from: e */
    public drt mo4623e() {
        return m29023d("SHA-256");
    }

    /* renamed from: d */
    private drt m29023d(String str) {
        try {
            return drt.m29020a(MessageDigest.getInstance(str).digest(this.f22763c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public static drt m29021b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] a = drp.m28905a(str);
        return a != null ? new drt(a) : null;
    }

    /* renamed from: f */
    public String mo4625f() {
        int i = 0;
        char[] cArr = new char[(this.f22763c.length * 2)];
        byte[] bArr = this.f22763c;
        int length = bArr.length;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i2 + 1;
            cArr[i2] = f22761a[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = f22761a[b & 15];
            i++;
        }
        return new String(cArr);
    }

    /* renamed from: c */
    public static drt m29022c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        } else {
            byte[] bArr = new byte[(str.length() / 2)];
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) ((drt.m29016a(str.charAt(i * 2)) << 4) + drt.m29016a(str.charAt((i * 2) + 1)));
            }
            return drt.m29020a(bArr);
        }
    }

    /* renamed from: a */
    private static int m29016a(char c) {
        if (c >= '0' && c <= '9') {
            return c - 48;
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 97) + 10;
        }
        if (c >= 'A' && c <= 'F') {
            return (c - 65) + 10;
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* renamed from: a */
    public static drt m29018a(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + i);
        } else {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    throw new EOFException();
                }
                i2 += read;
            }
            return new drt(bArr);
        }
    }

    /* renamed from: g */
    public drt mo4626g() {
        int i = 0;
        while (i < this.f22763c.length) {
            byte b = this.f22763c[i];
            if (b < (byte) 65 || b > (byte) 90) {
                i++;
            } else {
                byte[] bArr = (byte[]) this.f22763c.clone();
                int i2 = i + 1;
                bArr[i] = (byte) (b + 32);
                for (i = i2; i < bArr.length; i++) {
                    byte b2 = bArr[i];
                    if (b2 >= (byte) 65 && b2 <= (byte) 90) {
                        bArr[i] = (byte) (b2 + 32);
                    }
                }
                return new drt(bArr);
            }
        }
        return this;
    }

    /* renamed from: a */
    public drt mo4615a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        } else if (i2 > this.f22763c.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f22763c.length + ")");
        } else {
            int i3 = i2 - i;
            if (i3 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            } else if (i == 0 && i2 == this.f22763c.length) {
                return this;
            } else {
                Object obj = new byte[i3];
                System.arraycopy(this.f22763c, i, obj, 0, i3);
                this(obj);
                return this;
            }
        }
    }

    /* renamed from: a */
    public byte mo4614a(int i) {
        return this.f22763c[i];
    }

    /* renamed from: h */
    public int mo4627h() {
        return this.f22763c.length;
    }

    /* renamed from: i */
    public byte[] mo4629i() {
        return (byte[]) this.f22763c.clone();
    }

    /* renamed from: a */
    void mo4617a(drq drq) {
        drq.m28968b(this.f22763c, 0, this.f22763c.length);
    }

    /* renamed from: a */
    public boolean mo4618a(int i, drt drt, int i2, int i3) {
        return drt.mo4619a(i2, this.f22763c, i, i3);
    }

    /* renamed from: a */
    public boolean mo4619a(int i, byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= this.f22763c.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && dsj.m29132a(this.f22763c, i, bArr, i2, i3);
    }

    /* renamed from: a */
    public final boolean m29030a(drt drt) {
        return mo4618a(0, drt, 0, drt.mo4627h());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean z;
        if ((obj instanceof drt) && ((drt) obj).mo4627h() == this.f22763c.length && ((drt) obj).mo4619a(0, this.f22763c, 0, this.f22763c.length)) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = this.f22764d;
        if (i != 0) {
            return i;
        }
        i = Arrays.hashCode(this.f22763c);
        this.f22764d = i;
        return i;
    }

    /* renamed from: b */
    public int m29031b(drt drt) {
        int h = mo4627h();
        int h2 = drt.mo4627h();
        int min = Math.min(h, h2);
        int i = 0;
        while (i < min) {
            int a = mo4614a(i) & 255;
            int a2 = drt.mo4614a(i) & 255;
            if (a == a2) {
                i++;
            } else if (a < a2) {
                return -1;
            } else {
                return 1;
            }
        }
        if (h == h2) {
            return 0;
        }
        if (h >= h2) {
            return 1;
        }
        return -1;
    }

    public String toString() {
        if (this.f22763c.length == 0) {
            return "[size=0]";
        }
        String a = mo4616a();
        int a2 = drt.m29017a(a, 64);
        if (a2 != -1) {
            String replace = a.substring(0, a2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            return a2 < a.length() ? "[size=" + this.f22763c.length + " text=" + replace + "…]" : "[text=" + replace + "]";
        } else if (this.f22763c.length <= 64) {
            return "[hex=" + mo4625f() + "]";
        } else {
            return "[size=" + this.f22763c.length + " hex=" + mo4615a(0, 64).mo4625f() + "…]";
        }
    }

    /* renamed from: a */
    static int m29017a(String str, int i) {
        int i2 = 0;
        int length = str.length();
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        drt a = drt.m29018a((InputStream) objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = drt.class.getDeclaredField("c");
            declaredField.setAccessible(true);
            declaredField.set(this, a.f22763c);
        } catch (NoSuchFieldException e) {
            throw new AssertionError();
        } catch (IllegalAccessException e2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f22763c.length);
        objectOutputStream.write(this.f22763c);
    }
}

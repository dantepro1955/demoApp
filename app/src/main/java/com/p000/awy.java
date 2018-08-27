package com.p000;

import com.facebook.internal.NativeProtocol;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: awy */
public final class awy {
    /* renamed from: a */
    private final ByteBuffer f4804a;

    /* renamed from: awy$a */
    public static class C0861a extends IOException {
        C0861a(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    private awy(ByteBuffer byteBuffer) {
        this.f4804a = byteBuffer;
        this.f4804a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private awy(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    private static int m6202a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < '') {
            i++;
        }
        int i2 = i;
        i = length;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt >= 'ࠀ') {
                i += awy.m6203a(charSequence, i2);
                break;
            }
            i2++;
            i = ((127 - charAt) >>> 31) + i;
        }
        if (i >= length) {
            return i;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i) + 4294967296L));
    }

    /* renamed from: a */
    private static int m6203a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = i;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            if (charAt < 'ࠀ') {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if ('?' <= charAt && charAt <= '?') {
                    if (Character.codePointAt(charSequence, i3) < NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) {
                        throw new IllegalArgumentException("Unpaired surrogate at index " + i3);
                    }
                    i3++;
                }
            }
            i3++;
        }
        return i2;
    }

    /* renamed from: a */
    private static int m6204a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = i + i2;
        while (i3 < length && i3 + i < i4) {
            char charAt = charSequence.charAt(i3);
            if (charAt >= '') {
                break;
            }
            bArr[i + i3] = (byte) charAt;
            i3++;
        }
        if (i3 == length) {
            return i + length;
        }
        int i5 = i + i3;
        while (i3 < length) {
            int i6;
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 < '' && i5 < i4) {
                i6 = i5 + 1;
                bArr[i5] = (byte) charAt2;
            } else if (charAt2 < 'ࠀ' && i5 <= i4 - 2) {
                r6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 6) | 960);
                i6 = r6 + 1;
                bArr[r6] = (byte) ((charAt2 & 63) | 128);
            } else if ((charAt2 < '?' || '?' < charAt2) && i5 <= i4 - 3) {
                i6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 12) | 480);
                i5 = i6 + 1;
                bArr[i6] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 & 63) | 128);
            } else if (i5 <= i4 - 4) {
                if (i3 + 1 != charSequence.length()) {
                    i3++;
                    charAt = charSequence.charAt(i3);
                    if (Character.isSurrogatePair(charAt2, charAt)) {
                        int toCodePoint = Character.toCodePoint(charAt2, charAt);
                        i6 = i5 + 1;
                        bArr[i5] = (byte) ((toCodePoint >>> 18) | 240);
                        i5 = i6 + 1;
                        bArr[i6] = (byte) (((toCodePoint >>> 12) & 63) | 128);
                        r6 = i5 + 1;
                        bArr[i5] = (byte) (((toCodePoint >>> 6) & 63) | 128);
                        i6 = r6 + 1;
                        bArr[r6] = (byte) ((toCodePoint & 63) | 128);
                    }
                }
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i3 - 1));
            } else {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i5);
            }
            i3++;
            i5 = i6;
        }
        return i5;
    }

    /* renamed from: a */
    public static awy m6205a(byte[] bArr) {
        return awy.m6206a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static awy m6206a(byte[] bArr, int i, int i2) {
        return new awy(bArr, i, i2);
    }

    /* renamed from: a */
    private static void m6207a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(awy.m6204a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            awy.m6215b(charSequence, byteBuffer);
        }
    }

    /* renamed from: b */
    public static int m6208b(int i) {
        return i >= 0 ? awy.m6225f(i) : 10;
    }

    /* renamed from: b */
    public static int m6209b(int i, int i2) {
        return awy.m6219d(i) + awy.m6208b(i2);
    }

    /* renamed from: b */
    public static int m6210b(int i, axf axf) {
        return (awy.m6219d(i) * 2) + awy.m6217c(axf);
    }

    /* renamed from: b */
    public static int m6211b(int i, String str) {
        return awy.m6219d(i) + awy.m6214b(str);
    }

    /* renamed from: b */
    public static int m6212b(int i, boolean z) {
        return awy.m6219d(i) + 1;
    }

    /* renamed from: b */
    public static int m6213b(int i, byte[] bArr) {
        return awy.m6219d(i) + awy.m6218c(bArr);
    }

    /* renamed from: b */
    public static int m6214b(String str) {
        int a = awy.m6202a((CharSequence) str);
        return a + awy.m6225f(a);
    }

    /* renamed from: b */
    private static void m6215b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < '') {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 'ࠀ') {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & 63) | 128));
            } else if (charAt < '?' || '?' < charAt) {
                byteBuffer.put((byte) ((charAt >>> 12) | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & 63) | 128));
            } else {
                if (i + 1 != charSequence.length()) {
                    i++;
                    char charAt2 = charSequence.charAt(i);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int toCodePoint = Character.toCodePoint(charAt, charAt2);
                        byteBuffer.put((byte) ((toCodePoint >>> 18) | 240));
                        byteBuffer.put((byte) (((toCodePoint >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((toCodePoint >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((toCodePoint & 63) | 128));
                    }
                }
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i - 1));
            }
            i++;
        }
    }

    /* renamed from: c */
    public static int m6216c(int i, axf axf) {
        return awy.m6219d(i) + awy.m6222d(axf);
    }

    /* renamed from: c */
    public static int m6217c(axf axf) {
        return axf.m5622g();
    }

    /* renamed from: c */
    public static int m6218c(byte[] bArr) {
        return awy.m6225f(bArr.length) + bArr.length;
    }

    /* renamed from: d */
    public static int m6219d(int i) {
        return awy.m6225f(axi.m6310a(i, 0));
    }

    /* renamed from: d */
    public static int m6220d(int i, long j) {
        return awy.m6219d(i) + awy.m6221d(j);
    }

    /* renamed from: d */
    public static int m6221d(long j) {
        return awy.m6228h(j);
    }

    /* renamed from: d */
    public static int m6222d(axf axf) {
        int g = axf.m5622g();
        return g + awy.m6225f(g);
    }

    /* renamed from: e */
    public static int m6223e(int i, long j) {
        return awy.m6219d(i) + awy.m6224e(j);
    }

    /* renamed from: e */
    public static int m6224e(long j) {
        return awy.m6228h(j);
    }

    /* renamed from: f */
    public static int m6225f(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (-268435456 & i) == 0 ? 4 : 5;
    }

    /* renamed from: f */
    public static int m6226f(int i, long j) {
        return awy.m6219d(i) + awy.m6227f(j);
    }

    /* renamed from: f */
    public static int m6227f(long j) {
        return awy.m6228h(awy.m6229i(j));
    }

    /* renamed from: h */
    public static int m6228h(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    /* renamed from: i */
    public static long m6229i(long j) {
        return (j << 1) ^ (j >> 63);
    }

    /* renamed from: a */
    public int m6230a() {
        return this.f4804a.remaining();
    }

    /* renamed from: a */
    public void m6231a(byte b) throws IOException {
        if (this.f4804a.hasRemaining()) {
            this.f4804a.put(b);
            return;
        }
        throw new C0861a(this.f4804a.position(), this.f4804a.limit());
    }

    /* renamed from: a */
    public void m6232a(int i) throws IOException {
        if (i >= 0) {
            m6254e(i);
        } else {
            m6255g((long) i);
        }
    }

    /* renamed from: a */
    public void m6233a(int i, int i2) throws IOException {
        m6250c(i, 0);
        m6232a(i2);
    }

    /* renamed from: a */
    public void m6234a(int i, long j) throws IOException {
        m6250c(i, 0);
        m6239a(j);
    }

    /* renamed from: a */
    public void m6235a(int i, axf axf) throws IOException {
        m6250c(i, 2);
        m6246b(axf);
    }

    /* renamed from: a */
    public void m6236a(int i, String str) throws IOException {
        m6250c(i, 2);
        m6241a(str);
    }

    /* renamed from: a */
    public void m6237a(int i, boolean z) throws IOException {
        m6250c(i, 0);
        m6242a(z);
    }

    /* renamed from: a */
    public void m6238a(int i, byte[] bArr) throws IOException {
        m6250c(i, 2);
        m6247b(bArr);
    }

    /* renamed from: a */
    public void m6239a(long j) throws IOException {
        m6255g(j);
    }

    /* renamed from: a */
    public void m6240a(axf axf) throws IOException {
        axf.mo719a(this);
    }

    /* renamed from: a */
    public void m6241a(String str) throws IOException {
        try {
            int f = awy.m6225f(str.length());
            if (f == awy.m6225f(str.length() * 3)) {
                int position = this.f4804a.position();
                if (this.f4804a.remaining() < f) {
                    throw new C0861a(f + position, this.f4804a.limit());
                }
                this.f4804a.position(position + f);
                awy.m6207a((CharSequence) str, this.f4804a);
                int position2 = this.f4804a.position();
                this.f4804a.position(position);
                m6254e((position2 - position) - f);
                this.f4804a.position(position2);
                return;
            }
            m6254e(awy.m6202a((CharSequence) str));
            awy.m6207a((CharSequence) str, this.f4804a);
        } catch (Throwable e) {
            C0861a c0861a = new C0861a(this.f4804a.position(), this.f4804a.limit());
            c0861a.initCause(e);
            throw c0861a;
        }
    }

    /* renamed from: a */
    public void m6242a(boolean z) throws IOException {
        m6249c(z ? 1 : 0);
    }

    /* renamed from: b */
    public void m6243b() {
        if (m6230a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public void m6244b(int i, long j) throws IOException {
        m6250c(i, 0);
        m6245b(j);
    }

    /* renamed from: b */
    public void m6245b(long j) throws IOException {
        m6255g(j);
    }

    /* renamed from: b */
    public void m6246b(axf axf) throws IOException {
        m6254e(axf.m5621f());
        axf.mo719a(this);
    }

    /* renamed from: b */
    public void m6247b(byte[] bArr) throws IOException {
        m6254e(bArr.length);
        m6253d(bArr);
    }

    /* renamed from: b */
    public void m6248b(byte[] bArr, int i, int i2) throws IOException {
        if (this.f4804a.remaining() >= i2) {
            this.f4804a.put(bArr, i, i2);
            return;
        }
        throw new C0861a(this.f4804a.position(), this.f4804a.limit());
    }

    /* renamed from: c */
    public void m6249c(int i) throws IOException {
        m6231a((byte) i);
    }

    /* renamed from: c */
    public void m6250c(int i, int i2) throws IOException {
        m6254e(axi.m6310a(i, i2));
    }

    /* renamed from: c */
    public void m6251c(int i, long j) throws IOException {
        m6250c(i, 0);
        m6252c(j);
    }

    /* renamed from: c */
    public void m6252c(long j) throws IOException {
        m6255g(awy.m6229i(j));
    }

    /* renamed from: d */
    public void m6253d(byte[] bArr) throws IOException {
        m6248b(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public void m6254e(int i) throws IOException {
        while ((i & -128) != 0) {
            m6249c((i & 127) | 128);
            i >>>= 7;
        }
        m6249c(i);
    }

    /* renamed from: g */
    public void m6255g(long j) throws IOException {
        while ((-128 & j) != 0) {
            m6249c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m6249c((int) j);
    }
}

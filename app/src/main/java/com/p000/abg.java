package com.p000;

import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: CodedOutputStream */
/* renamed from: abg */
final class abg implements Flushable {
    /* renamed from: a */
    private final byte[] f175a;
    /* renamed from: b */
    private final int f176b;
    /* renamed from: c */
    private int f177c = 0;
    /* renamed from: d */
    private final OutputStream f178d;

    /* compiled from: CodedOutputStream */
    /* renamed from: abg$a */
    static class C0010a extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        C0010a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private abg(OutputStream outputStream, byte[] bArr) {
        this.f178d = outputStream;
        this.f175a = bArr;
        this.f176b = bArr.length;
    }

    /* renamed from: a */
    public static abg m164a(OutputStream outputStream) {
        return abg.m165a(outputStream, 4096);
    }

    /* renamed from: a */
    public static abg m165a(OutputStream outputStream, int i) {
        return new abg(outputStream, new byte[i]);
    }

    /* renamed from: a */
    public void m189a(int i, float f) throws IOException {
        m207g(i, 5);
        m187a(f);
    }

    /* renamed from: a */
    public void m191a(int i, long j) throws IOException {
        m207g(i, 0);
        m194a(j);
    }

    /* renamed from: a */
    public void m193a(int i, boolean z) throws IOException {
        m207g(i, 0);
        m197a(z);
    }

    /* renamed from: a */
    public void m192a(int i, abd abd) throws IOException {
        m207g(i, 2);
        m195a(abd);
    }

    /* renamed from: a */
    public void m190a(int i, int i2) throws IOException {
        m207g(i, 0);
        m200b(i2);
    }

    /* renamed from: b */
    public void m201b(int i, int i2) throws IOException {
        m207g(i, 0);
        m202c(i2);
    }

    /* renamed from: c */
    public void m203c(int i, int i2) throws IOException {
        m207g(i, 0);
        m206d(i2);
    }

    /* renamed from: a */
    public void m187a(float f) throws IOException {
        m210m(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public void m194a(long j) throws IOException {
        m204c(j);
    }

    /* renamed from: a */
    public void m188a(int i) throws IOException {
        if (i >= 0) {
            m209k(i);
        } else {
            m204c((long) i);
        }
    }

    /* renamed from: a */
    public void m197a(boolean z) throws IOException {
        m208i(z ? 1 : 0);
    }

    /* renamed from: a */
    public void m195a(abd abd) throws IOException {
        m209k(abd.m155a());
        m205c(abd);
    }

    /* renamed from: b */
    public void m200b(int i) throws IOException {
        m209k(i);
    }

    /* renamed from: c */
    public void m202c(int i) throws IOException {
        m188a(i);
    }

    /* renamed from: d */
    public void m206d(int i) throws IOException {
        m209k(abg.m185n(i));
    }

    /* renamed from: b */
    public static int m168b(int i, float f) {
        return abg.m183j(i) + abg.m167b(f);
    }

    /* renamed from: b */
    public static int m169b(int i, long j) {
        return abg.m183j(i) + abg.m172b(j);
    }

    /* renamed from: b */
    public static int m171b(int i, boolean z) {
        return abg.m183j(i) + abg.m174b(z);
    }

    /* renamed from: b */
    public static int m170b(int i, abd abd) {
        return abg.m183j(i) + abg.m173b(abd);
    }

    /* renamed from: d */
    public static int m175d(int i, int i2) {
        return abg.m183j(i) + abg.m179f(i2);
    }

    /* renamed from: e */
    public static int m178e(int i, int i2) {
        return abg.m183j(i) + abg.m181g(i2);
    }

    /* renamed from: f */
    public static int m180f(int i, int i2) {
        return abg.m183j(i) + abg.m182h(i2);
    }

    /* renamed from: b */
    public static int m167b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m172b(long j) {
        return abg.m176d(j);
    }

    /* renamed from: e */
    public static int m177e(int i) {
        if (i >= 0) {
            return abg.m184l(i);
        }
        return 10;
    }

    /* renamed from: b */
    public static int m174b(boolean z) {
        return 1;
    }

    /* renamed from: b */
    public static int m173b(abd abd) {
        return abg.m184l(abd.m155a()) + abd.m155a();
    }

    /* renamed from: f */
    public static int m179f(int i) {
        return abg.m184l(i);
    }

    /* renamed from: g */
    public static int m181g(int i) {
        return abg.m177e(i);
    }

    /* renamed from: h */
    public static int m182h(int i) {
        return abg.m184l(abg.m185n(i));
    }

    /* renamed from: a */
    private void m166a() throws IOException {
        if (this.f178d == null) {
            throw new C0010a();
        }
        this.f178d.write(this.f175a, 0, this.f177c);
        this.f177c = 0;
    }

    public void flush() throws IOException {
        if (this.f178d != null) {
            m166a();
        }
    }

    /* renamed from: a */
    public void m186a(byte b) throws IOException {
        if (this.f177c == this.f176b) {
            m166a();
        }
        byte[] bArr = this.f175a;
        int i = this.f177c;
        this.f177c = i + 1;
        bArr[i] = b;
    }

    /* renamed from: i */
    public void m208i(int i) throws IOException {
        m186a((byte) i);
    }

    /* renamed from: c */
    public void m205c(abd abd) throws IOException {
        m196a(abd, 0, abd.m155a());
    }

    /* renamed from: a */
    public void m198a(byte[] bArr) throws IOException {
        m199a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void m199a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f176b - this.f177c >= i2) {
            System.arraycopy(bArr, i, this.f175a, this.f177c, i2);
            this.f177c += i2;
            return;
        }
        int i3 = this.f176b - this.f177c;
        System.arraycopy(bArr, i, this.f175a, this.f177c, i3);
        int i4 = i + i3;
        i3 = i2 - i3;
        this.f177c = this.f176b;
        m166a();
        if (i3 <= this.f176b) {
            System.arraycopy(bArr, i4, this.f175a, 0, i3);
            this.f177c = i3;
            return;
        }
        this.f178d.write(bArr, i4, i3);
    }

    /* renamed from: a */
    public void m196a(abd abd, int i, int i2) throws IOException {
        if (this.f176b - this.f177c >= i2) {
            abd.m156a(this.f175a, i, this.f177c, i2);
            this.f177c += i2;
            return;
        }
        int i3 = this.f176b - this.f177c;
        abd.m156a(this.f175a, i, this.f177c, i3);
        int i4 = i + i3;
        i3 = i2 - i3;
        this.f177c = this.f176b;
        m166a();
        if (i3 <= this.f176b) {
            abd.m156a(this.f175a, i4, 0, i3);
            this.f177c = i3;
            return;
        }
        InputStream b = abd.m157b();
        if (((long) i4) != b.skip((long) i4)) {
            throw new IllegalStateException("Skip failed.");
        }
        while (i3 > 0) {
            i4 = Math.min(i3, this.f176b);
            int read = b.read(this.f175a, 0, i4);
            if (read != i4) {
                throw new IllegalStateException("Read failed.");
            }
            this.f178d.write(this.f175a, 0, read);
            i3 -= read;
        }
    }

    /* renamed from: g */
    public void m207g(int i, int i2) throws IOException {
        m209k(acp.m506a(i, i2));
    }

    /* renamed from: j */
    public static int m183j(int i) {
        return abg.m184l(acp.m506a(i, 0));
    }

    /* renamed from: k */
    public void m209k(int i) throws IOException {
        while ((i & -128) != 0) {
            m208i((i & 127) | 128);
            i >>>= 7;
        }
        m208i(i);
    }

    /* renamed from: l */
    public static int m184l(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((-268435456 & i) == 0) {
            return 4;
        }
        return 5;
    }

    /* renamed from: c */
    public void m204c(long j) throws IOException {
        while ((-128 & j) != 0) {
            m208i((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m208i((int) j);
    }

    /* renamed from: d */
    public static int m176d(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        if ((Long.MIN_VALUE & j) == 0) {
            return 9;
        }
        return 10;
    }

    /* renamed from: m */
    public void m210m(int i) throws IOException {
        m208i(i & 255);
        m208i((i >> 8) & 255);
        m208i((i >> 16) & 255);
        m208i((i >> 24) & 255);
    }

    /* renamed from: n */
    public static int m185n(int i) {
        return (i << 1) ^ (i >> 31);
    }
}

package com.p000;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: RollingSampleBuffer */
/* renamed from: aen */
final class aen {
    /* renamed from: a */
    private final agl f866a;
    /* renamed from: b */
    private final int f867b;
    /* renamed from: c */
    private final C0134a f868c = new C0134a();
    /* renamed from: d */
    private final LinkedBlockingDeque<agk> f869d = new LinkedBlockingDeque();
    /* renamed from: e */
    private final C0135b f870e = new C0135b();
    /* renamed from: f */
    private final ahk f871f = new ahk(32);
    /* renamed from: g */
    private long f872g;
    /* renamed from: h */
    private long f873h;
    /* renamed from: i */
    private agk f874i;
    /* renamed from: j */
    private int f875j = this.f867b;

    /* compiled from: RollingSampleBuffer */
    /* renamed from: aen$a */
    static final class C0134a {
        /* renamed from: a */
        private int f854a = 1000;
        /* renamed from: b */
        private long[] f855b = new long[this.f854a];
        /* renamed from: c */
        private int[] f856c = new int[this.f854a];
        /* renamed from: d */
        private int[] f857d = new int[this.f854a];
        /* renamed from: e */
        private long[] f858e = new long[this.f854a];
        /* renamed from: f */
        private byte[][] f859f = new byte[this.f854a][];
        /* renamed from: g */
        private int f860g;
        /* renamed from: h */
        private int f861h;
        /* renamed from: i */
        private int f862i;
        /* renamed from: j */
        private int f863j;

        /* renamed from: a */
        public void m1080a() {
            this.f861h = 0;
            this.f862i = 0;
            this.f863j = 0;
            this.f860g = 0;
        }

        /* renamed from: a */
        public synchronized boolean m1082a(adr adr, C0135b c0135b) {
            boolean z;
            if (this.f860g == 0) {
                z = false;
            } else {
                adr.f647e = this.f858e[this.f862i];
                adr.f645c = this.f856c[this.f862i];
                adr.f646d = this.f857d[this.f862i];
                c0135b.f864a = this.f855b[this.f862i];
                c0135b.f865b = this.f859f[this.f862i];
                z = true;
            }
            return z;
        }

        /* renamed from: b */
        public synchronized long m1083b() {
            long j;
            this.f860g--;
            int i = this.f862i;
            this.f862i = i + 1;
            this.f861h++;
            if (this.f862i == this.f854a) {
                this.f862i = 0;
            }
            if (this.f860g > 0) {
                j = this.f855b[this.f862i];
            } else {
                j = this.f855b[i] + ((long) this.f856c[i]);
            }
            return j;
        }

        /* renamed from: a */
        public synchronized long m1079a(long j) {
            long j2 = -1;
            synchronized (this) {
                if (this.f860g != 0 && j >= this.f858e[this.f862i]) {
                    if (j <= this.f858e[(this.f863j == 0 ? this.f854a : this.f863j) - 1]) {
                        int i = 0;
                        int i2 = this.f862i;
                        int i3 = -1;
                        while (i2 != this.f863j && this.f858e[i2] <= j) {
                            if ((this.f857d[i2] & 1) != 0) {
                                i3 = i;
                            }
                            i2 = (i2 + 1) % this.f854a;
                            i++;
                        }
                        if (i3 != -1) {
                            this.f860g -= i3;
                            this.f862i = (this.f862i + i3) % this.f854a;
                            this.f861h += i3;
                            j2 = this.f855b[this.f862i];
                        }
                    }
                }
            }
            return j2;
        }

        /* renamed from: a */
        public synchronized void m1081a(long j, int i, long j2, int i2, byte[] bArr) {
            this.f858e[this.f863j] = j;
            this.f855b[this.f863j] = j2;
            this.f856c[this.f863j] = i2;
            this.f857d[this.f863j] = i;
            this.f859f[this.f863j] = bArr;
            this.f860g++;
            if (this.f860g == this.f854a) {
                int i3 = this.f854a + 1000;
                Object obj = new long[i3];
                Object obj2 = new long[i3];
                Object obj3 = new int[i3];
                Object obj4 = new int[i3];
                Object obj5 = new byte[i3][];
                int i4 = this.f854a - this.f862i;
                System.arraycopy(this.f855b, this.f862i, obj, 0, i4);
                System.arraycopy(this.f858e, this.f862i, obj2, 0, i4);
                System.arraycopy(this.f857d, this.f862i, obj3, 0, i4);
                System.arraycopy(this.f856c, this.f862i, obj4, 0, i4);
                System.arraycopy(this.f859f, this.f862i, obj5, 0, i4);
                int i5 = this.f862i;
                System.arraycopy(this.f855b, 0, obj, i4, i5);
                System.arraycopy(this.f858e, 0, obj2, i4, i5);
                System.arraycopy(this.f857d, 0, obj3, i4, i5);
                System.arraycopy(this.f856c, 0, obj4, i4, i5);
                System.arraycopy(this.f859f, 0, obj5, i4, i5);
                this.f855b = obj;
                this.f858e = obj2;
                this.f857d = obj3;
                this.f856c = obj4;
                this.f859f = obj5;
                this.f862i = 0;
                this.f863j = this.f854a;
                this.f860g = this.f854a;
                this.f854a = i3;
            } else {
                this.f863j++;
                if (this.f863j == this.f854a) {
                    this.f863j = 0;
                }
            }
        }
    }

    /* compiled from: RollingSampleBuffer */
    /* renamed from: aen$b */
    static final class C0135b {
        /* renamed from: a */
        public long f864a;
        /* renamed from: b */
        public byte[] f865b;

        private C0135b() {
        }
    }

    public aen(agl agl) {
        this.f866a = agl;
        this.f867b = agl.mo186b();
    }

    /* renamed from: a */
    public void m1091a() {
        this.f868c.m1080a();
        while (!this.f869d.isEmpty()) {
            this.f866a.mo185a((agk) this.f869d.remove());
        }
        this.f872g = 0;
        this.f873h = 0;
        this.f874i = null;
        this.f875j = this.f867b;
    }

    /* renamed from: a */
    public boolean m1095a(adr adr) {
        return this.f868c.m1082a(adr, this.f870e);
    }

    /* renamed from: b */
    public void m1096b() {
        m1088b(this.f868c.m1083b());
    }

    /* renamed from: a */
    public boolean m1094a(long j) {
        long a = this.f868c.m1079a(j);
        if (a == -1) {
            return false;
        }
        m1088b(a);
        return true;
    }

    /* renamed from: b */
    public boolean m1097b(adr adr) {
        if (!this.f868c.m1082a(adr, this.f870e)) {
            return false;
        }
        if (adr.m827a()) {
            m1087a(adr, this.f870e);
        }
        adr.m826a(adr.f645c);
        m1085a(this.f870e.f864a, adr.f644b, adr.f645c);
        m1088b(this.f868c.m1083b());
        return true;
    }

    /* renamed from: a */
    private void m1087a(adr adr, C0135b c0135b) {
        long j;
        int i = 0;
        long j2 = c0135b.f864a;
        m1086a(j2, this.f871f.f1493a, 1);
        long j3 = 1 + j2;
        byte b = this.f871f.f1493a[0];
        int i2 = (b & 128) != 0 ? 1 : 0;
        int i3 = b & 127;
        if (adr.f643a.f467a == null) {
            adr.f643a.f467a = new byte[16];
        }
        m1086a(j3, adr.f643a.f467a, i3);
        j3 += (long) i3;
        if (i2 != 0) {
            m1086a(j3, this.f871f.f1493a, 2);
            j3 += 2;
            this.f871f.m1564b(0);
            i3 = this.f871f.m1571g();
            j = j3;
        } else {
            i3 = 1;
            j = j3;
        }
        int[] iArr = adr.f643a.f470d;
        if (iArr == null || iArr.length < i3) {
            iArr = new int[i3];
        }
        int[] iArr2 = adr.f643a.f471e;
        if (iArr2 == null || iArr2.length < i3) {
            iArr2 = new int[i3];
        }
        if (i2 != 0) {
            i2 = i3 * 6;
            aen.m1089b(this.f871f, i2);
            m1086a(j, this.f871f.f1493a, i2);
            j += (long) i2;
            this.f871f.m1564b(0);
            while (i < i3) {
                iArr[i] = this.f871f.m1571g();
                iArr2[i] = this.f871f.m1579o();
                i++;
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = adr.f645c - ((int) (j - c0135b.f864a));
        }
        adr.f643a.m573a(i3, iArr, iArr2, c0135b.f865b, adr.f643a.f467a, 1);
        i2 = (int) (j - c0135b.f864a);
        c0135b.f864a += (long) i2;
        adr.f645c -= i2;
    }

    /* renamed from: a */
    private void m1085a(long j, ByteBuffer byteBuffer, int i) {
        while (i > 0) {
            m1088b(j);
            int i2 = (int) (j - this.f872g);
            int min = Math.min(i, this.f867b - i2);
            agk agk = (agk) this.f869d.peek();
            byteBuffer.put(agk.f1376a, agk.m1458a(i2), min);
            j += (long) min;
            i -= min;
        }
    }

    /* renamed from: a */
    private void m1086a(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            m1088b(j);
            int i3 = (int) (j - this.f872g);
            int min = Math.min(i - i2, this.f867b - i3);
            agk agk = (agk) this.f869d.peek();
            System.arraycopy(agk.f1376a, agk.m1458a(i3), bArr, i2, min);
            j += (long) min;
            i2 += min;
        }
    }

    /* renamed from: b */
    private void m1088b(long j) {
        int i = ((int) (j - this.f872g)) / this.f867b;
        for (int i2 = 0; i2 < i; i2++) {
            this.f866a.mo185a((agk) this.f869d.remove());
            this.f872g += (long) this.f867b;
        }
    }

    /* renamed from: b */
    private static void m1089b(ahk ahk, int i) {
        if (ahk.m1565c() < i) {
            ahk.m1561a(new byte[i], i);
        }
    }

    /* renamed from: c */
    public long m1098c() {
        return this.f873h;
    }

    /* renamed from: a */
    public int m1090a(aeh aeh, int i, boolean z) throws IOException, InterruptedException {
        int a = aeh.mo113a(this.f874i.f1376a, this.f874i.m1458a(this.f875j), m1084a(i));
        if (a != -1) {
            this.f875j += a;
            this.f873h += (long) a;
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public void m1093a(ahk ahk, int i) {
        while (i > 0) {
            int a = m1084a(i);
            ahk.m1562a(this.f874i.f1376a, this.f874i.m1458a(this.f875j), a);
            this.f875j += a;
            this.f873h += (long) a;
            i -= a;
        }
    }

    /* renamed from: a */
    public void m1092a(long j, int i, long j2, int i2, byte[] bArr) {
        this.f868c.m1081a(j, i, j2, i2, bArr);
    }

    /* renamed from: a */
    private int m1084a(int i) {
        if (this.f875j == this.f867b) {
            this.f875j = 0;
            this.f874i = this.f866a.mo183a();
            this.f869d.add(this.f874i);
        }
        return Math.min(i, this.f867b - this.f875j);
    }
}

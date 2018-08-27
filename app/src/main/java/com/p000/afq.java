package com.p000;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: H262Reader */
/* renamed from: afq */
final class afq extends afp {
    /* renamed from: b */
    private static final double[] f1123b = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    /* renamed from: c */
    private boolean f1124c;
    /* renamed from: d */
    private long f1125d;
    /* renamed from: e */
    private final boolean[] f1126e = new boolean[4];
    /* renamed from: f */
    private final C0148a f1127f = new C0148a(128);
    /* renamed from: g */
    private boolean f1128g;
    /* renamed from: h */
    private long f1129h;
    /* renamed from: i */
    private long f1130i;
    /* renamed from: j */
    private boolean f1131j;
    /* renamed from: k */
    private boolean f1132k;
    /* renamed from: l */
    private long f1133l;
    /* renamed from: m */
    private long f1134m;

    /* compiled from: H262Reader */
    /* renamed from: afq$a */
    static final class C0148a {
        /* renamed from: a */
        public int f1119a;
        /* renamed from: b */
        public int f1120b;
        /* renamed from: c */
        public byte[] f1121c;
        /* renamed from: d */
        private boolean f1122d;

        public C0148a(int i) {
            this.f1121c = new byte[i];
        }

        /* renamed from: a */
        public void m1291a() {
            this.f1122d = false;
            this.f1119a = 0;
            this.f1120b = 0;
        }

        /* renamed from: a */
        public boolean m1293a(int i, int i2) {
            if (this.f1122d) {
                if (this.f1120b == 0 && i == 181) {
                    this.f1120b = this.f1119a;
                } else {
                    this.f1119a -= i2;
                    this.f1122d = false;
                    return true;
                }
            } else if (i == 179) {
                this.f1122d = true;
            }
            return false;
        }

        /* renamed from: a */
        public void m1292a(byte[] bArr, int i, int i2) {
            if (this.f1122d) {
                int i3 = i2 - i;
                if (this.f1121c.length < this.f1119a + i3) {
                    this.f1121c = Arrays.copyOf(this.f1121c, (this.f1119a + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f1121c, this.f1119a, i3);
                this.f1119a = i3 + this.f1119a;
            }
        }
    }

    public afq(aep aep) {
        super(aep);
    }

    /* renamed from: a */
    public void mo160a() {
        ahi.m1541a(this.f1126e);
        this.f1127f.m1291a();
        this.f1131j = false;
        this.f1128g = false;
        this.f1129h = 0;
    }

    /* renamed from: a */
    public void mo161a(long j, boolean z) {
        this.f1130i = j;
        this.f1131j = false;
    }

    /* renamed from: a */
    public void mo162a(ahk ahk) {
        if (ahk.m1563b() > 0) {
            int d = ahk.m1567d();
            int c = ahk.m1565c();
            byte[] bArr = ahk.f1493a;
            this.f1129h += (long) ahk.m1563b();
            this.a.mo127a(ahk, ahk.m1563b());
            int i = d;
            while (true) {
                int a = ahi.m1539a(bArr, d, c, this.f1126e);
                if (a == c) {
                    break;
                }
                int i2 = ahk.f1493a[a + 3] & 255;
                if (!this.f1124c) {
                    d = a - i;
                    if (d > 0) {
                        this.f1127f.m1292a(bArr, i, a);
                    }
                    if (this.f1127f.m1293a(i2, d < 0 ? -d : 0)) {
                        Pair a2 = afq.m1294a(this.f1127f);
                        this.a.mo126a((ado) a2.first);
                        this.f1125d = ((Long) a2.second).longValue();
                        this.f1124c = true;
                    }
                }
                if (this.f1124c && (i2 == 184 || i2 == 0)) {
                    int i3 = c - a;
                    if (this.f1128g) {
                        this.a.mo125a(this.f1134m, this.f1132k ? 1 : 0, ((int) (this.f1129h - this.f1133l)) - i3, i3, null);
                        this.f1132k = false;
                    }
                    if (i2 == 184) {
                        this.f1128g = false;
                        this.f1132k = true;
                    } else {
                        this.f1134m = !this.f1131j ? this.f1130i : this.f1134m + this.f1125d;
                        this.f1133l = this.f1129h - ((long) i3);
                        this.f1131j = true;
                        this.f1128g = true;
                    }
                }
                d = a + 3;
                i = a;
            }
            if (!this.f1124c) {
                this.f1127f.m1292a(bArr, i, c);
            }
        }
    }

    /* renamed from: b */
    public void mo163b() {
    }

    /* renamed from: a */
    private static Pair<ado, Long> m1294a(C0148a c0148a) {
        Object copyOf = Arrays.copyOf(c0148a.f1121c, c0148a.f1119a);
        int i = copyOf[5] & 255;
        int i2 = ((copyOf[4] & 255) << 4) | (i >> 4);
        int i3 = ((i & 15) << 8) | (copyOf[6] & 255);
        float f = 1.0f;
        switch ((copyOf[7] & 240) >> 4) {
            case 2:
                f = ((float) (i3 * 4)) / ((float) (i2 * 3));
                break;
            case 3:
                f = ((float) (i3 * 16)) / ((float) (i2 * 9));
                break;
            case 4:
                f = ((float) (i3 * 121)) / ((float) (i2 * 100));
                break;
        }
        ado a = ado.m815a(null, "video/mpeg2", -1, -1, -1, i2, i3, Collections.singletonList(copyOf), -1, f);
        long j = 0;
        int i4 = (copyOf[7] & 15) - 1;
        if (i4 >= 0 && i4 < f1123b.length) {
            double d = f1123b[i4];
            i4 = c0148a.f1120b;
            int i5 = (copyOf[i4 + 9] & 96) >> 5;
            i4 = copyOf[i4 + 9] & 31;
            if (i5 != i4) {
                d *= (((double) i5) + 1.0d) / ((double) (i4 + 1));
            }
            j = (long) (1000000.0d / d);
        }
        return Pair.create(a, Long.valueOf(j));
    }
}

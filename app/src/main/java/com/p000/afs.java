package com.p000;

import android.util.Log;
import java.util.Collections;

/* compiled from: H265Reader */
/* renamed from: afs */
final class afs extends afp {
    /* renamed from: b */
    private boolean f1165b;
    /* renamed from: c */
    private final afy f1166c;
    /* renamed from: d */
    private final boolean[] f1167d = new boolean[3];
    /* renamed from: e */
    private final afv f1168e = new afv(32, 128);
    /* renamed from: f */
    private final afv f1169f = new afv(33, 128);
    /* renamed from: g */
    private final afv f1170g = new afv(34, 128);
    /* renamed from: h */
    private final afv f1171h = new afv(39, 128);
    /* renamed from: i */
    private final afv f1172i = new afv(40, 128);
    /* renamed from: j */
    private final C0150a f1173j;
    /* renamed from: k */
    private long f1174k;
    /* renamed from: l */
    private long f1175l;
    /* renamed from: m */
    private final ahk f1176m;

    /* compiled from: H265Reader */
    /* renamed from: afs$a */
    static final class C0150a {
        /* renamed from: a */
        private final aep f1154a;
        /* renamed from: b */
        private long f1155b;
        /* renamed from: c */
        private boolean f1156c;
        /* renamed from: d */
        private int f1157d;
        /* renamed from: e */
        private long f1158e;
        /* renamed from: f */
        private boolean f1159f;
        /* renamed from: g */
        private boolean f1160g;
        /* renamed from: h */
        private boolean f1161h;
        /* renamed from: i */
        private long f1162i;
        /* renamed from: j */
        private long f1163j;
        /* renamed from: k */
        private boolean f1164k;

        public C0150a(aep aep) {
            this.f1154a = aep;
        }

        /* renamed from: a */
        public void m1313a() {
            this.f1159f = false;
            this.f1160g = false;
            this.f1161h = false;
        }

        /* renamed from: a */
        public void m1315a(long j, int i, int i2, long j2) {
            boolean z;
            boolean z2 = false;
            this.f1160g = false;
            this.f1158e = j2;
            this.f1157d = 0;
            this.f1155b = j;
            if (i2 >= 32 && this.f1161h) {
                m1312a(i);
                this.f1161h = false;
            }
            if (i2 < 16 || i2 > 21) {
                z = false;
            } else {
                z = true;
            }
            this.f1156c = z;
            if (this.f1156c || i2 <= 9) {
                z2 = true;
            }
            this.f1159f = z2;
        }

        /* renamed from: a */
        public void m1316a(byte[] bArr, int i, int i2) {
            if (this.f1159f) {
                int i3 = (i + 2) - this.f1157d;
                if (i3 < i2) {
                    this.f1160g = (bArr[i3] & 128) != 0;
                    this.f1159f = false;
                    return;
                }
                this.f1157d += i2 - i;
            }
        }

        /* renamed from: a */
        public void m1314a(long j, int i) {
            if (this.f1160g) {
                if (this.f1161h) {
                    m1312a(((int) (j - this.f1155b)) + i);
                }
                this.f1162i = this.f1155b;
                this.f1163j = this.f1158e;
                this.f1161h = true;
                this.f1164k = this.f1156c;
            }
        }

        /* renamed from: a */
        private void m1312a(int i) {
            this.f1154a.mo125a(this.f1163j, this.f1164k ? 1 : 0, (int) (this.f1155b - this.f1162i), i, null);
        }
    }

    public afs(aep aep, afy afy) {
        super(aep);
        this.f1166c = afy;
        this.f1173j = new C0150a(aep);
        this.f1176m = new ahk();
    }

    /* renamed from: a */
    public void mo160a() {
        ahi.m1541a(this.f1167d);
        this.f1168e.m1338a();
        this.f1169f.m1338a();
        this.f1170g.m1338a();
        this.f1171h.m1338a();
        this.f1172i.m1338a();
        this.f1173j.m1313a();
        this.f1174k = 0;
    }

    /* renamed from: a */
    public void mo161a(long j, boolean z) {
        this.f1175l = j;
    }

    /* renamed from: a */
    public void mo162a(ahk ahk) {
        while (ahk.m1563b() > 0) {
            int d = ahk.m1567d();
            int c = ahk.m1565c();
            byte[] bArr = ahk.f1493a;
            this.f1174k += (long) ahk.m1563b();
            this.a.mo127a(ahk, ahk.m1563b());
            while (d < c) {
                int a = ahi.m1539a(bArr, d, c, this.f1167d);
                if (a == c) {
                    m1320a(bArr, d, c);
                    return;
                }
                int c2 = ahi.m1544c(bArr, a);
                int i = a - d;
                if (i > 0) {
                    m1320a(bArr, d, a);
                }
                int i2 = c - a;
                long j = this.f1174k - ((long) i2);
                m1321b(j, i2, i < 0 ? -i : 0, this.f1175l);
                m1318a(j, i2, c2, this.f1175l);
                d = a + 3;
            }
        }
    }

    /* renamed from: b */
    public void mo163b() {
    }

    /* renamed from: a */
    private void m1318a(long j, int i, int i2, long j2) {
        if (!this.f1165b) {
            this.f1168e.m1339a(i2);
            this.f1169f.m1339a(i2);
            this.f1170g.m1339a(i2);
        }
        this.f1171h.m1339a(i2);
        this.f1172i.m1339a(i2);
        this.f1173j.m1315a(j, i, i2, j2);
    }

    /* renamed from: a */
    private void m1320a(byte[] bArr, int i, int i2) {
        if (this.f1165b) {
            this.f1173j.m1316a(bArr, i, i2);
        } else {
            this.f1168e.m1340a(bArr, i, i2);
            this.f1169f.m1340a(bArr, i, i2);
            this.f1170g.m1340a(bArr, i, i2);
        }
        this.f1171h.m1340a(bArr, i, i2);
        this.f1172i.m1340a(bArr, i, i2);
    }

    /* renamed from: b */
    private void m1321b(long j, int i, int i2, long j2) {
        if (this.f1165b) {
            this.f1173j.m1314a(j, i);
        } else {
            this.f1168e.m1342b(i2);
            this.f1169f.m1342b(i2);
            this.f1170g.m1342b(i2);
            if (this.f1168e.m1341b() && this.f1169f.m1341b() && this.f1170g.m1341b()) {
                this.a.mo126a(afs.m1317a(this.f1168e, this.f1169f, this.f1170g));
                this.f1165b = true;
            }
        }
        if (this.f1171h.m1342b(i2)) {
            this.f1176m.m1561a(this.f1171h.f1191a, ahi.m1537a(this.f1171h.f1191a, this.f1171h.f1192b));
            this.f1176m.m1566c(5);
            this.f1166c.m1354a(j2, this.f1176m);
        }
        if (this.f1172i.m1342b(i2)) {
            this.f1176m.m1561a(this.f1172i.f1191a, ahi.m1537a(this.f1172i.f1191a, this.f1172i.f1192b));
            this.f1176m.m1566c(5);
            this.f1166c.m1354a(j2, this.f1176m);
        }
    }

    /* renamed from: a */
    private static ado m1317a(afv afv, afv afv2, afv afv3) {
        int i;
        float f;
        Object obj = new byte[((afv.f1192b + afv2.f1192b) + afv3.f1192b)];
        System.arraycopy(afv.f1191a, 0, obj, 0, afv.f1192b);
        System.arraycopy(afv2.f1191a, 0, obj, afv.f1192b, afv2.f1192b);
        System.arraycopy(afv3.f1191a, 0, obj, afv.f1192b + afv2.f1192b, afv3.f1192b);
        ahi.m1537a(afv2.f1191a, afv2.f1192b);
        ahj ahj = new ahj(afv2.f1191a);
        ahj.m1551b(44);
        int c = ahj.m1554c(3);
        ahj.m1551b(1);
        ahj.m1551b(88);
        ahj.m1551b(8);
        int i2 = 0;
        for (i = 0; i < c; i++) {
            if (ahj.m1554c(1) == 1) {
                i2 += 89;
            }
            if (ahj.m1554c(1) == 1) {
                i2 += 8;
            }
        }
        ahj.m1551b(i2);
        if (c > 0) {
            ahj.m1551b((8 - c) * 2);
        }
        ahj.m1555d();
        int d = ahj.m1555d();
        if (d == 3) {
            ahj.m1551b(1);
        }
        int d2 = ahj.m1555d();
        int d3 = ahj.m1555d();
        if (ahj.m1552b()) {
            int d4 = ahj.m1555d();
            int d5 = ahj.m1555d();
            int d6 = ahj.m1555d();
            int d7 = ahj.m1555d();
            i = (d == 1 || d == 2) ? 2 : 1;
            d2 -= i * (d4 + d5);
            d3 -= (d == 1 ? 2 : 1) * (d6 + d7);
        }
        ahj.m1555d();
        ahj.m1555d();
        i = ahj.m1555d();
        i2 = ahj.m1552b() ? 0 : c;
        while (i2 <= c) {
            ahj.m1555d();
            ahj.m1555d();
            ahj.m1555d();
            i2++;
        }
        ahj.m1555d();
        ahj.m1555d();
        ahj.m1555d();
        ahj.m1555d();
        ahj.m1555d();
        ahj.m1555d();
        if (ahj.m1552b() && ahj.m1552b()) {
            afs.m1319a(ahj);
        }
        ahj.m1551b(2);
        if (ahj.m1552b()) {
            ahj.m1551b(8);
            ahj.m1555d();
            ahj.m1555d();
            ahj.m1551b(1);
        }
        afs.m1322b(ahj);
        if (ahj.m1552b()) {
            for (i2 = 0; i2 < ahj.m1555d(); i2++) {
                ahj.m1551b((i + 4) + 1);
            }
        }
        ahj.m1551b(2);
        float f2 = 1.0f;
        if (ahj.m1552b() && ahj.m1552b()) {
            c = ahj.m1554c(8);
            if (c == 255) {
                c = ahj.m1554c(16);
                i = ahj.m1554c(16);
                if (!(c == 0 || i == 0)) {
                    f2 = ((float) c) / ((float) i);
                }
                f = f2;
            } else if (c < ahi.f1486b.length) {
                f = ahi.f1486b[c];
            } else {
                Log.w("H265Reader", "Unexpected aspect_ratio_idc value: " + c);
            }
            return ado.m815a(null, "video/hevc", -1, -1, -1, d2, d3, Collections.singletonList(obj), -1, f);
        }
        f = 1.0f;
        return ado.m815a(null, "video/hevc", -1, -1, -1, d2, d3, Collections.singletonList(obj), -1, f);
    }

    /* renamed from: a */
    private static void m1319a(ahj ahj) {
        int i = 0;
        while (i < 4) {
            for (int i2 = 0; i2 < 6; i2 = (i == 3 ? 3 : 1) + i2) {
                if (ahj.m1552b()) {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        ahj.m1556e();
                    }
                    for (int i3 = 0; i3 < min; i3++) {
                        ahj.m1556e();
                    }
                } else {
                    ahj.m1555d();
                }
            }
            i++;
        }
    }

    /* renamed from: b */
    private static void m1322b(ahj ahj) {
        int d = ahj.m1555d();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i < d) {
            boolean b;
            if (i != 0) {
                b = ahj.m1552b();
            } else {
                b = z;
            }
            int i3;
            if (b) {
                ahj.m1551b(1);
                ahj.m1555d();
                for (i3 = 0; i3 <= i2; i3++) {
                    if (ahj.m1552b()) {
                        ahj.m1551b(1);
                    }
                }
            } else {
                int d2 = ahj.m1555d();
                int d3 = ahj.m1555d();
                i2 = d2 + d3;
                for (i3 = 0; i3 < d2; i3++) {
                    ahj.m1555d();
                    ahj.m1551b(1);
                }
                for (i3 = 0; i3 < d3; i3++) {
                    ahj.m1555d();
                    ahj.m1551b(1);
                }
            }
            i++;
            z = b;
        }
    }
}

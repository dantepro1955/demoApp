package com.p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.ahd.C0174a;

/* compiled from: H264Reader */
/* renamed from: afr */
final class afr extends afp {
    /* renamed from: b */
    private boolean f1140b;
    /* renamed from: c */
    private final afy f1141c;
    /* renamed from: d */
    private final boolean[] f1142d = new boolean[3];
    /* renamed from: e */
    private final C0149a f1143e;
    /* renamed from: f */
    private final afv f1144f;
    /* renamed from: g */
    private final afv f1145g;
    /* renamed from: h */
    private final afv f1146h;
    /* renamed from: i */
    private boolean f1147i;
    /* renamed from: j */
    private long f1148j;
    /* renamed from: k */
    private long f1149k;
    /* renamed from: l */
    private boolean f1150l;
    /* renamed from: m */
    private long f1151m;
    /* renamed from: n */
    private long f1152n;
    /* renamed from: o */
    private final ahk f1153o;

    /* compiled from: H264Reader */
    /* renamed from: afr$a */
    static final class C0149a {
        /* renamed from: a */
        private final ahj f1135a = new ahj(this.f1136b);
        /* renamed from: b */
        private byte[] f1136b = new byte[128];
        /* renamed from: c */
        private int f1137c;
        /* renamed from: d */
        private boolean f1138d;
        /* renamed from: e */
        private int f1139e;

        public C0149a() {
            m1299a();
        }

        /* renamed from: a */
        public void m1299a() {
            this.f1138d = false;
            this.f1137c = 0;
            this.f1139e = -1;
        }

        /* renamed from: b */
        public boolean m1302b() {
            return this.f1139e != -1;
        }

        /* renamed from: a */
        public void m1300a(int i) {
            if (i == 1) {
                m1299a();
                this.f1138d = true;
            }
        }

        /* renamed from: a */
        public void m1301a(byte[] bArr, int i, int i2) {
            if (this.f1138d) {
                int i3 = i2 - i;
                if (this.f1136b.length < this.f1137c + i3) {
                    this.f1136b = Arrays.copyOf(this.f1136b, (this.f1137c + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f1136b, this.f1137c, i3);
                this.f1137c = i3 + this.f1137c;
                this.f1135a.m1550a(this.f1136b, this.f1137c);
                this.f1135a.m1551b(8);
                i3 = this.f1135a.m1553c();
                if (i3 != -1 && i3 <= this.f1135a.m1547a()) {
                    this.f1135a.m1551b(i3);
                    i3 = this.f1135a.m1553c();
                    if (i3 != -1 && i3 <= this.f1135a.m1547a()) {
                        this.f1139e = this.f1135a.m1555d();
                        this.f1138d = false;
                    }
                }
            }
        }

        /* renamed from: c */
        public int m1303c() {
            return this.f1139e;
        }
    }

    public afr(aep aep, afy afy, boolean z) {
        super(aep);
        this.f1141c = afy;
        this.f1143e = z ? new C0149a() : null;
        this.f1144f = new afv(7, 128);
        this.f1145g = new afv(8, 128);
        this.f1146h = new afv(6, 128);
        this.f1153o = new ahk();
    }

    /* renamed from: a */
    public void mo160a() {
        ahi.m1541a(this.f1142d);
        this.f1144f.m1338a();
        this.f1145g.m1338a();
        this.f1146h.m1338a();
        if (this.f1143e != null) {
            this.f1143e.m1299a();
        }
        this.f1147i = false;
        this.f1148j = 0;
    }

    /* renamed from: a */
    public void mo161a(long j, boolean z) {
        this.f1149k = j;
    }

    /* renamed from: a */
    public void mo162a(ahk ahk) {
        if (ahk.m1563b() > 0) {
            int d = ahk.m1567d();
            int c = ahk.m1565c();
            byte[] bArr = ahk.f1493a;
            this.f1148j += (long) ahk.m1563b();
            this.a.mo127a(ahk, ahk.m1563b());
            while (true) {
                int a = ahi.m1539a(bArr, d, c, this.f1142d);
                if (a == c) {
                    m1307a(bArr, d, c);
                    return;
                }
                int b = ahi.m1543b(bArr, a);
                int i = a - d;
                if (i > 0) {
                    m1307a(bArr, d, a);
                }
                switch (b) {
                    case 5:
                        this.f1150l = true;
                        break;
                    case 9:
                        int i2 = c - a;
                        if (this.f1147i) {
                            if (this.f1143e != null && this.f1143e.m1302b()) {
                                d = this.f1143e.m1303c();
                                boolean z = this.f1150l;
                                d = (d == 2 || d == 7) ? 1 : 0;
                                this.f1150l = d | z;
                                this.f1143e.m1299a();
                            }
                            if (this.f1150l && !this.f1140b && this.f1144f.m1341b() && this.f1145g.m1341b()) {
                                this.a.mo126a(afr.m1304a(this.f1144f, this.f1145g));
                                this.f1140b = true;
                            }
                            this.a.mo125a(this.f1152n, this.f1150l ? 1 : 0, ((int) (this.f1148j - this.f1151m)) - i2, i2, null);
                        }
                        this.f1147i = true;
                        this.f1151m = this.f1148j - ((long) i2);
                        this.f1152n = this.f1149k;
                        this.f1150l = false;
                        break;
                }
                m1306a(this.f1149k, i < 0 ? -i : 0);
                m1305a(b);
                d = a + 3;
            }
        }
    }

    /* renamed from: b */
    public void mo163b() {
    }

    /* renamed from: a */
    private void m1305a(int i) {
        if (this.f1143e != null) {
            this.f1143e.m1300a(i);
        }
        if (!this.f1140b) {
            this.f1144f.m1339a(i);
            this.f1145g.m1339a(i);
        }
        this.f1146h.m1339a(i);
    }

    /* renamed from: a */
    private void m1307a(byte[] bArr, int i, int i2) {
        if (this.f1143e != null) {
            this.f1143e.m1301a(bArr, i, i2);
        }
        if (!this.f1140b) {
            this.f1144f.m1340a(bArr, i, i2);
            this.f1145g.m1340a(bArr, i, i2);
        }
        this.f1146h.m1340a(bArr, i, i2);
    }

    /* renamed from: a */
    private void m1306a(long j, int i) {
        this.f1144f.m1342b(i);
        this.f1145g.m1342b(i);
        if (this.f1146h.m1342b(i)) {
            this.f1153o.m1561a(this.f1146h.f1191a, ahi.m1537a(this.f1146h.f1191a, this.f1146h.f1192b));
            this.f1153o.m1564b(4);
            this.f1141c.m1354a(j, this.f1153o);
        }
    }

    /* renamed from: a */
    private static ado m1304a(afv afv, afv afv2) {
        List arrayList = new ArrayList();
        arrayList.add(Arrays.copyOf(afv.f1191a, afv.f1192b));
        arrayList.add(Arrays.copyOf(afv2.f1191a, afv2.f1192b));
        ahi.m1537a(afv.f1191a, afv.f1192b);
        ahj ahj = new ahj(afv.f1191a);
        ahj.m1551b(32);
        C0174a a = ahd.m1519a(ahj);
        return ado.m815a(null, "video/avc", -1, -1, -1, a.f1459a, a.f1460b, arrayList, -1, a.f1461c);
    }
}

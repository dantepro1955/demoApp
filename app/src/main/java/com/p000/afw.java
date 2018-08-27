package com.p000;

import android.util.SparseArray;
import com.facebook.imageutils.JfifUtil;
import java.io.IOException;

/* compiled from: PsExtractor */
/* renamed from: afw */
public final class afw implements aeg {
    /* renamed from: a */
    private final afx f1204a;
    /* renamed from: b */
    private final SparseArray<C0151a> f1205b;
    /* renamed from: c */
    private final ahk f1206c;
    /* renamed from: d */
    private boolean f1207d;
    /* renamed from: e */
    private boolean f1208e;
    /* renamed from: f */
    private boolean f1209f;
    /* renamed from: g */
    private aei f1210g;

    /* compiled from: PsExtractor */
    /* renamed from: afw$a */
    static final class C0151a {
        /* renamed from: a */
        private final afp f1196a;
        /* renamed from: b */
        private final afx f1197b;
        /* renamed from: c */
        private final ahj f1198c = new ahj(new byte[64]);
        /* renamed from: d */
        private boolean f1199d;
        /* renamed from: e */
        private boolean f1200e;
        /* renamed from: f */
        private boolean f1201f;
        /* renamed from: g */
        private int f1202g;
        /* renamed from: h */
        private long f1203h;

        public C0151a(afp afp, afx afx) {
            this.f1196a = afp;
            this.f1197b = afx;
        }

        /* renamed from: a */
        public void m1345a() {
            this.f1201f = false;
            this.f1196a.mo160a();
        }

        /* renamed from: a */
        public void m1346a(ahk ahk, aei aei) {
            ahk.m1562a(this.f1198c.f1489a, 0, 3);
            this.f1198c.m1548a(0);
            m1343b();
            ahk.m1562a(this.f1198c.f1489a, 0, this.f1202g);
            this.f1198c.m1548a(0);
            m1344c();
            this.f1196a.mo161a(this.f1203h, true);
            this.f1196a.mo162a(ahk);
            this.f1196a.mo163b();
        }

        /* renamed from: b */
        private void m1343b() {
            this.f1198c.m1551b(8);
            this.f1199d = this.f1198c.m1552b();
            this.f1200e = this.f1198c.m1552b();
            this.f1198c.m1551b(6);
            this.f1202g = this.f1198c.m1554c(8);
        }

        /* renamed from: c */
        private void m1344c() {
            this.f1203h = 0;
            if (this.f1199d) {
                this.f1198c.m1551b(4);
                long c = ((long) this.f1198c.m1554c(3)) << 30;
                this.f1198c.m1551b(1);
                c |= (long) (this.f1198c.m1554c(15) << 15);
                this.f1198c.m1551b(1);
                c |= (long) this.f1198c.m1554c(15);
                this.f1198c.m1551b(1);
                if (!this.f1201f && this.f1200e) {
                    this.f1198c.m1551b(4);
                    long c2 = ((long) this.f1198c.m1554c(3)) << 30;
                    this.f1198c.m1551b(1);
                    c2 |= (long) (this.f1198c.m1554c(15) << 15);
                    this.f1198c.m1551b(1);
                    c2 |= (long) this.f1198c.m1554c(15);
                    this.f1198c.m1551b(1);
                    this.f1197b.m1352a(c2);
                    this.f1201f = true;
                }
                this.f1203h = this.f1197b.m1352a(c);
            }
        }
    }

    public afw() {
        this(new afx(0));
    }

    public afw(afx afx) {
        this.f1204a = afx;
        this.f1206c = new ahk(4096);
        this.f1205b = new SparseArray();
    }

    /* renamed from: a */
    public boolean mo155a(aeh aeh) throws IOException, InterruptedException {
        boolean z = true;
        byte[] bArr = new byte[14];
        aeh.mo122c(bArr, 0, 14);
        if (442 != (((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        aeh.mo121c(bArr[13] & 7);
        aeh.mo122c(bArr, 0, 3);
        if (1 != ((bArr[2] & 255) | (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)))) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public void mo154a(aei aei) {
        this.f1210g = aei;
        aei.mo136a(aeo.f740f);
    }

    /* renamed from: b */
    public void mo156b() {
        this.f1204a.m1353a();
        for (int i = 0; i < this.f1205b.size(); i++) {
            ((C0151a) this.f1205b.valueAt(i)).m1345a();
        }
    }

    /* renamed from: a */
    public int mo153a(aeh aeh, aem aem) throws IOException, InterruptedException {
        if (!aeh.mo119b(this.f1206c.f1493a, 0, 4, true)) {
            return -1;
        }
        this.f1206c.m1564b(0);
        int k = this.f1206c.m1575k();
        if (k == 441) {
            return -1;
        }
        if (k == 442) {
            aeh.mo122c(this.f1206c.f1493a, 0, 10);
            this.f1206c.m1564b(0);
            this.f1206c.m1566c(9);
            aeh.mo117b((this.f1206c.m1570f() & 7) + 14);
            return 0;
        } else if (k == 443) {
            aeh.mo122c(this.f1206c.f1493a, 0, 2);
            this.f1206c.m1564b(0);
            aeh.mo117b(this.f1206c.m1571g() + 6);
            return 0;
        } else if (((k & -256) >> 8) != 1) {
            aeh.mo117b(1);
            return 0;
        } else {
            int i = k & 255;
            C0151a c0151a = (C0151a) this.f1205b.get(i);
            if (!this.f1207d) {
                if (c0151a == null) {
                    afp afp = null;
                    if (!this.f1208e && i == 189) {
                        afp = new afl(this.f1210g.mo148d(i), false);
                        this.f1208e = true;
                    } else if (!this.f1208e && (i & 224) == JfifUtil.MARKER_SOFn) {
                        afp = new afu(this.f1210g.mo148d(i));
                        this.f1208e = true;
                    } else if (!this.f1209f && (i & 240) == 224) {
                        afp = new afq(this.f1210g.mo148d(i));
                        this.f1209f = true;
                    }
                    if (afp != null) {
                        c0151a = new C0151a(afp, this.f1204a);
                        this.f1205b.put(i, c0151a);
                    }
                }
                if ((this.f1208e && this.f1209f) || aeh.mo120c() > 1048576) {
                    this.f1207d = true;
                    this.f1210g.mo150f();
                }
            }
            aeh.mo122c(this.f1206c.f1493a, 0, 2);
            this.f1206c.m1564b(0);
            k = this.f1206c.m1571g() + 6;
            if (c0151a == null) {
                aeh.mo117b(k);
            } else {
                if (this.f1206c.m1569e() < k) {
                    this.f1206c.m1561a(new byte[k], k);
                }
                aeh.mo118b(this.f1206c.f1493a, 0, k);
                this.f1206c.m1564b(6);
                this.f1206c.m1559a(k);
                c0151a.m1346a(this.f1206c, this.f1210g);
                this.f1206c.m1559a(this.f1206c.m1569e());
            }
            return 0;
        }
    }
}

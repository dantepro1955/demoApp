package com.p000;

import com.facebook.common.time.Clock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import p000.afa.C0142a;
import p000.afa.C0143b;

/* compiled from: Mp4Extractor */
/* renamed from: afe */
public final class afe implements aeg, aeo {
    /* renamed from: a */
    private static final int f1027a = ahr.m1606c("qt  ");
    /* renamed from: b */
    private final ahk f1028b = new ahk(ahi.f1485a);
    /* renamed from: c */
    private final ahk f1029c = new ahk(4);
    /* renamed from: d */
    private final ahk f1030d = new ahk(16);
    /* renamed from: e */
    private final Stack<C0142a> f1031e = new Stack();
    /* renamed from: g */
    private int f1032g;
    /* renamed from: h */
    private int f1033h;
    /* renamed from: i */
    private long f1034i;
    /* renamed from: j */
    private int f1035j;
    /* renamed from: k */
    private ahk f1036k;
    /* renamed from: l */
    private int f1037l;
    /* renamed from: m */
    private int f1038m;
    /* renamed from: n */
    private int f1039n;
    /* renamed from: o */
    private aei f1040o;
    /* renamed from: p */
    private C0147a[] f1041p;
    /* renamed from: q */
    private boolean f1042q;

    /* compiled from: Mp4Extractor */
    /* renamed from: afe$a */
    static final class C0147a {
        /* renamed from: a */
        public final afh f1023a;
        /* renamed from: b */
        public final afk f1024b;
        /* renamed from: c */
        public final aep f1025c;
        /* renamed from: d */
        public int f1026d;

        public C0147a(afh afh, afk afk, aep aep) {
            this.f1023a = afh;
            this.f1024b = afk;
            this.f1025c = aep;
        }
    }

    public afe() {
        m1234c();
    }

    /* renamed from: a */
    public boolean mo155a(aeh aeh) throws IOException, InterruptedException {
        return afg.m1247b(aeh);
    }

    /* renamed from: a */
    public void mo154a(aei aei) {
        this.f1040o = aei;
    }

    /* renamed from: b */
    public void mo156b() {
        this.f1031e.clear();
        this.f1035j = 0;
        this.f1038m = 0;
        this.f1039n = 0;
        this.f1032g = 0;
    }

    /* renamed from: a */
    public int mo153a(aeh aeh, aem aem) throws IOException, InterruptedException {
        while (true) {
            switch (this.f1032g) {
                case 0:
                    if (aeh.mo120c() != 0) {
                        this.f1032g = 3;
                        break;
                    }
                    m1234c();
                    break;
                case 1:
                    if (m1231b(aeh)) {
                        break;
                    }
                    return -1;
                case 2:
                    if (!m1232b(aeh, aem)) {
                        break;
                    }
                    return 1;
                default:
                    return m1233c(aeh, aem);
            }
        }
    }

    /* renamed from: a */
    public boolean mo110a() {
        return true;
    }

    /* renamed from: b */
    public long mo111b(long j) {
        long j2 = Clock.MAX_TIME;
        for (int i = 0; i < this.f1041p.length; i++) {
            afk afk = this.f1041p[i].f1024b;
            int a = afk.m1254a(j);
            if (a == -1) {
                a = afk.m1255b(j);
            }
            this.f1041p[i].f1026d = a;
            long j3 = afk.f1076b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    /* renamed from: c */
    private void m1234c() {
        this.f1032g = 1;
        this.f1035j = 0;
    }

    /* renamed from: b */
    private boolean m1231b(aeh aeh) throws IOException, InterruptedException {
        if (this.f1035j == 0) {
            if (!aeh.mo115a(this.f1030d.f1493a, 0, 8, true)) {
                return false;
            }
            this.f1035j = 8;
            this.f1030d.m1564b(0);
            this.f1034i = this.f1030d.m1574j();
            this.f1033h = this.f1030d.m1575k();
        }
        if (this.f1034i == 1) {
            aeh.mo118b(this.f1030d.f1493a, 8, 8);
            this.f1035j += 8;
            this.f1034i = this.f1030d.m1580p();
        }
        if (afe.m1230b(this.f1033h)) {
            this.f1031e.add(new C0142a(this.f1033h, (aeh.mo120c() + this.f1034i) - ((long) this.f1035j)));
            m1234c();
        } else if (afe.m1228a(this.f1033h)) {
            boolean z;
            if (this.f1035j == 8) {
                z = true;
            } else {
                z = false;
            }
            ahb.m1516b(z);
            if (this.f1034i <= 2147483647L) {
                z = true;
            } else {
                z = false;
            }
            ahb.m1516b(z);
            this.f1036k = new ahk((int) this.f1034i);
            System.arraycopy(this.f1030d.f1493a, 0, this.f1036k.f1493a, 0, 8);
            this.f1032g = 2;
        } else {
            this.f1036k = null;
            this.f1032g = 2;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m1232b(aeh aeh, aem aem) throws IOException, InterruptedException {
        boolean z;
        long j = this.f1034i - ((long) this.f1035j);
        long c = aeh.mo120c() + j;
        if (this.f1036k != null) {
            aeh.mo118b(this.f1036k.f1493a, this.f1035j, (int) j);
            if (this.f1033h == afa.f960a) {
                this.f1042q = afe.m1229a(this.f1036k);
                z = false;
            } else if (this.f1031e.isEmpty()) {
                z = false;
            } else {
                ((C0142a) this.f1031e.peek()).m1173a(new C0143b(this.f1033h, this.f1036k));
                z = false;
            }
        } else if (j < 262144) {
            aeh.mo117b((int) j);
            z = false;
        } else {
            aem.f853a = j + aeh.mo120c();
            z = true;
        }
        while (!this.f1031e.isEmpty() && ((C0142a) this.f1031e.peek()).aA == c) {
            C0142a c0142a = (C0142a) this.f1031e.pop();
            if (c0142a.az == afa.f984y) {
                m1227a(c0142a);
                this.f1031e.clear();
                this.f1032g = 3;
                return false;
            } else if (!this.f1031e.isEmpty()) {
                ((C0142a) this.f1031e.peek()).m1172a(c0142a);
            }
        }
        m1234c();
        return z;
    }

    /* renamed from: a */
    private static boolean m1229a(ahk ahk) {
        ahk.m1564b(8);
        if (ahk.m1575k() == f1027a) {
            return true;
        }
        ahk.m1566c(4);
        while (ahk.m1563b() > 0) {
            if (ahk.m1575k() == f1027a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m1227a(C0142a c0142a) {
        ael a;
        List arrayList = new ArrayList();
        long j = Clock.MAX_TIME;
        C0142a e = c0142a.m1175e(afa.as);
        if (e != null) {
            a = afb.m1180a(e);
        } else {
            a = null;
        }
        for (int i = 0; i < c0142a.aC.size(); i++) {
            C0142a c0142a2 = (C0142a) c0142a.aC.get(i);
            if (c0142a2.az == afa.f934A) {
                afh a2 = afb.m1184a(c0142a2, c0142a.m1174d(afa.f985z), this.f1042q);
                if (a2 != null) {
                    afk a3 = afb.m1186a(a2, c0142a2.m1175e(afa.f935B).m1175e(afa.f936C).m1175e(afa.f937D));
                    if (a3.f1075a != 0) {
                        C0147a c0147a = new C0147a(a2, a3, this.f1040o.mo148d(i));
                        ado a4 = a2.f1054k.m822a(a3.f1078d + 30);
                        if (a != null) {
                            a4 = a4.m823a(a.f851a, a.f852b);
                        }
                        c0147a.f1025c.mo126a(a4);
                        arrayList.add(c0147a);
                        long j2 = a3.f1076b[0];
                        if (j2 < j) {
                            j = j2;
                        }
                    }
                }
            }
        }
        this.f1041p = (C0147a[]) arrayList.toArray(new C0147a[0]);
        this.f1040o.mo150f();
        this.f1040o.mo136a((aeo) this);
    }

    /* renamed from: c */
    private int m1233c(aeh aeh, aem aem) throws IOException, InterruptedException {
        int d = m1235d();
        if (d == -1) {
            return -1;
        }
        C0147a c0147a = this.f1041p[d];
        aep aep = c0147a.f1025c;
        int i = c0147a.f1026d;
        long j = c0147a.f1024b.f1076b[i];
        long c = (j - aeh.mo120c()) + ((long) this.f1038m);
        if (c < 0 || c >= 262144) {
            aem.f853a = j;
            return 1;
        }
        aeh.mo117b((int) c);
        this.f1037l = c0147a.f1024b.f1077c[i];
        int i2;
        if (c0147a.f1023a.f1058o != -1) {
            byte[] bArr = this.f1029c.f1493a;
            bArr[0] = (byte) 0;
            bArr[1] = (byte) 0;
            bArr[2] = (byte) 0;
            i2 = c0147a.f1023a.f1058o;
            int i3 = 4 - c0147a.f1023a.f1058o;
            while (this.f1038m < this.f1037l) {
                if (this.f1039n == 0) {
                    aeh.mo118b(this.f1029c.f1493a, i3, i2);
                    this.f1029c.m1564b(0);
                    this.f1039n = this.f1029c.m1579o();
                    this.f1028b.m1564b(0);
                    aep.mo127a(this.f1028b, 4);
                    this.f1038m += 4;
                    this.f1037l += i3;
                } else {
                    int a = aep.mo124a(aeh, this.f1039n, false);
                    this.f1038m += a;
                    this.f1039n -= a;
                }
            }
        } else {
            while (this.f1038m < this.f1037l) {
                i2 = aep.mo124a(aeh, this.f1037l - this.f1038m, false);
                this.f1038m += i2;
                this.f1039n -= i2;
            }
        }
        aep.mo125a(c0147a.f1024b.f1079e[i], c0147a.f1024b.f1080f[i], this.f1037l, 0, null);
        c0147a.f1026d++;
        this.f1038m = 0;
        this.f1039n = 0;
        return 0;
    }

    /* renamed from: d */
    private int m1235d() {
        int i = -1;
        long j = Clock.MAX_TIME;
        for (int i2 = 0; i2 < this.f1041p.length; i2++) {
            C0147a c0147a = this.f1041p[i2];
            int i3 = c0147a.f1026d;
            if (i3 != c0147a.f1024b.f1075a) {
                long j2 = c0147a.f1024b.f1076b[i3];
                if (j2 < j) {
                    j = j2;
                    i = i2;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m1228a(int i) {
        return i == afa.f947N || i == afa.f985z || i == afa.f948O || i == afa.f949P || i == afa.ag || i == afa.ah || i == afa.ai || i == afa.f946M || i == afa.aj || i == afa.ak || i == afa.al || i == afa.am || i == afa.f944K || i == afa.f960a || i == afa.at;
    }

    /* renamed from: b */
    private static boolean m1230b(int i) {
        return i == afa.f984y || i == afa.f934A || i == afa.f935B || i == afa.f936C || i == afa.f937D || i == afa.f945L || i == afa.as;
    }
}

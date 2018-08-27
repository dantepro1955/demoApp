package com.p000;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: Mp3Extractor */
/* renamed from: aex */
public final class aex implements aeg {
    /* renamed from: a */
    private static final int f910a = ahr.m1606c("Xing");
    /* renamed from: b */
    private static final int f911b = ahr.m1606c("Info");
    /* renamed from: c */
    private static final int f912c = ahr.m1606c("VBRI");
    /* renamed from: d */
    private final long f913d;
    /* renamed from: e */
    private final ahk f914e;
    /* renamed from: f */
    private final ahh f915f;
    /* renamed from: g */
    private aei f916g;
    /* renamed from: h */
    private aep f917h;
    /* renamed from: i */
    private int f918i;
    /* renamed from: j */
    private ael f919j;
    /* renamed from: k */
    private C0139a f920k;
    /* renamed from: l */
    private long f921l;
    /* renamed from: m */
    private int f922m;
    /* renamed from: n */
    private int f923n;

    /* compiled from: Mp3Extractor */
    /* renamed from: aex$a */
    interface C0139a extends aeo {
        /* renamed from: a */
        long mo157a(long j);

        /* renamed from: b */
        long mo158b();
    }

    public aex() {
        this(-1);
    }

    public aex(long j) {
        this.f913d = j;
        this.f914e = new ahk(4);
        this.f915f = new ahh();
        this.f921l = -1;
    }

    /* renamed from: a */
    public boolean mo155a(aeh aeh) throws IOException, InterruptedException {
        return m1147a(aeh, true);
    }

    /* renamed from: a */
    public void mo154a(aei aei) {
        this.f916g = aei;
        this.f917h = aei.mo148d(0);
        aei.mo150f();
    }

    /* renamed from: b */
    public void mo156b() {
        this.f918i = 0;
        this.f922m = 0;
        this.f921l = -1;
        this.f923n = 0;
    }

    /* renamed from: a */
    public int mo153a(aeh aeh, aem aem) throws IOException, InterruptedException {
        if (this.f918i == 0 && !m1150d(aeh)) {
            return -1;
        }
        if (this.f920k == null) {
            m1151e(aeh);
            this.f916g.mo136a(this.f920k);
            ado a = ado.m816a(null, this.f915f.f1479b, -1, 4096, this.f920k.mo158b(), this.f915f.f1482e, this.f915f.f1481d, null, null);
            if (this.f919j != null) {
                a = a.m823a(this.f919j.f851a, this.f919j.f852b);
            }
            this.f917h.mo126a(a);
        }
        return m1148b(aeh);
    }

    /* renamed from: b */
    private int m1148b(aeh aeh) throws IOException, InterruptedException {
        if (this.f923n == 0) {
            if (!m1149c(aeh)) {
                return -1;
            }
            if (this.f921l == -1) {
                this.f921l = this.f920k.mo157a(aeh.mo120c());
                if (this.f913d != -1) {
                    long a = this.f920k.mo157a(0);
                    this.f921l = (this.f913d - a) + this.f921l;
                }
            }
            this.f923n = this.f915f.f1480c;
        }
        int a2 = this.f917h.mo124a(aeh, this.f923n, true);
        if (a2 == -1) {
            return -1;
        }
        this.f923n -= a2;
        if (this.f923n > 0) {
            return 0;
        }
        this.f917h.mo125a(((((long) this.f922m) * 1000000) / ((long) this.f915f.f1481d)) + this.f921l, 1, this.f915f.f1480c, 0, null);
        this.f922m += this.f915f.f1484g;
        this.f923n = 0;
        return 0;
    }

    /* renamed from: c */
    private boolean m1149c(aeh aeh) throws IOException, InterruptedException {
        aeh.mo114a();
        if (!aeh.mo119b(this.f914e.f1493a, 0, 4, true)) {
            return false;
        }
        this.f914e.m1564b(0);
        int k = this.f914e.m1575k();
        if ((k & -128000) != (this.f918i & -128000) || ahh.m1534a(k) == -1) {
            this.f918i = 0;
            aeh.mo117b(1);
            return m1150d(aeh);
        }
        ahh.m1536a(k, this.f915f);
        return true;
    }

    /* renamed from: d */
    private boolean m1150d(aeh aeh) throws IOException, InterruptedException {
        boolean z = false;
        try {
            z = m1147a(aeh, false);
        } catch (EOFException e) {
        }
        return z;
    }

    /* renamed from: a */
    private boolean m1147a(aeh aeh, boolean z) throws IOException, InterruptedException {
        int b;
        int i;
        int i2;
        int i3;
        int i4;
        aeh.mo114a();
        if (aeh.mo120c() == 0) {
            this.f919j = aew.m1139a(aeh);
            b = (int) aeh.mo116b();
            if (!z) {
                aeh.mo117b(b);
            }
            i = b;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        while (true) {
            if (z && i4 == 4096) {
                return false;
            }
            if (!z && i4 == 131072) {
                throw new adq("Searched too many bytes.");
            } else if (!aeh.mo119b(this.f914e.f1493a, 0, 4, true)) {
                return false;
            } else {
                boolean z2;
                boolean z3;
                this.f914e.m1564b(0);
                b = this.f914e.m1575k();
                if (i2 == 0 || (b & -128000) == (i2 & -128000)) {
                    int a = ahh.m1534a(b);
                    if (a != -1) {
                        z2 = i3 + 1;
                        if (z2) {
                            ahh.m1536a(b, this.f915f);
                        } else if (z2) {
                            break;
                        } else {
                            b = i2;
                        }
                        aeh.mo121c(a - 4);
                        z3 = z2;
                        i3 = i4;
                        i4 = i3;
                        z2 = z3;
                        i2 = b;
                    }
                }
                b = i4 + 1;
                if (z) {
                    aeh.mo114a();
                    aeh.mo121c(i + b);
                    z3 = false;
                    i3 = b;
                    b = 0;
                } else {
                    aeh.mo117b(1);
                    z3 = false;
                    i3 = b;
                    b = 0;
                }
                i4 = i3;
                z2 = z3;
                i2 = b;
            }
        }
        if (z) {
            aeh.mo117b(i + i4);
        } else {
            aeh.mo114a();
        }
        this.f918i = i2;
        return true;
    }

    /* renamed from: e */
    private void m1151e(aeh aeh) throws IOException, InterruptedException {
        int i = 21;
        ahk ahk = new ahk(this.f915f.f1480c);
        aeh.mo122c(ahk.f1493a, 0, this.f915f.f1480c);
        long c = aeh.mo120c();
        long d = aeh.mo123d();
        if ((this.f915f.f1478a & 1) != 0) {
            if (this.f915f.f1482e != 1) {
                i = 36;
            }
        } else if (this.f915f.f1482e == 1) {
            i = 13;
        }
        ahk.m1564b(i);
        int k = ahk.m1575k();
        if (k == f910a || k == f911b) {
            this.f920k = aez.m1162a(this.f915f, ahk, c, d);
            if (this.f920k != null && this.f919j == null) {
                aeh.mo114a();
                aeh.mo121c(i + 141);
                aeh.mo122c(this.f914e.f1493a, 0, 3);
                this.f914e.m1564b(0);
                this.f919j = ael.m1077a(this.f914e.m1573i());
            }
            aeh.mo117b(this.f915f.f1480c);
        } else {
            ahk.m1564b(36);
            if (ahk.m1575k() == f912c) {
                this.f920k = aey.m1156a(this.f915f, ahk, c, d);
                aeh.mo117b(this.f915f.f1480c);
            }
        }
        if (this.f920k == null) {
            aeh.mo114a();
            aeh.mo122c(this.f914e.f1493a, 0, 4);
            this.f914e.m1564b(0);
            ahh.m1536a(this.f914e.m1575k(), this.f915f);
            this.f920k = new aev(aeh.mo120c(), this.f915f.f1483f, d);
        }
    }
}

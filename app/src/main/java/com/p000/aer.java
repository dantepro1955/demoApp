package com.p000;

import java.io.IOException;

/* compiled from: FlvExtractor */
/* renamed from: aer */
public final class aer implements aeg, aeo {
    /* renamed from: d */
    private static final int f881d = ahr.m1606c("FLV");
    /* renamed from: a */
    public int f882a;
    /* renamed from: b */
    public int f883b;
    /* renamed from: c */
    public long f884c;
    /* renamed from: e */
    private final ahk f885e = new ahk(4);
    /* renamed from: g */
    private final ahk f886g = new ahk(9);
    /* renamed from: h */
    private final ahk f887h = new ahk(11);
    /* renamed from: i */
    private final ahk f888i = new ahk();
    /* renamed from: j */
    private aei f889j;
    /* renamed from: k */
    private int f890k = 1;
    /* renamed from: l */
    private int f891l;
    /* renamed from: m */
    private aeq f892m;
    /* renamed from: n */
    private aeu f893n;
    /* renamed from: o */
    private aes f894o;

    /* renamed from: a */
    public boolean mo155a(aeh aeh) throws IOException, InterruptedException {
        aeh.mo122c(this.f885e.f1493a, 0, 3);
        this.f885e.m1564b(0);
        if (this.f885e.m1573i() != f881d) {
            return false;
        }
        aeh.mo122c(this.f885e.f1493a, 0, 2);
        this.f885e.m1564b(0);
        if ((this.f885e.m1571g() & 250) != 0) {
            return false;
        }
        aeh.mo122c(this.f885e.f1493a, 0, 4);
        this.f885e.m1564b(0);
        int k = this.f885e.m1575k();
        aeh.mo114a();
        aeh.mo121c(k);
        aeh.mo122c(this.f885e.f1493a, 0, 4);
        this.f885e.m1564b(0);
        if (this.f885e.m1575k() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo154a(aei aei) {
        this.f889j = aei;
    }

    /* renamed from: b */
    public void mo156b() {
        this.f890k = 1;
        this.f891l = 0;
    }

    /* renamed from: a */
    public int mo153a(aeh aeh, aem aem) throws IOException, InterruptedException {
        while (true) {
            switch (this.f890k) {
                case 1:
                    if (m1108b(aeh)) {
                        break;
                    }
                    return -1;
                case 2:
                    m1109c(aeh);
                    break;
                case 3:
                    if (m1110d(aeh)) {
                        break;
                    }
                    return -1;
                case 4:
                    if (!m1111e(aeh)) {
                        break;
                    }
                    return 0;
                default:
                    break;
            }
        }
    }

    /* renamed from: b */
    private boolean m1108b(aeh aeh) throws IOException, InterruptedException {
        boolean z = false;
        if (!aeh.mo115a(this.f886g.f1493a, 0, 9, true)) {
            return false;
        }
        this.f886g.m1564b(0);
        this.f886g.m1566c(4);
        int f = this.f886g.m1570f();
        boolean z2 = (f & 4) != 0;
        if ((f & 1) != 0) {
            z = true;
        }
        if (z2 && this.f892m == null) {
            this.f892m = new aeq(this.f889j.mo148d(8));
        }
        if (z && this.f893n == null) {
            this.f893n = new aeu(this.f889j.mo148d(9));
        }
        if (this.f894o == null) {
            this.f894o = new aes(null);
        }
        this.f889j.mo150f();
        this.f889j.mo136a((aeo) this);
        this.f891l = (this.f886g.m1575k() - 9) + 4;
        this.f890k = 2;
        return true;
    }

    /* renamed from: c */
    private void m1109c(aeh aeh) throws IOException, InterruptedException {
        aeh.mo117b(this.f891l);
        this.f891l = 0;
        this.f890k = 3;
    }

    /* renamed from: d */
    private boolean m1110d(aeh aeh) throws IOException, InterruptedException {
        if (!aeh.mo115a(this.f887h.f1493a, 0, 11, true)) {
            return false;
        }
        this.f887h.m1564b(0);
        this.f882a = this.f887h.m1570f();
        this.f883b = this.f887h.m1573i();
        this.f884c = (long) this.f887h.m1573i();
        this.f884c = (((long) (this.f887h.m1570f() << 24)) | this.f884c) * 1000;
        this.f887h.m1566c(3);
        this.f890k = 4;
        return true;
    }

    /* renamed from: e */
    private boolean m1111e(aeh aeh) throws IOException, InterruptedException {
        boolean z = true;
        if (this.f882a == 8 && this.f892m != null) {
            this.f892m.m1105b(m1112f(aeh), this.f884c);
        } else if (this.f882a == 9 && this.f893n != null) {
            this.f893n.m1105b(m1112f(aeh), this.f884c);
        } else if (this.f882a != 18 || this.f894o == null) {
            aeh.mo117b(this.f883b);
            z = false;
        } else {
            this.f894o.m1105b(m1112f(aeh), this.f884c);
            if (this.f894o.m1101a() != -1) {
                if (this.f892m != null) {
                    this.f892m.m1102a(this.f894o.m1101a());
                }
                if (this.f893n != null) {
                    this.f893n.m1102a(this.f894o.m1101a());
                }
            }
        }
        this.f891l = 4;
        this.f890k = 2;
        return z;
    }

    /* renamed from: f */
    private ahk m1112f(aeh aeh) throws IOException, InterruptedException {
        if (this.f883b > this.f888i.m1569e()) {
            this.f888i.m1561a(new byte[Math.max(this.f888i.m1569e() * 2, this.f883b)], 0);
        } else {
            this.f888i.m1564b(0);
        }
        this.f888i.m1559a(this.f883b);
        aeh.mo118b(this.f888i.f1493a, 0, this.f883b);
        return this.f888i;
    }

    /* renamed from: a */
    public boolean mo110a() {
        return false;
    }

    /* renamed from: b */
    public long mo111b(long j) {
        return 0;
    }
}

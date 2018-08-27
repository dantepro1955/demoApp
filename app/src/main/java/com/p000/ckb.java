package com.p000;

import com.ninegag.android.app.model.api.ApiGag;
import java.util.ArrayList;
import java.util.Iterator;

@Deprecated
/* compiled from: Gag */
/* renamed from: ckb */
public class ckb extends cjv {
    /* renamed from: N */
    private static caf f9477N = caf.m12046a();
    /* renamed from: A */
    public String f9478A;
    /* renamed from: B */
    public ckr f9479B;
    /* renamed from: C */
    public ArrayList<cke> f9480C;
    /* renamed from: D */
    public ckh f9481D;
    /* renamed from: E */
    public long f9482E;
    /* renamed from: F */
    public String f9483F;
    /* renamed from: G */
    public String f9484G;
    /* renamed from: H */
    public int f9485H;
    /* renamed from: I */
    public int f9486I;
    /* renamed from: J */
    public int f9487J;
    /* renamed from: K */
    public int f9488K;
    /* renamed from: L */
    private cke f9489L;
    /* renamed from: M */
    private cke f9490M;
    /* renamed from: O */
    private cac f9491O = cac.m12016a();
    /* renamed from: b */
    public String f9492b;
    /* renamed from: c */
    public String f9493c;
    /* renamed from: d */
    public String f9494d;
    /* renamed from: e */
    public String f9495e;
    /* renamed from: f */
    public String f9496f;
    /* renamed from: g */
    public String f9497g;
    /* renamed from: h */
    public String f9498h;
    /* renamed from: i */
    public int f9499i;
    /* renamed from: j */
    public int f9500j;
    /* renamed from: k */
    public int f9501k;
    /* renamed from: l */
    public int f9502l;
    /* renamed from: m */
    public int f9503m;
    /* renamed from: n */
    public int f9504n;
    /* renamed from: o */
    public int f9505o;
    /* renamed from: p */
    public int f9506p;
    /* renamed from: q */
    public int f9507q;
    /* renamed from: r */
    public int f9508r;
    /* renamed from: s */
    public long f9509s;
    /* renamed from: t */
    public String f9510t;
    /* renamed from: u */
    public String f9511u;
    /* renamed from: v */
    public String f9512v;
    /* renamed from: w */
    public String f9513w;
    /* renamed from: x */
    public String f9514x;
    /* renamed from: y */
    public String f9515y;
    /* renamed from: z */
    public String f9516z;

    public ckb(boolean z) {
        if (z) {
            this.f9480C = new ArrayList();
            this.f9479B = new ckr();
        }
    }

    /* renamed from: a */
    public String m14149a() {
        if (this.f9506p == 1) {
            return m14150b();
        }
        return m14151c();
    }

    /* renamed from: b */
    public String m14150b() {
        return this.f9484G;
    }

    /* renamed from: c */
    public String m14151c() {
        return this.f9483F;
    }

    /* renamed from: d */
    public cke m14152d() {
        if (this.f9490M != null) {
            return this.f9490M;
        }
        this.f9490M = m14148a(5);
        return this.f9490M;
    }

    /* renamed from: e */
    public String m14153e() {
        cke d = m14152d();
        if (d != null) {
            return d.f9525h;
        }
        return null;
    }

    /* renamed from: f */
    public int m14154f() {
        cke d = m14152d();
        if (d == null) {
            return 0;
        }
        return d.f9519b;
    }

    /* renamed from: g */
    public int m14155g() {
        cke d = m14152d();
        if (d == null) {
            return 0;
        }
        return d.f9520c;
    }

    /* renamed from: h */
    public int m14156h() {
        cke k = m14159k();
        if (k == null) {
            return 0;
        }
        return k.f9519b;
    }

    /* renamed from: i */
    public int m14157i() {
        cke k = m14159k();
        if (k == null) {
            return 0;
        }
        return k.f9520c;
    }

    /* renamed from: j */
    public String m14158j() {
        cke k = m14159k();
        if (k != null) {
            return k.f9525h;
        }
        return null;
    }

    /* renamed from: k */
    public cke m14159k() {
        if (this.f9489L != null) {
            return this.f9489L;
        }
        if (m14160l()) {
            this.f9489L = m14148a(4);
        } else {
            int i;
            if (this.f9491O.f8408e == 700) {
                i = 1;
            } else {
                i = 0;
            }
            if (i != 0) {
                this.f9489L = m14148a(1);
            } else {
                this.f9489L = m14148a(0);
            }
        }
        return this.f9489L;
    }

    /* renamed from: a */
    private cke m14148a(int i) {
        Iterator it = this.f9480C.iterator();
        while (it.hasNext()) {
            cke cke = (cke) it.next();
            if (cke.f9521d == i) {
                return cke;
            }
        }
        return null;
    }

    /* renamed from: l */
    public boolean m14160l() {
        if (this.f9495e == null) {
            return false;
        }
        return this.f9495e.equals(ApiGag.TYPE_VIDEO);
    }

    /* renamed from: m */
    public boolean m14161m() {
        if (this.f9495e == null) {
            return false;
        }
        return this.f9495e.equals(ApiGag.TYPE_ANIMATED);
    }
}

package com.p000;

import android.support.v7.widget.RecyclerView.C0588e.C0587c;
import android.support.v7.widget.RecyclerView.C0605t;
import p000.hq.C3584a;
import p000.hq.C3585b;

/* compiled from: ViewInfoStore */
/* renamed from: qj */
public class qj {
    /* renamed from: a */
    final hh<C0605t, C5688a> f25237a = new hh();
    /* renamed from: b */
    final hm<C0605t> f25238b = new hm();

    /* compiled from: ViewInfoStore */
    /* renamed from: qj$a */
    static class C5688a {
        /* renamed from: d */
        static C3584a<C5688a> f25233d = new C3585b(20);
        /* renamed from: a */
        int f25234a;
        /* renamed from: b */
        C0587c f25235b;
        /* renamed from: c */
        C0587c f25236c;

        private C5688a() {
        }

        /* renamed from: a */
        static C5688a m33856a() {
            C5688a c5688a = (C5688a) f25233d.a();
            return c5688a == null ? new C5688a() : c5688a;
        }

        /* renamed from: a */
        static void m33857a(C5688a c5688a) {
            c5688a.f25234a = 0;
            c5688a.f25235b = null;
            c5688a.f25236c = null;
            f25233d.a(c5688a);
        }

        /* renamed from: b */
        static void m33858b() {
            do {
            } while (f25233d.a() != null);
        }
    }

    /* compiled from: ViewInfoStore */
    /* renamed from: qj$b */
    public interface C5689b {
        /* renamed from: a */
        void m33859a(C0605t c0605t);

        /* renamed from: a */
        void m33860a(C0605t c0605t, C0587c c0587c, C0587c c0587c2);

        /* renamed from: b */
        void m33861b(C0605t c0605t, C0587c c0587c, C0587c c0587c2);

        /* renamed from: c */
        void m33862c(C0605t c0605t, C0587c c0587c, C0587c c0587c2);
    }

    /* renamed from: a */
    public void m33865a() {
        this.f25237a.clear();
        this.f25238b.m30597c();
    }

    /* renamed from: a */
    public void m33867a(C0605t c0605t, C0587c c0587c) {
        C5688a c5688a = (C5688a) this.f25237a.get(c0605t);
        if (c5688a == null) {
            c5688a = C5688a.m33856a();
            this.f25237a.put(c0605t, c5688a);
        }
        c5688a.f25235b = c0587c;
        c5688a.f25234a |= 4;
    }

    /* renamed from: a */
    public boolean m33869a(C0605t c0605t) {
        C5688a c5688a = (C5688a) this.f25237a.get(c0605t);
        return (c5688a == null || (c5688a.f25234a & 1) == 0) ? false : true;
    }

    /* renamed from: b */
    public C0587c m33870b(C0605t c0605t) {
        return m33863a(c0605t, 4);
    }

    /* renamed from: c */
    public C0587c m33873c(C0605t c0605t) {
        return m33863a(c0605t, 8);
    }

    /* renamed from: a */
    private C0587c m33863a(C0605t c0605t, int i) {
        C0587c c0587c = null;
        int a = this.f25237a.m30550a((Object) c0605t);
        if (a >= 0) {
            C5688a c5688a = (C5688a) this.f25237a.m30557c(a);
            if (!(c5688a == null || (c5688a.f25234a & i) == 0)) {
                c5688a.f25234a &= i ^ -1;
                if (i == 4) {
                    c0587c = c5688a.f25235b;
                } else if (i == 8) {
                    c0587c = c5688a.f25236c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((c5688a.f25234a & 12) == 0) {
                    this.f25237a.m30558d(a);
                    C5688a.m33857a(c5688a);
                }
            }
        }
        return c0587c;
    }

    /* renamed from: a */
    public void m33866a(long j, C0605t c0605t) {
        this.f25238b.m30595b(j, c0605t);
    }

    /* renamed from: b */
    public void m33872b(C0605t c0605t, C0587c c0587c) {
        C5688a c5688a = (C5688a) this.f25237a.get(c0605t);
        if (c5688a == null) {
            c5688a = C5688a.m33856a();
            this.f25237a.put(c0605t, c5688a);
        }
        c5688a.f25234a |= 2;
        c5688a.f25235b = c0587c;
    }

    /* renamed from: d */
    public boolean m33875d(C0605t c0605t) {
        C5688a c5688a = (C5688a) this.f25237a.get(c0605t);
        return (c5688a == null || (c5688a.f25234a & 4) == 0) ? false : true;
    }

    /* renamed from: a */
    public C0605t m33864a(long j) {
        return (C0605t) this.f25238b.m30589a(j);
    }

    /* renamed from: c */
    public void m33874c(C0605t c0605t, C0587c c0587c) {
        C5688a c5688a = (C5688a) this.f25237a.get(c0605t);
        if (c5688a == null) {
            c5688a = C5688a.m33856a();
            this.f25237a.put(c0605t, c5688a);
        }
        c5688a.f25236c = c0587c;
        c5688a.f25234a |= 8;
    }

    /* renamed from: e */
    public void m33876e(C0605t c0605t) {
        C5688a c5688a = (C5688a) this.f25237a.get(c0605t);
        if (c5688a == null) {
            c5688a = C5688a.m33856a();
            this.f25237a.put(c0605t, c5688a);
        }
        r0.f25234a |= 1;
    }

    /* renamed from: f */
    public void m33877f(C0605t c0605t) {
        C5688a c5688a = (C5688a) this.f25237a.get(c0605t);
        if (c5688a != null) {
            c5688a.f25234a &= -2;
        }
    }

    /* renamed from: a */
    public void m33868a(C5689b c5689b) {
        for (int size = this.f25237a.size() - 1; size >= 0; size--) {
            C0605t c0605t = (C0605t) this.f25237a.m30556b(size);
            C5688a c5688a = (C5688a) this.f25237a.m30558d(size);
            if ((c5688a.f25234a & 3) == 3) {
                c5689b.m33859a(c0605t);
            } else if ((c5688a.f25234a & 1) != 0) {
                if (c5688a.f25235b == null) {
                    c5689b.m33859a(c0605t);
                } else {
                    c5689b.m33860a(c0605t, c5688a.f25235b, c5688a.f25236c);
                }
            } else if ((c5688a.f25234a & 14) == 14) {
                c5689b.m33861b(c0605t, c5688a.f25235b, c5688a.f25236c);
            } else if ((c5688a.f25234a & 12) == 12) {
                c5689b.m33862c(c0605t, c5688a.f25235b, c5688a.f25236c);
            } else if ((c5688a.f25234a & 4) != 0) {
                c5689b.m33860a(c0605t, c5688a.f25235b, null);
            } else if ((c5688a.f25234a & 8) != 0) {
                c5689b.m33861b(c0605t, c5688a.f25235b, c5688a.f25236c);
            } else if ((c5688a.f25234a & 2) != 0) {
            }
            C5688a.m33857a(c5688a);
        }
    }

    /* renamed from: g */
    public void m33878g(C0605t c0605t) {
        for (int b = this.f25238b.m30592b() - 1; b >= 0; b--) {
            if (c0605t == this.f25238b.m30596c(b)) {
                this.f25238b.m30591a(b);
                break;
            }
        }
        C5688a c5688a = (C5688a) this.f25237a.remove(c0605t);
        if (c5688a != null) {
            C5688a.m33857a(c5688a);
        }
    }

    /* renamed from: b */
    public void m33871b() {
        C5688a.m33858b();
    }

    /* renamed from: h */
    public void m33879h(C0605t c0605t) {
        m33877f(c0605t);
    }
}

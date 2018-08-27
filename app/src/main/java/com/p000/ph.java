package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator */
/* renamed from: ph */
public class ph extends py {
    /* renamed from: a */
    ArrayList<ArrayList<C0605t>> f25060a = new ArrayList();
    /* renamed from: b */
    ArrayList<ArrayList<C5671b>> f25061b = new ArrayList();
    /* renamed from: c */
    ArrayList<ArrayList<C5670a>> f25062c = new ArrayList();
    /* renamed from: d */
    ArrayList<C0605t> f25063d = new ArrayList();
    /* renamed from: e */
    ArrayList<C0605t> f25064e = new ArrayList();
    /* renamed from: f */
    ArrayList<C0605t> f25065f = new ArrayList();
    /* renamed from: g */
    ArrayList<C0605t> f25066g = new ArrayList();
    /* renamed from: i */
    private ArrayList<C0605t> f25067i = new ArrayList();
    /* renamed from: j */
    private ArrayList<C0605t> f25068j = new ArrayList();
    /* renamed from: k */
    private ArrayList<C5671b> f25069k = new ArrayList();
    /* renamed from: l */
    private ArrayList<C5670a> f25070l = new ArrayList();

    /* compiled from: DefaultItemAnimator */
    /* renamed from: ph$c */
    static class C5664c implements jy {
        C5664c() {
        }

        /* renamed from: a */
        public void mo3877a(View view) {
        }

        /* renamed from: b */
        public void mo3878b(View view) {
        }

        /* renamed from: c */
        public void mo3879c(View view) {
        }
    }

    /* compiled from: DefaultItemAnimator */
    /* renamed from: ph$a */
    static class C5670a {
        /* renamed from: a */
        public C0605t f25048a;
        /* renamed from: b */
        public C0605t f25049b;
        /* renamed from: c */
        public int f25050c;
        /* renamed from: d */
        public int f25051d;
        /* renamed from: e */
        public int f25052e;
        /* renamed from: f */
        public int f25053f;

        private C5670a(C0605t c0605t, C0605t c0605t2) {
            this.f25048a = c0605t;
            this.f25049b = c0605t2;
        }

        C5670a(C0605t c0605t, C0605t c0605t2, int i, int i2, int i3, int i4) {
            this(c0605t, c0605t2);
            this.f25050c = i;
            this.f25051d = i2;
            this.f25052e = i3;
            this.f25053f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f25048a + ", newHolder=" + this.f25049b + ", fromX=" + this.f25050c + ", fromY=" + this.f25051d + ", toX=" + this.f25052e + ", toY=" + this.f25053f + '}';
        }
    }

    /* compiled from: DefaultItemAnimator */
    /* renamed from: ph$b */
    static class C5671b {
        /* renamed from: a */
        public C0605t f25054a;
        /* renamed from: b */
        public int f25055b;
        /* renamed from: c */
        public int f25056c;
        /* renamed from: d */
        public int f25057d;
        /* renamed from: e */
        public int f25058e;

        C5671b(C0605t c0605t, int i, int i2, int i3, int i4) {
            this.f25054a = c0605t;
            this.f25055b = i;
            this.f25056c = i2;
            this.f25057d = i3;
            this.f25058e = i4;
        }
    }

    /* renamed from: a */
    public void m33585a() {
        int i;
        int i2;
        int i3;
        int i4 = !this.f25067i.isEmpty() ? 1 : 0;
        if (this.f25069k.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        if (this.f25070l.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (this.f25068j.isEmpty()) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (i4 != 0 || i != 0 || i3 != 0 || i2 != 0) {
            final ArrayList arrayList;
            Runnable c56611;
            Iterator it = this.f25067i.iterator();
            while (it.hasNext()) {
                m33583u((C0605t) it.next());
            }
            this.f25067i.clear();
            if (i != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.f25069k);
                this.f25061b.add(arrayList);
                this.f25069k.clear();
                c56611 = new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ ph f25025b;

                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C5671b c5671b = (C5671b) it.next();
                            this.f25025b.m33592b(c5671b.f25054a, c5671b.f25055b, c5671b.f25056c, c5671b.f25057d, c5671b.f25058e);
                        }
                        arrayList.clear();
                        this.f25025b.f25061b.remove(arrayList);
                    }
                };
                if (i4 != 0) {
                    jd.a(((C5671b) arrayList.get(0)).f25054a.itemView, c56611, g());
                } else {
                    c56611.run();
                }
            }
            if (i2 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.f25070l);
                this.f25062c.add(arrayList);
                this.f25070l.clear();
                c56611 = new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ ph f25027b;

                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            this.f25027b.m33587a((C5670a) it.next());
                        }
                        arrayList.clear();
                        this.f25027b.f25062c.remove(arrayList);
                    }
                };
                if (i4 != 0) {
                    jd.a(((C5670a) arrayList.get(0)).f25048a.itemView, c56611, g());
                } else {
                    c56611.run();
                }
            }
            if (i3 != 0) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f25068j);
                this.f25060a.add(arrayList2);
                this.f25068j.clear();
                Runnable c56633 = new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ ph f25029b;

                    public void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            this.f25029b.m33596c((C0605t) it.next());
                        }
                        arrayList2.clear();
                        this.f25029b.f25060a.remove(arrayList2);
                    }
                };
                if (i4 == 0 && i == 0 && i2 == 0) {
                    c56633.run();
                    return;
                }
                long e;
                long h;
                long g = i4 != 0 ? g() : 0;
                if (i != 0) {
                    e = e();
                } else {
                    e = 0;
                }
                if (i2 != 0) {
                    h = h();
                } else {
                    h = 0;
                }
                jd.a(((C0605t) arrayList2.get(0)).itemView, c56633, g + Math.max(e, h));
            }
        }
    }

    /* renamed from: a */
    public boolean mo5431a(C0605t c0605t) {
        m33584v(c0605t);
        this.f25067i.add(c0605t);
        return true;
    }

    /* renamed from: u */
    private void m33583u(final C0605t c0605t) {
        final ju r = jd.r(c0605t.itemView);
        this.f25065f.add(c0605t);
        r.m31853a(g()).m31852a(0.0f).m31855a(new C5664c(this) {
            /* renamed from: c */
            final /* synthetic */ ph f25032c;

            /* renamed from: a */
            public void mo3877a(View view) {
                this.f25032c.m33571l(c0605t);
            }

            /* renamed from: b */
            public void mo3878b(View view) {
                r.m31855a(null);
                jd.c(view, 1.0f);
                this.f25032c.m33568i(c0605t);
                this.f25032c.f25065f.remove(c0605t);
                this.f25032c.m33595c();
            }
        }).m31861c();
    }

    /* renamed from: b */
    public boolean mo5434b(C0605t c0605t) {
        m33584v(c0605t);
        jd.c(c0605t.itemView, 0.0f);
        this.f25068j.add(c0605t);
        return true;
    }

    /* renamed from: c */
    void m33596c(final C0605t c0605t) {
        final ju r = jd.r(c0605t.itemView);
        this.f25063d.add(c0605t);
        r.m31852a(1.0f).m31853a(f()).m31855a(new C5664c(this) {
            /* renamed from: c */
            final /* synthetic */ ph f25035c;

            /* renamed from: a */
            public void mo3877a(View view) {
                this.f25035c.m33573n(c0605t);
            }

            /* renamed from: c */
            public void mo3879c(View view) {
                jd.c(view, 1.0f);
            }

            /* renamed from: b */
            public void mo3878b(View view) {
                r.m31855a(null);
                this.f25035c.m33570k(c0605t);
                this.f25035c.f25063d.remove(c0605t);
                this.f25035c.m33595c();
            }
        }).m31861c();
    }

    /* renamed from: a */
    public boolean mo5432a(C0605t c0605t, int i, int i2, int i3, int i4) {
        View view = c0605t.itemView;
        int m = (int) (((float) i) + jd.m(c0605t.itemView));
        int n = (int) (((float) i2) + jd.n(c0605t.itemView));
        m33584v(c0605t);
        int i5 = i3 - m;
        int i6 = i4 - n;
        if (i5 == 0 && i6 == 0) {
            m33569j(c0605t);
            return false;
        }
        if (i5 != 0) {
            jd.a(view, (float) (-i5));
        }
        if (i6 != 0) {
            jd.b(view, (float) (-i6));
        }
        this.f25069k.add(new C5671b(c0605t, m, n, i3, i4));
        return true;
    }

    /* renamed from: b */
    void m33592b(C0605t c0605t, int i, int i2, int i3, int i4) {
        View view = c0605t.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            jd.r(view).m31857b(0.0f);
        }
        if (i6 != 0) {
            jd.r(view).m31860c(0.0f);
        }
        final ju r = jd.r(view);
        this.f25064e.add(c0605t);
        final C0605t c0605t2 = c0605t;
        r.m31853a(e()).m31855a(new C5664c(this) {
            /* renamed from: e */
            final /* synthetic */ ph f25040e;

            /* renamed from: a */
            public void mo3877a(View view) {
                this.f25040e.m33572m(c0605t2);
            }

            /* renamed from: c */
            public void mo3879c(View view) {
                if (i5 != 0) {
                    jd.a(view, 0.0f);
                }
                if (i6 != 0) {
                    jd.b(view, 0.0f);
                }
            }

            /* renamed from: b */
            public void mo3878b(View view) {
                r.m31855a(null);
                this.f25040e.m33569j(c0605t2);
                this.f25040e.f25064e.remove(c0605t2);
                this.f25040e.m33595c();
            }
        }).m31861c();
    }

    /* renamed from: a */
    public boolean mo5433a(C0605t c0605t, C0605t c0605t2, int i, int i2, int i3, int i4) {
        if (c0605t == c0605t2) {
            return mo5432a(c0605t, i, i2, i3, i4);
        }
        float m = jd.m(c0605t.itemView);
        float n = jd.n(c0605t.itemView);
        float e = jd.e(c0605t.itemView);
        m33584v(c0605t);
        int i5 = (int) (((float) (i3 - i)) - m);
        int i6 = (int) (((float) (i4 - i2)) - n);
        jd.a(c0605t.itemView, m);
        jd.b(c0605t.itemView, n);
        jd.c(c0605t.itemView, e);
        if (c0605t2 != null) {
            m33584v(c0605t2);
            jd.a(c0605t2.itemView, (float) (-i5));
            jd.b(c0605t2.itemView, (float) (-i6));
            jd.c(c0605t2.itemView, 0.0f);
        }
        this.f25070l.add(new C5670a(c0605t, c0605t2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: a */
    void m33587a(final C5670a c5670a) {
        View view = null;
        C0605t c0605t = c5670a.f25048a;
        View view2 = c0605t == null ? null : c0605t.itemView;
        C0605t c0605t2 = c5670a.f25049b;
        if (c0605t2 != null) {
            view = c0605t2.itemView;
        }
        if (view2 != null) {
            final ju a = jd.r(view2).m31853a(h());
            this.f25066g.add(c5670a.f25048a);
            a.m31857b((float) (c5670a.f25052e - c5670a.f25050c));
            a.m31860c((float) (c5670a.f25053f - c5670a.f25051d));
            a.m31852a(0.0f).m31855a(new C5664c(this) {
                /* renamed from: c */
                final /* synthetic */ ph f25043c;

                /* renamed from: a */
                public void mo3877a(View view) {
                    this.f25043c.m33561b(c5670a.f25048a, true);
                }

                /* renamed from: b */
                public void mo3878b(View view) {
                    a.m31855a(null);
                    jd.c(view, 1.0f);
                    jd.a(view, 0.0f);
                    jd.b(view, 0.0f);
                    this.f25043c.m33555a(c5670a.f25048a, true);
                    this.f25043c.f25066g.remove(c5670a.f25048a);
                    this.f25043c.m33595c();
                }
            }).m31861c();
        }
        if (view != null) {
            a = jd.r(view);
            this.f25066g.add(c5670a.f25049b);
            a.m31857b(0.0f).m31860c(0.0f).m31853a(h()).m31852a(1.0f).m31855a(new C5664c(this) {
                /* renamed from: d */
                final /* synthetic */ ph f25047d;

                /* renamed from: a */
                public void mo3877a(View view) {
                    this.f25047d.m33561b(c5670a.f25049b, false);
                }

                /* renamed from: b */
                public void mo3878b(View view) {
                    a.m31855a(null);
                    jd.c(view, 1.0f);
                    jd.a(view, 0.0f);
                    jd.b(view, 0.0f);
                    this.f25047d.m33555a(c5670a.f25049b, false);
                    this.f25047d.f25066g.remove(c5670a.f25049b);
                    this.f25047d.m33595c();
                }
            }).m31861c();
        }
    }

    /* renamed from: a */
    private void m33580a(List<C5670a> list, C0605t c0605t) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C5670a c5670a = (C5670a) list.get(size);
            if (m33581a(c5670a, c0605t) && c5670a.f25048a == null && c5670a.f25049b == null) {
                list.remove(c5670a);
            }
        }
    }

    /* renamed from: b */
    private void m33582b(C5670a c5670a) {
        if (c5670a.f25048a != null) {
            m33581a(c5670a, c5670a.f25048a);
        }
        if (c5670a.f25049b != null) {
            m33581a(c5670a, c5670a.f25049b);
        }
    }

    /* renamed from: a */
    private boolean m33581a(C5670a c5670a, C0605t c0605t) {
        boolean z = false;
        if (c5670a.f25049b == c0605t) {
            c5670a.f25049b = null;
        } else if (c5670a.f25048a != c0605t) {
            return false;
        } else {
            c5670a.f25048a = null;
            z = true;
        }
        jd.c(c0605t.itemView, 1.0f);
        jd.a(c0605t.itemView, 0.0f);
        jd.b(c0605t.itemView, 0.0f);
        m33555a(c0605t, z);
        return true;
    }

    /* renamed from: d */
    public void m33598d(C0605t c0605t) {
        int size;
        View view = c0605t.itemView;
        jd.r(view).m31859b();
        for (size = this.f25069k.size() - 1; size >= 0; size--) {
            if (((C5671b) this.f25069k.get(size)).f25054a == c0605t) {
                jd.b(view, 0.0f);
                jd.a(view, 0.0f);
                m33569j(c0605t);
                this.f25069k.remove(size);
            }
        }
        m33580a(this.f25070l, c0605t);
        if (this.f25067i.remove(c0605t)) {
            jd.c(view, 1.0f);
            m33568i(c0605t);
        }
        if (this.f25068j.remove(c0605t)) {
            jd.c(view, 1.0f);
            m33570k(c0605t);
        }
        for (size = this.f25062c.size() - 1; size >= 0; size--) {
            List list = (ArrayList) this.f25062c.get(size);
            m33580a(list, c0605t);
            if (list.isEmpty()) {
                this.f25062c.remove(size);
            }
        }
        for (int size2 = this.f25061b.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f25061b.get(size2);
            int size3 = arrayList.size() - 1;
            while (size3 >= 0) {
                if (((C5671b) arrayList.get(size3)).f25054a == c0605t) {
                    jd.b(view, 0.0f);
                    jd.a(view, 0.0f);
                    m33569j(c0605t);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.f25061b.remove(size2);
                    }
                } else {
                    size3--;
                }
            }
        }
        for (size = this.f25060a.size() - 1; size >= 0; size--) {
            arrayList = (ArrayList) this.f25060a.get(size);
            if (arrayList.remove(c0605t)) {
                jd.c(view, 1.0f);
                m33570k(c0605t);
                if (arrayList.isEmpty()) {
                    this.f25060a.remove(size);
                }
            }
        }
        if (this.f25065f.remove(c0605t)) {
        }
        if (this.f25063d.remove(c0605t)) {
        }
        if (this.f25066g.remove(c0605t)) {
        }
        if (this.f25064e.remove(c0605t)) {
            m33595c();
        } else {
            m33595c();
        }
    }

    /* renamed from: v */
    private void m33584v(C0605t c0605t) {
        cu.m24983a(c0605t.itemView);
        m33598d(c0605t);
    }

    /* renamed from: b */
    public boolean m33593b() {
        return (this.f25068j.isEmpty() && this.f25070l.isEmpty() && this.f25069k.isEmpty() && this.f25067i.isEmpty() && this.f25064e.isEmpty() && this.f25065f.isEmpty() && this.f25063d.isEmpty() && this.f25066g.isEmpty() && this.f25061b.isEmpty() && this.f25060a.isEmpty() && this.f25062c.isEmpty()) ? false : true;
    }

    /* renamed from: c */
    void m33595c() {
        if (!m33593b()) {
            i();
        }
    }

    /* renamed from: d */
    public void m33597d() {
        int size;
        for (size = this.f25069k.size() - 1; size >= 0; size--) {
            C5671b c5671b = (C5671b) this.f25069k.get(size);
            View view = c5671b.f25054a.itemView;
            jd.b(view, 0.0f);
            jd.a(view, 0.0f);
            m33569j(c5671b.f25054a);
            this.f25069k.remove(size);
        }
        for (size = this.f25067i.size() - 1; size >= 0; size--) {
            m33568i((C0605t) this.f25067i.get(size));
            this.f25067i.remove(size);
        }
        for (size = this.f25068j.size() - 1; size >= 0; size--) {
            C0605t c0605t = (C0605t) this.f25068j.get(size);
            jd.c(c0605t.itemView, 1.0f);
            m33570k(c0605t);
            this.f25068j.remove(size);
        }
        for (size = this.f25070l.size() - 1; size >= 0; size--) {
            m33582b((C5670a) this.f25070l.get(size));
        }
        this.f25070l.clear();
        if (m33593b()) {
            int size2;
            ArrayList arrayList;
            int size3;
            for (size2 = this.f25061b.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.f25061b.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    C5671b c5671b2 = (C5671b) arrayList.get(size3);
                    View view2 = c5671b2.f25054a.itemView;
                    jd.b(view2, 0.0f);
                    jd.a(view2, 0.0f);
                    m33569j(c5671b2.f25054a);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.f25061b.remove(arrayList);
                    }
                }
            }
            for (size2 = this.f25060a.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.f25060a.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    C0605t c0605t2 = (C0605t) arrayList.get(size3);
                    jd.c(c0605t2.itemView, 1.0f);
                    m33570k(c0605t2);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.f25060a.remove(arrayList);
                    }
                }
            }
            for (size2 = this.f25062c.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.f25062c.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    m33582b((C5670a) arrayList.get(size3));
                    if (arrayList.isEmpty()) {
                        this.f25062c.remove(arrayList);
                    }
                }
            }
            m33586a(this.f25065f);
            m33586a(this.f25064e);
            m33586a(this.f25063d);
            m33586a(this.f25066g);
            i();
        }
    }

    /* renamed from: a */
    void m33586a(List<C0605t> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            jd.r(((C0605t) list.get(size)).itemView).m31859b();
        }
    }

    /* renamed from: a */
    public boolean m33591a(C0605t c0605t, List<Object> list) {
        return !list.isEmpty() || super.a(c0605t, list);
    }
}

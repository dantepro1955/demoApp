package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChildHelper */
/* renamed from: pe */
public class pe {
    /* renamed from: a */
    final C5660b f25021a;
    /* renamed from: b */
    final C5659a f25022b = new C5659a();
    /* renamed from: c */
    final List<View> f25023c = new ArrayList();

    /* compiled from: ChildHelper */
    /* renamed from: pe$a */
    static class C5659a {
        /* renamed from: a */
        long f25019a = 0;
        /* renamed from: b */
        C5659a f25020b;

        C5659a() {
        }

        /* renamed from: a */
        void m33463a(int i) {
            if (i >= 64) {
                m33461b();
                this.f25020b.m33463a(i - 64);
                return;
            }
            this.f25019a |= 1 << i;
        }

        /* renamed from: b */
        private void m33461b() {
            if (this.f25020b == null) {
                this.f25020b = new C5659a();
            }
        }

        /* renamed from: b */
        void m33465b(int i) {
            if (i < 64) {
                this.f25019a &= (1 << i) ^ -1;
            } else if (this.f25020b != null) {
                this.f25020b.m33465b(i - 64);
            }
        }

        /* renamed from: c */
        boolean m33466c(int i) {
            if (i < 64) {
                return (this.f25019a & (1 << i)) != 0;
            } else {
                m33461b();
                return this.f25020b.m33466c(i - 64);
            }
        }

        /* renamed from: a */
        void m33462a() {
            this.f25019a = 0;
            if (this.f25020b != null) {
                this.f25020b.m33462a();
            }
        }

        /* renamed from: a */
        void m33464a(int i, boolean z) {
            if (i >= 64) {
                m33461b();
                this.f25020b.m33464a(i - 64, z);
                return;
            }
            boolean z2 = (this.f25019a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            this.f25019a = (((j ^ -1) & this.f25019a) << 1) | (this.f25019a & j);
            if (z) {
                m33463a(i);
            } else {
                m33465b(i);
            }
            if (z2 || this.f25020b != null) {
                m33461b();
                this.f25020b.m33464a(0, z2);
            }
        }

        /* renamed from: d */
        boolean m33467d(int i) {
            if (i >= 64) {
                m33461b();
                return this.f25020b.m33467d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f25019a & j) != 0;
            this.f25019a &= j ^ -1;
            j--;
            this.f25019a = Long.rotateRight((j ^ -1) & this.f25019a, 1) | (this.f25019a & j);
            if (this.f25020b == null) {
                return z;
            }
            if (this.f25020b.m33466c(0)) {
                m33463a(63);
            }
            this.f25020b.m33467d(0);
            return z;
        }

        /* renamed from: e */
        int m33468e(int i) {
            if (this.f25020b == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f25019a);
                }
                return Long.bitCount(this.f25019a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f25019a & ((1 << i) - 1));
            } else {
                return this.f25020b.m33468e(i - 64) + Long.bitCount(this.f25019a);
            }
        }

        public String toString() {
            if (this.f25020b == null) {
                return Long.toBinaryString(this.f25019a);
            }
            return this.f25020b.toString() + "xx" + Long.toBinaryString(this.f25019a);
        }
    }

    /* compiled from: ChildHelper */
    /* renamed from: pe$b */
    public interface C5660b {
        /* renamed from: a */
        int m33469a();

        /* renamed from: a */
        int m33470a(View view);

        /* renamed from: a */
        void m33471a(int i);

        /* renamed from: a */
        void m33472a(View view, int i);

        /* renamed from: a */
        void m33473a(View view, int i, LayoutParams layoutParams);

        /* renamed from: b */
        C0605t m33474b(View view);

        /* renamed from: b */
        View m33475b(int i);

        /* renamed from: b */
        void m33476b();

        /* renamed from: c */
        void m33477c(int i);

        /* renamed from: c */
        void m33478c(View view);

        /* renamed from: d */
        void m33479d(View view);
    }

    public pe(C5660b c5660b) {
        this.f25021a = c5660b;
    }

    /* renamed from: g */
    private void m33481g(View view) {
        this.f25023c.add(view);
        this.f25021a.m33478c(view);
    }

    /* renamed from: h */
    private boolean m33482h(View view) {
        if (!this.f25023c.remove(view)) {
            return false;
        }
        this.f25021a.m33479d(view);
        return true;
    }

    /* renamed from: a */
    public void m33488a(View view, boolean z) {
        m33487a(view, -1, z);
    }

    /* renamed from: a */
    public void m33487a(View view, int i, boolean z) {
        int a;
        if (i < 0) {
            a = this.f25021a.m33469a();
        } else {
            a = m33480f(i);
        }
        this.f25022b.m33464a(a, z);
        if (z) {
            m33481g(view);
        }
        this.f25021a.m33472a(view, a);
    }

    /* renamed from: f */
    private int m33480f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f25021a.m33469a();
        int i2 = i;
        while (i2 < a) {
            int e = i - (i2 - this.f25022b.m33468e(i2));
            if (e == 0) {
                while (this.f25022b.m33466c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    /* renamed from: a */
    public void m33485a(View view) {
        int a = this.f25021a.m33470a(view);
        if (a >= 0) {
            if (this.f25022b.m33467d(a)) {
                m33482h(view);
            }
            this.f25021a.m33471a(a);
        }
    }

    /* renamed from: a */
    public void m33484a(int i) {
        int f = m33480f(i);
        View b = this.f25021a.m33475b(f);
        if (b != null) {
            if (this.f25022b.m33467d(f)) {
                m33482h(b);
            }
            this.f25021a.m33471a(f);
        }
    }

    /* renamed from: b */
    public View m33491b(int i) {
        return this.f25021a.m33475b(m33480f(i));
    }

    /* renamed from: a */
    public void m33483a() {
        this.f25022b.m33462a();
        for (int size = this.f25023c.size() - 1; size >= 0; size--) {
            this.f25021a.m33479d((View) this.f25023c.get(size));
            this.f25023c.remove(size);
        }
        this.f25021a.m33476b();
    }

    /* renamed from: c */
    public View m33493c(int i) {
        int size = this.f25023c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f25023c.get(i2);
            C0605t b = this.f25021a.m33474b(view);
            if (b.getLayoutPosition() == i && !b.isInvalid() && !b.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m33486a(View view, int i, LayoutParams layoutParams, boolean z) {
        int a;
        if (i < 0) {
            a = this.f25021a.m33469a();
        } else {
            a = m33480f(i);
        }
        this.f25022b.m33464a(a, z);
        if (z) {
            m33481g(view);
        }
        this.f25021a.m33473a(view, a, layoutParams);
    }

    /* renamed from: b */
    public int m33489b() {
        return this.f25021a.m33469a() - this.f25023c.size();
    }

    /* renamed from: c */
    public int m33492c() {
        return this.f25021a.m33469a();
    }

    /* renamed from: d */
    public View m33495d(int i) {
        return this.f25021a.m33475b(i);
    }

    /* renamed from: e */
    public void m33497e(int i) {
        int f = m33480f(i);
        this.f25022b.m33467d(f);
        this.f25021a.m33477c(f);
    }

    /* renamed from: b */
    public int m33490b(View view) {
        int a = this.f25021a.m33470a(view);
        if (a == -1 || this.f25022b.m33466c(a)) {
            return -1;
        }
        return a - this.f25022b.m33468e(a);
    }

    /* renamed from: c */
    public boolean m33494c(View view) {
        return this.f25023c.contains(view);
    }

    /* renamed from: d */
    public void m33496d(View view) {
        int a = this.f25021a.m33470a(view);
        if (a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        this.f25022b.m33463a(a);
        m33481g(view);
    }

    /* renamed from: e */
    public void m33498e(View view) {
        int a = this.f25021a.m33470a(view);
        if (a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f25022b.m33466c(a)) {
            this.f25022b.m33465b(a);
            m33482h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f25022b.toString() + ", hidden list:" + this.f25023c.size();
    }

    /* renamed from: f */
    public boolean m33499f(View view) {
        int a = this.f25021a.m33470a(view);
        if (a == -1) {
            return m33482h(view) ? true : true;
        } else {
            if (!this.f25022b.m33466c(a)) {
                return false;
            }
            this.f25022b.m33467d(a);
            if (m33482h(view)) {
                this.f25021a.m33471a(a);
            } else {
                this.f25021a.m33471a(a);
            }
            return true;
        }
    }
}

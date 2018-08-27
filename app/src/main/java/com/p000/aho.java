package com.p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: SlidingPercentile */
/* renamed from: aho */
public final class aho {
    /* renamed from: a */
    private static final Comparator<C0177a> f1501a = new C01751();
    /* renamed from: b */
    private static final Comparator<C0177a> f1502b = new C01762();
    /* renamed from: c */
    private final int f1503c;
    /* renamed from: d */
    private final ArrayList<C0177a> f1504d = new ArrayList();
    /* renamed from: e */
    private final C0177a[] f1505e = new C0177a[5];
    /* renamed from: f */
    private int f1506f = -1;
    /* renamed from: g */
    private int f1507g;
    /* renamed from: h */
    private int f1508h;
    /* renamed from: i */
    private int f1509i;

    /* compiled from: SlidingPercentile */
    /* renamed from: aho$1 */
    static class C01751 implements Comparator<C0177a> {
        C01751() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m1581a((C0177a) obj, (C0177a) obj2);
        }

        /* renamed from: a */
        public int m1581a(C0177a c0177a, C0177a c0177a2) {
            return c0177a.f1498a - c0177a2.f1498a;
        }
    }

    /* compiled from: SlidingPercentile */
    /* renamed from: aho$2 */
    static class C01762 implements Comparator<C0177a> {
        C01762() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m1582a((C0177a) obj, (C0177a) obj2);
        }

        /* renamed from: a */
        public int m1582a(C0177a c0177a, C0177a c0177a2) {
            if (c0177a.f1500c < c0177a2.f1500c) {
                return -1;
            }
            return c0177a2.f1500c < c0177a.f1500c ? 1 : 0;
        }
    }

    /* compiled from: SlidingPercentile */
    /* renamed from: aho$a */
    static class C0177a {
        /* renamed from: a */
        public int f1498a;
        /* renamed from: b */
        public int f1499b;
        /* renamed from: c */
        public float f1500c;

        private C0177a() {
        }
    }

    public aho(int i) {
        this.f1503c = i;
    }

    /* renamed from: a */
    public void m1586a(int i, float f) {
        int i2;
        C0177a c0177a;
        m1583a();
        if (this.f1509i > 0) {
            C0177a[] c0177aArr = this.f1505e;
            i2 = this.f1509i - 1;
            this.f1509i = i2;
            c0177a = c0177aArr[i2];
        } else {
            c0177a = new C0177a();
        }
        i2 = this.f1507g;
        this.f1507g = i2 + 1;
        c0177a.f1498a = i2;
        c0177a.f1499b = i;
        c0177a.f1500c = f;
        this.f1504d.add(c0177a);
        this.f1508h += i;
        while (this.f1508h > this.f1503c) {
            i2 = this.f1508h - this.f1503c;
            c0177a = (C0177a) this.f1504d.get(0);
            if (c0177a.f1499b <= i2) {
                this.f1508h -= c0177a.f1499b;
                this.f1504d.remove(0);
                if (this.f1509i < 5) {
                    C0177a[] c0177aArr2 = this.f1505e;
                    int i3 = this.f1509i;
                    this.f1509i = i3 + 1;
                    c0177aArr2[i3] = c0177a;
                }
            } else {
                c0177a.f1499b -= i2;
                this.f1508h -= i2;
            }
        }
    }

    /* renamed from: a */
    public float m1585a(float f) {
        m1584b();
        float f2 = f * ((float) this.f1508h);
        int i = 0;
        for (int i2 = 0; i2 < this.f1504d.size(); i2++) {
            C0177a c0177a = (C0177a) this.f1504d.get(i2);
            i += c0177a.f1499b;
            if (((float) i) >= f2) {
                return c0177a.f1500c;
            }
        }
        return this.f1504d.isEmpty() ? Float.NaN : ((C0177a) this.f1504d.get(this.f1504d.size() - 1)).f1500c;
    }

    /* renamed from: a */
    private void m1583a() {
        if (this.f1506f != 1) {
            Collections.sort(this.f1504d, f1501a);
            this.f1506f = 1;
        }
    }

    /* renamed from: b */
    private void m1584b() {
        if (this.f1506f != 0) {
            Collections.sort(this.f1504d, f1502b);
            this.f1506f = 0;
        }
    }
}

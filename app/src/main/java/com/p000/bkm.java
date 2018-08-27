package com.p000;

import java.util.ArrayList;
import java.util.List;

@bhd
/* renamed from: bkm */
public class bkm {
    /* renamed from: a */
    private final String[] f6753a;
    /* renamed from: b */
    private final double[] f6754b;
    /* renamed from: c */
    private final double[] f6755c;
    /* renamed from: d */
    private final int[] f6756d;
    /* renamed from: e */
    private int f6757e;

    /* renamed from: bkm$a */
    public static class C1302a {
        /* renamed from: a */
        public final String f6745a;
        /* renamed from: b */
        public final double f6746b;
        /* renamed from: c */
        public final double f6747c;
        /* renamed from: d */
        public final double f6748d;
        /* renamed from: e */
        public final int f6749e;

        public C1302a(String str, double d, double d2, double d3, int i) {
            this.f6745a = str;
            this.f6747c = d;
            this.f6746b = d2;
            this.f6748d = d3;
            this.f6749e = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1302a)) {
                return false;
            }
            C1302a c1302a = (C1302a) obj;
            return aoh.m4677a(this.f6745a, c1302a.f6745a) && this.f6746b == c1302a.f6746b && this.f6747c == c1302a.f6747c && this.f6749e == c1302a.f6749e && Double.compare(this.f6748d, c1302a.f6748d) == 0;
        }

        public int hashCode() {
            return aoh.m4675a(this.f6745a, Double.valueOf(this.f6746b), Double.valueOf(this.f6747c), Double.valueOf(this.f6748d), Integer.valueOf(this.f6749e));
        }

        public String toString() {
            return aoh.m4676a((Object) this).m4674a("name", this.f6745a).m4674a("minBound", Double.valueOf(this.f6747c)).m4674a("maxBound", Double.valueOf(this.f6746b)).m4674a("percent", Double.valueOf(this.f6748d)).m4674a("count", Integer.valueOf(this.f6749e)).toString();
        }
    }

    /* renamed from: bkm$b */
    public static class C1303b {
        /* renamed from: a */
        private final List<String> f6750a = new ArrayList();
        /* renamed from: b */
        private final List<Double> f6751b = new ArrayList();
        /* renamed from: c */
        private final List<Double> f6752c = new ArrayList();

        /* renamed from: a */
        public C1303b m9235a(String str, double d, double d2) {
            int i = 0;
            while (i < this.f6750a.size()) {
                double doubleValue = ((Double) this.f6752c.get(i)).doubleValue();
                double doubleValue2 = ((Double) this.f6751b.get(i)).doubleValue();
                if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                    break;
                }
                i++;
            }
            this.f6750a.add(i, str);
            this.f6752c.add(i, Double.valueOf(d));
            this.f6751b.add(i, Double.valueOf(d2));
            return this;
        }

        /* renamed from: a */
        public bkm m9236a() {
            return new bkm();
        }
    }

    private bkm(C1303b c1303b) {
        int size = c1303b.f6751b.size();
        this.f6753a = (String[]) c1303b.f6750a.toArray(new String[size]);
        this.f6754b = m9237a(c1303b.f6751b);
        this.f6755c = m9237a(c1303b.f6752c);
        this.f6756d = new int[size];
        this.f6757e = 0;
    }

    /* renamed from: a */
    private double[] m9237a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public List<C1302a> m9238a() {
        List<C1302a> arrayList = new ArrayList(this.f6753a.length);
        for (int i = 0; i < this.f6753a.length; i++) {
            arrayList.add(new C1302a(this.f6753a[i], this.f6755c[i], this.f6754b[i], ((double) this.f6756d[i]) / ((double) this.f6757e), this.f6756d[i]));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m9239a(double d) {
        this.f6757e++;
        int i = 0;
        while (i < this.f6755c.length) {
            if (this.f6755c[i] <= d && d < this.f6754b[i]) {
                int[] iArr = this.f6756d;
                iArr[i] = iArr[i] + 1;
            }
            if (d >= this.f6755c[i]) {
                i++;
            } else {
                return;
            }
        }
    }
}

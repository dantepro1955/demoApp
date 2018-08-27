package com.p000;

/* renamed from: bry */
class bry extends Number implements Comparable<bry> {
    /* renamed from: a */
    private double f7488a;
    /* renamed from: b */
    private long f7489b;
    /* renamed from: c */
    private boolean f7490c = true;

    private bry(long j) {
        this.f7489b = j;
    }

    /* renamed from: a */
    public static bry m10577a(long j) {
        return new bry(j);
    }

    /* renamed from: a */
    public int m10578a(bry bry) {
        return (m10580b() && bry.m10580b()) ? new Long(this.f7489b).compareTo(Long.valueOf(bry.f7489b)) : Double.compare(doubleValue(), bry.doubleValue());
    }

    /* renamed from: a */
    public boolean m10579a() {
        return !m10580b();
    }

    /* renamed from: b */
    public boolean m10580b() {
        return this.f7490c;
    }

    public byte byteValue() {
        return (byte) ((int) longValue());
    }

    /* renamed from: c */
    public long m10581c() {
        return m10580b() ? this.f7489b : (long) this.f7488a;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m10578a((bry) obj);
    }

    /* renamed from: d */
    public int m10582d() {
        return (int) longValue();
    }

    public double doubleValue() {
        return m10580b() ? (double) this.f7489b : this.f7488a;
    }

    /* renamed from: e */
    public short m10583e() {
        return (short) ((int) longValue());
    }

    public boolean equals(Object obj) {
        return (obj instanceof bry) && m10578a((bry) obj) == 0;
    }

    public float floatValue() {
        return (float) doubleValue();
    }

    public int hashCode() {
        return new Long(longValue()).hashCode();
    }

    public int intValue() {
        return m10582d();
    }

    public long longValue() {
        return m10581c();
    }

    public short shortValue() {
        return m10583e();
    }

    public String toString() {
        return m10580b() ? Long.toString(this.f7489b) : Double.toString(this.f7488a);
    }
}

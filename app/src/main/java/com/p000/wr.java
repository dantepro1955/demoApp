package com.p000;

/* renamed from: wr */
public class wr implements Comparable {
    /* renamed from: a */
    private static int f25923a = 0;
    /* renamed from: b */
    private final int f25924b;
    /* renamed from: c */
    private final String f25925c;
    /* renamed from: d */
    private final Object f25926d;

    private wr(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        } else if (obj == null) {
            throw new IllegalArgumentException("No default value specified");
        } else {
            this.f25925c = str;
            this.f25926d = obj;
            this.f25924b = f25923a;
            f25923a++;
        }
    }

    /* renamed from: a */
    public int m34647a() {
        return this.f25924b;
    }

    /* renamed from: a */
    Object m34648a(Object obj) {
        return this.f25926d.getClass().cast(obj);
    }

    /* renamed from: b */
    public String m34649b() {
        return this.f25925c;
    }

    /* renamed from: c */
    public Object m34650c() {
        return this.f25926d;
    }

    public int compareTo(Object obj) {
        return (obj == null || !(obj instanceof wr)) ? 0 : this.f25925c.compareTo(((wr) obj).m34649b());
    }
}

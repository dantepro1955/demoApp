package com.p000;

/* renamed from: bnv */
public class bnv {
    /* renamed from: a */
    private final long f7180a;
    /* renamed from: b */
    private final int f7181b;
    /* renamed from: c */
    private double f7182c;
    /* renamed from: d */
    private long f7183d;
    /* renamed from: e */
    private final Object f7184e;
    /* renamed from: f */
    private final String f7185f;
    /* renamed from: g */
    private final apt f7186g;

    public bnv(int i, long j, String str, apt apt) {
        this.f7184e = new Object();
        this.f7181b = i;
        this.f7182c = (double) this.f7181b;
        this.f7180a = j;
        this.f7185f = str;
        this.f7186g = apt;
    }

    public bnv(String str, apt apt) {
        this(60, 2000, str, apt);
    }

    /* renamed from: a */
    public boolean m10031a() {
        boolean z;
        synchronized (this.f7184e) {
            long a = this.f7186g.mo606a();
            if (this.f7182c < ((double) this.f7181b)) {
                double d = ((double) (a - this.f7183d)) / ((double) this.f7180a);
                if (d > 0.0d) {
                    this.f7182c = Math.min((double) this.f7181b, d + this.f7182c);
                }
            }
            this.f7183d = a;
            if (this.f7182c >= 1.0d) {
                this.f7182c -= 1.0d;
                z = true;
            } else {
                String str = this.f7185f;
                bnw.m10037b(new StringBuilder(String.valueOf(str).length() + 34).append("Excessive ").append(str).append(" detected; call ignored.").toString());
                z = false;
            }
        }
        return z;
    }
}

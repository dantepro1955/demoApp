package com.p000;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ObjectAnimator */
/* renamed from: cwq */
public final class cwq extends cwu {
    /* renamed from: h */
    private static final Map<String, cwx> f20414h = new HashMap();
    /* renamed from: i */
    private Object f20415i;
    /* renamed from: j */
    private String f20416j;
    /* renamed from: k */
    private cwx f20417k;

    /* renamed from: b */
    public /* synthetic */ cwk mo4190b() {
        return mo4197d();
    }

    /* renamed from: b */
    public /* synthetic */ cwu mo4195b(long j) {
        return mo4192a(j);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo4197d();
    }

    /* renamed from: e */
    public /* synthetic */ cwu mo4198e() {
        return mo4197d();
    }

    static {
        f20414h.put("alpha", cwr.f20420a);
        f20414h.put("pivotX", cwr.f20421b);
        f20414h.put("pivotY", cwr.f20422c);
        f20414h.put("translationX", cwr.f20423d);
        f20414h.put("translationY", cwr.f20424e);
        f20414h.put("rotation", cwr.f20425f);
        f20414h.put("rotationX", cwr.f20426g);
        f20414h.put("rotationY", cwr.f20427h);
        f20414h.put("scaleX", cwr.f20428i);
        f20414h.put("scaleY", cwr.f20429j);
        f20414h.put("scrollX", cwr.f20430k);
        f20414h.put("scrollY", cwr.f20431l);
        f20414h.put("x", cwr.f20432m);
        f20414h.put("y", cwr.f20433n);
    }

    /* renamed from: a */
    public void m25277a(String str) {
        if (this.f != null) {
            cws cws = this.f[0];
            String c = cws.m25359c();
            cws.m25355a(str);
            this.g.remove(c);
            this.g.put(str, cws);
        }
        this.f20416j = str;
        this.e = false;
    }

    /* renamed from: a */
    public void m25276a(cwx cwx) {
        if (this.f != null) {
            cws cws = this.f[0];
            String c = cws.m25359c();
            cws.m25352a(cwx);
            this.g.remove(c);
            this.g.put(this.f20416j, cws);
        }
        if (this.f20417k != null) {
            this.f20416j = cwx.m25285a();
        }
        this.f20417k = cwx;
        this.e = false;
    }

    private cwq(Object obj, String str) {
        this.f20415i = obj;
        m25277a(str);
    }

    /* renamed from: a */
    public static cwq m25272a(Object obj, String str, float... fArr) {
        cwq cwq = new cwq(obj, str);
        cwq.mo4194a(fArr);
        return cwq;
    }

    /* renamed from: a */
    public void mo4194a(float... fArr) {
        if (this.f != null && this.f.length != 0) {
            super.mo4194a(fArr);
        } else if (this.f20417k != null) {
            m25264a(cws.m25344a(this.f20417k, fArr));
        } else {
            m25264a(cws.m25345a(this.f20416j, fArr));
        }
    }

    /* renamed from: a */
    public void mo4189a() {
        super.mo4189a();
    }

    /* renamed from: c */
    void mo4196c() {
        if (!this.e) {
            if (this.f20417k == null && cwy.f20454a && (this.f20415i instanceof View) && f20414h.containsKey(this.f20416j)) {
                m25276a((cwx) f20414h.get(this.f20416j));
            }
            for (cws a : this.f) {
                a.m25354a(this.f20415i);
            }
            super.mo4196c();
        }
    }

    /* renamed from: a */
    public cwq mo4192a(long j) {
        super.mo4195b(j);
        return this;
    }

    /* renamed from: a */
    void mo4193a(float f) {
        super.mo4193a(f);
        for (cws b : this.f) {
            b.mo4207b(this.f20415i);
        }
    }

    /* renamed from: d */
    public cwq mo4197d() {
        return (cwq) super.mo4198e();
    }

    public String toString() {
        String str = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.f20415i;
        if (this.f != null) {
            for (cws cws : this.f) {
                str = str + "\n    " + cws.toString();
            }
        }
        return str;
    }
}

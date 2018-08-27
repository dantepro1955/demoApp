package com.p000;

import java.util.ArrayList;
import p000.cwo.C4625a;

/* compiled from: FloatKeyframeSet */
/* renamed from: cwm */
class cwm extends cwp {
    /* renamed from: g */
    private float f20376g;
    /* renamed from: h */
    private float f20377h;
    /* renamed from: i */
    private float f20378i;
    /* renamed from: j */
    private boolean f20379j = true;

    /* renamed from: b */
    public /* synthetic */ cwp mo4183b() {
        return m25226a();
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m25226a();
    }

    public cwm(C4625a... c4625aArr) {
        super(c4625aArr);
    }

    /* renamed from: a */
    public Object mo4182a(float f) {
        return Float.valueOf(m25228b(f));
    }

    /* renamed from: a */
    public cwm m25226a() {
        ArrayList arrayList = this.e;
        int size = this.e.size();
        C4625a[] c4625aArr = new C4625a[size];
        for (int i = 0; i < size; i++) {
            c4625aArr[i] = (C4625a) ((cwo) arrayList.get(i)).mo4188e();
        }
        return new cwm(c4625aArr);
    }

    /* renamed from: b */
    public float m25228b(float f) {
        int i = 1;
        if (this.a == 2) {
            if (this.f20379j) {
                this.f20379j = false;
                this.f20376g = ((C4625a) this.e.get(0)).m25244f();
                this.f20377h = ((C4625a) this.e.get(1)).m25244f();
                this.f20378i = this.f20377h - this.f20376g;
            }
            if (this.d != null) {
                f = this.d.getInterpolation(f);
            }
            if (this.f == null) {
                return this.f20376g + (this.f20378i * f);
            }
            return ((Number) this.f.mo4181a(f, Float.valueOf(this.f20376g), Float.valueOf(this.f20377h))).floatValue();
        } else if (f <= 0.0f) {
            r0 = (C4625a) this.e.get(0);
            r1 = (C4625a) this.e.get(1);
            r2 = r0.m25244f();
            r3 = r1.m25244f();
            r0 = r0.m25238c();
            r4 = r1.m25238c();
            r1 = r1.m25239d();
            if (r1 != null) {
                f = r1.getInterpolation(f);
            }
            r0 = (f - r0) / (r4 - r0);
            return this.f == null ? (r0 * (r3 - r2)) + r2 : ((Number) this.f.mo4181a(r0, Float.valueOf(r2), Float.valueOf(r3))).floatValue();
        } else if (f >= 1.0f) {
            r0 = (C4625a) this.e.get(this.a - 2);
            r1 = (C4625a) this.e.get(this.a - 1);
            r2 = r0.m25244f();
            r3 = r1.m25244f();
            r0 = r0.m25238c();
            r4 = r1.m25238c();
            r1 = r1.m25239d();
            if (r1 != null) {
                f = r1.getInterpolation(f);
            }
            r0 = (f - r0) / (r4 - r0);
            return this.f == null ? (r0 * (r3 - r2)) + r2 : ((Number) this.f.mo4181a(r0, Float.valueOf(r2), Float.valueOf(r3))).floatValue();
        } else {
            C4625a c4625a = (C4625a) this.e.get(0);
            while (i < this.a) {
                r0 = (C4625a) this.e.get(i);
                if (f < r0.m25238c()) {
                    r1 = r0.m25239d();
                    if (r1 != null) {
                        f = r1.getInterpolation(f);
                    }
                    float c = (f - c4625a.m25238c()) / (r0.m25238c() - c4625a.m25238c());
                    r2 = c4625a.m25244f();
                    r0 = r0.m25244f();
                    return this.f == null ? ((r0 - r2) * c) + r2 : ((Number) this.f.mo4181a(c, Float.valueOf(r2), Float.valueOf(r0))).floatValue();
                } else {
                    i++;
                    c4625a = r0;
                }
            }
            return ((Number) ((cwo) this.e.get(this.a - 1)).mo4186b()).floatValue();
        }
    }
}

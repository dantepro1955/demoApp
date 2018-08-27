package com.p000;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import p000.cwo.C4625a;

/* compiled from: KeyframeSet */
/* renamed from: cwp */
class cwp {
    /* renamed from: a */
    int f20370a;
    /* renamed from: b */
    cwo f20371b;
    /* renamed from: c */
    cwo f20372c;
    /* renamed from: d */
    Interpolator f20373d;
    /* renamed from: e */
    ArrayList<cwo> f20374e = new ArrayList();
    /* renamed from: f */
    cwt f20375f;

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo4183b();
    }

    public cwp(cwo... cwoArr) {
        this.f20370a = cwoArr.length;
        this.f20374e.addAll(Arrays.asList(cwoArr));
        this.f20371b = (cwo) this.f20374e.get(0);
        this.f20372c = (cwo) this.f20374e.get(this.f20370a - 1);
        this.f20373d = this.f20372c.m25239d();
    }

    /* renamed from: a */
    public static cwp m25222a(float... fArr) {
        int i = 1;
        int length = fArr.length;
        C4625a[] c4625aArr = new C4625a[Math.max(length, 2)];
        if (length == 1) {
            c4625aArr[0] = (C4625a) cwo.m25232a(0.0f);
            c4625aArr[1] = (C4625a) cwo.m25233a(1.0f, fArr[0]);
        } else {
            c4625aArr[0] = (C4625a) cwo.m25233a(0.0f, fArr[0]);
            while (i < length) {
                c4625aArr[i] = (C4625a) cwo.m25233a(((float) i) / ((float) (length - 1)), fArr[i]);
                i++;
            }
        }
        return new cwm(c4625aArr);
    }

    /* renamed from: a */
    public void m25224a(cwt cwt) {
        this.f20375f = cwt;
    }

    /* renamed from: b */
    public cwp mo4183b() {
        ArrayList arrayList = this.f20374e;
        int size = this.f20374e.size();
        cwo[] cwoArr = new cwo[size];
        for (int i = 0; i < size; i++) {
            cwoArr[i] = ((cwo) arrayList.get(i)).mo4188e();
        }
        return new cwp(cwoArr);
    }

    /* renamed from: a */
    public Object mo4182a(float f) {
        if (this.f20370a == 2) {
            if (this.f20373d != null) {
                f = this.f20373d.getInterpolation(f);
            }
            return this.f20375f.mo4181a(f, this.f20371b.mo4186b(), this.f20372c.mo4186b());
        } else if (f <= 0.0f) {
            r0 = (cwo) this.f20374e.get(1);
            r1 = r0.m25239d();
            if (r1 != null) {
                f = r1.getInterpolation(f);
            }
            r1 = this.f20371b.m25238c();
            return this.f20375f.mo4181a((f - r1) / (r0.m25238c() - r1), this.f20371b.mo4186b(), r0.mo4186b());
        } else if (f >= 1.0f) {
            r0 = (cwo) this.f20374e.get(this.f20370a - 2);
            r1 = this.f20372c.m25239d();
            if (r1 != null) {
                f = r1.getInterpolation(f);
            }
            r1 = r0.m25238c();
            return this.f20375f.mo4181a((f - r1) / (this.f20372c.m25238c() - r1), r0.mo4186b(), this.f20372c.mo4186b());
        } else {
            cwo cwo = this.f20371b;
            int i = 1;
            while (i < this.f20370a) {
                r0 = (cwo) this.f20374e.get(i);
                if (f < r0.m25238c()) {
                    r1 = r0.m25239d();
                    if (r1 != null) {
                        f = r1.getInterpolation(f);
                    }
                    r1 = cwo.m25238c();
                    return this.f20375f.mo4181a((f - r1) / (r0.m25238c() - r1), cwo.mo4186b(), r0.mo4186b());
                }
                i++;
                cwo = r0;
            }
            return this.f20372c.mo4186b();
        }
    }

    public String toString() {
        String str = " ";
        int i = 0;
        while (i < this.f20370a) {
            String str2 = str + ((cwo) this.f20374e.get(i)).mo4186b() + "  ";
            i++;
            str = str2;
        }
        return str;
    }
}

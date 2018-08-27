package com.p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet */
/* renamed from: no */
public class no {
    /* renamed from: a */
    final ArrayList<ju> f24762a = new ArrayList();
    /* renamed from: b */
    jy f24763b;
    /* renamed from: c */
    private long f24764c = -1;
    /* renamed from: d */
    private Interpolator f24765d;
    /* renamed from: e */
    private boolean f24766e;
    /* renamed from: f */
    private final jz f24767f = new C55871(this);

    /* compiled from: ViewPropertyAnimatorCompatSet */
    /* renamed from: no$1 */
    class C55871 extends jz {
        /* renamed from: a */
        final /* synthetic */ no f24759a;
        /* renamed from: b */
        private boolean f24760b = false;
        /* renamed from: c */
        private int f24761c = 0;

        C55871(no noVar) {
            this.f24759a = noVar;
        }

        /* renamed from: a */
        public void mo3877a(View view) {
            if (!this.f24760b) {
                this.f24760b = true;
                if (this.f24759a.f24763b != null) {
                    this.f24759a.f24763b.mo3877a(null);
                }
            }
        }

        /* renamed from: a */
        void m32999a() {
            this.f24761c = 0;
            this.f24760b = false;
            this.f24759a.m33008b();
        }

        /* renamed from: b */
        public void mo3878b(View view) {
            int i = this.f24761c + 1;
            this.f24761c = i;
            if (i == this.f24759a.f24762a.size()) {
                if (this.f24759a.f24763b != null) {
                    this.f24759a.f24763b.mo3878b(null);
                }
                m32999a();
            }
        }
    }

    /* renamed from: a */
    public no m33004a(ju juVar) {
        if (!this.f24766e) {
            this.f24762a.add(juVar);
        }
        return this;
    }

    /* renamed from: a */
    public no m33005a(ju juVar, ju juVar2) {
        this.f24762a.add(juVar);
        juVar2.m31858b(juVar.m31851a());
        this.f24762a.add(juVar2);
        return this;
    }

    /* renamed from: a */
    public void m33007a() {
        if (!this.f24766e) {
            Iterator it = this.f24762a.iterator();
            while (it.hasNext()) {
                ju juVar = (ju) it.next();
                if (this.f24764c >= 0) {
                    juVar.m31853a(this.f24764c);
                }
                if (this.f24765d != null) {
                    juVar.m31854a(this.f24765d);
                }
                if (this.f24763b != null) {
                    juVar.m31855a(this.f24767f);
                }
                juVar.m31861c();
            }
            this.f24766e = true;
        }
    }

    /* renamed from: b */
    void m33008b() {
        this.f24766e = false;
    }

    /* renamed from: c */
    public void m33009c() {
        if (this.f24766e) {
            Iterator it = this.f24762a.iterator();
            while (it.hasNext()) {
                ((ju) it.next()).m31859b();
            }
            this.f24766e = false;
        }
    }

    /* renamed from: a */
    public no m33002a(long j) {
        if (!this.f24766e) {
            this.f24764c = j;
        }
        return this;
    }

    /* renamed from: a */
    public no m33003a(Interpolator interpolator) {
        if (!this.f24766e) {
            this.f24765d = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public no m33006a(jy jyVar) {
        if (!this.f24766e) {
            this.f24763b = jyVar;
        }
        return this;
    }
}

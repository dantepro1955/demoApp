package com.p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: Blitz */
/* renamed from: csn */
public abstract class csn<T> extends ArrayList<T> {
    /* renamed from: e */
    protected csp f20089e;
    /* renamed from: f */
    protected List<C4557a<T>> f20090f;

    /* compiled from: Blitz */
    /* renamed from: csn$a */
    public interface C4557a<T> {
        /* renamed from: a */
        void m24781a(List<T> list, boolean z);

        /* renamed from: b */
        void m24782b();

        /* renamed from: b */
        void m24783b(List<T> list, boolean z);

        /* renamed from: c */
        void m24784c();

        /* renamed from: c */
        void m24785c(List<T> list, boolean z);
    }

    /* renamed from: a */
    public abstract void m24786a(int i);

    /* renamed from: c */
    public abstract boolean m24789c();

    public csn(csp csp) {
        this.f20089e = csp;
    }

    /* renamed from: a */
    public void m24788a(csp csp) {
        this.f20089e = csp;
    }

    /* renamed from: a */
    public void m24787a(C4557a<T> c4557a) {
        if (this.f20090f == null) {
            this.f20090f = new ArrayList();
        }
        this.f20090f.add(c4557a);
    }
}

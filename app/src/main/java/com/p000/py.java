package com.p000;

import android.support.v7.widget.RecyclerView.C0588e;
import android.support.v7.widget.RecyclerView.C0588e.C0587c;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.View;

/* compiled from: SimpleItemAnimator */
/* renamed from: py */
public abstract class py extends C0588e {
    /* renamed from: h */
    boolean f25059h = true;

    /* renamed from: a */
    public abstract boolean mo5431a(C0605t c0605t);

    /* renamed from: a */
    public abstract boolean mo5432a(C0605t c0605t, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo5433a(C0605t c0605t, C0605t c0605t2, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract boolean mo5434b(C0605t c0605t);

    /* renamed from: h */
    public boolean m33567h(C0605t c0605t) {
        return !this.f25059h || c0605t.isInvalid();
    }

    /* renamed from: a */
    public boolean m33558a(C0605t c0605t, C0587c c0587c, C0587c c0587c2) {
        int i = c0587c.f3453a;
        int i2 = c0587c.f3454b;
        View view = c0605t.itemView;
        int left = c0587c2 == null ? view.getLeft() : c0587c2.f3453a;
        int top = c0587c2 == null ? view.getTop() : c0587c2.f3454b;
        if (c0605t.isRemoved() || (i == left && i2 == top)) {
            return mo5431a(c0605t);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo5432a(c0605t, i, i2, left, top);
    }

    /* renamed from: b */
    public boolean m33563b(C0605t c0605t, C0587c c0587c, C0587c c0587c2) {
        if (c0587c == null || (c0587c.f3453a == c0587c2.f3453a && c0587c.f3454b == c0587c2.f3454b)) {
            return mo5434b(c0605t);
        }
        return mo5432a(c0605t, c0587c.f3453a, c0587c.f3454b, c0587c2.f3453a, c0587c2.f3454b);
    }

    /* renamed from: c */
    public boolean m33565c(C0605t c0605t, C0587c c0587c, C0587c c0587c2) {
        if (c0587c.f3453a == c0587c2.f3453a && c0587c.f3454b == c0587c2.f3454b) {
            m33569j(c0605t);
            return false;
        }
        return mo5432a(c0605t, c0587c.f3453a, c0587c.f3454b, c0587c2.f3453a, c0587c2.f3454b);
    }

    /* renamed from: a */
    public boolean m33560a(C0605t c0605t, C0605t c0605t2, C0587c c0587c, C0587c c0587c2) {
        int i;
        int i2;
        int i3 = c0587c.f3453a;
        int i4 = c0587c.f3454b;
        if (c0605t2.shouldIgnore()) {
            i = c0587c.f3453a;
            i2 = c0587c.f3454b;
        } else {
            i = c0587c2.f3453a;
            i2 = c0587c2.f3454b;
        }
        return mo5433a(c0605t, c0605t2, i3, i4, i, i2);
    }

    /* renamed from: i */
    public final void m33568i(C0605t c0605t) {
        m33575p(c0605t);
        f(c0605t);
    }

    /* renamed from: j */
    public final void m33569j(C0605t c0605t) {
        m33579t(c0605t);
        f(c0605t);
    }

    /* renamed from: k */
    public final void m33570k(C0605t c0605t) {
        m33577r(c0605t);
        f(c0605t);
    }

    /* renamed from: a */
    public final void m33555a(C0605t c0605t, boolean z) {
        m33566d(c0605t, z);
        f(c0605t);
    }

    /* renamed from: l */
    public final void m33571l(C0605t c0605t) {
        m33574o(c0605t);
    }

    /* renamed from: m */
    public final void m33572m(C0605t c0605t) {
        m33578s(c0605t);
    }

    /* renamed from: n */
    public final void m33573n(C0605t c0605t) {
        m33576q(c0605t);
    }

    /* renamed from: b */
    public final void m33561b(C0605t c0605t, boolean z) {
        m33564c(c0605t, z);
    }

    /* renamed from: o */
    public void m33574o(C0605t c0605t) {
    }

    /* renamed from: p */
    public void m33575p(C0605t c0605t) {
    }

    /* renamed from: q */
    public void m33576q(C0605t c0605t) {
    }

    /* renamed from: r */
    public void m33577r(C0605t c0605t) {
    }

    /* renamed from: s */
    public void m33578s(C0605t c0605t) {
    }

    /* renamed from: t */
    public void m33579t(C0605t c0605t) {
    }

    /* renamed from: c */
    public void m33564c(C0605t c0605t, boolean z) {
    }

    /* renamed from: d */
    public void m33566d(C0605t c0605t, boolean z) {
    }
}

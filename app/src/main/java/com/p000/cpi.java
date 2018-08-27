package com.p000;

import p000.caq.C1641a;

/* compiled from: PostTagInputPresenter */
/* renamed from: cpi */
public class cpi extends cap<C4133a> {
    /* renamed from: a */
    private dyt f19937a = new dyt();

    /* compiled from: PostTagInputPresenter */
    /* renamed from: cpi$a */
    public interface C4133a extends C1641a {
        /* renamed from: a */
        void mo3833a();

        /* renamed from: b */
        void mo3834b();

        /* renamed from: c */
        void mo3835c();

        /* renamed from: d */
        void mo3836d();

        dtp<bwp> getTagInputObservable();

        String getTagName();

        void setHint(CharSequence charSequence);

        void setMaximumLength(int i);

        void setTagName(String str);
    }

    /* renamed from: a */
    public void m24296a(C4133a c4133a) {
        super.a(c4133a);
        this.f19937a.m29887a(c4133a.getTagInputObservable().m29337b(cpj.m24302a(c4133a)));
    }

    /* renamed from: a */
    static /* synthetic */ void m24292a(C4133a c4133a, bwp bwp) {
        if (bwp.b().length() > 0) {
            c4133a.mo3834b();
        } else {
            c4133a.mo3835c();
        }
    }

    /* renamed from: a */
    public void m24293a() {
        super.a();
        this.f19937a.unsubscribe();
    }

    /* renamed from: a */
    public void m24297a(CharSequence charSequence) {
        if (d() != null) {
            ((C4133a) d()).setHint(charSequence);
        }
    }

    /* renamed from: b */
    public void m24298b(CharSequence charSequence) {
        if (d() != null) {
            ((C4133a) d()).setTagName(charSequence.toString());
        }
    }

    /* renamed from: a */
    public void m24294a(int i) {
        if (d() != null) {
            ((C4133a) d()).setMaximumLength(i);
        }
    }

    /* renamed from: e */
    public void m24299e() {
        if (d() != null) {
            ((C4133a) d()).mo3836d();
        }
    }

    /* renamed from: f */
    public String m24300f() {
        if (d() == null) {
            return "";
        }
        return ((C4133a) d()).getTagName();
    }

    /* renamed from: g */
    public void m24301g() {
        if (d() != null) {
            ((C4133a) d()).mo3833a();
            ((C4133a) d()).mo3835c();
        }
    }
}

package com.p000;

import android.os.Build.VERSION;
import android.view.LayoutInflater;

/* compiled from: LayoutInflaterCompat */
/* renamed from: id */
public final class id {
    /* renamed from: a */
    static final C5382a f23863a;

    /* compiled from: LayoutInflaterCompat */
    /* renamed from: id$a */
    interface C5382a {
        /* renamed from: a */
        ih mo4856a(LayoutInflater layoutInflater);

        /* renamed from: a */
        void mo4857a(LayoutInflater layoutInflater, ih ihVar);
    }

    /* compiled from: LayoutInflaterCompat */
    /* renamed from: id$b */
    static class C5383b implements C5382a {
        C5383b() {
        }

        /* renamed from: a */
        public void mo4857a(LayoutInflater layoutInflater, ih ihVar) {
            ie.m30765a(layoutInflater, ihVar);
        }

        /* renamed from: a */
        public ih mo4856a(LayoutInflater layoutInflater) {
            return ie.m30764a(layoutInflater);
        }
    }

    /* compiled from: LayoutInflaterCompat */
    /* renamed from: id$c */
    static class C5384c extends C5383b {
        C5384c() {
        }

        /* renamed from: a */
        public void mo4857a(LayoutInflater layoutInflater, ih ihVar) {
            C5388if.m30767a(layoutInflater, ihVar);
        }
    }

    /* compiled from: LayoutInflaterCompat */
    /* renamed from: id$d */
    static class C5385d extends C5384c {
        C5385d() {
        }

        /* renamed from: a */
        public void mo4857a(LayoutInflater layoutInflater, ih ihVar) {
            ig.m30768a(layoutInflater, ihVar);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f23863a = new C5385d();
        } else if (i >= 11) {
            f23863a = new C5384c();
        } else {
            f23863a = new C5383b();
        }
    }

    /* renamed from: a */
    public static void m30763a(LayoutInflater layoutInflater, ih ihVar) {
        f23863a.mo4857a(layoutInflater, ihVar);
    }

    /* renamed from: a */
    public static ih m30762a(LayoutInflater layoutInflater) {
        return f23863a.mo4856a(layoutInflater);
    }
}

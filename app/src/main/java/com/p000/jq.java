package com.p000;

import android.os.Build.VERSION;
import android.view.ViewGroup;

/* compiled from: ViewGroupCompat */
/* renamed from: jq */
public final class jq {
    /* renamed from: a */
    static final C5445c f24286a;

    /* compiled from: ViewGroupCompat */
    /* renamed from: jq$c */
    interface C5445c {
        /* renamed from: a */
        void mo5021a(ViewGroup viewGroup, boolean z);
    }

    /* compiled from: ViewGroupCompat */
    /* renamed from: jq$f */
    static class C5446f implements C5445c {
        C5446f() {
        }

        /* renamed from: a */
        public void mo5021a(ViewGroup viewGroup, boolean z) {
        }
    }

    /* compiled from: ViewGroupCompat */
    /* renamed from: jq$a */
    static class C5447a extends C5446f {
        C5447a() {
        }

        /* renamed from: a */
        public void mo5021a(ViewGroup viewGroup, boolean z) {
            jr.m31769a(viewGroup, z);
        }
    }

    /* compiled from: ViewGroupCompat */
    /* renamed from: jq$b */
    static class C5448b extends C5447a {
        C5448b() {
        }
    }

    /* compiled from: ViewGroupCompat */
    /* renamed from: jq$d */
    static class C5449d extends C5448b {
        C5449d() {
        }
    }

    /* compiled from: ViewGroupCompat */
    /* renamed from: jq$e */
    static class C5450e extends C5449d {
        C5450e() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f24286a = new C5450e();
        } else if (i >= 18) {
            f24286a = new C5449d();
        } else if (i >= 14) {
            f24286a = new C5448b();
        } else if (i >= 11) {
            f24286a = new C5447a();
        } else {
            f24286a = new C5446f();
        }
    }

    /* renamed from: a */
    public static void m31768a(ViewGroup viewGroup, boolean z) {
        f24286a.mo5021a(viewGroup, z);
    }
}

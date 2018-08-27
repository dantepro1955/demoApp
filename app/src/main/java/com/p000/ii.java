package com.p000;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

/* compiled from: MarginLayoutParamsCompat */
/* renamed from: ii */
public final class ii {
    /* renamed from: a */
    static final C5389a f23867a;

    /* compiled from: MarginLayoutParamsCompat */
    /* renamed from: ii$a */
    interface C5389a {
        /* renamed from: a */
        int mo4858a(MarginLayoutParams marginLayoutParams);

        /* renamed from: b */
        int mo4859b(MarginLayoutParams marginLayoutParams);
    }

    /* compiled from: MarginLayoutParamsCompat */
    /* renamed from: ii$b */
    static class C5390b implements C5389a {
        C5390b() {
        }

        /* renamed from: a */
        public int mo4858a(MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.leftMargin;
        }

        /* renamed from: b */
        public int mo4859b(MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.rightMargin;
        }
    }

    /* compiled from: MarginLayoutParamsCompat */
    /* renamed from: ii$c */
    static class C5391c implements C5389a {
        C5391c() {
        }

        /* renamed from: a */
        public int mo4858a(MarginLayoutParams marginLayoutParams) {
            return ij.m30777a(marginLayoutParams);
        }

        /* renamed from: b */
        public int mo4859b(MarginLayoutParams marginLayoutParams) {
            return ij.m30778b(marginLayoutParams);
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            f23867a = new C5391c();
        } else {
            f23867a = new C5390b();
        }
    }

    /* renamed from: a */
    public static int m30775a(MarginLayoutParams marginLayoutParams) {
        return f23867a.mo4858a(marginLayoutParams);
    }

    /* renamed from: b */
    public static int m30776b(MarginLayoutParams marginLayoutParams) {
        return f23867a.mo4859b(marginLayoutParams);
    }
}

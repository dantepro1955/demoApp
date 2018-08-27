package com.p000;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ViewGroupUtils */
/* renamed from: aq */
public class aq {
    /* renamed from: a */
    private static final C0691a f3937a;

    /* compiled from: ViewGroupUtils */
    /* renamed from: aq$a */
    interface C0691a {
        /* renamed from: a */
        void mo609a(ViewGroup viewGroup, View view, Rect rect);
    }

    /* compiled from: ViewGroupUtils */
    /* renamed from: aq$b */
    static class C0692b implements C0691a {
        C0692b() {
        }

        /* renamed from: a */
        public void mo609a(ViewGroup viewGroup, View view, Rect rect) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(view.getScrollX(), view.getScrollY());
        }
    }

    /* compiled from: ViewGroupUtils */
    /* renamed from: aq$c */
    static class C0693c implements C0691a {
        C0693c() {
        }

        /* renamed from: a */
        public void mo609a(ViewGroup viewGroup, View view, Rect rect) {
            ar.m5018a(viewGroup, view, rect);
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            f3937a = new C0693c();
        } else {
            f3937a = new C0692b();
        }
    }

    /* renamed from: a */
    static void m4902a(ViewGroup viewGroup, View view, Rect rect) {
        f3937a.mo609a(viewGroup, view, rect);
    }

    /* renamed from: b */
    public static void m4903b(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        aq.m4902a(viewGroup, view, rect);
    }
}

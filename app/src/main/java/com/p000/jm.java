package com.p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewParent;
import android.view.WindowInsets;

@TargetApi(21)
/* compiled from: ViewCompatLollipop */
/* renamed from: jm */
class jm {
    /* renamed from: a */
    private static ThreadLocal<Rect> f24284a;

    /* compiled from: ViewCompatLollipop */
    /* renamed from: jm$a */
    public interface C5438a {
        /* renamed from: a */
        Object mo5019a(View view, Object obj);
    }

    /* renamed from: a */
    public static String m31740a(View view) {
        return view.getTransitionName();
    }

    /* renamed from: b */
    public static void m31747b(View view) {
        view.requestApplyInsets();
    }

    /* renamed from: a */
    public static void m31741a(View view, float f) {
        view.setElevation(f);
    }

    /* renamed from: c */
    public static float m31749c(View view) {
        return view.getElevation();
    }

    /* renamed from: d */
    public static float m31750d(View view) {
        return view.getTranslationZ();
    }

    /* renamed from: a */
    public static void m31745a(View view, final C5438a c5438a) {
        if (c5438a == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return (WindowInsets) c5438a.mo5019a(view, windowInsets);
                }
            });
        }
    }

    /* renamed from: e */
    static ColorStateList m31751e(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: a */
    static void m31743a(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
        if (VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            Object obj = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? null : 1;
            if (background != null && obj != null) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    /* renamed from: f */
    static Mode m31752f(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: a */
    static void m31744a(View view, Mode mode) {
        view.setBackgroundTintMode(mode);
        if (VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            Object obj = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? null : 1;
            if (background != null && obj != null) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    /* renamed from: a */
    public static Object m31739a(View view, Object obj) {
        WindowInsets windowInsets = (WindowInsets) obj;
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            return new WindowInsets(onApplyWindowInsets);
        }
        return obj;
    }

    /* renamed from: b */
    public static Object m31746b(View view, Object obj) {
        WindowInsets windowInsets = (WindowInsets) obj;
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            return new WindowInsets(dispatchApplyWindowInsets);
        }
        return obj;
    }

    /* renamed from: g */
    public static boolean m31753g(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: h */
    public static void m31754h(View view) {
        view.stopNestedScroll();
    }

    /* renamed from: i */
    public static float m31755i(View view) {
        return view.getZ();
    }

    /* renamed from: a */
    static void m31742a(View view, int i) {
        Object obj;
        Rect a = jm.m31738a();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            obj = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ? 1 : null;
        } else {
            obj = null;
        }
        jg.m31685a(view, i);
        if (obj != null && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(a);
        }
    }

    /* renamed from: b */
    static void m31748b(View view, int i) {
        Object obj;
        Rect a = jm.m31738a();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            obj = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ? 1 : null;
        } else {
            obj = null;
        }
        jg.m31690b(view, i);
        if (obj != null && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(a);
        }
    }

    /* renamed from: a */
    private static Rect m31738a() {
        if (f24284a == null) {
            f24284a = new ThreadLocal();
        }
        Rect rect = (Rect) f24284a.get();
        if (rect == null) {
            rect = new Rect();
            f24284a.set(rect);
        }
        rect.setEmpty();
        return rect;
    }
}

package com.p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import java.lang.reflect.Field;

@TargetApi(9)
/* compiled from: ViewCompatBase */
/* renamed from: jf */
class jf {
    /* renamed from: a */
    private static Field f24279a;
    /* renamed from: b */
    private static boolean f24280b;
    /* renamed from: c */
    private static Field f24281c;
    /* renamed from: d */
    private static boolean f24282d;

    /* renamed from: a */
    static ColorStateList m31669a(View view) {
        return view instanceof ja ? ((ja) view).getSupportBackgroundTintList() : null;
    }

    /* renamed from: a */
    static void m31671a(View view, ColorStateList colorStateList) {
        if (view instanceof ja) {
            ((ja) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: b */
    static Mode m31673b(View view) {
        return view instanceof ja ? ((ja) view).getSupportBackgroundTintMode() : null;
    }

    /* renamed from: a */
    static void m31672a(View view, Mode mode) {
        if (view instanceof ja) {
            ((ja) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: c */
    static boolean m31675c(View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: d */
    static int m31676d(View view) {
        if (!f24280b) {
            try {
                f24279a = View.class.getDeclaredField("mMinWidth");
                f24279a.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f24280b = true;
        }
        if (f24279a != null) {
            try {
                return ((Integer) f24279a.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    /* renamed from: e */
    static int m31677e(View view) {
        if (!f24282d) {
            try {
                f24281c = View.class.getDeclaredField("mMinHeight");
                f24281c.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f24282d = true;
        }
        if (f24281c != null) {
            try {
                return ((Integer) f24281c.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    /* renamed from: f */
    static boolean m31678f(View view) {
        return view.getWindowToken() != null;
    }

    /* renamed from: a */
    static void m31670a(View view, int i) {
        int top = view.getTop();
        view.offsetTopAndBottom(i);
        if (i != 0) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                int abs = Math.abs(i);
                ((View) parent).invalidate(view.getLeft(), top - abs, view.getRight(), (top + view.getHeight()) + abs);
                return;
            }
            view.invalidate();
        }
    }

    /* renamed from: b */
    static void m31674b(View view, int i) {
        int left = view.getLeft();
        view.offsetLeftAndRight(i);
        if (i != 0) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                int abs = Math.abs(i);
                ((View) parent).invalidate(left - abs, view.getTop(), (left + view.getWidth()) + abs, view.getBottom());
                return;
            }
            view.invalidate();
        }
    }

    /* renamed from: g */
    static Display m31679g(View view) {
        if (jf.m31678f(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }
}

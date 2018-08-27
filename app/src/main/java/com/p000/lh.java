package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;

@TargetApi(21)
/* compiled from: DrawerLayoutCompatApi21 */
/* renamed from: lh */
public class lh {
    /* renamed from: a */
    private static final int[] f24406a = new int[]{16843828};

    /* compiled from: DrawerLayoutCompatApi21 */
    /* renamed from: lh$a */
    static class C5509a implements OnApplyWindowInsetsListener {
        C5509a() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((li) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: a */
    public static void m32400a(View view) {
        if (view instanceof li) {
            view.setOnApplyWindowInsetsListener(new C5509a());
            view.setSystemUiVisibility(1280);
        }
    }

    /* renamed from: a */
    public static void m32401a(View view, Object obj, int i) {
        obj = (WindowInsets) obj;
        if (i == 3) {
            obj = obj.replaceSystemWindowInsets(obj.getSystemWindowInsetLeft(), obj.getSystemWindowInsetTop(), 0, obj.getSystemWindowInsetBottom());
        } else if (i == 5) {
            obj = obj.replaceSystemWindowInsets(0, obj.getSystemWindowInsetTop(), obj.getSystemWindowInsetRight(), obj.getSystemWindowInsetBottom());
        }
        view.dispatchApplyWindowInsets(obj);
    }

    /* renamed from: a */
    public static void m32402a(MarginLayoutParams marginLayoutParams, Object obj, int i) {
        obj = (WindowInsets) obj;
        if (i == 3) {
            obj = obj.replaceSystemWindowInsets(obj.getSystemWindowInsetLeft(), obj.getSystemWindowInsetTop(), 0, obj.getSystemWindowInsetBottom());
        } else if (i == 5) {
            obj = obj.replaceSystemWindowInsets(0, obj.getSystemWindowInsetTop(), obj.getSystemWindowInsetRight(), obj.getSystemWindowInsetBottom());
        }
        marginLayoutParams.leftMargin = obj.getSystemWindowInsetLeft();
        marginLayoutParams.topMargin = obj.getSystemWindowInsetTop();
        marginLayoutParams.rightMargin = obj.getSystemWindowInsetRight();
        marginLayoutParams.bottomMargin = obj.getSystemWindowInsetBottom();
    }

    /* renamed from: a */
    public static int m32398a(Object obj) {
        return obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
    }

    /* renamed from: a */
    public static Drawable m32399a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f24406a);
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            return drawable;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

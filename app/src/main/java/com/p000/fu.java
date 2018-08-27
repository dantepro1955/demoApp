package com.p000;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;

@TargetApi(19)
/* compiled from: DrawableCompatKitKat */
/* renamed from: fu */
class fu {
    /* renamed from: a */
    public static void m30255a(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    /* renamed from: a */
    public static boolean m30256a(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    /* renamed from: b */
    public static Drawable m30257b(Drawable drawable) {
        if (drawable instanceof gb) {
            return drawable;
        }
        return new fz(drawable);
    }

    /* renamed from: c */
    public static int m30258c(Drawable drawable) {
        return drawable.getAlpha();
    }
}

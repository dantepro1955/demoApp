package com.p000;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;

@TargetApi(11)
/* compiled from: DrawableCompatHoneycomb */
/* renamed from: fs */
class fs {
    /* renamed from: a */
    public static void m30251a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: b */
    public static Drawable m30252b(Drawable drawable) {
        if (drawable instanceof gb) {
            return drawable;
        }
        return new fy(drawable);
    }
}

package com.p000;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;

@TargetApi(23)
/* compiled from: DrawableCompatApi23 */
/* renamed from: fq */
class fq {
    /* renamed from: a */
    public static boolean m30245a(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }

    /* renamed from: a */
    public static int m30244a(Drawable drawable) {
        return drawable.getLayoutDirection();
    }
}

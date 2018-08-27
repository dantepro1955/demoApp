package com.p000;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.util.DisplayMetrics;

@TargetApi(9)
/* compiled from: ConfigurationHelperGingerbread */
/* renamed from: fk */
class fk {
    /* renamed from: a */
    static int m30175a(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
    }

    /* renamed from: b */
    static int m30176b(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
    }

    /* renamed from: c */
    static int m30177c(Resources resources) {
        return Math.min(fk.m30176b(resources), fk.m30175a(resources));
    }
}

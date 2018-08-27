package com.p000;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

/* compiled from: ResourcesCompat */
/* renamed from: fm */
public final class fm {
    /* renamed from: a */
    public static Drawable m30181a(Resources resources, int i, Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 21) {
            return fn.m30182a(resources, i, theme);
        }
        return resources.getDrawable(i);
    }
}

package com.p000;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;

@TargetApi(21)
/* compiled from: ResourcesCompatApi21 */
/* renamed from: fn */
class fn {
    /* renamed from: a */
    public static Drawable m30182a(Resources resources, int i, Theme theme) throws NotFoundException {
        return resources.getDrawable(i, theme);
    }
}

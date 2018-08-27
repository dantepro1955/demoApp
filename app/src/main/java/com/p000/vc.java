package com.p000;

import android.content.res.Resources;

/* renamed from: vc */
public class vc {
    /* renamed from: a */
    public static float m34295a(Resources resources, float f) {
        return (resources.getDisplayMetrics().density * f) + 0.5f;
    }

    /* renamed from: b */
    public static float m34296b(Resources resources, float f) {
        return resources.getDisplayMetrics().scaledDensity * f;
    }
}

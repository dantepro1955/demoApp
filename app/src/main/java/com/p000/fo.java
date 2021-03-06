package com.p000;

import android.graphics.Color;

/* compiled from: ColorUtils */
/* renamed from: fo */
public final class fo {
    /* renamed from: a */
    private static final ThreadLocal<double[]> f23711a = new ThreadLocal();

    /* renamed from: a */
    public static int m30183a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int c = fo.m30186c(alpha2, alpha);
        return Color.argb(c, fo.m30184a(Color.red(i), alpha2, Color.red(i2), alpha, c), fo.m30184a(Color.green(i), alpha2, Color.green(i2), alpha, c), fo.m30184a(Color.blue(i), alpha2, Color.blue(i2), alpha, c));
    }

    /* renamed from: c */
    private static int m30186c(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: a */
    private static int m30184a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: b */
    public static int m30185b(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (16777215 & i) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}

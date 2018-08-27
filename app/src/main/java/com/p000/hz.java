package com.p000;

import android.graphics.Rect;
import android.os.Build.VERSION;

/* compiled from: GravityCompat */
/* renamed from: hz */
public final class hz {
    /* renamed from: a */
    static final hz$a f16865a;

    static {
        if (VERSION.SDK_INT >= 17) {
            f16865a = new hz$c();
        } else {
            f16865a = new hz$b();
        }
    }

    /* renamed from: a */
    public static void m21170a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        f16865a.a(i, i2, i3, rect, rect2, i4);
    }

    /* renamed from: a */
    public static int m21169a(int i, int i2) {
        return f16865a.a(i, i2);
    }
}

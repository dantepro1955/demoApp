package com.p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

/* compiled from: ContextCompat */
/* renamed from: ew */
public class ew {
    /* renamed from: a */
    private static final Object f16859a = new Object();
    /* renamed from: b */
    private static TypedValue f16860b;

    /* renamed from: a */
    public static boolean m21137a(Context context, Intent[] intentArr, Bundle bundle) {
        int i = VERSION.SDK_INT;
        if (i >= 16) {
            fb.a(context, intentArr, bundle);
            return true;
        } else if (i < 11) {
            return false;
        } else {
            fa.a(context, intentArr);
            return true;
        }
    }

    /* renamed from: a */
    public static File[] m21139a(Context context, String str) {
        if (VERSION.SDK_INT >= 19) {
            return fc.a(context, str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: a */
    public static File[] m21138a(Context context) {
        if (VERSION.SDK_INT >= 19) {
            return fc.a(context);
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: a */
    public static final Drawable m21136a(Context context, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 21) {
            return ex.a(context, i);
        }
        if (i2 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f16859a) {
            if (f16860b == null) {
                f16860b = new TypedValue();
            }
            context.getResources().getValue(i, f16860b, true);
            i2 = f16860b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: b */
    public static final ColorStateList m21141b(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return ey.a(context, i);
        }
        return context.getResources().getColorStateList(i);
    }

    /* renamed from: c */
    public static final int m21143c(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return ey.b(context, i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: b */
    public static int m21140b(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static boolean m21142b(Context context) {
        if (gr.a()) {
            return ez.a(context);
        }
        return false;
    }
}

package com.p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import p000.dcf.C4791b;

/* compiled from: NavbarUtils */
/* renamed from: dcc */
public final class dcc {
    /* renamed from: a */
    public static int m26358a(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        return identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
    }

    /* renamed from: b */
    public static boolean m26359b(Context context) {
        return dcc.m26360c(context) && dcc.m26361d(context);
    }

    /* renamed from: c */
    private static boolean m26360c(Context context) {
        return context.getResources().getBoolean(C4791b.bb_bottom_bar_is_portrait_mode);
    }

    /* renamed from: d */
    private static boolean m26361d(Context context) {
        boolean z;
        if (VERSION.SDK_INT >= 17) {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            int i2 = displayMetrics.widthPixels;
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics2);
            z = i2 - displayMetrics2.widthPixels > 0 || i - displayMetrics2.heightPixels > 0;
            return z;
        } else if (VERSION.SDK_INT < 14) {
            return true;
        } else {
            z = ViewConfiguration.get(context).hasPermanentMenuKey();
            boolean deviceHasKey = KeyCharacterMap.deviceHasKey(4);
            if (z || deviceHasKey) {
                return false;
            }
            return true;
        }
    }
}

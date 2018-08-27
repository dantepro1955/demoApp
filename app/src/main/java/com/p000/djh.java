package com.p000;

import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: DisplayMetricsUtil */
/* renamed from: djh */
public class djh {
    /* renamed from: a */
    static float f21805a = 0.0f;

    /* renamed from: a */
    public static int m27572a(Context context, int i) {
        if (f21805a == 0.0f) {
            f21805a = context.getResources().getDisplayMetrics().density;
        }
        return (int) ((((float) i) * f21805a) + 0.5f);
    }

    /* renamed from: a */
    public static Point m27573a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (VERSION.SDK_INT < 11) {
            return new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        }
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }
}

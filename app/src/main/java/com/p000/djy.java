package com.p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: UiUtil */
/* renamed from: djy */
public class djy {
    /* renamed from: a */
    public static int m27638a(boolean z) {
        return z ? 0 : 8;
    }

    /* renamed from: a */
    public static int m27637a(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    /* renamed from: a */
    public static boolean m27641a() {
        return VERSION.SDK_INT >= 14;
    }

    /* renamed from: b */
    public static boolean m27643b(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    /* renamed from: a */
    public static TextView m27639a(View view, int i) {
        return (TextView) view.findViewById(i);
    }

    /* renamed from: b */
    public static ImageView m27642b(View view, int i) {
        return (ImageView) view.findViewById(i);
    }

    /* renamed from: c */
    public static Button m27645c(View view, int i) {
        return (Button) view.findViewById(i);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public static Point m27644c(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (VERSION.SDK_INT < 13) {
            point.x = defaultDisplay.getWidth();
            point.y = defaultDisplay.getHeight();
        } else {
            defaultDisplay.getSize(point);
        }
        return point;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m27640a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static float m27636a(float f, Context context) {
        return (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f) * f;
    }
}

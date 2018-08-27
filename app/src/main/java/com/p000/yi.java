package com.p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: yi */
public class yi {
    /* renamed from: a */
    public static Point m34892a(Context context) {
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            if (VERSION.SDK_INT >= 13) {
                defaultDisplay.getSize(point);
            } else {
                point.x = defaultDisplay.getWidth();
                point.y = defaultDisplay.getHeight();
            }
        } catch (Throwable th) {
        }
        return point;
    }

    /* renamed from: a */
    static void m34893a() {
        try {
            if (VERSION.SDK_INT >= 9) {
                StrictMode.setThreadPolicy(new Builder().permitAll().build());
            }
        } catch (Throwable th) {
        }
    }

    /* renamed from: a */
    public static boolean m34894a(Class cls, Context context) {
        return context.getPackageManager().resolveActivity(new Intent(context, cls), 0) != null;
    }

    /* renamed from: a */
    public static boolean m34895a(String str, Context context) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: b */
    public static boolean m34896b() {
        return VERSION.SDK_INT >= 15;
    }

    /* renamed from: c */
    public static boolean m34897c() {
        return VERSION.SDK_INT >= 19;
    }
}

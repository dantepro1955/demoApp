package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: DeviceHelper */
/* renamed from: dtg */
public class dtg {
    /* renamed from: a */
    public static String m29255a() {
        return Locale.getDefault().getLanguage();
    }

    /* renamed from: b */
    public static String m29257b() {
        return Locale.getDefault().getCountry();
    }

    /* renamed from: c */
    public static String m29258c() {
        return System.getProperty("http.agent");
    }

    @TargetApi(17)
    /* renamed from: a */
    public static int[] m29256a(Context context) {
        int i;
        int i2;
        try {
            DisplayMetrics displayMetrics;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            if (VERSION.SDK_INT >= 17) {
                displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
                i2 = displayMetrics.heightPixels;
            } else if (VERSION.SDK_INT >= 14) {
                try {
                    Method method = Display.class.getMethod("getRawWidth", new Class[0]);
                    Method method2 = Display.class.getMethod("getRawHeight", new Class[0]);
                    i = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                    try {
                        i2 = ((Integer) method2.invoke(defaultDisplay, new Object[0])).intValue();
                    } catch (Exception e) {
                        i2 = i;
                        dth.m29262c("PIWIK:DeviceHelper", "Reflection of getRawWidth/getRawHeight failed on API14-16 unexpectedly.");
                        i = i2;
                        i2 = -1;
                        displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        i = displayMetrics.widthPixels;
                        i2 = displayMetrics.heightPixels;
                        return new int[]{i, i2};
                    }
                } catch (Exception e2) {
                    i2 = -1;
                    dth.m29262c("PIWIK:DeviceHelper", "Reflection of getRawWidth/getRawHeight failed on API14-16 unexpectedly.");
                    i = i2;
                    i2 = -1;
                    displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    i = displayMetrics.widthPixels;
                    i2 = displayMetrics.heightPixels;
                    return new int[]{i, i2};
                }
            } else {
                i2 = -1;
                i = -1;
            }
            if (i == -1 || r0 == -1) {
                displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
                i2 = displayMetrics.heightPixels;
            }
            return new int[]{i, i2};
        } catch (NullPointerException e3) {
            dth.m29263d("PIWIK:DeviceHelper", "Window service was not available from this context");
            return null;
        }
    }
}

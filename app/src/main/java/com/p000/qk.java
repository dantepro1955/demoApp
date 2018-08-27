package com.p000;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

/* compiled from: ViewUtils */
/* renamed from: qk */
public class qk {
    /* renamed from: a */
    private static Method f25239a;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f25239a = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                if (!f25239a.isAccessible()) {
                    f25239a.setAccessible(true);
                }
            } catch (NoSuchMethodException e) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static boolean m33882a(View view) {
        return jd.g(view) == 1;
    }

    /* renamed from: a */
    public static int m33880a(int i, int i2) {
        return i | i2;
    }

    /* renamed from: a */
    public static void m33881a(View view, Rect rect, Rect rect2) {
        if (f25239a != null) {
            try {
                f25239a.invoke(view, new Object[]{rect, rect2});
            } catch (Throwable e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: b */
    public static void m33883b(View view) {
        if (VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException e) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (Throwable e2) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
            } catch (Throwable e22) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e22);
            }
        }
    }
}

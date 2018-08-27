package com.p000;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

@TargetApi(17)
/* compiled from: DrawableCompatJellybeanMr1 */
/* renamed from: ft */
class ft {
    /* renamed from: a */
    private static Method f23712a;
    /* renamed from: b */
    private static boolean f23713b;
    /* renamed from: c */
    private static Method f23714c;
    /* renamed from: d */
    private static boolean f23715d;

    /* renamed from: a */
    public static boolean m30254a(Drawable drawable, int i) {
        if (!f23713b) {
            try {
                f23712a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f23712a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f23713b = true;
        }
        if (f23712a != null) {
            try {
                f23712a.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Throwable e2) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f23712a = null;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static int m30253a(Drawable drawable) {
        if (!f23715d) {
            try {
                f23714c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f23714c.setAccessible(true);
            } catch (Throwable e) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve getLayoutDirection() method", e);
            }
            f23715d = true;
        }
        if (f23714c != null) {
            try {
                return ((Integer) f23714c.invoke(drawable, new Object[0])).intValue();
            } catch (Throwable e2) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to invoke getLayoutDirection() via reflection", e2);
                f23714c = null;
            }
        }
        return -1;
    }
}

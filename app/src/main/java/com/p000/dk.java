package com.p000;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(9)
/* compiled from: BundleCompatGingerbread */
/* renamed from: dk */
class dk {
    /* renamed from: a */
    private static Method f21812a;
    /* renamed from: b */
    private static boolean f21813b;

    /* renamed from: a */
    public static IBinder m27649a(Bundle bundle, String str) {
        if (!f21813b) {
            try {
                f21812a = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                f21812a.setAccessible(true);
            } catch (Throwable e) {
                Throwable e2;
                Log.i("BundleCompatGingerbread", "Failed to retrieve getIBinder method", e2);
            }
            f21813b = true;
        }
        if (f21812a != null) {
            try {
                return (IBinder) f21812a.invoke(bundle, new Object[]{str});
            } catch (InvocationTargetException e3) {
                e2 = e3;
            } catch (IllegalAccessException e4) {
                e2 = e4;
            } catch (IllegalArgumentException e5) {
                e2 = e5;
            }
        }
        return null;
        Log.i("BundleCompatGingerbread", "Failed to invoke getIBinder via reflection", e2);
        f21812a = null;
        return null;
    }
}

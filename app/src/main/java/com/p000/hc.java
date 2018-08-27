package com.p000;

import android.annotation.TargetApi;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Locale;

@TargetApi(14)
/* compiled from: ICUCompatIcs */
/* renamed from: hc */
class hc {
    /* renamed from: a */
    private static Method f23753a;
    /* renamed from: b */
    private static Method f23754b;

    static {
        try {
            Class cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f23753a = cls.getMethod("getScript", new Class[]{String.class});
                f23754b = cls.getMethod("addLikelySubtags", new Class[]{String.class});
            }
        } catch (Throwable e) {
            f23753a = null;
            f23754b = null;
            Log.w("ICUCompatIcs", e);
        }
    }

    /* renamed from: a */
    public static String m30502a(Locale locale) {
        String b = hc.m30503b(locale);
        if (b != null) {
            return hc.m30501a(b);
        }
        return null;
    }

    /* renamed from: a */
    private static String m30501a(String str) {
        try {
            if (f23753a != null) {
                return (String) f23753a.invoke(null, new Object[]{str});
            }
        } catch (Throwable e) {
            Log.w("ICUCompatIcs", e);
        } catch (Throwable e2) {
            Log.w("ICUCompatIcs", e2);
        }
        return null;
    }

    /* renamed from: b */
    private static String m30503b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f23754b != null) {
                return (String) f23754b.invoke(null, new Object[]{locale2});
            }
        } catch (Throwable e) {
            Log.w("ICUCompatIcs", e);
        } catch (Throwable e2) {
            Log.w("ICUCompatIcs", e2);
        }
        return locale2;
    }
}

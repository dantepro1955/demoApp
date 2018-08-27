package com.p000;

import android.annotation.TargetApi;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Locale;

@TargetApi(23)
/* compiled from: ICUCompatApi23 */
/* renamed from: hb */
class hb {
    /* renamed from: a */
    private static Method f23752a;

    static {
        try {
            f23752a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public static String m30500a(Locale locale) {
        try {
            return ((Locale) f23752a.invoke(null, new Object[]{locale})).getScript();
        } catch (Throwable e) {
            Log.w("ICUCompatIcs", e);
            return locale.getScript();
        } catch (Throwable e2) {
            Log.w("ICUCompatIcs", e2);
            return locale.getScript();
        }
    }
}

package com.p000;

import android.content.Context;
import android.net.Uri;
import com.inmobi.commons.analytics.iat.impl.AdTrackerConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: brc */
public class brc {
    /* renamed from: a */
    static Map<String, String> f7436a = new HashMap();
    /* renamed from: b */
    private static String f7437b;

    /* renamed from: a */
    public static String m10489a(String str, String str2) {
        if (str2 == null) {
            return str.length() > 0 ? str : null;
        } else {
            String str3 = "http://hostname/?";
            String valueOf = String.valueOf(str);
            return Uri.parse(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3)).getQueryParameter(str2);
        }
    }

    /* renamed from: a */
    public static void m10490a(Context context, String str) {
        brx.m10575a(context, "gtm_install_referrer", AdTrackerConstants.REFERRER, str);
        brc.m10492b(context, str);
    }

    /* renamed from: a */
    public static void m10491a(String str) {
        synchronized (brc.class) {
            f7437b = str;
        }
    }

    /* renamed from: b */
    public static void m10492b(Context context, String str) {
        String a = brc.m10489a(str, "conv");
        if (a != null && a.length() > 0) {
            f7436a.put(a, str);
            brx.m10575a(context, "gtm_click_referrers", a, str);
        }
    }
}

package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.stetho.common.Utf8Charset;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: bof */
public class bof {
    /* renamed from: a */
    private static final char[] f7249a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static double m10128a(String str, double d) {
        if (str != null) {
            try {
                d = Double.parseDouble(str);
            } catch (NumberFormatException e) {
            }
        }
        return d;
    }

    /* renamed from: a */
    public static long m10129a(String str) {
        long j = 0;
        if (str != null) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException e) {
            }
        }
        return j;
    }

    /* renamed from: a */
    public static bme m10130a(bnx bnx, String str) {
        aoi.m4679a((Object) bnx);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            String str2 = "?";
            String valueOf = String.valueOf(str);
            Map a = aqa.m4905a(new URI(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)), Utf8Charset.NAME);
            bme bme = new bme();
            bme.m9633e((String) a.get("utm_content"));
            bme.m9629c((String) a.get("utm_medium"));
            bme.m9625a((String) a.get("utm_campaign"));
            bme.m9627b((String) a.get("utm_source"));
            bme.m9631d((String) a.get("utm_term"));
            bme.m9635f((String) a.get("utm_id"));
            bme.m9637g((String) a.get("anid"));
            bme.m9639h((String) a.get("gclid"));
            bme.m9641i((String) a.get("dclid"));
            bme.m9643j((String) a.get("aclid"));
            return bme;
        } catch (URISyntaxException e) {
            bnx.zzd("No valid campaign data found", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m10131a(Locale locale) {
        if (locale == null) {
            return null;
        }
        Object language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(language.toLowerCase());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            stringBuilder.append("-").append(locale.getCountry().toLowerCase());
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m10132a(boolean z) {
        return z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
    }

    /* renamed from: a */
    public static void m10133a(Map<String, String> map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    /* renamed from: a */
    public static void m10134a(Map<String, String> map, String str, Map<String, String> map2) {
        bof.m10133a((Map) map, str, (String) map2.get(str));
    }

    /* renamed from: a */
    public static void m10135a(Map<String, String> map, String str, boolean z) {
        if (!map.containsKey(str)) {
            map.put(str, z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
    }

    /* renamed from: a */
    public static boolean m10136a(double d, String str) {
        return d > 0.0d && d < 100.0d && ((double) (bof.m10142c(str) % 10000)) >= 100.0d * d;
    }

    /* renamed from: a */
    public static boolean m10137a(Context context, String str) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, str), 4);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
        } catch (NameNotFoundException e) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m10138a(Context context, String str, boolean z) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 2);
            if (receiverInfo != null && receiverInfo.enabled && (!z || receiverInfo.exported)) {
                return true;
            }
        } catch (NameNotFoundException e) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m10139a(String str, boolean z) {
        return str != null ? (str.equalsIgnoreCase(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE) || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("1")) ? true : (str.equalsIgnoreCase("false") || str.equalsIgnoreCase("no") || str.equalsIgnoreCase(AppEventsConstants.EVENT_PARAM_VALUE_NO)) ? false : z : z;
    }

    /* renamed from: b */
    public static MessageDigest m10140b(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m10141b(Map<String, String> map, String str, String str2) {
        if (str2 != null && TextUtils.isEmpty((CharSequence) map.get(str))) {
            map.put(str, str2);
        }
    }

    /* renamed from: c */
    public static int m10142c(String str) {
        int i = 1;
        if (!TextUtils.isEmpty(str)) {
            i = 0;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                i = (((i << 6) & 268435455) + charAt) + (charAt << 14);
                int i2 = 266338304 & i;
                if (i2 != 0) {
                    i ^= i2 >> 21;
                }
            }
        }
        return i;
    }

    /* renamed from: d */
    public static boolean m10143d(String str) {
        return TextUtils.isEmpty(str) || !str.startsWith("http:");
    }
}

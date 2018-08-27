package com.p000;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.places.model.PlaceFields;
import java.util.HashMap;

/* compiled from: RemoteConfigApiUtil */
/* renamed from: dmk */
public class dmk {
    /* renamed from: a */
    public static String m28030a(dmj dmj, String str, String str2) {
        return dmk.m28032a(dmj, str, str2, null, null);
    }

    /* renamed from: a */
    public static String m28032a(dmj dmj, String str, String str2, String str3, String str4) {
        HashMap a = dna.m28177a(dmj.m28011b());
        if (!TextUtils.isEmpty(str)) {
            a.put("userId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            a.put("deviceId", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            a.put("bucketName", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            a.put(PlaceFields.LOCATION, str4);
        }
        a.put("signature", dna.m28175a(dmj, a));
        return dmk.m28029a(dmj, dft.m27073b(dmj.m28011b().m28038d() + "/api/v1/config" + "?" + dna.m28176a(a))).m27114e();
    }

    /* renamed from: b */
    public static String m28033b(dmj dmj, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("appId", dmj.m28011b().m28039e());
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("userId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("deviceId", str2);
        }
        hashMap.put("signature", dna.m28175a(dmj, hashMap));
        return dmk.m28029a(dmj, dft.m27073b(dmj.m28011b().m28038d() + "/api/v1/ad-mobile" + "?" + dna.m28176a(hashMap))).m27114e();
    }

    /* renamed from: a */
    public static String m28031a(dmj dmj, String str, String str2, int i, boolean z) {
        HashMap a = dna.m28177a(dmj.m28011b());
        if (!TextUtils.isEmpty(str)) {
            a.put("userId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            a.put("deviceId", str2);
        }
        if (z) {
            a.put("debugMode", z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
        a.put("buildId", Integer.toString(i));
        a.put("signature", dna.m28175a(dmj, a));
        return dmk.m28029a(dmj, dft.m27073b(dmj.m28011b().m28038d() + "/api/v1/broadcasts" + "?" + dna.m28176a(a))).m27114e();
    }

    /* renamed from: b */
    public static String m28034b(dmj dmj, String str, String str2, int i, boolean z) {
        HashMap a = dna.m28177a(dmj.m28011b());
        if (z) {
            a.put("debugMode", z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
        a.put("signature", dna.m28175a(dmj, a));
        return dmk.m28029a(dmj, dft.m27073b(dmj.m28011b().m28038d() + "/api/v1/app-links" + "?" + dna.m28176a(a))).m27114e();
    }

    /* renamed from: a */
    private static dft m28029a(dmj dmj, dft dft) {
        dft.m27087a("X-Package-ID", dmj.m28011b().m28035a());
        dft.m27086a("X-Package-Version", Integer.valueOf(dmj.m28011b().m28036b()));
        dft.m27087a("X-Device-UUID", dmj.m28011b().m28037c());
        return dft;
    }
}

package com.p000;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: bon */
public class bon {
    /* renamed from: a */
    public static String m10170a(String str) {
        boolean z = false;
        aoi.m4689b(!TextUtils.isEmpty(str), "account type cannot be empty");
        String scheme = Uri.parse(str).getScheme();
        if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            z = true;
        }
        aoi.m4689b(z, "Account type must be an http or https URI");
        return str;
    }
}

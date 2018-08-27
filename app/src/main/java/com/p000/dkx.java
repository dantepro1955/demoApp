package com.p000;

import android.text.TextUtils;
import com.under9.android.lib.network.model.Constants;

/* compiled from: CacheUtil */
/* renamed from: dkx */
public final class dkx {
    /* renamed from: a */
    public static String m27766a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.substring(str.lastIndexOf(Constants.SEP) + 1, str.lastIndexOf(".")).toLowerCase();
    }
}

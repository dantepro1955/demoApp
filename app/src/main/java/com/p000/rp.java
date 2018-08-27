package com.p000;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.applinks.AppLinkData;

/* compiled from: AppLinks */
/* renamed from: rp */
public final class rp {
    /* renamed from: a */
    public static Bundle m33977a(Intent intent) {
        return intent.getBundleExtra("al_applink_data");
    }

    /* renamed from: b */
    public static Bundle m33978b(Intent intent) {
        Bundle a = rp.m33977a(intent);
        if (a == null) {
            return null;
        }
        return a.getBundle(AppLinkData.ARGUMENTS_EXTRAS_KEY);
    }
}

package com.p000;

import android.content.Context;
import android.os.Bundle;

/* compiled from: ManifestUnityVersionProvider */
/* renamed from: abx */
class abx implements acm {
    /* renamed from: a */
    private final Context f297a;
    /* renamed from: b */
    private final String f298b;

    public abx(Context context, String str) {
        this.f297a = context;
        this.f298b = str;
    }

    /* renamed from: a */
    public String mo26a() {
        String str = null;
        try {
            Bundle bundle = this.f297a.getPackageManager().getApplicationInfo(this.f298b, 128).metaData;
            if (bundle != null) {
                str = bundle.getString("io.fabric.unity.crashlytics.version");
            }
        } catch (Exception e) {
        }
        return str;
    }
}

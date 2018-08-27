package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import java.io.File;

@TargetApi(19)
/* compiled from: ContextCompatKitKat */
/* renamed from: fc */
class fc {
    /* renamed from: a */
    public static File[] m30148a(Context context) {
        return context.getExternalCacheDirs();
    }

    /* renamed from: a */
    public static File[] m30149a(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }
}

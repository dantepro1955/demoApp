package com.p000;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;

@TargetApi(23)
/* compiled from: AppOpsManagerCompat23 */
/* renamed from: de */
class de {
    /* renamed from: a */
    public static String m26738a(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    /* renamed from: a */
    public static int m26737a(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
    }
}

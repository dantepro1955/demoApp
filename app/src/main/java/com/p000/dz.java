package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;

@TargetApi(16)
/* compiled from: NavUtilsJB */
/* renamed from: dz */
class dz {
    /* renamed from: a */
    public static Intent m29905a(Activity activity) {
        return activity.getParentActivityIntent();
    }

    /* renamed from: a */
    public static boolean m29907a(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    /* renamed from: b */
    public static void m29908b(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    /* renamed from: a */
    public static String m29906a(ActivityInfo activityInfo) {
        return activityInfo.parentActivityName;
    }
}

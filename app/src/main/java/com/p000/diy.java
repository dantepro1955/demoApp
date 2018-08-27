package com.p000;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;

/* compiled from: FacebookSdkWrapper */
/* renamed from: diy */
public class diy {
    /* renamed from: a */
    private static boolean f21804a = false;

    /* renamed from: a */
    public static void m27550a(Context context) {
        FacebookSdk.sdkInitialize(context);
    }

    /* renamed from: a */
    public static void m27551a(boolean z) {
        FacebookSdk.setIsDebugEnabled(z);
        f21804a = z;
    }

    /* renamed from: a */
    public static void m27552a(LoggingBehavior... loggingBehaviorArr) {
        for (LoggingBehavior addLoggingBehavior : loggingBehaviorArr) {
            FacebookSdk.addLoggingBehavior(addLoggingBehavior);
        }
    }
}

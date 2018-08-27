package com.p000;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;

/* compiled from: FacebookAppEventsController */
/* renamed from: dix */
public class dix {
    /* renamed from: a */
    private static AppEventsLogger f21803a;

    /* renamed from: a */
    public static void m27544a(Context context) {
        f21803a = AppEventsLogger.newLogger(context);
    }

    /* renamed from: b */
    public static void m27548b(Context context) {
        AppEventsLogger.activateApp(context);
    }

    /* renamed from: c */
    public static void m27549c(Context context) {
        AppEventsLogger.deactivateApp(context);
    }

    /* renamed from: a */
    public static void m27543a() {
        f21803a.logEvent(AppEventsConstants.EVENT_NAME_ACTIVATED_APP);
    }

    /* renamed from: a */
    public static void m27545a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AppEventsConstants.EVENT_PARAM_SEARCH_STRING, str);
        f21803a.logEvent(AppEventsConstants.EVENT_NAME_SEARCHED, bundle);
    }

    /* renamed from: a */
    public static void m27546a(String str, String str2) {
        dix.m27547a(str, str2, null);
    }

    /* renamed from: a */
    public static void m27547a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString(AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, str);
        bundle.putString(AppEventsConstants.EVENT_PARAM_CONTENT_ID, str2);
        if (str3 != null) {
            bundle.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, str3);
        }
        f21803a.logEvent(AppEventsConstants.EVENT_NAME_VIEWED_CONTENT, bundle);
    }
}

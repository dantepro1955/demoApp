package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;

@TargetApi(16)
/* compiled from: ActivityCompatJB */
/* renamed from: dc */
class dc {
    /* renamed from: a */
    public static void m26317a(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    /* renamed from: a */
    public static void m26318a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: a */
    public static void m26316a(Activity activity) {
        activity.finishAffinity();
    }
}

package com.p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: BackgroundBroadcaster */
/* renamed from: dal */
public class dal {
    /* renamed from: a */
    public static void m26046a(Context context, Bundle bundle, boolean z) {
        if (bundle.containsKey("bgn") && "1".equals(bundle.getString("bgn"))) {
            Intent intent = new Intent();
            intent.setAction("com.onesignal.BackgroundBroadcast.RECEIVE");
            intent.setPackage(context.getPackageName());
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putBoolean("isActive", z);
            intent.putExtra("data", bundle2);
            context.sendBroadcast(intent);
            dat.a(dat$c.VERBOSE, "Sent OneSignal BackgroundBroadcaster");
        }
    }
}

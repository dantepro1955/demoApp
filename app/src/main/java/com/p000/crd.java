package com.p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.ninegag.android.app.service.UploadQuotaReminderService;

/* compiled from: UploadQuotaReminderHelper */
/* renamed from: crd */
public class crd {
    /* renamed from: a */
    public static void m24537a(Context context, long j) {
        if (context != null) {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            if (cip.a().ar()) {
                crd.m24538a(context, alarmManager, j, 1);
            }
        }
    }

    /* renamed from: a */
    private static void m24538a(Context context, AlarmManager alarmManager, long j, int i) {
        alarmManager.set(1, j, PendingIntent.getService(context, i, new Intent(context, UploadQuotaReminderService.class), 0));
    }
}

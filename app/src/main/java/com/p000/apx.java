package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: apx */
public final class apx {
    /* renamed from: a */
    private static IntentFilter f3933a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    /* renamed from: b */
    private static long f3934b;
    /* renamed from: c */
    private static float f3935c = Float.NaN;

    @TargetApi(20)
    /* renamed from: a */
    public static int m4894a(Context context) {
        int i = 1;
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f3933a);
        int i2 = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        int i3 = (apx.m4895a(powerManager) ? 1 : 0) << 1;
        if (i2 == 0) {
            i = 0;
        }
        return i3 | i;
    }

    @TargetApi(20)
    /* renamed from: a */
    public static boolean m4895a(PowerManager powerManager) {
        return aqd.m4918h() ? powerManager.isInteractive() : powerManager.isScreenOn();
    }

    /* renamed from: b */
    public static synchronized float m4896b(Context context) {
        float f;
        synchronized (apx.class) {
            if (SystemClock.elapsedRealtime() - f3934b >= 60000 || Float.isNaN(f3935c)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f3933a);
                if (registerReceiver != null) {
                    f3935c = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                f3934b = SystemClock.elapsedRealtime();
                f = f3935c;
            } else {
                f = f3935c;
            }
        }
        return f;
    }
}

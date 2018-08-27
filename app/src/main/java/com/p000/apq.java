package com.p000;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.List;

/* renamed from: apq */
public class apq {
    /* renamed from: a */
    private static apq f3926a = new apq();
    /* renamed from: b */
    private static Boolean f3927b;

    /* renamed from: a */
    public static apq m4868a() {
        return f3926a;
    }

    /* renamed from: a */
    private static boolean m4869a(Context context) {
        if (f3927b == null) {
            f3927b = Boolean.valueOf(false);
        }
        return f3927b.booleanValue();
    }

    /* renamed from: a */
    public void m4870a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        m4871a(context, str, i, str2, str3, str4, i2, list, 0);
    }

    /* renamed from: a */
    public void m4871a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        if (!apq.m4869a(context)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            String str5 = "WakeLockTracker";
            String str6 = "missing wakeLock key. ";
            String valueOf = String.valueOf(str);
            Log.e(str5, valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (7 == i || 8 == i || 10 == i || 11 == i) {
            try {
                context.startService(new Intent().setComponent(apn.f3917a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", new WakeLockEvent(currentTimeMillis, i, str2, i2, apo.m4864a((List) list), str, SystemClock.elapsedRealtime(), apx.m4894a(context), str3, apo.m4863a(context.getPackageName()), apx.m4896b(context), j, str4)));
            } catch (Throwable e) {
                Log.wtf("WakeLockTracker", e);
            }
        }
    }
}

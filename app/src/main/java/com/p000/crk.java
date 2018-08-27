package com.p000;

import android.content.Context;
import com.taplytics.sdk.Taplytics;
import java.util.HashMap;

/* compiled from: TaplyticsWrapper */
/* renamed from: crk */
public class crk {
    /* renamed from: a */
    private static boolean f20006a;

    /* renamed from: a */
    public static void m24579a(Context context, String str) {
        if (!f20006a && !cqs.m24512a() && caf.a().h().o() <= caf.a().q().m()) {
            HashMap hashMap = new HashMap();
            hashMap.put("async", Boolean.valueOf(true));
            hashMap.put("retrofit", Boolean.valueOf(true));
            Taplytics.startTaplytics(context, str, hashMap);
            crj.m24574a();
            f20006a = true;
        }
    }
}

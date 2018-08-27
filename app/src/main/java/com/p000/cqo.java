package com.p000;

import java.util.HashMap;

/* compiled from: RateLimitHelper */
/* renamed from: cqo */
public class cqo {
    /* renamed from: a */
    private static HashMap<String, Long> f19988a;

    /* renamed from: a */
    public static boolean m24499a(String str) {
        return cqo.m24500a(str, 500);
    }

    /* renamed from: a */
    public static synchronized boolean m24500a(String str, long j) {
        boolean z = false;
        synchronized (cqo.class) {
            if (f19988a == null) {
                f19988a = new HashMap();
            }
            Long l = (Long) f19988a.get(str);
            f19988a.put(str, Long.valueOf(cqw.m24520a()));
            if (l != null) {
                z = cqw.m24521a(l.longValue()) < j;
            }
        }
        return z;
    }
}

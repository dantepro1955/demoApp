package com.p000;

import com.facebook.common.time.Clock;

/* renamed from: bpp */
public class bpp {
    /* renamed from: a */
    public static long m10354a(long j, long j2) {
        return j >= 0 ? j % j2 : (((Clock.MAX_TIME % j2) + 1) + ((j & Clock.MAX_TIME) % j2)) % j2;
    }
}

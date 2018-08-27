package com.p000;

import com.ninegag.android.common.updatebanner.BroadcastMessage;

/* compiled from: UpdateBannerHelper */
/* renamed from: crb */
public class crb {
    /* renamed from: a */
    public static void m24535a() {
        String br = cip.a().br();
        if (br != null) {
            Object obj = (BroadcastMessage[]) djm.m27592a(br, BroadcastMessage[].class);
            if (obj != null) {
                for (BroadcastMessage broadcastMessage : obj) {
                    if (broadcastMessage.data.recurrenceInterval == 0) {
                        broadcastMessage.lastDisplay = 0;
                        broadcastMessage.nextDisplay = 0;
                    }
                }
                cip.a().z(djm.m27593a(obj));
            }
        }
    }
}

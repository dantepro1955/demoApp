package com.p000;

import android.util.Log;
import com.under9.android.lib.morpheus.api.model.ApiReadStateResponse;

/* compiled from: MorpheusNotifApiHelper */
/* renamed from: dgd */
public class dgd {
    /* renamed from: a */
    public static int m27157a(dga dga) {
        if (dga == null || dga.m27147b() == null) {
            return 0;
        }
        CharSequence d = dgd.m27160d(dga);
        try {
            String e = dga.m27145a(dft.m27073b(d)).m27108d(dga.m27149d()).m27114e();
            if (dga.m27146a()) {
                Log.d("MorpheusNotifApiHelper", "url:" + d + "\nresponse: " + e);
            }
            ApiReadStateResponse apiReadStateResponse = (ApiReadStateResponse) djm.m27592a(e, ApiReadStateResponse.class);
            if (!(apiReadStateResponse == null || apiReadStateResponse.payload == null)) {
                return apiReadStateResponse.payload.unreadCount;
            }
        } catch (Throwable e2) {
            if (dga.m27146a()) {
                Log.d("MorpheusNotifApiHelper", e2.getMessage(), e2);
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static void m27158b(dga dga) {
        try {
            dft e = dga.m27145a(dft.m27076c(dgd.m27159c(dga))).m27108d(dga.m27149d()).m27111e(dgd.m27161e(dga));
            e.m27100b();
            ApiReadStateResponse apiReadStateResponse = (ApiReadStateResponse) djm.m27592a(e.m27114e(), ApiReadStateResponse.class);
            if (apiReadStateResponse != null && apiReadStateResponse.payload == null) {
            }
        } catch (Throwable e2) {
            if (dga.m27146a()) {
                Log.d("MorpheusNotifApiHelper", e2.getMessage(), e2);
            }
        }
    }

    /* renamed from: c */
    public static String m27159c(dga dga) {
        return dga.m27148c() + "/v1/read-state.json";
    }

    /* renamed from: d */
    public static String m27160d(dga dga) {
        return dgd.m27159c(dga) + "?" + dgd.m27161e(dga);
    }

    /* renamed from: e */
    public static String m27161e(dga dga) {
        return dga.m27147b() + "&pretty=" + dga.m27150e();
    }
}

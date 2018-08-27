package com.p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.facebook.places.model.PlaceFields;

/* compiled from: OSUtils */
/* renamed from: das */
class das {
    das() {
    }

    /* renamed from: a */
    int m26100a() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return 2;
        } catch (ClassNotFoundException e) {
            return 1;
        }
    }

    /* renamed from: b */
    Integer m26101b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) dat.f16711c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1 || type == 9) {
            return Integer.valueOf(0);
        }
        return Integer.valueOf(1);
    }

    /* renamed from: c */
    String m26102c() {
        String networkOperatorName = ((TelephonyManager) dat.f16711c.getSystemService(PlaceFields.PHONE)).getNetworkOperatorName();
        return "".equals(networkOperatorName) ? null : networkOperatorName;
    }

    /* renamed from: a */
    static String m26099a(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(str);
        } catch (Throwable th) {
            dat.a(dat$c.ERROR, "", th);
            return null;
        }
    }
}

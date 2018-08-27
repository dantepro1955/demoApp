package com.p000;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

/* compiled from: AdvertisingIdProviderGPS */
/* renamed from: dai */
class dai implements daj {
    dai() {
    }

    /* renamed from: a */
    public String mo4299a(Context context) {
        try {
            Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo.getId();
            if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                return "OptedOut";
            }
            return id;
        } catch (Throwable th) {
            dat.a(dat$c.INFO, "Error getting Google Ad id: ", th);
            return null;
        }
    }
}

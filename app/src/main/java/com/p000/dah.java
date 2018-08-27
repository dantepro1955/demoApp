package com.p000;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.places.model.PlaceFields;
import java.util.Arrays;
import java.util.List;

/* compiled from: AdvertisingIdProviderFallback */
/* renamed from: dah */
class dah implements daj {
    /* renamed from: a */
    private static final List<String> f20932a = Arrays.asList(new String[]{"", AppEventsConstants.EVENT_PARAM_VALUE_NO, "unknown", "739463", "000000000000000", "111111111111111", "352005048247251", "012345678912345", "012345678901237", "88508850885050", "0123456789abcde", "004999010640000", "862280010599525", "52443443484950", "355195000000017", "001068000000006", "358673013795895", "355692547693084", "004400152020000", "8552502717594321", "113456798945455", "012379000772883", "111111111111119", "358701042909755", "358000043654134", "345630000000115", "356299046587760", "356591000000222"});

    dah() {
    }

    /* renamed from: a */
    public String mo4299a(Context context) {
        String b = m26037b(context);
        if (b != null) {
            return b;
        }
        b = m26038c(context);
        return b == null ? m26039d(context) : b;
    }

    /* renamed from: b */
    private String m26037b(Context context) {
        try {
            String deviceId = ((TelephonyManager) context.getSystemService(PlaceFields.PHONE)).getDeviceId();
            if (!(deviceId == null || f20932a.contains(deviceId))) {
                return deviceId;
            }
        } catch (RuntimeException e) {
        }
        return null;
    }

    /* renamed from: c */
    private String m26038c(Context context) {
        try {
            String string = Secure.getString(context.getContentResolver(), "android_id");
            if (string != "9774d56d682e549c") {
                return string;
            }
        } catch (RuntimeException e) {
        }
        return null;
    }

    /* renamed from: d */
    private String m26039d(Context context) {
        try {
            if (VERSION.SDK_INT < 23) {
                return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            }
        } catch (RuntimeException e) {
        }
        return null;
    }
}

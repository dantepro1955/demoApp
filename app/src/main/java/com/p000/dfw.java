package com.p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.HashMap;

/* compiled from: InfoFetcher */
/* renamed from: dfw */
public class dfw {
    /* renamed from: i */
    public HashMap<String, String> m27023i() {
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("devModel", Build.MODEL);
        hashMap.put("devOsVersion", VERSION.RELEASE);
        hashMap.put("devPlatform", Build.DEVICE);
        hashMap.put("devBuildId", Build.ID);
        hashMap.put("devBuildFingerprint", Build.FINGERPRINT);
        hashMap.put("devProduct", Build.PRODUCT);
        hashMap.put("devSdkVersion", "" + VERSION.SDK_INT);
        hashMap.put("devDiskSpace", mo4390a());
        return hashMap;
    }

    /* renamed from: d */
    public HashMap<String, String> m27022d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        HashMap<String, String> hashMap = new HashMap();
        if (activeNetworkInfo != null) {
            hashMap.put("networkNetworkType", activeNetworkInfo.getTypeName() + " " + activeNetworkInfo.getSubtypeName());
        } else {
            hashMap.put("networkNetworkType", "[no network]");
        }
        return hashMap;
    }

    /* renamed from: a */
    private String mo4390a() {
        return "Phone: " + dju.m27627a() + "MB, SD: " + dju.m27628b() + "MB";
    }
}

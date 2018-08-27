package com.p000;

import android.os.Bundle;
import java.util.HashMap;

/* compiled from: BundleUtil */
/* renamed from: djb */
public class djb {
    /* renamed from: a */
    public static HashMap<String, String> m27563a(Bundle bundle, boolean z) {
        HashMap<String, String> hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            if (!z || bundle.getString(str) != null) {
                hashMap.put(str, bundle.getString(str));
            }
        }
        return hashMap;
    }
}

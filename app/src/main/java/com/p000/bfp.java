package com.p000;

import com.millennialmedia.internal.utils.EnvironmentUtils;
import java.util.Map;

@bhd
/* renamed from: bfp */
public class bfp {
    /* renamed from: a */
    private final blo f6002a;
    /* renamed from: b */
    private final boolean f6003b;
    /* renamed from: c */
    private final String f6004c;

    public bfp(blo blo, Map<String, String> map) {
        this.f6002a = blo;
        this.f6004c = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f6003b = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        } else {
            this.f6003b = true;
        }
    }

    /* renamed from: a */
    public void m8178a() {
        if (this.f6002a == null) {
            bky.m9011e("AdWebView is null");
            return;
        }
        int b = EnvironmentUtils.ORIENTATION_PORTRAIT.equalsIgnoreCase(this.f6004c) ? ako.m2345g().mo1263b() : EnvironmentUtils.ORIENTATION_LANDSCAPE.equalsIgnoreCase(this.f6004c) ? ako.m2345g().mo1261a() : this.f6003b ? -1 : ako.m2345g().mo1279c();
        this.f6002a.mo1306b(b);
    }
}

package com.p000;

import com.ninegag.android.app.GagApplication;

/* compiled from: DebugUtil */
/* renamed from: cpp */
public class cpp {
    /* renamed from: a */
    private static caf f19943a = caf.a();

    /* renamed from: a */
    public static String[] m24312a() {
        r0 = new String[8];
        r0[0] = String.format("Version %s", new Object[]{GagApplication.f16514b});
        r0[1] = "Config: app_release.yaml";
        r0[2] = "API";
        r0[3] = "- 9GAG: https://api.9gag.com";
        r0[4] = "- Comment: ";
        r0[5] = "- Notif: http://notif.9gag.com";
        r0[6] = "- Feedback: http://feedback.9gaginc.com";
        r0[7] = "- Remote Config: http://remote-config.9gaginc.com";
        return r0;
    }

    /* renamed from: b */
    public static String[] m24313b() {
        clz q = f19943a.q();
        return new String[]{"Bucket name: " + q.K(), "Features:", "Parameters:", "- gaProfileId: " + q.d(), "- gaSamplingThreshold: " + q.h()};
    }
}

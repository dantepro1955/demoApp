package com.p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: AbstractFeedbackInfoFetcher */
/* renamed from: dfn */
public abstract class dfn extends dfw {
    /* renamed from: a */
    public abstract String mo4390a();

    /* renamed from: b */
    public abstract String m27026b();

    /* renamed from: c */
    public abstract String m27028c();

    /* renamed from: d */
    public abstract String m27030d();

    /* renamed from: e */
    public abstract String m27031e();

    /* renamed from: f */
    public abstract String m27032f();

    /* renamed from: g */
    public abstract String m27033g();

    /* renamed from: h */
    public abstract String m27034h();

    /* renamed from: a */
    public HashMap<String, String> m27025a(Context context) {
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("userId", m27026b());
        hashMap.put("userName", mo4390a());
        try {
            hashMap.put("userLocale", Locale.getDefault().getCountry());
        } catch (Exception e) {
            hashMap.put("userLocale", "");
        }
        return hashMap;
    }

    /* renamed from: b */
    public HashMap<String, String> m27027b(Context context) {
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("sysVersion", m27031e());
        hashMap.put("sysUserIdentity", m27028c());
        hashMap.put("sysBucketName", m27032f());
        hashMap.put("sysSettings", m27030d());
        hashMap.put("sysPushToken", m27033g());
        hashMap.put("sysExperiments", m27034h());
        return hashMap;
    }

    /* renamed from: c */
    public HashMap<String, String> m27029c(Context context) {
        HashMap<String, String> hashMap = new HashMap();
        djn.m27596a(hashMap, m27027b(context));
        djn.m27596a(hashMap, m27025a(context));
        djn.m27596a(hashMap, m27023i());
        djn.m27596a(hashMap, m27022d(context));
        return hashMap;
    }
}

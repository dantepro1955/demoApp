package com.p000;

import android.content.Context;
import android.text.TextUtils;
import com.mopub.mobileads.FlurryAgentWrapper;

/* renamed from: btv */
public final class btv {
    /* renamed from: a */
    private final String f7648a;
    /* renamed from: b */
    private final String f7649b;
    /* renamed from: c */
    private final String f7650c;
    /* renamed from: d */
    private final String f7651d;
    /* renamed from: e */
    private final String f7652e;
    /* renamed from: f */
    private final String f7653f;

    private btv(String str, String str2, String str3, String str4, String str5, String str6) {
        aoi.m4685a(!aqf.m4926a(str), (Object) "ApplicationId must be set.");
        this.f7649b = str;
        this.f7648a = str2;
        this.f7650c = str3;
        this.f7651d = str4;
        this.f7652e = str5;
        this.f7653f = str6;
    }

    /* renamed from: a */
    public static btv m10979a(Context context) {
        aoo aoo = new aoo(context);
        Object a = aoo.m4711a("google_app_id");
        return TextUtils.isEmpty(a) ? null : new btv(a, aoo.m4711a("google_api_key"), aoo.m4711a("firebase_database_url"), aoo.m4711a("ga_trackingId"), aoo.m4711a("gcm_defaultSenderId"), aoo.m4711a("google_storage_bucket"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof btv)) {
            return false;
        }
        btv btv = (btv) obj;
        return aoh.m4677a(this.f7649b, btv.f7649b) && aoh.m4677a(this.f7648a, btv.f7648a) && aoh.m4677a(this.f7650c, btv.f7650c) && aoh.m4677a(this.f7651d, btv.f7651d) && aoh.m4677a(this.f7652e, btv.f7652e) && aoh.m4677a(this.f7653f, btv.f7653f);
    }

    public int hashCode() {
        return aoh.m4675a(this.f7649b, this.f7648a, this.f7650c, this.f7651d, this.f7652e, this.f7653f);
    }

    public String toString() {
        return aoh.m4676a((Object) this).m4674a("applicationId", this.f7649b).m4674a(FlurryAgentWrapper.PARAM_API_KEY, this.f7648a).m4674a("databaseUrl", this.f7650c).m4674a("gcmSenderId", this.f7652e).m4674a("storageBucket", this.f7653f).toString();
    }
}

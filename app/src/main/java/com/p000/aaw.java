package com.p000;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: CheckForUpdatesRequest */
/* renamed from: aaw */
class aaw extends AbstractSpiCall {
    /* renamed from: b */
    private final aay f148b;

    /* renamed from: a */
    static String m133a(String str) {
        return "3:" + str;
    }

    public aaw(Kit kit, String str, String str2, HttpRequestFactory httpRequestFactory, aay aay) {
        super(kit, str, str2, httpRequestFactory, HttpMethod.f24120a);
        this.f148b = aay;
    }

    /* renamed from: a */
    public aax m135a(String str, String str2, aav aav) {
        HttpRequest a;
        Throwable e;
        Throwable th;
        aax aax = null;
        try {
            Map a2 = m134a(aav);
            try {
                a = m132a(a(a2), str, str2);
                Fabric.h().a("Beta", "Checking for updates from " + a());
                Fabric.h().a("Beta", "Checking for updates query params are: " + a2);
                if (a.c()) {
                    Fabric.h().a("Beta", "Checking for updates was successful");
                    aax = this.f148b.m136a(new JSONObject(a.e()));
                    if (a != null) {
                        Fabric.h().a("Fabric", "Checking for updates request ID: " + a.b("X-REQUEST-ID"));
                    }
                } else {
                    Fabric.h().e("Beta", "Checking for updates failed. Response code: " + a.b());
                    if (a != null) {
                        Fabric.h().a("Fabric", "Checking for updates request ID: " + a.b("X-REQUEST-ID"));
                    }
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    Fabric.h().e("Beta", "Error while checking for updates from " + a(), e);
                    if (a != null) {
                        Fabric.h().a("Fabric", "Checking for updates request ID: " + a.b("X-REQUEST-ID"));
                    }
                    return aax;
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        Fabric.h().a("Fabric", "Checking for updates request ID: " + a.b("X-REQUEST-ID"));
                    }
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            a = null;
            Fabric.h().e("Beta", "Error while checking for updates from " + a(), e);
            if (a != null) {
                Fabric.h().a("Fabric", "Checking for updates request ID: " + a.b("X-REQUEST-ID"));
            }
            return aax;
        } catch (Throwable e4) {
            a = null;
            th = e4;
            if (a != null) {
                Fabric.h().a("Fabric", "Checking for updates request ID: " + a.b("X-REQUEST-ID"));
            }
            throw th;
        }
        return aax;
    }

    /* renamed from: a */
    private HttpRequest m132a(HttpRequest httpRequest, String str, String str2) {
        return httpRequest.a("Accept", "application/json").a("User-Agent", "Crashlytics Android SDK/" + this.a.a()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa").a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.a.a()).a("X-CRASHLYTICS-API-KEY", str).a("X-CRASHLYTICS-BETA-TOKEN", aaw.m133a(str2));
    }

    /* renamed from: a */
    private Map<String, String> m134a(aav aav) {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("build_version", aav.f144a);
        hashMap.put("display_version", aav.f145b);
        hashMap.put("instance", aav.f146c);
        hashMap.put("source", "3");
        return hashMap;
    }
}

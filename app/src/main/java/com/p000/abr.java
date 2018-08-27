package com.p000;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.File;
import java.util.Map.Entry;

/* compiled from: DefaultCreateReportSpiCall */
/* renamed from: abr */
class abr extends AbstractSpiCall implements abq {
    public abr(Kit kit, String str, String str2, HttpRequestFactory httpRequestFactory) {
        super(kit, str, str2, httpRequestFactory, HttpMethod.f24121b);
    }

    /* renamed from: a */
    public boolean mo16a(abp abp) {
        HttpRequest a = m354a(m353a(b(), abp), abp.f277b);
        Fabric.h().a("CrashlyticsCore", "Sending report to: " + a());
        int b = a.b();
        Fabric.h().a("CrashlyticsCore", "Create report request ID: " + a.b("X-REQUEST-ID"));
        Fabric.h().a("CrashlyticsCore", "Result was: " + b);
        return ResponseParser.a(b) == 0;
    }

    /* renamed from: a */
    private HttpRequest m353a(HttpRequest httpRequest, abp abp) {
        HttpRequest a = httpRequest.a("X-CRASHLYTICS-API-KEY", abp.f276a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.a.a());
        HttpRequest httpRequest2 = a;
        for (Entry a2 : abp.f277b.mo21e().entrySet()) {
            httpRequest2 = httpRequest2.a(a2);
        }
        return httpRequest2;
    }

    /* renamed from: a */
    private HttpRequest m354a(HttpRequest httpRequest, acg acg) {
        int i = 0;
        httpRequest.e("report[identifier]", acg.mo18b());
        if (acg.mo20d().length == 1) {
            Fabric.h().a("CrashlyticsCore", "Adding single file " + acg.mo17a() + " to report " + acg.mo18b());
            return httpRequest.a("report[file]", acg.mo17a(), "application/octet-stream", acg.mo19c());
        }
        File[] d = acg.mo20d();
        int length = d.length;
        int i2 = 0;
        while (i < length) {
            File file = d[i];
            Fabric.h().a("CrashlyticsCore", "Adding file " + file.getName() + " to report " + acg.mo18b());
            httpRequest.a("report[file" + i2 + "]", file.getName(), "application/octet-stream", file);
            i2++;
            i++;
        }
        return httpRequest;
    }
}

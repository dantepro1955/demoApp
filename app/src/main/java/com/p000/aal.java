package com.p000;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.events.FilesSender;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.File;
import java.util.List;

/* compiled from: SessionAnalyticsFilesSender */
/* renamed from: aal */
class aal extends AbstractSpiCall implements FilesSender {
    /* renamed from: b */
    private final String f78b;

    public aal(Kit kit, String str, String str2, HttpRequestFactory httpRequestFactory, String str3) {
        super(kit, str, str2, httpRequestFactory, HttpMethod.f24121b);
        this.f78b = str3;
    }

    /* renamed from: a */
    public boolean m88a(List<File> list) {
        HttpRequest a = b().a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.a.a()).a("X-CRASHLYTICS-API-KEY", this.f78b);
        int i = 0;
        for (File file : list) {
            a.a("session_analytics_file_" + i, file.getName(), "application/vnd.crashlytics.android.events", file);
            i++;
        }
        Fabric.h().a("Answers", "Sending " + list.size() + " analytics files to " + a());
        int b = a.b();
        Fabric.h().a("Answers", "Response code for analytics file send is " + b);
        if (ResponseParser.a(b) == 0) {
            return true;
        }
        return false;
    }
}

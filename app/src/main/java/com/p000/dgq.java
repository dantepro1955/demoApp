package com.p000;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;

/* compiled from: DomainMapperConfig */
/* renamed from: dgq */
public class dgq {
    /* renamed from: a */
    private String f21576a;
    /* renamed from: b */
    private dfz f21577b;
    /* renamed from: c */
    private OkHttpClient f21578c;

    public dgq(String str) {
        this.f21576a = str;
    }

    /* renamed from: c */
    public String m27225c() {
        return this.f21576a;
    }

    /* renamed from: a */
    public void m27221a(dfz dfz) {
        this.f21577b = dfz;
    }

    /* renamed from: d */
    public dfz m27226d() {
        return this.f21577b;
    }

    /* renamed from: a */
    public boolean m27223a() {
        return false;
    }

    /* renamed from: b */
    public int m27224b() {
        return 5000;
    }

    /* renamed from: e */
    public OkHttpClient m27227e() {
        if (this.f21578c != null) {
            return this.f21578c;
        }
        throw new NullPointerException("Client cannot be null");
    }

    /* renamed from: a */
    public void m27222a(Builder builder) {
        builder.connectTimeout((long) m27224b(), TimeUnit.MILLISECONDS);
        builder.readTimeout((long) m27224b(), TimeUnit.MILLISECONDS);
        this.f21578c = builder.build();
    }
}

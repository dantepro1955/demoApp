package com.p000;

import com.ninegag.android.app.GagApplication;
import com.ninegag.android.app.model.api.ApiService;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* compiled from: ApiServiceManager */
/* renamed from: ckv */
public final class ckv {
    /* renamed from: a */
    private static String f9614a = (cae.m12035a() + "/v2/");
    /* renamed from: b */
    private static ckv f9615b;
    /* renamed from: c */
    private OkHttpClient f9616c;
    /* renamed from: d */
    private ApiService f9617d;
    /* renamed from: e */
    private Builder f9618e;

    private ckv() {
        this(f9614a);
    }

    private ckv(String str) {
        this.f9616c = m14214b();
        Builder addCallAdapterFactory = new Builder().client(this.f9616c).addConverterFactory(GsonConverterFactory.create(cpy.a(2))).addCallAdapterFactory(RxJavaCallAdapterFactory.create());
        if (str == null || str.isEmpty()) {
            str = f9614a;
        }
        this.f9618e = addCallAdapterFactory.baseUrl(str);
        this.f9617d = (ApiService) this.f9618e.build().create(ApiService.class);
    }

    /* renamed from: a */
    public static ApiService m14212a() {
        if (f9615b == null) {
            synchronized (ckv.class) {
                f9615b = new ckv();
            }
        }
        return f9615b.f9617d;
    }

    /* renamed from: b */
    private OkHttpClient m14214b() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(m14215c());
        return builder.build();
    }

    /* renamed from: c */
    private Interceptor m14215c() {
        return ckw.m14216a();
    }

    /* renamed from: a */
    static /* synthetic */ Response m14213a(Chain chain) throws IOException {
        Request request = chain.request();
        String V = caf.m12046a().m12077h().m13861V();
        long currentTimeMillis = System.currentTimeMillis();
        String a = caf.m12046a().m12077h().m13978a(currentTimeMillis);
        String n = caf.m12046a().m12077h().mo1774n();
        Request.Builder newBuilder = request.newBuilder();
        String str = "9GAG-9GAG_TOKEN";
        if (V == null) {
            V = "";
        }
        return chain.proceed(newBuilder.addHeader(str, V).addHeader("9GAG-TIMESTAMP", Long.toString(currentTimeMillis)).addHeader("9GAG-APP_ID", GagApplication.f16513a).addHeader("9GAG-DEVICE_UUID", n).addHeader("9GAG-REQUEST-SIGNATURE", a).addHeader("X-Package-ID", GagApplication.f16513a).addHeader("X-Package-Version", String.valueOf(GagApplication.f16515c)).addHeader("X-Device-UUID", n).build());
    }
}

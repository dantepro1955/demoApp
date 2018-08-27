package com.p000;

import android.content.Context;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiConfigResponse;

/* compiled from: GetConfigTask */
/* renamed from: cmo */
public class cmo extends cmg {
    /* renamed from: b */
    private static caf f9780b = caf.m12046a();
    /* renamed from: c */
    private String f9781c = "";

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiConfigResponse apiConfigResponse = (ApiConfigResponse) apiBaseResponse;
        cip h = f9780b.m12077h();
        h.m13920m(apiConfigResponse.data.configs.bucketName);
        h.m13929o("" + apiConfigResponse.data.configs.features);
        h.m13925n("" + apiConfigResponse.data.configs.parameters);
        h.m13909k(cqw.a());
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiConfigResponse.class);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        this.f9781c = m14491g(context);
        dft b = dft.b(this.f9781c);
        cmg.m14468a(b);
        return b;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/config", new Object[]{cae.m12035a()});
    }

    /* renamed from: m */
    public String mo1806m() {
        return "config";
    }
}

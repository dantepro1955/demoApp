package com.p000;

import android.content.Context;
import android.util.Log;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiUploadConfigResponse;

/* compiled from: GetUploadConfigTask */
/* renamed from: cmx */
public class cmx extends cmg {
    /* renamed from: c */
    private static final caf f9813c = caf.m12046a();
    /* renamed from: b */
    private String f9814b = "";

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiUploadConfigResponse apiUploadConfigResponse = (ApiUploadConfigResponse) apiBaseResponse;
        cip h = f9813c.m12077h();
        h.m13953w(apiUploadConfigResponse.data.titleLengthMax);
        h.m13934q(apiUploadConfigResponse.data.titleLengthMin);
        h.m13950v(apiUploadConfigResponse.data.sectionsCountMax);
        h.m13954w(djm.a(apiUploadConfigResponse.data.hardStopWords));
        h.m13937r(apiUploadConfigResponse.data.maxVideoFilesize);
        h.m13959y(apiUploadConfigResponse.data.maxAnimatedFilesize);
        h.m13940s(apiUploadConfigResponse.data.maxImageFilesize);
        h.m13956x(apiUploadConfigResponse.data.tagsCountMax);
        h.m13947u(apiUploadConfigResponse.data.tagLengthMax);
        h.m13944t(apiUploadConfigResponse.data.tagLengthMin);
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        Log.d("UploadConfig", "parseApiResponse: " + str);
        return (ApiBaseResponse) djm.a(str, ApiUploadConfigResponse.class);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        this.f9814b = m14491g(context);
        dft b = dft.b(this.f9814b);
        cmg.m14468a(b);
        return b;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/upload-config", new Object[]{cae.m12035a()});
    }

    /* renamed from: m */
    public String mo1806m() {
        return "upload-config";
    }
}

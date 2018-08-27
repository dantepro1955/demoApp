package com.p000;

import android.content.Context;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiGag;
import com.ninegag.android.app.model.api.ApiPostsResponse;
import com.ninegag.android.app.otto.response.GagPostResponseEvent;

/* compiled from: GetSinglePostItemTask */
/* renamed from: cmu */
public class cmu extends cmg {
    /* renamed from: b */
    private String f9808b;
    /* renamed from: c */
    private String f9809c;

    public cmu(String str, String str2) {
        this.f9808b = str;
        this.f9809c = str2;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiPostsResponse apiPostsResponse = (ApiPostsResponse) apiBaseResponse;
        if (apiPostsResponse != null && apiPostsResponse.success() && apiPostsResponse.data != null && apiPostsResponse.data.posts != null) {
            ApiGag[] apiGagArr = apiPostsResponse.data.posts;
            if (apiGagArr.length > 0) {
                caf.m12046a().m12075g().f9370c.m13813a(apiGagArr[0]);
                dhe.c(this.f9809c, new GagPostResponseEvent(this.f9808b));
            }
        }
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft b = dft.b(m14491g(context));
        cmg.m14468a(b);
        return b;
    }

    /* renamed from: m */
    public String mo1806m() {
        return this.f9808b;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/post?entryIds=%s&entryTypes=%s", new Object[]{cae.m12035a(), this.f9808b, cps.a()});
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) cpy.a(str, ApiPostsResponse.class, 2);
    }
}

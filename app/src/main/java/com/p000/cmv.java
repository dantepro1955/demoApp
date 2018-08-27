package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.facebook.share.internal.ShareConstants;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiGag;
import com.ninegag.android.app.model.api.ApiPostsResponse;

@Deprecated
/* compiled from: GetSinglePostTask */
/* renamed from: cmv */
public class cmv extends cmg {
    /* renamed from: b */
    private String f9810b;

    public cmv(String str) {
        this.f9810b = str;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiPostsResponse apiPostsResponse = (ApiPostsResponse) apiBaseResponse;
        if (apiPostsResponse != null && apiPostsResponse.success() && apiPostsResponse.data != null && apiPostsResponse.data.posts != null) {
            ApiGag[] apiGagArr = apiPostsResponse.data.posts;
            if (apiGagArr.length > 0) {
                cij.m13687a().m13700a(cko.m14204a(apiGagArr[0]));
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
        return this.f9810b;
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        Intent g = mo1798g();
        g.putExtra(GraphResponse.SUCCESS_KEY, false);
        m14474a(context, g);
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        Intent g = mo1798g();
        g.putExtra(GraphResponse.SUCCESS_KEY, true);
        m14474a(context, g);
    }

    /* renamed from: g */
    public Intent mo1798g() {
        Intent g = super.mo1798g();
        g.putExtra("command", 105);
        g.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, this.f9810b);
        return g;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/post?entryIds=%s&entryTypes=%s", new Object[]{cae.m12035a(), this.f9810b, cps.a()});
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiPostsResponse.class);
    }
}

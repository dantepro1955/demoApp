package com.p000;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.ninegag.android.app.model.api.ApiGag;
import com.ninegag.android.app.model.api.ApiPostsResponse;

/* compiled from: GagPostListResponseProcessor */
/* renamed from: cky */
public class cky extends ckx {
    /* renamed from: a */
    public void mo1778a(ApiPostsResponse apiPostsResponse, csp csp) {
        cgc cgc = (cgc) csp;
        if (apiPostsResponse != null) {
            caf.m12046a().m12075g().m13707a(ckz.m14220a(this, apiPostsResponse, cgc));
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m14217a(cky cky, ApiPostsResponse apiPostsResponse, cgc cgc) {
        String b = cky.mo1779b(apiPostsResponse, cgc);
        if (cgc.e()) {
            caf.m12046a().m12075g().f9370c.m13831h(cgc.m13073b());
        }
        caf.m12046a().m12075g().f9370c.m13821a(cgc.m13073b(), b, apiPostsResponse.data.didEndOfList == 0, apiPostsResponse.data.targetedAdTags == null ? null : apiPostsResponse.data.targetedAdTags.m11072l().toString());
        caf.m12046a().m12075g().f9370c.m13823a(cgc.m13073b(), apiPostsResponse.data.posts);
    }

    /* renamed from: b */
    protected String mo1779b(ApiPostsResponse apiPostsResponse, csp csp) {
        if (apiPostsResponse == null || apiPostsResponse.data == null || apiPostsResponse.data.posts == null) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        ApiGag[] apiGagArr = apiPostsResponse.data.posts;
        String[] strArr = new String[apiGagArr.length];
        int length = apiGagArr.length;
        for (int i = 0; i < length; i++) {
            strArr[i] = apiGagArr[i].id;
        }
        return TextUtils.join(",", strArr);
    }
}

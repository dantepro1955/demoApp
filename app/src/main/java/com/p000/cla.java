package com.p000;

import com.facebook.appevents.AppEventsConstants;
import com.ninegag.android.app.model.api.ApiGag;
import com.ninegag.android.app.model.api.ApiPostsResponse;

/* compiled from: GagPostListSearchResponseProcessor */
/* renamed from: cla */
public class cla extends cky {
    /* renamed from: b */
    protected String mo1779b(ApiPostsResponse apiPostsResponse, csp csp) {
        if (apiPostsResponse == null || apiPostsResponse.data == null || apiPostsResponse.data.posts == null) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        int parseInt;
        ApiGag[] apiGagArr = apiPostsResponse.data.posts;
        try {
            parseInt = (Integer.parseInt(csp.e() ? String.valueOf(0) : caf.m12046a().m12075g().f9370c.m13826c(csp.f20094k)) + apiGagArr.length) + 0;
        } catch (NumberFormatException e) {
            parseInt = apiGagArr.length;
        }
        return parseInt + "";
    }
}

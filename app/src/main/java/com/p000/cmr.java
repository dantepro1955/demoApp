package com.p000;

import android.content.Context;
import android.content.Intent;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiGroup;
import com.ninegag.android.app.model.api.ApiGroupsResponse;
import com.ninegag.android.app.otto.response.GroupListResponseEvent;

/* compiled from: GetGroupListTask */
/* renamed from: cmr */
public class cmr extends cmg {
    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiGroupsResponse apiGroupsResponse = (ApiGroupsResponse) apiBaseResponse;
        if (apiGroupsResponse != null && apiGroupsResponse.success() && apiGroupsResponse.data != null && apiGroupsResponse.data.groups != null) {
            ApiGroup[] apiGroupArr = apiGroupsResponse.data.groups;
            caf.m12046a().m12075g().f9369b.m13684d("exploreList");
            caf.m12046a().m12075g().f9369b.m13681a("exploreList", apiGroupArr);
            caf.m12046a().m12075g().f9369b.m13680a("exploreList", "", false);
            cip.m13967a().m13919m(System.currentTimeMillis());
        }
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft b = dft.b(m14491g(context));
        cmg.m14468a(b);
        return b;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/group-list?entryTypes=%s&locale=%s&withPosts=%s", new Object[]{cae.m12035a(), cps.a(), djo.a(), Integer.valueOf(3)});
    }

    /* renamed from: m */
    public String mo1806m() {
        return "group_list";
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        dhe.c("exploreList", new GroupListResponseEvent("exploreList"));
    }

    /* renamed from: g */
    public Intent mo1798g() {
        Intent g = super.mo1798g();
        g.putExtra("command", 113);
        return g;
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiGroupsResponse.class);
    }
}

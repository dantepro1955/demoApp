package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.under9.android.comments.model.api.ApiHideComment;
import com.under9.android.comments.model.api.ApiResponse;
import com.under9.android.comments.service.TaskQueueService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: HideCommentTask */
/* renamed from: ddw */
public class ddw extends ddn {
    /* renamed from: a */
    private String f21330a;
    /* renamed from: b */
    private String f21331b = "";
    /* renamed from: c */
    private String f21332c;

    public ddw(String str, String str2, String str3) {
        this.f21331b = str;
        this.f21330a = str2;
        this.f21332c = str3;
    }

    /* renamed from: a */
    public ApiResponse mo4337a(String str) {
        return (ApiResponse) djm.m27592a(str, ApiHideComment.class);
    }

    /* renamed from: a */
    public void mo4338a(ApiResponse apiResponse) {
        if (apiResponse != null) {
        }
    }

    /* renamed from: c */
    protected String mo4341c(Context context) {
        return m26646c() + "/v1/op/hide";
    }

    /* renamed from: b */
    protected dft mo4340b(Context context) {
        dft c = dft.m27076c(m26654i(context));
        c.m27087a("appId", dda.m26492a().m26526c());
        Map hashMap = new HashMap();
        hashMap.put("auth", this.f21331b);
        hashMap.put("appId", dda.m26492a().m26526c());
        hashMap.put("url", this.f21330a);
        hashMap.put("commentId", this.f21332c);
        c.m27094a(hashMap);
        return c;
    }

    /* renamed from: e */
    public void mo4343e(Context context) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, true);
        d.putExtra(TaskQueueService.f19251a, 113);
        m26640a(context, d);
    }

    /* renamed from: d */
    public void mo4342d(Context context) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, false);
        d.putExtra(TaskQueueService.f19251a, 113);
        m26640a(context, d);
    }
}

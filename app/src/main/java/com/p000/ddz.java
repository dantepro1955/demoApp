package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.under9.android.comments.model.api.ApiResponse;
import com.under9.android.comments.service.TaskQueueService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ReportCommentTask */
/* renamed from: ddz */
public class ddz extends ddn {
    /* renamed from: a */
    private String f21340a;
    /* renamed from: b */
    private String f21341b = "";
    /* renamed from: c */
    private String f21342c;

    public ddz(String str, String str2, String str3) {
        this.f21341b = str;
        this.f21340a = str2;
        this.f21342c = str3;
    }

    /* renamed from: a */
    public ApiResponse mo4337a(String str) {
        return null;
    }

    /* renamed from: a */
    public void mo4338a(ApiResponse apiResponse) {
        if (apiResponse != null) {
        }
    }

    /* renamed from: b */
    protected dft mo4340b(Context context) {
        dft b = super.mo4340b(context);
        b.m27087a("appId", dda.m26492a().m26526c());
        Map hashMap = new HashMap();
        hashMap.put("auth", this.f21341b);
        hashMap.put("appId", dda.m26492a().m26526c());
        hashMap.put("url", this.f21340a);
        hashMap.put("commentId", this.f21342c);
        b.m27094a(hashMap);
        return b;
    }

    /* renamed from: c */
    protected String mo4341c(Context context) {
        return m26646c() + "/v1/report.json";
    }

    /* renamed from: e */
    public void mo4343e(Context context) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, true);
        d.putExtra(TaskQueueService.f19251a, 112);
        m26640a(context, d);
    }

    /* renamed from: d */
    public void mo4342d(Context context) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, false);
        d.putExtra(TaskQueueService.f19251a, 112);
        m26640a(context, d);
    }
}

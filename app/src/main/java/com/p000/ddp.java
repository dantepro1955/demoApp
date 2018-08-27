package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.under9.android.comments.model.api.ApiCommentDelete;
import com.under9.android.comments.model.api.ApiQuota;
import com.under9.android.comments.model.api.ApiResponse;
import com.under9.android.comments.service.TaskQueueService;

/* compiled from: DeleteCommentTask */
/* renamed from: ddp */
public class ddp extends ddn {
    /* renamed from: a */
    private String f21294a;
    /* renamed from: b */
    private String f21295b = "";
    /* renamed from: c */
    private String f21296c;

    public ddp(String str, String str2, String str3) {
        this.f21295b = str;
        this.f21294a = str2;
        this.f21296c = str3;
    }

    /* renamed from: a */
    public ApiResponse mo4337a(String str) {
        return (ApiResponse) djm.m27592a(str, ApiCommentDelete.class);
    }

    /* renamed from: a */
    public void mo4338a(ApiResponse apiResponse) {
        if (apiResponse != null) {
            ApiCommentDelete apiCommentDelete = (ApiCommentDelete) apiResponse;
            ApiQuota apiQuota = apiCommentDelete.payload != null ? apiCommentDelete.payload.quota : null;
            if (apiQuota != null) {
                dda.m26492a().m26505a(apiQuota.count, apiQuota.wait);
            }
        }
    }

    /* renamed from: b */
    protected dft mo4340b(Context context) {
        dft d = dft.m27077d(m26654i(context));
        m26642a(d, context);
        d.m27087a("auth", this.f21295b);
        d.m27087a("appId", dda.m26492a().m26526c());
        d.m27087a("url", this.f21294a);
        return d;
    }

    /* renamed from: c */
    protected String mo4341c(Context context) {
        return m26646c() + "/v1/comment.json/" + this.f21296c;
    }

    /* renamed from: e */
    public void mo4343e(Context context) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, true);
        d.putExtra(TaskQueueService.f19251a, 111);
        m26640a(context, d);
    }

    /* renamed from: d */
    public void mo4342d(Context context) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, false);
        d.putExtra(TaskQueueService.f19251a, 111);
        m26640a(context, d);
    }
}

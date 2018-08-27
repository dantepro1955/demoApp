package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.under9.android.comments.model.api.ApiResponse;
import com.under9.android.comments.service.TaskQueueService;

/* compiled from: SimpleCommentActionTask */
/* renamed from: dea */
public abstract class dea extends ddn {
    /* renamed from: a */
    protected String f21297a;
    /* renamed from: b */
    protected String f21298b = "";

    public dea(String str, String str2) {
        this.f21297a = str2;
        this.f21298b = str;
    }

    /* renamed from: a */
    public void mo4338a(ApiResponse apiResponse) {
        if (apiResponse != null) {
        }
    }

    /* renamed from: a */
    public void m26671a(Context context, int i) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, false);
        d.putExtra(TaskQueueService.f19251a, i);
        m26640a(context, d);
    }

    /* renamed from: b */
    public void m26673b(Context context, int i) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, true);
        d.putExtra("comment_id", this.f21297a);
        d.putExtra(TaskQueueService.f19251a, i);
        m26640a(context, d);
    }
}

package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.facebook.stetho.common.Utf8Charset;
import com.under9.android.comments.model.api.ApiCommentInfo;
import com.under9.android.comments.model.api.ApiCommentInfo.ApiSimpleComment;
import com.under9.android.comments.model.api.ApiResponse;
import com.under9.android.comments.service.TaskQueueService;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

/* compiled from: GetCommentInfoTask */
/* renamed from: dds */
public class dds extends ddn {
    /* renamed from: a */
    private String f21302a;
    /* renamed from: b */
    private String f21303b;
    /* renamed from: c */
    private String f21304c = "";
    /* renamed from: d */
    private ArrayList<String> f21305d;

    public dds(String str, String str2, String str3) {
        this.f21304c = str;
        this.f21302a = str2;
        this.f21303b = str3;
        this.f21305d = new ArrayList();
    }

    /* renamed from: a */
    public ApiResponse mo4337a(String str) {
        return (ApiResponse) djm.m27592a(str, ApiCommentInfo.class);
    }

    /* renamed from: a */
    public void mo4338a(ApiResponse apiResponse) {
        final ApiSimpleComment[] apiSimpleCommentArr = ((ApiCommentInfo) apiResponse).payload.comments;
        final dda a = dda.m26492a();
        a.m26509a(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ dds f21301c;

            public void run() {
                if (apiSimpleCommentArr != null) {
                    for (ApiSimpleComment apiSimpleComment : apiSimpleCommentArr) {
                        if (a.m26514a(apiSimpleComment)) {
                            this.f21301c.f21305d.add(apiSimpleComment.commentId);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: c */
    protected String mo4341c(Context context) {
        try {
            return m26646c() + "/v1/commentInfo.json?appId=" + dda.m26492a().m26526c() + "&url=" + URLEncoder.encode(this.f21302a, Utf8Charset.NAME) + "&commentIds=" + this.f21303b + "&auth=" + this.f21304c;
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    /* renamed from: d */
    public void mo4342d(Context context) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, false);
        d.putExtra(TaskQueueService.f19251a, 104);
        m26640a(context, d);
    }

    /* renamed from: e */
    public void mo4343e(Context context) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, true);
        d.putExtra(TaskQueueService.f19251a, 104);
        m26640a(context, d);
    }
}

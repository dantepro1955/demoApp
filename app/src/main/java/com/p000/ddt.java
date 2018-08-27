package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.facebook.stetho.common.Utf8Charset;
import com.under9.android.comments.model.Comment;
import com.under9.android.comments.model.api.ApiComment;
import com.under9.android.comments.model.api.ApiCommentList;
import com.under9.android.comments.model.api.ApiResponse;
import com.under9.android.comments.service.TaskQueueService;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

/* compiled from: GetCommentListTask */
/* renamed from: ddt */
public class ddt extends ddn {
    /* renamed from: a */
    private String f21308a;
    /* renamed from: b */
    private int f21309b;
    /* renamed from: c */
    private int f21310c;
    /* renamed from: d */
    private int f21311d;
    /* renamed from: e */
    private String f21312e = "";
    /* renamed from: f */
    private String f21313f;
    /* renamed from: g */
    private String f21314g = "";
    /* renamed from: h */
    private boolean f21315h;
    /* renamed from: i */
    private boolean f21316i = false;
    /* renamed from: j */
    private String f21317j = null;
    /* renamed from: k */
    private String f21318k = null;

    public ddt(String str, String str2, int i, String str3, int i2, int i3, boolean z, String str4, String str5, String str6) {
        this.f21314g = str;
        this.f21308a = str2;
        this.f21309b = i;
        this.f21310c = i2;
        this.f21311d = i3;
        if (str4 != null) {
            this.f21312e = str4;
        }
        this.f21315h = z;
        this.f21313f = str3;
        this.f21317j = str5;
        this.f21318k = str6;
    }

    /* renamed from: a */
    public ApiResponse mo4337a(String str) {
        return (ApiResponse) dez.m26905a(str, ApiCommentList.class, 2);
    }

    /* renamed from: a */
    public void mo4338a(final ApiResponse apiResponse) {
        if (apiResponse != null) {
            dda.m26492a().m26509a(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ ddt f21307b;

                public void run() {
                    Comment comment;
                    int i;
                    int i2 = 1;
                    if (this.f21307b.f21315h) {
                        dda.m26492a().m26535d(this.f21307b.f21308a, this.f21307b.f21309b);
                        comment = null;
                        i = 1;
                    } else if (this.f21307b.f21317j == null) {
                        r2 = dda.m26492a().m26498a(this.f21307b.f21308a, this.f21307b.f21309b);
                        if (r2 != null) {
                            r2.m23519k();
                            i2 = r2.m23515g().intValue() + 1;
                        }
                        comment = null;
                        i = i2;
                    } else {
                        r2 = dda.m26492a().m26499a(this.f21307b.f21317j, this.f21307b.f21308a, this.f21307b.f21309b);
                        if (r2 != null) {
                            r2.m23519k();
                            i2 = r2.m23515g().intValue();
                            comment = r2.m23517i();
                            i = i2;
                        } else {
                            comment = null;
                            i = 1;
                        }
                    }
                    ApiCommentList apiCommentList = (ApiCommentList) apiResponse;
                    this.f21307b.f21316i = apiCommentList.payload.hasNext;
                    if (comment != null) {
                        comment.m23440c(Boolean.valueOf(this.f21307b.f21316i));
                        dda.m26492a().m26538e(comment);
                    }
                    ApiComment[] apiCommentArr = apiCommentList.payload.comments;
                    ArrayList arrayList = new ArrayList();
                    ddh.m26607a(apiCommentArr, apiCommentList);
                    int length = apiCommentArr.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (apiCommentArr[i3] != null) {
                            arrayList.add(apiCommentArr[i3]);
                        }
                    }
                    dda.m26492a().m26512a(this.f21307b.f21308a, apiCommentList.payload.webSocketUrl);
                    ddi.m26610a(this.f21307b.f21308a, this.f21307b.f21309b, (ApiComment[]) arrayList.toArray(new ApiComment[arrayList.size()]), comment, i);
                }
            });
        }
    }

    /* renamed from: c */
    protected String mo4341c(Context context) {
        try {
            String str;
            String str2 = "&ref=" + this.f21312e;
            if (this.f21317j != null) {
                str = "&refCommentId=" + this.f21312e;
            } else {
                str = str2;
            }
            return m26646c() + "/v1/comment.json?appId=" + dda.m26492a().m26526c() + "&url=" + URLEncoder.encode(this.f21308a, Utf8Charset.NAME) + "&order=" + m26686a() + "&direction=" + m26693f() + (this.f21313f == null ? "" : "&commentId=" + this.f21313f) + "&count=" + this.f21310c + "&level=" + this.f21311d + str + "&auth=" + this.f21314g;
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    /* renamed from: a */
    private String m26686a() {
        switch (this.f21309b) {
            case 1:
                return "score";
            default:
                return "ts";
        }
    }

    /* renamed from: f */
    private String m26693f() {
        switch (this.f21309b) {
            case 3:
                return "asc";
            default:
                return "desc";
        }
    }

    /* renamed from: d */
    public void mo4342d(Context context) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, false);
        d.putExtra(TaskQueueService.f19251a, 100);
        m26640a(context, d);
    }

    /* renamed from: e */
    public void mo4343e(Context context) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, true);
        d.putExtra("has_next", this.f21316i);
        d.putExtra(TaskQueueService.f19251a, 100);
        m26640a(context, d);
    }
}

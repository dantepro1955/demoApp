package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.facebook.stetho.common.Utf8Charset;
import com.under9.android.comments.model.api.ApiRawComments;
import com.under9.android.comments.model.api.ApiRawComments.ApiUrlCommentsItem;
import com.under9.android.comments.model.api.ApiRawComments.ApiUrlCommentsItemDeserializer;
import com.under9.android.comments.model.api.ApiRawComments.ApiUrlItem;
import com.under9.android.comments.model.api.ApiResponse;
import com.under9.android.comments.service.TaskQueueService;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* compiled from: PreloadTopCommentsTask */
/* renamed from: ddy */
public class ddy extends ddn {
    /* renamed from: a */
    private String f21336a;
    /* renamed from: b */
    private int f21337b;
    /* renamed from: c */
    private int f21338c;
    /* renamed from: d */
    private int f21339d;

    public ddy(String str, int i, int i2, int i3) {
        this.f21336a = str;
        this.f21337b = i;
        this.f21338c = i2;
        this.f21339d = i3;
    }

    /* renamed from: a */
    public ApiResponse mo4337a(String str) {
        buc buc = new buc();
        buc.a(ApiUrlCommentsItem.class, new ApiUrlCommentsItemDeserializer());
        return (ApiResponse) buc.a().a(str, ApiRawComments.class);
    }

    /* renamed from: a */
    public void mo4338a(ApiResponse apiResponse) {
        if (apiResponse != null) {
            final ApiUrlCommentsItem[] apiUrlCommentsItemArr = ((ApiRawComments) apiResponse).payload.data;
            final dda a = dda.m26492a();
            dda.m26492a().m26509a(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ ddy f21335c;

                public void run() {
                    for (int i = 0; i < apiUrlCommentsItemArr.length; i++) {
                        String str = "";
                        a.m26515a(((ApiUrlItem) djm.m27592a(apiUrlCommentsItemArr[i].json, ApiUrlItem.class)).url, this.f21335c.f21337b, apiUrlCommentsItemArr[i]);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private String m26725a() {
        switch (this.f21337b) {
            case 1:
                return "score";
            default:
                return "ts";
        }
    }

    /* renamed from: c */
    protected String mo4341c(Context context) {
        try {
            String str = dct.m26395a().m26408d().m26389e() + "/v1/topComments.json?appId=" + dda.m26492a().m26526c() + "&urls=" + URLEncoder.encode(this.f21336a, Utf8Charset.NAME) + "&order=" + m26725a() + "&commentL1=" + this.f21338c + "&commentL2=" + this.f21339d + "&pretty=0";
            if (dct.m26395a().m26408d().m26390f() != null) {
                return dct.m26395a().m26408d().m26390f().mo4407a(str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    /* renamed from: d */
    public void mo4342d(Context context) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, false);
        d.putExtra(TaskQueueService.f19251a, 106);
        m26640a(context, d);
    }

    /* renamed from: e */
    public void mo4343e(Context context) {
        Intent d = mo4335d();
        d.putExtra(GraphResponse.SUCCESS_KEY, true);
        d.putExtra(TaskQueueService.f19251a, 106);
        m26640a(context, d);
    }
}

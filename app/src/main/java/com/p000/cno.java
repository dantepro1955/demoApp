package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.facebook.internal.AnalyticsEvents;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UpdateSocialTask */
/* renamed from: cno */
public class cno extends cmg {
    /* renamed from: b */
    private String f9865b;
    /* renamed from: c */
    private String f9866c;
    /* renamed from: d */
    private int f9867d;
    /* renamed from: e */
    private boolean f9868e;
    /* renamed from: f */
    private String f9869f;
    /* renamed from: g */
    private String f9870g;

    public cno(int i, String str, String str2) {
        this.f9867d = i;
        this.f9865b = str;
        this.f9866c = str2;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        this.f9869f = apiBaseResponse.meta.errorMessage;
        this.f9870g = apiBaseResponse.meta.errorCode;
        this.f9868e = apiBaseResponse.success();
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        Intent g = mo1798g();
        g.putExtra("command", 107);
        g.putExtra(GraphResponse.SUCCESS_KEY, this.f9868e);
        g.putExtra(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, this.f9869f);
        m14474a(context, g);
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        Intent g = mo1798g();
        g.putExtra("command", 107);
        g.putExtra(GraphResponse.SUCCESS_KEY, false);
        g.putExtra(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, this.f9869f);
        m14474a(context, g);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft c = dft.c(m14491g(context));
        cmg.m14468a(c);
        Map hashMap = new HashMap();
        hashMap.put("platform", this.f9865b);
        hashMap.put("bind", Integer.toString(this.f9867d));
        hashMap.put("userAccessToken", this.f9866c);
        c.a(hashMap);
        return c;
    }

    /* renamed from: m */
    public String mo1806m() {
        return "settings-social-" + this.f9865b;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/user-social", new Object[]{cae.m12035a()});
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiBaseResponse.class);
    }
}

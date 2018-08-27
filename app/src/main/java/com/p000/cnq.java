package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.facebook.internal.AnalyticsEvents;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiSettingResponse;
import com.ninegag.android.app.model.api.ApiUpdateSettingResult;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UserChangePasswordTask */
/* renamed from: cnq */
public class cnq extends cmg {
    /* renamed from: b */
    private String f9873b;
    /* renamed from: c */
    private String f9874c;
    /* renamed from: d */
    private String f9875d;
    /* renamed from: e */
    private String f9876e;
    /* renamed from: f */
    private boolean f9877f;

    public cnq(String str, String str2, String str3) {
        this.f9873b = str;
        this.f9874c = str2;
        this.f9875d = str3;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiSettingResponse apiSettingResponse = (ApiSettingResponse) apiBaseResponse;
        if (apiSettingResponse.data.results.length == 0) {
            this.f9877f = false;
            return;
        }
        ApiUpdateSettingResult apiUpdateSettingResult = apiSettingResponse.data.results[0];
        this.f9877f = apiUpdateSettingResult.okay;
        this.f9876e = apiUpdateSettingResult.message;
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        Intent g = mo1798g();
        g.putExtra("command", 700);
        g.putExtra(GraphResponse.SUCCESS_KEY, this.f9877f);
        g.putExtra(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, this.f9876e);
        m14474a(context, g);
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        Intent g = mo1798g();
        g.putExtra("command", 700);
        g.putExtra(GraphResponse.SUCCESS_KEY, false);
        m14474a(context, g);
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiSettingResponse.class);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft c = dft.c(m14491g(context));
        cmg.m14468a(c);
        Map hashMap = new HashMap();
        hashMap.put("oldPassword", this.f9873b);
        hashMap.put("newPassword", this.f9874c);
        hashMap.put("newPasswordRepeat", this.f9875d);
        c.a(hashMap);
        return c;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/user-change-password", new Object[]{cae.m12035a()});
    }

    /* renamed from: m */
    public String mo1806m() {
        return "user-change-password";
    }
}

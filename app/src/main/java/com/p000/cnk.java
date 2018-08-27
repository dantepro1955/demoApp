package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.facebook.internal.AnalyticsEvents;
import com.millennialmedia.android.MMSDK$Event;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiSettingResponse;
import com.ninegag.android.app.model.api.ApiUpdateSettingResult;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UpdateEmailTask */
/* renamed from: cnk */
public class cnk extends cmg {
    /* renamed from: b */
    private boolean f9855b;
    /* renamed from: c */
    private String f9856c;
    /* renamed from: d */
    private String f9857d;

    public cnk(String str) {
        this.f9857d = str;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiSettingResponse apiSettingResponse = (ApiSettingResponse) apiBaseResponse;
        if (apiSettingResponse != null && apiSettingResponse.data != null && apiSettingResponse.data.user != null) {
            cij.m13687a().m13703a(cko.m14206a(apiSettingResponse.data.user));
            ApiUpdateSettingResult[] apiUpdateSettingResultArr = apiSettingResponse.data.results;
            this.f9855b = false;
            this.f9856c = null;
            if (apiUpdateSettingResultArr != null && 0 < apiUpdateSettingResultArr.length) {
                ApiUpdateSettingResult apiUpdateSettingResult = apiUpdateSettingResultArr[0];
                this.f9855b = apiUpdateSettingResult.okay;
                this.f9856c = apiUpdateSettingResult.message;
            }
        }
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        Intent g = mo1798g();
        g.putExtra("command", 122);
        g.putExtra(GraphResponse.SUCCESS_KEY, this.f9855b);
        g.putExtra(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, this.f9856c);
        m14474a(context, g);
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        Intent g = mo1798g();
        g.putExtra("command", 122);
        g.putExtra(GraphResponse.SUCCESS_KEY, false);
        m14474a(context, g);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft c = dft.c(m14491g(context));
        cmg.m14468a(c);
        Map hashMap = new HashMap();
        hashMap.put(MMSDK$Event.INTENT_EMAIL, this.f9857d);
        c.a(hashMap);
        return c;
    }

    /* renamed from: m */
    public String mo1806m() {
        return "settings-email";
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/settings", new Object[]{cae.m12035a()});
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiSettingResponse.class);
    }
}

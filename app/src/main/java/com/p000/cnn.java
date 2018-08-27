package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.places.model.PlaceFields;
import com.millennialmedia.android.MMRequest;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiSettingResponse;
import com.ninegag.android.app.model.api.ApiUpdateSettingResult;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UpdateSettingsTask */
/* renamed from: cnn */
public class cnn extends cmg {
    /* renamed from: b */
    private ckn f9862b;
    /* renamed from: c */
    private boolean f9863c;
    /* renamed from: d */
    private String f9864d;

    /* renamed from: a */
    public void m14798a(ckn ckn) {
        this.f9862b = ckn;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiSettingResponse apiSettingResponse = (ApiSettingResponse) apiBaseResponse;
        if (apiSettingResponse != null && apiSettingResponse.data != null && apiSettingResponse.data.user != null) {
            cij.m13687a().m13703a(cko.m14206a(apiSettingResponse.data.user));
            ApiUpdateSettingResult[] apiUpdateSettingResultArr = apiSettingResponse.data.results;
            this.f9863c = true;
            this.f9864d = null;
            if (apiUpdateSettingResultArr != null) {
                int length = apiUpdateSettingResultArr.length;
                int i = 0;
                while (i < length) {
                    ApiUpdateSettingResult apiUpdateSettingResult = apiUpdateSettingResultArr[i];
                    if (apiUpdateSettingResult.okay) {
                        i++;
                    } else {
                        this.f9863c = false;
                        this.f9864d = apiUpdateSettingResult.message;
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        Intent g = mo1798g();
        g.putExtra("command", 107);
        g.putExtra(GraphResponse.SUCCESS_KEY, this.f9863c);
        g.putExtra(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, this.f9864d);
        m14474a(context, g);
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        Intent g = mo1798g();
        g.putExtra("command", 107);
        g.putExtra(GraphResponse.SUCCESS_KEY, false);
        g.putExtra(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, this.f9864d);
        m14474a(context, g);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        String str;
        Object obj = "1";
        String str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        Object b = ctm.b(cip.m13967a().m14012q(), cip.m13967a().m13976H());
        if (b == null) {
            b = cip.m13967a().m13859T();
        }
        dft c = dft.c(m14491g(context));
        cmg.m14468a(c);
        Map hashMap = new HashMap();
        if (b != null) {
            hashMap.put("fbToken", b);
            String str3 = "fbLikeAction";
            if (this.f9862b.f9579p) {
                b = obj;
            } else {
                str = str2;
            }
            hashMap.put(str3, b);
        }
        str = "safeMode";
        if (!this.f9862b.f9581r) {
            String str4 = str2;
        }
        hashMap.put(str, obj);
        hashMap.put("loginName", this.f9862b.f9567d);
        hashMap.put("fullName", this.f9862b.f9568e);
        hashMap.put(MMRequest.KEY_GENDER, this.f9862b.f9561B);
        if (!(this.f9862b.f9562C == null || this.f9862b.f9562C.isEmpty())) {
            hashMap.put("birthday", this.f9862b.f9562C);
        }
        hashMap.put(PlaceFields.ABOUT, this.f9862b.f9582s);
        hashMap.put("hideUpvote", this.f9862b.f9563D);
        c.a(hashMap);
        return c;
    }

    /* renamed from: m */
    public String mo1806m() {
        return "settings";
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

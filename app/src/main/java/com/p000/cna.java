package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiGetUserPushSettingsResponse;

/* compiled from: GetUserPushSettingsTask */
/* renamed from: cna */
public class cna extends cmg {
    /* renamed from: b */
    private static String f9819b = "%s/v2/user-push-settings/locale/%s";
    /* renamed from: c */
    private caf f9820c = caf.m12046a();

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiGetUserPushSettingsResponse apiGetUserPushSettingsResponse = (ApiGetUserPushSettingsResponse) apiBaseResponse;
        if (apiGetUserPushSettingsResponse != null) {
            this.f9820c.m12077h().m13932p(djm.a(apiGetUserPushSettingsResponse.data));
        }
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiGetUserPushSettingsResponse.class);
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        Intent g = mo1798g();
        g.putExtra(GraphResponse.SUCCESS_KEY, true);
        m14474a(context, g);
    }

    /* renamed from: g */
    public Intent mo1798g() {
        Intent g = super.mo1798g();
        g.putExtra("command", 123);
        return g;
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft b = dft.b(m14491g(context));
        cmg.m14468a(b);
        return b;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format(f9819b, new Object[]{cae.m12035a(), djo.a()});
    }

    /* renamed from: m */
    public String mo1806m() {
        return null;
    }
}

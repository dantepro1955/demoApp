package com.p000;

import android.content.Context;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiGetUserPushSettingsResponse.Data;
import java.util.HashMap;

/* compiled from: UpdateUserPushSettingsTask */
/* renamed from: cnp */
public class cnp extends cmg {
    /* renamed from: b */
    private static String f9871b = "%s/v2/user-push-settings-update";
    /* renamed from: c */
    private caf f9872c = caf.m12046a();

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return null;
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft c = dft.c(m14491g(context));
        cmg.m14468a(c);
        c.a(m14812n());
        return c;
    }

    /* renamed from: n */
    private HashMap<String, String> m14812n() {
        HashMap<String, String> hashMap = new HashMap();
        Data data = (Data) djm.a(this.f9872c.m12077h().aH(), Data.class);
        for (String str : data.settings.keySet()) {
            hashMap.put(str, Integer.toString(((Integer) data.settings.get(str)).intValue()));
        }
        return hashMap;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format(f9871b, new Object[]{cae.m12035a()});
    }

    /* renamed from: m */
    public String mo1806m() {
        return null;
    }
}

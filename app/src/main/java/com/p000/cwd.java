package com.p000;

import android.content.Context;
import com.ninegag.android.tv.model.api.ApiLogin;
import com.ninegag.android.tv.model.api.ApiResponse;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GuestLoginTask */
/* renamed from: cwd */
public class cwd extends cwa {
    /* renamed from: c */
    protected dft mo4177c(Context context) {
        return dft.m27076c(m25182e().m25159d());
    }

    /* renamed from: a */
    protected void mo4178a(dft dft) {
        Map hashMap = new HashMap();
        hashMap.put("package_id", "com.ninegag.android.tv");
        hashMap.put("method", "guest");
        dft.m27094a(hashMap);
    }

    /* renamed from: a */
    protected ApiResponse mo4175a(String str) {
        return (ApiResponse) m25178c().a(str, ApiLogin.class);
    }

    /* renamed from: a */
    protected void mo4176a(Context context, ApiResponse apiResponse) {
        ApiLogin apiLogin = (ApiLogin) apiResponse;
        caf.a().l().m25128a(apiLogin.data.token.type, apiLogin.data.token.access_token, apiLogin.data.token.expiry_ts);
    }

    /* renamed from: b */
    protected boolean mo4179b() {
        return false;
    }
}

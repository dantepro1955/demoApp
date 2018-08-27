package com.p000;

import android.content.Context;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* compiled from: InviteChatTask */
/* renamed from: cnb */
public class cnb extends cmg {
    /* renamed from: b */
    private String f9821b;

    public cnb(String str) {
        this.f9821b = str;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        if (!apiBaseResponse.success()) {
        }
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) cpy.a(str, ApiBaseResponse.class, 1);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft c = dft.c(m14491g(context));
        cmg.m14468a(c);
        Map hashMap = new HashMap();
        hashMap.put("receiverUserId", this.f9821b);
        c.a(hashMap);
        return c;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/noti-chat-invite", new Object[]{cae.m12035a(), this.f9821b});
    }

    /* renamed from: m */
    public String mo1806m() {
        return null;
    }
}

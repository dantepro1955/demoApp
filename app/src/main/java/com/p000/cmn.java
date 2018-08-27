package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.millennialmedia.android.MMSDK$Event;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ForgotPasswordTask */
/* renamed from: cmn */
public class cmn extends cmg {
    /* renamed from: b */
    String f9778b;
    /* renamed from: c */
    boolean f9779c;

    public cmn(String str) {
        this.f9778b = str;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        this.f9779c = apiBaseResponse.success();
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        Intent g = mo1798g();
        g.putExtra("command", 109);
        g.putExtra(GraphResponse.SUCCESS_KEY, this.f9779c);
        m14474a(context, g);
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        Intent g = mo1798g();
        g.putExtra("command", 109);
        g.putExtra(GraphResponse.SUCCESS_KEY, false);
        m14474a(context, g);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft c = dft.c(m14491g(context));
        cmg.m14468a(c);
        Map hashMap = new HashMap();
        hashMap.put(MMSDK$Event.INTENT_EMAIL, this.f9778b);
        c.a(hashMap);
        return c;
    }

    /* renamed from: f */
    public boolean mo1803f() {
        return true;
    }

    /* renamed from: m */
    public String mo1806m() {
        return "forgot_password";
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/user-forgot-password", new Object[]{cae.m12035a()});
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiBaseResponse.class);
    }
}

package com.p000;

import android.content.Context;
import android.content.Intent;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UpdateAppInstallTask */
/* renamed from: cnj */
public class cnj extends cmg {
    /* renamed from: b */
    boolean f9851b;
    /* renamed from: c */
    private String f9852c;
    /* renamed from: d */
    private int f9853d;
    /* renamed from: e */
    private String f9854e;

    public cnj(String str, int i, String str2) {
        this.f9852c = str;
        this.f9853d = i;
        this.f9854e = str2;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        cip.m13967a().m13989b(this.f9852c);
        this.f9851b = apiBaseResponse.success();
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft b = dft.b(m14491g(context));
        cmg.m14468a(b);
        Map hashMap = new HashMap();
        hashMap.put("pushToken", this.f9854e);
        hashMap.put("installTime", Integer.toString(this.f9853d));
        b.a(hashMap);
        return b;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/install-info", new Object[]{cae.m12035a()});
    }

    /* renamed from: m */
    public String mo1806m() {
        return "install_info";
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
    }

    /* renamed from: g */
    public Intent mo1798g() {
        Intent g = super.mo1798g();
        g.putExtra("command", 125);
        return g;
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiBaseResponse.class);
    }
}

package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.facebook.stetho.server.http.HttpStatus;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiQuotaResponse;

/* compiled from: GetUploadQuotaTask */
/* renamed from: cmy */
public class cmy extends cmg {
    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiQuotaResponse apiQuotaResponse = (ApiQuotaResponse) apiBaseResponse;
        if (apiQuotaResponse.success()) {
            long currentTimeMillis;
            int i = apiQuotaResponse.data.quota;
            int i2 = apiQuotaResponse.data.wait;
            int i3 = apiQuotaResponse.data.limit;
            if (i2 > 0) {
                currentTimeMillis = ((long) (i2 * 1000)) + System.currentTimeMillis();
            } else {
                currentTimeMillis = 0;
            }
            cip.m13967a().m13898i(i);
            cip.m13967a().m13876d(currentTimeMillis);
            cip.m13967a().m13893h(i3);
        }
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft b = dft.b(m14491g(context));
        cmg.m14468a(b);
        return b;
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        Intent g = mo1798g();
        g.putExtra(GraphResponse.SUCCESS_KEY, false);
        m14474a(context, g);
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
        g.putExtra("command", HttpStatus.HTTP_OK);
        return g;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/post-quota", new Object[]{cae.m12035a()});
    }

    /* renamed from: m */
    public String mo1806m() {
        return null;
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiQuotaResponse.class);
    }
}

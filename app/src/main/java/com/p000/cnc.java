package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.facebook.ads.AdError;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PurchaseUpdateTask */
/* renamed from: cnc */
public class cnc extends cmg {
    /* renamed from: f */
    private static caf f9822f = caf.m12046a();
    /* renamed from: b */
    String f9823b;
    /* renamed from: c */
    String f9824c;
    /* renamed from: d */
    String f9825d;
    /* renamed from: e */
    boolean f9826e;
    /* renamed from: g */
    private String f9827g = "";

    public cnc(String str, String str2, String str3) {
        this.f9823b = str;
        this.f9824c = str2;
        this.f9825d = str3;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        this.f9826e = apiBaseResponse.success();
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        Intent g = mo1798g();
        g.putExtra("command", AdError.SERVER_ERROR_CODE);
        g.putExtra(GraphResponse.SUCCESS_KEY, false);
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        Intent g = mo1798g();
        g.putExtra("command", AdError.SERVER_ERROR_CODE);
        g.putExtra(GraphResponse.SUCCESS_KEY, this.f9826e);
        f9822f.m12079i().m13566c(-1);
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) dfa.a(str, ApiBaseResponse.class);
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        this.f9827g = m14491g(context);
        dft c = dft.c(this.f9827g);
        cmg.m14468a(c);
        Map hashMap = new HashMap();
        hashMap.put("packageName", this.f9823b);
        hashMap.put(AnalyticsSQLiteHelper.TRANSACTION_PRODUCT_ID, this.f9824c);
        hashMap.put("token", this.f9825d);
        c.a(hashMap);
        return c;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/google-purchase-update", new Object[]{cae.m12035a()});
    }

    /* renamed from: m */
    public String mo1806m() {
        return "migration";
    }
}

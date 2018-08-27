package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.GraphResponse;
import com.facebook.share.internal.ShareConstants;
import com.facebook.stetho.common.Utf8Charset;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* compiled from: DeletePostTask */
/* renamed from: cmm */
public class cmm extends cmg {
    /* renamed from: b */
    private cld f9777b;

    public cmm(String str) {
        this.f9777b = cij.m13687a().f9370c.m13832i(str);
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        if (apiBaseResponse.success()) {
            cij.m13687a().m13697a(this.f9777b.m12619b().longValue(), true);
        }
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        dft d = dft.d(m14491g(context));
        cmg.m14468a(d);
        return d;
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        Intent g = mo1798g();
        g.putExtra(GraphResponse.SUCCESS_KEY, false);
        g.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, this.f9777b.m12623c());
        m14474a(context, g);
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        Intent g = mo1798g();
        g.putExtra(GraphResponse.SUCCESS_KEY, true);
        g.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, this.f9777b.m12623c());
        m14474a(context, g);
    }

    /* renamed from: g */
    public Intent mo1798g() {
        Intent g = super.mo1798g();
        g.putExtra("command", 151);
        return g;
    }

    /* renamed from: m */
    public String mo1806m() {
        return null;
    }

    /* renamed from: c */
    private String m14567c(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, Utf8Charset.NAME);
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/post?entryId=%s", new Object[]{cae.m12035a(), m14567c(this.f9777b.m12623c())});
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiBaseResponse.class);
    }
}

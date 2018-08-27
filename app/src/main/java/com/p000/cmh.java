package com.p000;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.ninegag.android.app.model.api.ApiAuthResponse;
import com.ninegag.android.app.model.api.ApiBaseResponse;

/* compiled from: AuthGuestTask */
/* renamed from: cmh */
public class cmh extends cmg {
    /* renamed from: c */
    private static caf f9741c = caf.m12046a();
    /* renamed from: b */
    boolean f9742b;
    /* renamed from: d */
    private String f9743d;
    /* renamed from: e */
    private String f9744e;

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiAuthResponse apiAuthResponse = (ApiAuthResponse) apiBaseResponse;
        cip a = cip.m13967a();
        this.f9742b = false;
        if (apiAuthResponse != null) {
            if (apiAuthResponse.success()) {
                int S = a.m13858S();
                if (S == 5 || S == 0) {
                    a.m13984a(apiAuthResponse.data.userToken, apiAuthResponse.data.tokenExpiry, apiAuthResponse.data.secondsTillExpiry);
                    cij.m13687a().m13703a(m14498n());
                    a.m13885f("guest");
                    a.m13993c("");
                    a.m13866a(5);
                    if (apiAuthResponse.data.anonymousCommentAuth != null) {
                        a.m13935q(apiAuthResponse.data.anonymousCommentAuth.authHash);
                    }
                    this.f9742b = true;
                    a.m13881e(false);
                    chn.m13414g("AuthGuestTask success");
                    return;
                }
                a.m13881e(false);
                return;
            }
            this.f9743d = apiAuthResponse.meta.errorCode;
            chn.m13414g("AuthGuestTask fail");
        }
    }

    /* renamed from: n */
    private ckn m14498n() {
        ckn ckn = new ckn();
        ckn.f9565b = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        ckn.f9567d = "guest";
        ckn.f9568e = "";
        ckn.f9569f = "";
        ckn.f9570g = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        ckn.f9573j = "";
        ckn.f9572i = "";
        ckn.f9571h = "";
        ckn.f9575l = "";
        ckn.f9574k = "";
        ckn.f9576m = false;
        ckn.f9577n = false;
        ckn.f9578o = false;
        ckn.f9579p = false;
        ckn.f9581r = true;
        ckn.f9582s = "";
        ckn.f9583t = "en";
        ckn.f9584u = "hk";
        ckn.f9585v = "8";
        ckn.f9586w = "";
        ckn.f9587x = "";
        ckn.f9588y = "";
        ckn.f9589z = "";
        ckn.f9560A = "";
        ckn.f9580q = false;
        return ckn;
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        CharSequence g = m14491g(context);
        if (g == null) {
            return null;
        }
        cag x = f9741c.m12094x();
        x.m12106e();
        if (x.m12103b() && !x.m12107f()) {
            return null;
        }
        if (!TextUtils.isEmpty(this.f9744e)) {
            g = g + "/pushToken/" + this.f9744e;
        }
        dft b = dft.b(g);
        cmg.m14468a(b);
        return b;
    }

    /* renamed from: f */
    public boolean mo1803f() {
        return true;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        return String.format("%s/v2/guest-token", new Object[]{cae.m12035a()});
    }

    /* renamed from: m */
    public String mo1806m() {
        return "guest_login";
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) djm.a(str, ApiAuthResponse.class);
    }

    /* renamed from: c */
    public void m14501c(String str) {
        this.f9744e = str;
    }

    /* renamed from: d */
    protected boolean mo1801d() {
        return false;
    }

    /* renamed from: j */
    protected boolean mo1805j() {
        return false;
    }
}

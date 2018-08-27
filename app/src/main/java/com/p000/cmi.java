package com.p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.GraphResponse;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.stetho.common.Utf8Charset;
import com.ninegag.android.app.R;
import com.ninegag.android.app.model.api.ApiAuthResponse;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* compiled from: AuthTask */
/* renamed from: cmi */
public class cmi extends cmg {
    /* renamed from: b */
    private static caf f9746b = caf.m12046a();
    /* renamed from: c */
    private static int f9747c = 0;
    /* renamed from: d */
    private static long f9748d = 0;
    /* renamed from: e */
    private static int f9749e = 0;
    /* renamed from: f */
    private static int f9750f = 0;
    /* renamed from: g */
    private int f9751g;
    /* renamed from: h */
    private int f9752h;
    /* renamed from: i */
    private String f9753i;
    /* renamed from: j */
    private String f9754j;
    /* renamed from: k */
    private String f9755k;
    /* renamed from: l */
    private String f9756l;
    /* renamed from: m */
    private String f9757m;
    /* renamed from: n */
    private String f9758n;
    /* renamed from: o */
    private String f9759o;
    /* renamed from: p */
    private boolean f9760p;
    /* renamed from: q */
    private String f9761q;
    /* renamed from: r */
    private String f9762r;
    /* renamed from: s */
    private boolean f9763s = false;
    /* renamed from: t */
    private String f9764t;
    /* renamed from: u */
    private StringBuilder f9765u = new StringBuilder();

    /* compiled from: AuthTask */
    /* renamed from: cmi$1 */
    class C17681 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ cmi f9745a;

        C17681(cmi cmi) {
            this.f9745a = cmi;
        }

        public void run() {
            try {
                Thread.sleep(5000);
                cmi.f9746b.m12079i().m13566c(-1);
            } catch (InterruptedException e) {
                Intent g = this.f9745a.mo1798g();
                g.putExtra("command", 503);
                g.putExtra(GraphResponse.SUCCESS_KEY, false);
            }
        }
    }

    /* renamed from: c */
    public static cmi m14510c(String str) {
        cmi cmi = new cmi();
        cmi.m14516j(str);
        return cmi;
    }

    /* renamed from: d */
    public static cmi m14511d(String str) {
        cmi cmi = new cmi();
        cmi.m14516j(str);
        return cmi;
    }

    /* renamed from: e */
    public static cmi m14512e(String str) {
        cmi cmi = new cmi();
        cmi.m14515i(str);
        return cmi;
    }

    /* renamed from: f */
    public static cmi m14513f(String str) {
        cmi cmi = new cmi();
        cmi.m14514h(str);
        return cmi;
    }

    /* renamed from: h */
    private void m14514h(String str) {
        m14516j(str);
        this.f9752h = this.f9751g;
        this.f9751g = 7;
    }

    /* renamed from: i */
    private void m14515i(String str) {
        m14516j(str);
        this.f9752h = this.f9751g;
        this.f9751g = 6;
        this.f9763s = true;
    }

    /* renamed from: j */
    private void m14516j(String str) {
        String d;
        Exception e;
        String[] split;
        this.f9753i = str;
        try {
            d = ctm.d(str, cip.m13967a().m13976H());
            if (d == null) {
                try {
                    chn.m13414g("AuthTask initWithSecret() - cannot decrypt: " + this.f9753i);
                    return;
                } catch (Exception e2) {
                    e = e2;
                }
            }
        } catch (Exception e3) {
            Exception exception = e3;
            d = null;
            e = exception;
            chn.m13432m("AuthTask initWithSecret() exception - " + e.toString() + " " + e.getMessage());
            split = d.split("\\|");
            if (split.length != 0) {
                try {
                    this.f9751g = Integer.parseInt(split[0]);
                    if (split.length < 2) {
                    }
                    if (split.length < 1) {
                    }
                    if (split.length < 1) {
                    }
                    if (this.f9751g != 3) {
                        chn.m13414g("AuthTask initWithSecret() - no method matched tokens.len:" + split.length + " loginMethod:" + ctm.a(this.f9751g) + " data:" + this.f9753i);
                    }
                    this.f9757m = djj.b(split[1]);
                    this.f9756l = djj.b(split[2]);
                    this.f9755k = djj.b(split[3]);
                } catch (Exception e32) {
                    chn.m13432m("AuthTask initWithSecret() data:" + this.f9753i + " exception:" + e32.getMessage());
                    return;
                }
            }
            chn.m13414g("AuthTask initWithSecret() - tokens.len = 0 data: " + this.f9753i + " - " + d);
            return;
        }
        split = d.split("\\|");
        if (split.length != 0) {
            chn.m13414g("AuthTask initWithSecret() - tokens.len = 0 data: " + this.f9753i + " - " + d);
            return;
        }
        this.f9751g = Integer.parseInt(split[0]);
        if (split.length < 2 && this.f9751g == 1) {
            this.f9754j = split[1];
            this.f9755k = split[2];
        } else if (split.length < 1 && this.f9751g == 2) {
            this.f9758n = split[1];
        } else if (split.length < 1 && this.f9751g == 4) {
            this.f9759o = split[1];
            this.f9758n = split[2];
        } else if (this.f9751g != 3) {
            this.f9757m = djj.b(split[1]);
            this.f9756l = djj.b(split[2]);
            this.f9755k = djj.b(split[3]);
        } else {
            chn.m13414g("AuthTask initWithSecret() - no method matched tokens.len:" + split.length + " loginMethod:" + ctm.a(this.f9751g) + " data:" + this.f9753i);
        }
    }

    /* renamed from: g */
    public void m14534g(String str) {
        this.f9762r = str;
    }

    /* renamed from: a */
    public void m14526a(boolean z) {
        this.f9763s = z;
    }

    /* renamed from: f */
    public boolean mo1803f() {
        return true;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiAuthResponse apiAuthResponse = (ApiAuthResponse) apiBaseResponse;
        cip a = cip.m13967a();
        if (a.m13856Q()) {
            chn.m13414g("processDataResponse terminated by dc.isLoggedOut()==true");
            return;
        }
        this.f9760p = false;
        if (apiAuthResponse == null) {
            chn.m13414g("processDataResponse terminated by response == null");
        } else if (!apiAuthResponse.success()) {
            this.f9761q = apiAuthResponse.meta.errorCode;
            chn.m13435n(this.f9761q);
        } else if (apiAuthResponse.data.user != null) {
            a.m13984a(apiAuthResponse.data.userToken, apiAuthResponse.data.tokenExpiry, apiAuthResponse.data.secondsTillExpiry);
            if (apiAuthResponse.data.user != null) {
                f9747c = 0;
                f9748d = 0;
                ckn a2 = cko.m14206a(apiAuthResponse.data.user);
                cij.m13687a().m13703a(a2);
                a.m13885f(a2.f9567d);
                if (!(apiAuthResponse.data.user.permissionGroup == null || apiAuthResponse.data.user.permissionGroup.ninegagPro == null)) {
                    a.m13910k(chm.m13301a("com.ninegag.android.app.pro", a2.f9567d));
                }
                if (this.f9751g == 3) {
                    this.f9753i = ctm.a(a2.f9567d, this.f9755k, cip.m13967a().m13976H());
                    this.f9751g = 1;
                } else if (this.f9751g == 6) {
                    if (this.f9752h == 1) {
                        this.f9753i = ctm.a(a2.f9567d, this.f9755k, cip.m13967a().m13976H());
                    }
                    this.f9751g = this.f9752h;
                } else if (this.f9751g == 7 && apiAuthResponse.data.user.permissionGroup != null) {
                    Intent g;
                    if (apiAuthResponse.data.user.permissionGroup.ninegagPro != null) {
                        g = mo1798g();
                        g.putExtra("command", 503);
                        g.putExtra(GraphResponse.SUCCESS_KEY, true);
                    } else {
                        f9749e++;
                        if (f9749e > 3) {
                            g = mo1798g();
                            g.putExtra("command", 503);
                            g.putExtra(GraphResponse.SUCCESS_KEY, false);
                        } else {
                            new Thread(new C17681(this)).start();
                        }
                    }
                }
                if (this.f9751g != 6) {
                    a.m13993c(this.f9753i);
                    a.m13866a(this.f9751g);
                }
            }
            if (apiAuthResponse.data.commentAuth != null) {
                a.m13935q(apiAuthResponse.data.commentAuth.authHash);
            }
            if (apiAuthResponse.data.noti != null) {
                a.m13945t(apiAuthResponse.data.noti.readStateParams);
                a.m13951v(apiAuthResponse.data.noti.chatBadgeReadStateParams);
            }
            this.f9760p = true;
        }
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
        Intent g = mo1798g();
        if (this.f9760p) {
            g.putExtra(GraphResponse.SUCCESS_KEY, true);
            g.putExtra("data", this.f9753i);
            chn.m13365a(this.f9751g);
            f9750f = 0;
        } else if (this.f9751g != 6) {
            String a = m14508a(context, this.f9761q);
            g.putExtra(GraphResponse.SUCCESS_KEY, false);
            if (!this.f9763s) {
                g.putExtra(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, a);
            }
            if (!f9746b.m12094x().m12104c()) {
                g.putExtra("force_logout", false);
            }
            if (g.getBooleanExtra("force_logout", true)) {
                m14519r();
            }
            chn.m13396c(this.f9751g, "afterProcessDataResponse: errCode:" + this.f9761q + " " + a + ", code=" + m14497l() + ", DEBUG: " + m14521t());
        }
        m14474a(context, g);
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
        if (this.f9751g != 6) {
            Intent g = mo1798g();
            g.putExtra(GraphResponse.SUCCESS_KEY, false);
            g.putExtra("is_401", m14493h());
            g.putExtra("is_abnormal_cde", m14494i());
            if (m14493h() || m14494i()) {
                g.putExtra("force_logout", false);
            } else {
                g.putExtra("force_logout", true);
            }
            if (!this.f9763s) {
                g.putExtra(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, context.getString(R.string.error_external_error));
            }
            m14474a(context, g);
            chn.m13396c(this.f9751g, "onResponseFail response=" + this.f9764t + ", error=" + m14496k() + ", code=" + m14497l() + ", DEBUG: " + m14521t());
        }
    }

    /* renamed from: r */
    private void m14519r() {
        if (f9746b.m12068d().m12034m()) {
            f9750f++;
            if (f9750f >= 5 && m14520s()) {
                f9750f = 0;
            }
        }
    }

    /* renamed from: s */
    private boolean m14520s() {
        if (chp.m13478b().m13488e()) {
            chn.m13414g("resetLoginState() reset AOC state, sAuthFailLoopCount=" + f9750f);
            cij.m13687a().m13726e();
            return true;
        }
        chn.m13414g("resetLoginState() skip since failure maybe due to no network, sAuthFailLoopCount=" + f9750f);
        return false;
    }

    /* renamed from: t */
    private String m14521t() {
        try {
            return ctm.c(this.f9765u.toString(), cip.m13967a().m13976H());
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    /* renamed from: f */
    protected dft mo1802f(Context context) {
        CharSequence g = m14491g(context);
        if (g == null) {
            return null;
        }
        dft b = dft.b(g);
        cmg.m14468a(b);
        return b;
    }

    /* renamed from: k */
    private String m14517k(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, Utf8Charset.NAME);
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    /* renamed from: g */
    public Intent mo1798g() {
        Intent g = super.mo1798g();
        g.putExtra("command", 100);
        return g;
    }

    /* renamed from: m */
    public String mo1806m() {
        return "login";
    }

    /* renamed from: a */
    private String m14508a(Context context, String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("MissingArguments")) {
            return context.getString(R.string.error_missing_arguments);
        }
        if (str.equals("LoginFailed")) {
            return context.getString(R.string.error_login_failed);
        }
        if (str.equals("ExternalError")) {
            return context.getString(R.string.error_external_error);
        }
        if (str.equals("AccountDisabled")) {
            return context.getString(R.string.error_account_disabled);
        }
        if (str.equals("InvalidEmail")) {
            return context.getString(R.string.error_invalid_email);
        }
        if (str.equals("InvalidFullName")) {
            return context.getString(R.string.error_invalid_full_name);
        }
        if (str.equals("InvalidUserName")) {
            return context.getString(R.string.error_invalid_user_name);
        }
        if (str.equals("InvalidPassword")) {
            return context.getString(R.string.error_invalid_password);
        }
        if (str.equals("AlreadyMember")) {
            return context.getString(R.string.error_already_member);
        }
        return null;
    }

    /* renamed from: a */
    private static String m14509a(String str, String str2, String str3) {
        String str4 = "9GAG-EMAIL-SIGNUP";
        return djj.a(djj.d(String.format("%s%s%s%s", new Object[]{str, str2, str3, "9GAG-EMAIL-SIGNUP"})));
    }

    /* renamed from: u */
    private String m14522u() {
        return cae.m12035a();
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        String str = null;
        String locale = djo.a().toString();
        this.f9765u.append(" lm=").append(cip.m13967a().m13858S());
        this.f9765u.append(" tm=").append(this.f9751g);
        this.f9765u.append(" ts=").append(System.currentTimeMillis() / 1000);
        this.f9765u.append(" te=").append(cip.m13967a().m13860U());
        this.f9765u.append(" tp=").append(cip.m13967a().m13852M());
        if (this.f9751g == 1) {
            str = String.format("%s/v2/user-token/loginMethod/9gag/loginName/%s/password/%s/language/%s", new Object[]{m14522u(), m14517k(this.f9754j), m14517k(this.f9755k), locale});
        } else if (this.f9751g == 2) {
            str = String.format("%s/v2/user-token/loginMethod/facebook/userAccessToken/%s/language/%s", new Object[]{m14522u(), m14517k(this.f9758n), locale});
            this.f9765u.append(" f=").append(this.f9758n);
        } else if (this.f9751g == 4) {
            str = String.format("%s/v2/user-token/loginMethod/google-plus/userAccessToken/%s/language/%s", new Object[]{m14522u(), m14517k(dim.a(context, this.f9759o, null)), locale});
            this.f9765u.append(" g=").append(r2);
        } else if (this.f9751g == 3) {
            str = cmi.m14509a(this.f9757m, this.f9756l, this.f9755k);
            str = String.format("%s/v2/user-token/loginMethod/email/email/%s/fullName/%s/password/%s/hash/%s/language/%s", new Object[]{m14522u(), m14517k(this.f9757m), m14517k(this.f9756l), m14517k(this.f9755k), m14517k(str), locale});
        } else if (this.f9751g == 6) {
            str = String.format("%s/v2/user-token/loginMethod/renew", new Object[]{m14522u()});
        } else if (this.f9751g == 7) {
            str = String.format("%s/v2/user-token/loginMethod/renew", new Object[]{m14522u()});
        }
        if (TextUtils.isEmpty(this.f9762r)) {
            return str;
        }
        return str + "/pushToken/" + this.f9762r;
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        this.f9764t = str;
        return (ApiBaseResponse) cpy.a(str, ApiAuthResponse.class, 2);
    }

    /* renamed from: d */
    protected boolean mo1801d() {
        return false;
    }

    /* renamed from: a */
    protected void mo1807a(int i) {
        if (this.f9763s) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f9748d > 10000) {
                f9747c = 0;
            }
            if (f9747c <= 5) {
                f9747c++;
                if (this.f9751g == 6) {
                    f9746b.m12079i().m13535a(-1);
                } else {
                    f9746b.m12079i().m13555b(-1);
                }
                f9748d = currentTimeMillis;
            }
        } else if (this.f9751g == 3) {
        }
    }

    /* renamed from: b */
    protected String mo1808b(String str) {
        if (this.f9751g == 3) {
            return "[masked signup url]";
        }
        return str;
    }
}

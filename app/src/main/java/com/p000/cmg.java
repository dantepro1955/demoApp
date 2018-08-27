package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.stetho.server.http.HttpStatus;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import java.io.IOException;
import p000.dft.C4882b;

/* compiled from: ApiTask */
/* renamed from: cmg */
public abstract class cmg extends cnf {
    /* renamed from: a */
    protected static caf f9731a = caf.m12046a();
    /* renamed from: b */
    private dft f9732b;
    /* renamed from: c */
    private String f9733c;
    /* renamed from: d */
    private String f9734d;
    /* renamed from: e */
    private int f9735e = -999;
    /* renamed from: f */
    private String f9736f = "";
    /* renamed from: g */
    private boolean f9737g = false;
    /* renamed from: h */
    private boolean f9738h = false;
    /* renamed from: i */
    private boolean f9739i;
    /* renamed from: j */
    private boolean f9740j;

    /* renamed from: a */
    protected abstract ApiBaseResponse mo1799a(String str);

    /* renamed from: a */
    public abstract void mo1800a(ApiBaseResponse apiBaseResponse);

    /* renamed from: f */
    protected abstract dft mo1802f(Context context);

    /* renamed from: h */
    protected abstract String mo1804h(Context context);

    /* renamed from: a */
    protected boolean mo1812a() {
        return true;
    }

    /* renamed from: a */
    public final void mo1796a(Context context) {
        String c;
        dft dft = null;
        if (mo1812a()) {
            this.f9739i = false;
            this.f9740j = false;
            try {
                this.f9733c = null;
                this.f9734d = null;
                dft = m14487e(context);
                if (dft != null) {
                    dft.b(5000);
                    dft.a(30000);
                    this.f9734d = mo1808b(dft.a().getURL().toString());
                } else if (mo1805j()) {
                    this.f9739i = true;
                    this.f9733c = "httpRequest == null, from:" + this;
                    this.f9740j = true;
                    chn.m13432m(this.f9733c);
                }
                cqw.a();
                if (!this.f9739i) {
                    this.f9735e = m14477b(dft);
                    int i = this.f9735e;
                    if (i != HttpStatus.HTTP_OK) {
                        this.f9733c = String.format("code:%d", new Object[]{Integer.valueOf(i)});
                        if (i == 401) {
                            mo1811n();
                        } else {
                            m14469c(i);
                            if (i >= HttpStatus.HTTP_INTERNAL_SERVER_ERROR) {
                                this.f9739i = true;
                                this.f9740j = true;
                                chn.m13421i(this.f9734d, this.f9733c);
                            } else if (i >= 400) {
                                this.f9739i = true;
                                this.f9740j = true;
                                chn.m13418h(this.f9734d, this.f9733c);
                            } else if (i > 0) {
                            }
                        }
                    }
                }
                if (!this.f9739i) {
                    cqw.a();
                    c = m14481c(dft);
                    this.f9736f = c;
                    ApiBaseResponse a = mo1799a(c);
                    if (a != null) {
                        m14480b(context);
                        if (!a.success()) {
                            chn.m13427k(this.f9734d, c);
                        }
                        mo1800a(a);
                        mo1810d(context);
                    } else {
                        this.f9739i = true;
                        this.f9733c = "cannot parse response - code:" + this.f9735e + " body:" + c + " url:" + this.f9734d;
                        this.f9740j = true;
                        chn.m13397c(this.f9733c);
                    }
                }
            } catch (C4882b e) {
                this.f9733c = e.getMessage();
                this.f9739i = true;
                IOException a2 = e.a();
                try {
                    int b = m14477b(dft);
                    if (b == 401) {
                        mo1811n();
                        this.f9740j = true;
                    } else {
                        m14469c(b);
                    }
                } catch (Exception e2) {
                }
                if (!this.f9737g) {
                    c = a2.getMessage();
                    if (c != null && c.contains("authentication challenge")) {
                        mo1811n();
                        this.f9740j = true;
                    }
                }
                if (!this.f9737g) {
                    m14469c(-1);
                    this.f9740j = true;
                    chn.m13424j(this.f9734d, this.f9733c);
                }
            } catch (Exception e3) {
                this.f9739i = true;
                this.f9733c = e3.getMessage();
            }
            if (this.f9739i) {
                mo1809c(context);
                if (!(this.f9733c == null || this.f9740j)) {
                    chn.m13412f(this.f9734d, this.f9733c);
                }
            }
            m14479b();
        }
    }

    /* renamed from: b */
    protected void m14479b() {
        chn.m13408e("Url: " + this.f9734d + "; " + this.f9736f);
    }

    /* renamed from: b */
    public void m14480b(Context context) {
    }

    /* renamed from: c */
    public void mo1809c(Context context) {
    }

    /* renamed from: d */
    public void mo1810d(Context context) {
    }

    /* renamed from: a */
    protected void mo1807a(int i) {
    }

    /* renamed from: n */
    private void mo1811n() {
        if (!this.f9737g) {
            this.f9737g = true;
            m14482c();
        }
    }

    /* renamed from: c */
    private void m14469c(int i) {
        if (!this.f9738h) {
            this.f9738h = true;
            mo1807a(i);
        }
    }

    /* renamed from: c */
    protected void m14482c() {
        chn.m13415g(this.f9734d, this.f9733c);
        if (mo1801d()) {
            f9731a.m12079i().m13555b(-1);
        }
    }

    /* renamed from: d */
    protected boolean mo1801d() {
        return true;
    }

    /* renamed from: e */
    public final int mo1797e() {
        return 0;
    }

    /* renamed from: e */
    public dft m14487e(Context context) {
        if (this.f9732b == null) {
            this.f9732b = mo1802f(context);
        }
        return this.f9732b;
    }

    /* renamed from: f */
    public boolean mo1803f() {
        return false;
    }

    /* renamed from: a */
    protected static void m14468a(dft dft) {
        cpm.a(dft);
    }

    /* renamed from: g */
    public Intent mo1798g() {
        Intent g = super.mo1798g();
        g.setAction("com.9gag.android.app.API_CALLBACK");
        return g;
    }

    /* renamed from: g */
    protected String m14491g(Context context) {
        return f9731a.m12090t().a(mo1804h(context));
    }

    /* renamed from: a */
    protected void m14474a(Context context, Intent intent) {
        try {
            context.sendBroadcast(intent);
        } catch (Exception e) {
        }
    }

    /* renamed from: h */
    protected boolean m14493h() {
        return this.f9737g;
    }

    /* renamed from: i */
    protected boolean m14494i() {
        return this.f9738h;
    }

    /* renamed from: b */
    protected String mo1808b(String str) {
        return str;
    }

    /* renamed from: j */
    protected boolean mo1805j() {
        return true;
    }

    /* renamed from: b */
    public int m14477b(dft dft) {
        return dft.b();
    }

    /* renamed from: c */
    public String m14481c(dft dft) {
        return dft.e();
    }

    /* renamed from: k */
    protected String m14496k() {
        return this.f9733c;
    }

    /* renamed from: l */
    protected int m14497l() {
        return this.f9735e;
    }
}

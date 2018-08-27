package com.p000;

import android.content.Context;
import android.content.Intent;
import com.facebook.AccessToken;
import com.facebook.GraphResponse;
import com.ninegag.android.app.model.api.ApiBaseResponse;
import com.ninegag.android.app.model.api.ApiGetUserProfileResponse;
import com.ninegag.android.app.model.api.ApiUser;
import com.ninegag.android.app.otto.UserProfileLoadedEvent;

/* compiled from: GetUserProfileTask */
/* renamed from: cmz */
public class cmz extends cmg {
    /* renamed from: b */
    private boolean f9815b = false;
    /* renamed from: c */
    private String f9816c;
    /* renamed from: d */
    private String f9817d;
    /* renamed from: e */
    private String f9818e;

    /* renamed from: c */
    public void m14668c(String str) {
        this.f9817d = str;
    }

    /* renamed from: d */
    public void m14670d(String str) {
        this.f9818e = str;
    }

    /* renamed from: e */
    public void m14671e(String str) {
        this.f9816c = str;
        this.f9815b = true;
    }

    /* renamed from: a */
    public void mo1800a(ApiBaseResponse apiBaseResponse) {
        ApiGetUserProfileResponse apiGetUserProfileResponse = (ApiGetUserProfileResponse) apiBaseResponse;
        if (apiGetUserProfileResponse.success()) {
            ApiUser apiUser = apiGetUserProfileResponse.data.user;
            if (apiGetUserProfileResponse.data.user != null && apiUser.userId != null) {
                caf.m12046a().m12056a(apiUser.userId, apiUser);
                caf.m12046a().m12054a(new UserProfileLoadedEvent(apiUser, mo1798g()));
            }
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
        g.putExtra("command", 118);
        g.putExtra(AccessToken.USER_ID_KEY, this.f9817d);
        g.putExtra("username", this.f9818e);
        return g;
    }

    /* renamed from: h */
    protected String mo1804h(Context context) {
        if (this.f9815b) {
            return String.format("%s/v2/user-profile/accountId/%s", new Object[]{cae.m12035a(), this.f9816c});
        } else if (this.f9817d == null || this.f9817d.isEmpty()) {
            if (this.f9818e == null) {
                this.f9818e = "";
            }
            return String.format("%s/v2/user-profile/loginName/%s", new Object[]{cae.m12035a(), this.f9818e});
        } else {
            return String.format("%s/v2/user-profile/userId/%s", new Object[]{cae.m12035a(), this.f9817d});
        }
    }

    /* renamed from: m */
    public String mo1806m() {
        return null;
    }

    /* renamed from: a */
    protected ApiBaseResponse mo1799a(String str) {
        return (ApiBaseResponse) cpy.a(str, ApiGetUserProfileResponse.class, 1);
    }
}

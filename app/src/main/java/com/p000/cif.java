package com.p000;

import android.app.Activity;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.millennialmedia.android.MMSDK$Event;
import com.ninegag.android.app.otto.social.FacebookConnectCancelledEvent;
import java.util.Set;

/* compiled from: AppSocialFacebookController */
/* renamed from: cif */
public class cif extends dil {

    /* compiled from: AppSocialFacebookController */
    /* renamed from: cif$1 */
    class C17421 implements FacebookCallback<LoginResult> {
        /* renamed from: a */
        final /* synthetic */ cif f9330a;

        C17421(cif cif) {
            this.f9330a = cif;
        }

        public /* synthetic */ void onSuccess(Object obj) {
            m13652a((LoginResult) obj);
        }

        /* renamed from: a */
        public void m13652a(LoginResult loginResult) {
            this.f9330a.h().c("login callback success");
            Set declinedPermissions = loginResult.getAccessToken().getDeclinedPermissions();
            if (declinedPermissions == null || declinedPermissions.isEmpty() || !declinedPermissions.contains(MMSDK$Event.INTENT_EMAIL)) {
                cip.m13967a().m13895h(loginResult.getAccessToken().getToken());
                chn.m13445q("Auth", "FBLogin");
                return;
            }
            this.f9330a.h().c("email permission declined");
            dhe.c(new FacebookConnectCancelledEvent(2));
        }

        public void onCancel() {
            dhe.c(new FacebookConnectCancelledEvent(2));
            this.f9330a.h().d("fb cancelled");
            chn.m13445q("Auth", "FBLoginFail");
        }

        public void onError(FacebookException facebookException) {
            dhe.c(new FacebookConnectCancelledEvent(2));
            this.f9330a.h().d(facebookException.getMessage());
            chn.m13445q("Auth", "FBLoginFail");
        }
    }

    public cif(Activity activity, dig dig) {
        super(activity, dig);
    }

    /* renamed from: a */
    public FacebookCallback<LoginResult> m13657a() {
        return new C17421(this);
    }

    /* renamed from: b */
    public void m13658b() {
        super.b();
        h().c("requestFacebookLogin");
        cip.m13967a().m13881e(false);
    }
}

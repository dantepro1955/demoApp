package com.p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.CallbackManager.Factory;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;

/* compiled from: SocialFacebookController */
/* renamed from: dil */
public class dil {
    /* renamed from: a */
    private static final boolean f21709a = dik.f21704a;
    /* renamed from: b */
    private Activity f21710b;
    /* renamed from: c */
    private dig f21711c;
    /* renamed from: d */
    private CallbackManager f21712d;
    /* renamed from: e */
    private AccessTokenTracker f21713e;
    /* renamed from: f */
    private String f21714f = null;
    /* renamed from: g */
    private boolean f21715g = false;
    /* renamed from: h */
    private dii f21716h;

    /* compiled from: SocialFacebookController */
    /* renamed from: dil$1 */
    class C49241 extends AccessTokenTracker {
        /* renamed from: a */
        final /* synthetic */ dil f21707a;

        C49241(dil dil) {
            this.f21707a = dil;
        }

        protected void onCurrentAccessTokenChanged(AccessToken accessToken, AccessToken accessToken2) {
            if (dil.f21709a) {
                Log.d("SocialFacebookController", "FacebookCallback::onCurrentAccessTokenChanged() " + accessToken2);
            }
            this.f21707a.m27389a(accessToken2);
        }
    }

    /* compiled from: SocialFacebookController */
    /* renamed from: dil$2 */
    class C49252 implements FacebookCallback<LoginResult> {
        /* renamed from: a */
        final /* synthetic */ dil f21708a;

        C49252(dil dil) {
            this.f21708a = dil;
        }

        public /* synthetic */ void onSuccess(Object obj) {
            m27388a((LoginResult) obj);
        }

        /* renamed from: a */
        public void m27388a(LoginResult loginResult) {
            if (dil.f21709a) {
                Log.d("SocialFacebookController", "FacebookCallback::onSuccess()");
            }
        }

        public void onCancel() {
            if (dil.f21709a) {
                Log.d("SocialFacebookController", "FacebookCallback::onCancel()");
            }
        }

        public void onError(FacebookException facebookException) {
            if (dil.f21709a) {
                Log.d("SocialFacebookController", "FacebookCallback::onError()");
            }
        }
    }

    public dil(Activity activity, dig dig) {
        this.f21710b = activity;
        this.f21711c = dig;
    }

    /* renamed from: a */
    public void m27393a(Bundle bundle) {
        if (f21709a) {
            Log.d("SocialFacebookController", "onCreate");
        }
        FacebookSdk.sdkInitialize(this.f21710b.getApplicationContext());
        this.f21712d = Factory.create();
        LoginManager.getInstance().registerCallback(this.f21712d, m27392a());
        this.f21713e = new C49241(this);
    }

    /* renamed from: a */
    private void m27389a(AccessToken accessToken) {
        if (accessToken != null) {
            Set declinedPermissions = accessToken.getDeclinedPermissions();
            if (declinedPermissions == null || declinedPermissions.isEmpty() || !declinedPermissions.contains(MMSDK$Event.INTENT_EMAIL)) {
                String token = accessToken.getToken();
                Date expires = accessToken.getExpires();
                long time = expires == null ? 0 : expires.getTime() / 1000;
                if (f21709a) {
                    Log.d("SocialFacebookController", "handleToken() token=" + token);
                }
                if (f21709a) {
                    Log.d("SocialFacebookController", "handleToken() expiry=" + expires.toGMTString());
                }
                if (f21709a) {
                    Log.d("SocialFacebookController", "handleToken() mEventScopeOnce=" + this.f21714f);
                }
                if (this.f21714f == null) {
                    dhe.m27280a().m27269c(new din(token, time, this.f21715g));
                } else {
                    dhe.m27287c(this.f21714f, new din(token, time, this.f21715g));
                }
                this.f21714f = null;
            }
        }
    }

    /* renamed from: c */
    public void m27397c() {
        this.f21713e.stopTracking();
        this.f21710b = null;
    }

    /* renamed from: d */
    public void m27398d() {
        if (f21709a) {
            Log.d("SocialFacebookController", "onStart");
        }
    }

    /* renamed from: e */
    public void m27399e() {
        if (f21709a) {
            Log.d("SocialFacebookController", "onStop");
        }
    }

    /* renamed from: a */
    public boolean m27395a(int i, int i2, Intent intent) {
        if (f21709a) {
            Log.d("SocialFacebookController", "onActivityResult " + i + " " + i2);
        }
        this.f21712d.onActivityResult(i, i2, intent);
        return i2 == -1;
    }

    /* renamed from: a */
    public void m27394a(String str) {
        this.f21714f = str;
    }

    /* renamed from: f */
    public void m27400f() {
        if (f21709a) {
            Log.d("SocialFacebookController", "onLogout");
        }
        LoginManager.getInstance().logOut();
    }

    /* renamed from: b */
    public void m27396b() {
        if (f21709a) {
            Log.d("SocialFacebookController", "requestFacebookLogin");
        }
        if (this.f21716h == null) {
            LoginManager.getInstance().logInWithReadPermissions(this.f21710b, Arrays.asList(dih.f21700d));
        } else {
            LoginManager.getInstance().logInWithReadPermissions(this.f21710b, Arrays.asList(this.f21716h.m27371a()));
        }
    }

    /* renamed from: g */
    public void m27401g() {
    }

    /* renamed from: a */
    public FacebookCallback<LoginResult> m27392a() {
        return new C49252(this);
    }

    /* renamed from: h */
    protected dig m27402h() {
        return this.f21711c;
    }
}

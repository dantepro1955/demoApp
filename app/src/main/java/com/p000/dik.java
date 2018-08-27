package com.p000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* compiled from: SocialController */
/* renamed from: dik */
public class dik extends dfx {
    /* renamed from: a */
    public static boolean f21704a = false;
    /* renamed from: b */
    private dil f21705b;
    /* renamed from: c */
    private dim f21706c;

    /* compiled from: SocialController */
    /* renamed from: dik$a */
    public static class C4923a {
        /* renamed from: a */
        private dil f21702a;
        /* renamed from: b */
        private dim f21703b;

        private C4923a() {
        }

        /* renamed from: a */
        public C4923a m27373a(dil dil) {
            this.f21702a = dil;
            return this;
        }

        /* renamed from: a */
        public C4923a m27374a(dim dim) {
            this.f21703b = dim;
            return this;
        }

        /* renamed from: a */
        public dik m27375a() {
            return new dik(this.f21702a, this.f21703b);
        }

        /* renamed from: b */
        public static C4923a m27372b() {
            return new C4923a();
        }
    }

    private dik(dil dil, dim dim) {
        this.f21705b = dil;
        this.f21706c = dim;
    }

    /* renamed from: a */
    public static void m27376a(boolean z) {
        if (z) {
            Log.d("SocialController", "enableDebugLog=" + z);
        }
        f21704a = z;
    }

    /* renamed from: b */
    public void mo4388b(Bundle bundle) {
        super.mo4388b(bundle);
        if (f21704a) {
            Log.d("SocialController", "onCreate");
        }
        this.f21705b.m27393a(bundle);
        this.f21706c.m27449a(bundle);
    }

    /* renamed from: d */
    public void mo4395d() {
        super.mo4395d();
        if (this.f21705b != null) {
            this.f21705b.m27397c();
        }
        if (this.f21706c != null) {
            this.f21706c.m27453b();
        }
        this.f21705b = null;
        this.f21706c = null;
    }

    public void s_() {
        super.s_();
        if (f21704a) {
            Log.d("SocialController", "onStart");
        }
        this.f21705b.m27398d();
        this.f21706c.m27455c();
    }

    public void t_() {
        super.t_();
        if (f21704a) {
            Log.d("SocialController", "onStop");
        }
        this.f21705b.m27399e();
        this.f21706c.m27457d();
    }

    /* renamed from: a */
    public void mo4393a(int i, int i2, Intent intent) {
        super.mo4393a(i, i2, intent);
        if (f21704a) {
            Log.d("SocialController", "onActivityResult " + i + " " + i2);
        }
        if (this.f21706c.m27452a(i, i2, intent) || !this.f21705b.m27395a(i, i2, intent)) {
        }
    }

    /* renamed from: b */
    public void m27381b(boolean z) {
        if (this.f21705b != null) {
            this.f21705b.m27400f();
        }
        if (this.f21706c != null) {
            this.f21706c.m27451a(z);
        }
    }

    /* renamed from: f */
    public void m27383f() {
        m27378a(null);
    }

    /* renamed from: a */
    public void m27378a(String str) {
        if (f21704a) {
            Log.d("SocialController", "requestFacebookLogin() scope=" + str);
        }
        this.f21705b.m27394a(str);
        this.f21705b.m27396b();
    }

    /* renamed from: g */
    public void m27384g() {
        this.f21705b.m27401g();
    }

    /* renamed from: h */
    public void m27385h() {
        m27380b(null);
    }

    /* renamed from: b */
    public void m27380b(String str) {
        if (f21704a) {
            Log.d("SocialController", "requestGplusLogin() scope=" + str);
        }
        this.f21706c.m27454b(str);
        this.f21706c.m27448a();
    }

    /* renamed from: i */
    public void m27386i() {
        this.f21706c.m27460g();
    }

    /* renamed from: j */
    public void m27387j() {
        this.f21706c.m27459f();
    }
}

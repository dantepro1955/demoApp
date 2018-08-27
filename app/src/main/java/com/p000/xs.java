package com.p000;

import android.util.Log;
import com.facebook.stetho.server.http.HttpStatus;
import org.json.JSONObject;

/* renamed from: xs */
class xs implements yk {
    /* renamed from: a */
    final /* synthetic */ vm f25997a;
    /* renamed from: b */
    final /* synthetic */ String f25998b;
    /* renamed from: c */
    final /* synthetic */ xr f25999c;

    xs(xr xrVar, vm vmVar, String str) {
        this.f25999c = xrVar;
        this.f25997a = vmVar;
        this.f25998b = str;
    }

    /* renamed from: a */
    public void mo5589a(int i) {
        Object obj = 1;
        Object obj2 = (i < HttpStatus.HTTP_OK || i >= HttpStatus.HTTP_INTERNAL_SERVER_ERROR) ? 1 : null;
        if (i == -103) {
            obj = null;
        }
        if (obj2 == null || r0 == null || this.f25999c.f25937e <= 0) {
            this.f25999c.mo5589a(i);
            return;
        }
        long longValue = this.f25999c.f25938f < 0 ? ((Long) this.f25997a.m34391a(wp.f25908l)).longValue() : this.f25999c.f25938f;
        Log.w(this.f25998b, "Unable to send request due to server failure (code " + i + "). " + this.f25999c.f25937e + " attempts left, retrying in " + (((double) longValue) / 1000.0d) + " seconds...");
        this.f25999c.f25937e = this.f25999c.f25937e - 1;
        if (this.f25999c.f25937e == 0) {
            this.f25999c.m34720c();
        }
        this.f25997a.m34407l().m34804a(this.f25999c, xl.BACKGROUND, longValue);
    }

    /* renamed from: a */
    public void mo5590a(JSONObject jSONObject, int i) {
        this.f25999c.f25937e = 0;
        this.f25999c.mo5590a(jSONObject, i);
    }
}

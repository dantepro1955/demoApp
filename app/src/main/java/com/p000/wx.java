package com.p000;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.NativeProtocol;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: wx */
class wx extends wo {
    wx(vm vmVar) {
        super("SubmitData", vmVar);
    }

    /* renamed from: a */
    void m34712a(JSONObject jSONObject) {
        try {
            JSONObject a = yl.m34914a(jSONObject);
            ws h = this.b.m34403h();
            h.m34657a(wp.f25899c, a.getString("device_id"));
            h.m34657a(wp.f25901e, a.getString("device_token"));
            h.m34657a(wp.f25900d, a.getString("publisher_id"));
            h.m34659b();
            yl.m34916a(a, this.b);
            if (a.has("adserver_parameters")) {
                h.m34657a(wp.f25915s, a.getJSONObject("adserver_parameters").toString());
            }
        } catch (Throwable e) {
            this.c.mo5609b(this.a, "Unable to parse API response", e);
        }
    }

    /* renamed from: b */
    void m34713b(JSONObject jSONObject) {
        ym u = this.b.m34416u();
        yo b = u.m34923b();
        yp a = u.m34921a();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("model", a.f26058a);
        jSONObject2.put("os", a.f26059b);
        jSONObject2.put("brand", a.f26060c);
        jSONObject2.put("sdk_version", a.f26062e);
        jSONObject2.put("revision", a.f26061d);
        jSONObject2.put("country_code", a.f26063f);
        jSONObject2.put("carrier", a.f26064g);
        jSONObject2.put("type", "android");
        yn c = u.m34924c();
        String str = c.f26053b;
        boolean z = c.f26052a;
        if ((!z || ((Boolean) this.b.m34403h().m34655a(wp.aR)).booleanValue()) && zn.m34841d(str)) {
            jSONObject2.put("idfa", str);
        }
        jSONObject2.put("dnt", z);
        Locale locale = a.f26065h;
        if (locale != null) {
            jSONObject2.put("locale", locale.toString());
        }
        jSONObject.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("package_name", b.f26056c);
        jSONObject3.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, b.f26054a);
        jSONObject3.put("app_version", b.f26055b);
        jSONObject3.put("installed_at", b.f26057d);
        jSONObject3.put("applovin_sdk_version", "6.1.5");
        jSONObject3.put("ic", this.b.m34401f());
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.d);
        String string = defaultSharedPreferences.getString("com.applovin.sdk.impl.isFirstRun", null);
        if (zn.m34841d(string)) {
            jSONObject3.put("first_install", string);
            if (string.equalsIgnoreCase(Boolean.toString(true))) {
                defaultSharedPreferences.edit().putString("com.applovin.sdk.impl.isFirstRun", Boolean.toString(false)).apply();
            }
        }
        String str2 = (String) this.b.m34391a(wp.f25922z);
        if (str2 != null && str2.length() > 0) {
            jSONObject3.put("plugin_version", str2);
        }
        jSONObject.put("app_info", jSONObject3);
        if (((Boolean) this.b.m34391a(wp.f25876F)).booleanValue()) {
            Map a2 = ((yh) this.b.mo5560e()).m34889a();
            if (!(a2 == null || a2.isEmpty())) {
                jSONObject.put("targeting", vs.m34473a(a2));
            }
            jSONObject.put("stats", this.b.m34408m().m34706b());
        }
    }

    /* renamed from: c */
    void m34714c(JSONObject jSONObject) {
        xr wyVar = new wy(this, "Repeat" + this.a, wp.f25902f, this.b, jSONObject);
        wyVar.m34725a(wp.f25906j);
        wyVar.run();
    }

    public void run() {
        try {
            this.c.mo5608b(this.a, "Submitting user data...");
            JSONObject jSONObject = new JSONObject();
            m34713b(jSONObject);
            m34714c(jSONObject);
        } catch (Throwable e) {
            this.c.mo5609b(this.a, "Unable to build JSON message with collected data", e);
        }
    }
}

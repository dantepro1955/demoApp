package com.p000;

import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.mopub.common.AdType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bhd
/* renamed from: bjv */
public class bjv {
    /* renamed from: a */
    private final long f6586a;
    /* renamed from: b */
    private final List<String> f6587b = new ArrayList();
    /* renamed from: c */
    private final Map<String, ben> f6588c = new HashMap();
    /* renamed from: d */
    private String f6589d;
    /* renamed from: e */
    private String f6590e;
    /* renamed from: f */
    private boolean f6591f = false;

    public bjv(String str, long j) {
        this.f6590e = str;
        this.f6586a = j;
        m8913a(str);
    }

    /* renamed from: a */
    private void m8913a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1) != 1) {
                    this.f6591f = false;
                    bky.m9011e("App settings could not be fetched successfully.");
                    return;
                }
                this.f6591f = true;
                this.f6589d = jSONObject.optString("app_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        m8914a(optJSONArray.getJSONObject(i));
                    }
                }
            } catch (Throwable e) {
                bky.m9009c("Exception occurred while processing app setting json", e);
                ako.m2347i().m8934a(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    /* renamed from: a */
    private void m8914a(JSONObject jSONObject) throws JSONException {
        String optString = jSONObject.optString("format");
        CharSequence optString2 = jSONObject.optString("ad_unit_id");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            if (AdType.INTERSTITIAL.equalsIgnoreCase(optString)) {
                this.f6587b.add(optString2);
            } else if ("rewarded".equalsIgnoreCase(optString)) {
                JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                if (optJSONObject != null) {
                    this.f6588c.put(optString2, new ben(optJSONObject));
                }
            }
        }
    }

    /* renamed from: a */
    public long m8915a() {
        return this.f6586a;
    }

    /* renamed from: b */
    public boolean m8916b() {
        return this.f6591f;
    }

    /* renamed from: c */
    public String m8917c() {
        return this.f6590e;
    }

    /* renamed from: d */
    public String m8918d() {
        return this.f6589d;
    }

    /* renamed from: e */
    public Map<String, ben> m8919e() {
        return this.f6588c;
    }
}

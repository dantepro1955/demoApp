package com.p000;

import com.google.android.gms.internal.zzoo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bhd
/* renamed from: ben */
public final class ben {
    /* renamed from: a */
    public final List<bem> f5838a;
    /* renamed from: b */
    public final long f5839b;
    /* renamed from: c */
    public final List<String> f5840c;
    /* renamed from: d */
    public final List<String> f5841d;
    /* renamed from: e */
    public final List<String> f5842e;
    /* renamed from: f */
    public final List<String> f5843f;
    /* renamed from: g */
    public final boolean f5844g;
    /* renamed from: h */
    public final String f5845h;
    /* renamed from: i */
    public final long f5846i;
    /* renamed from: j */
    public final String f5847j;
    /* renamed from: k */
    public final int f5848k;
    /* renamed from: l */
    public final int f5849l;
    /* renamed from: m */
    public final long f5850m;
    /* renamed from: n */
    public final boolean f5851n;
    /* renamed from: o */
    public final boolean f5852o;
    /* renamed from: p */
    public int f5853p;
    /* renamed from: q */
    public int f5854q;

    public ben(String str) throws JSONException {
        this(new JSONObject(str));
    }

    public ben(List<bem> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.f5838a = list;
        this.f5839b = j;
        this.f5840c = list2;
        this.f5841d = list3;
        this.f5842e = list4;
        this.f5843f = list5;
        this.f5844g = z;
        this.f5845h = str;
        this.f5846i = j2;
        this.f5853p = i;
        this.f5854q = i2;
        this.f5847j = str2;
        this.f5848k = i3;
        this.f5849l = i4;
        this.f5850m = j3;
        this.f5851n = z2;
        this.f5852o = false;
    }

    public ben(JSONObject jSONObject) throws JSONException {
        if (bky.m9005a(2)) {
            String str = "Mediation Response JSON: ";
            String valueOf = String.valueOf(jSONObject.toString(2));
            bkc.m9012a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        List arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            bem bem = new bem(jSONArray.getJSONObject(i2));
            arrayList.add(bem);
            if (i < 0 && m7849a(bem)) {
                i = i2;
            }
        }
        this.f5853p = i;
        this.f5854q = jSONArray.length();
        this.f5838a = Collections.unmodifiableList(arrayList);
        this.f5845h = jSONObject.optString("qdata");
        this.f5849l = jSONObject.optInt("fs_model_type", -1);
        this.f5850m = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f5839b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            this.f5840c = ako.m2362x().m7901a(optJSONObject, "click_urls");
            this.f5841d = ako.m2362x().m7901a(optJSONObject, "imp_urls");
            this.f5842e = ako.m2362x().m7901a(optJSONObject, "nofill_urls");
            this.f5843f = ako.m2362x().m7901a(optJSONObject, "remote_ping_urls");
            this.f5844g = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            this.f5846i = optLong > 0 ? optLong * 1000 : -1;
            zzoo a = zzoo.m19681a(optJSONObject.optJSONArray("rewards"));
            if (a == null) {
                this.f5847j = null;
                this.f5848k = 0;
            } else {
                this.f5847j = a.f15114a;
                this.f5848k = a.f15115b;
            }
            this.f5851n = optJSONObject.optBoolean("use_displayed_impression", false);
            this.f5852o = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            return;
        }
        this.f5839b = -1;
        this.f5840c = null;
        this.f5841d = null;
        this.f5842e = null;
        this.f5843f = null;
        this.f5846i = -1;
        this.f5847j = null;
        this.f5848k = 0;
        this.f5851n = false;
        this.f5844g = false;
        this.f5852o = false;
    }

    /* renamed from: a */
    private boolean m7849a(bem bem) {
        for (String equals : bem.f5824c) {
            if (equals.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}

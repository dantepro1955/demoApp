package com.p000;

import com.inmobi.commons.ads.cache.AdDatabaseHelper;
import com.inmobi.monetization.internal.imai.db.ClickDatabaseManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bhd
/* renamed from: bem */
public final class bem {
    /* renamed from: a */
    public final String f5822a;
    /* renamed from: b */
    public final String f5823b;
    /* renamed from: c */
    public final List<String> f5824c;
    /* renamed from: d */
    public final String f5825d;
    /* renamed from: e */
    public final String f5826e;
    /* renamed from: f */
    public final List<String> f5827f;
    /* renamed from: g */
    public final List<String> f5828g;
    /* renamed from: h */
    public final List<String> f5829h;
    /* renamed from: i */
    public final String f5830i;
    /* renamed from: j */
    public final List<String> f5831j;
    /* renamed from: k */
    public final List<String> f5832k;
    /* renamed from: l */
    public final String f5833l;
    /* renamed from: m */
    public final String f5834m;
    /* renamed from: n */
    public final String f5835n;
    /* renamed from: o */
    public final List<String> f5836o;
    /* renamed from: p */
    public final String f5837p;

    public bem(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, String str5, String str6, List<String> list4, List<String> list5, String str7, String str8, String str9, List<String> list6, String str10, List<String> list7) {
        this.f5822a = str;
        this.f5823b = str2;
        this.f5824c = list;
        this.f5825d = str3;
        this.f5826e = str4;
        this.f5827f = list2;
        this.f5828g = list3;
        this.f5830i = str5;
        this.f5831j = list4;
        this.f5832k = list5;
        this.f5833l = str7;
        this.f5834m = str8;
        this.f5835n = str9;
        this.f5836o = list6;
        this.f5837p = str10;
        this.f5829h = list7;
    }

    public bem(JSONObject jSONObject) throws JSONException {
        String str = null;
        this.f5823b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f5824c = Collections.unmodifiableList(arrayList);
        this.f5825d = jSONObject.optString("allocation_id", null);
        this.f5827f = ako.m2362x().m7901a(jSONObject, ClickDatabaseManager.COLUMN_CLICK_URL);
        this.f5828g = ako.m2362x().m7901a(jSONObject, "imp_urls");
        this.f5829h = ako.m2362x().m7901a(jSONObject, "fill_urls");
        this.f5831j = ako.m2362x().m7901a(jSONObject, "video_start_urls");
        this.f5832k = ako.m2362x().m7901a(jSONObject, "video_complete_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject(AdDatabaseHelper.TABLE_AD);
        this.f5822a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f5830i = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f5826e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f5833l = jSONObject.optString("html_template", null);
        this.f5834m = jSONObject.optString("ad_base_url", null);
        optJSONObject = jSONObject.optJSONObject("assets");
        this.f5835n = optJSONObject != null ? optJSONObject.toString() : null;
        this.f5836o = ako.m2362x().m7901a(jSONObject, "template_ids");
        optJSONObject = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject != null) {
            str = optJSONObject.toString();
        }
        this.f5837p = str;
    }
}

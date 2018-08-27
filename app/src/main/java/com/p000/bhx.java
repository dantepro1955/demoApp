package com.p000;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug.MemoryInfo;
import android.text.TextUtils;
import com.facebook.applinks.AppLinkData;
import com.flurry.android.AdCreative;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzfp;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzmk;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.internal.zzmp;
import com.google.android.gms.internal.zzoo;
import com.google.android.gms.internal.zzor;
import com.google.android.gms.internal.zzqh;
import com.inmobi.commons.ads.cache.AdDatabaseHelper;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import com.millennialmedia.NativeAd;
import com.millennialmedia.android.MMSDK$Event;
import com.millennialmedia.internal.utils.EnvironmentUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.big.C1235a;

@bhd
/* renamed from: bhx */
public final class bhx {
    /* renamed from: a */
    private static final SimpleDateFormat f6330a = new SimpleDateFormat("yyyyMMdd", Locale.US);

    /* renamed from: a */
    private static Bundle m8566a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("runtime_free", Long.toString(bundle.getLong("runtime_free_memory", -1)));
        bundle2.putString("runtime_max", Long.toString(bundle.getLong("runtime_max_memory", -1)));
        bundle2.putString("runtime_total", Long.toString(bundle.getLong("runtime_total_memory", -1)));
        bundle2.putString("web_view_count", Integer.toString(bundle.getInt("web_view_count", 0)));
        MemoryInfo memoryInfo = (MemoryInfo) bundle.getParcelable("debug_memory_info");
        if (memoryInfo != null) {
            bundle2.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
            bundle2.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
            bundle2.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
            bundle2.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
            bundle2.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
            bundle2.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
            bundle2.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
            bundle2.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
            bundle2.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
        }
        return bundle2;
    }

    /* renamed from: a */
    public static zzmn m8567a(Context context, zzmk zzmk, String str) {
        String optString;
        try {
            String str2;
            JSONObject jSONObject = new JSONObject(str);
            String optString2 = jSONObject.optString("ad_base_url", null);
            Object optString3 = jSONObject.optString("ad_url", null);
            String optString4 = jSONObject.optString("ad_size", null);
            String optString5 = jSONObject.optString("ad_slot_size", optString4);
            boolean z = (zzmk == null || zzmk.f15044m == 0) ? false : true;
            CharSequence optString6 = jSONObject.optString("ad_json", null);
            if (optString6 == null) {
                optString6 = jSONObject.optString("ad_html", null);
            }
            if (optString6 == null) {
                optString6 = jSONObject.optString(NativeAd.COMPONENT_ID_BODY, null);
            }
            long j = -1;
            String optString7 = jSONObject.optString("debug_dialog", null);
            String optString8 = jSONObject.optString("debug_signals", null);
            long j2 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1;
            optString = jSONObject.optString("orientation", null);
            int i = -1;
            if (EnvironmentUtils.ORIENTATION_PORTRAIT.equals(optString)) {
                i = ako.m2345g().mo1263b();
            } else if (EnvironmentUtils.ORIENTATION_LANDSCAPE.equals(optString)) {
                i = ako.m2345g().mo1261a();
            }
            zzmn zzmn = null;
            if (!TextUtils.isEmpty(optString6) || TextUtils.isEmpty(optString3)) {
                CharSequence charSequence = optString6;
            } else {
                zzmn = bhw.m8561a(zzmk, context, zzmk.f15042k.f15121a, optString3, null, null, null, null);
                optString2 = zzmn.f15076b;
                str2 = zzmn.f15077c;
                j = zzmn.f15088n;
            }
            if (str2 == null) {
                return new zzmn(0);
            }
            long j3;
            String optString9;
            String str3;
            boolean optBoolean;
            JSONArray optJSONArray = jSONObject.optJSONArray("click_urls");
            List list = zzmn == null ? null : zzmn.f15078d;
            if (optJSONArray != null) {
                list = bhx.m8571a(optJSONArray, list);
            }
            optJSONArray = jSONObject.optJSONArray("impression_urls");
            List list2 = zzmn == null ? null : zzmn.f15080f;
            if (optJSONArray != null) {
                list2 = bhx.m8571a(optJSONArray, list2);
            }
            optJSONArray = jSONObject.optJSONArray("manual_impression_urls");
            List list3 = zzmn == null ? null : zzmn.f15084j;
            if (optJSONArray != null) {
                list3 = bhx.m8571a(optJSONArray, list3);
            }
            if (zzmn != null) {
                if (zzmn.f15086l != -1) {
                    i = zzmn.f15086l;
                }
                if (zzmn.f15081g > 0) {
                    j3 = zzmn.f15081g;
                    optString9 = jSONObject.optString("active_view");
                    str3 = null;
                    optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                    if (optBoolean) {
                        str3 = jSONObject.optString("ad_passback_url", null);
                    }
                    return new zzmn(zzmk, optString2, str2, list, list2, j3, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), list3, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, str3, optString9, jSONObject.optBoolean("custom_render_allowed", false), z, zzmk.f15047p, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), zzoo.m19681a(jSONObject.optJSONArray("rewards")), bhx.m8571a(jSONObject.optJSONArray("video_start_urls"), null), bhx.m8571a(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), zzmp.m19675a(jSONObject.optJSONObject("auto_protection_configuration")), zzmk.f15017H, jSONObject.optString("set_cookie", ""), bhx.m8571a(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", zzmk.f15021L), optString5, zzor.m19683a(jSONObject.optJSONObject("safe_browsing")), optString8, jSONObject.optBoolean("content_vertical_opted_out", true), zzmk.f15031V);
                }
            }
            j3 = j2;
            optString9 = jSONObject.optString("active_view");
            str3 = null;
            optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
            if (optBoolean) {
                str3 = jSONObject.optString("ad_passback_url", null);
            }
            return new zzmn(zzmk, optString2, str2, list, list2, j3, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), list3, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, str3, optString9, jSONObject.optBoolean("custom_render_allowed", false), z, zzmk.f15047p, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), zzoo.m19681a(jSONObject.optJSONArray("rewards")), bhx.m8571a(jSONObject.optJSONArray("video_start_urls"), null), bhx.m8571a(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), zzmp.m19675a(jSONObject.optJSONObject("auto_protection_configuration")), zzmk.f15017H, jSONObject.optString("set_cookie", ""), bhx.m8571a(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", zzmk.f15021L), optString5, zzor.m19683a(jSONObject.optJSONObject("safe_browsing")), optString8, jSONObject.optBoolean("content_vertical_opted_out", true), zzmk.f15031V);
        } catch (JSONException e) {
            String str4 = "Could not parse the inline ad response: ";
            optString = String.valueOf(e.getMessage());
            bky.m9011e(optString.length() != 0 ? str4.concat(optString) : new String(str4));
            return new zzmn(0);
        }
    }

    /* renamed from: a */
    private static Integer m8568a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    /* renamed from: a */
    private static String m8569a(int i) {
        return String.format(Locale.US, "#%06x", new Object[]{Integer.valueOf(16777215 & i)});
    }

    /* renamed from: a */
    private static String m8570a(zzhc zzhc) {
        switch (zzhc != null ? zzhc.f14963c : 0) {
            case 1:
                return EnvironmentUtils.ORIENTATION_PORTRAIT;
            case 2:
                return EnvironmentUtils.ORIENTATION_LANDSCAPE;
            default:
                return "any";
        }
    }

    /* renamed from: a */
    private static List<String> m8571a(JSONArray jSONArray, List<String> list) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new LinkedList();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    /* renamed from: a */
    static JSONArray m8572a(List<String> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m8573a(Context context, bhu bhu) {
        Object obj;
        String str;
        String valueOf;
        zzmk zzmk = bhu.f6293i;
        Location location = bhu.f6288d;
        bic bic = bhu.f6294j;
        Bundle bundle = bhu.f6285a;
        JSONObject jSONObject = bhu.f6295k;
        HashMap hashMap = new HashMap();
        hashMap.put("extra_caps", bbb.bY.m7064c());
        if (bhu.f6287c.size() > 0) {
            hashMap.put("eid", TextUtils.join(",", bhu.f6287c));
        }
        if (zzmk.f15033b != null) {
            hashMap.put("ad_pos", zzmk.f15033b);
        }
        bhx.m8579a(hashMap, zzmk.f15034c);
        if (zzmk.f15035d.f14937g != null) {
            obj = null;
            Object obj2 = null;
            for (zzeg zzeg : zzmk.f15035d.f14937g) {
                if (!zzeg.f14939i && r3 == null) {
                    hashMap.put("format", zzeg.f14931a);
                    obj2 = 1;
                }
                if (zzeg.f14939i && r2 == null) {
                    hashMap.put("fluid", "height");
                    obj = 1;
                }
                if (obj2 != null && r2 != null) {
                    break;
                }
            }
        } else {
            hashMap.put("format", zzmk.f15035d.f14931a);
            if (zzmk.f15035d.f14939i) {
                hashMap.put("fluid", "height");
            }
        }
        if (zzmk.f15035d.f14935e == -1) {
            hashMap.put("smart_w", "full");
        }
        if (zzmk.f15035d.f14932b == -2) {
            hashMap.put("smart_h", "auto");
        }
        if (zzmk.f15035d.f14937g != null) {
            StringBuilder stringBuilder = new StringBuilder();
            obj = null;
            for (zzeg zzeg2 : zzmk.f15035d.f14937g) {
                if (zzeg2.f14939i) {
                    obj = 1;
                } else {
                    int i;
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append("|");
                    }
                    if (zzeg2.f14935e == -1) {
                        i = (int) (((float) zzeg2.f14936f) / bic.f6434r);
                    } else {
                        try {
                            i = zzeg2.f14935e;
                        } catch (JSONException e) {
                            str = "Problem serializing ad request to JSON: ";
                            valueOf = String.valueOf(e.getMessage());
                            bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                            return null;
                        }
                    }
                    stringBuilder.append(i);
                    stringBuilder.append("x");
                    stringBuilder.append(zzeg2.f14932b == -2 ? (int) (((float) zzeg2.f14933c) / bic.f6434r) : zzeg2.f14932b);
                }
            }
            if (obj != null) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.insert(0, "|");
                }
                stringBuilder.insert(0, "320x50");
            }
            hashMap.put("sz", stringBuilder);
        }
        if (zzmk.f15044m != 0) {
            hashMap.put("native_version", Integer.valueOf(zzmk.f15044m));
            hashMap.put("native_templates", zzmk.f15045n);
            hashMap.put("native_image_orientation", bhx.m8570a(zzmk.f15056y));
            if (!zzmk.f15057z.isEmpty()) {
                hashMap.put("native_custom_templates", zzmk.f15057z);
            }
        }
        if (zzmk.f15035d.f14940j) {
            hashMap.put("ene", Boolean.valueOf(true));
        }
        if (zzmk.f15025P != null) {
            hashMap.put("is_icon_ad", Boolean.valueOf(true));
            hashMap.put("icon_ad_expansion_behavior", Integer.valueOf(zzmk.f15025P.f14943a));
        }
        hashMap.put("slotname", zzmk.f15036e);
        hashMap.put("pn", zzmk.f15037f.packageName);
        if (zzmk.f15038g != null) {
            hashMap.put("vc", Integer.valueOf(zzmk.f15038g.versionCode));
        }
        hashMap.put("ms", bhu.f6291g);
        hashMap.put("seq_num", zzmk.f15040i);
        hashMap.put("session_id", zzmk.f15041j);
        hashMap.put("js", zzmk.f15042k.f15121a);
        bhx.m8578a(hashMap, bic, bhu.f6289e, zzmk.f15023N, bhu.f6286b);
        bhx.m8577a(hashMap, bhu, context);
        hashMap.put("platform", Build.MANUFACTURER);
        hashMap.put("submodel", Build.MODEL);
        if (location != null) {
            bhx.m8576a(hashMap, location);
        } else if (zzmk.f15034c.f14913a >= 2 && zzmk.f15034c.f14923k != null) {
            bhx.m8576a(hashMap, zzmk.f15034c.f14923k);
        }
        if (zzmk.f15032a >= 2) {
            hashMap.put("quality_signals", zzmk.f15043l);
        }
        if (zzmk.f15032a >= 4 && zzmk.f15047p) {
            hashMap.put("forceHttps", Boolean.valueOf(zzmk.f15047p));
        }
        if (bundle != null) {
            hashMap.put("content_info", bundle);
        }
        if (zzmk.f15032a >= 5) {
            hashMap.put("u_sd", Float.valueOf(zzmk.f15050s));
            hashMap.put("sh", Integer.valueOf(zzmk.f15049r));
            hashMap.put("sw", Integer.valueOf(zzmk.f15048q));
        } else {
            hashMap.put("u_sd", Float.valueOf(bic.f6434r));
            hashMap.put("sh", Integer.valueOf(bic.f6436t));
            hashMap.put("sw", Integer.valueOf(bic.f6435s));
        }
        if (zzmk.f15032a >= 6) {
            if (!TextUtils.isEmpty(zzmk.f15051t)) {
                try {
                    hashMap.put("view_hierarchy", new JSONObject(zzmk.f15051t));
                } catch (Throwable e2) {
                    bky.m9009c("Problem serializing view hierarchy to JSON", e2);
                }
            }
            hashMap.put("correlation_id", Long.valueOf(zzmk.f15052u));
        }
        if (zzmk.f15032a >= 7) {
            hashMap.put("request_id", zzmk.f15053v);
        }
        if (zzmk.f15032a >= 11 && zzmk.f15011B != null) {
            hashMap.put("capability", zzmk.f15011B.m19676a());
        }
        if (zzmk.f15032a >= 12 && !TextUtils.isEmpty(zzmk.f15012C)) {
            hashMap.put("anchor", zzmk.f15012C);
        }
        if (zzmk.f15032a >= 13) {
            hashMap.put("android_app_volume", Float.valueOf(zzmk.f15013D));
        }
        if (zzmk.f15032a >= 18) {
            hashMap.put("android_app_muted", Boolean.valueOf(zzmk.f15019J));
        }
        if (zzmk.f15032a >= 14 && zzmk.f15014E > 0) {
            hashMap.put("target_api", Integer.valueOf(zzmk.f15014E));
        }
        if (zzmk.f15032a >= 15) {
            hashMap.put("scroll_index", Integer.valueOf(zzmk.f15015F == -1 ? -1 : zzmk.f15015F));
        }
        if (zzmk.f15032a >= 16) {
            hashMap.put("_activity_context", Boolean.valueOf(zzmk.f15016G));
        }
        if (zzmk.f15032a >= 18) {
            if (!TextUtils.isEmpty(zzmk.f15020K)) {
                try {
                    hashMap.put("app_settings", new JSONObject(zzmk.f15020K));
                } catch (Throwable e22) {
                    bky.m9009c("Problem creating json from app settings", e22);
                }
            }
            hashMap.put("render_in_browser", Boolean.valueOf(zzmk.f15021L));
        }
        if (zzmk.f15032a >= 18) {
            hashMap.put("android_num_video_cache_tasks", Integer.valueOf(zzmk.f15022M));
        }
        bhx.m8575a(context, hashMap, zzmk.f15042k);
        hashMap.put("cache_state", jSONObject);
        if (zzmk.f15032a >= 19) {
            hashMap.put("gct", zzmk.f15024O);
        }
        if (zzmk.f15032a >= 21 && zzmk.f15026Q) {
            hashMap.put("de", "1");
        }
        if (((Boolean) bbb.aW.m7064c()).booleanValue()) {
            bhx.m8581a(hashMap, zzmk);
        }
        if (zzmk.f15032a >= 22 && ako.m2336D().m8879a()) {
            hashMap.put("gmp_app_id", zzmk.f15028S);
            hashMap.put("fbs_aiid", zzmk.f15029T);
            hashMap.put("fbs_aeid", zzmk.f15030U);
        }
        if (bky.m9005a(2)) {
            str = "Ad Request JSON: ";
            valueOf = String.valueOf(ako.m2343e().m9095a((Map) hashMap).toString(2));
            bkc.m9012a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        return ako.m2343e().m9095a((Map) hashMap);
    }

    /* renamed from: a */
    public static JSONObject m8574a(zzmn zzmn) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (zzmn.f15076b != null) {
            jSONObject.put("ad_base_url", zzmn.f15076b);
        }
        if (zzmn.f15087m != null) {
            jSONObject.put("ad_size", zzmn.f15087m);
        }
        jSONObject.put("native", zzmn.f15094t);
        if (zzmn.f15094t) {
            jSONObject.put("ad_json", zzmn.f15077c);
        } else {
            jSONObject.put("ad_html", zzmn.f15077c);
        }
        if (zzmn.f15089o != null) {
            jSONObject.put("debug_dialog", zzmn.f15089o);
        }
        if (zzmn.f15071N != null) {
            jSONObject.put("debug_signals", zzmn.f15071N);
        }
        if (zzmn.f15081g != -1) {
            jSONObject.put("interstitial_timeout", ((double) zzmn.f15081g) / 1000.0d);
        }
        if (zzmn.f15086l == ako.m2345g().mo1263b()) {
            jSONObject.put("orientation", EnvironmentUtils.ORIENTATION_PORTRAIT);
        } else if (zzmn.f15086l == ako.m2345g().mo1261a()) {
            jSONObject.put("orientation", EnvironmentUtils.ORIENTATION_LANDSCAPE);
        }
        if (zzmn.f15078d != null) {
            jSONObject.put("click_urls", bhx.m8572a(zzmn.f15078d));
        }
        if (zzmn.f15080f != null) {
            jSONObject.put("impression_urls", bhx.m8572a(zzmn.f15080f));
        }
        if (zzmn.f15084j != null) {
            jSONObject.put("manual_impression_urls", bhx.m8572a(zzmn.f15084j));
        }
        if (zzmn.f15092r != null) {
            jSONObject.put("active_view", zzmn.f15092r);
        }
        jSONObject.put("ad_is_javascript", zzmn.f15090p);
        if (zzmn.f15091q != null) {
            jSONObject.put("ad_passback_url", zzmn.f15091q);
        }
        jSONObject.put("mediation", zzmn.f15082h);
        jSONObject.put("custom_render_allowed", zzmn.f15093s);
        jSONObject.put("content_url_opted_out", zzmn.f15096v);
        jSONObject.put("content_vertical_opted_out", zzmn.f15072O);
        jSONObject.put("prefetch", zzmn.f15097w);
        if (zzmn.f15085k != -1) {
            jSONObject.put("refresh_interval_milliseconds", zzmn.f15085k);
        }
        if (zzmn.f15083i != -1) {
            jSONObject.put("mediation_config_cache_time_milliseconds", zzmn.f15083i);
        }
        if (!TextUtils.isEmpty(zzmn.f15100z)) {
            jSONObject.put("gws_query_id", zzmn.f15100z);
        }
        jSONObject.put("fluid", zzmn.f15058A ? "height" : "");
        jSONObject.put("native_express", zzmn.f15059B);
        if (zzmn.f15061D != null) {
            jSONObject.put("video_start_urls", bhx.m8572a(zzmn.f15061D));
        }
        if (zzmn.f15062E != null) {
            jSONObject.put("video_complete_urls", bhx.m8572a(zzmn.f15062E));
        }
        if (zzmn.f15060C != null) {
            jSONObject.put("rewards", zzmn.f15060C.m19682a());
        }
        jSONObject.put("use_displayed_impression", zzmn.f15063F);
        jSONObject.put("auto_protection_configuration", zzmn.f15064G);
        jSONObject.put("render_in_browser", zzmn.f15068K);
        return jSONObject;
    }

    /* renamed from: a */
    private static void m8575a(Context context, HashMap<String, Object> hashMap, zzqh zzqh) {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString("cl", "155828604");
        bundle2.putString("rapid_rc", "dev");
        bundle2.putString("rapid_rollup", "HEAD");
        bundle.putBundle("build_meta", bundle2);
        bundle.putString("mf", Boolean.toString(((Boolean) bbb.ca.m7064c()).booleanValue()));
        bundle.putBoolean("instant_app", ato.m5611b(context).m5607a());
        bundle.putBoolean("lite", zzqh.f15125e);
        hashMap.put("sdk_env", bundle);
    }

    /* renamed from: a */
    private static void m8576a(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }

    /* renamed from: a */
    private static void m8577a(HashMap<String, Object> hashMap, bhu bhu, Context context) {
        Bundle bundle = new Bundle();
        bundle.putString("doritos", bhu.f6290f);
        if (((Boolean) bbb.aM.m7064c()).booleanValue()) {
            Object obj = null;
            boolean z = false;
            if (bhu.f6292h != null) {
                obj = bhu.f6292h.getId();
                z = bhu.f6292h.isLimitAdTrackingEnabled();
            }
            if (TextUtils.isEmpty(obj)) {
                bundle.putString("pdid", azp.m6789a().m9297b(context));
                bundle.putString("pdidtype", "ssaid");
            } else {
                bundle.putString("rdid", obj);
                bundle.putBoolean("is_lat", z);
                bundle.putString("idtype", AdDatabaseHelper.COLUMN_AD_ID);
            }
        }
        hashMap.put("pii", bundle);
    }

    /* renamed from: a */
    private static void m8578a(HashMap<String, Object> hashMap, bic bic, C1235a c1235a, Bundle bundle, Bundle bundle2) {
        hashMap.put(AnalyticsSQLiteHelper.EVENT_LIST_AM, Integer.valueOf(bic.f6417a));
        hashMap.put("cog", bhx.m8568a(bic.f6418b));
        hashMap.put("coh", bhx.m8568a(bic.f6419c));
        if (!TextUtils.isEmpty(bic.f6420d)) {
            hashMap.put("carrier", bic.f6420d);
        }
        hashMap.put("gl", bic.f6421e);
        if (bic.f6422f) {
            hashMap.put("simulator", Integer.valueOf(1));
        }
        if (bic.f6423g) {
            hashMap.put("is_sidewinder", Integer.valueOf(1));
        }
        hashMap.put("ma", bhx.m8568a(bic.f6424h));
        hashMap.put("sp", bhx.m8568a(bic.f6425i));
        hashMap.put("hl", bic.f6426j);
        if (!TextUtils.isEmpty(bic.f6427k)) {
            hashMap.put("mv", bic.f6427k);
        }
        hashMap.put("muv", Integer.valueOf(bic.f6428l));
        if (bic.f6429m != -2) {
            hashMap.put("cnt", Integer.valueOf(bic.f6429m));
        }
        hashMap.put("gnt", Integer.valueOf(bic.f6430n));
        hashMap.put("pt", Integer.valueOf(bic.f6431o));
        hashMap.put("rm", Integer.valueOf(bic.f6432p));
        hashMap.put("riv", Integer.valueOf(bic.f6433q));
        Bundle bundle3 = new Bundle();
        bundle3.putString("build", bic.f6441y);
        Bundle bundle4 = new Bundle();
        bundle4.putBoolean("is_charging", bic.f6438v);
        bundle4.putDouble("battery_level", bic.f6437u);
        bundle3.putBundle("battery", bundle4);
        bundle4 = new Bundle();
        bundle4.putInt("active_network_state", bic.f6440x);
        bundle4.putBoolean("active_network_metered", bic.f6439w);
        if (c1235a != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("predicted_latency_micros", c1235a.f6448a);
            bundle5.putLong("predicted_down_throughput_bps", c1235a.f6449b);
            bundle5.putLong("predicted_up_throughput_bps", c1235a.f6450c);
            bundle4.putBundle("predictions", bundle5);
        }
        bundle3.putBundle("network", bundle4);
        bundle4 = new Bundle();
        bundle4.putBoolean("is_browser_custom_tabs_capable", bic.f6442z);
        bundle3.putBundle(MMSDK$Event.INTENT_EXTERNAL_BROWSER, bundle4);
        if (bundle != null) {
            bundle3.putBundle("android_mem_info", bhx.m8566a(bundle));
        }
        bundle4 = new Bundle();
        bundle4.putBundle("parental_controls", bundle2);
        bundle3.putBundle("play_store", bundle4);
        hashMap.put("device", bundle3);
    }

    /* renamed from: a */
    private static void m8579a(HashMap<String, Object> hashMap, zzec zzec) {
        String a = bka.m9001a();
        if (a != null) {
            hashMap.put("abf", a);
        }
        if (zzec.f14914b != -1) {
            hashMap.put("cust_age", f6330a.format(new Date(zzec.f14914b)));
        }
        if (zzec.f14915c != null) {
            hashMap.put(AppLinkData.ARGUMENTS_EXTRAS_KEY, zzec.f14915c);
        }
        if (zzec.f14916d != -1) {
            hashMap.put("cust_gender", Integer.valueOf(zzec.f14916d));
        }
        if (zzec.f14917e != null) {
            hashMap.put("kw", zzec.f14917e);
        }
        if (zzec.f14919g != -1) {
            hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(zzec.f14919g));
        }
        if (zzec.f14918f) {
            hashMap.put("adtest", "on");
        }
        if (zzec.f14913a >= 2) {
            if (zzec.f14920h) {
                hashMap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(zzec.f14921i)) {
                hashMap.put("ppid", zzec.f14921i);
            }
            if (zzec.f14922j != null) {
                bhx.m8580a((HashMap) hashMap, zzec.f14922j);
            }
        }
        if (zzec.f14913a >= 3 && zzec.f14924l != null) {
            hashMap.put("url", zzec.f14924l);
        }
        if (zzec.f14913a >= 5) {
            if (zzec.f14926n != null) {
                hashMap.put("custom_targeting", zzec.f14926n);
            }
            if (zzec.f14927o != null) {
                hashMap.put("category_exclusions", zzec.f14927o);
            }
            if (zzec.f14928p != null) {
                hashMap.put("request_agent", zzec.f14928p);
            }
        }
        if (zzec.f14913a >= 6 && zzec.f14929q != null) {
            hashMap.put("request_pkg", zzec.f14929q);
        }
        if (zzec.f14913a >= 7) {
            hashMap.put("is_designed_for_families", Boolean.valueOf(zzec.f14930r));
        }
    }

    /* renamed from: a */
    private static void m8580a(HashMap<String, Object> hashMap, zzfp zzfp) {
        Object obj;
        Object obj2 = null;
        if (Color.alpha(zzfp.f14944a) != 0) {
            hashMap.put("acolor", bhx.m8569a(zzfp.f14944a));
        }
        if (Color.alpha(zzfp.f14945b) != 0) {
            hashMap.put("bgcolor", bhx.m8569a(zzfp.f14945b));
        }
        if (!(Color.alpha(zzfp.f14946c) == 0 || Color.alpha(zzfp.f14947d) == 0)) {
            hashMap.put("gradientto", bhx.m8569a(zzfp.f14946c));
            hashMap.put("gradientfrom", bhx.m8569a(zzfp.f14947d));
        }
        if (Color.alpha(zzfp.f14948e) != 0) {
            hashMap.put("bcolor", bhx.m8569a(zzfp.f14948e));
        }
        hashMap.put("bthick", Integer.toString(zzfp.f14949f));
        switch (zzfp.f14950g) {
            case 0:
                obj = AdCreative.kFixNone;
                break;
            case 1:
                obj = "dashed";
                break;
            case 2:
                obj = "dotted";
                break;
            case 3:
                obj = "solid";
                break;
            default:
                obj = null;
                break;
        }
        if (obj != null) {
            hashMap.put("btype", obj);
        }
        switch (zzfp.f14951h) {
            case 0:
                obj2 = "light";
                break;
            case 1:
                obj2 = "medium";
                break;
            case 2:
                obj2 = "dark";
                break;
        }
        if (obj2 != null) {
            hashMap.put("callbuttoncolor", obj2);
        }
        if (zzfp.f14952i != null) {
            hashMap.put("channel", zzfp.f14952i);
        }
        if (Color.alpha(zzfp.f14953j) != 0) {
            hashMap.put("dcolor", bhx.m8569a(zzfp.f14953j));
        }
        if (zzfp.f14954k != null) {
            hashMap.put("font", zzfp.f14954k);
        }
        if (Color.alpha(zzfp.f14955l) != 0) {
            hashMap.put("hcolor", bhx.m8569a(zzfp.f14955l));
        }
        hashMap.put("headersize", Integer.toString(zzfp.f14956m));
        if (zzfp.f14957n != null) {
            hashMap.put("q", zzfp.f14957n);
        }
    }

    /* renamed from: a */
    private static void m8581a(HashMap<String, Object> hashMap, zzmk zzmk) {
        Object obj = 1;
        String str = zzmk.f15035d.f14931a;
        Object obj2 = (str.equals("interstitial_mb") || str.equals("reward_mb")) ? 1 : null;
        Bundle bundle = zzmk.f15027R;
        if (bundle == null) {
            obj = null;
        }
        if (obj2 != null && r2 != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("interstitial_pool", bundle);
            hashMap.put("counters", bundle2);
        }
    }
}

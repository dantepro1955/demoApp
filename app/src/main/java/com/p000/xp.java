package com.p000;

import com.facebook.internal.AnalyticsEvents;
import com.mopub.common.AdType;
import com.under9.android.lib.network.model.Constants;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xp */
class xp extends wo implements xx {
    /* renamed from: e */
    private final Collection f25989e;
    /* renamed from: f */
    private final JSONObject f25990f;
    /* renamed from: g */
    private final zb f25991g;
    /* renamed from: h */
    private final yt f25992h;
    /* renamed from: i */
    private boolean f25993i;
    /* renamed from: j */
    private wt f25994j = new wt(zd.f26074c, ze.f26079a);

    xp(JSONObject jSONObject, zb zbVar, vm vmVar) {
        super("RenderAd", vmVar);
        this.f25990f = jSONObject;
        this.f25991g = zbVar;
        this.f25989e = m34813d();
        this.f25992h = vmVar.m34409n();
    }

    /* renamed from: a */
    private float m34806a(String str, ze zeVar, int i) {
        return zeVar.equals(ze.f26080b) ? 0.5f : (zeVar.equals(ze.f26079a) && str != null && i == -1) ? 0.5f : 0.0f;
    }

    /* renamed from: a */
    private String m34807a(String str, String str2) {
        File a = this.f25992h.m34927a(str2.replace(Constants.SEP, "_"), this.b.m34404i(), true);
        if (a == null) {
            return null;
        }
        if (a.exists()) {
            this.c.mo5606a(this.a, "Loaded " + str2 + " from cache: file://" + a.getAbsolutePath());
            return "file://" + a.getAbsolutePath();
        }
        return this.f25992h.m34935a(a, new StringBuilder().append(str).append(str2).toString()) ? "file://" + a.getAbsolutePath() : null;
    }

    /* renamed from: a */
    private vd m34808a(int i) {
        return i == 1 ? vd.WhiteXOnTransparentGrey : vd.WhiteXOnOpaqueBlack;
    }

    /* renamed from: a */
    private vd m34809a(String str) {
        return str != null ? vd.WhiteXOnTransparentGrey : vd.WhiteXOnOpaqueBlack;
    }

    /* renamed from: a */
    private void m34810a(JSONObject jSONObject) {
        zd a;
        String string = jSONObject.getString(AdType.HTML);
        if (jSONObject.has("size")) {
            a = zd.m34946a(jSONObject.getString("size"));
        } else {
            a = zd.f26072a;
        }
        String str = null;
        if (string == null || string.length() <= 0) {
            this.c.mo5612d(this.a, "No HTML received for requested ad");
            m34815c();
            return;
        }
        vj valueOf;
        ze a2;
        String string2;
        int i;
        int i2;
        float f;
        vd a3;
        String b = m34811b(string);
        if (jSONObject.has("ad_target")) {
            valueOf = vj.valueOf(jSONObject.getString("ad_target").toUpperCase(Locale.ENGLISH));
        } else {
            valueOf = vj.DEFAULT;
        }
        if (jSONObject.has("ad_type")) {
            a2 = ze.m34952a(jSONObject.getString("ad_type").toUpperCase(Locale.ENGLISH));
        } else {
            a2 = ze.f26079a;
        }
        this.f25994j = new wt(a, a2);
        if (jSONObject.has(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO)) {
            string2 = jSONObject.getString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
            if (string2 == null || string2.isEmpty()) {
                string2 = null;
            } else {
                try {
                    str = this.f25992h.m34928a(this.d, string2);
                    this.f25993i = true;
                    string2 = str;
                } catch (Exception e) {
                    string2 = str;
                }
            }
            if (string2 == null) {
                m34815c();
                return;
            }
            str = string2;
        }
        long j = -1;
        if (jSONObject.has("ad_id")) {
            j = jSONObject.getLong("ad_id");
        }
        if (jSONObject.has("countdown_length")) {
            try {
                i = jSONObject.getInt("countdown_length");
            } catch (JSONException e2) {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (jSONObject.has("close_delay")) {
            try {
                i2 = jSONObject.getInt("close_delay");
            } catch (JSONException e3) {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        if (jSONObject.has("close_delay_graphic")) {
            try {
                f = (float) jSONObject.getInt("close_delay_graphic");
            } catch (JSONException e4) {
                f = m34806a(str, a2, i2);
            }
        } else {
            f = m34806a(str, a2, i2);
        }
        if (jSONObject.has("close_style")) {
            try {
                a3 = m34808a(jSONObject.getInt("close_style"));
            } catch (JSONException e5) {
                a3 = m34809a(str);
            }
        } else {
            a3 = m34809a(str);
        }
        String str2 = "";
        if (jSONObject.has("clcodes")) {
            try {
                string2 = ((JSONArray) jSONObject.get("clcodes")).getString(0);
            } catch (JSONException e6) {
                string2 = str2;
            }
        } else {
            string2 = str2;
        }
        str2 = "";
        if (jSONObject.has("video_end_url")) {
            try {
                str2 = jSONObject.getString("video_end_url");
            } catch (Exception e7) {
            }
        }
        String str3 = "";
        if (jSONObject.has("mute_image")) {
            try {
                str3 = this.b.m34409n().m34929a(this.d, jSONObject.getString("mute_image"), false);
            } catch (Exception e8) {
            }
        }
        String str4 = "";
        if (jSONObject.has("unmute_image")) {
            try {
                str4 = this.b.m34409n().m34929a(this.d, jSONObject.getString("unmute_image"), false);
            } catch (Exception e9) {
            }
        }
        String str5 = "";
        if (jSONObject.has("click_tracking_url")) {
            try {
                str5 = jSONObject.getString("click_tracking_url");
            } catch (Exception e10) {
            }
        }
        m34814a(new vk().m34338a(b).m34341a(a).m34342a(a2).m34344b(str).m34340a(valueOf).m34339a(a3).m34335a((float) i2).m34343b(f).m34336a(i).m34337a(j).m34345c(string2).m34346d(str2).m34347e(str5).m34348f(str3).m34349g(str4).m34334a());
    }

    /* renamed from: b */
    private String m34811b(String str) {
        return ((Boolean) this.b.m34391a(wp.f25872B)).booleanValue() ? m34812c(str) : str;
    }

    /* renamed from: c */
    private String m34812c(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for (String str2 : ((String) this.b.m34391a(wp.f25873C)).split(",")) {
            int i = 0;
            int i2 = 0;
            while (i2 < stringBuilder.length()) {
                i2 = stringBuilder.indexOf(str2, i);
                if (i2 == -1) {
                    break;
                }
                int length = stringBuilder.length();
                i = i2;
                while (!this.f25989e.contains(Character.valueOf(stringBuilder.charAt(i))) && i < length) {
                    i++;
                }
                if (i <= i2 || i == length) {
                    this.c.mo5606a(this.a, "Unable to cache resource; ad HTML is invalid.");
                } else {
                    String a = m34807a(str2, stringBuilder.substring(str2.length() + i2, i));
                    if (a != null) {
                        stringBuilder.replace(i2, i, a);
                    }
                }
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: d */
    private Collection m34813d() {
        Collection hashSet = new HashSet();
        for (char valueOf : ((String) this.b.m34391a(wp.ac)).toCharArray()) {
            hashSet.add(Character.valueOf(valueOf));
        }
        hashSet.add(Character.valueOf('\"'));
        return hashSet;
    }

    /* renamed from: a */
    void m34814a(yy yyVar) {
        this.b.mo5561g().mo5606a(m34642a(), "Rendered new ad:" + yyVar);
        if (this.f25991g != null) {
            this.f25991g.mo5549a(yyVar);
        }
    }

    /* renamed from: c */
    void m34815c() {
        try {
            if (this.f25991g == null) {
                return;
            }
            if (this.f25991g instanceof yr) {
                ((yr) this.f25991g).mo5572a(this.f25994j, -6);
            } else {
                this.f25991g.mo5548a(-6);
            }
        } catch (Throwable th) {
            this.c.mo5609b(this.a, "Unable process a failure to receive an ad", th);
        }
    }

    /* renamed from: e */
    public String mo5599e() {
        return "tRA";
    }

    /* renamed from: f */
    public boolean mo5600f() {
        return this.f25993i;
    }

    public void run() {
        this.c.mo5606a(this.a, "Rendering ad...");
        try {
            m34810a(this.f25990f);
        } catch (Throwable e) {
            this.c.mo5609b(this.a, "Unable to parse ad service response", e);
            m34815c();
        } catch (Throwable e2) {
            this.c.mo5609b(this.a, "Ad response is not valid", e2);
            m34815c();
        } catch (Throwable e22) {
            this.c.mo5609b(this.a, "Unable to render ad", e22);
            m34815c();
        }
    }
}

package com.p000;

import android.graphics.Point;
import com.applovin.adview.AppLovinInterstitialActivity;
import com.facebook.appevents.AppEventsConstants;
import com.mopub.common.AdType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: xg */
class xg extends wo implements xx {
    /* renamed from: e */
    private final zd f25963e;
    /* renamed from: f */
    private final ze f25964f;
    /* renamed from: g */
    private final zb f25965g;
    /* renamed from: h */
    private boolean f25966h = false;

    xg(zd zdVar, ze zeVar, zb zbVar, vm vmVar) {
        super("FetchNextAd", vmVar);
        this.f25963e = zdVar;
        this.f25964f = zeVar;
        this.f25965g = zbVar;
    }

    /* renamed from: a */
    private void m34763a(wv wvVar) {
        if (System.currentTimeMillis() - wvVar.m34705b("ad_session_start") > ((long) ((Integer) this.b.m34391a(wp.f25914r)).intValue()) * 60000) {
            wvVar.m34707b("ad_session_start", System.currentTimeMillis());
            wvVar.m34709c("ad_imp_session");
        }
    }

    /* renamed from: b */
    private void m34766b(int i) {
        this.c.mo5612d(this.a, "Unable to fetch " + this.f25963e + " ad: server returned " + i);
        try {
            mo5602a(i);
        } catch (Throwable th) {
            this.c.mo5611c(this.a, "Unable process a failure to recieve an ad", th);
        }
        yl.m34919b(i, this.b);
    }

    /* renamed from: b */
    private void m34767b(JSONObject jSONObject) {
        yl.m34916a(jSONObject, this.b);
        this.b.m34407l().m34803a(mo5601a(jSONObject), xl.MAIN);
    }

    /* renamed from: d */
    private void m34768d(Map map) {
        String str;
        map.put("api_did", this.b.m34391a(wp.f25899c));
        map.put("sdk_key", this.b.mo5557a());
        map.put("sdk_version", "6.1.5");
        map.put("app_version", this.b.m34416u().m34923b().f26055b);
        if ("{BUILD_NUMBER}" != null) {
            str = (String) this.b.m34391a(wp.f25922z);
        } else {
            str = (String) this.b.m34391a(wp.f25922z);
        }
        if (str != null && str.length() > 0) {
            map.put("plugin_version", str);
        }
        map.put("accept", m34771g());
        map.put("v1", Boolean.toString(yi.m34895a("android.permission.WRITE_EXTERNAL_STORAGE", this.d)));
        map.put("v2", Boolean.toString(yi.m34894a(AppLovinInterstitialActivity.class, this.d)));
        map.put("preloading", String.valueOf(this.f25966h));
        map.put("size", this.f25963e.m34951c());
        map.put("format", AdType.STATIC_NATIVE);
        map.put("ia", Long.toString(this.b.m34416u().m34923b().f26057d));
    }

    /* renamed from: e */
    private void m34769e(Map map) {
        if (((Boolean) this.b.m34391a(wp.f25876F)).booleanValue()) {
            wv m = this.b.m34408m();
            map.put("li", String.valueOf(m.m34705b("ad_imp")));
            map.put("si", String.valueOf(m.m34705b("ad_imp_session")));
        }
    }

    /* renamed from: f */
    private void m34770f(Map map) {
        if (((Boolean) this.b.m34391a(wp.f25876F)).booleanValue()) {
            Map a = ((yh) this.b.mo5560e()).m34889a();
            if (a != null && !a.isEmpty()) {
                map.putAll(a);
            }
        }
    }

    /* renamed from: g */
    private String m34771g() {
        String str = "custom_size,launch_app";
        return (yi.m34896b() && yi.m34894a(AppLovinInterstitialActivity.class, this.d)) ? str + ",video" : str;
    }

    /* renamed from: g */
    private void m34772g(Map map) {
        Map a = vq.m34454a(this.b);
        if (a.isEmpty()) {
            try {
                m34773h(a);
                vq.m34456a(a, this.b);
            } catch (Throwable e) {
                this.c.mo5609b(this.a, "Unable to populate device information", e);
            }
        }
        map.putAll(a);
        map.put("network", yl.m34913a(this.b));
        m34775j(map);
        map.put("vz", xy.m34849a(this.b.m34404i().getPackageName(), this.b));
    }

    /* renamed from: h */
    private void m34773h(Map map) {
        yp a = this.b.m34416u().m34921a();
        map.put("brand", xy.m34856c(a.f26060c));
        map.put("carrier", xy.m34856c(a.f26064g));
        map.put("locale", a.f26065h.toString());
        map.put("model", xy.m34856c(a.f26058a));
        map.put("os", xy.m34856c(a.f26059b));
        map.put("platform", "android");
        map.put("revision", xy.m34856c(a.f26061d));
        m34774i(map);
    }

    /* renamed from: i */
    private void m34774i(Map map) {
        Point a = yi.m34892a(this.b.m34404i());
        map.put("dx", Integer.toString(a.x));
        map.put("dy", Integer.toString(a.y));
    }

    /* renamed from: j */
    private void m34775j(Map map) {
        yn c = this.b.m34416u().m34924c();
        String str = c.f26053b;
        boolean z = c.f26052a;
        if ((!z || ((Boolean) this.b.m34403h().m34655a(wp.aR)).booleanValue()) && zn.m34841d(str)) {
            map.put("idfa", str);
        }
        map.put("dnt", Boolean.toString(z));
    }

    /* renamed from: a */
    protected wo mo5601a(JSONObject jSONObject) {
        return new xp(jSONObject, this.f25965g, this.b);
    }

    /* renamed from: a */
    protected void mo5602a(int i) {
        if (this.f25965g == null) {
            return;
        }
        if (this.f25965g instanceof yr) {
            ((yr) this.f25965g).mo5572a(new wt(this.f25963e, this.f25964f), i);
        } else {
            this.f25965g.mo5548a(i);
        }
    }

    /* renamed from: a */
    protected void m34778a(Map map) {
        m34770f(map);
        m34772g(map);
        m34769e(map);
        m34768d(map);
        mo5603b(map);
        mo5604c(map);
    }

    /* renamed from: a */
    public void m34779a(boolean z) {
        this.f25966h = z;
    }

    /* renamed from: b */
    void mo5598b() {
        super.mo5598b();
        m34766b(-410);
    }

    /* renamed from: b */
    protected void mo5603b(Map map) {
        if (this.f25964f != null) {
            map.put("require", this.f25964f.m34954a());
        }
    }

    /* renamed from: c */
    String m34782c() {
        Map hashMap = new HashMap();
        m34778a(hashMap);
        return mo5605d() + "?" + xy.m34850a(hashMap);
    }

    /* renamed from: c */
    protected void mo5604c(Map map) {
        xw a = xu.m34826a().m34827a("tFNA");
        if (a != null) {
            map.put("etf", Long.toString(a.m34830b()));
            map.put("ntf", a.m34829a());
        }
        a = xu.m34826a().m34827a("tRA");
        if (a != null) {
            map.put("etr", Long.toString(a.m34830b()));
            map.put("ntr", a.m34829a());
            map.put("fvr", a.m34831c() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
    }

    /* renamed from: d */
    protected String mo5605d() {
        return yl.m34918b("2.0/ad", this.b);
    }

    /* renamed from: e */
    public String mo5599e() {
        return "tFNA";
    }

    /* renamed from: f */
    public boolean mo5600f() {
        return false;
    }

    public void run() {
        if (this.f25966h) {
            this.c.mo5606a(this.a, "Preloading next ad...");
        } else {
            this.c.mo5606a(this.a, "Fetching next ad...");
        }
        wv m = this.b.m34408m();
        m.m34703a("ad_req");
        m34763a(m);
        try {
            xr xhVar = new xh(this, "RepeatFetchNextAd", wp.f25904h, this.b);
            xhVar.m34725a(wp.f25907k);
            xhVar.run();
        } catch (Throwable th) {
            this.c.mo5609b(this.a, "Unable to fetch " + this.f25963e + " ad", th);
            m34766b(0);
        }
    }
}

package com.p000;

import android.net.Uri;
import android.net.Uri.Builder;
import com.under9.android.lib.network.model.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

/* renamed from: vn */
public class vn implements zh {
    /* renamed from: a */
    private final vm f25746a;
    /* renamed from: b */
    private final List f25747b;

    public vn(zl zlVar) {
        this.f25746a = (vm) zlVar;
        this.f25747b = Arrays.asList(((String) ((vm) zlVar).m34391a(wp.aV)).split(","));
    }

    /* renamed from: a */
    private Uri m34424a(wn wnVar, yn ynVar) {
        ym u = this.f25746a.m34416u();
        yp a = u.m34921a();
        yo b = u.m34923b();
        boolean contains = this.f25747b.contains(wnVar.m34639a());
        Builder appendQueryParameter = Uri.parse((String) this.f25746a.m34391a(wp.aU)).buildUpon().appendQueryParameter("event", contains ? wnVar.m34639a() : "postinstall").appendQueryParameter("ts", Long.toString(wnVar.m34641c())).appendQueryParameter("platform", "Android").appendQueryParameter("model", a.f26058a).appendQueryParameter("package_name", b.f26056c).appendQueryParameter("sdk_key", this.f25746a.mo5557a()).appendQueryParameter("idfa", ynVar.f26053b).appendQueryParameter("dnt", Boolean.toString(ynVar.f26052a)).appendQueryParameter("ia", Long.toString(b.f26057d)).appendQueryParameter("api_did", (String) this.f25746a.m34391a(wp.f25899c)).appendQueryParameter("brand", a.f26060c).appendQueryParameter("model", a.f26058a).appendQueryParameter("revision", a.f26061d).appendQueryParameter("sdk_version", "6.1.5").appendQueryParameter("os", a.f26059b).appendQueryParameter("app_version", this.f25746a.m34416u().m34923b().f26055b);
        if (!contains) {
            appendQueryParameter = appendQueryParameter.appendQueryParameter("sub_event", wnVar.m34639a());
        }
        return appendQueryParameter.build();
    }

    /* renamed from: a */
    private Map m34425a(Map map) {
        Map hashMap = new HashMap();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && (value instanceof String)) {
                    hashMap.put((String) key, (String) value);
                } else {
                    this.f25746a.mo5561g().mo5610c("EventServiceImpl", "Unexpected class type in trackEvent(); all keys and values passed as parameters must be String. Encountered " + key.getClass().getCanonicalName() + Constants.SEP + value.getClass().getCanonicalName() + "; will use toString() value instead, which may be unexpected...");
                    hashMap.put(key.toString(), value.toString());
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m34427a(wn wnVar) {
        if (((Boolean) this.f25746a.m34391a(wp.aW)).booleanValue()) {
            this.f25746a.mo5561g().mo5606a("EventServiceImpl", "Tracking event: " + wnVar);
            m34428a(new yq(this, wnVar));
        }
    }

    /* renamed from: a */
    private void m34428a(xd xdVar) {
        this.f25746a.m34407l().m34803a(new xc(this.f25746a, xdVar), xl.BACKGROUND);
    }

    /* renamed from: a */
    public void mo5565a(String str) {
        m34430a(str, new HashMap());
    }

    /* renamed from: a */
    public void m34430a(String str, Map map) {
        m34427a(new wn(str, m34425a(map), System.currentTimeMillis(), xy.m34854b(UUID.randomUUID().toString())));
    }
}

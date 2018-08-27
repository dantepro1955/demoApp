package com.p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

@bhd
/* renamed from: bdd */
public class bdd implements bcy {
    /* renamed from: a */
    final HashMap<String, blb<JSONObject>> f5638a = new HashMap();

    /* renamed from: a */
    public Future<JSONObject> m7566a(String str) {
        Future blb = new blb();
        this.f5638a.put(str, blb);
        return blb;
    }

    /* renamed from: a */
    public void mo277a(blo blo, Map<String, String> map) {
        m7568a((String) map.get("request_id"), (String) map.get("fetched_ad"));
    }

    /* renamed from: a */
    public void m7568a(String str, String str2) {
        bky.m9006b("Received ad from the cache.");
        blb blb = (blb) this.f5638a.get(str);
        if (blb == null) {
            bky.m9008c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            blb.m7770b(new JSONObject(str2));
        } catch (Throwable e) {
            bky.m9007b("Failed constructing JSON object from value passed from javascript", e);
            blb.m7770b(null);
        } finally {
            this.f5638a.remove(str);
        }
    }

    /* renamed from: b */
    public void m7569b(String str) {
        blb blb = (blb) this.f5638a.get(str);
        if (blb == null) {
            bky.m9008c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!blb.isDone()) {
            blb.cancel(true);
        }
        this.f5638a.remove(str);
    }
}

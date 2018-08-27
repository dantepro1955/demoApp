package com.p000;

import com.inmobi.commons.analytics.iat.impl.AdTrackerConstants;
import java.util.Map;

@bhd
/* renamed from: bdo */
public class bdo implements bcy {
    /* renamed from: a */
    public void mo277a(blo blo, Map<String, String> map) {
        bdm B = ako.m2334B();
        if (!map.containsKey("abort")) {
            String str = (String) map.get(AdTrackerConstants.SOURCE);
            if (str == null) {
                bky.m9011e("Precache video action is missing the src parameter.");
                return;
            }
            int parseInt;
            try {
                parseInt = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException e) {
                parseInt = 0;
            }
            String str2 = map.containsKey("mimetype") ? (String) map.get("mimetype") : "";
            if (B.m7598b(blo)) {
                bky.m9011e("Precache task already running.");
                return;
            }
            aor.m4716a(blo.mo1318h());
            new bdl(blo, blo.mo1318h().f1752a.mo1003a(blo, parseInt, str2), str).mo195d();
        } else if (!B.m7596a(blo)) {
            bky.m9011e("Precache abort but no preload task running.");
        }
    }
}

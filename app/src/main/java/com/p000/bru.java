package com.p000;

import android.content.Context;
import android.net.Uri;
import com.inmobi.commons.analytics.iat.impl.AdTrackerConstants;
import java.util.Map;
import p000.bqs.C1417b;

/* renamed from: bru */
class bru implements C1417b {
    /* renamed from: a */
    private final Context f7474a;

    public bru(Context context) {
        this.f7474a = context;
    }

    /* renamed from: a */
    public void mo1404a(Map<String, Object> map) {
        Object obj;
        Object obj2 = map.get("gtm.url");
        if (obj2 == null) {
            obj = map.get("gtm");
            if (obj != null && (obj instanceof Map)) {
                obj = ((Map) obj).get("url");
                if (obj != null && (obj instanceof String)) {
                    String queryParameter = Uri.parse((String) obj).getQueryParameter(AdTrackerConstants.REFERRER);
                    if (queryParameter != null) {
                        brc.m10492b(this.f7474a, queryParameter);
                        return;
                    }
                    return;
                }
            }
        }
        obj = obj2;
        if (obj != null) {
        }
    }
}

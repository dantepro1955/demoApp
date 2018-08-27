package com.p000;

import android.os.Bundle;
import com.millennialmedia.android.MMRequest;

/* compiled from: GagPostListQueryHelper */
/* renamed from: cgb */
public class cgb {
    /* renamed from: a */
    public static cgc m13070a(Bundle bundle) {
        cgc a = cgc.m13072a();
        String str = "";
        String str2 = "";
        if (bundle != null) {
            str = bundle.getString("group_id");
            str2 = bundle.getString("list_type");
            a.l = str2;
            a.f9119b = str;
        }
        cco a2 = cco.m12555a(str2 + "-" + str + "-" + System.currentTimeMillis(), Integer.valueOf(str2).intValue(), str);
        a.a(true);
        if (a2.f8731c == 1) {
            a.f9118a = "hot";
        } else if (a2.f8731c == 2) {
            a.f9118a = "trending";
        } else if (a2.f8731c == 3) {
            a.f9118a = "vote";
        } else if (a2.f8731c == 9) {
            a.f9118a = "hotplustrending";
        } else if (a2.f8731c == 16 || a2.f8731c == 12) {
            a.f9127j = bundle == null ? "" : bundle.getString("search_key");
            if (a2.f8731c == 12) {
                crq crq = (crq) crj.b(crq.class);
                if (crq == null || crq.c().equals(crq.a())) {
                    a.m = "relevant";
                } else {
                    a.m = "popular";
                }
            }
        }
        a.f9119b = a2.f8732d;
        a.k = a2.f8729a;
        a.f9120c = "";
        a.f9121d = "";
        a.f9122e = "";
        a.f9123f = "9";
        a.a(caf.m12046a().m12075g().f9370c.m13826c(a2.f8729a));
        a.f9124g = "";
        a.a(0);
        a.f9125h = cps.a();
        a.q = 10;
        a.f9126i = a2.f8729a;
        return a;
    }

    /* renamed from: a */
    public static cgc m13071a(cco cco) {
        cgc a = cgc.m13072a();
        a.f9119b = cco.f8732d;
        a.l = String.valueOf(cco.f8731c);
        a.a(true);
        if (cco.f8731c == 1) {
            a.f9118a = "hot";
        } else if (cco.f8731c == 2) {
            a.f9118a = "trending";
        } else if (cco.f8731c == 3) {
            a.f9118a = "vote";
        } else if (cco.f8731c == 9) {
            a.f9118a = "hotplustrending";
        } else if (cco.f8731c == 13) {
            a.f9118a = MMRequest.MARITAL_SINGLE;
        } else if (cco.f8731c == 16 || cco.f8731c == 12) {
            a.f9127j = cco.f8734f;
            if (cco.f8731c == 12) {
                crq crq = (crq) crj.b(crq.class);
                if (crq == null || crq.c().equals(crq.a())) {
                    a.m = "relevant";
                } else {
                    a.m = "popular";
                }
            }
        }
        a.f9119b = cco.f8732d;
        a.k = cco.f8729a;
        a.f9120c = "";
        a.f9121d = "";
        a.f9122e = "";
        a.f9123f = "9";
        a.a(caf.m12046a().m12075g().f9370c.m13826c(cco.f8729a));
        a.f9124g = "";
        a.a(0);
        a.f9125h = cps.a();
        a.q = 10;
        a.f9126i = cco.f8729a;
        return a;
    }
}

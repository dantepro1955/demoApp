package com.p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@bhd
/* renamed from: biw */
public class biw {
    /* renamed from: a */
    public static void m8762a(Context context, Runnable runnable) {
        aoi.m4687b("Adapters must be initialized on the main thread.");
        Map e = ako.m2347i().m8963r().m8919e();
        if (e != null && !e.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    bky.m9009c("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            bim J = bim.m8705J();
            if (J != null) {
                biw.m8763a(context, e.values(), J);
            }
        }
    }

    /* renamed from: a */
    static void m8763a(Context context, Collection<ben> collection, bim bim) {
        Map hashMap = new HashMap();
        aqq a = aqr.m4967a((Object) context);
        for (ben ben : collection) {
            for (bem bem : ben.f5838a) {
                String str = bem.f5830i;
                for (String str2 : bem.f5824c) {
                    String str22;
                    if (!hashMap.containsKey(str22)) {
                        hashMap.put(str22, new ArrayList());
                    }
                    if (str != null) {
                        ((Collection) hashMap.get(str22)).add(str);
                    }
                }
            }
        }
        for (Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            try {
                bje c = bim.m8722c(str3);
                if (c != null) {
                    bey a2 = c.m8840a();
                    if (!a2.mo1070g() && a2.mo1076m()) {
                        a2.mo1056a(a, c.m8841b(), (List) entry.getValue());
                        String str4 = "Initialized rewarded video mediation adapter ";
                        str22 = String.valueOf(str3);
                        bky.m9006b(str22.length() != 0 ? str4.concat(str22) : new String(str4));
                    }
                }
            } catch (Throwable th) {
                bky.m9009c(new StringBuilder(String.valueOf(str3).length() + 56).append("Failed to initialize rewarded video mediation adapter \"").append(str3).append("\"").toString(), th);
            }
        }
    }
}

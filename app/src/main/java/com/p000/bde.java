package com.p000;

import java.util.Map;

@bhd
/* renamed from: bde */
public class bde implements bcy {
    /* renamed from: a */
    public void mo277a(blo blo, Map<String, String> map) {
        if (ako.m2336D().m8879a()) {
            int i = -1;
            try {
                i = Integer.parseInt((String) map.get("eventType"));
            } catch (Throwable e) {
                bky.m9007b("Parse Scion log event type error", e);
            }
            String str = (String) map.get("eventId");
            switch (i) {
                case 0:
                    ako.m2336D().m8884c(blo.getContext(), str);
                    return;
                case 1:
                    ako.m2336D().m8887d(blo.getContext(), str);
                    return;
                case 2:
                    ako.m2336D().m8891f(blo.getContext(), str);
                    return;
                default:
                    return;
            }
        }
    }
}

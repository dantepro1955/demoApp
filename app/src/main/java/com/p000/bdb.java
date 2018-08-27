package com.p000;

import java.util.Map;

@bhd
/* renamed from: bdb */
public class bdb implements bcy {
    /* renamed from: a */
    private final bdc f5637a;

    public bdb(bdc bdc) {
        this.f5637a = bdc;
    }

    /* renamed from: a */
    public void mo277a(blo blo, Map<String, String> map) {
        float parseFloat;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        try {
            if (map.get("blurRadius") != null) {
                parseFloat = Float.parseFloat((String) map.get("blurRadius"));
                this.f5637a.mo308b(equals);
                this.f5637a.mo305a(equals2, parseFloat);
            }
        } catch (Throwable e) {
            bky.m9007b("Fail to parse float", e);
        }
        parseFloat = 0.0f;
        this.f5637a.mo308b(equals);
        this.f5637a.mo305a(equals2, parseFloat);
    }
}

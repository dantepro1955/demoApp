package com.p000;

import java.util.Map;

@bhd
/* renamed from: bcs */
public final class bcs implements bcy {
    /* renamed from: a */
    private final bct f5592a;

    public bcs(bct bct) {
        this.f5592a = bct;
    }

    /* renamed from: a */
    public void mo277a(blo blo, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            bky.m9011e("App event with no name parameter.");
        } else {
            this.f5592a.mo239a(str, (String) map.get("info"));
        }
    }
}

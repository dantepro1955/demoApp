package com.p000;

import java.util.HashMap;
import java.util.Map;

@bhd
/* renamed from: bbi */
public class bbi {
    /* renamed from: a */
    private final Map<String, bbh> f5442a = new HashMap();
    /* renamed from: b */
    private final bbj f5443b;

    public bbi(bbj bbj) {
        this.f5443b = bbj;
    }

    /* renamed from: a */
    public bbj m7158a() {
        return this.f5443b;
    }

    /* renamed from: a */
    public void m7159a(String str, bbh bbh) {
        this.f5442a.put(str, bbh);
    }

    /* renamed from: a */
    public void m7160a(String str, String str2, long j) {
        bbf.m7147a(this.f5443b, (bbh) this.f5442a.get(str2), j, str);
        this.f5442a.put(str, bbf.m7146a(this.f5443b, j));
    }
}

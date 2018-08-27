package com.p000;

import java.util.Map;
import java.util.Set;
import p000.att.C0806a;

/* renamed from: bqx */
abstract class bqx {
    /* renamed from: a */
    private final Set<String> f7433a;

    /* renamed from: a */
    public abstract C0806a m10478a(Map<String, C0806a> map);

    /* renamed from: a */
    public abstract boolean m10479a();

    /* renamed from: a */
    boolean m10480a(Set<String> set) {
        return set.containsAll(this.f7433a);
    }

    /* renamed from: b */
    public Set<String> m10481b() {
        return this.f7433a;
    }
}

package com.p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bmj */
public final class bmj extends alo<bmj> {
    /* renamed from: a */
    private final List<alg> f6972a = new ArrayList();
    /* renamed from: b */
    private final List<ali> f6973b = new ArrayList();
    /* renamed from: c */
    private final Map<String, List<alg>> f6974c = new HashMap();
    /* renamed from: d */
    private alh f6975d;

    /* renamed from: a */
    public alh m9669a() {
        return this.f6975d;
    }

    /* renamed from: a */
    public void m9670a(alg alg, String str) {
        if (alg != null) {
            Object obj;
            if (str == null) {
                obj = "";
            }
            if (!this.f6974c.containsKey(obj)) {
                this.f6974c.put(obj, new ArrayList());
            }
            ((List) this.f6974c.get(obj)).add(alg);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo1348a(alo alo) {
        m9672a((bmj) alo);
    }

    /* renamed from: a */
    public void m9672a(bmj bmj) {
        bmj.f6972a.addAll(this.f6972a);
        bmj.f6973b.addAll(this.f6973b);
        for (Entry entry : this.f6974c.entrySet()) {
            String str = (String) entry.getKey();
            for (alg a : (List) entry.getValue()) {
                bmj.m9670a(a, str);
            }
        }
        if (this.f6975d != null) {
            bmj.f6975d = this.f6975d;
        }
    }

    /* renamed from: b */
    public List<alg> m9673b() {
        return Collections.unmodifiableList(this.f6972a);
    }

    /* renamed from: c */
    public Map<String, List<alg>> m9674c() {
        return this.f6974c;
    }

    /* renamed from: d */
    public List<ali> m9675d() {
        return Collections.unmodifiableList(this.f6973b);
    }

    public String toString() {
        Map hashMap = new HashMap();
        if (!this.f6972a.isEmpty()) {
            hashMap.put("products", this.f6972a);
        }
        if (!this.f6973b.isEmpty()) {
            hashMap.put("promotions", this.f6973b);
        }
        if (!this.f6974c.isEmpty()) {
            hashMap.put("impressions", this.f6974c);
        }
        hashMap.put("productAction", this.f6975d);
        return alo.m2502a((Object) hashMap);
    }
}

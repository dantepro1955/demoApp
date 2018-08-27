package com.p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@bhd
/* renamed from: bay */
public class bay {
    /* renamed from: a */
    private final Collection<baw> f5290a = new ArrayList();
    /* renamed from: b */
    private final Collection<baw<String>> f5291b = new ArrayList();
    /* renamed from: c */
    private final Collection<baw<String>> f5292c = new ArrayList();

    /* renamed from: a */
    public List<String> m7076a() {
        List<String> arrayList = new ArrayList();
        for (baw c : this.f5291b) {
            String str = (String) c.m7064c();
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m7077a(baw baw) {
        this.f5290a.add(baw);
    }

    /* renamed from: b */
    public List<String> m7078b() {
        List<String> a = m7076a();
        for (baw c : this.f5292c) {
            String str = (String) c.m7064c();
            if (str != null) {
                a.add(str);
            }
        }
        return a;
    }

    /* renamed from: b */
    public void m7079b(baw<String> baw) {
        this.f5291b.add(baw);
    }

    /* renamed from: c */
    public void m7080c(baw<String> baw) {
        this.f5292c.add(baw);
    }
}

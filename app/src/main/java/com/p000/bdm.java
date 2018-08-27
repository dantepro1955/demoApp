package com.p000;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@bhd
/* renamed from: bdm */
public class bdm implements Iterable<bdl> {
    /* renamed from: a */
    private final List<bdl> f5654a = new LinkedList();

    /* renamed from: c */
    private bdl m7593c(blo blo) {
        Iterator it = ako.m2334B().iterator();
        while (it.hasNext()) {
            bdl bdl = (bdl) it.next();
            if (bdl.f5651a == blo) {
                return bdl;
            }
        }
        return null;
    }

    /* renamed from: a */
    public int m7594a() {
        return this.f5654a.size();
    }

    /* renamed from: a */
    public void m7595a(bdl bdl) {
        this.f5654a.add(bdl);
    }

    /* renamed from: a */
    public boolean m7596a(blo blo) {
        bdl c = m7593c(blo);
        if (c == null) {
            return false;
        }
        c.f5652b.mo1006b();
        return true;
    }

    /* renamed from: b */
    public void m7597b(bdl bdl) {
        this.f5654a.remove(bdl);
    }

    /* renamed from: b */
    public boolean m7598b(blo blo) {
        return m7593c(blo) != null;
    }

    public Iterator<bdl> iterator() {
        return this.f5654a.iterator();
    }
}

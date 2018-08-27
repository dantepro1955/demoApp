package com.p000;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ListIterator;

/* renamed from: alj */
public class alj extends alp<alj> {
    /* renamed from: b */
    private final bmw f1952b;
    /* renamed from: c */
    private boolean f1953c;

    public alj(bmw bmw) {
        super(bmw.m9773h(), bmw.m9769d());
        this.f1952b = bmw;
    }

    /* renamed from: a */
    protected void mo317a(aln aln) {
        bmm bmm = (bmm) aln.m2491b(bmm.class);
        if (TextUtils.isEmpty(bmm.m9698b())) {
            bmm.m9699b(this.f1952b.m9781p().m9919a());
        }
        if (this.f1953c && TextUtils.isEmpty(bmm.m9703d())) {
            bmq o = this.f1952b.m9780o();
            bmm.m9704d(o.m9746b());
            bmm.m9697a(o.m9745a());
        }
    }

    /* renamed from: b */
    public void m2412b(String str) {
        aoi.m4681a(str);
        m2414c(str);
        m2409m().add(new alk(this.f1952b, str));
    }

    /* renamed from: b */
    public void m2413b(boolean z) {
        this.f1953c = z;
    }

    /* renamed from: c */
    public void m2414c(String str) {
        Uri a = alk.m2462a(str);
        ListIterator listIterator = m2409m().listIterator();
        while (listIterator.hasNext()) {
            if (a.equals(((alr) listIterator.next()).mo321a())) {
                listIterator.remove();
            }
        }
    }

    /* renamed from: j */
    bmw m2415j() {
        return this.f1952b;
    }

    /* renamed from: k */
    public aln mo318k() {
        aln a = m2408l().m2487a();
        a.m2490a(this.f1952b.m9782q().m9873b());
        a.m2490a(this.f1952b.m9783r().m9966a());
        m2406b(a);
        return a;
    }
}

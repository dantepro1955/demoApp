package com.p000;

import com.ninegag.android.app.component.postlist.GagPostListFragment;
import p000.cfb.C1703b;

/* compiled from: SectionGagPostListFragmentModule */
/* renamed from: cfa */
public class cfa extends ccl {
    public cfa(cco cco, GagPostListFragment gagPostListFragment, com com) {
        super(cco, gagPostListFragment, com);
    }

    /* renamed from: a */
    protected csb mo1681a(crw crw, cse cse) {
        if (this.a.f8732d == null || this.a.f8732d.isEmpty()) {
            return super.mo1681a(crw, cse);
        }
        ckk e = cij.m13687a().f9369b.m13685e(this.a.f8732d);
        if (e == null) {
            return super.mo1681a(crw, cse);
        }
        crw crw2 = crw;
        cse cse2 = cse;
        csb cez = new cez(this.e, crw2, cse2, this.a, new C1703b(e.m14174d(), "9gag.com/" + e.m14172c(), e.m14176e()));
        cez.m12475a(this.d);
        return cez;
    }
}

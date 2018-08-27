package com.p000;

import com.ninegag.android.app.model.api.ApiPostsResponse.Separator;
import p000.ccp.C1665b;

/* compiled from: TopGagPostListRenderer */
/* renamed from: cfd */
public class cfd extends ccf {
    /* renamed from: d */
    private String f9019d;
    /* renamed from: e */
    private hh<String, String> f9020e = new hh();

    public cfd(String str, com com, String str2, boolean z, cco cco) {
        super(str, com, z, cco);
        m12423b(true);
        this.f9019d = str2;
    }

    /* renamed from: a */
    public void mo1703a(C1665b c1665b, cct cct) {
        Separator[] f = this.c.m12067c(this.f9019d) == null ? this.c.m12075g().f9370c.m13829f(this.f9019d) : this.c.m12067c(this.f9019d);
        if (f != null) {
            for (int i = 0; i < f.length; i++) {
                this.f9020e.put(f[i].beforeEntryId, f[i].text);
            }
            if (this.f9020e.containsKey(cct.m12282e())) {
                c1665b.f8645d.setText((CharSequence) this.f9020e.get(cct.m12282e()));
                c1665b.f8645d.setVisibility(0);
                return;
            }
            c1665b.f8645d.setVisibility(8);
        }
    }
}

package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import p000.cvk.C4605c;

/* compiled from: PostListAdapter */
/* renamed from: cvh */
public class cvh extends csb<cvl> {
    public cvh(crw<cvl> crw, cse<cvl> cse) {
        super(crw, cse);
    }

    public void onViewRecycled(C0605t c0605t) {
        super.onViewRecycled(c0605t);
        if (c0605t instanceof C4605c) {
            ((C4605c) c0605t).f20296b.setAdapter(null);
        }
    }
}

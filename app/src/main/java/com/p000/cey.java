package com.p000;

import android.widget.TextView;
import com.ninegag.android.app.R;
import com.ninegag.android.app.component.postlist.GagPostListFragment;

/* compiled from: SearchGagPostListFragmentModule */
/* renamed from: cey */
public class cey extends ccl {
    public cey(cco cco, GagPostListFragment gagPostListFragment, com com) {
        super(cco, gagPostListFragment, com);
    }

    /* renamed from: y */
    protected void m12922y() {
        C().z();
    }

    /* renamed from: d */
    public void mo1697d(final String str) {
        if (z() != null) {
            z().post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ cey f9004b;

                public void run() {
                    if (this.f9004b.f.f8449a.getString(R.string.search_no_result).equals(str) && this.f9004b.m12523s() != null) {
                        this.f9004b.m12523s().setVisibility(0);
                        ((TextView) this.f9004b.m12523s().findViewById(R.id.emptyText)).setText(str);
                        this.f9004b.G().setVisibility(8);
                    }
                    this.f9004b.m12510e(str);
                }
            });
        }
    }
}

package com.p000;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager;

/* compiled from: GagLinearPaginationDetector */
/* renamed from: cfp */
public class cfp implements ctc {
    /* renamed from: a */
    private int f9074a = 1;
    /* renamed from: b */
    private int f9075b = 6;
    /* renamed from: c */
    private long f9076c = 0;
    /* renamed from: d */
    private cso f9077d;

    public cfp(cso cso, int i) {
        this.f9075b = i;
        this.f9077d = cso;
    }

    /* renamed from: a */
    public void m12993a(LayoutManager layoutManager) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (1 == this.f9074a) {
            m12991a(linearLayoutManager);
        } else {
            m12992b(linearLayoutManager);
        }
    }

    /* renamed from: a */
    private void m12991a(LinearLayoutManager linearLayoutManager) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f9076c >= 1000) {
            int itemCount = linearLayoutManager.getItemCount();
            if ((this.f9075b <= itemCount ? this.f9075b : this.f9075b / 2) + (linearLayoutManager.getChildCount() + linearLayoutManager.findFirstVisibleItemPosition()) >= itemCount) {
                this.f9077d.g();
                this.f9076c = currentTimeMillis;
            }
        }
    }

    /* renamed from: b */
    private void m12992b(LinearLayoutManager linearLayoutManager) {
    }
}

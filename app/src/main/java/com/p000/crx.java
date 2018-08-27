package com.p000;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: BlitzFragmentLinearModule */
/* renamed from: crx */
public abstract class crx extends cry {
    /* renamed from: c */
    public void mo4130c() {
        super.mo4130c();
        m24731y();
    }

    /* renamed from: e */
    public void mo4131e() {
        super.mo4131e();
    }

    /* renamed from: a */
    protected LinearLayoutManager mo4128a(Context context) {
        return new LinearLayoutManager(context);
    }

    /* renamed from: a */
    protected void mo4129a(RecyclerView recyclerView) {
        recyclerView.addItemDecoration(new csc(recyclerView.getContext()));
    }
}

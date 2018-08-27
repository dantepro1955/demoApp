package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ninegag.android.app.R;
import com.ninegag.android.app.ui.PollingActivity;

/* compiled from: PollingLeaderboardFragmentModule */
/* renamed from: cbu */
public class cbu extends cry {
    /* renamed from: a */
    public void m12382a(Bundle bundle) {
        this.g = m12380a();
        this.h = m12385b();
        this.i = m12381a(this.g, this.h);
    }

    /* renamed from: a */
    public View m12379a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.a(layoutInflater, viewGroup, bundle);
    }

    /* renamed from: a */
    protected void m12383a(RecyclerView recyclerView) {
    }

    /* renamed from: a */
    protected LinearLayoutManager m12377a(Context context) {
        return new LinearLayoutManager(context);
    }

    /* renamed from: c */
    public void m12386c() {
        super.c();
        y();
        cbv cbv = (cbv) C();
        int r = cbv.r();
        int size = C().size();
        for (int i = r; i < size; i++) {
            ((cct) cbv.get(i)).m12266J();
        }
    }

    /* renamed from: a */
    protected crw m12380a() {
        return new cbv(cco.m12554a(PollingActivity.SCOPE));
    }

    /* renamed from: a */
    protected csb m12381a(crw crw, cse cse) {
        return new cbo(crw, cse);
    }

    /* renamed from: b */
    protected cse m12385b() {
        return new cbw();
    }

    /* renamed from: a */
    protected View m12378a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_polling_leaderboard, null);
    }

    /* renamed from: a */
    public void m12384a(boolean z, boolean z2) {
        super.a(z, z2);
    }

    public void q_() {
        cco a = cco.m12554a(PollingActivity.SCOPE);
        caf.m12046a().m12077h().m14000f(a.f8731c, a.f8732d);
        C().d(0);
    }
}

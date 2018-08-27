package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.actionbar.AbBackClickedEvent;
import com.ninegag.android.app.ui.PollingActivity;

/* compiled from: PollingLaunchedFragmentModule */
/* renamed from: cbt */
public class cbt extends cry {
    /* renamed from: a */
    private OnClickListener f8642a = new C16621(this);

    /* compiled from: PollingLaunchedFragmentModule */
    /* renamed from: cbt$1 */
    class C16621 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ cbt f8641a;

        C16621(cbt cbt) {
            this.f8641a = cbt;
        }

        public void onClick(View view) {
            dhe.a().c(new AbBackClickedEvent());
        }
    }

    /* renamed from: a */
    public void m12372a(Bundle bundle) {
        this.g = m12370a();
        this.h = m12375b();
        this.i = m12371a(this.g, this.h);
    }

    /* renamed from: a */
    public View m12369a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.a(layoutInflater, viewGroup, bundle);
    }

    /* renamed from: a */
    protected void m12373a(RecyclerView recyclerView) {
    }

    /* renamed from: a */
    protected LinearLayoutManager m12367a(Context context) {
        return new LinearLayoutManager(context);
    }

    /* renamed from: c */
    public void m12376c() {
        super.c();
        y();
    }

    /* renamed from: a */
    protected crw m12370a() {
        return new cbv(cco.m12554a(PollingActivity.SCOPE));
    }

    /* renamed from: a */
    protected csb m12371a(crw crw, cse cse) {
        return new cbo(crw, cse);
    }

    /* renamed from: b */
    protected cse m12375b() {
        return new cbw();
    }

    /* renamed from: a */
    protected View m12368a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_polling_launched, null);
    }

    /* renamed from: a */
    public void m12374a(boolean z, boolean z2) {
        super.a(z, z2);
    }
}

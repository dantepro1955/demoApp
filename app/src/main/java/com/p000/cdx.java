package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import com.ninegag.android.app.R;
import p000.cdw.C1687a;

/* compiled from: FeaturedPostListFragmentModule */
/* renamed from: cdx */
public class cdx extends cry {
    /* renamed from: a */
    private com f8856a;
    /* renamed from: b */
    private String f8857b;

    public cdx(com com, String str) {
        this.f8856a = com;
        this.f8857b = str;
    }

    /* renamed from: a */
    protected void m12708a(RecyclerView recyclerView) {
        recyclerView.addItemDecoration(new C1687a(recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.featured_post_vertical_separation)));
    }

    /* renamed from: a */
    protected LinearLayoutManager m12703a(Context context) {
        return new LinearLayoutManager(context);
    }

    /* renamed from: a */
    protected crw m12705a() {
        return new crv();
    }

    /* renamed from: b */
    protected cse m12710b() {
        return new cdw(this.f8856a);
    }

    /* renamed from: a */
    protected csb m12706a(crw crw, cse cse) {
        return new cdv(crw, cse);
    }

    /* renamed from: c */
    public void m12712c() {
        super.c();
        y();
        dhe.a("featuredList", C());
    }

    /* renamed from: d */
    public void m12713d() {
        super.d();
        m12702a(this.f8857b);
    }

    /* renamed from: h */
    public void m12715h() {
        super.h();
        this.f8857b = null;
        C().i();
    }

    /* renamed from: e */
    public void m12714e() {
        super.e();
        dhe.b("featuredList", C());
    }

    /* renamed from: a */
    protected View m12704a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_blitz_featured_post_list, null);
    }

    /* renamed from: a */
    public void m12707a(Bundle bundle) {
        super.a(bundle);
    }

    /* renamed from: a */
    public void m12709a(boolean z, boolean z2) {
        super.a(z, z2);
        m12702a(this.f8857b);
    }

    /* renamed from: b */
    public void m12711b(boolean z, boolean z2) {
        super.b(z, z2);
    }

    /* renamed from: a */
    private void m12702a(String str) {
        if (str != null && !str.isEmpty()) {
            int size = C().size();
            for (int i = 0; i < size; i++) {
                if (((cru) C().get(i)).a().m14144e().equals(str)) {
                    int a = D().a(i);
                    if (B() != null) {
                        B().scrollToPositionWithOffset(a, 0);
                        return;
                    }
                    return;
                }
            }
        }
    }
}

package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.C0556b;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ninegag.android.app.R;
import com.ninegag.android.blitz.ui.NestedScrollingRecyclerView;
import com.ninegag.android.tv.model.Post;
import com.ninegag.android.tv.model.PostVideo;

/* compiled from: PostListFragmentModule */
/* renamed from: cvi */
public class cvi extends cry {
    /* renamed from: a */
    private cvj$a f20286a;
    /* renamed from: b */
    private cvi$a f20287b;
    /* renamed from: c */
    private com f20288c;
    /* renamed from: d */
    private String f20289d;
    /* renamed from: e */
    private Context f20290e;

    /* compiled from: PostListFragmentModule */
    /* renamed from: cvi$1 */
    class C46021 extends C0556b {
        /* renamed from: b */
        final /* synthetic */ cvi f20285b;

        C46021(cvi cvi) {
            this.f20285b = cvi;
        }

        /* renamed from: a */
        public int m25045a(int i) {
            if (this.f20285b.m24700C().m24690v() || i != this.f20285b.m24701D().getItemCount() - 1) {
                return 1;
            }
            return 2;
        }
    }

    public cvi(cvj$a cvj_a, com com) {
        this.f20286a = cvj_a;
        this.f20288c = com;
    }

    public cvi(cvj$a cvj_a, com com, String str) {
        this.f20286a = cvj_a;
        this.f20288c = com;
        this.f20289d = str;
    }

    /* renamed from: a */
    protected crw mo4138a() {
        return new cvj(this.f20286a);
    }

    /* renamed from: b */
    protected cse mo4140b() {
        return new cvk(this.f20286a.f20292b, this.f20288c);
    }

    /* renamed from: a */
    protected csb mo4139a(crw crw, cse cse) {
        return new cvh(crw, cse);
    }

    /* renamed from: i */
    protected com mo4163i() {
        return this.f20288c;
    }

    /* renamed from: a */
    protected void mo4129a(RecyclerView recyclerView) {
        recyclerView.addItemDecoration(new csd((int) TypedValue.applyDimension(1, 8.0f, recyclerView.getResources().getDisplayMetrics()), true, 0));
        recyclerView.setHasFixedSize(true);
        NestedScrollingRecyclerView nestedScrollingRecyclerView = (NestedScrollingRecyclerView) recyclerView;
    }

    /* renamed from: a */
    protected void mo4162a(SwipeRefreshLayout swipeRefreshLayout) {
        super.mo4162a(swipeRefreshLayout);
        swipeRefreshLayout.setColorSchemeResources(new int[]{R.color.color_control_activated});
    }

    /* renamed from: a */
    public View mo4160a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo4160a(layoutInflater, viewGroup, bundle);
        m24705H().setProgressViewOffset(false, 0, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.swipe_refresh_layout_offset));
        return a;
    }

    /* renamed from: a */
    protected LinearLayoutManager mo4128a(Context context) {
        LinearLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        this.f20290e = context;
        gridLayoutManager.a(new C46021(this));
        return gridLayoutManager;
    }

    /* renamed from: a */
    public void mo4161a(Bundle bundle) {
        super.mo4161a(bundle);
        this.f20287b = new cvi$a(this, null);
    }

    /* renamed from: c */
    public void mo4130c() {
        super.mo4130c();
        dhe.m27283a(this.f20286a.f20292b, m24700C());
        dhe.m27283a(this.f20286a.f20292b, this.f20287b);
        m24731y();
        if (this.f20289d != null) {
            cvi.m25047a(this.f20290e, this.f20289d);
            this.f20289d = null;
        }
    }

    /* renamed from: e */
    public void mo4131e() {
        dhe.m27285b(this.f20286a.f20292b, this.f20287b);
        dhe.m27285b(this.f20286a.f20292b, m24700C());
        super.mo4131e();
    }

    /* renamed from: a */
    public static void m25047a(Context context, String str) {
        Post f = caf.a().k().f20339a.m25143f(str);
        PostVideo g = caf.a().k().f20339a.m25144g(str);
        if (f != null && g != null) {
            cvl cvl = new cvl(f);
            cvl.m25067a(g);
            switch (g.m23152b().intValue()) {
                case 1:
                    if (!TextUtils.isEmpty(cvl.m25072f())) {
                        new cqd(context).m24380a(cvl.m25069c(), cvl.m25070d(), cvl.m25066a(), cvl.m25072f(), cvl.m25073g(), cvl.m25074h(), str, cvl.m25076j());
                        return;
                    }
                    return;
                default:
                    new cqd(context).m24381a(cvl.m25069c(), cvl.m25070d(), cvl.m25066a(), "VideoBrowser", cvl.m25076j());
                    return;
            }
        }
    }

    /* renamed from: l */
    public void m25060l() {
        if (m24700C() != null) {
            if (m24699B() != null) {
                m24699B().scrollToPosition(0);
            }
            m24700C().m24658A();
        }
    }
}

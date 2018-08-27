package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager.C0370e;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.C0506b;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.C0556b;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0598n;
import android.support.v7.widget.RecyclerView.C0605t;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import p000.crw.C4102a;
import p000.cry.C4545d;
import p000.cvn.C4609b;

/* compiled from: HomePostListFragmentModule */
/* renamed from: cvp */
public class cvp extends cvi {
    /* renamed from: a */
    private cvj f20328a;
    /* renamed from: b */
    private C4615c f20329b;
    /* renamed from: c */
    private cvm f20330c;
    /* renamed from: d */
    private C4613a f20331d;
    /* renamed from: e */
    private cvj$a f20332e;
    /* renamed from: f */
    private C0598n f20333f = new C46122(this);

    /* compiled from: HomePostListFragmentModule */
    /* renamed from: cvp$1 */
    class C46111 extends C0556b {
        /* renamed from: b */
        final /* synthetic */ cvp f20323b;

        C46111(cvp cvp) {
            this.f20323b = cvp;
        }

        /* renamed from: a */
        public int m25093a(int i) {
            if (i == 0) {
                return 2;
            }
            if (this.f20323b.m24700C().m24690v() || i != this.f20323b.m24701D().getItemCount() - 1) {
                return 1;
            }
            return 2;
        }
    }

    /* compiled from: HomePostListFragmentModule */
    /* renamed from: cvp$2 */
    class C46122 implements C0598n {
        /* renamed from: a */
        final /* synthetic */ cvp f20324a;

        C46122(cvp cvp) {
            this.f20324a = cvp;
        }

        public void onViewRecycled(C0605t c0605t) {
            if (c0605t instanceof C4609b) {
                csb e = this.f20324a.m24701D();
                if (e instanceof cvo) {
                    ((cvo) e).m25091c();
                }
            }
        }
    }

    /* compiled from: HomePostListFragmentModule */
    /* renamed from: cvp$a */
    static class C4613a implements C0370e {
        /* renamed from: a */
        private WeakReference<SwipeRefreshLayout> f20325a;

        private C4613a() {
        }

        /* renamed from: a */
        public void m25096a(SwipeRefreshLayout swipeRefreshLayout) {
            this.f20325a = new WeakReference(swipeRefreshLayout);
        }

        /* renamed from: a */
        public void m25095a(int i, float f, int i2) {
        }

        /* renamed from: b */
        public void m25097b(int i) {
        }

        /* renamed from: a */
        public void m25094a(int i) {
            SwipeRefreshLayout swipeRefreshLayout;
            if (i == 1) {
                swipeRefreshLayout = (SwipeRefreshLayout) this.f20325a.get();
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setEnabled(false);
                    return;
                }
                return;
            }
            swipeRefreshLayout = (SwipeRefreshLayout) this.f20325a.get();
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setEnabled(true);
            }
        }
    }

    /* compiled from: HomePostListFragmentModule */
    /* renamed from: cvp$b */
    public class C4614b implements C4102a {
        /* renamed from: a */
        final /* synthetic */ cvp f20326a;

        public C4614b(cvp cvp) {
            this.f20326a = cvp;
        }

        /* renamed from: a */
        public void mo3774a() {
            this.f20326a.f20330c.notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo3775a(boolean z, boolean z2) {
            this.f20326a.f20330c.notifyDataSetChanged();
        }

        /* renamed from: b */
        public void mo3776b(boolean z, boolean z2) {
            this.f20326a.f20330c.notifyDataSetChanged();
        }
    }

    /* compiled from: HomePostListFragmentModule */
    /* renamed from: cvp$c */
    public static class C4615c extends cvj$a {
        public C4615c() {
            super(caf.a().q().c(), caf.a().q().c() + "-" + System.currentTimeMillis());
        }
    }

    /* compiled from: HomePostListFragmentModule */
    /* renamed from: cvp$d */
    public static class C4616d extends cvj$a {
        public C4616d() {
            super(caf.a().q().b(), caf.a().q().b() + "-" + System.currentTimeMillis());
        }
    }

    /* compiled from: HomePostListFragmentModule */
    /* renamed from: cvp$e */
    public class C4617e extends C4545d {
        /* renamed from: b */
        final /* synthetic */ cvp f20327b;

        protected C4617e(cvp cvp) {
            this.f20327b = cvp;
            super(cvp);
        }

        /* renamed from: a */
        public void mo4169a() {
            super.mo4169a();
            this.f20327b.f20328a.A();
        }
    }

    public cvp(cvj$a cvj_a, com com) {
        super(cvj_a, com);
        this.f20332e = cvj_a;
        this.f20329b = new C4615c();
    }

    /* renamed from: a */
    protected csb mo4139a(crw crw, cse cse) {
        this.f20330c = new cvm(this.f20332e.f20292b, this.f20328a, mo4163i());
        this.f20331d = new C4613a();
        return new cvo(crw, cse, this.f20330c, this.f20331d);
    }

    /* renamed from: a */
    protected crw mo4138a() {
        this.f20328a = new cvj(this.f20329b);
        return super.mo4138a();
    }

    /* renamed from: a */
    protected LinearLayoutManager mo4128a(Context context) {
        LinearLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        gridLayoutManager.a(new C46111(this));
        return gridLayoutManager;
    }

    /* renamed from: a */
    public View mo4160a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20328a.b(bundle);
        if (this.f20330c != null) {
            this.f20330c.notifyDataSetChanged();
        }
        return super.mo4160a(layoutInflater, viewGroup, bundle);
    }

    /* renamed from: a */
    protected void mo4162a(SwipeRefreshLayout swipeRefreshLayout) {
        this.f20331d.m25096a(swipeRefreshLayout);
        super.mo4162a(swipeRefreshLayout);
    }

    /* renamed from: a */
    protected void mo4129a(RecyclerView recyclerView) {
        recyclerView.addItemDecoration(new csd((int) TypedValue.applyDimension(1, 8.0f, recyclerView.getResources().getDisplayMetrics()), false, 1));
        recyclerView.setRecyclerListener(this.f20333f);
    }

    /* renamed from: b */
    public void mo4171b(Bundle bundle) {
        super.mo4171b(bundle);
        this.f20328a.a(bundle);
        if (this.f20330c != null) {
            this.f20330c.notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public void mo4130c() {
        super.mo4130c();
        this.f20328a.a(m24732z(), m24698A());
        this.f20328a.a(new C4614b(this));
        dhe.m27283a(this.f20329b.b, this.f20328a);
        this.f20328a.z();
    }

    /* renamed from: e */
    public void mo4131e() {
        dhe.m27285b(this.f20329b.b, this.f20328a);
        this.f20328a.a(null);
        this.f20328a.a(null, null);
        super.mo4131e();
    }

    /* renamed from: h */
    public void mo4172h() {
        super.mo4172h();
        m24700C().m24682i();
    }

    /* renamed from: E */
    protected C0506b mo4170E() {
        return new C4617e(this);
    }

    /* renamed from: m */
    public void m25118m() {
        csb D = m24701D();
        if (D instanceof cvo) {
            ((cvo) D).m25091c();
        }
    }

    /* renamed from: n */
    public void m25119n() {
        csb D = m24701D();
        if (D instanceof cvo) {
            ((cvo) D).m25092d();
        }
    }
}

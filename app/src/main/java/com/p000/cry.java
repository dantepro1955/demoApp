package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.C0506b;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0594k;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.ninegag.android.blitz.ui.NestedScrollingRecyclerView;
import java.lang.ref.WeakReference;
import p000.crw.C4102a;
import p000.crw.C4541b;
import p000.csa.C4549c;
import p000.csa.C4551e;
import p000.csa.C4552f;

/* compiled from: BlitzFragmentModule */
/* renamed from: cry */
public abstract class cry implements C4541b {
    /* renamed from: a */
    private Handler f20045a;
    /* renamed from: b */
    private Handler f20046b;
    /* renamed from: c */
    private HandlerThread f20047c;
    /* renamed from: d */
    private LinearLayoutManager f20048d;
    /* renamed from: e */
    private View f20049e;
    /* renamed from: f */
    private SwipeRefreshLayout f20050f;
    /* renamed from: g */
    protected crw f20051g;
    /* renamed from: h */
    protected cse<crz> f20052h;
    /* renamed from: i */
    protected csb<crz> f20053i;
    /* renamed from: j */
    protected C4102a f20054j;
    /* renamed from: k */
    private NestedScrollingRecyclerView f20055k;
    /* renamed from: l */
    private long f20056l = 0;
    /* renamed from: m */
    private boolean f20057m;

    /* compiled from: BlitzFragmentModule */
    /* renamed from: cry$a */
    public static class C4542a implements C4102a {
        /* renamed from: a */
        private WeakReference<cry> f20058a;

        public C4542a(cry cry) {
            this.f20058a = new WeakReference(cry);
        }

        /* renamed from: a */
        public void mo3774a() {
            cry cry = (cry) this.f20058a.get();
            if (cry != null && cry.f20050f != null) {
                cry.f20050f.setRefreshing(true);
                cry.q_();
            }
        }

        /* renamed from: a */
        public void mo3775a(boolean z, boolean z2) {
            boolean z3 = false;
            cry cry = (cry) this.f20058a.get();
            if (cry != null) {
                if (cry.f20050f != null) {
                    cry.f20050f.setRefreshing(false);
                }
                csb csb = cry.f20053i;
                if (z && cry.f20051g.size() > 0) {
                    z3 = true;
                }
                csb.m24752a(z3);
                cry.f20053i.notifyDataSetChanged();
                cry.m24716a(z, z2);
            }
        }

        /* renamed from: b */
        public void mo3776b(boolean z, boolean z2) {
            cry cry = (cry) this.f20058a.get();
            if (cry != null) {
                cry.f20056l = 0;
                csb csb = cry.f20053i;
                boolean z3 = z && cry.f20051g.size() > 0;
                csb.m24752a(z3);
                cry.f20053i.notifyDataSetChanged();
                cry.m24720b(z, z2);
            }
        }
    }

    /* compiled from: BlitzFragmentModule */
    /* renamed from: cry$b */
    public class C4543b extends C0594k {
        /* renamed from: a */
        final /* synthetic */ cry f20059a;

        protected C4543b(cry cry) {
            this.f20059a = cry;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            this.f20059a.m24715a(recyclerView, i, i2);
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.f20059a.m24722c(recyclerView, i);
            } else if (i == 1) {
                this.f20059a.m24714a(recyclerView, i);
            } else if (i == 2) {
                this.f20059a.m24719b(recyclerView, i);
            }
        }
    }

    /* compiled from: BlitzFragmentModule */
    /* renamed from: cry$c */
    public class C4544c implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ cry f20060a;
        /* renamed from: b */
        private float f20061b;
        /* renamed from: c */
        private int f20062c = 0;
        /* renamed from: d */
        private int f20063d = 0;

        public C4544c(cry cry, int i, int i2) {
            this.f20060a = cry;
            this.f20062c = i;
            this.f20063d = i2;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 2) {
                    float y = motionEvent.getY();
                    if (this.f20061b != -1.0f) {
                        if (y > this.f20061b + ((float) this.f20062c)) {
                            this.f20060a.m24729k();
                        } else if (y < this.f20061b - ((float) this.f20063d)) {
                            this.f20060a.m24728j();
                        }
                    }
                    this.f20061b = y;
                } else if (actionMasked == 1) {
                    this.f20061b = -1.0f;
                }
            }
            return false;
        }
    }

    /* compiled from: BlitzFragmentModule */
    /* renamed from: cry$d */
    public class C4545d implements C0506b {
        /* renamed from: a */
        final /* synthetic */ cry f20064a;

        protected C4545d(cry cry) {
            this.f20064a = cry;
        }

        /* renamed from: a */
        public void mo4169a() {
            this.f20064a.f20051g.m24658A();
        }
    }

    /* renamed from: a */
    protected abstract LinearLayoutManager mo4128a(Context context);

    /* renamed from: a */
    protected abstract crw mo4138a();

    /* renamed from: a */
    protected abstract csb mo4139a(crw crw, cse cse);

    /* renamed from: a */
    protected abstract void mo4129a(RecyclerView recyclerView);

    /* renamed from: b */
    protected abstract cse mo4140b();

    /* renamed from: a */
    public void mo4161a(Bundle bundle) {
        this.f20051g = mo4138a();
        this.f20052h = mo4140b();
        this.f20053i = mo4139a(this.f20051g, this.f20052h);
    }

    /* renamed from: a */
    public View mo4160a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup == null) {
            return null;
        }
        this.f20049e = m24707a(layoutInflater);
        this.f20051g.m24671b(bundle);
        this.f20051g.m24668a((C4541b) this);
        this.f20053i.m24752a(!this.f20051g.m24690v());
        this.f20053i.notifyDataSetChanged();
        this.f20048d = mo4128a(viewGroup.getContext());
        this.f20055k = (NestedScrollingRecyclerView) this.f20049e.findViewById(C4551e.recycler_view);
        this.f20055k.setEmptyView(m24730s());
        this.f20055k.setLayoutManager(this.f20048d);
        this.f20055k.setAdapter(this.f20053i);
        this.f20055k.addOnScrollListener(new C4543b(this));
        this.f20055k.setOnTouchListener(new C4544c(this, viewGroup.getContext().getResources().getDimensionPixelOffset(C4549c.scroll_up_threshold), viewGroup.getContext().getResources().getDimensionPixelOffset(C4549c.scroll_down_threshold)));
        mo4129a(this.f20055k);
        this.f20050f = (SwipeRefreshLayout) this.f20049e.findViewById(C4551e.swipe_refresh_layout);
        mo4162a(this.f20050f);
        return this.f20049e;
    }

    /* renamed from: a */
    protected View m24707a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(C4552f.tv_fragment_post_list, null);
    }

    /* renamed from: a */
    protected void mo4162a(SwipeRefreshLayout swipeRefreshLayout) {
        swipeRefreshLayout.setOnRefreshListener(mo4170E());
    }

    /* renamed from: b */
    public void mo4171b(Bundle bundle) {
        this.f20051g.m24665a(bundle);
    }

    /* renamed from: c */
    public void mo4130c() {
        if (this.f20045a == null) {
            this.f20045a = new Handler(Looper.getMainLooper());
            this.f20047c = new HandlerThread("blitz-bg-thread");
            this.f20047c.start();
            this.f20046b = new Handler(this.f20047c.getLooper());
        }
        this.f20054j = new C4542a(this);
        this.f20051g.m24666a(this.f20045a, this.f20046b);
        this.f20051g.m24667a(this.f20054j);
    }

    /* renamed from: d */
    public void m24723d() {
    }

    /* renamed from: h */
    public void mo4172h() {
    }

    /* renamed from: e */
    public void mo4131e() {
        this.f20051g.m24667a(null);
        this.f20051g.m24666a(null, null);
        this.f20047c.quit();
        this.f20047c = null;
        this.f20046b = null;
        this.f20045a = null;
    }

    /* renamed from: f */
    public void m24726f() {
    }

    /* renamed from: y */
    protected void m24731y() {
        if (m24700C().m24687s() == null) {
            this.f20051g.m24694z();
        } else {
            m24700C().m24683j();
        }
    }

    /* renamed from: z */
    public Handler m24732z() {
        return this.f20045a;
    }

    /* renamed from: A */
    public Handler m24698A() {
        return this.f20046b;
    }

    /* renamed from: B */
    public LinearLayoutManager m24699B() {
        return this.f20048d;
    }

    /* renamed from: C */
    protected crw m24700C() {
        return this.f20051g;
    }

    /* renamed from: D */
    protected csb m24701D() {
        return this.f20053i;
    }

    /* renamed from: E */
    protected C0506b mo4170E() {
        return new C4545d(this);
    }

    /* renamed from: c */
    protected void m24722c(RecyclerView recyclerView, int i) {
        mo4163i();
        this.f20057m = false;
    }

    /* renamed from: a */
    protected void m24714a(RecyclerView recyclerView, int i) {
        this.f20057m = true;
    }

    /* renamed from: b */
    protected void m24719b(RecyclerView recyclerView, int i) {
        this.f20057m = true;
    }

    /* renamed from: a */
    protected void m24715a(RecyclerView recyclerView, int i, int i2) {
        mo4163i();
    }

    /* renamed from: k */
    protected void m24729k() {
    }

    /* renamed from: j */
    protected void m24728j() {
    }

    public void q_() {
    }

    /* renamed from: a */
    public void m24716a(boolean z, boolean z2) {
    }

    /* renamed from: b */
    public void m24720b(boolean z, boolean z2) {
    }

    /* renamed from: F */
    public View m24703F() {
        return this.f20049e;
    }

    /* renamed from: G */
    public RecyclerView m24704G() {
        return this.f20055k;
    }

    /* renamed from: H */
    public SwipeRefreshLayout m24705H() {
        return this.f20050f;
    }

    /* renamed from: s */
    public View m24730s() {
        return null;
    }

    public void a_(String str) {
    }

    /* renamed from: d */
    public void mo4127d(String str) {
    }

    /* renamed from: i */
    private void mo4163i() {
        if (this.f20048d.findLastVisibleItemPosition() + 5 > this.f20048d.getItemCount()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f20056l > 3000) {
                this.f20051g.m24659B();
                this.f20056l = currentTimeMillis;
            }
        }
    }
}

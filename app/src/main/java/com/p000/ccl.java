package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0581a;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.millennialmedia.InterstitialAd.InterstitialErrorStatus;
import com.ninegag.android.app.R;
import com.ninegag.android.app.component.postlist.GagPostListFragment;
import com.ninegag.android.app.otto.NewPostCountUpdatedEvent;
import com.ninegag.android.app.otto.ThemeSwitchedEvent;
import com.ninegag.android.app.otto.actionbar.AbReloadClickedEvent;
import com.ninegag.android.app.otto.broadcast.ApiCallbackEvent;
import com.ninegag.android.app.ui.BaseActivity;
import java.lang.ref.WeakReference;

/* compiled from: GagPostListFragmentModule */
/* renamed from: ccl */
public class ccl extends cry {
    /* renamed from: a */
    protected cco f8704a;
    /* renamed from: b */
    protected ccp f8705b;
    /* renamed from: c */
    protected com f8706c;
    /* renamed from: d */
    protected String f8707d;
    /* renamed from: e */
    protected cdl f8708e;
    /* renamed from: f */
    protected caf f8709f = caf.m12046a();
    /* renamed from: k */
    private cck f8710k;
    /* renamed from: l */
    private cex f8711l;
    /* renamed from: m */
    private cdi f8712m;
    /* renamed from: n */
    private ccm f8713n;
    /* renamed from: o */
    private ccn f8714o;
    /* renamed from: p */
    private WeakReference<GagPostListFragment> f8715p;
    /* renamed from: q */
    private cnv f8716q;
    /* renamed from: r */
    private boolean f8717r;

    /* compiled from: GagPostListFragmentModule */
    /* renamed from: ccl$1 */
    class C16681 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ ccl f8700a;

        C16681(ccl ccl) {
            this.f8700a = ccl;
        }

        public void onClick(View view) {
            dhe.c(this.f8700a.f8704a.f8730b, new AbReloadClickedEvent());
            this.f8700a.m12522r().m12545a(false);
            chn.m13400c("PostList", "TapNewPostIndicator", this.f8700a.f8704a.f8729a);
            chn.m13398c(this.f8700a.f8704a.f8732d, this.f8700a.f8704a.f8731c);
            this.f8700a.f8709f.m12077h().m13979a(this.f8700a.f8704a.f8731c, this.f8700a.f8704a.f8732d, 0);
        }
    }

    /* compiled from: GagPostListFragmentModule */
    /* renamed from: ccl$2 */
    class C16692 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ccl f8701a;

        C16692(ccl ccl) {
            this.f8701a = ccl;
        }

        public void run() {
            if (this.f8701a.F() != null && this.f8701a.m12523s() != null && this.f8701a.G() != null) {
                this.f8701a.m12523s().setVisibility(8);
                this.f8701a.G().setVisibility(0);
            }
        }
    }

    public ccl(cco cco, GagPostListFragment gagPostListFragment, com com) {
        this.f8704a = cco;
        this.f8710k = new cck(cco.f8730b, gagPostListFragment, cco);
        this.f8711l = new cex(cco.f8730b, gagPostListFragment);
        this.f8712m = new cdi(cco.f8730b, gagPostListFragment);
        this.f8713n = new ccm(cco.f8730b, this);
        this.f8714o = new ccn(cco.f8730b, this);
        this.f8715p = new WeakReference(gagPostListFragment);
        this.f8706c = com;
    }

    /* renamed from: a */
    protected View m12485a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_blitz_post_list, null);
    }

    /* renamed from: a */
    public void m12489a(Bundle bundle) {
        super.a(bundle);
        this.f8716q = new cnv("BlitzGPFModule:comment");
        this.f8716q.start();
    }

    /* renamed from: a */
    protected void m12491a(RecyclerView recyclerView) {
    }

    /* renamed from: a */
    protected void mo1682a(SwipeRefreshLayout swipeRefreshLayout) {
        super.a(swipeRefreshLayout);
        swipeRefreshLayout.setColorSchemeResources(R.color.color_control_activated);
    }

    /* renamed from: b */
    protected View m12499b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.a(layoutInflater, viewGroup, bundle);
    }

    /* renamed from: a */
    public View m12486a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View b = m12499b(layoutInflater, viewGroup, bundle);
        if (b == null) {
            return null;
        }
        Context context = viewGroup.getContext();
        ccj ccj = (ccj) D();
        if (ccj instanceof cch) {
            ((cch) ccj).m12470a(context.getResources().getDimensionPixelSize(R.dimen.home_app_bar_height));
            H().setProgressViewOffset(false, 0, context.getResources().getDimensionPixelSize(R.dimen.swipe_refresh_layout_offset));
        }
        H().setProgressViewOffset(false, 0, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.swipe_refresh_layout_offset));
        m12493a(b);
        return b;
    }

    /* renamed from: a */
    protected LinearLayoutManager m12484a(Context context) {
        return new LinearLayoutManager(context);
    }

    /* renamed from: a */
    protected crw mo1701a() {
        return new ccs(this.f8704a);
    }

    /* renamed from: b */
    protected cse mo1702b() {
        this.f8705b = new cdn(this.f8704a.f8730b, this.f8706c, caf.m12046a().m12077h().ak(), this.f8704a);
        ((cdn) this.f8705b).m12681a(this.f8708e);
        return this.f8705b;
    }

    /* renamed from: a */
    protected csb mo1681a(crw crw, cse cse) {
        csb ccj = new ccj(this.f8708e, crw, cse, this.f8704a);
        ccj.m12475a(this.f8707d);
        return ccj;
    }

    /* renamed from: c */
    public void mo1684c() {
        super.c();
        this.f8709f.m12070d((Object) this);
        this.f8713n.m12533b();
        ccs ccs = (ccs) C();
        this.f8710k.m12480a(D());
        this.f8710k.m12477a(ccs);
        dhe.a(this);
        dhe.a(this.f8704a.f8730b, C());
        dhe.a(this.f8704a.f8730b, this.f8710k);
        dhe.a(this.f8704a.f8730b, this.f8711l);
        dhe.a(this.f8704a.f8730b, this.f8712m);
        y();
        mo1683a(ccs);
        if (!this.f8709f.m12094x().m12104c()) {
            int r = ccs.r();
            int min = Math.min(C().size(), r + 10);
            for (int i = r; i < min; i++) {
                ((cct) ccs.get(i)).m12266J();
            }
        }
        boolean ah = this.f8709f.m12077h().ah();
        if (this.f8717r != ah) {
            this.f8717r = ah;
            this.f8706c.m20828b();
        }
    }

    /* renamed from: e */
    public void mo1685e() {
        this.f8709f.m12076g((Object) this);
        dhe.b(this.f8704a.f8730b, this.f8712m);
        dhe.b(this.f8704a.f8730b, this.f8711l);
        dhe.b(this.f8704a.f8730b, this.f8710k);
        dhe.b(this.f8704a.f8730b, C());
        dhe.b(this);
        dle.a();
        this.f8713n.m12536c();
        super.e();
        this.f8717r = this.f8709f.m12077h().ah();
    }

    /* renamed from: d */
    public void mo1708d() {
        super.d();
    }

    /* renamed from: h */
    public void mo1709h() {
        super.h();
        if (!this.f8709f.m12077h().m13856Q()) {
            this.f8713n.m12540f();
        }
        this.f8713n.m12542h();
        C().i();
    }

    /* renamed from: f */
    public void m12511f() {
        super.f();
        this.f8716q.quit();
        this.f8716q = null;
        if (this.f8705b instanceof cdn) {
            ((cdn) this.f8705b).close();
        }
    }

    /* renamed from: a */
    protected void m12493a(View view) {
        view.findViewById(R.id.new_posts_button_container).setOnClickListener(new C16681(this));
    }

    /* renamed from: a */
    protected void mo1683a(ccs ccs) {
        int a = D().a(ccs.r());
        if (B() != null) {
            B().scrollToPositionWithOffset(a, 0);
        } else {
            chn.m13366a((int) InterstitialErrorStatus.ALREADY_LOADED, "restoreInCache=layoutManager=Null");
        }
    }

    /* renamed from: i */
    protected int m12513i() {
        return this.f8713n.m12541g();
    }

    public void q_() {
        this.f8709f.m12077h().m14000f(this.f8704a.f8731c, this.f8704a.f8732d);
        C().d(0);
    }

    /* renamed from: a */
    public void m12497a(boolean z, boolean z2) {
        if (!z2 && z) {
            C().y();
        } else if (C().size() == 0) {
            mo1697d(this.f8709f.f8449a.getString(R.string.search_no_result));
        } else if (C().size() > 0) {
            a_("");
        }
    }

    /* renamed from: b */
    public void m12503b(boolean z, boolean z2) {
        if (!z2) {
            if (C().w()) {
                int i = m12513i();
                if (m12518n().m12347l() != null) {
                    chn.m13366a(i, "onLoaderLoadMore restoreResult: " + i + " lastSavedPostId=" + this.f8709f.m12077h().m13988b(this.f8704a.f8731c, this.f8704a.f8732d) + " currentPostId=" + m12518n().m12347l().m12282e() + " listSize=" + m12518n().size() + " listKey=" + m12518n().m12348m().m12563b());
                    return;
                } else {
                    chn.m13366a(i, "onLoaderLoadMore restoreResult: " + i + " lastSavedPostId=" + this.f8709f.m12077h().m13988b(this.f8704a.f8731c, this.f8704a.f8732d) + " currentPostId= null" + " listSize=" + m12518n().size() + " listKey=" + m12518n().m12348m().m12563b());
                    return;
                }
            }
            C().y();
        }
    }

    /* renamed from: a */
    protected void m12492a(RecyclerView recyclerView, int i) {
        super.a(recyclerView, i);
        this.f8713n.m12530a(recyclerView, i);
    }

    /* renamed from: b */
    protected void m12501b(RecyclerView recyclerView, int i) {
        super.b(recyclerView, i);
        this.f8713n.m12534b(recyclerView, i);
    }

    /* renamed from: c */
    protected void m12506c(RecyclerView recyclerView, int i) {
        super.c(recyclerView, i);
        this.f8713n.m12537c(recyclerView, i);
    }

    /* renamed from: j */
    protected void m12514j() {
        super.j();
        this.f8713n.m12538d();
    }

    /* renamed from: k */
    protected void m12515k() {
        super.k();
        this.f8713n.m12539e();
    }

    /* renamed from: a */
    public boolean m12498a(int i, KeyEvent keyEvent) {
        return this.f8713n.m12535b(i, keyEvent);
    }

    /* renamed from: b */
    public boolean m12504b(int i, KeyEvent keyEvent) {
        return this.f8713n.m12532a(i, keyEvent);
    }

    @dhg
    public void onApiCallback(ApiCallbackEvent apiCallbackEvent) {
        Intent intent = apiCallbackEvent.f18303a;
        if (intent.getIntExtra("command", -1) == 115) {
            dhe.c(intent.getStringExtra("scope"), new NewPostCountUpdatedEvent(intent.getIntExtra("list_type", 1), intent.getStringExtra("group_id")));
        }
    }

    @dhg
    public void onThemeSwitched(ThemeSwitchedEvent themeSwitchedEvent) {
        int i = 0;
        while (i < G().getChildCount()) {
            try {
                Object tag = G().getChildAt(i).getTag();
                if (tag instanceof ccd) {
                    ((ccd) tag).m12160a(this.f8706c.f16683a);
                }
                i++;
            } catch (Exception e) {
                return;
            }
        }
    }

    /* renamed from: l */
    protected com m12516l() {
        return this.f8706c;
    }

    /* renamed from: m */
    public ccp m12517m() {
        return this.f8705b;
    }

    /* renamed from: n */
    public ccs m12518n() {
        return (ccs) C();
    }

    /* renamed from: o */
    public ccj m12519o() {
        return (ccj) D();
    }

    /* renamed from: p */
    public cnv m12520p() {
        return this.f8716q;
    }

    /* renamed from: q */
    public cco m12521q() {
        return this.f8704a;
    }

    /* renamed from: r */
    public ccn m12522r() {
        return this.f8714o;
    }

    /* renamed from: a */
    public void m12495a(cdl cdl) {
        this.f8708e = cdl;
    }

    /* renamed from: a */
    public void m12496a(String str) {
        this.f8707d = str;
    }

    /* renamed from: s */
    public View m12523s() {
        if (F() == null) {
            return null;
        }
        View textView;
        ViewGroup viewGroup = (ViewGroup) F().findViewById(R.id.emptyView);
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View findViewById = viewGroup.findViewById(R.id.emptyText);
        if (findViewById == null) {
            textView = new TextView(viewGroup.getContext());
        } else {
            textView = (TextView) findViewById;
        }
        LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        textView.setId(R.id.emptyText);
        textView.setLayoutParams(layoutParams2);
        textView.setText(R.string.no_posts);
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        if (m12527w() instanceof BaseActivity) {
            textView.setTextColor(ew.m21143c(m12527w(), ((BaseActivity) m12527w()).getUiState().f16683a.mo1822c()));
        }
        if (findViewById != null) {
            return viewGroup;
        }
        viewGroup.addView(textView, layoutParams);
        return viewGroup;
    }

    /* renamed from: b */
    public void m12502b(String str) {
        int i = -1;
        for (int i2 = 0; i2 < m12518n().size(); i2++) {
            if (((cct) m12518n().get(i2)).m12282e().equals(str)) {
                i = i2;
            }
        }
        if (i != -1) {
            int a = D().a(i);
            m12518n().remove(i);
            m12518n().m12344i();
            D().notifyItemRemoved(a);
            D().notifyItemRangeRemoved(a + 1, m12518n().size());
            B().scrollToPosition(a);
            m12518n().d(i);
        }
    }

    /* renamed from: t */
    public void m12524t() {
        B().scrollToPosition(0);
        m12525u();
    }

    /* renamed from: u */
    public void m12525u() {
        C().A();
        chn.m13445q("Navigation", "TapRefreshPostList");
    }

    public void a_(String str) {
        if (z() != null) {
            z().post(new C16692(this));
        }
    }

    /* renamed from: d */
    public void mo1697d(final String str) {
        if (z() != null) {
            z().post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ ccl f8703b;

                public void run() {
                    this.f8703b.m12510e(str);
                }
            });
        }
    }

    /* renamed from: e */
    protected void m12510e(String str) {
        if (this.f8715p.get() != null) {
            GagPostListFragment gagPostListFragment = (GagPostListFragment) this.f8715p.get();
            if (gagPostListFragment.k() == null) {
                return;
            }
            if (!this.f8709f.m12080j().m13488e()) {
                gagPostListFragment.l().showToast(this.f8709f.f8449a.getString(R.string.error_no_network));
            } else if (this.f8709f.f8449a.getString(R.string.error_load_more).equals(str)) {
                gagPostListFragment.k().showToast(str);
            }
        }
    }

    /* renamed from: v */
    public boolean m12526v() {
        if (G() == null) {
            return false;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) G().getLayoutManager();
        C0581a adapter = G().getAdapter();
        if (linearLayoutManager == null || adapter == null) {
            return false;
        }
        return linearLayoutManager.findLastCompletelyVisibleItemPosition() < adapter.getItemCount() + -1;
    }

    /* renamed from: w */
    protected Activity m12527w() {
        if (m12528x() != null) {
            return ((GagPostListFragment) this.f8715p.get()).getActivity();
        }
        return null;
    }

    /* renamed from: x */
    protected Fragment m12528x() {
        return (Fragment) this.f8715p.get();
    }
}

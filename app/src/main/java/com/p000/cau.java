package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.broadcast.ApiCallbackEvent;
import com.under9.android.remoteconfig.api.model.ApiAppLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.cbd.C1655a;

/* compiled from: ExploreListFragmentModule */
/* renamed from: cau */
public class cau extends cry {
    /* renamed from: a */
    private caf f8535a = caf.m12046a();
    /* renamed from: b */
    private com f8536b;
    /* renamed from: c */
    private cgq f8537c;
    /* renamed from: d */
    private cgp f8538d;
    /* renamed from: e */
    private List<ApiAppLink> f8539e;
    /* renamed from: f */
    private caw f8540f;
    /* renamed from: k */
    private cax f8541k;
    /* renamed from: l */
    private cas f8542l;
    /* renamed from: m */
    private cbd f8543m;
    /* renamed from: n */
    private cbc f8544n;
    /* renamed from: o */
    private crv f8545o;
    /* renamed from: p */
    private C1655a f8546p;
    /* renamed from: q */
    private car f8547q;
    /* renamed from: r */
    private cnv f8548r;

    /* compiled from: ExploreListFragmentModule */
    /* renamed from: cau$1 */
    class C16431 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ cau f8532a;

        C16431(cau cau) {
            this.f8532a = cau;
        }

        public void run() {
            this.f8532a.f8535a.m12079i().m13580f(-1);
        }
    }

    public cau(com com) {
        this.f8536b = com;
        this.f8542l = new cas(com);
        this.f8546p = new C1655a();
        m12175i();
        m12176l();
    }

    /* renamed from: a */
    protected void m12183a(SwipeRefreshLayout swipeRefreshLayout) {
        super.a(swipeRefreshLayout);
        swipeRefreshLayout.setColorSchemeResources(R.color.color_control_activated);
        this.f8546p.m12230a(swipeRefreshLayout);
    }

    /* renamed from: a */
    protected void m12184a(RecyclerView recyclerView) {
    }

    /* renamed from: a */
    protected LinearLayoutManager m12178a(Context context) {
        return new LinearLayoutManager(context);
    }

    /* renamed from: a */
    protected crw m12180a() {
        this.f8540f = new caw();
        return this.f8540f;
    }

    /* renamed from: b */
    protected cse m12185b() {
        this.f8541k = new cax(this.f8536b, "exploreList");
        return this.f8541k;
    }

    /* renamed from: a */
    protected csb m12181a(crw crw, cse cse) {
        return new cat(crw, cse, this.f8542l, this.f8537c, this.f8543m);
    }

    /* renamed from: a */
    protected View m12179a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.fragment_explore_list_blitz, null);
    }

    /* renamed from: a */
    public void m12182a(Bundle bundle) {
        super.a(bundle);
        this.f8548r = new cnv("ExploreListFragmentModule:comment");
        this.f8548r.start();
        this.f8547q = new car(this);
    }

    /* renamed from: c */
    public void m12186c() {
        super.c();
        this.f8535a.m12070d((Object) this);
        dhe.a("exploreList", C());
        dhe.a("exploreList", this.f8547q);
        new Handler().postDelayed(new C16431(this), 1000);
        y();
        m12177m();
    }

    /* renamed from: d */
    public void m12187d() {
        super.d();
    }

    /* renamed from: e */
    public void m12188e() {
        dhe.b("exploreList", this.f8547q);
        dhe.b("exploreList", C());
        this.f8535a.m12076g((Object) this);
        super.e();
    }

    /* renamed from: f */
    public void m12189f() {
        this.f8548r.quit();
        this.f8548r = null;
        this.f8538d.notifyDataSetChanged();
        super.f();
    }

    @dhg
    public void onApiCallback(ApiCallbackEvent apiCallbackEvent) {
        if (apiCallbackEvent.f18303a.getIntExtra("command", -1) == 116) {
            m12177m();
        }
    }

    /* renamed from: i */
    private void m12175i() {
        this.f8545o = new crv();
        this.f8544n = new cbc(this.f8545o, this.f8536b);
        this.f8543m = new cbd(this.f8544n, this.f8546p, this.f8536b);
    }

    /* renamed from: l */
    private void m12176l() {
        this.f8539e = new ArrayList();
        this.f8538d = new cgp(this.f8539e);
        this.f8537c = new cgq(this.f8538d, this.f8536b);
        this.f8538d.notifyDataSetChanged();
    }

    /* renamed from: m */
    private void m12177m() {
        final boolean h = cij.m13687a().m13732h();
        new Thread(this) {
            /* renamed from: b */
            final /* synthetic */ cau f8534b;

            public void run() {
                ApiAppLink[] h = caf.m12046a().m12088r().h();
                List<cka> d = caf.m12046a().m12075g().m13723d(true);
                if (this.f8534b.f8545o != null) {
                    cnv c = this.f8534b.f8548r;
                    this.f8534b.f8545o.clear();
                    for (cka cru : d) {
                        cka cru2;
                        cru cru3 = new cru(cru2);
                        if (cru3.a().m14143d().intValue() == 1 && c != null) {
                            cru2 = cru3.a();
                            if (cru2.m14146g() != null) {
                                c.m14919a(cct.m12254a(cru2.m14146g()));
                            }
                        }
                        if (!h || !cru3.d()) {
                            this.f8534b.f8545o.add(cru3);
                        }
                    }
                }
                new Handler(Looper.getMainLooper()).post(cav.m12190a(this, h));
            }

            /* renamed from: a */
            static /* synthetic */ void m12167a(C16442 c16442, ApiAppLink[] apiAppLinkArr) {
                if (c16442.f8534b.f8544n != null && c16442.f8534b.f8545o != null) {
                    c16442.f8534b.f8544n.notifyDataSetChanged();
                    c16442.f8534b.f8539e.clear();
                    c16442.f8534b.f8538d.notifyDataSetChanged();
                    if (apiAppLinkArr != null && apiAppLinkArr.length > 0) {
                        c16442.f8534b.f8539e.addAll(Arrays.asList(apiAppLinkArr));
                        c16442.f8534b.f8538d.notifyDataSetChanged();
                    }
                    c16442.f8534b.D().notifyDataSetChanged();
                }
            }
        }.start();
    }

    public void m_() {
        if (C() != null) {
            if (B() != null) {
                B().scrollToPosition(0);
            }
            C().A();
        }
    }
}

package com.p000;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.widget.SwipeRefreshLayout;
import com.ninegag.android.app.component.postlist.GagPostListFragment;
import com.ninegag.android.app.otto.broadcast.ApiCallbackEvent;
import java.util.List;
import p000.cbd.C1655a;

/* compiled from: HotGagPostListFragmentModule */
/* renamed from: cdz */
public class cdz extends ccl {
    /* renamed from: k */
    private caf f8864k = caf.m12046a();
    /* renamed from: l */
    private crv f8865l = new crv();
    /* renamed from: m */
    private cbc f8866m = new cbc(this.f8865l, new com());
    /* renamed from: n */
    private C1655a f8867n = new C1655a();

    /* compiled from: HotGagPostListFragmentModule */
    /* renamed from: cdz$1 */
    class C16881 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ cdz f8860a;

        C16881(cdz cdz) {
            this.f8860a = cdz;
        }

        public void run() {
            this.f8860a.f8864k.m12079i().m13580f(-1);
        }
    }

    /* compiled from: HotGagPostListFragmentModule */
    /* renamed from: cdz$2 */
    class C16902 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ cdz f8863a;

        C16902(cdz cdz) {
            this.f8863a = cdz;
        }

        public void run() {
            final List d = this.f8863a.f8864k.m12075g().m13723d(true);
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C16902 f8862b;

                public void run() {
                    if (this.f8862b.f8863a.f8866m != null && this.f8862b.f8863a.f8865l != null) {
                        cnv p = this.f8862b.f8863a.m12520p();
                        this.f8862b.f8863a.f8865l.clear();
                        for (cka cru : d) {
                            cka cru2;
                            cru cru3 = new cru(cru2);
                            if (cru3.a().m14143d().intValue() == 1 && p != null) {
                                cru2 = cru3.a();
                                if (cru2.m14146g() != null) {
                                    p.m14919a(cct.m12254a(cru2.m14146g()));
                                }
                            }
                            this.f8862b.f8863a.f8865l.add(cru3);
                        }
                        this.f8862b.f8863a.f8866m.notifyDataSetChanged();
                        this.f8862b.f8863a.D().notifyDataSetChanged();
                    }
                }
            });
        }
    }

    public cdz(cco cco, GagPostListFragment gagPostListFragment, com com) {
        super(cco, gagPostListFragment, com);
    }

    /* renamed from: c */
    public void mo1684c() {
        super.mo1684c();
        this.f8864k.m12070d((Object) this);
        m12718I();
        new Handler().postDelayed(new C16881(this), 1000);
    }

    /* renamed from: e */
    public void mo1685e() {
        super.mo1685e();
        this.f8864k.m12076g((Object) this);
    }

    /* renamed from: a */
    protected void mo1683a(ccs ccs) {
        if (ccs.r() != 0) {
            super.mo1683a(ccs);
        }
    }

    /* renamed from: a */
    protected csb mo1681a(crw crw, cse cse) {
        csb cdy = new cdy(this.e, crw, cse, this.f8866m, this.f8867n, this.a);
        cdy.m12475a(this.d);
        return cdy;
    }

    /* renamed from: a */
    protected void mo1682a(SwipeRefreshLayout swipeRefreshLayout) {
        super.mo1682a(swipeRefreshLayout);
        this.f8867n.m12230a(swipeRefreshLayout);
    }

    /* renamed from: I */
    private void m12718I() {
        new Thread(new C16902(this)).start();
    }

    @dhg
    public void onApiCallback(ApiCallbackEvent apiCallbackEvent) {
        super.onApiCallback(apiCallbackEvent);
        if (apiCallbackEvent.f18303a.getIntExtra("command", -1) == 116) {
            m12718I();
        }
    }
}

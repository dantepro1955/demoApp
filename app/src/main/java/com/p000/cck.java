package com.p000;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import com.ninegag.android.app.component.postlist.GagPostListFragment;
import com.ninegag.android.app.otto.HomePostListTabActiveEvent;
import com.ninegag.android.app.otto.NewPostCountUpdatedEvent;
import com.ninegag.android.app.otto.SafeModeChangedEvent;
import com.ninegag.android.app.otto.actionbar.AbReloadClickedEvent;
import com.ninegag.android.app.otto.gagpostlist.GagPostItemActionEvent;
import com.ninegag.android.app.otto.gagpostlist.RemoteRefreshRequestEvent;

/* compiled from: GagPostListEventListener */
/* renamed from: cck */
public class cck extends cbz {
    /* renamed from: d */
    private csb f8697d;
    /* renamed from: e */
    private cco f8698e;
    /* renamed from: f */
    private ccs f8699f;

    public cck(String str, Fragment fragment, cco cco) {
        super(str, fragment);
        this.f8698e = cco;
    }

    /* renamed from: a */
    public void m12480a(csb csb) {
        this.f8697d = csb;
    }

    @dhg
    public void onGagPostItemAction(GagPostItemActionEvent gagPostItemActionEvent) {
        super.onGagPostItemAction(gagPostItemActionEvent);
        if (gagPostItemActionEvent.f18311b != null) {
            this.f8699f.m12335a(gagPostItemActionEvent.f18311b);
        }
    }

    /* renamed from: a */
    protected void mo1649a(cct cct) {
        super.mo1649a(cct);
        if (this.f8699f != null) {
            Fragment a = m12121a();
            if (a != null) {
                Context activity = a.getActivity();
                if (activity != null) {
                    this.f8699f.m12335a(cct);
                    this.f8699f.m12344i();
                    cqd cqd = new cqd(activity);
                    if (cct.m12288k()) {
                        cqd.c(cct.m12285h(), cct.m12282e());
                    } else if (cct.m12290m()) {
                        cqd.a(cct);
                    } else if (cct.m12292o()) {
                        diu diu = new diu();
                        diu.a(2, "TriggeredFrom", "PostList");
                        diu.a(3, "PostKey", cct.m12282e());
                        chn.m13381a("PostAction", "TapPostImage", cct.m12282e(), null, diu);
                        if (this.f8698e.f8733e != null && !this.f8698e.f8733e.isEmpty()) {
                            cqd.b(cct, this.f8698e.f8731c, this.f8698e.f8733e, this.f8699f.r());
                        } else if (this.f8698e.f8731c == 12) {
                            cqd.a(cct, this.f8698e.f8734f, this.f8699f.r(), 12);
                            crj.a("SearchSorting", "TapPostFromSearchResults", 0);
                        } else {
                            cqd.a(cct, this.f8698e.f8731c, this.f8698e.f8732d, this.f8699f.r());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    protected void mo1652d(cct cct) {
        super.mo1652d(cct);
    }

    /* renamed from: e */
    protected void mo1653e(cct cct) {
        super.mo1653e(cct);
    }

    /* renamed from: a */
    public void m12477a(ccs ccs) {
        this.f8699f = ccs;
    }

    /* renamed from: a */
    protected void mo1650a(cct cct, boolean z) {
        if (this.f8698e.f8731c == 12) {
            crj.a("SearchSorting", "TapPostFromSearchResults", 0);
        }
        this.f8699f.m12335a(cct);
        super.mo1650a(cct, z);
    }

    /* renamed from: f */
    protected void mo1663f(cct cct) {
        String a = cqz.a(cct);
        chn.m13394b("Post", "OffNSFW", cct.m12282e());
        chn.m13374a(this.f8698e.f8732d, this.f8698e.f8731c, a, 1);
        Activity activity = m12121a().getActivity();
        this.f8699f.m12335a(cct);
        if (activity != null) {
            cre.a(activity, cct, this.f8698e, this.f8699f.r());
        }
    }

    @dhg
    public void onTabActive(HomePostListTabActiveEvent homePostListTabActiveEvent) {
        Fragment a = m12121a();
        if (a != null && (a instanceof GagPostListFragment)) {
            GagPostListFragment gagPostListFragment = (GagPostListFragment) m12121a();
            if (gagPostListFragment.l() != null) {
                gagPostListFragment.l().setOnKeyListener(gagPostListFragment);
            }
        }
    }

    @dhg
    public void onSafeModeChanged(SafeModeChangedEvent safeModeChangedEvent) {
        if (this.f8697d != null) {
            this.f8697d.notifyDataSetChanged();
        }
    }

    @dhg
    public void onAbReloadClicked(AbReloadClickedEvent abReloadClickedEvent) {
        Fragment a = m12121a();
        if (a instanceof GagPostListFragment) {
            GagPostListFragment gagPostListFragment = (GagPostListFragment) a;
            gagPostListFragment.c();
            gagPostListFragment.b().m12522r().m12545a(false);
        }
    }

    @dhg
    public void onRemoteRefreshRequest(RemoteRefreshRequestEvent remoteRefreshRequestEvent) {
        Fragment b = m12122b();
        if (b instanceof GagPostListFragment) {
            ((GagPostListFragment) b).d();
        }
    }

    @dhg
    public void onNewPostCountUpdated(NewPostCountUpdatedEvent newPostCountUpdatedEvent) {
        Fragment a = m12121a();
        if (a instanceof GagPostListFragment) {
            ((GagPostListFragment) a).b().m12522r().m12545a(true);
        }
    }
}

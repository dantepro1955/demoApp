package com.p000;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0581a;
import android.support.v7.widget.RecyclerView.C0594k;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.share.widget.ShareDialog;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.HomePostListTabActiveEvent;
import com.ninegag.android.app.otto.NewPostCountUpdatedEvent;
import com.ninegag.android.app.otto.RequestGagPostsReloadEvent;
import com.ninegag.android.app.otto.SafeModeChangedEvent;
import com.ninegag.android.app.otto.actionbar.AbReloadClickedEvent;
import com.ninegag.android.app.otto.gagpostlist.GagPostCopyLinkEvent;
import com.ninegag.android.app.otto.gagpostlist.GagPostItemActionEvent;
import com.ninegag.android.app.otto.gagpostlist.GagPostSaveEvent;
import com.ninegag.android.app.otto.gagpostlist.RemoteRefreshRequestEvent;
import com.ninegag.android.app.otto.post.PostDeleteBeginEvent;
import com.ninegag.android.app.otto.post.PostDeleteEvent;
import com.ninegag.android.app.otto.post.PostReportBeginEvent;
import com.ninegag.android.app.otto.post.PostReportEvent;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import p000.caq.C1641a;
import p000.ccp.C1665b;
import p000.ccp.C1679c;
import p000.csq.C4558a;

/* compiled from: GagPostListPresenter */
/* renamed from: cfv */
public class cfv extends cap<C1717b> implements cso {
    /* renamed from: a */
    private cge f9101a;
    /* renamed from: b */
    private cst<cct> f9102b;
    /* renamed from: c */
    private cfo<cct> f9103c;
    /* renamed from: d */
    private cco f9104d;
    /* renamed from: e */
    private cqd f9105e;
    /* renamed from: f */
    private caf f9106f;
    /* renamed from: g */
    private Bundle f9107g;
    /* renamed from: h */
    private String f9108h;
    /* renamed from: i */
    private cgc f9109i;
    /* renamed from: j */
    private Timer f9110j;
    /* renamed from: k */
    private Handler f9111k = new Handler(Looper.getMainLooper());

    /* compiled from: GagPostListPresenter */
    /* renamed from: cfv$1 */
    class C17141 extends C0594k {
        /* renamed from: a */
        final /* synthetic */ cfv f9095a;

        C17141(cfv cfv) {
            this.f9095a = cfv;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (i2 != 0) {
                int findFirstVisibleItemPosition;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                if (findFirstCompletelyVisibleItemPosition < 0) {
                    findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                } else {
                    findFirstVisibleItemPosition = findFirstCompletelyVisibleItemPosition;
                }
                C0605t findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                if (findViewHolderForAdapterPosition instanceof C1665b) {
                    View view;
                    if (cip.m13967a().m14019x()) {
                        view = ((C1665b) findViewHolderForAdapterPosition).f8653m;
                        if (view != null) {
                            int[] iArr = new int[2];
                            view.getLocationOnScreen(iArr);
                            dhe.c("hint-tap-comment", new cbi(new Point(((view.getWidth() - ((C1717b) this.f9095a.m12157d()).getContext().getResources().getDimensionPixelSize(R.dimen.gesture_tap_size)) / 2) + iArr[0], iArr[1])));
                        }
                    }
                    if (cip.m13967a().m14021z()) {
                        view = ((C1665b) findViewHolderForAdapterPosition).f8651k;
                        if (view != null) {
                            int[] iArr2 = new int[2];
                            view.getLocationOnScreen(iArr2);
                            dhe.c("hint-tap-upvote", new cbi(new Point(((view.getWidth() - ((C1717b) this.f9095a.m12157d()).getContext().getResources().getDimensionPixelSize(R.dimen.gesture_tap_size)) / 2) + iArr2[0], iArr2[1])));
                        }
                    }
                }
            }
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            dhe.c("hint-scroll-postlist", new cbm(false));
            if (cip.m13967a().m14015t()) {
                cip.m13967a().m14016u();
                chn.m13445q("OnBoarding", "CompleteScrollPostlistTutorial");
            }
            switch (i) {
                case 0:
                    if (this.f9095a.m12157d() != null) {
                        ((C1717b) this.f9095a.m12157d()).m13012a(recyclerView);
                        return;
                    }
                    return;
                case 1:
                    if (this.f9095a.m12157d() != null) {
                        ((C1717b) this.f9095a.m12157d()).m13026b(recyclerView);
                        return;
                    }
                    return;
                case 2:
                    if (this.f9095a.m12157d() != null) {
                        ((C1717b) this.f9095a.m12157d()).m13033c(recyclerView);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: GagPostListPresenter */
    /* renamed from: cfv$2 */
    class C17152 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ cfv f9096a;
        /* renamed from: b */
        private float f9097b;
        /* renamed from: c */
        private int f9098c = 30;
        /* renamed from: d */
        private int f9099d = 3;

        C17152(cfv cfv) {
            this.f9096a = cfv;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f9096a.m12157d() != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked == 2) {
                        float y = motionEvent.getY();
                        if (this.f9097b != -1.0f) {
                            if (y > this.f9097b + ((float) this.f9098c)) {
                                ((C1717b) this.f9096a.m12157d()).m13022a(true);
                            } else if (y < this.f9097b - ((float) this.f9099d)) {
                                ((C1717b) this.f9096a.m12157d()).m13022a(false);
                            }
                        }
                        this.f9097b = y;
                    } else if (actionMasked == 1) {
                        this.f9097b = -1.0f;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: GagPostListPresenter */
    /* renamed from: cfv$a */
    static class C1716a extends TimerTask {
        /* renamed from: a */
        private WeakReference<cfv> f9100a;

        public C1716a(cfv cfv) {
            this.f9100a = new WeakReference(cfv);
        }

        public void run() {
            if (this.f9100a.get() != null) {
                ((cfv) this.f9100a.get()).m13055h();
            }
        }
    }

    /* compiled from: GagPostListPresenter */
    /* renamed from: cfv$b */
    public interface C1717b extends C1641a {
        /* renamed from: a */
        void m13011a(int i);

        /* renamed from: a */
        void m13012a(RecyclerView recyclerView);

        /* renamed from: a */
        void m13013a(cct cct);

        /* renamed from: a */
        void m13014a(cct cct, cco cco, int i);

        /* renamed from: a */
        void m13015a(cct cct, boolean z);

        /* renamed from: a */
        void m13016a(csq csq);

        /* renamed from: a */
        void m13017a(String str);

        /* renamed from: a */
        void m13018a(String str, String str2);

        /* renamed from: a */
        void m13019a(String str, String str2, String str3);

        /* renamed from: a */
        void m13020a(String str, String str2, String str3, boolean z, boolean z2, String str4, int i);

        /* renamed from: a */
        void m13021a(String str, String str2, boolean z, String str3);

        /* renamed from: a */
        void m13022a(boolean z);

        /* renamed from: a */
        void m13023a(boolean z, cct cct);

        /* renamed from: a */
        void m13024a(boolean z, cct cct, String str, int i);

        /* renamed from: b */
        csz m13025b();

        /* renamed from: b */
        void m13026b(RecyclerView recyclerView);

        /* renamed from: b */
        void m13027b(cct cct);

        /* renamed from: b */
        void m13028b(cct cct, boolean z);

        /* renamed from: b */
        void m13029b(String str);

        /* renamed from: b */
        void m13030b(String str, String str2);

        /* renamed from: b */
        void m13031b(boolean z, cct cct);

        /* renamed from: c */
        void m13032c();

        /* renamed from: c */
        void m13033c(RecyclerView recyclerView);

        /* renamed from: c */
        void m13034c(String str);

        /* renamed from: d */
        void m13035d();

        /* renamed from: e */
        void m13036e();

        /* renamed from: f */
        int m13037f();
    }

    /* renamed from: e */
    public cge m13061e() {
        return this.f9101a;
    }

    /* renamed from: f */
    public ccp m13062f() {
        return ((cfr) this.f9102b).m12997a();
    }

    public cfv(Bundle bundle, cco cco, String str, int i, cge cge, cqd cqd, caf caf, cgc cgc, cfr cfr) {
        this.f9104d = cco;
        this.f9108h = str;
        this.f9107g = bundle;
        this.f9105e = cqd;
        this.f9101a = cge;
        this.f9101a.m13093c(i);
        this.f9106f = caf;
        this.f9109i = cgc;
        this.f9102b = cfr;
        this.f9103c = m13038a(this.f9102b, this.f9101a, bundle);
    }

    /* renamed from: a */
    private cfo<cct> m13038a(cst<cct> cst, cge cge, Bundle bundle) {
        return new cgd(cst, cge, bundle);
    }

    /* renamed from: b */
    public void mo1715b() {
        super.mo1715b();
        ((cfr) this.f9102b).m13000b();
        dhe.a(this.f9104d.f8730b, this);
        dhe.a(cql.class.getName(), this);
        if (this.f9104d.f8731c == 1 || this.f9104d.f8731c == 9 || this.f9104d.f8731c == 15 || this.f9104d.f8731c == 2) {
            this.f9110j = new Timer("new-post-count-timer");
            this.f9110j.scheduleAtFixedRate(new C1716a(this), 1000, cae.f8436f);
        }
    }

    /* renamed from: c */
    public void mo1716c() {
        super.mo1716c();
        if (this.f9110j != null) {
            this.f9110j.cancel();
            this.f9110j = null;
        }
        dhe.b(this.f9104d.f8730b, this);
        dhe.b(cql.class.getName(), this);
    }

    /* renamed from: a */
    public void m13058a(C1717b c1717b) {
        super.mo1714a(c1717b);
        this.f9101a.a(this.f9103c);
        this.f9103c.mo1719a(c1717b.m13025b());
        c1717b.m13016a(m13039a(c1717b, this.f9107g));
        this.f9101a.m12586d().b(cfw.m13064a(c1717b));
        this.f9101a.m12579a();
    }

    /* renamed from: a */
    private csq m13039a(C1717b c1717b, Bundle bundle) {
        Context context = c1717b.getContext();
        C0581a csv = new csv();
        csv.a(cfq.m12994a(context, 2));
        csv.a(this.f9102b);
        csv.a(new csu());
        return C4558a.a().a(csv).a(new C17152(this)).a(new C17141(this)).a(new int[]{R.color.post_progress_bar_color}).a(context.getResources().getDimensionPixelSize(R.dimen.swipe_refresh_layout_offset)).a(cfx.m13065a(this)).a(new LinearLayoutManager(context)).a(new cfp(this, 4)).a(0, bundle.getInt("top_padding_height", 0), 0, bundle.getInt("bottom_padding_height", 0)).b();
    }

    @dhg
    public void onGagPostCopyLink(GagPostCopyLinkEvent gagPostCopyLinkEvent) {
        if (m12157d() != null) {
            ((C1717b) m12157d()).m13013a(gagPostCopyLinkEvent.f18309a);
        }
    }

    @dhg
    public void onGagPostSave(GagPostSaveEvent gagPostSaveEvent) {
        if (m12157d() != null) {
            ((C1717b) m12157d()).m13027b(gagPostSaveEvent.f18313a);
        }
    }

    @dhg
    public void onPostDeleteBeginEvent(PostDeleteBeginEvent postDeleteBeginEvent) {
        if (m12157d() != null) {
            ((C1717b) m12157d()).m13030b(this.f9108h, postDeleteBeginEvent.f18328a);
        }
    }

    @dhg
    public void onPostReportBegin(PostReportBeginEvent postReportBeginEvent) {
        cag x = this.f9106f.m12094x();
        if (m12157d() == null) {
            return;
        }
        if (x.m12104c()) {
            ((C1717b) m12157d()).m13018a(this.f9108h, postReportBeginEvent.f18330a);
        } else {
            ((C1717b) m12157d()).m13034c(postReportBeginEvent.f18330a);
        }
    }

    @dhg
    public void onReportPost(PostReportEvent postReportEvent) {
        if (m12157d() != null) {
            String str = postReportEvent.f18331a;
            this.f9106f.m12079i().m13558b(str, postReportEvent.f18332b, "l", true, -1);
            ((C1717b) m12157d()).m13035d();
            ((C1717b) m12157d()).m13029b(str);
            m13047a(str);
        }
    }

    @dhg
    public void onTopCommentReady(C1679c c1679c) {
        this.f9111k.post(cfy.m13067a(this, c1679c));
    }

    /* renamed from: a */
    static /* synthetic */ void m13044a(cfv cfv, C1679c c1679c) {
        if (cfv.f9102b != null) {
            cfv.f9102b.notifyItemChanged(c1679c.f8745b);
        }
    }

    /* renamed from: a */
    private boolean m13047a(String str) {
        for (int i = 0; i < this.f9102b.c().size(); i++) {
            if (str.equals(((cct) this.f9102b.b(i)).m12282e())) {
                this.f9102b.a(i);
                ((cfr) this.f9102b).m13000b();
                return true;
            }
        }
        return false;
    }

    @dhg
    public void onDeletePost(PostDeleteEvent postDeleteEvent) {
        if (m12157d() != null) {
            String str = postDeleteEvent.f18329a;
            ((C1717b) m12157d()).m13017a(str);
            m13047a(str);
        }
    }

    /* renamed from: a */
    public void mo1713a() {
        super.mo1713a();
        this.f9103c.mo1718a();
        this.f9101a.m12587e();
        this.f9101a.m13099k();
    }

    /* renamed from: g */
    public void m13063g() {
        if (m12157d() != null) {
            int f = ((C1717b) m12157d()).m13037f();
            if (f != 0 && f != 6 && f != 7 && this.f9101a.m12585c()) {
                this.f9101a.m12583b();
            }
        }
    }

    @dhg
    public void onRequestGagPostsReload(RequestGagPostsReloadEvent requestGagPostsReloadEvent) {
        cql.m20829a(this.f9104d.f8729a).a(cqt.a()).a(cfz.m13068a(this), cga.m13069a());
    }

    /* renamed from: b */
    private void m13050b(String str) {
        if (this.f9101a != null) {
            int i = 0;
            while (i < this.f9101a.size()) {
                if (this.f9101a.get(i) == null || !str.equals(((cct) this.f9101a.get(i)).m12282e())) {
                    i++;
                } else {
                    this.f9101a.m13091b(i);
                    return;
                }
            }
            this.f9101a.m13091b(-1);
        }
    }

    @dhg
    public void onTabActive(HomePostListTabActiveEvent homePostListTabActiveEvent) {
        if (m12157d() != null) {
            ((C1717b) m12157d()).m13032c();
        }
    }

    @dhg
    public void onSafeModeChanged(SafeModeChangedEvent safeModeChangedEvent) {
        if (m12157d() != null) {
            ((cfr) this.f9102b).m13000b();
        }
    }

    @dhg
    public synchronized void onAbReloadClicked(AbReloadClickedEvent abReloadClickedEvent) {
        if (!(m12157d() == null || this.f9101a == null)) {
            int f = ((C1717b) m12157d()).m13037f();
            if (!(f == 0 || f == 6 || f == 7)) {
                this.f9101a.m12582a(this.f9109i);
                ((C1717b) m12157d()).m13011a(0);
                ((C1717b) m12157d()).m13022a(false);
            }
        }
    }

    @dhg
    public void onRemoteRefreshRequest(RemoteRefreshRequestEvent remoteRefreshRequestEvent) {
        if (m12157d() != null && this.f9101a != null) {
            int f = ((C1717b) m12157d()).m13037f();
            if (f != 0 && f != 6 && f != 7) {
                this.f9101a.m12582a(this.f9109i);
                ((C1717b) m12157d()).m13011a(0);
            }
        }
    }

    @dhg
    public void onGagPostItemAction(GagPostItemActionEvent gagPostItemActionEvent) {
        if (gagPostItemActionEvent.f18311b != null && m12157d() != null) {
            m13050b(gagPostItemActionEvent.f18311b.m12282e());
            if (this.f9101a.m13101m() == null) {
                ((C1717b) m12157d()).m13036e();
                ((cfr) this.f9102b).m13000b();
                return;
            }
            switch (gagPostItemActionEvent.f18310a) {
                case 1:
                    m13051c(gagPostItemActionEvent.f18311b);
                    return;
                case 2:
                    m13041a(gagPostItemActionEvent.f18311b, false);
                    return;
                case 3:
                    m13052d(gagPostItemActionEvent.f18311b);
                    return;
                case 4:
                    m13054f(gagPostItemActionEvent.f18311b);
                    return;
                case 5:
                    m13053e(gagPostItemActionEvent.f18311b);
                    return;
                case 6:
                case 7:
                case 8:
                    return;
                case 9:
                    m13048b(gagPostItemActionEvent.f18311b);
                    return;
                case 10:
                    m13040a(gagPostItemActionEvent.f18311b);
                    return;
                case 11:
                    m13041a(gagPostItemActionEvent.f18311b, true);
                    return;
                default:
                    return;
            }
        }
    }

    @dhg
    public void onNewPostCountUpdated(NewPostCountUpdatedEvent newPostCountUpdatedEvent) {
        if (m12157d() != null) {
            ((C1717b) m12157d()).m13022a(true);
        }
    }

    /* renamed from: a */
    private void m13040a(cct cct) {
        int l = this.f9101a.m13100l();
        if (m12157d() != null) {
            ((C1717b) m12157d()).m13014a(cct, this.f9104d, l);
        }
    }

    /* renamed from: b */
    private void m13048b(cct cct) {
        if (m12157d() != null) {
            ((C1717b) m12157d()).m13021a(this.f9104d.f8730b, cct.m12282e(), cct.m12286i(), "more-action");
        }
    }

    /* renamed from: c */
    private void m13051c(cct cct) {
        int l = this.f9101a.m13100l();
        this.f9101a.m13097i();
        if (cct.m12288k()) {
            this.f9105e.c(cct.m12285h(), cct.m12282e());
        } else if (cct.m12292o()) {
            if (this.f9104d.f8733e != null && !this.f9104d.f8733e.isEmpty()) {
                this.f9105e.b(cct, this.f9104d.f8731c, this.f9104d.f8733e, l);
            } else if (this.f9104d.f8731c == 12) {
                this.f9105e.a(cct, this.f9104d.f8734f, l, 12);
            } else if (this.f9104d.f8731c == 16) {
                this.f9105e.a(cct, this.f9104d.f8734f, l, 16);
            } else {
                this.f9105e.a(cct, this.f9104d.f8731c, this.f9104d.f8732d, l);
            }
        } else if (cct.m12290m()) {
            this.f9105e.a(cct);
        }
    }

    /* renamed from: d */
    private void m13052d(cct cct) {
        String e = cct.m12282e();
        if (!m13046a((CharSequence) e) && m12157d() != null) {
            ((C1717b) m12157d()).m13019a(this.f9104d.f8730b, e, ShareDialog.WEB_SHARE_DIALOG);
        }
    }

    /* renamed from: a */
    private boolean m13046a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m13041a(cct cct, boolean z) {
        String e = cct.m12282e();
        this.f9106f.m12055a(e, cct);
        if (m12157d() != null) {
            ((C1717b) m12157d()).m13020a(e, "comment-system", null, z, false, this.f9104d.f8732d, this.f9104d.f8731c);
        }
    }

    /* renamed from: e */
    private void m13053e(cct cct) {
        if (m12157d() != null) {
            boolean L = cct.m12268L();
            ((C1717b) m12157d()).m13015a(cct, L);
            if (this.f9106f.m12094x().m12104c()) {
                ((C1717b) m12157d()).m13031b(L, cct);
            } else {
                ((C1717b) m12157d()).m13024a(L, cct, "l", -1);
            }
        }
    }

    /* renamed from: f */
    private void m13054f(cct cct) {
        if (m12157d() != null) {
            boolean K = cct.m12267K();
            ((C1717b) m12157d()).m13028b(cct, K);
            if (this.f9106f.m12094x().m12104c()) {
                ((C1717b) m12157d()).m13023a(K, cct);
            } else {
                ((C1717b) m12157d()).m13024a(K, cct, "l", 1);
            }
        }
    }

    /* renamed from: h */
    private void m13055h() {
        if ((this.f9104d.f8731c == 1 || this.f9104d.f8731c == 9 || this.f9104d.f8731c == 15 || this.f9104d.f8731c == 2) && cqw.a() - this.f9106f.m12077h().m13996d(this.f9104d.m12563b()) > cae.f8436f - 200) {
            if (!this.f9106f.m12094x().m12102a()) {
                chr.m13522a().m13543a(this.f9106f.m12068d().m12028g(), -1);
            }
            this.f9106f.m12077h().m13983a(this.f9104d.m12563b(), cqw.a());
            this.f9106f.m12079i().m13541a(this.f9104d.f8730b, this.f9104d.f8731c, this.f9104d.f8732d, -1);
        }
    }
}

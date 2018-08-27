package com.p000;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import com.ninegag.android.app.R;
import p000.cqk.C4529a;

/* compiled from: GagPostListFragmentScrollController */
/* renamed from: ccm */
public class ccm extends ccg {
    /* renamed from: b */
    private static caf f8719b = caf.m12046a();
    /* renamed from: c */
    private Handler f8720c;
    /* renamed from: d */
    private Handler f8721d;
    /* renamed from: e */
    private HandlerThread f8722e;

    /* compiled from: GagPostListFragmentScrollController */
    /* renamed from: ccm$1 */
    class C16711 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ccm f8718a;

        C16711(ccm ccm) {
            this.f8718a = ccm;
        }

        public void run() {
            this.f8718a.m12543i();
        }
    }

    public ccm(String str, ccl ccl) {
        super(str, ccl);
    }

    /* renamed from: b */
    public void m12533b() {
        this.f8722e = new HandlerThread("preload-handler-thread");
        this.f8720c = new Handler(Looper.getMainLooper());
        this.f8722e.start();
        this.f8721d = new Handler(this.f8722e.getLooper());
    }

    /* renamed from: c */
    public void m12536c() {
        if (this.f8722e != null) {
            this.f8722e.quit();
        }
        this.f8721d = null;
        this.f8720c = null;
        this.f8722e = null;
    }

    /* renamed from: d */
    public void m12538d() {
        m12469a().m12522r().m12545a(false);
    }

    /* renamed from: e */
    public void m12539e() {
        m12469a().m12522r().m12545a(true);
    }

    /* renamed from: a */
    public void m12530a(RecyclerView recyclerView, int i) {
        m12529a(recyclerView);
    }

    /* renamed from: b */
    public void m12534b(RecyclerView recyclerView, int i) {
    }

    /* renamed from: c */
    public void m12537c(RecyclerView recyclerView, int i) {
        m12529a(recyclerView);
        m12543i();
    }

    /* renamed from: a */
    public boolean m12532a(int i, KeyEvent keyEvent) {
        if (m12469a() == null) {
            return false;
        }
        if (i != 24 && i != 25) {
            return false;
        }
        m12469a().m12506c(m12469a().G(), 0);
        if (this.f8720c != null) {
            this.f8720c.postDelayed(new C16711(this), 500);
        }
        return true;
    }

    /* renamed from: b */
    public boolean m12535b(int i, KeyEvent keyEvent) {
        if (m12469a() == null) {
            return false;
        }
        LinearLayoutManager B = m12469a().B();
        int dimensionPixelOffset = f8719b.f8449a.getResources().getDimensionPixelOffset(R.dimen.appBarSize);
        if (B == null) {
            return false;
        }
        int findFirstVisibleItemPosition = B.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0) {
            findFirstVisibleItemPosition = 0;
        }
        if (i == 24) {
            if (findFirstVisibleItemPosition > 0) {
                B.scrollToPositionWithOffset(findFirstVisibleItemPosition - 1, -dimensionPixelOffset);
            } else {
                B.scrollToPositionWithOffset(0, -dimensionPixelOffset);
            }
            m12469a().m12492a(m12469a().G(), 1);
            return true;
        } else if (i != 25) {
            return false;
        } else {
            if (m12469a().m12519o().b(findFirstVisibleItemPosition) < m12469a().m12518n().size()) {
                B.scrollToPositionWithOffset(findFirstVisibleItemPosition + 1, -dimensionPixelOffset);
            }
            m12469a().m12492a(m12469a().G(), 1);
            m12469a().m12514j();
            return true;
        }
    }

    /* renamed from: f */
    public void m12540f() {
        int i = 10000;
        int a = djy.a(f8719b.f8449a);
        if (m12469a().B() == null) {
            chn.m13372a("LayoutManager=null");
            return;
        }
        int i2;
        cct cct;
        String str;
        int top;
        int height;
        int findFirstVisibleItemPosition = m12469a().B().findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition != 0 || m12469a().B().getChildCount() <= 0) {
            i2 = findFirstVisibleItemPosition;
        } else {
            i2 = 1;
        }
        int max = Math.max(m12469a().m12519o().b(i2), 0);
        if (max < 0 || max >= m12469a().m12518n().size()) {
            cct = null;
            str = null;
        } else {
            cct = (cct) m12469a().m12518n().get(max);
            str = cct.m12282e();
        }
        View childAt = m12469a().B().getChildAt(m12469a().m12519o().a(max) - i2);
        if (childAt != null) {
            top = childAt.getTop();
            height = childAt.getHeight();
            childAt = childAt.findViewById(R.id.image);
            if (childAt != null) {
                height = childAt.getHeight();
            }
        } else {
            height = 0;
            top = 0;
        }
        if (cct == null || height <= 0) {
            i = 0;
        } else {
            height = 0 / height;
            if (height < -10000) {
                height = -10000;
            }
            if (height <= 10000) {
                i = height;
            }
        }
        cco q = m12469a().m12521q();
        height = q.f8731c;
        String str2 = q.f8732d;
        if (m12469a().m12518n().r() - max != 1) {
            m12469a().m12518n().d(max);
        }
        if (cct == null) {
            chn.m13372a("visiblePos=" + i2 + " pos=" + max + " size=" + m12469a().m12518n().size() + " list=" + str2 + "-" + height + " lastSaved=" + f8719b.m12077h().m13988b(height, str2));
            return;
        }
        f8719b.m12077h().m13981a(height, str2, str, a, top, i);
        f8719b.m12077h().m13904j(cqw.a());
        chn.m13382a("saveListState", chn.m13363a("currentPostId", str, "orientation", Integer.valueOf(a), "viewTop", Integer.valueOf(top), "offsetPercent", Integer.valueOf(i)));
    }

    /* renamed from: g */
    public int m12541g() {
        int a;
        ccs n = m12469a().m12518n();
        cco q = m12469a().m12521q();
        String b = f8719b.m12077h().m13988b(q.f8731c, q.f8732d);
        int i = 0;
        while (i < n.size()) {
            if (b != null && b.equals(((cct) n.get(i)).m12282e())) {
                a = m12469a().m12519o().a(i);
                break;
            }
            i++;
        }
        a = -1;
        if (a != -1) {
            chn.m13382a("restoreScrollOffset", chn.m13363a("currentPostId", b, "currOrientation", Integer.valueOf(djy.a(f8719b.f8449a)), "lastOrientation", Integer.valueOf(f8719b.m12077h().m13991c(q.f8731c, q.f8732d)), "viewTop", Integer.valueOf(f8719b.m12077h().m13995d(q.f8731c, q.f8732d)), "offsetPercent", Integer.valueOf(f8719b.m12077h().m13998e(q.f8731c, q.f8732d)), "selectionPos", Integer.valueOf(a)));
            if (djy.a(f8719b.f8449a) != f8719b.m12077h().m13991c(q.f8731c, q.f8732d)) {
                float dimension = f8719b.f8449a.getResources().getDimension(R.dimen.approx_post_hedaer_height);
                a = m12469a().m12519o().a(a);
                i = (int) ((((float) r8) / 10000.0f) - dimension);
                if (m12469a().B() != null) {
                    m12469a().B().scrollToPositionWithOffset(a, i);
                    return 2;
                }
                chn.m13366a(204, "Approx. LayoutManager=null");
                return 204;
            } else if (m12469a().B() != null) {
                m12469a().B().scrollToPositionWithOffset(a, r7 - f8719b.f8449a.getResources().getDimensionPixelOffset(R.dimen.appBarSize));
                return 1;
            } else {
                chn.m13366a(204, "LayoutManager=null");
                return 204;
            }
        } else if (m12469a().B() != null) {
            m12469a().B().scrollToPosition(0);
            return 101;
        } else {
            chn.m13366a(204, "selectedPos=-1, LayoutManager=null, postId=" + b);
            return 204;
        }
    }

    /* renamed from: a */
    void m12529a(RecyclerView recyclerView) {
        if (m12469a() != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int childCount = linearLayoutManager.getChildCount();
            for (int i = 0; i < childCount + 3; i++) {
                int b = m12469a().m12519o().b(findFirstVisibleItemPosition + i);
                if (b >= 0 && b < m12469a().m12518n().size()) {
                    cct cct = (cct) m12469a().m12518n().get(b);
                    if (this.f8721d != null) {
                        this.f8721d.post(C4529a.a(cct));
                    }
                    m12531a(cct);
                }
            }
        }
    }

    /* renamed from: h */
    public void m12542h() {
        if (m12469a() != null) {
            LinearLayoutManager B = m12469a().B();
            if (B != null) {
                int findFirstVisibleItemPosition = B.findFirstVisibleItemPosition();
                int childCount = B.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    int b = m12469a().m12519o().b(findFirstVisibleItemPosition + i);
                    if (b >= 0 && b < m12469a().m12518n().size()) {
                        cct cct = (cct) m12469a().m12518n().get(b);
                        if (cct.m12287j() && !(cct.m12265I() && f8719b.m12075g().m13732h())) {
                            m12469a().m12517m().m12424c(B.getChildAt(i));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public void m12543i() {
        View view = null;
        Object obj = null;
        if (m12469a() != null) {
            if ((f8719b.m12077h().an() || f8719b.m12077h().ax()) && VERSION.SDK_INT >= 14) {
                LinearLayoutManager B = m12469a().B();
                if (B != null) {
                    int findFirstVisibleItemPosition = B.findFirstVisibleItemPosition();
                    int childCount = B.getChildCount();
                    int i = f8719b.m12068d().f8406c / 2;
                    int i2 = 0;
                    cct cct = null;
                    while (i2 < childCount) {
                        View view2;
                        cct cct2;
                        View view3;
                        int b = m12469a().m12519o().b(findFirstVisibleItemPosition + i2);
                        if (b < 0) {
                            view2 = view;
                            cct2 = cct;
                            view3 = view2;
                        } else if (b >= m12469a().m12518n().size()) {
                            view2 = view;
                            cct2 = cct;
                            view3 = view2;
                        } else {
                            cct = (cct) m12469a().m12518n().get(b);
                            if (cct.m12265I() && f8719b.m12075g().m13732h()) {
                                view2 = view;
                                cct2 = cct;
                                view3 = view2;
                            } else if (!cct.m12287j()) {
                                view2 = view;
                                cct2 = cct;
                                view3 = view2;
                            } else if (cct.m12291n() && !f8719b.m12077h().ax()) {
                                view2 = view;
                                cct2 = cct;
                                view3 = view2;
                            } else if (!cct.m12287j() || f8719b.m12077h().an()) {
                                view = B.getChildAt(i2);
                                b = view.getTop();
                                int bottom = view.getBottom();
                                if (b <= i && bottom >= i) {
                                    obj = 1;
                                    break;
                                }
                                m12469a().m12517m().m12424c(view);
                                view2 = view;
                                cct2 = cct;
                                view3 = view2;
                            } else {
                                view2 = view;
                                cct2 = cct;
                                view3 = view2;
                            }
                        }
                        i2++;
                        view2 = view3;
                        cct = cct2;
                        view = view2;
                    }
                    if (obj == null) {
                        return;
                    }
                    if (cct.m12291n() && f8719b.m12077h().ax()) {
                        m12469a().m12517m().m12421b(view);
                    } else if (cct.m12287j() && f8719b.m12077h().an()) {
                        m12469a().m12517m().m12413a(view);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m12531a(cct cct) {
        if (m12469a() != null) {
            cnv p = m12469a().m12520p();
            if (p != null) {
                p.m14919a(cct);
            }
        }
    }
}

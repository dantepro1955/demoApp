package com.p000;

import android.support.v4.app.Fragment;
import com.ninegag.android.app.R;
import com.ninegag.android.app.component.postlist.GagPostListFragment;
import com.ninegag.android.app.component.postlist2.GagPostListFragmentV2;
import com.ninegag.android.app.otto.post.PostDeleteEvent;
import com.ninegag.android.app.otto.post.PostReportBeginEvent;
import com.ninegag.android.app.otto.post.PostReportEvent;
import com.ninegag.android.app.ui.BaseActivity;
import com.ninegag.android.app.ui.BaseNavActivity;

/* compiled from: GagPostReportEventListener */
/* renamed from: cex */
public class cex extends cbx {
    public cex(String str, Fragment fragment) {
        super(str, fragment);
    }

    /* renamed from: a */
    protected void m12918a(String str, int i) {
        Fragment b = m12122b();
        BaseNavActivity baseNavActivity;
        if (b instanceof GagPostListFragment) {
            baseNavActivity = (BaseNavActivity) b.getActivity();
            if (baseNavActivity != null) {
                c.m12079i().m13558b(str, i, "l", true, -1);
                baseNavActivity.showToast(baseNavActivity.getString(R.string.post_reported));
                ((GagPostListFragment) b).a(str);
                chn.m13400c("Post", "Report", str);
            }
        } else if (b instanceof GagPostListFragmentV2) {
            baseNavActivity = (BaseNavActivity) b.getActivity();
            if (baseNavActivity != null) {
                c.m12079i().m13558b(str, i, "l", true, -1);
                baseNavActivity.showToast(baseNavActivity.getString(R.string.post_reported));
                ((GagPostListFragmentV2) b).a(str);
                diu diu = new diu();
                diu.a(2, "TriggeredFrom", "PostList");
                diu.a(3, "PostKey", str);
                chn.m13381a("PostAction", "ReportPost", str, null, diu);
            }
        }
    }

    @dhg
    public void onPostReportBegin(PostReportBeginEvent postReportBeginEvent) {
        Fragment a = m12121a();
        if (a != null) {
            BaseNavActivity baseNavActivity = (BaseNavActivity) a.getActivity();
            if (baseNavActivity == null) {
                return;
            }
            if (caf.m12046a().m12094x().m12104c()) {
                baseNavActivity.getDialogHelper().m14929a(this.a, postReportBeginEvent.f18330a);
            } else {
                cre.a(baseNavActivity, postReportBeginEvent.f18330a);
            }
        }
    }

    @dhg
    public void onReportPost(PostReportEvent postReportEvent) {
        m12918a(postReportEvent.f18331a, postReportEvent.f18332b);
    }

    @dhg
    public void onDeletePost(PostDeleteEvent postDeleteEvent) {
        String str = postDeleteEvent.f18329a;
        diu diu = new diu();
        diu.a(2, "TriggeredFrom", "PostList");
        diu.a(3, "PostKey", str);
        chn.m13381a("PostAction", "DeletePost", str, null, diu);
        if (m12121a() != null && m12121a().getActivity() != null) {
            cqg.a(m12121a().getActivity(), str, ((BaseActivity) m12121a().getActivity()).getPRM(), null);
            Fragment b = m12122b();
            if (b instanceof GagPostListFragment) {
                ((GagPostListFragment) b).a(str);
            } else if (b instanceof GagPostListFragmentV2) {
                ((GagPostListFragmentV2) b).a(str);
            }
        }
    }
}

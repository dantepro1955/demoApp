package com.p000;

import android.support.v4.app.Fragment;
import com.facebook.share.widget.ShareDialog;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.gagpostlist.GagPostCopyLinkEvent;
import com.ninegag.android.app.otto.gagpostlist.GagPostItemActionEvent;
import com.ninegag.android.app.otto.post.PostReportBeginEvent;
import com.ninegag.android.app.otto.post.PostReportEvent;
import com.ninegag.android.app.ui.BaseActivity;

/* compiled from: GagIABEventListener */
/* renamed from: caj */
public class caj extends cbx {
    public caj(String str, Fragment fragment) {
        super(str, fragment);
    }

    /* renamed from: c */
    private BaseActivity m12125c() {
        if (m12121a() == null) {
            return null;
        }
        return (BaseActivity) m12121a().getActivity();
    }

    /* renamed from: a */
    private void m12123a(BaseActivity baseActivity, cct cct) {
        chn.m13394b("InAppBrowser", "ViewComment", cct.m12282e());
        baseActivity.getNavHelper().a(cct.m12282e(), "comment-system", false, false);
    }

    /* renamed from: b */
    private void m12124b(BaseActivity baseActivity, cct cct) {
        chn.m13394b("InAppBrowser", "More", cct.m12282e());
        if (baseActivity != null) {
            baseActivity.getDialogHelper().m14931a(this.a, cct.m12282e(), cct.m12286i(), "more-action");
        }
    }

    /* renamed from: c */
    private void m12126c(BaseActivity baseActivity, cct cct) {
        chn.m13394b("Overlay", "SmartShare", cct.m12282e());
        if (baseActivity != null) {
            baseActivity.getDialogHelper().m14930a(this.a, cct.m12282e(), ShareDialog.WEB_SHARE_DIALOG);
        }
    }

    @dhg
    public void onGagPostItemActionEvent(GagPostItemActionEvent gagPostItemActionEvent) {
        if (m12121a() != null && m12121a().getActivity() != null) {
            BaseActivity baseActivity = (BaseActivity) m12121a().getActivity();
            switch (gagPostItemActionEvent.f18310a) {
                case 2:
                    m12123a(baseActivity, gagPostItemActionEvent.f18311b);
                    return;
                case 3:
                    m12126c(baseActivity, gagPostItemActionEvent.f18311b);
                    return;
                case 8:
                    return;
                case 9:
                    m12124b(baseActivity, gagPostItemActionEvent.f18311b);
                    return;
                default:
                    return;
            }
        }
    }

    @dhg
    public void onGagPostCopyLink(GagPostCopyLinkEvent gagPostCopyLinkEvent) {
        if (m12125c() != null) {
            cct cct = gagPostCopyLinkEvent.f18309a;
            chn.m13394b("InAppBrowser", "SmartShare", cct.m12282e());
            cqg.a(m12125c(), cct);
        }
    }

    @dhg
    public void onPostReportBegin(PostReportBeginEvent postReportBeginEvent) {
        if (m12125c() != null) {
            if (caf.m12046a().m12094x().m12104c()) {
                m12125c().getDialogHelper().m14929a(this.a, postReportBeginEvent.f18330a);
            } else {
                cre.a(m12125c(), postReportBeginEvent.f18330a);
            }
        }
    }

    @dhg
    public void onReportPost(PostReportEvent postReportEvent) {
        if (m12125c() != null) {
            chn.m13400c("InAppBrowser", "Report", postReportEvent.f18331a);
            c.m12079i().m13558b(postReportEvent.f18331a, postReportEvent.f18332b, "l", true, -1);
            m12125c().showToast(m12125c().getString(R.string.post_reported));
        }
    }
}

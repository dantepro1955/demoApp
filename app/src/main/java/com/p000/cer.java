package com.p000;

import com.facebook.share.widget.ShareDialog;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.gagpostlist.GagPostCopyLinkEvent;
import com.ninegag.android.app.otto.gagpostlist.GagPostItemActionEvent;
import com.ninegag.android.app.otto.gagpostlist.GagPostSaveEvent;
import com.ninegag.android.app.otto.overlay.ClickedAlbumEvent;
import com.ninegag.android.app.otto.overlay.ClickedVideoEvent;
import com.ninegag.android.app.otto.overlay.FinishOverlayEvent;
import com.ninegag.android.app.otto.overlay.ShowTitleEvent;
import com.ninegag.android.app.otto.post.PostDeleteBeginEvent;
import com.ninegag.android.app.otto.post.PostDeleteEvent;
import com.ninegag.android.app.otto.post.PostReportBeginEvent;
import com.ninegag.android.app.otto.post.PostReportEvent;
import com.ninegag.android.app.ui.BaseActivity;

/* compiled from: OverlayEventControllerV2 */
/* renamed from: cer */
public class cer extends ceq {
    /* renamed from: b */
    private cco f8943b;

    public cer(cco cco) {
        this.f8943b = cco;
    }

    /* renamed from: a */
    private void m12838a(BaseActivity baseActivity, cct cct) {
        chn.m13394b("Overlay", "ViewComment", cct.m12282e());
        baseActivity.getNavHelper().a(cct.m12282e(), "comment-system", false, false);
    }

    /* renamed from: a */
    private void m12839a(BaseActivity baseActivity, cct cct, String str) {
        this.a.m12055a(cct.m12282e(), cct);
        chn.m13400c("Overlay", "ViewBulletComment", cct.m12282e());
        baseActivity.getNavHelper().a(cct.m12282e(), "comment-system", str, false, false);
    }

    /* renamed from: b */
    private void m12840b(BaseActivity baseActivity, cct cct) {
        chn.m13394b("Overlay", "More", cct.m12282e());
        if (baseActivity != null) {
            baseActivity.getDialogHelper().m14931a(this.f8943b.f8730b, cct.m12282e(), cct.m12286i(), "more-action");
        }
    }

    /* renamed from: c */
    private void m12841c(BaseActivity baseActivity, cct cct) {
        chn.m13394b("Overlay", "SmartShare", cct.m12282e());
        if (baseActivity != null) {
            baseActivity.getDialogHelper().m14930a(this.f8943b.f8730b, cct.m12282e(), ShareDialog.WEB_SHARE_DIALOG);
        }
    }

    @dhg
    public void onGagPostItemActionEvent(GagPostItemActionEvent gagPostItemActionEvent) {
        if (m12836c() != null) {
            BaseActivity baseActivity = (BaseActivity) m12836c();
            switch (gagPostItemActionEvent.f18310a) {
                case 2:
                    m12838a(baseActivity, gagPostItemActionEvent.f18311b);
                    return;
                case 3:
                    m12841c(baseActivity, gagPostItemActionEvent.f18311b);
                    return;
                case 8:
                    m12839a(baseActivity, gagPostItemActionEvent.f18311b, (String) gagPostItemActionEvent.f18312c.get("comment_id"));
                    return;
                case 9:
                    m12840b(baseActivity, gagPostItemActionEvent.f18311b);
                    return;
                default:
                    return;
            }
        }
    }

    @dhg
    public void onFinishOverlay(FinishOverlayEvent finishOverlayEvent) {
        if (m12836c() != null) {
            m12836c().finish();
        }
    }

    @dhg
    public void onShowTitle(ShowTitleEvent showTitleEvent) {
        if (m12836c() != null) {
            m12837d().m14928a(showTitleEvent.f18325a);
        }
    }

    @dhg
    public void onGagPostCopyLink(GagPostCopyLinkEvent gagPostCopyLinkEvent) {
        if (m12836c() != null) {
            cct cct = gagPostCopyLinkEvent.f18309a;
            chn.m13394b("Overlay", "SmartShare", cct.m12282e());
            cqg.a(m12836c(), cct);
        }
    }

    @dhg
    public void onGagPostSaveEvent(GagPostSaveEvent gagPostSaveEvent) {
        chn.m13394b("Overlay", "Save", gagPostSaveEvent.f18313a.m12282e());
        if (gagPostSaveEvent.f18313a.m12287j()) {
            cqg.c(m12836c(), gagPostSaveEvent.f18313a);
        } else {
            cqg.b(m12836c(), gagPostSaveEvent.f18313a);
        }
    }

    @dhg
    public void onDeletePostEvent(PostDeleteEvent postDeleteEvent) {
        ces b = m12835b();
        if (b != null) {
            String str = postDeleteEvent.f18329a;
            chn.m13400c("Overlay", "Delete", str);
            cqg.a(m12835b().m12878h(), str, m12835b().m12884n(), null);
            for (int i = 0; i < b.m12875e().getCount(); i++) {
                if (str.equals(b.m12875e().mo1693e(i).m12282e())) {
                    b.m12875e().mo1694f(i);
                }
            }
            m12835b().m12878h().finish();
        }
    }

    @dhg
    public void onPostReportBegin(PostReportBeginEvent postReportBeginEvent) {
        if (m12836c() != null) {
            if (caf.m12046a().m12094x().m12104c()) {
                m12837d().m14929a(this.f8943b.f8730b, postReportBeginEvent.f18330a);
            } else {
                cre.a(m12836c(), postReportBeginEvent.f18330a);
            }
        }
    }

    @dhg
    public void onReportPost(PostReportEvent postReportEvent) {
        if (m12836c() != null) {
            diu diu = new diu();
            diu.a(2, "TriggeredFrom", "Overlay");
            diu.a(3, "PostKey", postReportEvent.f18331a);
            chn.m13381a("PostAction", "ReportPost", postReportEvent.f18331a, null, diu);
            m12835b().m12880j().m12915a(postReportEvent.f18331a);
            this.a.m12079i().m13558b(postReportEvent.f18331a, postReportEvent.f18332b, "l", true, -1);
            m12835b().m12878h().showToast(m12835b().m12878h().getString(R.string.post_reported));
        }
    }

    @dhg
    public void onPostDeleteBegin(PostDeleteBeginEvent postDeleteBeginEvent) {
        if (m12836c() != null) {
            m12837d().m14934b(this.f8943b.f8730b, postDeleteBeginEvent.f18328a);
        }
    }

    @dhg
    public void onClickVideo(ClickedVideoEvent clickedVideoEvent) {
        new cqd(m12836c()).a(clickedVideoEvent.f18317a);
    }

    @dhg
    public void onClickAlbum(ClickedAlbumEvent clickedAlbumEvent) {
        cct cct = clickedAlbumEvent.f18316a;
        m12835b().m12878h().getNavHelper().c(cct.m12285h(), cct.m12282e());
    }
}

package com.p000;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.facebook.share.widget.ShareDialog;
import com.ninegag.android.app.otto.gagpostlist.GagPostItemActionEvent;
import com.ninegag.android.app.ui.BaseActivity;

/* compiled from: GagPostEventListener */
/* renamed from: cbz */
public class cbz extends cbx {
    public cbz(String str, Fragment fragment) {
        super(str, fragment);
    }

    @dhg
    public void onGagPostItemAction(GagPostItemActionEvent gagPostItemActionEvent) {
        if (gagPostItemActionEvent.f18311b != null) {
            switch (gagPostItemActionEvent.f18310a) {
                case 1:
                    mo1649a(gagPostItemActionEvent.f18311b);
                    return;
                case 2:
                    mo1650a(gagPostItemActionEvent.f18311b, false);
                    return;
                case 3:
                    m12434c(gagPostItemActionEvent.f18311b);
                    return;
                case 4:
                    mo1652d(gagPostItemActionEvent.f18311b);
                    return;
                case 5:
                    mo1653e(gagPostItemActionEvent.f18311b);
                    return;
                case 6:
                case 7:
                case 8:
                    return;
                case 9:
                    mo1651b(gagPostItemActionEvent.f18311b);
                    return;
                case 10:
                    mo1663f(gagPostItemActionEvent.f18311b);
                    return;
                case 11:
                    mo1650a(gagPostItemActionEvent.f18311b, true);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    protected void mo1649a(cct cct) {
    }

    /* renamed from: b */
    protected void mo1651b(cct cct) {
        Fragment fragment = (Fragment) this.b.get();
        if (fragment != null) {
            BaseActivity baseActivity = (BaseActivity) fragment.getActivity();
            if (baseActivity != null) {
                diu diu = new diu();
                diu.a(2, "TriggeredFrom", "PostList");
                diu.a(3, "PostKey", cct.m12282e());
                chn.m13381a("PostAction", "TapMenu", cct.m12282e(), null, diu);
                baseActivity.getDialogHelper().m14931a(this.a, cct.m12282e(), cct.m12286i(), "more-action");
            }
        }
    }

    /* renamed from: c */
    protected void m12434c(cct cct) {
        Fragment fragment = (Fragment) this.b.get();
        if (fragment != null) {
            BaseActivity baseActivity = (BaseActivity) fragment.getActivity();
            if (baseActivity != null) {
                diu diu = new diu();
                diu.a(2, "TriggeredFrom", "PostList");
                diu.a(3, "PostKey", cct.m12282e());
                diu.a(4, "Element", "ShareButton");
                chn.m13381a("PostAction", "TapShare", cct.m12282e(), null, diu);
                Object e = cct.m12282e();
                if (!TextUtils.isEmpty(e)) {
                    baseActivity.getDialogHelper().m14930a(this.a, e, ShareDialog.WEB_SHARE_DIALOG);
                }
            }
        }
    }

    /* renamed from: d */
    protected void mo1652d(cct cct) {
        diu diu = new diu();
        diu.a(2, "TriggeredFrom", "PostList");
        diu.a(3, "PostKey", cct.m12282e());
        boolean K = cct.m12267K();
        String e = cct.m12282e();
        cct.m12269M();
        chn.m13373a(cct.m12282e(), cct.m12295r());
        if (!c.m12094x().m12104c()) {
            if (K) {
                cct.m12266J();
                cct.m12269M();
            }
            Context activity = m12121a().getActivity();
            if (activity != null) {
                cre.a(activity, cct.m12282e(), cct.m12295r(), "l", true, cct.m12296s(), cct.m12297t());
            }
        } else if (K) {
            chn.m13381a("PostAction", "UpvotePost", cct.m12282e(), null, diu);
            chn.m13373a(e, 1);
            chr.m13522a().m13542a(e, 1, "", true, -1);
        } else {
            chn.m13381a("PostAction", "UnUpvotePost", cct.m12282e(), null, diu);
            chn.m13373a(e, 0);
            chr.m13522a().m13542a(e, 0, "", true, -1);
        }
    }

    /* renamed from: e */
    protected void mo1653e(cct cct) {
        diu diu = new diu();
        diu.a(2, "TriggeredFrom", "PostList");
        diu.a(3, "PostKey", cct.m12282e());
        boolean L = cct.m12268L();
        String e = cct.m12282e();
        cct.m12269M();
        chn.m13373a(cct.m12282e(), cct.m12295r());
        if (!c.m12094x().m12104c()) {
            if (L) {
                cct.m12266J();
                cct.m12269M();
            }
            Context activity = m12121a().getActivity();
            if (activity != null) {
                cre.b(activity, cct.m12282e(), cct.m12295r(), "l", true, cct.m12296s(), cct.m12297t());
            }
        } else if (L) {
            chn.m13381a("PostAction", "DownvotePost", cct.m12282e(), null, diu);
            chn.m13373a(e, -1);
            chr.m13522a().m13542a(e, -1, "", true, -1);
        } else {
            chn.m13381a("PostAction", "UnDownvotePost", cct.m12282e(), null, diu);
            chn.m13373a(e, 0);
            chr.m13522a().m13542a(e, 0, "", true, -1);
        }
    }

    /* renamed from: a */
    protected void mo1650a(cct cct, boolean z) {
        if (this.b.get() != null) {
            Context activity = ((Fragment) this.b.get()).getActivity();
            if (activity != null) {
                String e = cct.m12282e();
                chn.m13400c("PostAction", "TapPost", cct.m12282e());
                c.m12055a(e, cct);
                new cqd(activity).a(e, "comment-system", null, z, false);
            }
        }
    }

    /* renamed from: f */
    protected void mo1663f(cct cct) {
    }
}

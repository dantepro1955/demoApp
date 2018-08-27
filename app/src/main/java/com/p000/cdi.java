package com.p000;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.ninegag.android.app.otto.gagpostlist.GagPostCopyLinkEvent;
import com.ninegag.android.app.otto.gagpostlist.GagPostSaveEvent;
import com.ninegag.android.app.otto.post.PostDeleteBeginEvent;
import com.ninegag.android.app.ui.BaseActivity;

/* compiled from: GagPostActionEventListener */
/* renamed from: cdi */
public class cdi extends cbx {
    public cdi(String str, Fragment fragment) {
        super(str, fragment);
    }

    @dhg
    public void onGagPostCopyLink(GagPostCopyLinkEvent gagPostCopyLinkEvent) {
        Fragment a = m12121a();
        if (a != null) {
            Activity activity = a.getActivity();
            if (activity != null) {
                cqg.a(activity, gagPostCopyLinkEvent.f18309a);
            }
        }
    }

    @dhg
    public void onGagPostSave(GagPostSaveEvent gagPostSaveEvent) {
        Fragment a = m12121a();
        if (a != null) {
            Activity activity = a.getActivity();
            if (activity != null) {
                chn.m13394b("Post", "Save", gagPostSaveEvent.f18313a.m12282e());
                if (gagPostSaveEvent.f18313a.m12287j()) {
                    cqg.c(activity, gagPostSaveEvent.f18313a);
                } else {
                    cqg.b(activity, gagPostSaveEvent.f18313a);
                }
            }
        }
    }

    @dhg
    public void onPostDeleteBeginEvent(PostDeleteBeginEvent postDeleteBeginEvent) {
        Fragment a = m12121a();
        if (a != null) {
            FragmentActivity activity = a.getActivity();
            if (activity != null) {
                ((BaseActivity) activity).getDialogHelper().m14934b(this.a, postDeleteBeginEvent.f18328a);
            }
        }
    }
}

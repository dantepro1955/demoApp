package com.p000;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.widget.BaseAdapter;
import com.ninegag.android.app.ui.fragments.comment.CommentListingFragment;

/* compiled from: SinglePostEventListener */
/* renamed from: ccb */
public class ccb extends cbz {
    /* renamed from: d */
    private BaseAdapter f8677d;
    /* renamed from: e */
    private String f8678e;
    /* renamed from: f */
    private int f8679f;

    public ccb(String str, Fragment fragment, String str2, int i) {
        super(str, fragment);
        this.f8678e = str2;
        this.f8679f = i;
    }

    /* renamed from: d */
    protected void mo1652d(cct cct) {
        super.mo1652d(cct);
        if (this.f8677d != null) {
            this.f8677d.notifyDataSetChanged();
        }
    }

    /* renamed from: e */
    protected void mo1653e(cct cct) {
        super.mo1653e(cct);
        if (this.f8677d != null) {
            this.f8677d.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    protected void mo1651b(cct cct) {
        super.mo1651b(cct);
        chn.m13394b("SinglePost", "More", cct.m12282e());
    }

    /* renamed from: a */
    protected void mo1649a(cct cct) {
        super.mo1649a(cct);
        Fragment a = m12121a();
        if (a != null) {
            Context activity = a.getActivity();
            if (activity != null) {
                cqd cqd = new cqd(activity);
                if (cct.m12290m()) {
                    cqd.a(cct);
                } else {
                    cqd.a(cct, 13, this.f8678e, this.f8679f);
                }
            }
        }
    }

    /* renamed from: a */
    protected void mo1650a(cct cct, boolean z) {
        CommentListingFragment commentListingFragment = (CommentListingFragment) m12121a();
        if (commentListingFragment != null) {
            commentListingFragment.m20688i();
        }
    }

    /* renamed from: a */
    public void m12441a(BaseAdapter baseAdapter) {
        this.f8677d = baseAdapter;
    }
}

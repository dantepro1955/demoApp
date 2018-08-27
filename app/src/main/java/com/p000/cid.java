package com.p000;

import android.os.Bundle;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.post.PostReportBeginEvent;
import com.ninegag.android.app.otto.post.PostReportEvent;
import com.ninegag.android.app.ui.BaseActivity;

@Deprecated
/* compiled from: PostReportController */
/* renamed from: cid */
public class cid extends cic {
    /* renamed from: a */
    BaseActivity f9326a;
    /* renamed from: b */
    private caf f9327b = caf.m12046a();
    /* renamed from: c */
    private String f9328c;
    /* renamed from: d */
    private String f9329d;

    public cid(String str) {
        this.f9329d = str;
    }

    /* renamed from: a */
    public void m13645a(BaseActivity baseActivity) {
        this.f9326a = baseActivity;
        dhe.a(this.f9329d, this);
    }

    /* renamed from: f */
    public void m13648f() {
        dhe.b(this.f9329d, this);
        this.f9326a = null;
    }

    /* renamed from: a */
    public void m13644a(Bundle bundle) {
        bundle.putString("pending_post_report", this.f9328c);
    }

    /* renamed from: b */
    public void m13647b(Bundle bundle) {
        if (bundle != null) {
            this.f9328c = bundle.getString("pending_post_report");
        }
    }

    public void w_() {
        if (this.f9328c != null) {
            if (this.f9327b.m12094x().m12104c()) {
                onPostReportBegin(new PostReportBeginEvent(this.f9328c));
            }
            this.f9328c = null;
        }
    }

    /* renamed from: a */
    protected void m13646a(String str, int i) {
        if (this.f9326a != null) {
            this.f9327b.m12079i().m13558b(str, i, "l", true, -1);
            this.f9326a.showToast(this.f9326a.getString(R.string.post_reported));
        }
    }

    @dhg
    public void onReportPost(PostReportEvent postReportEvent) {
        m13646a(postReportEvent.f18331a, postReportEvent.f18332b);
    }

    @dhg
    public void onPostReportBegin(PostReportBeginEvent postReportBeginEvent) {
        if (this.f9326a != null) {
            if (this.f9327b.m12094x().m12104c()) {
                this.f9326a.getDialogHelper().m14929a(this.f9329d, postReportBeginEvent.f18330a);
                return;
            }
            this.f9328c = postReportBeginEvent.f18330a;
            cre.a(this.f9326a, postReportBeginEvent.f18330a);
        }
    }
}

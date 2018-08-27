package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.widget.EditText;
import com.facebook.stetho.server.http.HttpStatus;
import com.under9.android.comments.model.Comment;
import com.under9.android.comments.model.PendingCommentListItem;
import com.under9.android.comments.model.wrapper.CommentWrapper;
import com.under9.android.comments.otto.RequestAddCommentEvent;
import com.under9.android.comments.otto.UploadMediaEvent;

/* compiled from: BaseCommentSystemInlineAddModule */
/* renamed from: deh */
public abstract class deh extends dei {
    /* renamed from: a */
    private dcy f16739a = new dcy();
    /* renamed from: b */
    protected Activity f16740b;
    /* renamed from: c */
    protected Fragment f16741c;

    public deh(Context context, Fragment fragment) {
        super(context);
        this.f16740b = (Activity) context;
        this.f16741c = fragment;
    }

    /* renamed from: g */
    protected boolean m20955g() {
        return dct.a().g();
    }

    /* renamed from: h */
    protected void m20956h() {
        this.f16739a.m20934a(this.f16740b);
        dct.b(this.d, this);
    }

    /* renamed from: i */
    protected void m20957i() {
        this.f16739a.m20933a();
        try {
            dct.c(this.d, this);
        } catch (IllegalArgumentException e) {
        }
    }

    /* renamed from: a */
    protected void m20951a(Intent intent, int i) {
        if (this.f16741c != null) {
            this.f16741c.startActivityForResult(intent, i);
        }
    }

    /* renamed from: j */
    protected int m20958j() {
        return dda.a().f("max_message_length", HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
    }

    /* renamed from: k */
    public boolean m20959k() {
        return dda.a().k() && super.k();
    }

    /* renamed from: l */
    public boolean m20960l() {
        return dda.a().p() && super.l();
    }

    /* renamed from: m */
    public boolean m20961m() {
        return dda.a().p() && super.m();
    }

    /* renamed from: n */
    public Boolean m20962n() {
        Comment e = dda.a().e(this.e);
        if (e == null) {
            return null;
        }
        if (Boolean.TRUE.equals(e.m()) && CommentWrapper.isCommentCreator(e, dda.a().e())) {
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: a */
    protected void m20952a(String str, boolean z) {
        if (m20955g()) {
            Log.d("BaseCommentSystemInlineAddModule", "uploadMedia() mUrl=" + this.d + ", mediaPath=" + str + ", isOrginalCopy=" + z);
        }
        this.f16739a.m20941b().e(this.d, str, null);
    }

    /* renamed from: o */
    protected void m20963o() {
        EditText M = M();
        if (M != null) {
            String str = "";
            if (ae() != null) {
                str = ae().a();
            }
            if (m20955g()) {
                Log.d("BaseCommentSystemInlineAddModule", "post() mUrl=" + this.d + ", editor.getText=" + M.getText());
            }
            if (m20955g()) {
                Log.d("BaseCommentSystemInlineAddModule", "post() mUrl=" + this.d + ", getMarkAsSecretState=" + X());
            }
            if (m20955g()) {
                Log.d("BaseCommentSystemInlineAddModule", "post() mUrl=" + this.d + ", suppData=" + str);
            }
            PendingCommentListItem a = dda.a().a(this.d, this.f, this.e, "" + M.getText(), X().equals("on"), this.g, this.h, this.l, this.m, str);
            if (!p()) {
                this.f16739a.m20941b().a(a.a().longValue(), null);
            }
            String str2 = this.d;
            if (!p()) {
                a = null;
            }
            dct.a(str2, new RequestAddCommentEvent(a));
        }
    }

    @dhg
    public void onUploadMediaEvent(UploadMediaEvent uploadMediaEvent) {
        if (m20955g()) {
            Log.d("BaseCommentSystemInlineAddModule", "onUploadMediaEvent() mUrl=" + this.d + ",      mMediaPath=" + this.k);
        }
        if (m20955g()) {
            Log.d("BaseCommentSystemInlineAddModule", "onUploadMediaEvent() mUrl=" + this.d + ", event.mediaPath=" + uploadMediaEvent.f19240a + ", event.sourceMetaJson=" + uploadMediaEvent.f19241b + ", event.sourceMetaHash=" + uploadMediaEvent.f19242c);
        }
        if (this.k != null && TextUtils.equals(this.k, uploadMediaEvent.f19240a)) {
            this.l = uploadMediaEvent.f19241b;
            this.m = uploadMediaEvent.f19242c;
            if (uploadMediaEvent.f19243d) {
                O();
                b(false);
                return;
            }
            if (!TextUtils.isEmpty(uploadMediaEvent.f19244e)) {
                g(uploadMediaEvent.f19244e);
            }
            new Handler(Looper.getMainLooper()).post(new deh$1(this));
            b(false);
        }
    }

    /* renamed from: a */
    protected boolean m20953a(String str) {
        return true;
    }

    /* renamed from: b */
    protected boolean m20954b(String str) {
        EditText M = M();
        if (M == null) {
            return true;
        }
        return !TextUtils.equals(M.getText() == null ? "" : M.getText().toString(), str);
    }

    /* renamed from: a */
    public void m20950a(long j, String str) {
        this.e = j;
        f(str);
    }
}

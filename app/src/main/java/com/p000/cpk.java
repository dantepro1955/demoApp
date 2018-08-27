package com.p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.ninegag.android.app.upload.tag.PostTagInputView;

/* renamed from: cpk */
public final /* synthetic */ class cpk implements OnClickListener {
    /* renamed from: a */
    private final PostTagInputView f19939a;

    private cpk(PostTagInputView postTagInputView) {
        this.f19939a = postTagInputView;
    }

    /* renamed from: a */
    public static OnClickListener m24303a(PostTagInputView postTagInputView) {
        return new cpk(postTagInputView);
    }

    public void onClick(View view) {
        this.f19939a.f18653c.m24301g();
    }
}

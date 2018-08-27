package com.p000;

import com.ninegag.android.app.upload.tag.PostTagInputView;

/* renamed from: cpl */
public final /* synthetic */ class cpl implements Runnable {
    /* renamed from: a */
    private final PostTagInputView f19940a;

    private cpl(PostTagInputView postTagInputView) {
        this.f19940a = postTagInputView;
    }

    /* renamed from: a */
    public static Runnable m24304a(PostTagInputView postTagInputView) {
        return new cpl(postTagInputView);
    }

    public void run() {
        PostTagInputView.m22884a(this.f19940a);
    }
}

package com.p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.ninegag.android.app.ui.PostCommentsActivity;

/* renamed from: coa */
public final /* synthetic */ class coa implements OnClickListener {
    /* renamed from: a */
    private final PostCommentsActivity f9905a;
    /* renamed from: b */
    private final View f9906b;

    private coa(PostCommentsActivity postCommentsActivity, View view) {
        this.f9905a = postCommentsActivity;
        this.f9906b = view;
    }

    /* renamed from: a */
    public static OnClickListener m14952a(PostCommentsActivity postCommentsActivity, View view) {
        return new coa(postCommentsActivity, view);
    }

    public void onClick(View view) {
        PostCommentsActivity.lambda$onCreate$58(this.f9905a, this.f9906b, view);
    }
}

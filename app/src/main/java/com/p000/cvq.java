package com.p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.ninegag.android.tv.component.youtube.YoutubeActivity;

/* renamed from: cvq */
public final /* synthetic */ class cvq implements OnClickListener {
    /* renamed from: a */
    private final YoutubeActivity f20334a;
    /* renamed from: b */
    private final View f20335b;
    /* renamed from: c */
    private final View f20336c;

    private cvq(YoutubeActivity youtubeActivity, View view, View view2) {
        this.f20334a = youtubeActivity;
        this.f20335b = view;
        this.f20336c = view2;
    }

    /* renamed from: a */
    public static OnClickListener m25120a(YoutubeActivity youtubeActivity, View view, View view2) {
        return new cvq(youtubeActivity, view, view2);
    }

    public void onClick(View view) {
        YoutubeActivity.lambda$onCreate$82(this.f20334a, this.f20335b, this.f20336c, view);
    }
}

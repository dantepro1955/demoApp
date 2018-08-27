package com.p000;

import android.view.View;
import android.widget.TextView;
import com.ninegag.android.app.R;
import com.under9.android.lib.widget.uiv.UniversalImageView;

/* compiled from: FeaturedItemViewHolder */
/* renamed from: cbb */
public class cbb extends ccd {
    /* renamed from: a */
    public TextView f8574a;
    /* renamed from: b */
    public TextView f8575b;
    /* renamed from: c */
    public UniversalImageView f8576c;
    /* renamed from: d */
    public View f8577d;

    public cbb(View view, cnt cnt) {
        super(view, cnt);
        this.f8577d = view;
        this.f8574a = (TextView) view.findViewById(R.id.featuredPostTitle);
        this.f8576c = (UniversalImageView) view.findViewById(R.id.featuredPostThumbnail);
        this.f8575b = (TextView) view.findViewById(R.id.pointAndCommentCount);
        mo1630a();
    }

    /* renamed from: a */
    protected void mo1630a() {
        this.f8576c.a(this.e.m14846G());
    }
}

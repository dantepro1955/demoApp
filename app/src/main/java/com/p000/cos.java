package com.p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.ninegag.android.app.upload.info.UrlInfoFetchFragment;

/* renamed from: cos */
public final /* synthetic */ class cos implements OnClickListener {
    /* renamed from: a */
    private final UrlInfoFetchFragment f19901a;

    private cos(UrlInfoFetchFragment urlInfoFetchFragment) {
        this.f19901a = urlInfoFetchFragment;
    }

    /* renamed from: a */
    public static OnClickListener m24223a(UrlInfoFetchFragment urlInfoFetchFragment) {
        return new cos(urlInfoFetchFragment);
    }

    public void onClick(View view) {
        UrlInfoFetchFragment.m22845a(this.f19901a, view);
    }
}

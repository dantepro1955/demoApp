package com.p000;

import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.ninegag.android.app.R;
import com.under9.android.remoteconfig.api.model.ApiBroadcast;

/* compiled from: ImageLoaderPosterUI */
/* renamed from: cgv */
public class cgv extends dmw {
    public cgv(ApiBroadcast apiBroadcast) {
        super(apiBroadcast, new cgs(apiBroadcast));
    }

    /* renamed from: a */
    public void m13132a(ImageView imageView, String str) {
        if (imageView != null && !TextUtils.isEmpty(str)) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    /* renamed from: a */
    public int m13131a() {
        return R.layout.fresco_rc_broadcast_poster;
    }
}

package com.p000;

import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.ninegag.android.app.R;
import com.under9.android.remoteconfig.api.model.ApiBroadcast;

/* compiled from: ImageLoaderBannerUI */
/* renamed from: cgt */
public class cgt extends dmu {
    public cgt(ApiBroadcast apiBroadcast) {
        super(apiBroadcast, new cgr(apiBroadcast));
    }

    /* renamed from: a */
    public void m13127a(ImageView imageView, String str) {
        if (imageView != null && !TextUtils.isEmpty(str)) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    /* renamed from: a */
    public int m13126a() {
        return R.layout.fresco_rc_broadcast_banner;
    }
}

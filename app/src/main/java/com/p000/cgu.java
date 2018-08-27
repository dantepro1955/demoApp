package com.p000;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.ninegag.android.app.R;
import com.under9.android.remoteconfig.api.model.ApiBroadcast;
import p000.dmv.C4094a;

/* compiled from: ImageLoaderLaunchImageUI */
/* renamed from: cgu */
public class cgu extends dmv {
    public cgu(ApiBroadcast apiBroadcast, C4094a c4094a) {
        super(apiBroadcast, c4094a);
    }

    /* renamed from: a */
    protected void m13130a(ImageView imageView, ApiBroadcast apiBroadcast) {
        Object obj = apiBroadcast.launch_image.imageUrl;
        if (imageView != null && !TextUtils.isEmpty(obj)) {
            imageView.setImageURI(Uri.parse(obj));
        }
    }

    /* renamed from: a */
    protected int m13128a() {
        return R.layout.activity_splash;
    }

    /* renamed from: a */
    protected ImageView m13129a(View view) {
        return dka.c(view, R.id.launchImage);
    }
}

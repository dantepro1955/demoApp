package com.p000;

import android.content.Context;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.stetho.common.Utf8Charset;
import p000.bgo.C0218a;
import p000.bjt.C1254a;
import p000.blp.C0197a;

@bhd
/* renamed from: bgp */
public class bgp extends bgm implements C0197a {
    bgp(Context context, C1254a c1254a, blo blo, C0218a c0218a) {
        super(context, c1254a, blo, c0218a);
    }

    /* renamed from: b */
    protected void mo1176b() {
        if (this.e.f15079e == -2) {
            this.c.mo1322l().m9413a((C0197a) this);
            mo1178e();
            bky.m9006b("Loading HTML in WebView.");
            this.c.loadDataWithBaseURL(this.e.f15076b, this.e.f15077c, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, Utf8Charset.NAME, null);
        }
    }

    /* renamed from: e */
    protected void mo1178e() {
    }
}

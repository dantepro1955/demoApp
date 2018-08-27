package com.p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.ads.AudienceNetworkActivity;
import com.mopub.common.Preconditions;
import com.mopub.common.util.Utils;
import com.mopub.mobileads.BaseWebView;
import com.mopub.network.Networking;
import com.under9.android.lib.network.model.Constants;

/* compiled from: VastWebView */
/* renamed from: bzi */
public class bzi extends BaseWebView {
    /* renamed from: b */
    C1619a f8295b;

    /* compiled from: VastWebView */
    /* renamed from: bzi$a */
    public interface C1619a {
        void onVastWebViewClick();
    }

    /* compiled from: VastWebView */
    /* renamed from: bzi$b */
    class C1620b implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ bzi f8291a;
        /* renamed from: b */
        private boolean f8292b;

        C1620b(bzi bzi) {
            this.f8291a = bzi;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f8292b = true;
                    break;
                case 1:
                    if (this.f8292b) {
                        this.f8292b = false;
                        if (this.f8291a.f8295b != null) {
                            this.f8291a.f8295b.onVastWebViewClick();
                            break;
                        }
                    }
                    break;
            }
            return false;
        }
    }

    bzi(Context context) {
        super(context);
        m11894a();
        getSettings().setJavaScriptEnabled(true);
        m11892b(true);
        setBackgroundColor(0);
        setOnTouchListener(new C1620b(this));
        setId((int) Utils.generateUniqueId());
    }

    /* renamed from: a */
    void m11896a(String str) {
        loadDataWithBaseURL(Networking.getBaseUrlScheme() + Constants.SCHEME_SEP + com.mopub.common.Constants.HOST + Constants.SEP, str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
    }

    /* renamed from: a */
    public void m11895a(C1619a c1619a) {
        this.f8295b = c1619a;
    }

    /* renamed from: a */
    private void m11894a() {
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setScrollBarStyle(0);
    }

    /* renamed from: a */
    public static bzi m11893a(Context context, bzh bzh) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(bzh);
        bzi bzi = new bzi(context);
        bzh.initializeWebView(bzi);
        return bzi;
    }
}

package com.p000;

import android.content.Context;
import android.os.Handler;
import com.mopub.common.Constants;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import com.mopub.nativeads.PositioningRequest;
import com.mopub.nativeads.PositioningSource;
import com.mopub.nativeads.PositioningSource.PositioningListener;
import com.mopub.network.MoPubNetworkError;
import com.mopub.network.MoPubNetworkError.Reason;
import com.mopub.network.Networking;
import com.mopub.volley.Response.ErrorListener;
import com.mopub.volley.Response.Listener;
import com.mopub.volley.VolleyError;

/* compiled from: ServerPositioningSource */
/* renamed from: bzx */
public class bzx implements PositioningSource {
    /* renamed from: a */
    private int f8358a = 300000;
    /* renamed from: b */
    private final Context f8359b;
    /* renamed from: c */
    private final Handler f8360c;
    /* renamed from: d */
    private final Runnable f8361d;
    /* renamed from: e */
    private final Listener<MoPubClientPositioning> f8362e;
    /* renamed from: f */
    private final ErrorListener f8363f;
    /* renamed from: g */
    private PositioningListener f8364g;
    /* renamed from: h */
    private int f8365h;
    /* renamed from: i */
    private String f8366i;
    /* renamed from: j */
    private PositioningRequest f8367j;

    /* compiled from: ServerPositioningSource */
    /* renamed from: bzx$1 */
    class C16261 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bzx f8355a;

        C16261(bzx bzx) {
            this.f8355a = bzx;
        }

        public void run() {
            this.f8355a.m11984a();
        }
    }

    /* compiled from: ServerPositioningSource */
    /* renamed from: bzx$2 */
    class C16272 implements Listener<MoPubClientPositioning> {
        /* renamed from: a */
        final /* synthetic */ bzx f8356a;

        C16272(bzx bzx) {
            this.f8356a = bzx;
        }

        public void onResponse(MoPubClientPositioning moPubClientPositioning) {
            this.f8356a.m11987a(moPubClientPositioning);
        }
    }

    /* compiled from: ServerPositioningSource */
    /* renamed from: bzx$3 */
    class C16283 implements ErrorListener {
        /* renamed from: a */
        final /* synthetic */ bzx f8357a;

        C16283(bzx bzx) {
            this.f8357a = bzx;
        }

        public void onErrorResponse(VolleyError volleyError) {
            if (!(volleyError instanceof MoPubNetworkError) || ((MoPubNetworkError) volleyError).getReason().equals(Reason.WARMING_UP)) {
                MoPubLog.e("Failed to load positioning data", volleyError);
                if (volleyError.networkResponse == null && !DeviceUtils.isNetworkAvailable(this.f8357a.f8359b)) {
                    MoPubLog.c(String.valueOf(MoPubErrorCode.NO_CONNECTION.toString()));
                }
            }
            this.f8357a.m11989b();
        }
    }

    public bzx(Context context) {
        this.f8359b = context.getApplicationContext();
        this.f8360c = new Handler();
        this.f8361d = new C16261(this);
        this.f8362e = new C16272(this);
        this.f8363f = new C16283(this);
    }

    public void loadPositions(String str, PositioningListener positioningListener) {
        if (this.f8367j != null) {
            this.f8367j.cancel();
            this.f8367j = null;
        }
        if (this.f8365h > 0) {
            this.f8360c.removeCallbacks(this.f8361d);
            this.f8365h = 0;
        }
        this.f8364g = positioningListener;
        this.f8366i = new bzw(this.f8359b).withAdUnitId(str).generateUrlString(Constants.HOST);
        m11984a();
    }

    /* renamed from: a */
    private void m11984a() {
        MoPubLog.d("Loading positioning from: " + this.f8366i);
        this.f8367j = new PositioningRequest(this.f8366i, this.f8362e, this.f8363f);
        Networking.getRequestQueue(this.f8359b).add(this.f8367j);
    }

    /* renamed from: a */
    private void m11987a(MoPubClientPositioning moPubClientPositioning) {
        if (this.f8364g != null) {
            this.f8364g.onLoad(moPubClientPositioning);
        }
        this.f8364g = null;
        this.f8365h = 0;
    }

    /* renamed from: b */
    private void m11989b() {
        int pow = (int) (Math.pow(2.0d, (double) (this.f8365h + 1)) * 1000.0d);
        if (pow >= this.f8358a) {
            MoPubLog.d("Error downloading positioning information");
            if (this.f8364g != null) {
                this.f8364g.onFailed();
            }
            this.f8364g = null;
            return;
        }
        this.f8365h++;
        this.f8360c.postDelayed(this.f8361d, (long) pow);
    }
}

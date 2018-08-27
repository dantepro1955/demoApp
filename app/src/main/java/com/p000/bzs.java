package com.p000;

import android.app.Activity;
import android.os.Handler;
import android.os.SystemClock;
import com.mopub.common.VisibleForTesting;
import com.mopub.nativeads.AdRendererRegistry;
import com.mopub.nativeads.MoPubAdRenderer;
import com.mopub.nativeads.MoPubNative;
import com.mopub.nativeads.MoPubNative.MoPubNativeNetworkListener;
import com.mopub.nativeads.NativeAd;
import com.mopub.nativeads.NativeErrorCode;
import com.mopub.nativeads.RequestParameters;
import java.util.ArrayList;
import java.util.List;

/* compiled from: NativeAdSource */
/* renamed from: bzs */
public class bzs {
    @VisibleForTesting
    /* renamed from: a */
    static final int[] f8325a = new int[]{1000, 3000, 5000, 25000, 60000, 300000};
    @VisibleForTesting
    /* renamed from: b */
    boolean f8326b;
    @VisibleForTesting
    /* renamed from: c */
    boolean f8327c;
    @VisibleForTesting
    /* renamed from: d */
    int f8328d;
    @VisibleForTesting
    /* renamed from: e */
    int f8329e;
    /* renamed from: f */
    private final List<caa<NativeAd>> f8330f;
    /* renamed from: g */
    private final Handler f8331g;
    /* renamed from: h */
    private final Runnable f8332h;
    /* renamed from: i */
    private final MoPubNativeNetworkListener f8333i;
    /* renamed from: j */
    private C1624a f8334j;
    /* renamed from: k */
    private RequestParameters f8335k;
    /* renamed from: l */
    private MoPubNative f8336l;
    /* renamed from: m */
    private final AdRendererRegistry f8337m;

    /* compiled from: NativeAdSource */
    /* renamed from: bzs$1 */
    class C16221 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bzs f8323a;

        C16221(bzs bzs) {
            this.f8323a = bzs;
        }

        public void run() {
            this.f8323a.f8327c = false;
            this.f8323a.m11935g();
        }
    }

    /* compiled from: NativeAdSource */
    /* renamed from: bzs$2 */
    class C16232 implements MoPubNativeNetworkListener {
        /* renamed from: a */
        final /* synthetic */ bzs f8324a;

        C16232(bzs bzs) {
            this.f8324a = bzs;
        }

        public void onNativeLoad(NativeAd nativeAd) {
            if (this.f8324a.f8336l != null) {
                this.f8324a.f8326b = false;
                bzs bzs = this.f8324a;
                bzs.f8328d++;
                this.f8324a.m11933e();
                this.f8324a.f8330f.add(new caa(nativeAd));
                if (this.f8324a.f8330f.size() == 1 && this.f8324a.f8334j != null) {
                    this.f8324a.f8334j.onAdsAvailable();
                }
                this.f8324a.m11935g();
            }
        }

        public void onNativeFail(NativeErrorCode nativeErrorCode) {
            this.f8324a.f8326b = false;
            if (this.f8324a.f8329e >= bzs.f8325a.length - 1) {
                this.f8324a.m11933e();
                return;
            }
            this.f8324a.m11932d();
            this.f8324a.f8327c = true;
            this.f8324a.f8331g.postDelayed(this.f8324a.f8332h, (long) this.f8324a.m11934f());
        }
    }

    /* compiled from: NativeAdSource */
    /* renamed from: bzs$a */
    public interface C1624a {
        void onAdsAvailable();
    }

    public bzs() {
        this(new ArrayList(1), new Handler(), new AdRendererRegistry());
    }

    @VisibleForTesting
    bzs(List<caa<NativeAd>> list, Handler handler, AdRendererRegistry adRendererRegistry) {
        this.f8330f = list;
        this.f8331g = handler;
        this.f8332h = new C16221(this);
        this.f8337m = adRendererRegistry;
        this.f8333i = new C16232(this);
        this.f8328d = 0;
        m11933e();
    }

    /* renamed from: a */
    public int m11925a() {
        return this.f8337m.getAdRendererCount();
    }

    public int getViewTypeForAd(NativeAd nativeAd) {
        return this.f8337m.getViewTypeForAd(nativeAd);
    }

    /* renamed from: a */
    public void m11928a(MoPubAdRenderer moPubAdRenderer) {
        this.f8337m.registerAdRenderer(moPubAdRenderer);
        if (this.f8336l != null) {
            this.f8336l.registerAdRenderer(moPubAdRenderer);
        }
    }

    public MoPubAdRenderer getAdRendererForViewType(int i) {
        return this.f8337m.getRendererForViewType(i);
    }

    /* renamed from: a */
    public void m11927a(C1624a c1624a) {
        this.f8334j = c1624a;
    }

    /* renamed from: a */
    public void m11926a(Activity activity, String str, RequestParameters requestParameters) {
        m11929a(requestParameters, new MoPubNative(activity, str, this.f8333i));
    }

    @VisibleForTesting
    /* renamed from: a */
    void m11929a(RequestParameters requestParameters, MoPubNative moPubNative) {
        m11930b();
        for (MoPubAdRenderer registerAdRenderer : this.f8337m.getRendererIterable()) {
            moPubNative.registerAdRenderer(registerAdRenderer);
        }
        this.f8335k = requestParameters;
        this.f8336l = moPubNative;
        m11935g();
    }

    /* renamed from: b */
    public void m11930b() {
        if (this.f8336l != null) {
            this.f8336l.destroy();
            this.f8336l = null;
        }
        this.f8335k = null;
        for (caa caa : this.f8330f) {
            ((NativeAd) caa.f8378a).destroy();
        }
        this.f8330f.clear();
        this.f8331g.removeMessages(0);
        this.f8326b = false;
        this.f8328d = 0;
        m11933e();
    }

    /* renamed from: c */
    public NativeAd m11931c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!(this.f8326b || this.f8327c)) {
            this.f8331g.post(this.f8332h);
        }
        while (!this.f8330f.isEmpty()) {
            caa caa = (caa) this.f8330f.remove(0);
            if (uptimeMillis - caa.f8379b < 14400000) {
                return (NativeAd) caa.f8378a;
            }
        }
        return null;
    }

    @VisibleForTesting
    /* renamed from: d */
    void m11932d() {
        if (this.f8329e < f8325a.length - 1) {
            this.f8329e++;
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    void m11933e() {
        this.f8329e = 0;
    }

    @VisibleForTesting
    /* renamed from: f */
    int m11934f() {
        if (this.f8329e >= f8325a.length) {
            this.f8329e = f8325a.length - 1;
        }
        return f8325a[this.f8329e];
    }

    @VisibleForTesting
    /* renamed from: g */
    void m11935g() {
        if (!this.f8326b && this.f8336l != null && this.f8330f.size() < 1) {
            this.f8326b = true;
            this.f8336l.makeRequest(this.f8335k, Integer.valueOf(this.f8328d));
        }
    }
}

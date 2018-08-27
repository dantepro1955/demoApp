package com.p000;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.mopub.nativeads.AdMobStaticNativeAd;
import com.mopub.nativeads.FacebookAdRenderer;
import com.mopub.nativeads.FlurryCustomEventNative;
import com.mopub.nativeads.FlurryNativeAdRenderer;
import com.mopub.nativeads.FlurryViewBinder;
import com.mopub.nativeads.MediaViewBinder;
import com.mopub.nativeads.MoPubNative;
import com.mopub.nativeads.MoPubNative.MoPubNativeNetworkListener;
import com.mopub.nativeads.MoPubStaticNativeAdRenderer;
import com.mopub.nativeads.MoPubVideoNativeAdRenderer;
import com.mopub.nativeads.NativeAd;
import com.mopub.nativeads.NativeAd.MoPubNativeEventListener;
import com.mopub.nativeads.NativeErrorCode;
import com.mopub.nativeads.RequestParameters;
import com.mopub.nativeads.RequestParameters.NativeAdAsset;
import com.mopub.nativeads.ViewBinder;
import com.mopub.nativeads.ViewBinder.Builder;
import com.ninegag.android.app.R;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AdsManager */
/* renamed from: cdl */
public class cdl extends dfx implements MoPubNativeNetworkListener, MoPubNativeEventListener {
    /* renamed from: a */
    private static final Map<String, List<NativeAd>> f8810a = new hh();
    /* renamed from: b */
    private RequestParameters f8811b;
    /* renamed from: c */
    private MoPubNative f8812c;
    /* renamed from: d */
    private String f8813d;
    /* renamed from: e */
    private boolean f8814e;

    public cdl(Activity activity, String str, String str2) {
        String str3;
        cro cro = (cro) crj.b(cro.class);
        Object obj = (cro == null || cro.c().intValue() != 1) ? null : 1;
        if (obj != null) {
            str3 = "8d94405833154ebe9def4fc47e90a696";
        } else {
            str3 = str;
        }
        m12666a(activity, str3, str2, new Builder(obj == null ? R.layout.post_item_v3_native_ad : R.layout.post_item_v3_native_ad_native).titleId(R.id.adPostTitle).textId(R.id.adBody).mainImageId(R.id.async_image).callToActionId(R.id.btnCTA).build(), new MediaViewBinder.Builder(R.layout.post_item_v3_native_ad).titleId(R.id.adPostTitle).textId(R.id.adBody).mediaLayoutId(R.id.adVideo).callToActionId(R.id.btnCTA).build());
    }

    public cdl(Activity activity, String str, String str2, ViewBinder viewBinder, MediaViewBinder mediaViewBinder) {
        m12666a(activity, str, str2, viewBinder, mediaViewBinder);
    }

    /* renamed from: a */
    public synchronized NativeAd m12668a() {
        NativeAd nativeAd;
        if (!f8810a.containsKey(this.f8813d) || ((List) f8810a.get(this.f8813d)).isEmpty()) {
            this.f8814e = false;
            m12669b();
            nativeAd = null;
        } else {
            NativeAd nativeAd2 = null;
            while (!((List) f8810a.get(this.f8813d)).isEmpty()) {
                nativeAd = (NativeAd) ((List) f8810a.get(this.f8813d)).remove(0);
                if (!nativeAd.isDestroyed()) {
                    break;
                }
                nativeAd2 = nativeAd;
            }
            nativeAd = nativeAd2;
            if (nativeAd == null || nativeAd.isDestroyed()) {
                m12669b();
                nativeAd = null;
            }
        }
        return nativeAd;
    }

    /* renamed from: b */
    public synchronized void m12669b() {
        if (!this.f8814e) {
            this.f8814e = true;
            try {
                this.f8812c.makeRequest(this.f8811b);
            } catch (Exception e) {
            }
        }
    }

    public synchronized void r_() {
        if (!this.f8814e) {
            m12669b();
        }
    }

    public synchronized void onNativeLoad(NativeAd nativeAd) {
        nativeAd.setMoPubNativeEventListener(this);
        List arrayList = f8810a.containsKey(nativeAd.getAdUnitId()) ? (List) f8810a.get(nativeAd.getAdUnitId()) : new ArrayList();
        arrayList.add(nativeAd);
        f8810a.put(nativeAd.getAdUnitId(), arrayList);
        this.f8814e = false;
    }

    public void onImpression(View view) {
    }

    public void onClick(View view) {
        chn.m13446r();
    }

    /* renamed from: d */
    public void m12670d() {
        super.d();
        cdl.m12667e();
        if (this.f8812c != null) {
            this.f8812c.destroy();
        }
    }

    public void onNativeFail(NativeErrorCode nativeErrorCode) {
        chn.m13448r("SHOW_NATIVE_AD_FAILED", nativeErrorCode.toString());
    }

    /* renamed from: e */
    public static void m12667e() {
        for (List<NativeAd> it : f8810a.values()) {
            for (NativeAd nativeAd : it) {
                if (!nativeAd.isDestroyed()) {
                    nativeAd.destroy();
                }
            }
        }
        f8810a.clear();
    }

    public String toString() {
        return "AdsManager{mParams=" + this.f8811b + ", mNative=" + this.f8812c + ", mIsAdLoading=" + this.f8814e + '}';
    }

    /* renamed from: a */
    private void m12666a(Activity activity, String str, String str2, ViewBinder viewBinder, MediaViewBinder mediaViewBinder) {
        this.f8812c = new MoPubNative(activity, TextUtils.isEmpty(str) ? "babdb6ec2fb946e495775f1f34b3878b" : str, this);
        Map hashMap = new HashMap();
        hashMap.put(AdMobStaticNativeAd.KEY_CONTENT_URL, str2);
        hashMap.put(FlurryCustomEventNative.LOCAL_EXTRA_TEST_MODE, Boolean.valueOf(false));
        this.f8812c.setLocalExtras(hashMap);
        this.f8812c.registerAdRenderer(new FacebookAdRenderer(viewBinder));
        this.f8812c.registerAdRenderer(new FlurryNativeAdRenderer(new FlurryViewBinder.Builder(viewBinder).videoViewId(R.id.flurry_video_ad).build()));
        this.f8812c.registerAdRenderer(new MoPubVideoNativeAdRenderer(mediaViewBinder));
        this.f8812c.registerAdRenderer(new MoPubStaticNativeAdRenderer(viewBinder));
        this.f8811b = new RequestParameters.Builder().desiredAssets(EnumSet.of(NativeAdAsset.TITLE, NativeAdAsset.TEXT, NativeAdAsset.MAIN_IMAGE, NativeAdAsset.CALL_TO_ACTION_TEXT)).build();
        this.f8813d = str;
    }
}

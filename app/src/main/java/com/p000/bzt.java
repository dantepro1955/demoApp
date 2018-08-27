package com.p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.nativeads.NativeAd;
import java.util.WeakHashMap;

@Deprecated
/* compiled from: NativeAdViewHelper */
/* renamed from: bzt */
public class bzt {
    /* renamed from: a */
    private static final WeakHashMap<View, NativeAd> f8339a = new WeakHashMap();

    @VisibleForTesting
    /* compiled from: NativeAdViewHelper */
    /* renamed from: bzt$a */
    enum C1625a {
        EMPTY,
        AD
    }

    @Deprecated
    /* renamed from: a */
    public static View m11936a(View view, ViewGroup viewGroup, Context context, NativeAd nativeAd) {
        if (view != null) {
            bzt.m11937a(view);
        }
        if (nativeAd == null || nativeAd.isDestroyed()) {
            MoPubLog.d("NativeAd null or invalid. Returning empty view");
            if (view != null && C1625a.EMPTY.equals(view.getTag())) {
                return view;
            }
            view = new View(context);
            view.setTag(C1625a.EMPTY);
            view.setVisibility(8);
            return view;
        }
        if (view == null || !C1625a.AD.equals(view.getTag())) {
            view = nativeAd.createAdView(context, viewGroup);
            view.setTag(C1625a.AD);
        }
        bzt.m11938a(view, nativeAd);
        nativeAd.renderAdView(view);
        return view;
    }

    /* renamed from: a */
    private static void m11937a(View view) {
        NativeAd nativeAd = (NativeAd) f8339a.get(view);
        if (nativeAd != null) {
            nativeAd.clear(view);
        }
    }

    /* renamed from: a */
    private static void m11938a(View view, NativeAd nativeAd) {
        f8339a.put(view, nativeAd);
        nativeAd.prepare(view);
    }
}

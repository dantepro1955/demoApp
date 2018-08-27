package com.p000;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import com.facebook.common.internal.Supplier;
import com.facebook.common.util.ByteConstants;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.memory.DefaultFlexByteArrayPoolParams;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;

/* compiled from: GagBitmapMemoryCacheParamsSupplier */
/* renamed from: cpt */
public class cpt implements Supplier<MemoryCacheParams> {
    /* renamed from: a */
    private final ActivityManager f19949a;

    public /* synthetic */ Object get() {
        return m24331a();
    }

    public cpt(ActivityManager activityManager) {
        this.f19949a = activityManager;
    }

    /* renamed from: a */
    public MemoryCacheParams m24331a() {
        return new MemoryCacheParams(m24330b(), 256, MoPubClientPositioning.NO_REPEAT, MoPubClientPositioning.NO_REPEAT, MoPubClientPositioning.NO_REPEAT);
    }

    /* renamed from: b */
    private int m24330b() {
        int min = Math.min(this.f19949a.getMemoryClass() * ByteConstants.MB, MoPubClientPositioning.NO_REPEAT);
        if (min < 33554432) {
            return DefaultFlexByteArrayPoolParams.DEFAULT_MAX_BYTE_ARRAY_SIZE;
        }
        if (min < 67108864) {
            return 6291456;
        }
        if (VERSION.SDK_INT <= 9) {
            return 8388608;
        }
        return min / 6;
    }
}

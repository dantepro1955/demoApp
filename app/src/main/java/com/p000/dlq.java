package com.p000;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

/* compiled from: UniversalImageHelper */
/* renamed from: dlq */
public class dlq {
    /* renamed from: a */
    public static void m27901a(String str) {
        Fresco.getImagePipeline().prefetchToDiskCache(ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).setRequestPriority(Priority.LOW).build(), null);
    }

    /* renamed from: b */
    public static boolean m27902b(String str) {
        CacheKey encodedCacheKey = DefaultCacheKeyFactory.getInstance().getEncodedCacheKey(ImageRequest.fromUri(str), null);
        if (encodedCacheKey == null || ImagePipelineFactory.getInstance().getMainFileCache().getResource(encodedCacheKey) == null) {
            return false;
        }
        return true;
    }
}

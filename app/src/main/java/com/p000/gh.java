package com.p000;

import android.annotation.TargetApi;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import p000.gg.C5336a;

@TargetApi(23)
/* compiled from: MediaDescriptionCompatApi23 */
/* renamed from: gh */
public class gh extends gg {

    /* compiled from: MediaDescriptionCompatApi23 */
    /* renamed from: gh$a */
    public static class C5337a extends C5336a {
        /* renamed from: b */
        public static void m30334b(Object obj, Uri uri) {
            ((Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: h */
    public static Uri m30335h(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}

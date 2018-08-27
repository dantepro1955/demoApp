package com.p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

@TargetApi(21)
/* compiled from: MediaDescriptionCompatApi21 */
/* renamed from: gg */
public class gg {

    /* compiled from: MediaDescriptionCompatApi21 */
    /* renamed from: gg$a */
    public static class C5336a {
        /* renamed from: a */
        public static Object m30316a() {
            return new Builder();
        }

        /* renamed from: a */
        public static void m30322a(Object obj, String str) {
            ((Builder) obj).setMediaId(str);
        }

        /* renamed from: a */
        public static void m30321a(Object obj, CharSequence charSequence) {
            ((Builder) obj).setTitle(charSequence);
        }

        /* renamed from: b */
        public static void m30323b(Object obj, CharSequence charSequence) {
            ((Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m30324c(Object obj, CharSequence charSequence) {
            ((Builder) obj).setDescription(charSequence);
        }

        /* renamed from: a */
        public static void m30318a(Object obj, Bitmap bitmap) {
            ((Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m30319a(Object obj, Uri uri) {
            ((Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m30320a(Object obj, Bundle bundle) {
            ((Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static Object m30317a(Object obj) {
            return ((Builder) obj).build();
        }
    }

    /* renamed from: a */
    public static String m30326a(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: b */
    public static CharSequence m30328b(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: c */
    public static CharSequence m30329c(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: d */
    public static CharSequence m30330d(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: e */
    public static Bitmap m30331e(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: f */
    public static Uri m30332f(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: g */
    public static Bundle m30333g(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: a */
    public static void m30327a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public static Object m30325a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }
}

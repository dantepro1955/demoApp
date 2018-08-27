package com.p000;

import android.media.MediaMetadataRetriever;

/* compiled from: MediaUtil */
/* renamed from: djq */
public final class djq {
    /* renamed from: a */
    public static long m27608a(String str) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            return Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) / 1000;
        } catch (Exception e) {
            return 0;
        }
    }

    /* renamed from: a */
    public static long m27609a(String str, MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            mediaMetadataRetriever.setDataSource(str);
            return Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) / 1000;
        } catch (Exception e) {
            return 0;
        }
    }

    /* renamed from: b */
    public static boolean m27610b(String str) {
        return str != null && "image/gif".equals(str);
    }
}

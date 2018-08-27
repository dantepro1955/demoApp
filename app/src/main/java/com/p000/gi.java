package com.p000;

import android.annotation.TargetApi;
import android.media.MediaMetadata;
import android.os.Parcel;

@TargetApi(21)
/* compiled from: MediaMetadataCompatApi21 */
/* renamed from: gi */
public class gi {
    /* renamed from: a */
    public static void m30336a(Object obj, Parcel parcel, int i) {
        ((MediaMetadata) obj).writeToParcel(parcel, i);
    }
}

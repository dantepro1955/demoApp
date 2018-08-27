package com.p000;

import android.annotation.TargetApi;
import android.media.session.PlaybackState;
import android.os.Bundle;

@TargetApi(22)
/* compiled from: PlaybackStateCompatApi22 */
/* renamed from: go */
public class go {
    /* renamed from: a */
    public static Bundle m30480a(Object obj) {
        return ((PlaybackState) obj).getExtras();
    }
}

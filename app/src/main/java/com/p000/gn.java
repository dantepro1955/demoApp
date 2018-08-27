package com.p000;

import android.annotation.TargetApi;
import android.media.session.PlaybackState;
import android.media.session.PlaybackState.CustomAction;
import android.os.Bundle;
import java.util.List;

@TargetApi(21)
/* compiled from: PlaybackStateCompatApi21 */
/* renamed from: gn */
public class gn {

    /* compiled from: PlaybackStateCompatApi21 */
    /* renamed from: gn$a */
    public static final class C5346a {
        /* renamed from: a */
        public static String m30467a(Object obj) {
            return ((CustomAction) obj).getAction();
        }

        /* renamed from: b */
        public static CharSequence m30468b(Object obj) {
            return ((CustomAction) obj).getName();
        }

        /* renamed from: c */
        public static int m30469c(Object obj) {
            return ((CustomAction) obj).getIcon();
        }

        /* renamed from: d */
        public static Bundle m30470d(Object obj) {
            return ((CustomAction) obj).getExtras();
        }
    }

    /* renamed from: a */
    public static int m30471a(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    /* renamed from: b */
    public static long m30472b(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: c */
    public static long m30473c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: d */
    public static float m30474d(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: e */
    public static long m30475e(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: f */
    public static CharSequence m30476f(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: g */
    public static long m30477g(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: h */
    public static List<Object> m30478h(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: i */
    public static long m30479i(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }
}

package com.p000;

import android.annotation.TargetApi;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;

@TargetApi(21)
/* compiled from: MediaSessionCompatApi21 */
/* renamed from: gm */
public class gm {

    /* compiled from: MediaSessionCompatApi21 */
    /* renamed from: gm$a */
    public static class C5345a {
        /* renamed from: a */
        public static Object m30464a(Object obj) {
            return ((QueueItem) obj).getDescription();
        }

        /* renamed from: b */
        public static long m30465b(Object obj) {
            return ((QueueItem) obj).getQueueId();
        }
    }

    /* renamed from: a */
    public static Object m30466a(Object obj) {
        if (obj instanceof Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}

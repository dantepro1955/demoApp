package com.p000;

import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.events.GZIPQueueFileEventStorage;
import io.fabric.sdk.android.services.persistence.FileStore;
import java.io.IOException;

/* compiled from: AnswersFilesManagerProvider */
/* renamed from: zy */
class zy {
    /* renamed from: a */
    final Context f26199a;
    /* renamed from: b */
    final FileStore f26200b;

    public zy(Context context, FileStore fileStore) {
        this.f26199a = context;
        this.f26200b = fileStore;
    }

    /* renamed from: a */
    public aak m35063a() throws IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
        }
        return new aak(this.f26199a, new aaq(), new SystemCurrentTimeProvider(), new GZIPQueueFileEventStorage(this.f26199a, this.f26200b.mo4931a(), "session_analytics.tap", "session_analytics_to_send"));
    }
}

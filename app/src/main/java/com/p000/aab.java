package com.p000;

import io.fabric.sdk.android.services.concurrency.internal.DefaultRetryPolicy;
import io.fabric.sdk.android.services.concurrency.internal.ExponentialBackoff;
import io.fabric.sdk.android.services.concurrency.internal.RetryState;
import io.fabric.sdk.android.services.events.FilesSender;
import java.io.File;
import java.util.List;

/* compiled from: AnswersRetryFilesSender */
/* renamed from: aab */
class aab implements FilesSender {
    /* renamed from: a */
    private final aal f49a;
    /* renamed from: b */
    private final aai f50b;

    /* renamed from: a */
    public static aab m49a(aal aal) {
        return new aab(aal, new aai(new RetryState(new aah(new ExponentialBackoff(1000, 8), 0.1d), new DefaultRetryPolicy(5))));
    }

    aab(aal aal, aai aai) {
        this.f49a = aal;
        this.f50b = aai;
    }

    /* renamed from: a */
    public boolean m50a(List<File> list) {
        long nanoTime = System.nanoTime();
        if (!this.f50b.m81a(nanoTime)) {
            return false;
        }
        if (this.f49a.m88a(list)) {
            this.f50b.m80a();
            return true;
        }
        this.f50b.m82b(nanoTime);
        return false;
    }
}

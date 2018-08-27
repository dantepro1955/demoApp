package com.p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: atj */
public class atj implements Executor {
    /* renamed from: a */
    private final Handler f4328a;

    public atj(Looper looper) {
        this.f4328a = new Handler(looper);
    }

    public void execute(Runnable runnable) {
        this.f4328a.post(runnable);
    }
}

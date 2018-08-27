package com.p000;

import android.os.Process;

/* renamed from: atl */
class atl implements Runnable {
    /* renamed from: a */
    private final Runnable f4333a;
    /* renamed from: b */
    private final int f4334b;

    public atl(Runnable runnable, int i) {
        this.f4333a = runnable;
        this.f4334b = i;
    }

    public void run() {
        Process.setThreadPriority(this.f4334b);
        this.f4333a.run();
    }
}

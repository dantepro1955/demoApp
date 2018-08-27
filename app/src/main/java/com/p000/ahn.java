package com.p000;

import android.os.HandlerThread;
import android.os.Process;

/* compiled from: PriorityHandlerThread */
/* renamed from: ahn */
public final class ahn extends HandlerThread {
    /* renamed from: a */
    private final int f1497a;

    public ahn(String str, int i) {
        super(str);
        this.f1497a = i;
    }

    public void run() {
        Process.setThreadPriority(this.f1497a);
        super.run();
    }
}

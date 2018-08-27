package com.p000;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingTimeout */
/* renamed from: drx */
public class drx extends dsi {
    /* renamed from: a */
    private dsi f22769a;

    public drx(dsi dsi) {
        if (dsi == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f22769a = dsi;
    }

    /* renamed from: a */
    public final dsi m29043a() {
        return this.f22769a;
    }

    /* renamed from: a */
    public final drx m29042a(dsi dsi) {
        if (dsi == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f22769a = dsi;
        return this;
    }

    public dsi timeout(long j, TimeUnit timeUnit) {
        return this.f22769a.timeout(j, timeUnit);
    }

    public long timeoutNanos() {
        return this.f22769a.timeoutNanos();
    }

    public boolean hasDeadline() {
        return this.f22769a.hasDeadline();
    }

    public long deadlineNanoTime() {
        return this.f22769a.deadlineNanoTime();
    }

    public dsi deadlineNanoTime(long j) {
        return this.f22769a.deadlineNanoTime(j);
    }

    public dsi clearTimeout() {
        return this.f22769a.clearTimeout();
    }

    public dsi clearDeadline() {
        return this.f22769a.clearDeadline();
    }

    public void throwIfReached() throws IOException {
        this.f22769a.throwIfReached();
    }
}

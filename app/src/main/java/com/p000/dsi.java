package com.p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: Timeout */
/* renamed from: dsi */
public class dsi {
    public static final dsi NONE = new C50691();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* compiled from: Timeout */
    /* renamed from: dsi$1 */
    static class C50691 extends dsi {
        C50691() {
        }

        public dsi timeout(long j, TimeUnit timeUnit) {
            return this;
        }

        public dsi deadlineNanoTime(long j) {
            return this;
        }

        public void throwIfReached() throws IOException {
        }
    }

    public dsi timeout(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        } else if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        } else {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public dsi deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }

    public final dsi deadline(long j, TimeUnit timeUnit) {
        if (j <= 0) {
            throw new IllegalArgumentException("duration <= 0: " + j);
        } else if (timeUnit != null) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public dsi clearTimeout() {
        this.timeoutNanos = 0;
        return this;
    }

    public dsi clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        long j = 0;
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            if (hasDeadline || timeoutNanos != 0) {
                long nanoTime = System.nanoTime();
                if (hasDeadline && timeoutNanos != 0) {
                    timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
                } else if (hasDeadline) {
                    timeoutNanos = deadlineNanoTime() - nanoTime;
                }
                if (timeoutNanos > 0) {
                    j = timeoutNanos / 1000000;
                    obj.wait(j, (int) (timeoutNanos - (j * 1000000)));
                    j = System.nanoTime() - nanoTime;
                }
                if (j >= timeoutNanos) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException e) {
            throw new InterruptedIOException("interrupted");
        }
    }
}

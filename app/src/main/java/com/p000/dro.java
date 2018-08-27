package com.p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncTimeout */
/* renamed from: dro */
public class dro extends dsi {
    private static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    private static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static dro head;
    private boolean inQueue;
    private dro next;
    private long timeoutAt;

    /* compiled from: AsyncTimeout */
    /* renamed from: dro$a */
    static final class C5061a extends Thread {
        public C5061a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            r3 = this;
        L_0x0000:
            r1 = p000.dro.class;
            monitor-enter(r1);	 Catch:{ InterruptedException -> 0x000e }
            r0 = p000.dro.awaitTimeout();	 Catch:{ all -> 0x000b }
            if (r0 != 0) goto L_0x0010;
        L_0x0009:
            monitor-exit(r1);	 Catch:{ all -> 0x000b }
            goto L_0x0000;
        L_0x000b:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x000b }
            throw r0;	 Catch:{ InterruptedException -> 0x000e }
        L_0x000e:
            r0 = move-exception;
            goto L_0x0000;
        L_0x0010:
            r2 = p000.dro.head;	 Catch:{ all -> 0x000b }
            if (r0 != r2) goto L_0x001c;
        L_0x0016:
            r0 = 0;
            p000.dro.head = r0;	 Catch:{ all -> 0x000b }
            monitor-exit(r1);	 Catch:{ all -> 0x000b }
            return;
        L_0x001c:
            monitor-exit(r1);	 Catch:{ all -> 0x000b }
            r0.timedOut();	 Catch:{ InterruptedException -> 0x000e }
            goto L_0x0000;
            */
            throw new UnsupportedOperationException("Method not decompiled: dro.a.run():void");
        }
    }

    public final void enter() {
        if (this.inQueue) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            this.inQueue = true;
            dro.scheduleTimeout(this, timeoutNanos, hasDeadline);
        }
    }

    private static synchronized void scheduleTimeout(dro dro, long j, boolean z) {
        synchronized (dro.class) {
            if (head == null) {
                head = new dro();
                new C5061a().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                dro.timeoutAt = Math.min(j, dro.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (j != 0) {
                dro.timeoutAt = nanoTime + j;
            } else if (z) {
                dro.timeoutAt = dro.deadlineNanoTime();
            } else {
                throw new AssertionError();
            }
            long remainingNanos = dro.remainingNanos(nanoTime);
            dro dro2 = head;
            while (dro2.next != null && remainingNanos >= dro2.next.remainingNanos(nanoTime)) {
                dro2 = dro2.next;
            }
            dro.next = dro2.next;
            dro2.next = dro;
            if (dro2 == head) {
                dro.class.notify();
            }
        }
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return dro.cancelScheduledTimeout(this);
    }

    private static synchronized boolean cancelScheduledTimeout(dro dro) {
        boolean z;
        synchronized (dro.class) {
            for (dro dro2 = head; dro2 != null; dro2 = dro2.next) {
                if (dro2.next == dro) {
                    dro2.next = dro.next;
                    dro.next = null;
                    z = false;
                    break;
                }
            }
            z = true;
        }
        return z;
    }

    private long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    protected void timedOut() {
    }

    public final dsg sink(final dsg dsg) {
        return new dsg(this) {
            /* renamed from: b */
            final /* synthetic */ dro f22751b;

            public void write(drq drq, long j) throws IOException {
                dsj.m29130a(drq.f22760b, 0, j);
                long j2 = j;
                while (j2 > 0) {
                    dsd dsd = drq.f22759a;
                    long j3 = 0;
                    while (j3 < 65536) {
                        long j4 = ((long) (drq.f22759a.f22794c - drq.f22759a.f22793b)) + j3;
                        if (j4 >= j2) {
                            j3 = j2;
                            break;
                        } else {
                            dsd = dsd.f22797f;
                            j3 = j4;
                        }
                    }
                    this.f22751b.enter();
                    try {
                        dsg.write(drq, j3);
                        j2 -= j3;
                        this.f22751b.exit(true);
                    } catch (IOException e) {
                        throw this.f22751b.exit(e);
                    } catch (Throwable th) {
                        this.f22751b.exit(false);
                    }
                }
            }

            public void flush() throws IOException {
                this.f22751b.enter();
                try {
                    dsg.flush();
                    this.f22751b.exit(true);
                } catch (IOException e) {
                    throw this.f22751b.exit(e);
                } catch (Throwable th) {
                    this.f22751b.exit(false);
                }
            }

            public void close() throws IOException {
                this.f22751b.enter();
                try {
                    dsg.close();
                    this.f22751b.exit(true);
                } catch (IOException e) {
                    throw this.f22751b.exit(e);
                } catch (Throwable th) {
                    this.f22751b.exit(false);
                }
            }

            public dsi timeout() {
                return this.f22751b;
            }

            public String toString() {
                return "AsyncTimeout.sink(" + dsg + ")";
            }
        };
    }

    public final dsh source(final dsh dsh) {
        return new dsh(this) {
            /* renamed from: b */
            final /* synthetic */ dro f22753b;

            public long read(drq drq, long j) throws IOException {
                this.f22753b.enter();
                try {
                    long read = dsh.read(drq, j);
                    this.f22753b.exit(true);
                    return read;
                } catch (IOException e) {
                    throw this.f22753b.exit(e);
                } catch (Throwable th) {
                    this.f22753b.exit(false);
                }
            }

            public void close() throws IOException {
                try {
                    dsh.close();
                    this.f22753b.exit(true);
                } catch (IOException e) {
                    throw this.f22753b.exit(e);
                } catch (Throwable th) {
                    this.f22753b.exit(false);
                }
            }

            public dsi timeout() {
                return this.f22753b;
            }

            public String toString() {
                return "AsyncTimeout.source(" + dsh + ")";
            }
        };
    }

    final void exit(boolean z) throws IOException {
        if (exit() && z) {
            throw newTimeoutException(null);
        }
    }

    final IOException exit(IOException iOException) throws IOException {
        return !exit() ? iOException : newTimeoutException(iOException);
    }

    protected IOException newTimeoutException(IOException iOException) {
        IOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    static dro awaitTimeout() throws InterruptedException {
        dro dro = head.next;
        if (dro == null) {
            long nanoTime = System.nanoTime();
            dro.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next != null || System.nanoTime() - nanoTime < IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return head;
        }
        nanoTime = dro.remainingNanos(System.nanoTime());
        if (nanoTime > 0) {
            long j = nanoTime / 1000000;
            dro.class.wait(j, (int) (nanoTime - (1000000 * j)));
            return null;
        }
        head.next = dro.next;
        dro.next = null;
        return dro;
    }
}

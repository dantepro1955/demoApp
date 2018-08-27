package com.p000;

import com.facebook.common.time.Clock;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: BackpressureUtils */
/* renamed from: dus */
public final class dus {
    /* renamed from: a */
    public static long m29421a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, dus.m29420a(j2, j)));
        return j2;
    }

    /* renamed from: a */
    public static long m29420a(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Clock.MAX_TIME;
        }
        return j3;
    }

    /* renamed from: a */
    public static <T, R> void m29422a(AtomicLong atomicLong, Queue<T> queue, dtv<? super R> dtv, duo<? super T, ? extends R> duo) {
        long j;
        do {
            j = atomicLong.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            }
        } while (!atomicLong.compareAndSet(j, j | Long.MIN_VALUE));
        if (j != 0) {
            dus.m29426b(atomicLong, queue, dtv, duo);
        }
    }

    /* renamed from: a */
    public static <T, R> boolean m29424a(AtomicLong atomicLong, long j, Queue<T> queue, dtv<? super R> dtv, duo<? super T, ? extends R> duo) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        } else if (j != 0) {
            long j2;
            long j3;
            do {
                j2 = atomicLong.get();
                j3 = Long.MIN_VALUE & j2;
            } while (!atomicLong.compareAndSet(j2, dus.m29420a(Clock.MAX_TIME & j2, j) | j3));
            if (j2 != Long.MIN_VALUE) {
                return j3 == 0;
            } else {
                dus.m29426b(atomicLong, queue, dtv, duo);
                return false;
            }
        } else if ((atomicLong.get() & Long.MIN_VALUE) == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    static <T, R> void m29426b(AtomicLong atomicLong, Queue<T> queue, dtv<? super R> dtv, duo<? super T, ? extends R> duo) {
        long j = atomicLong.get();
        if (j == Clock.MAX_TIME) {
            while (!dtv.isUnsubscribed()) {
                Object poll = queue.poll();
                if (poll == null) {
                    dtv.onCompleted();
                    return;
                }
                dtv.onNext(duo.mo4103a(poll));
            }
            return;
        }
        long j2 = j;
        j = Long.MIN_VALUE;
        while (true) {
            if (j == j2) {
                if (j == j2) {
                    if (!dtv.isUnsubscribed()) {
                        if (queue.isEmpty()) {
                            dtv.onCompleted();
                            return;
                        }
                    }
                    return;
                }
                j2 = atomicLong.get();
                if (j2 == j) {
                    j = atomicLong.addAndGet(-(j & Clock.MAX_TIME));
                    if (j != Long.MIN_VALUE) {
                        j2 = j;
                        j = Long.MIN_VALUE;
                    } else {
                        return;
                    }
                }
                continue;
            } else if (!dtv.isUnsubscribed()) {
                Object poll2 = queue.poll();
                if (poll2 == null) {
                    dtv.onCompleted();
                    return;
                } else {
                    dtv.onNext(duo.mo4103a(poll2));
                    j++;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static long m29425b(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Clock.MAX_TIME) {
                return Clock.MAX_TIME;
            }
            j2 = j3 - j;
            if (j2 < 0) {
                throw new IllegalStateException("More produced than requested: " + j2);
            }
        } while (!atomicLong.compareAndSet(j3, j2));
        return j2;
    }

    /* renamed from: a */
    public static boolean m29423a(long j) {
        if (j >= 0) {
            return j != 0;
        } else {
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        }
    }
}

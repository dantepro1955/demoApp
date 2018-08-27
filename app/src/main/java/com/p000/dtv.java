package com.p000;

import com.facebook.common.time.Clock;

/* compiled from: Subscriber */
/* renamed from: dtv */
public abstract class dtv<T> implements dtq<T>, dtw {
    private static final long NOT_SET = Long.MIN_VALUE;
    private dtr producer;
    private long requested;
    private final dtv<?> subscriber;
    private final dxa subscriptions;

    protected dtv() {
        this(null, false);
    }

    protected dtv(dtv<?> dtv) {
        this(dtv, true);
    }

    protected dtv(dtv<?> dtv, boolean z) {
        this.requested = NOT_SET;
        this.subscriber = dtv;
        dxa dxa = (!z || dtv == null) ? new dxa() : dtv.subscriptions;
        this.subscriptions = dxa;
    }

    public final void add(dtw dtw) {
        this.subscriptions.m29730a(dtw);
    }

    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public void onStart() {
    }

    protected final void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("number requested cannot be negative: " + j);
        }
        synchronized (this) {
            if (this.producer != null) {
                dtr dtr = this.producer;
                dtr.request(j);
                return;
            }
            addToRequested(j);
        }
    }

    private void addToRequested(long j) {
        if (this.requested == NOT_SET) {
            this.requested = j;
            return;
        }
        long j2 = this.requested + j;
        if (j2 < 0) {
            this.requested = Clock.MAX_TIME;
        } else {
            this.requested = j2;
        }
    }

    public void setProducer(dtr dtr) {
        Object obj = null;
        synchronized (this) {
            long j = this.requested;
            this.producer = dtr;
            if (this.subscriber != null && j == NOT_SET) {
                obj = 1;
            }
        }
        if (obj != null) {
            this.subscriber.setProducer(this.producer);
        } else if (j == NOT_SET) {
            this.producer.request(Clock.MAX_TIME);
        } else {
            this.producer.request(j);
        }
    }
}

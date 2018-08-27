package com.p000;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequentialSubscription */
/* renamed from: dwp */
public final class dwp extends AtomicReference<dtw> implements dtw {
    private static final long serialVersionUID = 995205034283130269L;

    /* renamed from: a */
    public boolean m29650a(dtw dtw) {
        dtw dtw2;
        do {
            dtw2 = (dtw) get();
            if (dtw2 == dwq.INSTANCE) {
                if (dtw != null) {
                    dtw.unsubscribe();
                }
                return false;
            }
        } while (!compareAndSet(dtw2, dtw));
        if (dtw2 != null) {
            dtw2.unsubscribe();
        }
        return true;
    }

    /* renamed from: b */
    public boolean m29651b(dtw dtw) {
        dtw dtw2;
        do {
            dtw2 = (dtw) get();
            if (dtw2 == dwq.INSTANCE) {
                if (dtw != null) {
                    dtw.unsubscribe();
                }
                return false;
            }
        } while (!compareAndSet(dtw2, dtw));
        return true;
    }

    public void unsubscribe() {
        if (((dtw) get()) != dwq.INSTANCE) {
            dtw dtw = (dtw) getAndSet(dwq.INSTANCE);
            if (dtw != null && dtw != dwq.INSTANCE) {
                dtw.unsubscribe();
            }
        }
    }

    public boolean isUnsubscribed() {
        return get() == dwq.INSTANCE;
    }
}

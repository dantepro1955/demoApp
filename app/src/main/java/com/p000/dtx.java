package com.p000;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MainThreadSubscription */
/* renamed from: dtx */
public abstract class dtx implements dtw {
    /* renamed from: a */
    private final AtomicBoolean f22930a = new AtomicBoolean();

    /* compiled from: MainThreadSubscription */
    /* renamed from: dtx$1 */
    class C50961 implements duk {
        /* renamed from: a */
        final /* synthetic */ dtx f22929a;

        C50961(dtx dtx) {
            this.f22929a = dtx;
        }

        /* renamed from: a */
        public void mo4643a() {
            this.f22929a.m29359a();
        }
    }

    /* renamed from: a */
    protected abstract void m29359a();

    /* renamed from: b */
    public static void m29358b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
        }
    }

    public final boolean isUnsubscribed() {
        return this.f22930a.get();
    }

    public final void unsubscribe() {
        if (!this.f22930a.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m29359a();
        } else {
            dua.m29393a().createWorker().mo4644a(new C50961(this));
        }
    }
}

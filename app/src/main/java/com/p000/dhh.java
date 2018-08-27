package com.p000;

import android.os.Looper;

/* compiled from: ThreadEnforcer */
/* renamed from: dhh */
public interface dhh {
    /* renamed from: a */
    public static final dhh f21628a = new C49051();
    /* renamed from: b */
    public static final dhh f21629b = new C49062();

    /* compiled from: ThreadEnforcer */
    /* renamed from: dhh$1 */
    static class C49051 implements dhh {
        C49051() {
        }

        /* renamed from: a */
        public void mo4410a(dgz dgz) {
        }
    }

    /* compiled from: ThreadEnforcer */
    /* renamed from: dhh$2 */
    static class C49062 implements dhh {
        C49062() {
        }

        /* renamed from: a */
        public void mo4410a(dgz dgz) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("Event bus " + dgz + " accessed from non-main thread " + Looper.myLooper());
            }
        }
    }

    /* renamed from: a */
    void mo4410a(dgz dgz);
}

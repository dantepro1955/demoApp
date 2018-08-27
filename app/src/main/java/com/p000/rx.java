package com.p000;

/* compiled from: TaskCompletionSource */
/* renamed from: rx */
public class rx<TResult> {
    /* renamed from: a */
    private final rw<TResult> f25390a = new rw();

    /* renamed from: a */
    public rw<TResult> m33993a() {
        return this.f25390a;
    }

    /* renamed from: b */
    public boolean m33998b() {
        return this.f25390a.m34027i();
    }

    /* renamed from: a */
    public boolean m33995a(TResult tResult) {
        return this.f25390a.m34019b((Object) tResult);
    }

    /* renamed from: a */
    public boolean m33994a(Exception exception) {
        return this.f25390a.m34018b(exception);
    }

    /* renamed from: c */
    public void m33999c() {
        if (!m33998b()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    /* renamed from: b */
    public void m33997b(TResult tResult) {
        if (!m33995a((Object) tResult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    /* renamed from: b */
    public void m33996b(Exception exception) {
        if (!m33994a(exception)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }
}

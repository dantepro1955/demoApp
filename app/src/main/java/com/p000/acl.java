package com.p000;

/* compiled from: TrimmedThrowableData */
/* renamed from: acl */
class acl {
    /* renamed from: a */
    public final String f366a;
    /* renamed from: b */
    public final String f367b;
    /* renamed from: c */
    public final StackTraceElement[] f368c;
    /* renamed from: d */
    public final acl f369d;

    public acl(Throwable th, ack ack) {
        this.f366a = th.getLocalizedMessage();
        this.f367b = th.getClass().getName();
        this.f368c = ack.mo27a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f369d = cause != null ? new acl(cause, ack) : null;
    }
}

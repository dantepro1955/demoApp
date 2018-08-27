package com.p000;

/* compiled from: OnCompletedFailedException */
/* renamed from: duf */
public final class duf extends RuntimeException {
    private static final long serialVersionUID = 8622579378868820554L;

    public duf(String str, Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        super(str, th);
    }
}

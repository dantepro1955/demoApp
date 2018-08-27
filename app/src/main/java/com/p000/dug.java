package com.p000;

/* compiled from: OnErrorFailedException */
/* renamed from: dug */
public class dug extends RuntimeException {
    private static final long serialVersionUID = -419289748403337611L;

    public dug(String str, Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        super(str, th);
    }

    public dug(Throwable th) {
        String message = th != null ? th.getMessage() : null;
        if (th == null) {
            th = new NullPointerException();
        }
        super(message, th);
    }
}

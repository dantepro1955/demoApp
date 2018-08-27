package com.p000;

/* compiled from: OnErrorNotImplementedException */
/* renamed from: duh */
public class duh extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public duh(String str, Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        super(str, th);
    }

    public duh(Throwable th) {
        String message = th != null ? th.getMessage() : null;
        if (th == null) {
            th = new NullPointerException();
        }
        super(message, th);
    }
}

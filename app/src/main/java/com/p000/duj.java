package com.p000;

/* compiled from: UnsubscribeFailedException */
/* renamed from: duj */
public final class duj extends RuntimeException {
    private static final long serialVersionUID = 4594672310593167598L;

    public duj(String str, Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        super(str, th);
    }
}

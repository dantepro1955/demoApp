package com.p000;

/* compiled from: ExecutorException */
/* renamed from: rv */
public class rv extends RuntimeException {
    public rv(Exception exception) {
        super("An exception was thrown by an Executor", exception);
    }
}

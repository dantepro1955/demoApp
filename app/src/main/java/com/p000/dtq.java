package com.p000;

/* compiled from: Observer */
/* renamed from: dtq */
public interface dtq<T> {
    void onCompleted();

    void onError(Throwable th);

    void onNext(T t);
}

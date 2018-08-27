package com.p000;

import java.util.ArrayList;

/* compiled from: ProxyArrayList */
/* renamed from: ddk */
public class ddk<E> extends ArrayList<E> {
    /* renamed from: a */
    private boolean f21256a = false;

    /* renamed from: a */
    public void m26615a(boolean z) {
        this.f21256a = z;
    }

    /* renamed from: a */
    public E m26614a(int i) {
        return super.get(i);
    }

    public E get(int i) {
        return this.f21256a ? super.get((size() - i) - 1) : m26614a(i);
    }
}

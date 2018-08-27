package com.p000;

/* renamed from: sg */
public abstract class sg {
    /* renamed from: a */
    private int f25305a;

    public sg(int i) {
        this.f25305a = i;
    }

    public boolean equals(Object obj) {
        return obj.getClass().getName().equals(getClass().getName()) && ((sg) obj).f25305a == this.f25305a;
    }
}

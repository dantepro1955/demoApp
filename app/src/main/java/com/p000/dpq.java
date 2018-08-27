package com.p000;

import p000.rh.C5006j;

/* renamed from: dpq */
public final class dpq extends dpj implements C5006j {
    /* renamed from: a */
    private dnd f22531a;

    public dpq(String str, dnd dnd, byte b) {
        super(str);
        if (b == (byte) 1) {
            super.m28618a((byte) 6);
        } else if (b == (byte) 2) {
            super.m28618a((byte) 7);
        } else {
            super.m28618a((byte) 8);
        }
        this.f22531a = dnd;
    }

    /* renamed from: a */
    protected final byte[] m28640a() {
        return this.f22531a.m28209b();
    }
}

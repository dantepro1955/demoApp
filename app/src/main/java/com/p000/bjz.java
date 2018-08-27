package com.p000;

import android.os.Bundle;

@bhd
/* renamed from: bjz */
public class bjz {
    /* renamed from: a */
    private final Object f6633a;
    /* renamed from: b */
    private int f6634b;
    /* renamed from: c */
    private int f6635c;
    /* renamed from: d */
    private final bjw f6636d;
    /* renamed from: e */
    private final String f6637e;

    bjz(bjw bjw, String str) {
        this.f6633a = new Object();
        this.f6636d = bjw;
        this.f6637e = str;
    }

    public bjz(String str) {
        this(ako.m2347i(), str);
    }

    /* renamed from: a */
    public Bundle m8980a() {
        Bundle bundle;
        synchronized (this.f6633a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f6634b);
            bundle.putInt("pmnll", this.f6635c);
        }
        return bundle;
    }

    /* renamed from: a */
    public void m8981a(int i, int i2) {
        synchronized (this.f6633a) {
            this.f6634b = i;
            this.f6635c = i2;
            this.f6636d.m8933a(this.f6637e, this);
        }
    }
}

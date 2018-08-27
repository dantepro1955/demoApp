package com.p000;

import java.util.Vector;

/* renamed from: dqr */
public class dqr implements dqn {
    /* renamed from: a */
    private static final rk f22618a = dnn.m28258a(dqr.class);
    /* renamed from: b */
    private Vector f22619b;

    public dqr(Vector vector) {
        if (f22618a.mo4276b()) {
            f22618a.mo4275b("Received " + vector.size() + " sentences constituting the dictation result.");
        }
        this.f22619b = vector;
        for (int i = 0; i < this.f22619b.size(); i++) {
            dqs dqs = (dqs) vector.elementAt(i);
            dqs.m28759a(this);
            dqs.m28762c();
        }
    }

    /* renamed from: a */
    public final int mo4551a() {
        return this.f22619b.size();
    }

    /* renamed from: a */
    public final dqp mo4552a(int i) {
        return (i < 0 || i >= this.f22619b.size()) ? null : (dqp) this.f22619b.elementAt(i);
    }

    public String toString() {
        return this.f22619b.size() > 0 ? this.f22619b.elementAt(0).toString() : "";
    }
}

package com.p000;

import java.util.HashSet;

/* compiled from: PriorityQueuePool */
/* renamed from: ctg */
public abstract class ctg extends dhv {
    /* renamed from: b */
    private dho f20182b = new dho();
    /* renamed from: c */
    private HashSet<String> f20183c = new HashSet();
    /* renamed from: d */
    private int f20184d;

    /* renamed from: a */
    public abstract dhq m24870a(dhp dhp);

    public ctg(int i, int i2) {
        super(i, i2);
        this.f20184d = i2;
    }

    /* renamed from: b */
    public void m24872b(dhp dhp) {
        this.f20182b.m27305a(dhp);
        if (m24867d().getQueue().size() < this.f20184d + 2) {
            m24867d().execute(m24870a(dhp));
        }
    }

    /* renamed from: b */
    public HashSet<String> m24871b() {
        return this.f20183c;
    }

    /* renamed from: c */
    public dho m24873c() {
        return this.f20182b;
    }
}

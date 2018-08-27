package com.p000;

import p000.bwu.C1568a;
import p000.dtp.C5092a;

/* compiled from: BehaviorRelay */
/* renamed from: bwr */
public class bwr<T> extends bwt<T, T> {
    /* renamed from: c */
    private static final Object[] f8023c = new Object[0];
    /* renamed from: b */
    private final bwu<T> f8024b;

    /* renamed from: a */
    public static <T> bwr<T> m11554a() {
        return bwr.m11555a(null, false);
    }

    /* renamed from: a */
    private static <T> bwr<T> m11555a(T t, boolean z) {
        final Object bwu = new bwu();
        if (z) {
            bwu.m11570a(bws.m11556a(t));
        }
        bwu.f8038d = new dul<C1568a<T>>() {
            public /* synthetic */ void call(Object obj) {
                m11553a((C1568a) obj);
            }

            /* renamed from: a */
            public void m11553a(C1568a<T> c1568a) {
                c1568a.m11562b(bwu.m11567a());
            }
        };
        return new bwr(bwu, bwu);
    }

    protected bwr(C5092a<T> c5092a, bwu<T> bwu) {
        super(c5092a);
        this.f8024b = bwu;
    }

    public void call(T t) {
        if (this.f8024b.m11567a() == null || this.f8024b.f8036b) {
            Object a = bws.m11556a(t);
            for (C1568a a2 : this.f8024b.m11571b(a)) {
                a2.m11561a(a);
            }
        }
    }
}

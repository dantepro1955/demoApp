package com.p000;

import java.util.ArrayList;
import java.util.List;
import p000.dtp.C5092a;
import p000.dyr.C5252b;

/* compiled from: BehaviorSubject */
/* renamed from: dyn */
public final class dyn<T> extends dyq<T, T> {
    /* renamed from: b */
    private static final Object[] f23490b = new Object[0];
    /* renamed from: c */
    private final dyr<T> f23491c;

    /* renamed from: a */
    public static <T> dyn<T> m29862a() {
        return dyn.m29863a(null, false);
    }

    /* renamed from: a */
    private static <T> dyn<T> m29863a(T t, boolean z) {
        final Object dyr = new dyr();
        if (z) {
            dyr.m29879a(duw.m29441a((Object) t));
        }
        dyr.f23517d = new dul<C5252b<T>>() {
            public /* synthetic */ void call(Object obj) {
                m29861a((C5252b) obj);
            }

            /* renamed from: a */
            public void m29861a(C5252b<T> c5252b) {
                c5252b.m29874b(dyr.m29876a());
            }
        };
        dyr.f23518e = dyr.f23517d;
        return new dyn(dyr, dyr);
    }

    protected dyn(C5092a<T> c5092a, dyr<T> dyr) {
        super(c5092a);
        this.f23491c = dyr;
    }

    public void onCompleted() {
        if (this.f23491c.m29876a() == null || this.f23491c.f23515b) {
            Object a = duw.m29440a();
            for (C5252b a2 : this.f23491c.m29883c(a)) {
                a2.m29872a(a);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f23491c.m29876a() == null || this.f23491c.f23515b) {
            Object a = duw.m29442a(th);
            List list = null;
            for (C5252b a2 : this.f23491c.m29883c(a)) {
                try {
                    a2.m29872a(a);
                } catch (Throwable th2) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(th2);
                }
            }
            dud.m29408a(list);
        }
    }

    public void onNext(T t) {
        if (this.f23491c.m29876a() == null || this.f23491c.f23515b) {
            Object a = duw.m29441a((Object) t);
            for (C5252b a2 : this.f23491c.m29882b(a)) {
                a2.m29872a(a);
            }
        }
    }
}

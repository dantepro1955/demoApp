package com.p000;

import java.util.Vector;
import p000.sl.C5696a;

/* renamed from: qv */
public final class qv extends sl {

    /* renamed from: qv$a */
    public final class C5697a extends C5696a {
        public C5697a(qv qvVar) {
            super(qvVar);
        }
    }

    public qv() {
        super(0);
    }

    private qv(int i) {
        super(i);
    }

    /* renamed from: a */
    public final C5697a m33934a() {
        return new C5697a(this);
    }

    /* renamed from: b */
    public final qv m33935b() {
        qv qvVar = new qv(m33933f());
        C5697a a = m33934a();
        while (a.m33926a()) {
            qvVar.m33930a(a.m33927b());
        }
        return qvVar;
    }

    /* renamed from: c */
    public final Vector m33936c() {
        Vector vector = new Vector(m33933f());
        C5697a a = m33934a();
        while (a.m33926a()) {
            vector.addElement(a.m33927b());
        }
        return vector;
    }
}

package com.p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import p000.atp.C0794a;
import p000.atr.C0800a;

/* renamed from: awf */
public class awf extends axp {
    /* renamed from: i */
    private static volatile atw f4763i = null;
    /* renamed from: j */
    private static final Object f4764j = new Object();
    /* renamed from: k */
    private C0794a f4765k = null;

    public awf(avx avx, String str, String str2, C0800a c0800a, int i, int i2, C0794a c0794a) {
        super(avx, str, str2, c0800a, i, i2);
        this.f4765k = c0794a;
    }

    /* renamed from: a */
    public static Boolean m6137a(C0794a c0794a) {
        boolean z = false;
        if (!avz.m6119b(awf.m6139b(c0794a))) {
            return Boolean.valueOf(false);
        }
        if (!(c0794a == null || c0794a.f4340a == null || c0794a.f4340a.f4342a.intValue() != 3)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    private void m6138a(int i) throws IllegalAccessException, InvocationTargetException {
        boolean z = false;
        Method method = this.f;
        Object[] objArr = new Object[2];
        objArr[0] = this.b.m6093a();
        if (i == 2) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        f4763i = new atw((String) method.invoke(null, objArr));
        if (avz.m6119b(f4763i.f4511a) || f4763i.f4511a.equals("E")) {
            switch (i) {
                case 3:
                    String f = m6143f();
                    if (!avz.m6119b(f)) {
                        f4763i.f4511a = f;
                        return;
                    }
                    return;
                case 4:
                    f4763i.f4511a = this.f4765k.f4341b.f4343a;
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public static String m6139b(C0794a c0794a) {
        return (c0794a == null || c0794a.f4341b == null || avz.m6119b(c0794a.f4341b.f4343a)) ? null : c0794a.f4341b.f4343a;
    }

    /* renamed from: c */
    private boolean m6140c() {
        return f4763i == null || avz.m6119b(f4763i.f4511a) || f4763i.f4511a.equals("E");
    }

    /* renamed from: d */
    private int m6141d() {
        return !avz.m6119b(awf.m6139b(this.f4765k)) ? 4 : (awf.m6137a(this.f4765k).booleanValue() && m6142e()) ? 3 : 2;
    }

    /* renamed from: e */
    private boolean m6142e() {
        return this.b.m6105k() && ((Boolean) bbb.bQ.m7064c()).booleanValue() && ((Boolean) bbb.bR.m7064c()).booleanValue() && ((Boolean) bbb.bP.m7064c()).booleanValue();
    }

    /* renamed from: f */
    private String m6143f() {
        try {
            if (this.b.m6107m() != null) {
                this.b.m6107m().get();
            }
            C0800a l = this.b.m6106l();
            if (!(l == null || l.f4422w == null)) {
                return l.f4422w;
            }
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        }
        return null;
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        if (m6140c()) {
            synchronized (f4764j) {
                int d = m6141d();
                if (d == 3) {
                    this.b.m6108n();
                }
                m6138a(d);
            }
        }
        synchronized (this.e) {
            if (f4763i != null) {
                this.e.f4422w = f4763i.f4511a;
                this.e.f4376C = Long.valueOf(f4763i.f4512b);
                this.e.f4375B = f4763i.f4513c;
                this.e.f4386M = f4763i.f4514d;
                this.e.f4387N = f4763i.f4515e;
            }
        }
    }
}

package com.p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: EventProducer */
/* renamed from: dhc */
class dhc {
    /* renamed from: a */
    final Object f21622a;
    /* renamed from: b */
    private final Method f21623b;
    /* renamed from: c */
    private final int f21624c;
    /* renamed from: d */
    private boolean f21625d = true;

    dhc(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventProducer target cannot be null.");
        } else if (method == null) {
            throw new NullPointerException("EventProducer method cannot be null.");
        } else {
            this.f21622a = obj;
            this.f21623b = method;
            method.setAccessible(true);
            this.f21624c = ((method.hashCode() + 31) * 31) + obj.hashCode();
        }
    }

    /* renamed from: a */
    public boolean m27273a() {
        return this.f21625d;
    }

    /* renamed from: b */
    public void m27274b() {
        this.f21625d = false;
    }

    /* renamed from: c */
    public Object m27275c() throws InvocationTargetException {
        if (this.f21625d) {
            try {
                return this.f21623b.invoke(this.f21622a, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof Error) {
                    throw ((Error) e2.getCause());
                }
                throw e2;
            }
        }
        throw new IllegalStateException(toString() + " has been invalidated and can no longer produce events.");
    }

    public String toString() {
        return "[EventProducer " + this.f21623b + "]";
    }

    public int hashCode() {
        return this.f21624c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        dhc dhc = (dhc) obj;
        if (this.f21623b.equals(dhc.f21623b) && this.f21622a == dhc.f21622a) {
            return true;
        }
        return false;
    }
}

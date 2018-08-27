package com.p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: EventHandler */
/* renamed from: dhb */
class dhb {
    /* renamed from: a */
    private final Object f21618a;
    /* renamed from: b */
    private final Method f21619b;
    /* renamed from: c */
    private final int f21620c;
    /* renamed from: d */
    private boolean f21621d = true;

    dhb(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventHandler target cannot be null.");
        } else if (method == null) {
            throw new NullPointerException("EventHandler method cannot be null.");
        } else {
            this.f21618a = obj;
            this.f21619b = method;
            method.setAccessible(true);
            this.f21620c = ((method.hashCode() + 31) * 31) + obj.hashCode();
        }
    }

    /* renamed from: a */
    public boolean m27271a() {
        return this.f21621d;
    }

    /* renamed from: b */
    public void m27272b() {
        this.f21621d = false;
    }

    /* renamed from: a */
    public void m27270a(Object obj) throws InvocationTargetException {
        if (this.f21621d) {
            try {
                this.f21619b.invoke(this.f21618a, new Object[]{obj});
                return;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof Error) {
                    throw ((Error) e2.getCause());
                }
                throw e2;
            }
        }
        throw new IllegalStateException(toString() + " has been invalidated and can no longer handle events.");
    }

    public String toString() {
        return "[EventHandler " + this.f21619b + "]";
    }

    public int hashCode() {
        return this.f21620c;
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
        dhb dhb = (dhb) obj;
        if (this.f21619b.equals(dhb.f21619b) && this.f21618a == dhb.f21618a) {
            return true;
        }
        return false;
    }
}

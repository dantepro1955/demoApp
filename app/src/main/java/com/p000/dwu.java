package com.p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ExceptionsUtils */
/* renamed from: dwu */
public enum dwu {
    ;
    
    /* renamed from: a */
    private static final Throwable f23349a = null;

    static {
        f23349a = new Throwable("Terminated");
    }

    /* renamed from: a */
    public static boolean m29657a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Object obj;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == f23349a) {
                return false;
            }
            if (th2 == null) {
                obj = th;
            } else if (th2 instanceof duc) {
                Collection arrayList = new ArrayList(((duc) th2).a());
                arrayList.add(th);
                obj = new duc(arrayList);
            } else {
                obj = new duc(new Throwable[]{th2, th});
            }
        } while (!atomicReference.compareAndSet(th2, obj));
        return true;
    }

    /* renamed from: a */
    public static Throwable m29655a(AtomicReference<Throwable> atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        if (th != f23349a) {
            return (Throwable) atomicReference.getAndSet(f23349a);
        }
        return th;
    }

    /* renamed from: a */
    public static boolean m29656a(Throwable th) {
        return th == f23349a;
    }
}

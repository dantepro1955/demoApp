package com.p000;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Exceptions */
/* renamed from: dud */
public final class dud {
    /* renamed from: a */
    public static RuntimeException m29403a(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: b */
    public static void m29409b(Throwable th) {
        if (th instanceof duh) {
            throw ((duh) th);
        } else if (th instanceof dug) {
            throw ((dug) th);
        } else if (th instanceof duf) {
            throw ((duf) th);
        } else if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: a */
    public static void m29407a(Throwable th, Throwable th2) {
        Set hashSet = new HashSet();
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i < 25) {
                th = th.getCause();
                if (!hashSet.contains(th.getCause())) {
                    hashSet.add(th.getCause());
                    i = i2;
                }
            } else {
                return;
            }
        }
        try {
            th.initCause(th2);
        } catch (Throwable th3) {
        }
    }

    /* renamed from: c */
    public static Throwable m29410c(Throwable th) {
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            th = th.getCause();
            i = i2;
        }
        return th;
    }

    /* renamed from: a */
    public static void m29408a(List<? extends Throwable> list) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                Throwable th = (Throwable) list.get(0);
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                } else if (th instanceof Error) {
                    throw ((Error) th);
                } else {
                    throw new RuntimeException(th);
                }
            }
            throw new duc(list);
        }
    }

    /* renamed from: a */
    public static void m29405a(Throwable th, dtq<?> dtq, Object obj) {
        dud.m29409b(th);
        dtq.onError(dui.m29414a(th, obj));
    }

    /* renamed from: a */
    public static void m29404a(Throwable th, dtq<?> dtq) {
        dud.m29409b(th);
        dtq.onError(th);
    }

    /* renamed from: a */
    public static void m29406a(Throwable th, dtu<?> dtu) {
        dud.m29409b(th);
        dtu.mo4661a(th);
    }
}

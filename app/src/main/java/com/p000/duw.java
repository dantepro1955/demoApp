package com.p000;

import java.io.Serializable;

/* compiled from: NotificationLite */
/* renamed from: duw */
public final class duw {
    /* renamed from: a */
    private static final Object f22985a = new C51151();
    /* renamed from: b */
    private static final Object f22986b = new C51162();

    /* compiled from: NotificationLite */
    /* renamed from: duw$1 */
    static class C51151 implements Serializable {
        private static final long serialVersionUID = 1;

        C51151() {
        }

        public String toString() {
            return "Notification=>Completed";
        }
    }

    /* compiled from: NotificationLite */
    /* renamed from: duw$2 */
    static class C51162 implements Serializable {
        private static final long serialVersionUID = 2;

        C51162() {
        }

        public String toString() {
            return "Notification=>NULL";
        }
    }

    /* compiled from: NotificationLite */
    /* renamed from: duw$a */
    static final class C5117a implements Serializable {
        private static final long serialVersionUID = 3;
        /* renamed from: a */
        final Throwable f22984a;

        public C5117a(Throwable th) {
            this.f22984a = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.f22984a;
        }
    }

    /* renamed from: a */
    public static <T> Object m29441a(T t) {
        if (t == null) {
            return f22986b;
        }
        return t;
    }

    /* renamed from: a */
    public static Object m29440a() {
        return f22985a;
    }

    /* renamed from: a */
    public static Object m29442a(Throwable th) {
        return new C5117a(th);
    }

    /* renamed from: a */
    public static <T> boolean m29443a(dtq<? super T> dtq, Object obj) {
        if (obj == f22985a) {
            dtq.onCompleted();
            return true;
        } else if (obj == f22986b) {
            dtq.onNext(null);
            return false;
        } else if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        } else if (obj.getClass() == C5117a.class) {
            dtq.onError(((C5117a) obj).f22984a);
            return true;
        } else {
            dtq.onNext(obj);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m29444b(Object obj) {
        return obj == f22985a;
    }

    /* renamed from: c */
    public static <T> T m29445c(Object obj) {
        return obj == f22986b ? null : obj;
    }
}

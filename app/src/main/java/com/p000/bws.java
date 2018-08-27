package com.p000;

import java.io.Serializable;

/* compiled from: NotificationLite */
/* renamed from: bws */
final class bws {
    /* renamed from: a */
    private static final Object f8025a = new C15661();

    /* compiled from: NotificationLite */
    /* renamed from: bws$1 */
    static class C15661 implements Serializable {
        private static final long serialVersionUID = 2;

        C15661() {
        }

        public String toString() {
            return "Notification=>NULL";
        }
    }

    /* renamed from: a */
    public static <T> Object m11556a(T t) {
        if (t == null) {
            return f8025a;
        }
        return t;
    }

    /* renamed from: a */
    public static <T> boolean m11557a(dtq<? super T> dtq, Object obj) {
        if (obj == f8025a) {
            dtq.onNext(null);
        } else if (obj != null) {
            dtq.onNext(obj);
        } else {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
        return false;
    }
}

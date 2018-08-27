package com.p000;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* compiled from: OnErrorThrowable */
/* renamed from: dui */
public final class dui extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;

    /* compiled from: OnErrorThrowable */
    /* renamed from: dui$a */
    public static class C5107a extends RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        /* renamed from: a */
        private final Object f22965a;

        /* compiled from: OnErrorThrowable */
        /* renamed from: dui$a$a */
        static final class C5106a {
            /* renamed from: a */
            static final Set<Class<?>> f22964a = C5106a.m29411a();

            /* renamed from: a */
            private static Set<Class<?>> m29411a() {
                Set<Class<?>> hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                return hashSet;
            }
        }

        public C5107a(Object obj) {
            super("OnError while emitting onNext value: " + C5107a.m29412a(obj));
            if (!(obj instanceof Serializable)) {
                try {
                    obj = String.valueOf(obj);
                } catch (Throwable th) {
                    obj = th.getMessage();
                }
            }
            this.f22965a = obj;
        }

        /* renamed from: a */
        public Object m29413a() {
            return this.f22965a;
        }

        /* renamed from: a */
        static String m29412a(Object obj) {
            if (obj == null) {
                return "null";
            }
            if (C5106a.f22964a.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String a = dyj.a().b().a(obj);
            if (a != null) {
                return a;
            }
            return obj.getClass().getName() + ".class";
        }
    }

    /* renamed from: a */
    public static Throwable m29414a(Throwable th, Object obj) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable c = dud.m29410c(th);
        if (!((c instanceof C5107a) && ((C5107a) c).m29413a() == obj)) {
            dud.m29407a(th, new C5107a(obj));
        }
        return th;
    }
}

package com.p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aoh */
public final class aoh {

    /* renamed from: aoh$a */
    public static final class C0659a {
        /* renamed from: a */
        private final List<String> f3818a;
        /* renamed from: b */
        private final Object f3819b;

        private C0659a(Object obj) {
            this.f3819b = aoi.m4679a(obj);
            this.f3818a = new ArrayList();
        }

        /* renamed from: a */
        public C0659a m4674a(String str, Object obj) {
            List list = this.f3818a;
            String str2 = (String) aoi.m4679a((Object) str);
            String valueOf = String.valueOf(String.valueOf(obj));
            list.add(new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(valueOf).length()).append(str2).append("=").append(valueOf).toString());
            return this;
        }

        public String toString() {
            StringBuilder append = new StringBuilder(100).append(this.f3819b.getClass().getSimpleName()).append('{');
            int size = this.f3818a.size();
            for (int i = 0; i < size; i++) {
                append.append((String) this.f3818a.get(i));
                if (i < size - 1) {
                    append.append(", ");
                }
            }
            return append.append('}').toString();
        }
    }

    /* renamed from: a */
    public static int m4675a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C0659a m4676a(Object obj) {
        return new C0659a(obj);
    }

    /* renamed from: a */
    public static boolean m4677a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}

package com.p000;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bnt */
public class bnt {
    /* renamed from: a */
    public static String f7177a = "Volley";
    /* renamed from: b */
    public static boolean f7178b = Log.isLoggable(f7177a, 2);

    /* renamed from: bnt$a */
    static class C1360a {
        /* renamed from: a */
        public static final boolean f7174a = bnt.f7178b;
        /* renamed from: b */
        private final List<C1359a> f7175b = new ArrayList();
        /* renamed from: c */
        private boolean f7176c = false;

        /* renamed from: bnt$a$a */
        static class C1359a {
            /* renamed from: a */
            public final String f7171a;
            /* renamed from: b */
            public final long f7172b;
            /* renamed from: c */
            public final long f7173c;

            public C1359a(String str, long j, long j2) {
                this.f7171a = str;
                this.f7172b = j;
                this.f7173c = j2;
            }
        }

        C1360a() {
        }

        /* renamed from: a */
        private long m10016a() {
            if (this.f7175b.size() == 0) {
                return 0;
            }
            return ((C1359a) this.f7175b.get(this.f7175b.size() - 1)).f7173c - ((C1359a) this.f7175b.get(0)).f7173c;
        }

        /* renamed from: a */
        public synchronized void m10017a(String str) {
            this.f7176c = true;
            if (m10016a() > 0) {
                long j = ((C1359a) this.f7175b.get(0)).f7173c;
                bnt.m10021b("(%-4d ms) %s", Long.valueOf(r2), str);
                long j2 = j;
                for (C1359a c1359a : this.f7175b) {
                    bnt.m10021b("(+%-4d) [%2d] %s", Long.valueOf(c1359a.f7173c - j2), Long.valueOf(c1359a.f7172b), c1359a.f7171a);
                    j2 = c1359a.f7173c;
                }
            }
        }

        /* renamed from: a */
        public synchronized void m10018a(String str, long j) {
            if (this.f7176c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f7175b.add(new C1359a(str, j, SystemClock.elapsedRealtime()));
        }

        protected void finalize() throws Throwable {
            if (!this.f7176c) {
                m10017a("Request on the loose");
                bnt.m10022c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m10019a(String str, Object... objArr) {
        if (f7178b) {
            Log.v(f7177a, bnt.m10023d(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m10020a(Throwable th, String str, Object... objArr) {
        Log.e(f7177a, bnt.m10023d(str, objArr), th);
    }

    /* renamed from: b */
    public static void m10021b(String str, Object... objArr) {
        Log.d(f7177a, bnt.m10023d(str, objArr));
    }

    /* renamed from: c */
    public static void m10022c(String str, Object... objArr) {
        Log.e(f7177a, bnt.m10023d(str, objArr));
    }

    /* renamed from: d */
    private static String m10023d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str3 = "<unknown>";
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClass().equals(bnt.class)) {
                str3 = stackTrace[i].getClassName();
                str3 = str3.substring(str3.lastIndexOf(46) + 1);
                str2 = str3.substring(str3.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            }
        }
        str2 = str3;
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}

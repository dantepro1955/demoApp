package com.p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: aqv */
public abstract class aqv<T> {

    /* renamed from: aqv$a */
    public static class C0708a extends aqv<Boolean> {

        /* renamed from: aqv$a$1 */
        class C07071 implements Callable<Boolean> {
            /* renamed from: a */
            final /* synthetic */ SharedPreferences f3965a;
            /* renamed from: b */
            final /* synthetic */ String f3966b;
            /* renamed from: c */
            final /* synthetic */ Boolean f3967c;

            C07071(SharedPreferences sharedPreferences, String str, Boolean bool) {
                this.f3965a = sharedPreferences;
                this.f3966b = str;
                this.f3967c = bool;
            }

            /* renamed from: a */
            public Boolean m4979a() {
                return Boolean.valueOf(this.f3965a.getBoolean(this.f3966b, this.f3967c.booleanValue()));
            }

            public /* synthetic */ Object call() throws Exception {
                return m4979a();
            }
        }

        /* renamed from: a */
        public static Boolean m4980a(SharedPreferences sharedPreferences, String str, Boolean bool) {
            return (Boolean) aub.m5733a(new C07071(sharedPreferences, str, bool));
        }
    }

    /* renamed from: aqv$b */
    public static class C0710b extends aqv<Integer> {

        /* renamed from: aqv$b$1 */
        class C07091 implements Callable<Integer> {
            /* renamed from: a */
            final /* synthetic */ SharedPreferences f3968a;
            /* renamed from: b */
            final /* synthetic */ String f3969b;
            /* renamed from: c */
            final /* synthetic */ Integer f3970c;

            C07091(SharedPreferences sharedPreferences, String str, Integer num) {
                this.f3968a = sharedPreferences;
                this.f3969b = str;
                this.f3970c = num;
            }

            /* renamed from: a */
            public Integer m4981a() {
                return Integer.valueOf(this.f3968a.getInt(this.f3969b, this.f3970c.intValue()));
            }

            public /* synthetic */ Object call() throws Exception {
                return m4981a();
            }
        }

        /* renamed from: a */
        public static Integer m4982a(SharedPreferences sharedPreferences, String str, Integer num) {
            return (Integer) aub.m5733a(new C07091(sharedPreferences, str, num));
        }
    }

    /* renamed from: aqv$c */
    public static class C0712c extends aqv<Long> {

        /* renamed from: aqv$c$1 */
        class C07111 implements Callable<Long> {
            /* renamed from: a */
            final /* synthetic */ SharedPreferences f3971a;
            /* renamed from: b */
            final /* synthetic */ String f3972b;
            /* renamed from: c */
            final /* synthetic */ Long f3973c;

            C07111(SharedPreferences sharedPreferences, String str, Long l) {
                this.f3971a = sharedPreferences;
                this.f3972b = str;
                this.f3973c = l;
            }

            /* renamed from: a */
            public Long m4983a() {
                return Long.valueOf(this.f3971a.getLong(this.f3972b, this.f3973c.longValue()));
            }

            public /* synthetic */ Object call() throws Exception {
                return m4983a();
            }
        }

        /* renamed from: a */
        public static Long m4984a(SharedPreferences sharedPreferences, String str, Long l) {
            return (Long) aub.m5733a(new C07111(sharedPreferences, str, l));
        }
    }

    /* renamed from: aqv$d */
    public static class C0714d extends aqv<String> {

        /* renamed from: aqv$d$1 */
        class C07131 implements Callable<String> {
            /* renamed from: a */
            final /* synthetic */ SharedPreferences f3974a;
            /* renamed from: b */
            final /* synthetic */ String f3975b;
            /* renamed from: c */
            final /* synthetic */ String f3976c;

            C07131(SharedPreferences sharedPreferences, String str, String str2) {
                this.f3974a = sharedPreferences;
                this.f3975b = str;
                this.f3976c = str2;
            }

            /* renamed from: a */
            public String m4985a() {
                return this.f3974a.getString(this.f3975b, this.f3976c);
            }

            public /* synthetic */ Object call() throws Exception {
                return m4985a();
            }
        }

        /* renamed from: a */
        public static String m4986a(SharedPreferences sharedPreferences, String str, String str2) {
            return (String) aub.m5733a(new C07131(sharedPreferences, str, str2));
        }
    }
}

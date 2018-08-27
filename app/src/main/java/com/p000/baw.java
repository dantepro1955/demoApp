package com.p000;

import android.content.SharedPreferences;

@bhd
/* renamed from: baw */
public abstract class baw<T> {
    /* renamed from: a */
    private final int f5287a;
    /* renamed from: b */
    private final String f5288b;
    /* renamed from: c */
    private final T f5289c;

    /* renamed from: baw$1 */
    class C09721 extends baw<Boolean> {
        C09721(int i, String str, Boolean bool) {
            super(i, str, bool);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo912a(SharedPreferences sharedPreferences) {
            return m7066b(sharedPreferences);
        }

        /* renamed from: b */
        public Boolean m7066b(SharedPreferences sharedPreferences) {
            return Boolean.valueOf(sharedPreferences.getBoolean(m7062a(), ((Boolean) m7063b()).booleanValue()));
        }
    }

    /* renamed from: baw$2 */
    class C09732 extends baw<Integer> {
        C09732(int i, String str, Integer num) {
            super(i, str, num);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo912a(SharedPreferences sharedPreferences) {
            return m7068b(sharedPreferences);
        }

        /* renamed from: b */
        public Integer m7068b(SharedPreferences sharedPreferences) {
            return Integer.valueOf(sharedPreferences.getInt(m7062a(), ((Integer) m7063b()).intValue()));
        }
    }

    /* renamed from: baw$3 */
    class C09743 extends baw<Long> {
        C09743(int i, String str, Long l) {
            super(i, str, l);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo912a(SharedPreferences sharedPreferences) {
            return m7070b(sharedPreferences);
        }

        /* renamed from: b */
        public Long m7070b(SharedPreferences sharedPreferences) {
            return Long.valueOf(sharedPreferences.getLong(m7062a(), ((Long) m7063b()).longValue()));
        }
    }

    /* renamed from: baw$4 */
    class C09754 extends baw<Float> {
        C09754(int i, String str, Float f) {
            super(i, str, f);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo912a(SharedPreferences sharedPreferences) {
            return m7072b(sharedPreferences);
        }

        /* renamed from: b */
        public Float m7072b(SharedPreferences sharedPreferences) {
            return Float.valueOf(sharedPreferences.getFloat(m7062a(), ((Float) m7063b()).floatValue()));
        }
    }

    /* renamed from: baw$5 */
    class C09765 extends baw<String> {
        C09765(int i, String str, String str2) {
            super(i, str, str2);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo912a(SharedPreferences sharedPreferences) {
            return m7074b(sharedPreferences);
        }

        /* renamed from: b */
        public String m7074b(SharedPreferences sharedPreferences) {
            return sharedPreferences.getString(m7062a(), (String) m7063b());
        }
    }

    private baw(int i, String str, T t) {
        this.f5287a = i;
        this.f5288b = str;
        this.f5289c = t;
        ako.m2354p().m7077a(this);
    }

    /* renamed from: a */
    public static baw<String> m7054a(int i, String str) {
        baw<String> a = baw.m7059a(i, str, null);
        ako.m2354p().m7079b(a);
        return a;
    }

    /* renamed from: a */
    public static baw<Float> m7055a(int i, String str, float f) {
        return new C09754(i, str, Float.valueOf(f));
    }

    /* renamed from: a */
    public static baw<Integer> m7056a(int i, String str, int i2) {
        return new C09732(i, str, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static baw<Long> m7057a(int i, String str, long j) {
        return new C09743(i, str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static baw<Boolean> m7058a(int i, String str, Boolean bool) {
        return new C09721(i, str, bool);
    }

    /* renamed from: a */
    public static baw<String> m7059a(int i, String str, String str2) {
        return new C09765(i, str, str2);
    }

    /* renamed from: b */
    public static baw<String> m7060b(int i, String str) {
        baw<String> a = baw.m7059a(i, str, null);
        ako.m2354p().m7080c(a);
        return a;
    }

    /* renamed from: a */
    protected abstract T mo912a(SharedPreferences sharedPreferences);

    /* renamed from: a */
    public String m7062a() {
        return this.f5288b;
    }

    /* renamed from: b */
    public T m7063b() {
        return this.f5289c;
    }

    /* renamed from: c */
    public T m7064c() {
        return ako.m2355q().m7124a(this);
    }
}

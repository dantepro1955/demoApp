package com.p000;

/* renamed from: asy */
public abstract class asy<T> {
    /* renamed from: c */
    private static final Object f4309c = new Object();
    /* renamed from: d */
    private static C0784a f4310d = null;
    /* renamed from: e */
    private static int f4311e = 0;
    /* renamed from: f */
    private static String f4312f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    /* renamed from: a */
    protected final String f4313a;
    /* renamed from: b */
    protected final T f4314b;
    /* renamed from: g */
    private T f4315g = null;

    /* renamed from: asy$1 */
    class C07791 extends asy<Boolean> {
        C07791(String str, Boolean bool) {
            super(str, bool);
        }
    }

    /* renamed from: asy$2 */
    class C07802 extends asy<Long> {
        C07802(String str, Long l) {
            super(str, l);
        }
    }

    /* renamed from: asy$3 */
    class C07813 extends asy<Integer> {
        C07813(String str, Integer num) {
            super(str, num);
        }
    }

    /* renamed from: asy$4 */
    class C07824 extends asy<Float> {
        C07824(String str, Float f) {
            super(str, f);
        }
    }

    /* renamed from: asy$5 */
    class C07835 extends asy<String> {
        C07835(String str, String str2) {
            super(str, str2);
        }
    }

    /* renamed from: asy$a */
    interface C0784a {
    }

    protected asy(String str, T t) {
        this.f4313a = str;
        this.f4314b = t;
    }

    /* renamed from: a */
    public static asy<Float> m5565a(String str, Float f) {
        return new C07824(str, f);
    }

    /* renamed from: a */
    public static asy<Integer> m5566a(String str, Integer num) {
        return new C07813(str, num);
    }

    /* renamed from: a */
    public static asy<Long> m5567a(String str, Long l) {
        return new C07802(str, l);
    }

    /* renamed from: a */
    public static asy<String> m5568a(String str, String str2) {
        return new C07835(str, str2);
    }

    /* renamed from: a */
    public static asy<Boolean> m5569a(String str, boolean z) {
        return new C07791(str, Boolean.valueOf(z));
    }
}

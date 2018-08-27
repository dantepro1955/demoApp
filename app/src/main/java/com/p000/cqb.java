package com.p000;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: LoginAccountUtil */
/* renamed from: cqb */
public class cqb {
    /* renamed from: a */
    private static final ThreadLocal<DateFormat> f19956a = new C45231();

    /* compiled from: LoginAccountUtil */
    /* renamed from: cqb$1 */
    static class C45231 extends ThreadLocal<DateFormat> {
        C45231() {
        }

        protected /* synthetic */ Object initialValue() {
            return m24361a();
        }

        /* renamed from: a */
        protected DateFormat m24361a() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    }

    /* renamed from: a */
    public static Date m24362a(String str) {
        try {
            return ((DateFormat) f19956a.get()).parse(str);
        } catch (ParseException e) {
            return null;
        }
    }
}

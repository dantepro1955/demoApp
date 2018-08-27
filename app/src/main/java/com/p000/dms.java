package com.p000;

import java.lang.reflect.Type;

/* compiled from: ParameterDeserializer */
/* renamed from: dms */
public class dms implements bug<dmr> {
    /* renamed from: b */
    public /* synthetic */ Object m28095b(buh buh, Type type, buf buf) throws bul {
        return m28094a(buh, type, buf);
    }

    /* renamed from: a */
    public dmr m28094a(buh buh, Type type, buf buf) throws bul {
        int i = 0;
        buk l = buh.l();
        String c = l.b("type").c();
        buh b = l.b("value");
        if ("integer".equals(c)) {
            return new dmr(b.f());
        }
        if ("double".equals(c)) {
            return new dmr(b.d());
        }
        if ("string".equals(c)) {
            return new dmr(b.c());
        }
        bue m;
        int a;
        if ("integer_array".equals(c)) {
            m = b.m();
            int[] iArr = new int[m.a()];
            a = m.a();
            while (i < a) {
                iArr[i] = m.a(i).f();
                i++;
            }
            return new dmr(iArr);
        } else if (!"string_array".equals(c)) {
            return null;
        } else {
            m = b.m();
            String[] strArr = new String[m.a()];
            a = m.a();
            while (i < a) {
                strArr[i] = m.a(i).c();
                i++;
            }
            return new dmr(strArr);
        }
    }
}

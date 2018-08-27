package com.p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: xu */
public class xu {
    /* renamed from: a */
    private static final xu f26000a = new xu();
    /* renamed from: b */
    private final Object f26001b = new Object();
    /* renamed from: c */
    private final Map f26002c = new HashMap(2);

    private xu() {
    }

    /* renamed from: a */
    static xu m34826a() {
        return f26000a;
    }

    /* renamed from: a */
    xw m34827a(String str) {
        xw xwVar;
        synchronized (this.f26001b) {
            xwVar = (xw) this.f26002c.remove(str);
        }
        return xwVar;
    }

    /* renamed from: a */
    void m34828a(String str, long j, String str2, boolean z) {
        xw xwVar = new xw(this, str2, j, z);
        synchronized (this.f26001b) {
            this.f26002c.put(str, xwVar);
        }
    }
}

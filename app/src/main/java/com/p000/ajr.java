package com.p000;

import android.content.Intent;

@bhd
/* renamed from: ajr */
public class ajr {
    /* renamed from: a */
    private final String f1717a;

    public ajr(String str) {
        this.f1717a = str;
    }

    /* renamed from: a */
    public String m1914a() {
        return ako.m2343e().m9132d();
    }

    /* renamed from: a */
    public boolean m1915a(String str, int i, Intent intent) {
        if (str == null || intent == null) {
            return false;
        }
        String b = ako.m2357s().m1910b(intent);
        String c = ako.m2357s().m1912c(intent);
        if (b == null || c == null) {
            return false;
        }
        if (!str.equals(ako.m2357s().m1907a(b))) {
            bky.m9011e("Developer payload not match.");
            return false;
        } else if (this.f1717a == null || ajs.m1917a(this.f1717a, b, c)) {
            return true;
        } else {
            bky.m9011e("Fail to verify signature.");
            return false;
        }
    }
}

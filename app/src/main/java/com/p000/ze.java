package com.p000;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: ze */
public class ze {
    /* renamed from: a */
    public static final ze f26079a = new ze("REGULAR");
    /* renamed from: b */
    public static final ze f26080b = new ze("VIDEOA");
    /* renamed from: c */
    private final String f26081c;

    public ze(String str) {
        this.f26081c = str;
    }

    /* renamed from: a */
    public static ze m34952a(String str) {
        return str.toUpperCase(Locale.ENGLISH).equals(f26080b.m34954a()) ? f26080b : f26079a;
    }

    /* renamed from: b */
    public static Set m34953b() {
        Set hashSet = new HashSet(2);
        hashSet.add(f26079a);
        hashSet.add(f26080b);
        return hashSet;
    }

    /* renamed from: a */
    public String m34954a() {
        return this.f26081c.toUpperCase(Locale.ENGLISH);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ze zeVar = (ze) obj;
        if (this.f26081c != null) {
            if (this.f26081c.equals(zeVar.f26081c)) {
                return true;
            }
        } else if (zeVar.f26081c == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f26081c != null ? this.f26081c.hashCode() : 0;
    }

    public String toString() {
        return m34954a();
    }
}

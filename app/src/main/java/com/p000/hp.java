package com.p000;

/* compiled from: Pair */
/* renamed from: hp */
public class hp<F, S> {
    /* renamed from: a */
    public final F f23818a;
    /* renamed from: b */
    public final S f23819b;

    public hp(F f, S s) {
        this.f23818a = f;
        this.f23819b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        if (hp.m30601a(hpVar.f23818a, this.f23818a) && hp.m30601a(hpVar.f23819b, this.f23819b)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m30601a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f23818a == null ? 0 : this.f23818a.hashCode();
        if (this.f23819b != null) {
            i = this.f23819b.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f23818a) + " " + String.valueOf(this.f23819b) + "}";
    }
}

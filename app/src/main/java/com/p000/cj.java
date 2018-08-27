package com.p000;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues */
/* renamed from: cj */
public class cj {
    /* renamed from: a */
    public final Map<String, Object> f9413a = new HashMap();
    /* renamed from: b */
    public View f9414b;

    public boolean equals(Object obj) {
        if ((obj instanceof cj) && this.f9414b == ((cj) obj).f9414b && this.f9413a.equals(((cj) obj).f9413a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f9414b.hashCode() * 31) + this.f9413a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f9414b + "\n") + "    values:";
        String str2 = str;
        for (String str3 : this.f9413a.keySet()) {
            str2 = str2 + "    " + str3 + ": " + this.f9413a.get(str3) + "\n";
        }
        return str2;
    }
}

package com.p000;

import com.google.android.gms.internal.zzec;
import java.util.Arrays;

@bhd
/* renamed from: bdw */
class bdw {
    /* renamed from: a */
    private final Object[] f5712a;

    bdw(zzec zzec, String str, int i) {
        this.f5712a = ajw.m2064a((String) bbb.aY.m7064c(), zzec, str, i, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bdw)) {
            return false;
        }
        return Arrays.equals(this.f5712a, ((bdw) obj).f5712a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f5712a);
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f5712a));
        return new StringBuilder(String.valueOf(valueOf).length() + 24).append("[InterstitialAdPoolKey ").append(valueOf).append("]").toString();
    }
}

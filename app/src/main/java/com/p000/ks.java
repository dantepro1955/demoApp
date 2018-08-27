package com.p000;

import android.os.Build.VERSION;

/* compiled from: AccessibilityRecordCompat */
/* renamed from: ks */
public class ks {
    /* renamed from: a */
    private static final ks$c f16877a;
    /* renamed from: b */
    private final Object f16878b;

    static {
        if (VERSION.SDK_INT >= 16) {
            f16877a = new ks$d();
        } else if (VERSION.SDK_INT >= 15) {
            f16877a = new ks$b();
        } else if (VERSION.SDK_INT >= 14) {
            f16877a = new ks$a();
        } else {
            f16877a = new ks$e();
        }
    }

    @Deprecated
    public ks(Object obj) {
        this.f16878b = obj;
    }

    /* renamed from: a */
    public void m21274a(boolean z) {
        f16877a.a(this.f16878b, z);
    }

    /* renamed from: a */
    public void m21273a(int i) {
        f16877a.b(this.f16878b, i);
    }

    /* renamed from: b */
    public void m21275b(int i) {
        f16877a.a(this.f16878b, i);
    }

    /* renamed from: c */
    public void m21276c(int i) {
        f16877a.e(this.f16878b, i);
    }

    /* renamed from: d */
    public void m21277d(int i) {
        f16877a.c(this.f16878b, i);
    }

    /* renamed from: e */
    public void m21278e(int i) {
        f16877a.d(this.f16878b, i);
    }

    /* renamed from: f */
    public void m21279f(int i) {
        f16877a.f(this.f16878b, i);
    }

    /* renamed from: g */
    public void m21280g(int i) {
        f16877a.g(this.f16878b, i);
    }

    public int hashCode() {
        return this.f16878b == null ? 0 : this.f16878b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ks ksVar = (ks) obj;
        if (this.f16878b == null) {
            if (ksVar.f16878b != null) {
                return false;
            }
            return true;
        } else if (this.f16878b.equals(ksVar.f16878b)) {
            return true;
        } else {
            return false;
        }
    }
}

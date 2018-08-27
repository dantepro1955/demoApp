package com.p000;

import android.os.Build.VERSION;

/* compiled from: WindowInsetsCompat */
/* renamed from: kb */
public class kb {
    /* renamed from: a */
    private static final kb$d f16875a;
    /* renamed from: b */
    private final Object f16876b;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f16875a = new kb$b();
        } else if (i >= 20) {
            f16875a = new kb$a();
        } else {
            f16875a = new kb$c();
        }
    }

    kb(Object obj) {
        this.f16876b = obj;
    }

    /* renamed from: a */
    public int m21265a() {
        return f16875a.c(this.f16876b);
    }

    /* renamed from: b */
    public int m21267b() {
        return f16875a.e(this.f16876b);
    }

    /* renamed from: c */
    public int m21268c() {
        return f16875a.d(this.f16876b);
    }

    /* renamed from: d */
    public int m21269d() {
        return f16875a.b(this.f16876b);
    }

    /* renamed from: e */
    public boolean m21270e() {
        return f16875a.f(this.f16876b);
    }

    /* renamed from: f */
    public boolean m21271f() {
        return f16875a.g(this.f16876b);
    }

    /* renamed from: g */
    public kb m21272g() {
        return f16875a.a(this.f16876b);
    }

    /* renamed from: a */
    public kb m21266a(int i, int i2, int i3, int i4) {
        return f16875a.a(this.f16876b, i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kb kbVar = (kb) obj;
        if (this.f16876b != null) {
            return this.f16876b.equals(kbVar.f16876b);
        }
        if (kbVar.f16876b != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f16876b == null ? 0 : this.f16876b.hashCode();
    }

    /* renamed from: a */
    static kb m21264a(Object obj) {
        return obj == null ? null : new kb(obj);
    }

    /* renamed from: a */
    static Object m21263a(kb kbVar) {
        return kbVar == null ? null : kbVar.f16876b;
    }
}

package com.p000;

import java.util.Hashtable;

/* renamed from: sx */
public final class sx implements ss {
    /* renamed from: a */
    private final sy f25535a;
    /* renamed from: b */
    private final Hashtable f25536b = new Hashtable();
    /* renamed from: c */
    private boolean f25537c = false;

    /* renamed from: sx$a */
    public interface C5762a {
        /* renamed from: a */
        void mo5512a(String str);
    }

    /* renamed from: sx$b */
    public interface C5770b {
        C5770b() {
        }
    }

    private sx(sy syVar, C5762a c5762a) {
        this.f25535a = syVar;
        this.f25535a.f25521c.m34135a(syVar, c5762a);
    }

    /* renamed from: a */
    static sx m34158a(String str, String str2, String str3, int i, st stVar, String str4) {
        if (str4 != null) {
            return new sx(new sw(str, str2, str3, i, stVar, str4), null);
        }
        throw new IllegalArgumentException("eventName is null.");
    }

    /* renamed from: a */
    static sx m34159a(sv svVar, String str) {
        if (str != null) {
            return new sx(new sw(svVar, str), null);
        }
        throw new IllegalArgumentException("eventName is null.");
    }

    /* renamed from: a */
    static sx m34160a(sy syVar, String str) {
        if (str != null) {
            return new sx(new su(syVar, str), null);
        }
        throw new IllegalArgumentException("eventName is null.");
    }

    /* renamed from: a */
    public static sx m34161a(sy syVar, String str, C5762a c5762a) {
        if (str != null) {
            return new sx(new sv(syVar, str), c5762a);
        }
        throw new IllegalArgumentException("eventName is null.");
    }

    /* renamed from: a */
    public final sq mo5521a() {
        return m34163a(null);
    }

    /* renamed from: a */
    public final sq m34163a(C5770b c5770b) {
        if (!this.f25537c) {
            this.f25535a.m34145a(this.f25536b, c5770b);
            this.f25537c = true;
        }
        return this.f25535a;
    }

    /* renamed from: a */
    public final ss mo5522a(String str, int i) throws sr {
        if (this.f25537c) {
            throw new sr("SessionEvent is alreadt committed.");
        }
        this.f25536b.put(str, new Integer(i));
        return this;
    }

    /* renamed from: a */
    public final ss mo5523a(String str, String str2) throws sr {
        if (this.f25537c) {
            throw new sr("SessionEvent is alreadt committed.");
        }
        this.f25536b.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public final ss mo5524a(String str, boolean z) throws sr {
        if (this.f25537c) {
            throw new sr("SessionEvent is alreadt committed.");
        }
        this.f25536b.put(str, new Boolean(z));
        return this;
    }

    /* renamed from: b */
    public final sq m34167b() {
        if (this.f25535a instanceof sv) {
            ((sv) this.f25535a).f25526a = Boolean.valueOf(true);
        }
        if (!this.f25537c) {
            this.f25535a.m34145a(this.f25536b, null);
            this.f25537c = true;
        }
        return this.f25535a;
    }
}

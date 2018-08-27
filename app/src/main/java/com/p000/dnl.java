package com.p000;

/* renamed from: dnl */
public abstract class dnl {
    /* renamed from: b */
    private static final rk f22302b = dnn.m28258a(dnl.class);
    /* renamed from: a */
    protected String f22303a;
    /* renamed from: c */
    private String f22304c;
    /* renamed from: d */
    private short f22305d;
    /* renamed from: e */
    private rl f22306e;
    /* renamed from: f */
    private rg f22307f;
    /* renamed from: g */
    private rg f22308g;

    protected dnl(String str, short s, String str2, rg rgVar, rg rgVar2) {
        if (f22302b.mo4276b()) {
            f22302b.mo4275b("in NMSPManager() gateway IP [" + str + "] Port [" + s + "]");
        }
        String str3 = null;
        if (str == null) {
            str3 = " gatewayIP is null";
        } else if (str.length() == 0) {
            str3 = " gatewayIP is empty";
        }
        if (s <= (short) 0) {
            str3 = " gatewayPort should be greater than 0";
        }
        if (str3 != null) {
            f22302b.mo4281e("NMSPManager " + IllegalArgumentException.class.getName() + str3);
            throw new IllegalArgumentException(str3);
        }
        this.f22304c = str;
        this.f22305d = s;
        this.f22303a = str2;
        this.f22307f = rgVar;
        this.f22308g = rgVar2;
        this.f22306e = new dab();
    }

    /* renamed from: g */
    public static String m28238g() throws RuntimeException {
        throw new RuntimeException("Unsupported");
    }

    /* renamed from: a */
    public final void m28239a(rg rgVar) {
        this.f22307f = rgVar;
    }

    /* renamed from: b */
    public final String m28240b() {
        return this.f22304c;
    }

    /* renamed from: b */
    public final void m28241b(rg rgVar) {
        this.f22308g = rgVar;
    }

    /* renamed from: c */
    public final short m28242c() {
        return this.f22305d;
    }

    /* renamed from: d */
    public final String m28243d() {
        return this.f22303a;
    }

    /* renamed from: e */
    public final rg m28244e() {
        return this.f22307f;
    }

    /* renamed from: f */
    public final rg m28245f() {
        return this.f22308g;
    }

    public final rl z_() {
        return this.f22306e;
    }
}

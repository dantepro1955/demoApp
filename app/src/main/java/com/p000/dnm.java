package com.p000;

import com.facebook.internal.ServerProtocol;

/* renamed from: dnm */
public final class dnm {
    /* renamed from: a */
    private String f22320a;
    /* renamed from: b */
    private Object f22321b;
    /* renamed from: c */
    private C5007a f22322c;

    /* renamed from: dnm$a */
    public static class C5007a extends sh {
        /* renamed from: a */
        public static final C5007a f22310a = new C5007a((short) 0);
        /* renamed from: b */
        public static final C5007a f22311b = new C5007a((short) 1);
        /* renamed from: c */
        public static final C5007a f22312c = new C5007a((short) 2);
        /* renamed from: d */
        public static final C5007a f22313d = new C5007a((short) 3);
        /* renamed from: e */
        public static final C5007a f22314e = new C5007a((short) 4);
        /* renamed from: f */
        public static final C5007a f22315f = new C5007a((short) 5);
        /* renamed from: g */
        public static final C5007a f22316g = new C5007a((short) 6);
        /* renamed from: h */
        public static final C5007a f22317h = new C5007a((short) 7);
        /* renamed from: i */
        public static final C5007a f22318i = new C5007a((short) 8);
        /* renamed from: j */
        public static final C5007a f22319j = new C5007a((short) 9);

        private C5007a(short s) {
            super(s);
        }

        public final String toString() {
            return m28247a(f22311b) ? "nmsp" : m28247a(f22312c) ? "app" : m28247a(f22313d) ? "nss" : m28247a(f22314e) ? "slog" : m28247a(f22315f) ? "nsslog" : m28247a(f22316g) ? "gwlog" : m28247a(f22317h) ? "svsp" : m28247a(f22318i) ? "sip" : m28247a(f22319j) ? "sdp" : m28247a(f22310a) ? ServerProtocol.DIALOG_PARAM_SDK_VERSION : null;
        }
    }

    public dnm(String str, C5007a c5007a) {
        this.f22320a = str;
        this.f22321b = new byte[0];
        this.f22322c = c5007a;
    }

    public dnm(String str, Object obj, C5007a c5007a) {
        this.f22320a = str;
        this.f22321b = obj;
        this.f22322c = c5007a;
    }

    /* renamed from: a */
    public final String m28248a() {
        return this.f22320a;
    }

    /* renamed from: b */
    public final byte[] m28249b() {
        return this.f22321b instanceof byte[] ? (byte[]) this.f22321b : "THIS IS NOT A STRING PARAMETER!!!".getBytes();
    }

    /* renamed from: c */
    public final Object m28250c() {
        return this.f22321b;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m28252e();
    }

    /* renamed from: d */
    public final C5007a m28251d() {
        return this.f22322c;
    }

    /* renamed from: e */
    public final dnm m28252e() {
        Object obj = this.f22321b;
        if (this.f22321b instanceof byte[]) {
            byte[] bArr = (byte[]) this.f22321b;
            Object obj2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, obj2, 0, bArr.length);
            obj = obj2;
        }
        return new dnm(this.f22320a, obj, this.f22322c);
    }
}

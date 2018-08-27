package com.p000;

/* renamed from: dpm */
public class dpm extends dph implements dpy {
    /* renamed from: a */
    private static final rk f22527a = dnn.m28258a(dpm.class);

    public dpm(byte[] bArr) {
        super((short) 29186, bArr);
    }

    /* renamed from: g */
    public final int mo4539g() {
        f22527a.mo4275b((Object) "PDXQueryError.getError()");
        return mo4460c("error");
    }

    /* renamed from: h */
    public final String mo4540h() {
        f22527a.mo4275b((Object) "PDXQueryError.getDescription()");
        String e = mo4462e("description");
        return e != null ? e : "";
    }
}

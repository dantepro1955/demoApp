package com.p000;

/* renamed from: dpp */
public class dpp extends dph implements dpz {
    /* renamed from: a */
    private static final rk f22530a = dnn.m28258a(dpp.class);

    public dpp(byte[] bArr) {
        super((short) 29189, bArr);
    }

    /* renamed from: g */
    public final String mo4541g() {
        f22530a.mo4275b((Object) "PDXQueryRetry.getName()");
        String e = mo4462e("name");
        return e != null ? e : "";
    }

    /* renamed from: h */
    public final int mo4542h() {
        f22530a.mo4275b((Object) "PDXQueryRetry.getCause()");
        try {
            return mo4460c("cause");
        } catch (Exception e) {
            return 0;
        }
    }

    /* renamed from: i */
    public final String mo4543i() {
        String e;
        f22530a.mo4275b((Object) "PDXQueryRetry.getPrompt()");
        try {
            e = mo4462e("prompt");
        } catch (Exception e2) {
            e = "";
        }
        return e != null ? e : "";
    }
}

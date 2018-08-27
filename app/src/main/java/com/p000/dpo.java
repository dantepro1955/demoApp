package com.p000;

/* renamed from: dpo */
public class dpo extends dph implements dni {
    /* renamed from: a */
    private static final rk f22529a = dnn.m28258a(dpo.class);

    public dpo(byte[] bArr) {
        super((short) 29185, bArr);
    }

    /* renamed from: g */
    public final boolean m28633g() {
        try {
            if (mo4457a("final_response")) {
                return mo4460c("final_response") != 0;
            } else {
                if (!f22529a.mo4278c()) {
                    return true;
                }
                f22529a.mo4277c((Object) "final_response does not exist. ");
                return true;
            }
        } catch (Exception e) {
            return true;
        }
    }
}

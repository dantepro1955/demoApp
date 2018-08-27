package com.p000;

import java.util.Vector;
import p000.dnm.C5007a;

/* renamed from: dou */
public class dou {
    /* renamed from: a */
    private static final rk f22462a = dnn.m28258a(dou.class);

    private dou() {
    }

    /* renamed from: a */
    public static dot m28504a(String str, short s, String str2, byte[] bArr, String str3, rg rgVar, rg rgVar2, String str4, Vector vector, dov dov) {
        if (f22462a.mo4276b()) {
            f22462a.mo4275b((Object) "createManager");
        }
        if (str == null || str.length() == 0) {
            f22462a.mo4281e("NullPointerException gatewayIP is NULL. ");
            throw new NullPointerException("gatewayIP must be provided!");
        } else if (s <= (short) 0) {
            f22462a.mo4281e("IllegalArgumentException gatewayPort is invalid. ");
            throw new IllegalArgumentException("gatewayPort invalid value!");
        } else if (str2 == null) {
            f22462a.mo4281e("NullPointerException applicationId is NULL. ");
            throw new NullPointerException("Application id can not be null!");
        } else if (bArr == null) {
            f22462a.mo4281e("NullPointerException appKey is NULL. ");
            throw new NullPointerException("Application key can not be null!");
        } else if (str3 == null) {
            f22462a.mo4281e("NullPointerException uid is NULL. ");
            throw new NullPointerException("uid can not be null!");
        } else if (rgVar == null) {
            f22462a.mo4281e("NullPointerException inputCodec is NULL. ");
            throw new NullPointerException("inputCodec can not be null!");
        } else if (rgVar2 == null) {
            f22462a.mo4281e("NullPointerException outputCodec is NULL. ");
            throw new NullPointerException("outputCodec can not be null!");
        } else if (dov == null) {
            f22462a.mo4281e("NullPointerException managerListener is NULL. ");
            throw new NullPointerException("managerListener can not be null!");
        } else {
            if (vector != null) {
                for (int i = 0; i < vector.size(); i++) {
                    dnm dnm = (dnm) vector.elementAt(i);
                    if (dnm.m28251d() == C5007a.f22314e || dnm.m28251d() == C5007a.f22315f || dnm.m28251d() == C5007a.f22316g || dnm.m28251d() == C5007a.f22317h || dnm.m28251d() == C5007a.f22313d || dnm.m28251d() == C5007a.f22318i || dnm.m28251d() == C5007a.f22319j) {
                        f22462a.mo4281e("IllegalArgumentException Parameter type: " + dnm.m28251d() + " not allowed. ");
                        throw new IllegalArgumentException("Parameter type: " + dnm.m28251d() + " not allowed. ");
                    }
                }
            }
            return new doz(str, s, str2, bArr, str3, rgVar, rgVar2, str4, vector, dov);
        }
    }
}

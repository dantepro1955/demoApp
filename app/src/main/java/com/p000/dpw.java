package com.p000;

import java.util.Vector;
import p000.dnm.C5007a;

/* renamed from: dpw */
public class dpw {
    /* renamed from: a */
    private static final rk f22559a = dnn.m28258a(dpw.class);

    private dpw() {
    }

    /* renamed from: a */
    public static dpv m28681a(dot dot, doy doy, Vector vector) {
        if (f22559a.mo4276b()) {
            f22559a.mo4275b((Object) "createNMASResource");
        }
        if (dot == null) {
            f22559a.mo4281e("manager is null");
            throw new NullPointerException("manager can not be null!");
        } else if (doy == null) {
            f22559a.mo4281e("nmasListener is null");
            throw new NullPointerException("nmasListener can not be null!");
        } else {
            if (vector != null) {
                for (int i = 0; i < vector.size(); i++) {
                    dnm dnm = (dnm) vector.elementAt(i);
                    if (dnm.m28251d() == C5007a.f22312c || dnm.m28251d() == C5007a.f22313d || dnm.m28251d() == C5007a.f22314e || dnm.m28251d() == C5007a.f22315f || dnm.m28251d() == C5007a.f22316g || dnm.m28251d() == C5007a.f22317h || dnm.m28251d() == C5007a.f22318i || dnm.m28251d() == C5007a.f22319j) {
                        f22559a.mo4281e("IllegalArgumentException Parameter type: " + dnm.m28251d() + " not allowed. ");
                        throw new IllegalArgumentException("Parameter type: " + dnm.m28251d() + " not allowed. ");
                    }
                }
            }
            return new dpd((doz) dot, doy, vector);
        }
    }
}
